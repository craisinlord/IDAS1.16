package com.craisinlord.idas.biomeinjection;

import com.craisinlord.idas.configs.IDASConfig;
import com.craisinlord.idas.modinit.IDASConfiguredStructures;
import com.craisinlord.idas.modinit.IDASStructures;
import com.craisinlord.idas.utils.BiomeSelection;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class DesertCamp {
    private DesertCamp() {}
    public static void addDesertCamp(BiomeLoadingEvent event) {

        if (IDASConfig.desertcampAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.DESERT_CAMP.get(),
                        () -> BiomeSelection.haveCategories(event, Biome.Category.DESERT) &&
                                BiomeSelection.hasName(event, "desert") &&
                        !(BiomeSelection.hasName(event, "lush", "red"))))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.DESERT_CAMP);
        }
        if (IDASConfig.desertcampredAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.DESERT_CAMP_RED.get(),
                        () -> BiomeSelection.haveCategories(event, Biome.Category.MESA) &&
                                BiomeSelection.hasName(event, "red", "mesa", "badlands")))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.DESERT_CAMP_RED);
        }
        if (IDASConfig.desertcamporangeAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.DESERT_CAMP_ORANGE.get(),
                        () -> BiomeSelection.haveCategories(event, Biome.Category.DESERT) &&
                                BiomeSelection.hasName(event, "lush")))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.DESERT_CAMP_ORANGE);
        }
    }
}
