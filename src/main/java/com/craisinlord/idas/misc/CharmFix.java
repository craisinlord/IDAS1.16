package com.craisinlord.idas.misc;

import com.craisinlord.idas.IDAS;
import com.mojang.datafixers.util.Either;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.gen.feature.template.BlockIgnoreStructureProcessor;
import net.minecraft.world.gen.feature.template.JigsawReplacementStructureProcessor;
import net.minecraft.world.gen.feature.template.PlacementSettings;
import net.minecraft.world.gen.feature.template.Template;

public final class CharmFix {
    private CharmFix() {}

    public static void UndoCharmProcessors(Either<ResourceLocation, Template> template, boolean isNotJigsaw, PlacementSettings placementsettings) {
        if(IDAS.isCharmOn && template.left().isPresent()) {
            ResourceLocation rl = template.left().get();
            if(!rl.getNamespace().equals("charm")) {
                placementsettings.clearProcessors();
                placementsettings.addProcessor(BlockIgnoreStructureProcessor.STRUCTURE_BLOCK);
                if (!isNotJigsaw) {
                    placementsettings.addProcessor(JigsawReplacementStructureProcessor.INSTANCE);
                }
            }
        }
    }
}