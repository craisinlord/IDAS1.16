package com.craisinlord.idas.biomeinjection;

import com.craisinlord.idas.configs.IDASConfig;
import com.craisinlord.idas.modinit.IDASConfiguredStructures;
import com.craisinlord.idas.modinit.IDASStructures;
import com.craisinlord.idas.utils.BiomeSelection;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class EnchantingTowers {
    private EnchantingTowers() {}
    public static void addEnchantingTowers(BiomeLoadingEvent event) {

        if (IDASConfig.enchantingtowerAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.ENCHANTINGTOWER.get(),
                        () -> BiomeSelection.hasName(event, "forest", "plains", "meadow", "clearing", "magic", "field", "shrub", "wood", "jungle", "grove")))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.ENCHANTINGTOWER);
        }
    }
}
