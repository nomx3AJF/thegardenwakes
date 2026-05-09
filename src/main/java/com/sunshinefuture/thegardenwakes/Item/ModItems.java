package com.sunshinefuture.thegardenwakes.Item;

import com.sunshinefuture.thegardenwakes.HomewardBound;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HomewardBound.MODID);

    public static final DeferredItem<Item> MOTIVECRYSTAL = ITEMS.registerSimpleItem("motive_crystal");



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
