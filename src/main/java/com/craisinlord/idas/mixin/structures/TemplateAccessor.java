package com.craisinlord.idas.mixin.structures;

import net.minecraft.world.gen.feature.template.Template;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.List;

@Mixin(Template.class)
public interface TemplateAccessor {

    @Accessor("palettes")
    List<Template.Palette> idas_getBlocks();
}
