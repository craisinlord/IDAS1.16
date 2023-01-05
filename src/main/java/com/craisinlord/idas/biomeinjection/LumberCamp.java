package com.craisinlord.idas.biomeinjection;

import com.craisinlord.idas.configs.IDASConfig;
import com.craisinlord.idas.modinit.IDASConfiguredStructures;
import com.craisinlord.idas.modinit.IDASStructures;
import com.craisinlord.idas.utils.BiomeSelection;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class LumberCamp {
    private LumberCamp() {}
    public static void addLumberCamp(BiomeLoadingEvent event) {

        if (IDASConfig.lumbercampoakAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.LUMBER_CAMP_OAK.get(),
                        () -> ((BiomeSelection.haveCategories(event, Biome.Category.FOREST) &&
                                !(BiomeSelection.hasName(event, "coniferous", "taiga", "redwood", "tropical")))
                             || BiomeSelection.hasName(event, "oak", "forest", "grove", "shrub", "wood"))))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.LUMBER_CAMP_OAK);
        }
        if (IDASConfig.lumbercampbirchAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.LUMBER_CAMP_BIRCH.get(),
                        () -> (BiomeSelection.haveCategories(event, Biome.Category.FOREST)&&
                                BiomeSelection.hasName(event, "birch", "flower"))))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.LUMBER_CAMP_BIRCH);
        }
        if (IDASConfig.lumbercampspruceAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.LUMBER_CAMP_SPRUCE.get(),
                        () -> (BiomeSelection.haveCategories(event, Biome.Category.TAIGA)||
                                BiomeSelection.hasName(event, "spruce", "taiga"))))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.LUMBER_CAMP_SPRUCE);
        }
        if (IDASConfig.lumbercampdarkoakAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.LUMBER_CAMP_DARK_OAK.get(),
                        () -> (BiomeSelection.haveCategories(event, Biome.Category.FOREST)&&
                                BiomeSelection.hasName(event, "dark"))))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.LUMBER_CAMP_DARK_OAK);
        }
        if (IDASConfig.lumbercampacaciaAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.LUMBER_CAMP_ACACIA.get(),
                        () -> (BiomeSelection.haveCategories(event, Biome.Category.SAVANNA)||
                                BiomeSelection.hasName(event, "sav", "acacia"))))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.LUMBER_CAMP_ACACIA);
        }
        if (IDASConfig.lumbercampjungleAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.LUMBER_CAMP_JUNGLE.get(),
                        () -> BiomeSelection.haveCategories(event, Biome.Category.JUNGLE) &&
                                BiomeSelection.hasName(event, "jungle")))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.LUMBER_CAMP_JUNGLE);
        }
        if (IDASConfig.lumbercampbopredwoodAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.LUMBER_CAMP_BOPREDWOOD.get(),
                        () -> BiomeSelection.hasNamespace(event, "biomesoplenty")&&
                                BiomeSelection.hasName(event, "redwood")))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.LUMBER_CAMP_BOPREDWOOD);
        }
        if (IDASConfig.lumbercampbygredwoodAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.LUMBER_CAMP_BYGREDWOOD.get(),
                        () -> BiomeSelection.hasNamespace(event, "byg")&&
                                BiomeSelection.hasName(event, "redwood")))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.LUMBER_CAMP_BYGREDWOOD);
        }
        if (IDASConfig.lumbercampbopmahoganyAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.LUMBER_CAMP_BOPMAHOGANY.get(),
                        () -> BiomeSelection.hasNamespace(event, "biomesoplenty")&&
                                BiomeSelection.hasName(event, "rainforest")))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.LUMBER_CAMP_BOPMAHOGANY);
        }
        if (IDASConfig.lumbercampbygmahoganyAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.LUMBER_CAMP_BYGMAHOGANY.get(),
                        () -> BiomeSelection.hasNamespace(event, "byg")&&
                                BiomeSelection.hasName(event, "rainforest")))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.LUMBER_CAMP_BYGMAHOGANY);
        }
    }
}
