package com.craisinlord.idas.item;

import com.craisinlord.idas.IDAS;
import com.craisinlord.idas.utils.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.MusicDiscItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static net.minecraft.item.Rarity.RARE;

public class IDASItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, IDAS.MODID);

    public static final RegistryObject<Item> MUSIC_DISC_SLITHER = ITEMS.register("music_disc_slither",
            () -> new MusicDiscItem(4, () -> SoundEvents.SLITHER.get(),
                    new Item.Properties().rarity(RARE).stacksTo(1).tab(ItemGroup.TAB_MISC)));

    public static final RegistryObject<Item> MUSIC_DISC_CALIDUM = ITEMS.register("music_disc_calidum",
            () -> new MusicDiscItem(5, () -> SoundEvents.CALIDUM.get(),
                    new Item.Properties().rarity(RARE).stacksTo(1).tab(ItemGroup.TAB_MISC)));

    public static  final RegistryObject<Item> DISC_FRAGMENT_SLITHER = ITEMS.register("disc_fragment_slither",
            () -> new Item(new Item.Properties().rarity(RARE).tab(ItemGroup.TAB_MISC)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}