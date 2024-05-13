package com.devjulen.spanishdelight.common.registry;

import com.devjulen.spanishdelight.SpanishDelight;
import com.devjulen.spanishdelight.common.SDFoodValues;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import static com.devjulen.spanishdelight.common.registry.ModCreativeTabs.addToTab;

public class ModItemsRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SpanishDelight.MOD_ID);

    // Non-edible items
    public static final RegistryObject<Item> PAPRIKA = addToTab(ITEMS.register("paprika", () -> new Item(new Item.Properties())));

    // Edible ingredients
    public static final RegistryObject<Item> SLICED_POTATO = addToTab(ITEMS.register("sliced_potato", () -> new Item(new Item.Properties().food(SDFoodValues.SLICED_POTATO))));
    public static final RegistryObject<Item> SLICED_ONION = addToTab(ITEMS.register("sliced_onion", () -> new Item(new Item.Properties().food(SDFoodValues.SLICED_ONION))));
    public static final RegistryObject<Item> GARLIC = addToTab(ITEMS.register("garlic", () -> new Item(new Item.Properties().food(SDFoodValues.GARLIC))));

    public static final RegistryObject<Item> GREEN_BEAN = addToTab(ITEMS.register("green_bean", () -> new ItemNameBlockItem(ModBlocksRegistry.GREEN_BEAN_CROP.get(), (new Item.Properties()).food(SDFoodValues.GREEN_BEAN))));

    public static final RegistryObject<Item> RED_PEPPER = addToTab(ITEMS.register("red_pepper", () -> new Item(new Item.Properties().food(SDFoodValues.RED_PEPPER))));
    public static final RegistryObject<Item> GREEN_PEPPER = addToTab(ITEMS.register("green_pepper", () -> new Item(new Item.Properties().food(SDFoodValues.GREEN_PEPPER))));
    public static final RegistryObject<Item> SQUID_RINGS = addToTab(ITEMS.register("squid_rings", () -> new Item(new Item.Properties().food(SDFoodValues.SQUID_RINGS))));

    // Cooking recipes
    public static final RegistryObject<Item> SPANISH_TORTILLA = addToTab(ITEMS.register("spanish_tortilla", () -> new Item(new Item.Properties().food(SDFoodValues.SPANISH_TORTILLA))));
    public static final RegistryObject<Item> PAELLA = addToTab(ITEMS.register("paella", () -> new Item(new Item.Properties().food(SDFoodValues.PAELLA))));
    public static final RegistryObject<Item> PIL_PIL_COD = addToTab(ITEMS.register("pil_pil_cod", () -> new Item(new Item.Properties().food(SDFoodValues.PIL_PIL_COD))));
    public static final RegistryObject<Item> CROQUETTES = addToTab(ITEMS.register("croquettes", () -> new Item(new Item.Properties().food(SDFoodValues.CROQUETTES))));
    public static final RegistryObject<Item> BRAVA_POTATOES = addToTab(ITEMS.register("brava_potatoes", () -> new Item(new Item.Properties().food(SDFoodValues.BRAVA_POTATOES))));
    public static final RegistryObject<Item> CHURROS = addToTab(ITEMS.register("churros", () -> new Item(new Item.Properties().food(SDFoodValues.CHURROS))));
    public static final RegistryObject<Item> GAZPACHO = addToTab(ITEMS.register("gazpacho", () -> new Item(new Item.Properties().food(SDFoodValues.GAZPACHO))));
    public static final RegistryObject<Item> PANTUMACA = addToTab(ITEMS.register("pantumaca", () -> new Item(new Item.Properties().food(SDFoodValues.PANTUMACA))));
    public static final RegistryObject<Item> FRIED_SQUID_RINGS = addToTab(ITEMS.register("fried_squid_rings", () -> new Item(new Item.Properties().food(SDFoodValues.FRIED_SQUID_RINGS))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
