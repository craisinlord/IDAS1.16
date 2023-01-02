package com.craisinlord.idas.modinit;

import com.craisinlord.idas.IDAS;
import com.craisinlord.idas.mixin.resources.RandomRangesAccessor;
import com.craisinlord.idas.world.numberproviders.ProbabilityValue;
import net.minecraft.util.ResourceLocation;

public final class IDASNumberProviders {
    private IDASNumberProviders() {}

    public static final ResourceLocation PROBABILITY = new ResourceLocation(IDAS.MODID, "probability");

    public static void registerNumberProviders(){
        RandomRangesAccessor.idas_getGENERATORS().put(PROBABILITY, ProbabilityValue.class);
    }
}
