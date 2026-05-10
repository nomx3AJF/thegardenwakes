package com.sunshinefuture.thegardenwakes.block;

import com.sunshinefuture.thegardenwakes.HomewardBound;
import com.sunshinefuture.thegardenwakes.Item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Function;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(HomewardBound.MODID);

    //google.com "stone synonyms" SEARCH!!!!
    public static final DeferredBlock<Block> ROCK = registerBlock("rock",properties -> new Block(properties.strength(4f).requiresCorrectToolForDrops()));
    //growing up, i always went to a pebble beach. so that's the reason the upwater  beaches have pebbles. thanks abbotsbury!! also - yeah, i went to the subtropical gardens a lot. can you tell?
    public static final DeferredBlock<Block> SHALE = registerBlock("shale",properties -> new Block(properties.strength(2f)));




    //my lovely helper functions yaaaaay
    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.registerItem(name, properties -> new BlockItem(block.get(), properties.useBlockDescriptionPrefix()));
    }

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Function<BlockBehaviour.Properties, T> function) {
        DeferredBlock<T> toReturn = BLOCKS.registerBlock(name, function);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    //these register the block and item


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
