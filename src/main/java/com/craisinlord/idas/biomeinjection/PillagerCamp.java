package com.craisinlord.idas.biomeinjection;

import com.craisinlord.idas.configs.IDASConfig;
import com.craisinlord.idas.modinit.IDASConfiguredStructures;
import com.craisinlord.idas.modinit.IDASStructures;
import com.craisinlord.idas.utils.BiomeSelection;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class PillagerCamp {
    private PillagerCamp() {}
    public static void addPillagerCamp(BiomeLoadingEvent event) {

        if (IDASConfig.pillagercampAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.PILLAGER_CAMP.get(),
                        () -> BiomeSelection.hasName(event, "forest", "plains", "meadow", "clearing", "field", "shrub", "wood", "grove")||
                                BiomeSelection.haveCategories(event, Biome.Category.FOREST)))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.PILLAGER_CAMP);
        }
    }
}
