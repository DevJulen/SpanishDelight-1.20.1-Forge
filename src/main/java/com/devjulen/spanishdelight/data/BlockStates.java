package com.devjulen.spanishdelight.data;

import com.devjulen.spanishdelight.SpanishDelight;
import com.devjulen.spanishdelight.common.block.GreenBeanCropBlock;
import com.devjulen.spanishdelight.common.registry.ModBlocksRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.function.Function;

public class BlockStates extends BlockStateProvider {
    public BlockStates(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, SpanishDelight.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        makeGreenBeanCrop((CropBlock) ModBlocksRegistry.GREEN_BEAN_CROP.get(), "green_bean_stage", "green_bean_stage");
    }

    public void makeGreenBeanCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> strawberryStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] strawberryStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((GreenBeanCropBlock) block).getAgeProperty()),
                new ResourceLocation(SpanishDelight.MOD_ID, "block/" + textureName + state.getValue(((GreenBeanCropBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }
}
