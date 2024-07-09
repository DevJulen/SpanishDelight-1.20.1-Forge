package com.devjulen.spanishdelight.common.tag;

import com.devjulen.spanishdelight.SpanishDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;

public class SDModTags {
    public static final TagKey<Item> WATER_INGREDIENT = modItemTag("water_ingredient");
    public static final TagKey<Item> MILK_INGREDIENT = modItemTag("water_ingredient");

    private static TagKey<Item> modItemTag(String path) {
        return ItemTags.create(new ResourceLocation(SpanishDelight.MOD_ID, path));
    }
}
