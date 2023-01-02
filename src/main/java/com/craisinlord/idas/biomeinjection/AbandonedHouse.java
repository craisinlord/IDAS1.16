package com.craisinlord.idas.biomeinjection;

import com.craisinlord.idas.configs.IDASConfig;
import com.craisinlord.idas.modinit.IDASConfiguredStructures;
import com.craisinlord.idas.modinit.IDASStructures;
import com.craisinlord.idas.utils.BiomeSelection;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class AbandonedHouse {
    private AbandonedHouse() {}
    public static void addAbandonedHouse(BiomeLoadingEvent event) {

        if (IDASConfig.abandonedhouseAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.ABANDONEDHOUSE.get(),
                        () -> BiomeSelection.hasName(event, "forest", "plains", "meadow", "clearing", "field", "shrub", "wood", "grove")))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.ABANDONEDHOUSE);
        }
    }
}
