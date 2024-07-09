package com.devjulen.spanishdelight.data;

import com.devjulen.spanishdelight.SpanishDelight;
import com.devjulen.spanishdelight.data.loot.SDBlockLootTables;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = SpanishDelight.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookUpProvider = event.getLookupProvider();

        generator.addProvider(event.includeClient(), new ItemModels(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new BlockStates(packOutput, existingFileHelper));
        generator.addProvider(event.includeServer(), new LootTables(packOutput, Collections.emptySet(), List.of(
                new LootTableProvider.SubProviderEntry(SDBlockLootTables::new, LootContextParamSets.BLOCK)
        )));
        generator.addProvider(event.includeServer(), new GlobalLootModifiers(packOutput));

        BlockTags blockStates = generator.addProvider(event.includeServer(), new BlockTags(packOutput, lookUpProvider, existingFileHelper));
        generator.addProvider(event.includeClient(), new ItemTags(packOutput, lookUpProvider, blockStates.contentsGetter(), existingFileHelper));

        generator.addProvider(event.includeServer(), new Recipes(packOutput));

        generator.addProvider(event.includeServer(), new WorldGen(packOutput, lookUpProvider));
    }
}
