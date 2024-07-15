package com.devjulen.spanishdelight.common;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.food.Foods;
import vectorwing.farmersdelight.common.FoodValues;
import vectorwing.farmersdelight.common.registry.ModEffects;

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

    public static final FoodProperties SQUID_RING = new FoodProperties.Builder()
            .nutrition(1).saturationMod(0.1f).fast().build();

    // New recipes
    public static final FoodProperties SPANISH_TORTILLA = new FoodProperties.Builder()
            .nutrition(7).saturationMod(0.8f).effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), LONG_DURATION, 0), 1.0F).build();

    public static final FoodProperties PAELLA = new FoodProperties.Builder()
            .nutrition(8).saturationMod(0.8f).effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), LONG_DURATION, 0), 1.0F).build();

    public static final FoodProperties PIL_PIL_COD = new FoodProperties.Builder()
            .nutrition(8).saturationMod(0.7f).effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), LONG_DURATION, 0), 1.0F).build();

    public static final FoodProperties CROQUETTES = new FoodProperties.Builder()
            .nutrition(6).saturationMod(0.6f).effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), SHORT_DURATION, 0), 1.0F).build();

    public static final FoodProperties BRAVA_POTATOES = new FoodProperties.Builder()
            .nutrition(6).saturationMod(0.6f).effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), MEDIUM_DURATION, 0), 1.0F).build();

    public static final FoodProperties CHURRO = new FoodProperties.Builder()
            .nutrition(5).saturationMod(0.6f).effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), SHORT_DURATION, 0), 1.0F).build();

    public static final FoodProperties GAZPACHO = new FoodProperties.Builder()
            .nutrition(6).saturationMod(0.7f).effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), SHORT_DURATION, 0), 1.0F).build();

    public static final FoodProperties PANTUMACA = new FoodProperties.Builder()
            .nutrition(6).saturationMod(0.7f).effect(() -> new MobEffectInstance(ModEffects.NOURISHMENT.get(), MEDIUM_DURATION, 0), 1.0F).build();

    public static final FoodProperties FRIED_SQUID_RING = new FoodProperties.Builder()
            .nutrition(6).saturationMod(0.5f).effect(() -> new MobEffectInstance(ModEffects.COMFORT.get(), SHORT_DURATION, 0), 1.0F).build();
}
