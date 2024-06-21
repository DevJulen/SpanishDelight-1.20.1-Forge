package com.devjulen.spanishdelight.data;

import com.devjulen.spanishdelight.SpanishDelight;
import com.devjulen.spanishdelight.common.tag.ForgeTags;
import com.devjulen.spanishdelight.common.tag.SDModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import vectorwing.farmersdelight.common.registry.ModItems;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class ItemTags extends ItemTagsProvider {

    public ItemTags(PackOutput output, CompletableFuture<HolderLookup.Provider> provider, CompletableFuture<TagsProvider.TagLookup<Block>> blockTagProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, provider, blockTagProvider, SpanishDelight.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.registerModTags();
        this.registerForgeTags();
        this.registerCompatibilityTags();
    }

    private void registerModTags() {
        tag(SDModTags.WATER_INGREDIENT).add(Items.WATER_BUCKET);
        tag(SDModTags.MILK_INGREDIENT).add(Items.MILK_BUCKET, vectorwing.farmersdelight.common.registry.ModItems.MILK_BOTTLE.get());
    }

    public void registerCompatibilityTags() {
        // add SD ingredients to other mod tags
    }

    private void registerForgeTags() {
        tag(ForgeTags.WHEAT).add(Items.WHEAT);
        tag(ForgeTags.EGG).add(Items.EGG);
    }
}
