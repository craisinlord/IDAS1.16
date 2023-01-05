package com.craisinlord.idas.biomeinjection;

import com.craisinlord.idas.configs.IDASConfig;
import com.craisinlord.idas.modinit.IDASConfiguredStructures;
import com.craisinlord.idas.modinit.IDASStructures;
import com.craisinlord.idas.utils.BiomeSelection;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class Bazaar {
    private Bazaar() {}
    public static void addBazaar(BiomeLoadingEvent event) {

        if (IDASConfig.bazaarAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.BAZAAR.get(),
                        () -> BiomeSelection.haveCategories(event, Biome.Category.DESERT)&&
                              BiomeSelection.hasName(event, "desert", "dry")))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.BAZAAR);
        }
    }
}
