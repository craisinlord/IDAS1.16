package com.craisinlord.idas.biomeinjection;

import com.craisinlord.idas.configs.IDASConfig;
import com.craisinlord.idas.modinit.IDASConfiguredStructures;
import com.craisinlord.idas.modinit.IDASStructures;
import com.craisinlord.idas.utils.BiomeSelection;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class Farmhouse {
    private Farmhouse() {}
    public static void addFarmhouse(BiomeLoadingEvent event) {

        if (IDASConfig.farmhouseAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.BEARCLAW_INN.get(),
                        () -> BiomeSelection.hasName(event,  "plains", "clearing", "field", "shrub") ||
                                (BiomeSelection.haveCategories(event, Biome.Category.PLAINS))))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.FARMHOUSE);
        }
    }
}
