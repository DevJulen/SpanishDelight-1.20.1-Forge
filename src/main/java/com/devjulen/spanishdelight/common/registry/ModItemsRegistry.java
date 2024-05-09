package com.devjulen.spanishdelight.common.registry;

import com.devjulen.spanishdelight.SpanishDelight;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemsRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SpanishDelight.MOD_ID);

    public static final RegistryObject<Item> SLICED_POTATO = ITEMS.register("sliced_potato",
            () -> new Item(new Item.Properties()));

    // WHEN THE CROP BLOCK IS READY!!!!! WITH THIS WE MAKE THE BEAN EDIBLE AND ALSO TO PLANT BEANS TO GROW
    //public static final RegistryObject<Item> GREEN_BEAN = new ItemNameBlockItem(ModBlocks.GREEN_BEAN_CROP.get(), new Item.Properties().food(SDFoodValues.GREEN_BEAN));
}
