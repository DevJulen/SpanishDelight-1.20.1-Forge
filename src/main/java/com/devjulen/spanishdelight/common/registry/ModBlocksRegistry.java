package com.devjulen.spanishdelight.common.registry;

import com.devjulen.spanishdelight.SpanishDelight;
import com.devjulen.spanishdelight.common.block.GreenBeanCropBlock;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import vectorwing.farmersdelight.common.block.WildCropBlock;

import java.util.function.Supplier;

public class ModBlocksRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SpanishDelight.MOD_ID);

    public static final RegistryObject<Block> GREEN_BEAN_CROP = BLOCKS.register("green_bean_crop",
            () -> new GreenBeanCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));

    public static final RegistryObject<Block> WILD_GARLIC = BLOCKS.register("wild_garlic",
            () -> new WildCropBlock(MobEffects.DIG_SPEED, 5, Block.Properties.copy(Blocks.TALL_GRASS).noOcclusion().noCollission()));

    public static final RegistryObject<Block> WILD_RED_PEPPER = BLOCKS.register("wild_red_pepper",
            () -> new WildCropBlock(MobEffects.MOVEMENT_SPEED, 8, Block.Properties.copy(Blocks.TALL_GRASS).noOcclusion().noCollission()));

    public static final RegistryObject<Block> WILD_GREEN_PEPPER = BLOCKS.register("wild_green_pepper",
            () -> new WildCropBlock(MobEffects.JUMP, 8, Block.Properties.copy(Blocks.TALL_GRASS).noOcclusion().noCollission()));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> blockRegistry = BLOCKS.register(name, block);
        registerBlockItem(name, blockRegistry);

        return blockRegistry;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItemsRegistry.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
