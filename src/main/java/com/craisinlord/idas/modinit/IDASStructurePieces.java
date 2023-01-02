package com.craisinlord.idas.modinit;

import com.craisinlord.idas.IDAS;
import com.craisinlord.idas.world.structures.pieces.MirroringSingleJigsawPiece;
import net.minecraft.world.gen.feature.jigsaw.IJigsawDeserializer;


public final class IDASStructurePieces {
    private IDASStructurePieces() {}

    public static IJigsawDeserializer<MirroringSingleJigsawPiece> MIRROR_SINGLE;

    public static void registerStructurePieces() {
        // needed to make template pool based mansions work
        MIRROR_SINGLE = IJigsawDeserializer.register(IDAS.MODID + ":mirroring_single_pool_element", MirroringSingleJigsawPiece.CODEC);
    }
}
