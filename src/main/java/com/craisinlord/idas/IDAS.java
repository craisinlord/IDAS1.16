package com.craisinlord.idas;

import com.craisinlord.idas.biomeinjection.*;
import com.craisinlord.idas.configs.IDASConfig;
import com.craisinlord.idas.item.IDASItems;
import com.craisinlord.idas.misc.*;
import com.craisinlord.idas.mixin.world.ChunkGeneratorAccessor;
import com.craisinlord.idas.modinit.*;
import com.craisinlord.idas.utils.BiomeSelection;
import com.craisinlord.idas.utils.GeneralUtils;
import com.craisinlord.idas.utils.LogSpamFiltering;
import com.craisinlord.idas.utils.SoundEvents;
import com.craisinlord.idas.world.structures.pieces.StructurePiecesBehavior;
import com.google.common.collect.ImmutableMap;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.World;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.FlatChunkGenerator;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.settings.StructureSeparationSettings;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.fml.loading.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;


@Mod(IDAS.MODID)
public class IDAS {
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "idas";

    public static boolean isIceFireOn = false;
    public static boolean isCharmOn = false;

    public IDAS() {

        // Setup configs
        FileUtils.getOrCreateDirectory(FMLPaths.CONFIGDIR.get().resolve("idas"), "idas");

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, IDASConfig.GENERAL_SPEC, "idas/idas.toml");

        // Register the setup method for modloading
        IEventBus forgeBus = MinecraftForge.EVENT_BUS;
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        forgeBus.addListener(this::biomeModification);
        forgeBus.addListener(EventPriority.HIGHEST, this::deepCopyDimensionalSpacing);
        forgeBus.addListener(this::addDimensionalSpacing);
        forgeBus.addListener(PoolAdditionMerger::mergeAdditionPools);
        forgeBus.addListener(MobMapTrades::onVillagerTradesEvent);
        forgeBus.addListener(MobMapTrades::onWandererTradesEvent);

        modEventBus.addListener(this::setup);
        IDASStructures.STRUCTURE_FEATURES.register(modEventBus);
        IDASPlacements.DECORATORS.register(modEventBus);
        IDASItems.register(modEventBus);
        SoundEvents.register(modEventBus);

        //For mod compat by checking if other mod is on
        isIceFireOn = ModList.get().isLoaded("iceandfire");

        BiomeSourceChecks.hexlandsiiIsOn = ModList.get().isLoaded("hexlands");

        // Silences logspam due to me changing my piece's namespace from minecraft to my modid.
        Logger rootLogger = LogManager.getRootLogger();
        if (rootLogger instanceof org.apache.logging.log4j.core.Logger) {
            ((org.apache.logging.log4j.core.Logger) rootLogger).addFilter(new LogSpamFiltering());
        }
        else {
            LOGGER.error("Registration failed with unexpected class: {}", rootLogger.getClass());
        }
        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

    }

    public void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            //Moved the methods below into enqueue to make sure they dont cause issues during registration
            StructurePiecesBehavior.init();
            IDASProcessors.registerProcessors();
            IDASPredicates.registerPredicates();
            IDASNumberProviders.registerNumberProviders();
            IDASStructures.setupStructures();
            IDASConfiguredStructures.registerStructureFeatures();
            IDASStructureTagMap.setupTags();
            BiomeSelection.setupOverworldBiomesSet();
            BiomeDimensionAllowDisallow.setupAllowDisallowMaps();

            // Workaround for Terraforged
            WorldGenRegistries.NOISE_GENERATOR_SETTINGS.entrySet().forEach(settings -> {
                Map<Structure<?>, StructureSeparationSettings> structureMap = settings.getValue().structureSettings().structureConfig();
                if (structureMap instanceof ImmutableMap) {
                    Map<Structure<?>, StructureSeparationSettings> tempMap = new HashMap<>(structureMap);
                    tempMap.putAll(IDASStructures.IDAS_STRUCTURES);
                    settings.getValue().structureSettings().structureConfig = tempMap;
                }
                else {
                    structureMap.putAll(IDASStructures.IDAS_STRUCTURES);
                }
            });
        });
    }

    public void biomeModification(final BiomeLoadingEvent event) {
        //Add our structures and features
        IDAS.addFeaturesAndStructuresToBiomes(event);
    }

    /**
     * This is a high priority worldevent.load instead of a mixin because the mixin form is too early
     * and could break a potential future Forge PR that is currently being worked on.
     */
    public void deepCopyDimensionalSpacing(final WorldEvent.Load event) {
        if (event.getWorld() instanceof ServerWorld) {
            ServerWorld serverWorld = (ServerWorld) event.getWorld();

            // Workaround for Terraforged
            ResourceLocation cgRL = Registry.CHUNK_GENERATOR.getKey(((ChunkGeneratorAccessor) serverWorld.getChunkSource().generator).idas_getCodec());
            if (cgRL != null && cgRL.getNamespace().equals("terraforged")) return;

            ChunkGenerator chunkGenerator = serverWorld.getChunkSource().generator;
            ((ChunkGeneratorAccessor) chunkGenerator).idas_setSettings(NoiseSettingsDeepCopier.deepCopyDimensionStructuresSettings(chunkGenerator.getSettings()));
        }
    }

    public void addDimensionalSpacing(final WorldEvent.Load event) {
        //add our structure spacing to all chunkgenerators including modded one and datapack ones.
        if (event.getWorld() instanceof ServerWorld) {
            ServerWorld serverWorld = (ServerWorld) event.getWorld();

            // Workaround for Terraforged
            ResourceLocation cgRL = Registry.CHUNK_GENERATOR.getKey(((ChunkGeneratorAccessor) serverWorld.getChunkSource().generator).idas_getCodec());
            if (cgRL != null && cgRL.getNamespace().equals("terraforged")) return;

            //add our structure spacing to all chunkgenerators including modded one and datapack ones.
            // Need temp map as some mods use custom chunk generators with immutable maps in themselves.
            Map<Structure<?>, StructureSeparationSettings> tempMap = new HashMap<>(serverWorld.getChunkSource().getGenerator().getSettings().structureConfig());

            // make absolutely sure superflat dimension cannot spawn RS structures
            if (serverWorld.getChunkSource().getGenerator() instanceof FlatChunkGenerator && serverWorld.dimension().equals(World.OVERWORLD)) {
                tempMap.keySet().removeAll(IDASStructures.IDAS_STRUCTURES.keySet());
            }
            // Not superflat overworld. Do normal behavior now
            else{
                for(Map.Entry<Structure<?>, StructureSeparationSettings> structureFeatureEntry : IDASStructures.IDAS_STRUCTURES.entrySet()){
                    boolean isWorldBlacklisted = GeneralUtils.isBlacklistedForWorld(serverWorld, Registry.STRUCTURE_FEATURE.getKey(structureFeatureEntry.getKey()));
                    if (isWorldBlacklisted){
                        // make absolutely sure dimension cannot spawn the RS structure
                        tempMap.remove(structureFeatureEntry.getKey());
                    }
                    else {
                        // make absolutely sure dimension can spawn the RS structure
                        tempMap.putIfAbsent(structureFeatureEntry.getKey(), structureFeatureEntry.getValue());
                    }
                }
            }
            serverWorld.getChunkSource().generator.getSettings().structureConfig = tempMap;
        }
    }

    /*
     * Here, we will use this to add our structures/features to all biomes.
     */
    public static void addFeaturesAndStructuresToBiomes(BiomeLoadingEvent event) {
        PillagerFortress.addPillagerFortress(event);
        AbandonedHouse.addAbandonedHouse(event);
        BrickHouse.addBrickHouse(event);
        Castle.addCastle(event);
        Labyrinth.addLabyrinth(event);
        WizardTowers.addWizardTowers(event);
        EnchantingTowers.addEnchantingTowers(event);
        AncientMines.addAncientMines(event);
        TinkersWorkshop.addTinkersWorkshop(event);
        SunkenShip.addSunkenShip(event);
        AncientStatue.addAncientStatue(event);
        DesertMarket.addDesertMarket(event);
        DesertCamp.addDesertCamp(event);
        PillagerCamp.addPillagerCamp(event);
        WashingCamp.addWashingCamp(event);
        //UndergroundCamp.addUndergroundCamp(event);
        AnimalDen.addAnimalDen(event);
        LumberCamp.addLumberCamp(event);
        Bazaar.addBazaar(event);
        HuntersCabin.addHuntersCabin(event);
        BearclawInn.addBearclawInn(event);
        RedhornGuild.addRedhornGuild(event);
        Farmhouse.addFarmhouse(event);
        WitchesTreestump.addWitchesTreestump(event);
        HermitsHollow.addHermitsHollow(event);
        ApothecaryAbode.addApothecaryAbode(event);
        TreetopTavern.addTreetopTavern(event);
        BeekeepersHouse.addBeekeepersHouse(event);
    }
}
