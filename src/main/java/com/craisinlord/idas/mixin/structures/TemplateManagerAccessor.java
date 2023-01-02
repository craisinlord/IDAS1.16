package com.craisinlord.idas.mixin.structures;

import net.minecraft.resources.IResourceManager;
import net.minecraft.world.gen.feature.template.TemplateManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(TemplateManager.class)
public interface TemplateManagerAccessor {
    @Accessor("resourceManager")
    IResourceManager idas_getResourceManager();
}
