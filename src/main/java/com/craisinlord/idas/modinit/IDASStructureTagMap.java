package com.craisinlord.idas.modinit;

import net.minecraft.world.gen.feature.structure.Structure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class IDASStructureTagMap {
    private IDASStructureTagMap() {}

    public enum STRUCTURE_TAGS {

        IDAS,
        GENERIC_AVOID_STRUCTURE,
        SMALL,
        RARE,
        COMMON,
        UNCOMMON,
        OCEAN,
        UNDERGROUND
    }

    public static final Map<Structure<?>, Set<STRUCTURE_TAGS>> TAGGED_STRUCTURES = new HashMap<>();
    public static final Map<STRUCTURE_TAGS, Set<Structure<?>>> REVERSED_TAGGED_STRUCTURES = new HashMap<>();

    /**
     * Call this after structure registration. This will setup the tags for all structures so we can reference them easier.
     */
    public static void setupTags(){
        addTags(IDASStructures.WIZARDTOWER.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.COMMON, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.ENCHANTINGTOWER.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.COMMON, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.CASTLE.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.COMMON, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.ABANDONEDHOUSE.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.COMMON, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.LABYRINTH.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.RARE, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.BRICKHOUSE.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.COMMON, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.PILLAGER_FORTRESS.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.RARE, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.ANCIENT_MINES.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.RARE, STRUCTURE_TAGS.UNDERGROUND, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.TINKERS_WORKSHOP.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.RARE, STRUCTURE_TAGS.UNDERGROUND, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.SUNKEN_SHIP.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.COMMON, STRUCTURE_TAGS.OCEAN, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.SUNKEN_SHIP_CORAL.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.COMMON, STRUCTURE_TAGS.OCEAN, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.ANCIENT_STATUE_JUNGLE.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.SMALL, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.ANCIENT_STATUE_PLAINS.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.SMALL, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.ANCIENT_STATUE_DESERT.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.SMALL, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.DESERT_MARKET.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.SMALL, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.DESERT_MARKET_RED.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.SMALL, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.DESERT_MARKET_ORANGE.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.SMALL, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.DESERT_CAMP.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.SMALL, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.DESERT_CAMP_RED.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.SMALL, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.DESERT_CAMP_ORANGE.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.SMALL, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.PILLAGER_CAMP.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.SMALL, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.WASHING_CAMP.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.SMALL, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        //addTags(IDASStructures.UNDERGROUND_CAMP.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.SMALL, STRUCTURE_TAGS.UNDERGROUND, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        //addTags(IDASStructures.UNDERGROUND_CAMP_DEEP.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.SMALL, STRUCTURE_TAGS.UNDERGROUND, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.POLAR_BEAR_DEN.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.SMALL, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.FOREST_DEN.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.SMALL, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.LUMBER_CAMP_BIRCH.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.SMALL, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.LUMBER_CAMP_BYGREDWOOD.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.SMALL, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.LUMBER_CAMP_DARK_OAK.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.SMALL, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.LUMBER_CAMP_OAK.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.SMALL, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.LUMBER_CAMP_ACACIA.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.SMALL, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.LUMBER_CAMP_BOPMAHOGANY.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.SMALL, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.LUMBER_CAMP_BOPREDWOOD.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.SMALL, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.LUMBER_CAMP_BYGMAHOGANY.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.SMALL, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.LUMBER_CAMP_JUNGLE.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.SMALL, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.LUMBER_CAMP_SPRUCE.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.SMALL, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.BAZAAR.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.RARE, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.BEARCLAW_INN.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.COMMON, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.HUNTERS_CABIN.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.COMMON, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.FARMHOUSE.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.COMMON, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.HERMITS_HOLLOW.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.COMMON, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.WITCHES_TREESTUMP.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.UNCOMMON, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.REDHORN_GUILD.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.UNCOMMON, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
        addTags(IDASStructures.APOTHECARY_ABODE.get(), Stream.of(STRUCTURE_TAGS.IDAS, STRUCTURE_TAGS.RARE, STRUCTURE_TAGS.GENERIC_AVOID_STRUCTURE).collect(Collectors.toSet()));
    }


    /**
     * Helper method to setup the tags to structure and structure to tag maps.
     *
     * Only does additions and no replacements/deletions.
     */
    private static void addTags(Structure<?> structure, Set<STRUCTURE_TAGS> tags){
        if(!TAGGED_STRUCTURES.containsKey(structure)){
            TAGGED_STRUCTURES.put(structure, new HashSet<>());
        }
        TAGGED_STRUCTURES.get(structure).addAll(tags);

        for(STRUCTURE_TAGS tag : tags){
            if(!REVERSED_TAGGED_STRUCTURES.containsKey(tag)){
                REVERSED_TAGGED_STRUCTURES.put(tag, new HashSet<>());
            }

            REVERSED_TAGGED_STRUCTURES.get(tag).add(structure);
        }
    }
}
