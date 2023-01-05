package com.craisinlord.idas.biomeinjection;

import com.craisinlord.idas.configs.IDASConfig;
import com.craisinlord.idas.modinit.IDASConfiguredStructures;
import com.craisinlord.idas.modinit.IDASStructures;
import com.craisinlord.idas.utils.BiomeSelection;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class HermitsHollow {
    private HermitsHollow() {}
    public static void addHermitsHollow(BiomeLoadingEvent event) {

        if (IDASConfig.hermitshollowAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.HERMITS_HOLLOW.get(),
                        () -> BiomeSelection.haveCategories(event, Biome.Category.FOREST) ||
                                (BiomeSelection.haveCategories(event, Biome.Category.PLAINS))))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.HERMITS_HOLLOW);
        }
    }
}
