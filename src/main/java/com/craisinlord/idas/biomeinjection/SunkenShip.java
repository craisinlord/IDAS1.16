package com.craisinlord.idas.biomeinjection;

import com.craisinlord.idas.configs.IDASConfig;
import com.craisinlord.idas.modinit.IDASConfiguredStructures;
import com.craisinlord.idas.modinit.IDASStructures;
import com.craisinlord.idas.utils.BiomeSelection;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class SunkenShip {
    private SunkenShip() {}
    public static void addSunkenShip(BiomeLoadingEvent event) {

        if (IDASConfig.sunkenshipAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.SUNKEN_SHIP.get(),
                        () -> BiomeSelection.haveCategories(event, Biome.Category.OCEAN) &&
                                BiomeSelection.hasName(event, "ocean", "sea")))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.SUNKEN_SHIP);
        }
        if (IDASConfig.sunkenshipcoralAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.SUNKEN_SHIP_CORAL.get(),
                        () -> BiomeSelection.haveCategories(event, Biome.Category.OCEAN) &&
                                BiomeSelection.hasName(event, "warm", "warm_ocean")))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.SUNKEN_SHIP_CORAL);
        }
    }
}
