package com.craisinlord.idas.biomeinjection;

import com.craisinlord.idas.configs.IDASConfig;
import com.craisinlord.idas.modinit.IDASConfiguredStructures;
import com.craisinlord.idas.modinit.IDASStructures;
import com.craisinlord.idas.utils.BiomeSelection;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class AnimalDen {
    private AnimalDen() {}
    public static void addAnimalDen(BiomeLoadingEvent event) {

        if (IDASConfig.polarbeardenAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.POLAR_BEAR_DEN.get(),
                        () -> BiomeSelection.haveCategories(event, Biome.Category.ICY) ||
                                BiomeSelection.hasName(event, "icy", "ice", "snowy")))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.POLAR_BEAR_DEN);
        }
        if (IDASConfig.forestdenAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.FOREST_DEN.get(),
                        () -> BiomeSelection.hasName(event, "forest", "shrub", "wood", "grove")))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.FOREST_DEN);
        }
    }
}
