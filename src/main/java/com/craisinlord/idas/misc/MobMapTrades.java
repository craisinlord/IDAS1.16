package com.craisinlord.idas.misc;

import com.craisinlord.idas.IDAS;
import com.craisinlord.idas.configs.IDASConfig;
import com.craisinlord.idas.modinit.IDASStructures;
import net.minecraft.entity.merchant.villager.VillagerProfession;
import net.minecraft.entity.merchant.villager.VillagerTrades;
import net.minecraft.world.storage.MapDecoration;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.event.village.WandererTradesEvent;

public final class MobMapTrades {
    private MobMapTrades() {}
    //huge thanks to TelepathicGrunt for letting me use his code for this

    public static void onVillagerTradesEvent(VillagerTradesEvent event)
    {
        if(event.getType() == VillagerProfession.CARTOGRAPHER)
        {
            //level 3 trades
            if(IDASConfig.castleAverageChunkDistance.get() != 1001)
                event.getTrades().get(2).add(new VillagerTrades.EmeraldForMapTrade(13, IDASStructures.CASTLE.get(), MapDecoration.Type.BANNER_PURPLE, 12, 5));
            if(IDASConfig.sunkenshipAverageChunkDistance.get() != 1001)
                event.getTrades().get(2).add(new VillagerTrades.EmeraldForMapTrade(13, IDASStructures.SUNKEN_SHIP.get(), MapDecoration.Type.BANNER_BLACK, 12, 5));

            //level 4 trades
            if(IDASConfig.pillagerfortressAverageChunkDistance.get() != 1001)
                event.getTrades().get(3).add(new VillagerTrades.EmeraldForMapTrade(14, IDASStructures.PILLAGER_FORTRESS.get(), MapDecoration.Type.MANSION, 12, 5));
            if(IDASConfig.ancientminesAverageChunkDistance.get() != 1001)
                event.getTrades().get(3).add(new VillagerTrades.EmeraldForMapTrade(14, IDASStructures.ANCIENT_MINES.get(), MapDecoration.Type.BANNER_GRAY, 12, 10));
            if(IDASConfig.tinkersworkshopAverageChunkDistance.get() != 1001)
                event.getTrades().get(3).add(new VillagerTrades.EmeraldForMapTrade(14, IDASStructures.TINKERS_WORKSHOP.get(), MapDecoration.Type.BANNER_ORANGE, 12, 10));
            if(IDASConfig.labyrinthAverageChunkDistance.get() != 1001) {
                if (IDAS.isIceFireOn){
                    event.getTrades().get(3).add(new VillagerTrades.EmeraldForMapTrade(14, IDASStructures.LABYRINTH_IF.get(), MapDecoration.Type.BANNER_RED, 12, 10));
                }
                else {
                    event.getTrades().get(3).add(new VillagerTrades.EmeraldForMapTrade(14, IDASStructures.LABYRINTH.get(), MapDecoration.Type.BANNER_RED, 12, 10));
                }
            }
        }
    }


    public static void onWandererTradesEvent(WandererTradesEvent event)
    {
        if(IDASConfig.bazaarAverageChunkDistance.get() != 10001)
            event.getRareTrades().add(new VillagerTrades.EmeraldForMapTrade(38, IDASStructures.BAZAAR.get(), MapDecoration.Type.BANNER_YELLOW, 1, 100));
        if(IDASConfig.bearclawinnAverageChunkDistance.get() != 10001)
            event.getRareTrades().add(new VillagerTrades.EmeraldForMapTrade(38, IDASStructures.BEARCLAW_INN.get(), MapDecoration.Type.MANSION, 1, 100));
        if(IDASConfig.redhornguildAverageChunkDistance.get() != 10001)
            event.getRareTrades().add(new VillagerTrades.EmeraldForMapTrade(38, IDASStructures.REDHORN_GUILD.get(), MapDecoration.Type.BANNER_RED, 1, 100));
        if(IDASConfig.apothecaryabodeAverageChunkDistance.get() != 10001)
            event.getRareTrades().add(new VillagerTrades.EmeraldForMapTrade(38, IDASStructures.APOTHECARY_ABODE.get(), MapDecoration.Type.BANNER_PURPLE, 1, 100));
    }
}
