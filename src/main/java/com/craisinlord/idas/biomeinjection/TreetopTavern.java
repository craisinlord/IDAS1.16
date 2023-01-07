package com.craisinlord.idas.biomeinjection;

import com.craisinlord.idas.configs.IDASConfig;
import com.craisinlord.idas.modinit.IDASConfiguredStructures;
import com.craisinlord.idas.modinit.IDASStructures;
import com.craisinlord.idas.utils.BiomeSelection;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class TreetopTavern {
    private TreetopTavern() {}
    public static void addTreetopTavern(BiomeLoadingEvent event) {

        if (IDASConfig.treetoptavernAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.TREETOP_TAVERN.get(),
                        () -> BiomeSelection.hasName(event,  "jungle", "tropical")||
                                BiomeSelection.haveCategories(event, Biome.Category.JUNGLE)))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.TREETOP_TAVERN);
        }
    }
}
