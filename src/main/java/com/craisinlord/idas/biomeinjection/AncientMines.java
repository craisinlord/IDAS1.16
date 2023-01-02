package com.craisinlord.idas.biomeinjection;

import com.craisinlord.idas.configs.IDASConfig;
import com.craisinlord.idas.modinit.IDASConfiguredStructures;
import com.craisinlord.idas.modinit.IDASStructures;
import com.craisinlord.idas.utils.BiomeSelection;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class AncientMines {
    private AncientMines() {}
    public static void addAncientMines(BiomeLoadingEvent event) {

        if (IDASConfig.ancientminesAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.ANCIENT_MINES.get(),
                        () -> BiomeSelection.hasName(event, "mountain", "hill", "peak", "highland")))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.ANCIENT_MINES);
        }
    }
}
