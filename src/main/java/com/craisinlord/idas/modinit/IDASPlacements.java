package com.craisinlord.idas.modinit;

import com.craisinlord.idas.IDAS;
import com.craisinlord.idas.world.placements.OffsetYPlacement;
import com.craisinlord.idas.world.placements.IDASMinusEightPlacement;
import com.craisinlord.idas.world.placements.SnapToLowerNonAirPlacement;
import com.craisinlord.idas.world.placements.configs.SingleIntConfig;
import net.minecraft.world.gen.placement.NoPlacementConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.SimplePlacement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public final class IDASPlacements {
	private IDASPlacements() {}

	public static final DeferredRegister<Placement<?>> DECORATORS = DeferredRegister.create(ForgeRegistries.DECORATORS, IDAS.MODID);

	public static final RegistryObject<Placement<SingleIntConfig>> OFFSET_Y_PLACEMENT = DECORATORS.register("offset_y_placement", () -> new OffsetYPlacement(SingleIntConfig.CODEC));
	public static final RegistryObject<Placement<NoPlacementConfig>> SNAP_TO_LOWER_NON_AIR_PLACEMENT = DECORATORS.register("snap_to_lower_non_air_placement", () -> new SnapToLowerNonAirPlacement(NoPlacementConfig.CODEC));
	public static final RegistryObject<Placement<NoPlacementConfig>> RS_MINUS_EIGHT_PLACEMENT = DECORATORS.register("rs_minus_eight_placement", () -> new IDASMinusEightPlacement(NoPlacementConfig.CODEC));
}
