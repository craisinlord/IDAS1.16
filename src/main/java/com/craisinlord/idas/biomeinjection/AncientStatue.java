package com.craisinlord.idas.biomeinjection;

import com.craisinlord.idas.configs.IDASConfig;
import com.craisinlord.idas.modinit.IDASConfiguredStructures;
import com.craisinlord.idas.modinit.IDASStructures;
import com.craisinlord.idas.utils.BiomeSelection;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class AncientStatue {
    private AncientStatue() {}
    public static void addAncientStatue(BiomeLoadingEvent event) {

        if (IDASConfig.ancientstatuejungleAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.ANCIENT_STATUE_JUNGLE.get(),
                        () -> BiomeSelection.haveCategories(event, Biome.Category.JUNGLE) &&
                        BiomeSelection.hasName(event, "jungle", "tropical", "rainforest")))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.ANCIENT_STATUE_JUNGLE);
        }
        if (IDASConfig.ancientstatuedesertAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.ANCIENT_STATUE_DESERT.get(),
                        () -> BiomeSelection.haveCategories(event, Biome.Category.DESERT)))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.ANCIENT_STATUE_DESERT);
        }
        if (IDASConfig.ancientstatueplainsAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.ANCIENT_STATUE_PLAINS.get(),
                        () -> BiomeSelection.hasName(event, "forest", "plains", "clearing", "field", "shrub", "wood", "grove")))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.ANCIENT_STATUE_PLAINS);
        }
    }
}
