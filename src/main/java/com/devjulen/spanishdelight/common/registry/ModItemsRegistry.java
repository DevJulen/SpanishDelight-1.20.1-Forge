package com.devjulen.spanishdelight.common.registry;

import com.devjulen.spanishdelight.SpanishDelight;
import com.devjulen.spanishdelight.common.SDFoodValues;
import com.devjulen.spanishdelight.common.item.GreenBean;
import com.devjulen.spanishdelight.common.item.SquidRing;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import static com.devjulen.spanishdelight.common.registry.ModCreativeTabs.addToTab;

public class ModItemsRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SpanishDelight.MOD_ID);

    // Helper methods
    public static Item.Properties basicItem() {
        return new Item.Properties();
    }

    // Non-edible items
    public static final RegistryObject<Item> PAPRIKA = addToTab(ITEMS.register("paprika", () -> new Item(new Item.Properties())));

    // Edible ingredients
    public static final RegistryObject<Item> SLICED_POTATO = addToTab(ITEMS.register("sliced_potato", () -> new Item(new Item.Properties().food(SDFoodValues.SLICED_POTATO))));
    public static final RegistryObject<Item> SLICED_ONION = addToTab(ITEMS.register("sliced_onion", () -> new Item(new Item.Properties().food(SDFoodValues.SLICED_ONION))));
    public static final RegistryObject<Item> GARLIC = addToTab(ITEMS.register("garlic", () -> new Item(new Item.Properties().food(SDFoodValues.GARLIC))));

    public static final RegistryObject<Item> GREEN_BEAN = addToTab(ITEMS.register("green_bean", () -> new GreenBean(ModBlocksRegistry.GREEN_BEAN_CROP.get(), (new Item.Properties()).food(SDFoodValues.GREEN_BEAN))));

    public static final RegistryObject<Item> RED_PEPPER = addToTab(ITEMS.register("red_pepper", () -> new Item(new Item.Properties().food(SDFoodValues.RED_PEPPER))));
    public static final RegistryObject<Item> GREEN_PEPPER = addToTab(ITEMS.register("green_pepper", () -> new Item(new Item.Properties().food(SDFoodValues.GREEN_PEPPER))));
    public static final RegistryObject<Item> SQUID_RING = addToTab(ITEMS.register("squid_ring", () -> new SquidRing(new Item.Properties().food(SDFoodValues.SQUID_RING))));

    // Cooking recipes
    public static final RegistryObject<Item> SPANISH_TORTILLA = addToTab(ITEMS.register("spanish_tortilla", () -> new Item(new Item.Properties().food(SDFoodValues.SPANISH_TORTILLA))));
    public static final RegistryObject<Item> PAELLA = addToTab(ITEMS.register("paella", () -> new Item(new Item.Properties().food(SDFoodValues.PAELLA))));
    public static final RegistryObject<Item> PIL_PIL_COD = addToTab(ITEMS.register("pil_pil_cod", () -> new Item(new Item.Properties().food(SDFoodValues.PIL_PIL_COD))));
    public static final RegistryObject<Item> CROQUETTES = addToTab(ITEMS.register("croquettes", () -> new Item(new Item.Properties().food(SDFoodValues.CROQUETTES))));
    public static final RegistryObject<Item> BRAVA_POTATOES = addToTab(ITEMS.register("brava_potatoes", () -> new Item(new Item.Properties().food(SDFoodValues.BRAVA_POTATOES))));
    public static final RegistryObject<Item> CHURRO = addToTab(ITEMS.register("churro", () -> new Item(new Item.Properties().food(SDFoodValues.CHURRO))));
    public static final RegistryObject<Item> GAZPACHO = addToTab(ITEMS.register("gazpacho", () -> new Item(new Item.Properties().food(SDFoodValues.GAZPACHO))));
    public static final RegistryObject<Item> PANTUMACA = addToTab(ITEMS.register("pantumaca", () -> new Item(new Item.Properties().food(SDFoodValues.PANTUMACA))));
    public static final RegistryObject<Item> FRIED_SQUID_RING = addToTab(ITEMS.register("fried_squid_ring", () -> new Item(new Item.Properties().food(SDFoodValues.FRIED_SQUID_RING))));

    // Blocks
    public static final RegistryObject<Item> WILD_GARLIC = addToTab(ITEMS.register("wild_garlic", () -> new BlockItem(ModBlocksRegistry.WILD_GARLIC.get(), basicItem())));
    public static final RegistryObject<Item> WILD_RED_PEPPER = addToTab(ITEMS.register("wild_red_pepper", () -> new BlockItem(ModBlocksRegistry.WILD_RED_PEPPER.get(), basicItem())));
    public static final RegistryObject<Item> WILD_GREEN_PEPPER = addToTab(ITEMS.register("wild_green_pepper", () -> new BlockItem(ModBlocksRegistry.WILD_GREEN_PEPPER.get(), basicItem())));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
