package com.craisinlord.idas.biomeinjection;

import com.craisinlord.idas.configs.IDASConfig;
import com.craisinlord.idas.modinit.IDASConfiguredStructures;
import com.craisinlord.idas.modinit.IDASStructures;
import com.craisinlord.idas.utils.BiomeSelection;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class WitchesTreestump {
    private WitchesTreestump() {}
    public static void addWitchesTreestump(BiomeLoadingEvent event) {

        if (IDASConfig.witchestreestumpAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.WITCHES_TREESTUMP.get(),
                        () -> BiomeSelection.hasName(event,  "spook", "dark", "haunt", "dead", "evil")))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.WITCHES_TREESTUMP);
        }
    }
}
