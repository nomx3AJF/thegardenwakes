package com.sunshinefuture.thegardenwakes.datagen;

import com.sunshinefuture.thegardenwakes.HomewardBound;
import com.sunshinefuture.thegardenwakes.item.ModItems;
import com.sunshinefuture.thegardenwakes.block.ModBlocks;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;


//btw the whole reason this mod is going to exist is because of the ability to do this. i fucking HATE JSON FILES
public class ModModelProvider extends ModelProvider {

    public ModModelProvider(PackOutput output) {
        super(output, HomewardBound.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        //ITEMS!!!
        itemModels.generateFlatItem(ModItems.MOTIVECRYSTAL.get(), ModelTemplates.FLAT_ITEM);



        //BLOCKS!!!
        blockModels.createTrivialCube(ModBlocks.ROCK.get());
        blockModels.createTrivialCube(ModBlocks.SHALE.get());
    }
}
