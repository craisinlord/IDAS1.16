package com.craisinlord.idas.biomeinjection;

import com.craisinlord.idas.configs.IDASConfig;
import com.craisinlord.idas.modinit.IDASConfiguredStructures;
import com.craisinlord.idas.modinit.IDASStructures;
import com.craisinlord.idas.utils.BiomeSelection;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class WashingCamp {
    private WashingCamp() {}
    public static void addWashingCamp(BiomeLoadingEvent event) {

        if (IDASConfig.washingcampAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.WASHING_CAMP.get(),
                        () -> BiomeSelection.hasName(event, "forest", "plains", "meadow", "clearing", "field", "shrub", "wood", "grove")))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.WASHING_CAMP);
        }
    }
}
