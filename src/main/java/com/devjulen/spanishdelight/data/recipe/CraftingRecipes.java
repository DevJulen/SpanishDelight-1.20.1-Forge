package com.devjulen.spanishdelight.data.recipe;

import com.devjulen.spanishdelight.common.registry.ModItemsRegistry;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.data.recipes.SpecialRecipeBuilder;
import net.minecraft.world.item.Items;
import vectorwing.farmersdelight.common.registry.ModRecipeSerializers;
import vectorwing.farmersdelight.common.tag.ForgeTags;

import java.util.function.Consumer;

public class CraftingRecipes {
    public static void register(Consumer<FinishedRecipe> consumer) {
        recipesCraftedMeals(consumer);
        SpecialRecipeBuilder.special(ModRecipeSerializers.FOOD_SERVING.get()).save(consumer, "food_serving");
    }

    private static void recipesCraftedMeals(Consumer<FinishedRecipe> consumer) {
        // GAZPACHO
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItemsRegistry.GAZPACHO.get())
                .requires(vectorwing.farmersdelight.common.registry.ModItems.TOMATO.get())
                .requires(ModItemsRegistry.GARLIC.get())
                .requires(Items.WATER_BUCKET)
                .requires(Items.BREAD)
                .requires(Items.BOWL)
                .unlockedBy("has_tomato_and_garlic",
                        InventoryChangeTrigger.TriggerInstance.hasItems(vectorwing.farmersdelight.common.registry.ModItems.TOMATO.get(),
                                                                        ModItemsRegistry.GARLIC.get()))
                .save(consumer);

        // PANTUMACA
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItemsRegistry.PANTUMACA.get())
                .requires(vectorwing.farmersdelight.common.registry.ModItems.TOMATO.get())
                .requires(Items.BREAD)
                .unlockedBy("has_tomato_and_bread",
                        InventoryChangeTrigger.TriggerInstance.hasItems(vectorwing.farmersdelight.common.registry.ModItems.TOMATO.get(), Items.BREAD))
                .save(consumer);
    }
}
