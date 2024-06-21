package com.devjulen.spanishdelight.data.recipe;

import com.devjulen.spanishdelight.common.registry.ModItemsRegistry;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import vectorwing.farmersdelight.common.tag.ForgeTags;
import vectorwing.farmersdelight.data.builder.CuttingBoardRecipeBuilder;

import java.util.function.Consumer;

public class CuttingRecipes {
    public static void register(Consumer<FinishedRecipe> consumer) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(Items.POTATO), Ingredient.of(ForgeTags.TOOLS_KNIVES), ModItemsRegistry.SLICED_POTATO.get(), 3)
                .build(consumer);

        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(vectorwing.farmersdelight.common.registry.ModItems.ONION.get()), Ingredient.of(ForgeTags.TOOLS_KNIVES), ModItemsRegistry.SLICED_ONION.get(), 3)
                .build(consumer);

        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(ModItemsRegistry.RED_PEPPER.get()), Ingredient.of(ForgeTags.TOOLS_KNIVES), ModItemsRegistry.PAPRIKA.get(), 3)
                .build(consumer);
    }
}
