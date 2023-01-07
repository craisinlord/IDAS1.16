package com.craisinlord.idas.modinit;

import com.craisinlord.idas.IDAS;
import com.craisinlord.idas.configs.*;
import com.craisinlord.idas.world.structures.JigsawStructure;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.gen.FlatGenerationSettings;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.feature.structure.Structure;
import net.minecraft.world.gen.settings.DimensionStructuresSettings;
import net.minecraft.world.gen.settings.StructureSeparationSettings;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public final class IDASStructures {
    private IDASStructures() {}

    public static final DeferredRegister<Structure<?>> STRUCTURE_FEATURES = DeferredRegister.create(ForgeRegistries.STRUCTURE_FEATURES, IDAS.MODID);
    public static final Map<Structure<?>, StructureSeparationSettings> IDAS_STRUCTURES = new HashMap<>();
    public static final Set<ResourceLocation> IDAS_STRUCTURE_START_PIECES = new HashSet<>();

    public static final RegistryObject<Structure<NoFeatureConfig>> WIZARDTOWER = addToStructureMaps("wizard_tower", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "wizard_tower/wizardtower")).setStructureSize(2).cannotSpawnInWater().setTerrainHeightRadius(2).setAllowTerrainHeightRange(15).setStructureBlacklistRange(2).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> ENCHANTINGTOWER = addToStructureMaps("enchantingtower", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "enchantingtower")).setStructureSize(1).cannotSpawnInWater().setStructureBlacklistRange(1).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> ABANDONEDHOUSE = addToStructureMaps("abandoned_house", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "abandonedhouse")).setStructureSize(1).cannotSpawnInWater().setTerrainHeightRadius(1).setAllowTerrainHeightRange(15).setStructureBlacklistRange(2).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> BRICKHOUSE = addToStructureMaps("brick_house", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "brickhouse/brickhouse")).setStructureSize(3).cannotSpawnInWater().setStructureBlacklistRange(2).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> CASTLE = addToStructureMaps("castle", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "castle/castle1")).setStructureSize(5).cannotSpawnInWater().setTerrainHeightRadius(2).setAllowTerrainHeightRange(15).setStructureBlacklistRange(2).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));

    public static final RegistryObject<Structure<NoFeatureConfig>> LABYRINTH = addToStructureMaps("labyrinth", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "labyrinth/labyrinth_entrance")).setStructureSize(6).setTerrainHeightRadius(1).setAllowTerrainHeightRange(15).setStructureBlacklistRange(1).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> PILLAGER_FORTRESS = addToStructureMaps("pillager_fortress", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "pillager_fortress/pillager_fortress1")).setStructureSize(7).cannotSpawnInWater().setStructureBlacklistRange(2).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> ANCIENT_MINES = addToStructureMaps("ancient_mines", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "ancient_mines/ancient_mines_entrance")).setStructureSize(20).setMinHeightLimit(70).setTerrainHeightRadius(2).setAllowTerrainHeightRange(15).setStructureBlacklistRange(1).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> TINKERS_WORKSHOP = addToStructureMaps("tinkers_workshop", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "tinkers_workshop/tinkers_workshop_entrance")).setStructureSize(7).setMinHeightLimit(70).setTerrainHeightRadius(2).setAllowTerrainHeightRange(15).setStructureBlacklistRange(1).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));

    public static final RegistryObject<Structure<NoFeatureConfig>> SUNKEN_SHIP = addToStructureMaps("sunken_ship", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "sunken_ship/sunken_ship")).setStructureSize(1).setFixedYSpawn(-30).setStructureBlacklistRange(1).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> SUNKEN_SHIP_CORAL = addToStructureMaps("sunken_ship_coral", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "sunken_ship/sunken_ship_coral")).setStructureSize(1).setFixedYSpawn(-30).setStructureBlacklistRange(1).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));

    public static final RegistryObject<Structure<NoFeatureConfig>> ANCIENT_STATUE_JUNGLE = addToStructureMaps("ancient_statue_jungle", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "ancient_statue/ancient_statue_jungle")).setStructureSize(1).cannotSpawnInWater().setStructureBlacklistRange(1).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> ANCIENT_STATUE_PLAINS = addToStructureMaps("ancient_statue_plains", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "ancient_statue/ancient_statue_plains")).setStructureSize(1).cannotSpawnInWater().setTerrainHeightRadius(1).setAllowTerrainHeightRange(15).setStructureBlacklistRange(1).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> ANCIENT_STATUE_DESERT = addToStructureMaps("ancient_statue_desert", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "ancient_statue/ancient_statue_desert")).setStructureSize(1).cannotSpawnInWater().setTerrainHeightRadius(1).setAllowTerrainHeightRange(15).setStructureBlacklistRange(1).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> DESERT_MARKET = addToStructureMaps("desert_market", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "desert_market/desert_market")).setStructureSize(1).cannotSpawnInWater().setStructureBlacklistRange(1).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> DESERT_MARKET_RED = addToStructureMaps("desert_market_red", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "desert_market/desert_market_red")).setStructureSize(1).cannotSpawnInWater().setStructureBlacklistRange(1).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> DESERT_MARKET_ORANGE = addToStructureMaps("desert_market_orange", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "desert_market/desert_market_orange")).setStructureSize(1).cannotSpawnInWater().setStructureBlacklistRange(1).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> DESERT_CAMP = addToStructureMaps("desert_camp", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "desert_camp/desert_camp")).setStructureSize(1).cannotSpawnInWater().setStructureBlacklistRange(1).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> DESERT_CAMP_RED = addToStructureMaps("desert_camp_red", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "desert_camp/desert_camp_red")).setStructureSize(1).cannotSpawnInWater().setStructureBlacklistRange(1).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> DESERT_CAMP_ORANGE = addToStructureMaps("desert_camp_orange", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "desert_camp/desert_camp_orange")).setStructureSize(1).cannotSpawnInWater().setStructureBlacklistRange(1).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> PILLAGER_CAMP = addToStructureMaps("pillager_camp", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "pillager_camp/pillager_camp")).setStructureSize(1).cannotSpawnInWater().setStructureBlacklistRange(1).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> WASHING_CAMP = addToStructureMaps("washing_camp", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "washing_camp/washing_camp")).setStructureSize(1).cannotSpawnInWater().setStructureBlacklistRange(1).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    //public static final RegistryObject<Structure<NoFeatureConfig>> UNDERGROUND_CAMP = addToStructureMaps("underground_camp", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "underground_camp/underground_camp")).setStructureSize(1).cannotSpawnInWater().setStructureBlacklistRange(1).setFixedYSpawn(-20).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    //public static final RegistryObject<Structure<NoFeatureConfig>> UNDERGROUND_CAMP_DEEP = addToStructureMaps("underground_camp_deep", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "underground_camp/underground_camp_deep")).setStructureSize(1).cannotSpawnInWater().setStructureBlacklistRange(1).setFixedYSpawn(-45).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));

    public static final RegistryObject<Structure<NoFeatureConfig>> POLAR_BEAR_DEN = addToStructureMaps("polar_bear_den", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "animal_den/polar_bear_den")).setStructureSize(1).cannotSpawnInWater().setTerrainHeightRadius(1).setAllowTerrainHeightRange(15).setStructureBlacklistRange(1).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> FOREST_DEN = addToStructureMaps("forest_den", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "animal_den/forest_den")).setStructureSize(1).cannotSpawnInWater().setTerrainHeightRadius(1).setAllowTerrainHeightRange(15).setStructureBlacklistRange(1).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));

    public static final RegistryObject<Structure<NoFeatureConfig>> LUMBER_CAMP_OAK = addToStructureMaps("lumber_camp_oak", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "lumber_camp/lumber_camp_oak")).setStructureSize(1).cannotSpawnInWater().setStructureBlacklistRange(1).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> LUMBER_CAMP_BIRCH = addToStructureMaps("lumber_camp_birch", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "lumber_camp/lumber_camp_birch")).setStructureSize(1).cannotSpawnInWater().setStructureBlacklistRange(1).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> LUMBER_CAMP_SPRUCE = addToStructureMaps("lumber_camp_spruce", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "lumber_camp/lumber_camp_spruce")).setStructureSize(1).cannotSpawnInWater().setStructureBlacklistRange(1).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> LUMBER_CAMP_DARK_OAK = addToStructureMaps("lumber_camp_dark_oak", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "lumber_camp/lumber_camp_dark_oak")).setStructureSize(1).cannotSpawnInWater().setStructureBlacklistRange(1).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> LUMBER_CAMP_ACACIA = addToStructureMaps("lumber_camp_acacia", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "lumber_camp/lumber_camp_acacia")).setStructureSize(1).cannotSpawnInWater().setStructureBlacklistRange(1).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> LUMBER_CAMP_JUNGLE = addToStructureMaps("lumber_camp_jungle", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "lumber_camp/lumber_camp_jungle")).setStructureSize(1).cannotSpawnInWater().setStructureBlacklistRange(1).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> LUMBER_CAMP_BOPREDWOOD = addToStructureMaps("lumber_camp_bopredwood", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "lumber_camp/lumber_camp_bopredwood")).setStructureSize(1).cannotSpawnInWater().setStructureBlacklistRange(1).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> LUMBER_CAMP_BYGREDWOOD = addToStructureMaps("lumber_camp_bygredwood", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "lumber_camp/lumber_camp_bygredwood")).setStructureSize(1).cannotSpawnInWater().setStructureBlacklistRange(1).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> LUMBER_CAMP_BOPMAHOGANY = addToStructureMaps("lumber_camp_bopmahogany", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "lumber_camp/lumber_camp_bopmahogany")).setStructureSize(1).cannotSpawnInWater().setStructureBlacklistRange(1).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> LUMBER_CAMP_BYGMAHOGANY = addToStructureMaps("lumber_camp_bygmahogany", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "lumber_camp/lumber_camp_bygmahogany")).setStructureSize(1).cannotSpawnInWater().setStructureBlacklistRange(1).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));

    public static final RegistryObject<Structure<NoFeatureConfig>> BAZAAR = addToStructureMaps("bazaar", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "bazaar/bazaar5")).setStructureSize(9).setTerrainHeightRadius(2).setAllowTerrainHeightRange(15).setStructureBlacklistRange(1).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> BEARCLAW_INN = addToStructureMaps("bearclaw_inn", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "bearclaw_inn/bearclaw_inn_lodge")).setStructureSize(3).setTerrainHeightRadius(1).setAllowTerrainHeightRange(15).setStructureBlacklistRange(2).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> HUNTERS_CABIN = addToStructureMaps("hunters_cabin", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "hunters_cabin")).setStructureSize(1).setTerrainHeightRadius(1).setAllowTerrainHeightRange(15).setStructureBlacklistRange(2).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> FARMHOUSE = addToStructureMaps("farmhouse", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "farmhouse/farmhouse")).setStructureSize(1).setTerrainHeightRadius(2).setAllowTerrainHeightRange(15).setStructureBlacklistRange(2).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> HERMITS_HOLLOW = addToStructureMaps("hermits_hollow", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "hermits_hollow/hermits_hollow")).setStructureSize(1).setTerrainHeightRadius(2).setAllowTerrainHeightRange(15).setStructureBlacklistRange(2).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> WITCHES_TREESTUMP = addToStructureMaps("witches_treestump", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "witches_treestump/witches_treestump")).setStructureSize(1).setTerrainHeightRadius(1).setAllowTerrainHeightRange(15).setStructureBlacklistRange(2).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> REDHORN_GUILD = addToStructureMaps("redhorn_guild", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "redhorn_guild/redhorn_guild")).setStructureSize(1).setTerrainHeightRadius(1).setAllowTerrainHeightRange(15).setStructureBlacklistRange(2).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> APOTHECARY_ABODE = addToStructureMaps("apothecary_abode", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "apothecary_abode/apothecary_abode1")).setStructureSize(1).setTerrainHeightRadius(2).setAllowTerrainHeightRange(15).setStructureBlacklistRange(2).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> BEEKEEPERS_HOUSE = addToStructureMaps("beekeepers_house", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "beekeepers_house/beekeepers_house")).setStructureSize(3).setTerrainHeightRadius(2).setAllowTerrainHeightRange(15).setStructureBlacklistRange(1).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));
    public static final RegistryObject<Structure<NoFeatureConfig>> TREETOP_TAVERN = addToStructureMaps("treetop_tavern", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "treetop_tavern/treetop_tavern1")).setStructureSize(4).setTerrainHeightRadius(2).setAllowTerrainHeightRange(15).setStructureBlacklistRange(2).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));

    //Ice and Fire structures
    public static final RegistryObject<Structure<NoFeatureConfig>> LABYRINTH_IF = addToStructureMaps("labyrinth_iceandfire", () -> (new JigsawStructure.Builder<>(new ResourceLocation(IDAS.MODID, "labyrinth/labyrinth_entrance_if")).setStructureSize(6).setTerrainHeightRadius(1).setAllowTerrainHeightRange(15).setStructureBlacklistRange(1).setAvoidStructuresSet(Stream.of(IDASStructureTagMap.STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet())).build()));

    private static <T extends Structure<?>> RegistryObject<T> addToStructureMaps(String name, Supplier<T> structure) {
        return STRUCTURE_FEATURES.register(name, structure);
    }

    public static void setupStructures() {
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "enchantingtower"), ENCHANTINGTOWER.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.enchantingtowerAverageChunkDistance.get(), 0.5f, 991627));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "abandoned_house"), ABANDONEDHOUSE.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.abandonedhouseAverageChunkDistance.get(), 0.5f, 169480670));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "brick_house"), BRICKHOUSE.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.brickhouseAverageChunkDistance.get(), 0.5f, 169480970));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "pillager_fortress"), PILLAGER_FORTRESS.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.pillagerfortressAverageChunkDistance.get(), 0.5f, 88879968));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "castle"), CASTLE.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.castleAverageChunkDistance.get(), 0.5f, 192383411));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "wizard_tower"), WIZARDTOWER.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.wizardtowerAverageChunkDistance.get(), 0.5f, 653829));

        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "labyrinth"), LABYRINTH.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.labyrinthAverageChunkDistance.get(), 0.5f, 65471935));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "ancient_mines"), ANCIENT_MINES.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.ancientminesAverageChunkDistance.get(), 0.5f, 65471936));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "tinkers_workshop"), TINKERS_WORKSHOP.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.tinkersworkshopAverageChunkDistance.get(), 0.5f, 65471937));

        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "sunken_ship"), SUNKEN_SHIP.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.sunkenshipAverageChunkDistance.get(), 0.5f, 65471938));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "sunken_ship_coral"), SUNKEN_SHIP_CORAL.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.sunkenshipcoralAverageChunkDistance.get(), 0.5f, 65471939));

        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "ancient_statue_jungle"), ANCIENT_STATUE_JUNGLE.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.ancientstatuejungleAverageChunkDistance.get(), 0.5f, 65471940));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "ancient_statue_plains"), ANCIENT_STATUE_PLAINS.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.ancientstatueplainsAverageChunkDistance.get(), 0.5f, 65471941));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "ancient_statue_desert"), ANCIENT_STATUE_DESERT.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.ancientstatuedesertAverageChunkDistance.get(), 0.5f, 65471942));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "desert_market"), DESERT_MARKET.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.desertmarketAverageChunkDistance.get(), 0.5f, 65471943));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "desert_market_red"), DESERT_MARKET_RED.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.desertmarketredAverageChunkDistance.get(), 0.5f, 65471944));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "desert_market_orange"), DESERT_MARKET_ORANGE.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.desertmarketorangeAverageChunkDistance.get(), 0.5f, 65471945));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "desert_camp"), DESERT_CAMP.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.desertcampAverageChunkDistance.get(), 0.5f, 65471946));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "desert_camp_red"), DESERT_CAMP_RED.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.desertcampredAverageChunkDistance.get(), 0.5f, 65471947));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "desert_camp_orange"), DESERT_CAMP_ORANGE.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.desertcamporangeAverageChunkDistance.get(), 0.5f, 65471948));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "pillager_camp"), PILLAGER_CAMP.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.pillagercampAverageChunkDistance.get(), 0.5f, 65471949));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "washing_camp"), WASHING_CAMP.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.washingcampAverageChunkDistance.get(), 0.5f, 65471950));
        //addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "underground_camp"), UNDERGROUND_CAMP.get(), GenerationStage.Decoration.UNDERGROUND_STRUCTURES, createSpacingAndSalt(IDASConfig.undergroundcampAverageChunkDistance.get(), 0.5f, 65471971));
        //addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "underground_camp_deep"), UNDERGROUND_CAMP_DEEP.get(), GenerationStage.Decoration.UNDERGROUND_STRUCTURES, createSpacingAndSalt(IDASConfig.undergroundcampdeepAverageChunkDistance.get(), 0.5f, 65471972));

        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "polar_bear_den"), POLAR_BEAR_DEN.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.polarbeardenAverageChunkDistance.get(), 0.5f, 65471951));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "forest_den"), FOREST_DEN.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.forestdenAverageChunkDistance.get(), 0.5f, 65471952));

        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "lumber_camp_oak"), LUMBER_CAMP_OAK.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.lumbercampoakAverageChunkDistance.get(), 0.5f, 65471962));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "lumber_camp_birch"), LUMBER_CAMP_BIRCH.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.lumbercampbirchAverageChunkDistance.get(), 0.5f, 65471953));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "lumber_camp_spruce"), LUMBER_CAMP_SPRUCE.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.lumbercampspruceAverageChunkDistance.get(), 0.5f, 65471954));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "lumber_camp_dark_oak"), LUMBER_CAMP_DARK_OAK.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.lumbercampdarkoakAverageChunkDistance.get(), 0.5f, 65471955));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "lumber_camp_acacia"), LUMBER_CAMP_ACACIA.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.lumbercampacaciaAverageChunkDistance.get(), 0.5f, 65471956));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "lumber_camp_jungle"), LUMBER_CAMP_JUNGLE.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.lumbercampjungleAverageChunkDistance.get(), 0.5f, 65471957));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "lumber_camp_bopredwood"), LUMBER_CAMP_BOPREDWOOD.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.lumbercampbopredwoodAverageChunkDistance.get(), 0.5f, 65471958));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "lumber_camp_bygredwood"), LUMBER_CAMP_BYGREDWOOD.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.lumbercampbygredwoodAverageChunkDistance.get(), 0.5f, 65471959));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "lumber_camp_bopmahogany"), LUMBER_CAMP_BOPMAHOGANY.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.lumbercampbopmahoganyAverageChunkDistance.get(), 0.5f, 65471960));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "lumber_camp_bygmahogany"), LUMBER_CAMP_BYGMAHOGANY.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.lumbercampbygmahoganyAverageChunkDistance.get(), 0.5f, 65471961));

        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "bazaar"), BAZAAR.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.bazaarAverageChunkDistance.get(), 0.5f, 65471962));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "bearclaw_inn"), BEARCLAW_INN.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.bearclawinnAverageChunkDistance.get(), 0.5f, 65471963));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "hunters_cabin"), HUNTERS_CABIN.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.hunterscabinAverageChunkDistance.get(), 0.5f, 65471964));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "farmhouse"), FARMHOUSE.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.farmhouseAverageChunkDistance.get(), 0.5f, 65471964));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "hermits_hollow"), HERMITS_HOLLOW.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.hermitshollowAverageChunkDistance.get(), 0.5f, 65471965));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "witches_treestump"), WITCHES_TREESTUMP.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.witchestreestumpAverageChunkDistance.get(), 0.5f, 65471966));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "redhorn_guild"), REDHORN_GUILD.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.redhornguildAverageChunkDistance.get(), 0.5f, 65471967));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "apothecary_abode"), APOTHECARY_ABODE.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.apothecaryabodeAverageChunkDistance.get(), 0.5f, 65471968));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "beekeepers_house"), BEEKEEPERS_HOUSE.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.beekeepershouseAverageChunkDistance.get(), 0.5f, 65471969));
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "treetop_tavern"), TREETOP_TAVERN.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.treetoptavernAverageChunkDistance.get(), 0.5f, 65471970));

        //Ice and Fire Structures
        addToTerraformingAndStructureMaps(new ResourceLocation(IDAS.MODID, "labyrinth_iceandfire"), LABYRINTH_IF.get(), GenerationStage.Decoration.SURFACE_STRUCTURES, createSpacingAndSalt(IDASConfig.labyrinthAverageChunkDistance.get(), 0.5f, 65471111));





        //registers the structure pieces.
        IDASStructurePieces.registerStructurePieces();
    }

    private static StructureSeparationSettings createSpacingAndSalt(int averageSpacing, float percentageForMinSpacing, int salt){
        return new StructureSeparationSettings(averageSpacing, (int) (averageSpacing * percentageForMinSpacing), salt);
    }

    public static <F extends Structure<NoFeatureConfig>> void addToTerraformingAndStructureMaps(ResourceLocation resourceLocation, F structure, GenerationStage.Decoration stage, StructureSeparationSettings StructureSeparationSettings) {
        Structure.NOISE_AFFECTING_FEATURES = ImmutableList.<Structure<?>>builder().addAll(Structure.NOISE_AFFECTING_FEATURES).add(structure).build();
        addToStructureMaps(resourceLocation, structure, stage, StructureSeparationSettings);
    }

    public static <C extends IFeatureConfig, F extends Structure<C>> void addToStructureMaps(ResourceLocation resourceLocation, F structure, GenerationStage.Decoration stage, StructureSeparationSettings structureSeparationSettings, C config) {
        Structure.STRUCTURES_REGISTRY.put(resourceLocation.toString().toLowerCase(Locale.ROOT), structure);

        // This is only for myself. Others should override step() in
        // their structure's class to return their generation stage instead.
        Structure.STEP.put(structure, stage);

        DimensionStructuresSettings.DEFAULTS = ImmutableMap.<Structure<?>, StructureSeparationSettings>builder().putAll(DimensionStructuresSettings.DEFAULTS).put(structure, structureSeparationSettings).build();
        FlatGenerationSettings.STRUCTURE_FEATURES.put(structure, structure.configured(config));
        IDAS_STRUCTURES.put(structure, structureSeparationSettings);
    }

    public static <F extends Structure<NoFeatureConfig>> void addToStructureMaps(ResourceLocation resourceLocation, F structure, GenerationStage.Decoration stage, StructureSeparationSettings structureSeparationSettings) {
        Structure.STRUCTURES_REGISTRY.put(resourceLocation.toString().toLowerCase(Locale.ROOT), structure);

        // This is only for myself. Others should override step() in their structure's class to return their generation stage instead.
        Structure.STEP.put(structure, stage);

        DimensionStructuresSettings.DEFAULTS = ImmutableMap.<Structure<?>, StructureSeparationSettings>builder().putAll(DimensionStructuresSettings.DEFAULTS).put(structure, structureSeparationSettings).build();
        FlatGenerationSettings.STRUCTURE_FEATURES.put(structure, structure.configured(IFeatureConfig.NONE));
        IDAS_STRUCTURES.put(structure, structureSeparationSettings);
    }
}
