package com.devjulen.spanishdelight.common;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Blocks;
import vectorwing.farmersdelight.common.FoodValues;

public class SDFoodValues {
    // Durations for the effects
    public static final int BRIEF_DURATION = 600;    // 30 seconds
    public static final int SHORT_DURATION = 1200;    // 1 minute
    public static final int MEDIUM_DURATION = 3600;    // 3 minutes
    public static final int LONG_DURATION = 6000;    // 5 minutes

    // Basic ingredients that can be eaten
    public static final FoodProperties SLICED_POTATO = new FoodProperties.Builder()
            .nutrition(Foods.POTATO.getNutrition()).saturationMod(Foods.POTATO.getSaturationModifier()).fast().build();

    public static final FoodProperties SLICED_ONION = new FoodProperties.Builder()
            .nutrition(FoodValues.ONION.getNutrition()).saturationMod(FoodValues.ONION.getSaturationModifier()).fast().build();

    public static final FoodProperties GARLIC = new FoodProperties.Builder()
            .nutrition(1).saturationMod(0.2f).fast().build();

    public static final FoodProperties GREEN_BEAN = new FoodProperties.Builder()
            .nutrition(1).saturationMod(0.2f).fast().build();

    public static final FoodProperties RED_PEPPER = new FoodProperties.Builder()
            .nutrition(3).saturationMod(0.3f).build();

    public static final FoodProperties GREEN_PEPPER = new FoodProperties.Builder()
            .nutrition(3).saturationMod(0.3f).build();

    public static final FoodProperties SQUID_RINGS = new FoodProperties.Builder()
            .nutrition(1).saturationMod(0.1f).fast().build();
}
