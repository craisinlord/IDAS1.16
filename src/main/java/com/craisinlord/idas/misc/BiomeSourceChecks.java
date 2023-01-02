package com.craisinlord.idas.misc;

import com.craisinlord.idas.mixin.world.BiomeProviderInvoker;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.biome.provider.CheckerboardBiomeProvider;

public final class BiomeSourceChecks {
    private BiomeSourceChecks() {}

    public static boolean hexlandsiiIsOn = false;

    public static boolean isHexlandBiomeSource(BiomeProvider biomeSource){
        if(hexlandsiiIsOn){
            ResourceLocation biomeSourceRL = Registry.BIOME_SOURCE.getKey(((BiomeProviderInvoker)biomeSource).idas_callCodec());
            return biomeSourceRL.toString().equals("hexlands:hexlands");
        }
        return false;
    }

    public static boolean isCheckeredBiomeSource(BiomeProvider biomeSource){
        return biomeSource instanceof CheckerboardBiomeProvider;
    }
}
