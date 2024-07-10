package com.devjulen.spanishdelight.common.world;

import com.devjulen.spanishdelight.SpanishDelight;
import com.devjulen.spanishdelight.common.registry.ModBlocksRegistry;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

public class SDConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_GARLIC_KEY = registerKey("wild_garlic");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_RED_PEPPER_KEY = registerKey("wild_red_pepper");
    public static final ResourceKey<ConfiguredFeature<?, ?>> WILD_GREEN_PEPPER_KEY = registerKey("wild_green_pepper");

    public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        register(context, WILD_GARLIC_KEY, Feature.FLOWER, new RandomPatchConfiguration(8, 1, 1, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                        new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocksRegistry.WILD_GARLIC.get())))));

        register(context, WILD_RED_PEPPER_KEY, Feature.FLOWER, new RandomPatchConfiguration(8, 1, 1, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocksRegistry.WILD_RED_PEPPER.get())))));

        register(context, WILD_GREEN_PEPPER_KEY, Feature.FLOWER, new RandomPatchConfiguration(8, 1, 1, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocksRegistry.WILD_GREEN_PEPPER.get())))));
    }

    private static ResourceKey<ConfiguredFeature<?,?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(SpanishDelight.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
