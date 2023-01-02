package com.craisinlord.idas.biomeinjection;

import com.craisinlord.idas.configs.IDASConfig;
import com.craisinlord.idas.modinit.IDASConfiguredStructures;
import com.craisinlord.idas.modinit.IDASStructures;
import com.craisinlord.idas.utils.BiomeSelection;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class DesertMarket {
    private DesertMarket() {}
    public static void addDesertMarket(BiomeLoadingEvent event) {

        if (IDASConfig.desertmarketAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.DESERT_MARKET.get(),
                        () -> BiomeSelection.haveCategories(event, Biome.Category.DESERT) &&
                                BiomeSelection.hasName(event, "desert") &&
                                !(BiomeSelection.hasName(event, "lush", "red"))))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.DESERT_MARKET);
        }
        if (IDASConfig.desertmarketredAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.DESERT_MARKET_RED.get(),
                        () -> BiomeSelection.haveCategories(event, Biome.Category.MESA) &&
                                BiomeSelection.hasName(event, "red", "mesa", "badlands")))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.DESERT_MARKET_RED);
        }
        if (IDASConfig.desertmarketorangeAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.DESERT_MARKET_ORANGE.get(),
                        () -> BiomeSelection.haveCategories(event, Biome.Category.DESERT) &&
                                BiomeSelection.hasName(event, "lush")))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.DESERT_MARKET_ORANGE);
        }
    }
}
