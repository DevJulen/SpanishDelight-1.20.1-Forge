package com.devjulen.spanishdelight.data.recipe;

import com.devjulen.spanishdelight.common.registry.ModItemsRegistry;
import com.devjulen.spanishdelight.common.tag.ForgeTags;
import com.devjulen.spanishdelight.common.tag.SDModTags;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.Items;
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
        // Churro recipes
        CookingPotRecipeBuilder.cookingPotRecipe(ModItemsRegistry.CHURRO.get(), 3, NORMAL_COOKING, MEDIUM_EXP)
                .addIngredient(ForgeTags.WHEAT)
                .addIngredient(ForgeTags.EGG)
                .addIngredient(Items.SUGAR)
                .addIngredient(SDModTags.WATER_INGREDIENT)
                .build(consumer);
    }
}
