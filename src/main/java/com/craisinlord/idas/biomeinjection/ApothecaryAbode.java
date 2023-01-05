package com.craisinlord.idas.biomeinjection;

import com.craisinlord.idas.configs.IDASConfig;
import com.craisinlord.idas.modinit.IDASConfiguredStructures;
import com.craisinlord.idas.modinit.IDASStructures;
import com.craisinlord.idas.utils.BiomeSelection;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class ApothecaryAbode {
    private ApothecaryAbode() {}
    public static void addApothecaryAbode(BiomeLoadingEvent event) {

        if (IDASConfig.apothecaryabodeAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.APOTHECARY_ABODE.get(),
                        () -> BiomeSelection.hasName(event,  "magic", "jungle", "dark")||
                                BiomeSelection.haveCategories(event, Biome.Category.FOREST)))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.APOTHECARY_ABODE);
        }
    }
}
