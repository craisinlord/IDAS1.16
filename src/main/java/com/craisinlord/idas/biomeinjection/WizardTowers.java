package com.craisinlord.idas.biomeinjection;

import com.craisinlord.idas.configs.IDASConfig;
import com.craisinlord.idas.modinit.IDASConfiguredStructures;
import com.craisinlord.idas.modinit.IDASStructures;
import com.craisinlord.idas.utils.BiomeSelection;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class WizardTowers {
    private WizardTowers() {}
    public static void addWizardTowers(BiomeLoadingEvent event) {

        if (IDASConfig.wizardtowerAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.WIZARDTOWER.get(),
                        () -> BiomeSelection.hasName(event, "forest", "plains", "meadow", "clearing", "magic", "field", "shrub", "wood", "jungle")))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.WIZARDTOWER);
        }
    }
}
