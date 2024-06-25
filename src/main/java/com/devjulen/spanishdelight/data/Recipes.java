package com.devjulen.spanishdelight.data;

import com.devjulen.spanishdelight.data.recipe.CookingRecipes;
import com.devjulen.spanishdelight.data.recipe.CraftingRecipes;
import com.devjulen.spanishdelight.data.recipe.CuttingRecipes;
import com.devjulen.spanishdelight.data.recipe.SmeltingRecipes;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;

import java.util.function.Consumer;

public class Recipes extends RecipeProvider {
    public Recipes(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        CuttingRecipes.register(consumer);
        CraftingRecipes.register(consumer);
        CookingRecipes.register(consumer);
        SmeltingRecipes.register(consumer);
    }
}
