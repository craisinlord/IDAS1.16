package com.craisinlord.idas.mixin.resources;

import net.minecraft.resources.FallbackResourceManager;
import net.minecraft.resources.SimpleReloadableResourceManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.Map;

@Mixin(SimpleReloadableResourceManager.class)
public interface SimpleReloadableResourceManagerAccessor {
    @Accessor("namespacedPacks")
    Map<String, FallbackResourceManager> idas_getFallbackResourceManager();
}
