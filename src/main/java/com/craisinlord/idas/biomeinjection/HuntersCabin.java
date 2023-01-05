package com.craisinlord.idas.biomeinjection;

import com.craisinlord.idas.configs.IDASConfig;
import com.craisinlord.idas.modinit.IDASConfiguredStructures;
import com.craisinlord.idas.modinit.IDASStructures;
import com.craisinlord.idas.utils.BiomeSelection;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class HuntersCabin {
    private HuntersCabin() {}
    public static void addHuntersCabin(BiomeLoadingEvent event) {

        if (IDASConfig.hunterscabinAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.HUNTERS_CABIN.get(),
                        () -> BiomeSelection.haveCategories(event, Biome.Category.FOREST)))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.HUNTERS_CABIN);
        }
    }
}
