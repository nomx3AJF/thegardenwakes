package com.sunshinefuture.thegardenwakes.datagen;

import com.sunshinefuture.thegardenwakes.HomewardBound;
import com.sunshinefuture.thegardenwakes.Item.ModItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;

public class ModModelProvider extends ModelProvider {

    public ModModelProvider(PackOutput output) {
        super(output, HomewardBound.MODID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        itemModels.generateFlatItem(ModItems.MOTIVECRYSTAL.get(), ModelTemplates.FLAT_ITEM);
    }
}
