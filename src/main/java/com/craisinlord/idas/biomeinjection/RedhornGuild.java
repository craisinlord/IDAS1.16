package com.craisinlord.idas.biomeinjection;

import com.craisinlord.idas.configs.IDASConfig;
import com.craisinlord.idas.modinit.IDASConfiguredStructures;
import com.craisinlord.idas.modinit.IDASStructures;
import com.craisinlord.idas.utils.BiomeSelection;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class RedhornGuild {
    private RedhornGuild() {}
    public static void addRedhornGuild(BiomeLoadingEvent event) {

        if (IDASConfig.redhornguildAverageChunkDistance.get() != 1001 &&
                BiomeSelection.isBiomeAllowed(event, IDASStructures.REDHORN_GUILD.get(),
                        () -> BiomeSelection.haveCategories(event, Biome.Category.FOREST) ||
                                (BiomeSelection.haveCategories(event, Biome.Category.PLAINS))))
        {
            event.getGeneration().getStructures().add(() -> IDASConfiguredStructures.REDHORN_GUILD);
        }
    }
}
