package com.devjulen.spanishdelight.data.recipe;

import com.devjulen.spanishdelight.common.registry.ModItemsRegistry;
import com.devjulen.spanishdelight.common.tag.ForgeTags;
import com.devjulen.spanishdelight.common.tag.SDModTags;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.Items;
import vectorwing.farmersdelight.client.recipebook.CookingPotRecipeBookTab;
import vectorwing.farmersdelight.data.builder.CookingPotRecipeBuilder;

import java.util.function.Consumer;

public class CookingRecipes {
    public static final int FAST_COOKING = 100;      // 5 seconds
    public static final int NORMAL_COOKING = 200;    // 10 seconds
    public static final int SLOW_COOKING = 400;      // 20 seconds

    public static final float SMALL_EXP = 0.35F;
    public static final float MEDIUM_EXP = 1.0F;
    public static final float LARGE_EXP = 2.0F;

    public static void register(Consumer<FinishedRecipe> consumer) {
        cookMeals(consumer);
    }

    private static void cookMeals(Consumer<FinishedRecipe> consumer) {
        // TORTILLA
        CookingPotRecipeBuilder.cookingPotRecipe(ModItemsRegistry.SPANISH_TORTILLA.get(), 1, FAST_COOKING, LARGE_EXP)
                .addIngredient(ModItemsRegistry.SLICED_POTATO.get())
                .addIngredient(ModItemsRegistry.SLICED_ONION.get())
                .addIngredient(Items.EGG)
                .addIngredient(Items.EGG)
                .addIngredient(Items.EGG)
                .addIngredient(Items.EGG)
                .unlockedByAnyIngredient(ModItemsRegistry.SLICED_POTATO.get(), ModItemsRegistry.SLICED_ONION.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer);

        // PAELLA
        CookingPotRecipeBuilder.cookingPotRecipe(ModItemsRegistry.PAELLA.get(), 1, SLOW_COOKING, LARGE_EXP, Items.BOWL)
                .addIngredient(Items.RABBIT)
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.CHICKEN_CUTS.get())
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.RICE.get())
                .addIngredient(ModItemsRegistry.PAPRIKA.get())
                .addIngredient(ModItemsRegistry.GREEN_BEAN.get())
                .addIngredient(ModItemsRegistry.GARLIC.get())
                .unlockedByAnyIngredient(ModItemsRegistry.PAPRIKA.get(), ModItemsRegistry.GREEN_BEAN.get(), ModItemsRegistry.GARLIC.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .build(consumer);

        // PIL PIL COD
        CookingPotRecipeBuilder.cookingPotRecipe(ModItemsRegistry.PIL_PIL_COD.get(), 1, SLOW_COOKING, LARGE_EXP, Items.BOWL)
                .addIngredient(ModItemsRegistry.GREEN_PEPPER.get())
                .addIngredient(Items.COD)
                .addIngredient(ModItemsRegistry.SLICED_POTATO.get())
                .addIngredient(ModItemsRegistry.GARLIC.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .unlockedByAnyIngredient(ModItemsRegistry.SLICED_POTATO.get(), ModItemsRegistry.GREEN_PEPPER.get(), ModItemsRegistry.GARLIC.get())
                .build(consumer);

        // CROQUETTES
        CookingPotRecipeBuilder.cookingPotRecipe(ModItemsRegistry.CROQUETTES.get(), 1, NORMAL_COOKING, MEDIUM_EXP)
                .addIngredient(vectorwing.farmersdelight.common.registry.ModItems.HAM.get())
                .addIngredient(SDModTags.MILK_INGREDIENT)
                .addIngredient(ForgeTags.WHEAT)
                .addIngredient(ForgeTags.EGG)
                .addIngredient(Items.BREAD)
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .unlockedByAnyIngredient(vectorwing.farmersdelight.common.registry.ModItems.HAM.get())
                .build(consumer);

        // BRAVAS
        CookingPotRecipeBuilder.cookingPotRecipe(ModItemsRegistry.BRAVA_POTATOES.get(), 1, NORMAL_COOKING, MEDIUM_EXP, Items.BOWL)
                .addIngredient(ModItemsRegistry.SLICED_POTATO.get())
                .addIngredient(ModItemsRegistry.SLICED_POTATO.get())
                .addIngredient(ModItemsRegistry.PAPRIKA.get())
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .unlockedByAnyIngredient(ModItemsRegistry.SLICED_POTATO.get(), ModItemsRegistry.PAPRIKA.get())
                .build(consumer);

        // CHURROS
        CookingPotRecipeBuilder.cookingPotRecipe(ModItemsRegistry.CHURRO.get(), 3, NORMAL_COOKING, MEDIUM_EXP)
                .addIngredient(ForgeTags.WHEAT)
                .addIngredient(ForgeTags.EGG)
                .addIngredient(Items.SUGAR)
                .addIngredient(SDModTags.WATER_INGREDIENT)
                .setRecipeBookTab(CookingPotRecipeBookTab.MEALS)
                .unlockedByAnyIngredient(Items.SUGAR)
                .build(consumer);
    }
}
