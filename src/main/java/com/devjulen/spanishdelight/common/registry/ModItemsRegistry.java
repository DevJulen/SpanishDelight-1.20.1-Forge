package com.devjulen.spanishdelight.common.registry;

import com.devjulen.spanishdelight.SpanishDelight;
import com.devjulen.spanishdelight.common.SDFoodValues;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemsRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SpanishDelight.MOD_ID);

    // Non-edible items
    public static final RegistryObject<Item> PAPRIKA = ITEMS.register("paprika", () -> new Item(new Item.Properties()));

    // Edible ingredients
    public static final RegistryObject<Item> SLICED_POTATO = ITEMS.register("sliced_potato", () -> new Item(new Item.Properties().food(SDFoodValues.SLICED_POTATO)));
    public static final RegistryObject<Item> SLICED_ONION = ITEMS.register("sliced_onion", () -> new Item(new Item.Properties().food(SDFoodValues.SLICED_ONION)));
    public static final RegistryObject<Item> GARLIC = ITEMS.register("garlic", () -> new Item(new Item.Properties().food(SDFoodValues.GARLIC)));

    // WHEN THE CROP BLOCK IS READY!!!!! WITH THIS WE MAKE THE BEAN EDIBLE AND ALSO TO PLANT BEANS TO GROW
    //public static final RegistryObject<Item> GREEN_BEAN = new ItemNameBlockItem(ModBlocks.GREEN_BEAN_CROP.get(), new Item.Properties().food(SDFoodValues.GREEN_BEAN));

    public static final RegistryObject<Item> RED_PEPPER = ITEMS.register("red_pepper", () -> new Item(new Item.Properties().food(SDFoodValues.RED_PEPPER)));
    public static final RegistryObject<Item> GREEN_PEPPER = ITEMS.register("green_pepper", () -> new Item(new Item.Properties().food(SDFoodValues.GREEN_PEPPER)));
    public static final RegistryObject<Item> SQUID_RINGS = ITEMS.register("squid_rings", () -> new Item(new Item.Properties().food(SDFoodValues.SQUID_RINGS)));

    // Cooking recipes
    public static final RegistryObject<Item> SPANISH_TORTILLA = ITEMS.register("spanish_tortilla", () -> new Item(new Item.Properties().food(SDFoodValues.SPANISH_TORTILLA)));
    public static final RegistryObject<Item> PAELLA = ITEMS.register("paella", () -> new Item(new Item.Properties().food(SDFoodValues.PAELLA)));
    public static final RegistryObject<Item> PIL_PIL_COD = ITEMS.register("pil_pil_cod", () -> new Item(new Item.Properties().food(SDFoodValues.PIL_PIL_COD)));
    public static final RegistryObject<Item> CROQUETTES = ITEMS.register("croquettes", () -> new Item(new Item.Properties().food(SDFoodValues.CROQUETTES)));
    public static final RegistryObject<Item> BRAVA_POTATOES = ITEMS.register("brava_potatoes", () -> new Item(new Item.Properties().food(SDFoodValues.BRAVA_POTATOES)));
    public static final RegistryObject<Item> CHURROS = ITEMS.register("churros", () -> new Item(new Item.Properties().food(SDFoodValues.CHURROS)));
    public static final RegistryObject<Item> GAZPACHO = ITEMS.register("gazpacho", () -> new Item(new Item.Properties().food(SDFoodValues.GAZPACHO)));
    public static final RegistryObject<Item> PANTUMACA = ITEMS.register("pantumaca", () -> new Item(new Item.Properties().food(SDFoodValues.PANTUMACA)));
    public static final RegistryObject<Item> FRIED_SQUID_RINGS = ITEMS.register("fried_squid_rings", () -> new Item(new Item.Properties().food(SDFoodValues.FRIED_SQUID_RINGS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
