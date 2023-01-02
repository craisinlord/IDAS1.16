package com.craisinlord.idas.world.placements;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.gen.placement.NoPlacementConfig;
import net.minecraft.world.gen.placement.SimplePlacement;

import java.util.Random;
import java.util.stream.Stream;

public class IDASMinusEightPlacement extends SimplePlacement<NoPlacementConfig>
{
    public IDASMinusEightPlacement(Codec<NoPlacementConfig> config) {
		super(config);
    }

	@Override
	public Stream<BlockPos> place(Random random, NoPlacementConfig config, BlockPos pos) {
		return Stream.of(pos.offset(-8, 0, -8));
	}
}