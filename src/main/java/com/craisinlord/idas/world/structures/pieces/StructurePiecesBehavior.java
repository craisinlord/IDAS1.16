package com.craisinlord.idas.world.structures.pieces;

import com.craisinlord.idas.IDAS;
import com.google.common.collect.ImmutableMap;
import net.minecraft.util.ResourceLocation;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public final class StructurePiecesBehavior {
    private StructurePiecesBehavior() {}

    // No need for Lazy in this class because it is init in FMLCommonSetupEvent where config values now exists
    public static void init() {}

    public static class RequiredPieceNeeds {
        private final int maxLimit;
        private final Integer minDistanceFromCenter;
        public RequiredPieceNeeds(int maxLimit, Integer minDistanceFromCenter) {
            this.maxLimit = maxLimit;
            this.minDistanceFromCenter = minDistanceFromCenter;
        }

        public int getRequiredAmount(){
            return maxLimit;
        }

        public int getMinDistanceFromCenter(){
            return minDistanceFromCenter;
        }
    }

    private static void addRequiredVillagePiece(String structure, ResourceLocation pieceRL, int configSize) {
        ResourceLocation structureRL = new ResourceLocation(IDAS.MODID, structure);
        Map<ResourceLocation, RequiredPieceNeeds> requiredPieceMap = REQUIRED_PIECES_COUNT.get(structureRL);

        // Will not be immutable so we can add more than one entry.
        // -1 from config because the max size is where terminators are and terminators cannot spawn houses.
        if(requiredPieceMap != null) {
            requiredPieceMap.put(pieceRL, new RequiredPieceNeeds(1, Math.min(4, configSize - 1)));
        }
        else {
            REQUIRED_PIECES_COUNT.put(structureRL, Stream.of(new AbstractMap.SimpleImmutableEntry<>(pieceRL, new RequiredPieceNeeds(1, Math.min(4, configSize - 1)))).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)));
        }
    }

    public static HashMap<ResourceLocation, Map<ResourceLocation, RequiredPieceNeeds>> REQUIRED_PIECES_COUNT = new HashMap<>();
    static {
        REQUIRED_PIECES_COUNT.put(new ResourceLocation(IDAS.MODID, "labyrinth"), ImmutableMap.of(
                new ResourceLocation(IDAS.MODID, "labyrinth/labyrinth_entrance"), new StructurePiecesBehavior.RequiredPieceNeeds(1, Math.min(5, 3))));

        REQUIRED_PIECES_COUNT.put(new ResourceLocation(IDAS.MODID, "pillager_fortress"), ImmutableMap.of(
                new ResourceLocation(IDAS.MODID, "pillager_fortress/pillager_fortress1"), new StructurePiecesBehavior.RequiredPieceNeeds(1, Math.min(5, 7))));

    }
    public static HashMap<ResourceLocation, Integer> PIECES_COUNT = new HashMap<>();
    static {
        PIECES_COUNT.put(new ResourceLocation(IDAS.MODID, "strongholds/nether/library_big"), (4));
    }
}
