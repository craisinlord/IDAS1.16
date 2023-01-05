package com.craisinlord.idas.biomeinjection;

import com.craisinlord.idas.configs.IDASConfig;
import com.craisinlord.idas.modinit.IDASConfiguredStructures;
import com.craisinlord.idas.modinit.IDASStructures;
import com.craisinlord.idas.utils.BiomeSelection;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class BearclawInn {
    private BearclawInn() {}
    public static void addBearclawInn(BiomeLoadingEvent event) {

        if (IDASConfig.bearclawinnAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.BEARCLAW_INN.get(),
                        () -> BiomeSelection.hasName(event, "forest", "plains", "clearing", "field", "shrub", "grove")))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.BEARCLAW_INN);
        }
    }
}
