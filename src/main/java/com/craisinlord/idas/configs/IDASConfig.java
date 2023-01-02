package com.craisinlord.idas.configs;

import net.minecraftforge.common.ForgeConfigSpec;

public class IDASConfig {
	public static final ForgeConfigSpec GENERAL_SPEC;

	public static ForgeConfigSpec.DoubleValue locateMaxTime;
	public static ForgeConfigSpec.IntValue abandonedhouseAverageChunkDistance;
	public static ForgeConfigSpec.IntValue brickhouseAverageChunkDistance;
	public static ForgeConfigSpec.IntValue castleAverageChunkDistance;
	public static ForgeConfigSpec.IntValue enchantingtowerAverageChunkDistance;
	public static ForgeConfigSpec.IntValue wizardtowerAverageChunkDistance;
	public static ForgeConfigSpec.IntValue labyrinthAverageChunkDistance;
	public static ForgeConfigSpec.IntValue pillagerfortressAverageChunkDistance;
	public static ForgeConfigSpec.IntValue ancientminesAverageChunkDistance;
	public static ForgeConfigSpec.IntValue tinkersworkshopAverageChunkDistance;
	public static ForgeConfigSpec.IntValue sunkenshipAverageChunkDistance;
	public static ForgeConfigSpec.IntValue sunkenshipcoralAverageChunkDistance;
	public static ForgeConfigSpec.IntValue ancientstatuejungleAverageChunkDistance;
	public static ForgeConfigSpec.IntValue ancientstatueplainsAverageChunkDistance;
	public static ForgeConfigSpec.IntValue ancientstatuedesertAverageChunkDistance;
	public static ForgeConfigSpec.IntValue desertmarketAverageChunkDistance;
	public static ForgeConfigSpec.IntValue desertmarketredAverageChunkDistance;
	public static ForgeConfigSpec.IntValue desertmarketorangeAverageChunkDistance;
	public static ForgeConfigSpec.IntValue desertcampAverageChunkDistance;
	public static ForgeConfigSpec.IntValue desertcampredAverageChunkDistance;
	public static ForgeConfigSpec.IntValue desertcamporangeAverageChunkDistance;
	public static ForgeConfigSpec.IntValue pillagercampAverageChunkDistance;
	public static ForgeConfigSpec.IntValue washingcampAverageChunkDistance;
	public static ForgeConfigSpec.IntValue polarbeardenAverageChunkDistance;
	public static ForgeConfigSpec.IntValue forestdenAverageChunkDistance;
	public static ForgeConfigSpec.IntValue lumbercampoakAverageChunkDistance;
	public static ForgeConfigSpec.IntValue lumbercampbirchAverageChunkDistance;
	public static ForgeConfigSpec.IntValue lumbercampspruceAverageChunkDistance;
	public static ForgeConfigSpec.IntValue lumbercampdarkoakAverageChunkDistance;
	public static ForgeConfigSpec.IntValue lumbercampacaciaAverageChunkDistance;
	public static ForgeConfigSpec.IntValue lumbercampjungleAverageChunkDistance;
	public static ForgeConfigSpec.IntValue lumbercampbopredwoodAverageChunkDistance;
	public static ForgeConfigSpec.IntValue lumbercampbygredwoodAverageChunkDistance;
	public static ForgeConfigSpec.IntValue lumbercampbopmahoganyAverageChunkDistance;
	public static ForgeConfigSpec.IntValue lumbercampbygmahoganyAverageChunkDistance;

	static {
		ForgeConfigSpec.Builder configBuilder = new ForgeConfigSpec.Builder();
		setupConfig(configBuilder);
		GENERAL_SPEC = configBuilder.build();
	}

	private static void setupConfig(ForgeConfigSpec.Builder builder) {
		locateMaxTime = builder
				.comment("\n How long before giving up should locate command, explorer maps, and other locating stuff",
						" do when locating a Integrated Dungeons and Structures's structure. This is in seconds.")
				.translation("idas.locatemaxtime")
				.defineInRange("locateMaxTime", 15D, 1D, 1000000D);

		builder.comment("-----------------------------------------------------------------------------------------",
				" Average distance between spawn attempts for IDAS Abandoned Houses.",
				" 1 for spawning in most chunks and 1001 for none.");
		builder.push("Abandonedhouse");

		abandonedhouseAverageChunkDistance = builder
				.translation("idas.abandonedhouseaveragechunkdistance")
				.defineInRange("abandonedhouseAverageChunkDistance", 40, 1, 1001);
		builder.pop();

		builder.comment("-----------------------------------------------------------------------------------------",
				" Average distance between spawn attempts for IDAS Brick Houses.",
				" 1 for spawning in most chunks and 1001 for none.");
		builder.push("Brickhouse");

		brickhouseAverageChunkDistance = builder
				.translation("idas.brickhouseaveragechunkdistance")
				.defineInRange("brickhouseAverageChunkDistance", 45, 1, 1001);
		builder.pop();

		builder.comment("-----------------------------------------------------------------------------------------",
				" Average distance between spawn attempts for IDAS Castles.",
				" 1 for spawning in most chunks and 1001 for none.");
		builder.push("Castles");

		castleAverageChunkDistance = builder
				.translation("idas.csatleaveragechunkdistance")
				.defineInRange("castleAverageChunkDistance", 50, 1, 1001);
		builder.pop();

		builder.comment("-----------------------------------------------------------------------------------------",
				" Average distance between spawn attempts for IDAS Wizard Towers.",
				" 1 for spawning in most chunks and 1001 for none.");
		builder.push("Enchantingtowers");

		enchantingtowerAverageChunkDistance = builder
				.translation("idas.enchantingtoweraveragechunkdistance")
				.defineInRange("enchantingtowerAverageChunkDistance", 60, 1, 1001);
		builder.pop();

		builder.comment("-----------------------------------------------------------------------------------------",
				" Average distance between spawn attempts for IDAS Wizard Towers.",
				" 1 for spawning in most chunks and 1001 for none.");
		builder.push("Wizardtowers");

		wizardtowerAverageChunkDistance = builder
				.translation("idas.wizardtoweraveragechunkdistance")
				.defineInRange("wizardtowerAverageChunkDistance", 40, 1, 1001);
		builder.pop();

		builder.comment("-----------------------------------------------------------------------------------------",
				" Average distance between spawn attempts for IDAS Labyrinths.",
				" 1 for spawning in most chunks and 1001 for none.");
		builder.push("Labyrinth");

		labyrinthAverageChunkDistance = builder
				.translation("idas.labyrinthaveragechunkdistance")
				.defineInRange("labyrinthAverageChunkDistance", 75, 1, 1001);
		builder.pop();

		builder.comment("-----------------------------------------------------------------------------------------",
				" Average distance between spawn attempts for IDAS Pillager Fortresses.",
				" 1 for spawning in most chunks and 1001 for none.");
		builder.push("PillagerFortress");

		pillagerfortressAverageChunkDistance = builder
				.translation("idas.pillagerfortressAverageChunkDistance")
				.defineInRange("pillagerfortressAverageChunkDistance", 60, 1, 1001);
		builder.pop();

		builder.comment("-----------------------------------------------------------------------------------------",
				" Average distance between spawn attempts for IDAS Ancient Mines.",
				" 1 for spawning in most chunks and 1001 for none.");
		builder.push("AncientMines");

		ancientminesAverageChunkDistance = builder
				.translation("idas.ancientminesAverageChunkDistance")
				.defineInRange("ancientminesAverageChunkDistance", 50, 1, 1001);
		builder.pop();

		builder.comment("-----------------------------------------------------------------------------------------",
				" Average distance between spawn attempts for IDAS Tinkers Workshop.",
				" 1 for spawning in most chunks and 1001 for none.");
		builder.push("TinkersWorkshop");

		tinkersworkshopAverageChunkDistance = builder
				.translation("idas.tinkersworkshopAverageChunkDistance")
				.defineInRange("tinkersworkshopAverageChunkDistance", 50, 1, 1001);
		builder.pop();

		builder.comment("-----------------------------------------------------------------------------------------",
				" Average distance between spawn attempts for IDAS Sunken Ships.",
				" 1 for spawning in most chunks and 1001 for none.");
		builder.push("SunkenShip");

		sunkenshipAverageChunkDistance = builder
				.translation("idas.sunkenshipAverageChunkDistance")
				.defineInRange("sunkenshipAverageChunkDistance", 25, 1, 1001);
		builder.pop();

		builder.comment("-----------------------------------------------------------------------------------------",
				" Average distance between spawn attempts for IDAS Coral Sunken Ships.",
				" 1 for spawning in most chunks and 1001 for none.");
		builder.push("SunkenShipCoral");

		sunkenshipcoralAverageChunkDistance = builder
				.translation("idas.sunkenshipcoralAverageChunkDistance")
				.defineInRange("sunkenshipcoralAverageChunkDistance", 25, 1, 1001);
		builder.pop();

		builder.comment("-----------------------------------------------------------------------------------------",
				" Average distance between spawn attempts for IDAS Jungle Ancient Statues.",
				" 1 for spawning in most chunks and 1001 for none.");
		builder.push("AncientStatueJungle");

		ancientstatuejungleAverageChunkDistance = builder
				.translation("idas.ancientstatuejungleAverageChunkDistance")
				.defineInRange("ancientstatuejungleAverageChunkDistance", 20, 1, 1001);
		builder.pop();

		builder.comment("-----------------------------------------------------------------------------------------",
				" Average distance between spawn attempts for IDAS Plains Ancient Statues.",
				" 1 for spawning in most chunks and 1001 for none.");
		builder.push("AncientStatuePlains");

		ancientstatueplainsAverageChunkDistance = builder
				.translation("idas.ancientstatueplainsAverageChunkDistance")
				.defineInRange("ancientstatueplainsAverageChunkDistance", 20, 1, 1001);
		builder.pop();

		builder.comment("-----------------------------------------------------------------------------------------",
				" Average distance between spawn attempts for IDAS Desert Ancient Statues.",
				" 1 for spawning in most chunks and 1001 for none.");
		builder.push("AncientStatueDesert");

		ancientstatuedesertAverageChunkDistance = builder
				.translation("idas.ancientstatuedesertAverageChunkDistance")
				.defineInRange("ancientstatuedesertAverageChunkDistance", 20, 1, 1001);
		builder.pop();

		builder.comment("-----------------------------------------------------------------------------------------",
				" Average distance between spawn attempts for IDAS Desert Markets.",
				" 1 for spawning in most chunks and 1001 for none.");
		builder.push("DesertMarket");

		desertmarketAverageChunkDistance = builder
				.translation("idas.desertmarketAverageChunkDistance")
				.defineInRange("desertmarketAverageChunkDistance", 25, 1, 1001);
		builder.pop();

		builder.comment("-----------------------------------------------------------------------------------------",
				" Average distance between spawn attempts for IDAS Red Desert Markets.",
				" 1 for spawning in most chunks and 1001 for none.");
		builder.push("RedDesertMarket");

		desertmarketredAverageChunkDistance = builder
				.translation("idas.desertmarketredAverageChunkDistance")
				.defineInRange("desertmarketredAverageChunkDistance", 25, 1, 1001);
		builder.pop();

		builder.comment("-----------------------------------------------------------------------------------------",
				" Average distance between spawn attempts for IDAS Orange Desert Markets.",
				" 1 for spawning in most chunks and 1001 for none.");
		builder.push("OrangeDesertMarket");

		desertmarketorangeAverageChunkDistance = builder
				.translation("idas.desertmarketorangeAverageChunkDistance")
				.defineInRange("desertmarketorangeAverageChunkDistance", 25, 1, 1001);
		builder.pop();

		builder.comment("-----------------------------------------------------------------------------------------",
				" Average distance between spawn attempts for IDAS Desert Camps.",
				" 1 for spawning in most chunks and 1001 for none.");
		builder.push("DesertCamp");

		desertcampAverageChunkDistance = builder
				.translation("idas.desertcampAverageChunkDistance")
				.defineInRange("desertcampAverageChunkDistance", 12, 1, 1001);
		builder.pop();

		builder.comment("-----------------------------------------------------------------------------------------",
				" Average distance between spawn attempts for IDAS Red Desert Camps.",
				" 1 for spawning in most chunks and 1001 for none.");
		builder.push("RedDesertCamp");

		desertcampredAverageChunkDistance = builder
				.translation("idas.desertcampredAverageChunkDistance")
				.defineInRange("desertcampredAverageChunkDistance", 12, 1, 1001);
		builder.pop();

		builder.comment("-----------------------------------------------------------------------------------------",
				" Average distance between spawn attempts for IDAS Orange Desert Camps.",
				" 1 for spawning in most chunks and 1001 for none.");
		builder.push("OrangeDesertCamp");

		desertcamporangeAverageChunkDistance = builder
				.translation("idas.desertcamporangeAverageChunkDistance")
				.defineInRange("desertcamporangeAverageChunkDistance", 12, 1, 1001);
		builder.pop();

		builder.comment("-----------------------------------------------------------------------------------------",
				" Average distance between spawn attempts for IDAS Pillager Camps.",
				" 1 for spawning in most chunks and 1001 for none.");
		builder.push("PillagerCamp");

		pillagercampAverageChunkDistance = builder
				.translation("idas.pillagercampAverageChunkDistance")
				.defineInRange("pillagercampAverageChunkDistance", 20, 1, 1001);
		builder.pop();

		builder.comment("-----------------------------------------------------------------------------------------",
				" Average distance between spawn attempts for IDAS Washing Camps.",
				" 1 for spawning in most chunks and 1001 for none.");
		builder.push("WashingCamp");

		washingcampAverageChunkDistance = builder
				.translation("idas.washingcampAverageChunkDistance")
				.defineInRange("washingcampAverageChunkDistance", 10, 1, 1001);
		builder.pop();

		builder.comment("-----------------------------------------------------------------------------------------",
				" Average distance between spawn attempts for IDAS Polar Bear Dens.",
				" 1 for spawning in most chunks and 1001 for none.");
		builder.push("PolarBearDen");

		polarbeardenAverageChunkDistance = builder
				.translation("idas.polarbeardenAverageChunkDistance")
				.defineInRange("polarbeardenAverageChunkDistance", 10, 1, 1001);
		builder.pop();

		builder.comment("-----------------------------------------------------------------------------------------",
				" Average distance between spawn attempts for IDAS Forest (Wolf/Bear) Dens.",
				" 1 for spawning in most chunks and 1001 for none.");
		builder.push("PolarBearDen");

		forestdenAverageChunkDistance = builder
				.translation("idas.forestdenAverageChunkDistance")
				.defineInRange("forestdenAverageChunkDistance", 10, 1, 1001);
		builder.pop();

		builder.comment("-----------------------------------------------------------------------------------------",
				" Average distance between spawn attempts for IDAS Oak Lumber Camps",
				" 1 for spawning in most chunks and 1001 for none.");
		builder.push("OakLumberCamp");

		lumbercampoakAverageChunkDistance = builder
				.translation("idas.lumbercampoakAverageChunkDistance")
				.defineInRange("lumbercampoakAverageChunkDistance", 10, 1, 1001);
		builder.pop();

		builder.comment("-----------------------------------------------------------------------------------------",
				" Average distance between spawn attempts for IDAS Birch Lumber Camps",
				" 1 for spawning in most chunks and 1001 for none.");
		builder.push("BirchLumberCamp");

		lumbercampbirchAverageChunkDistance = builder
				.translation("idas.lumbercampbirchAverageChunkDistance")
				.defineInRange("lumbercampbirchAverageChunkDistance", 10, 1, 1001);
		builder.pop();

		builder.comment("-----------------------------------------------------------------------------------------",
				" Average distance between spawn attempts for IDAS Spruce Lumber Camps",
				" 1 for spawning in most chunks and 1001 for none.");
		builder.push("SpruceLumberCamp");

		lumbercampspruceAverageChunkDistance = builder
				.translation("idas.lumbercampspruceAverageChunkDistance")
				.defineInRange("lumbercampspruceAverageChunkDistance", 10, 1, 1001);
		builder.pop();

		builder.comment("-----------------------------------------------------------------------------------------",
				" Average distance between spawn attempts for IDAS Dark Oak Lumber Camps",
				" 1 for spawning in most chunks and 1001 for none.");
		builder.push("DarkOakLumberCamp");

		lumbercampdarkoakAverageChunkDistance = builder
				.translation("idas.lumbercampdarkoakAverageChunkDistance")
				.defineInRange("lumbercampdarkoakAverageChunkDistance", 10, 1, 1001);
		builder.pop();

		builder.comment("-----------------------------------------------------------------------------------------",
				" Average distance between spawn attempts for IDAS Acacia Lumber Camps",
				" 1 for spawning in most chunks and 1001 for none.");
		builder.push("AcaciaLumberCamp");

		lumbercampacaciaAverageChunkDistance = builder
				.translation("idas.lumbercampacaciaAverageChunkDistance")
				.defineInRange("lumbercampacaciaAverageChunkDistance", 10, 1, 1001);
		builder.pop();

		builder.comment("-----------------------------------------------------------------------------------------",
				" Average distance between spawn attempts for IDAS Jungle Lumber Camps",
				" 1 for spawning in most chunks and 1001 for none.");
		builder.push("JungleLumberCamp");

		lumbercampjungleAverageChunkDistance = builder
				.translation("idas.lumbercampjungleAverageChunkDistance")
				.defineInRange("lumbercampjungleAverageChunkDistance", 10, 1, 1001);
		builder.pop();

		builder.comment("-----------------------------------------------------------------------------------------",
				" Average distance between spawn attempts for IDAS BOP Redwood Lumber Camps",
				" 1 for spawning in most chunks and 1001 for none.");
		builder.push("BOPRedwoodLumberCamp");

		lumbercampbopredwoodAverageChunkDistance = builder
				.translation("idas.lumbercampbopredwoodAverageChunkDistance")
				.defineInRange("lumbercampbopredwoodAverageChunkDistance", 10, 1, 1001);
		builder.pop();

		builder.comment("-----------------------------------------------------------------------------------------",
				" Average distance between spawn attempts for IDAS BYG Redwood Lumber Camps",
				" 1 for spawning in most chunks and 1001 for none.");
		builder.push("BYGRedwoodLumberCamp");

		lumbercampbygredwoodAverageChunkDistance = builder
				.translation("idas.lumbercampbygredwoodAverageChunkDistance")
				.defineInRange("lumbercampbygredwoodAverageChunkDistance", 10, 1, 1001);
		builder.pop();

		builder.comment("-----------------------------------------------------------------------------------------",
				" Average distance between spawn attempts for IDAS BOP Mahogany Lumber Camps",
				" 1 for spawning in most chunks and 1001 for none.");
		builder.push("BOPMahoganyLumberCamp");

		lumbercampbopmahoganyAverageChunkDistance = builder
				.translation("idas.lumbercampbopmahoganyAverageChunkDistance")
				.defineInRange("lumbercampbopmahoganyAverageChunkDistance", 10, 1, 1001);
		builder.pop();

		builder.comment("-----------------------------------------------------------------------------------------",
				" Average distance between spawn attempts for IDAS BYG Mahogany Lumber Camps",
				" 1 for spawning in most chunks and 1001 for none.");
		builder.push("BYGMahoganyLumberCamp");

		lumbercampbygmahoganyAverageChunkDistance = builder
				.translation("idas.lumbercampbygmahoganyAverageChunkDistance")
				.defineInRange("lumbercampbygmahoganyAverageChunkDistance", 10, 1, 1001);
		builder.pop();
	}
}
