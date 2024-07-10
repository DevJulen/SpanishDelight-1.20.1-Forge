package com.devjulen.spanishdelight.common.world;

import com.devjulen.spanishdelight.SpanishDelight;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;
import java.util.Random;

public class SDPlacedFeatures {
    public static final ResourceKey<PlacedFeature> WILD_GARLIC_PLACED_KEY = registerKey("wild_garlic_placement");
    public static final ResourceKey<PlacedFeature> WILD_RED_PEPPER_PLACED_KEY = registerKey("wild_red_pepper_placement");
    public static final ResourceKey<PlacedFeature> WILD_GREEN_PEPPER_PLACED_KEY = registerKey("wild_green_pepper_placement");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, WILD_GARLIC_PLACED_KEY, configuredFeatures.getOrThrow(SDConfiguredFeatures.WILD_GARLIC_KEY),
                List.of(new InSquarePlacement(),
                        HeightmapPlacement.onHeightmap(Heightmap.Types.MOTION_BLOCKING),
                        BiomeFilter.biome()));

        register(context, WILD_RED_PEPPER_PLACED_KEY, configuredFeatures.getOrThrow(SDConfiguredFeatures.WILD_RED_PEPPER_KEY),
                List.of(new InSquarePlacement(),
                        HeightmapPlacement.onHeightmap(Heightmap.Types.MOTION_BLOCKING),
                        BiomeFilter.biome()));

        register(context, WILD_GREEN_PEPPER_PLACED_KEY, configuredFeatures.getOrThrow(SDConfiguredFeatures.WILD_GREEN_PEPPER_KEY),
                List.of(new InSquarePlacement(),
                        HeightmapPlacement.onHeightmap(Heightmap.Types.MOTION_BLOCKING),
                        BiomeFilter.biome()));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(SpanishDelight.MOD_ID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}
