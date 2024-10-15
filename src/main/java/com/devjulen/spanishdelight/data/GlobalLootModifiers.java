package com.devjulen.spanishdelight.data;

import com.devjulen.spanishdelight.SpanishDelight;
import com.devjulen.spanishdelight.common.registry.ModItemsRegistry;
import com.devjulen.spanishdelight.data.modifier.AddItemModifier;
import net.minecraft.advancements.critereon.*;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.*;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import vectorwing.farmersdelight.common.tag.ModTags;

public class GlobalLootModifiers extends GlobalLootModifierProvider {
    public GlobalLootModifiers(PackOutput output) {
        super(output, SpanishDelight.MOD_ID);
    }

    EnchantmentPredicate[] pEnchantments = new EnchantmentPredicate[0];
    EnchantmentPredicate[] pStoredEnchantments = new EnchantmentPredicate[0];

    @Override
    protected void start() {
        // Squid ring added to the regular squid
        add("squid_ring_from_squid", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/squid")).build(),
                LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.KILLER,
                        new EntityPredicate.Builder().equipment(
                                new EntityEquipmentPredicate(ItemPredicate.ANY,
                                        ItemPredicate.ANY,
                                        ItemPredicate.ANY,
                                        ItemPredicate.ANY,
                                        new ItemPredicate(ModTags.KNIVES,
                                                null,
                                                MinMaxBounds.Ints.ANY,
                                                MinMaxBounds.Ints.ANY,
                                                pEnchantments,
                                                pStoredEnchantments,
                                                null,
                                                NbtPredicate.ANY),
                                        ItemPredicate.ANY))).build(),
        },
                ModItemsRegistry.SQUID_RING.get()));

        // Squid ring added to the glowing squid
        add("squid_ring_from_glowing_squid", new AddItemModifier(new LootItemCondition[]{
                new LootTableIdCondition.Builder(new ResourceLocation("entities/glow_squid")).build(),
                LootItemEntityPropertyCondition.hasProperties(LootContext.EntityTarget.KILLER,
                        new EntityPredicate.Builder().equipment(
                                new EntityEquipmentPredicate(ItemPredicate.ANY,
                                        ItemPredicate.ANY,
                                        ItemPredicate.ANY,
                                        ItemPredicate.ANY,
                                        new ItemPredicate(ModTags.KNIVES,
                                                null,
                                                MinMaxBounds.Ints.ANY,
                                                MinMaxBounds.Ints.ANY,
                                                pEnchantments,
                                                pStoredEnchantments,
                                                null,
                                                NbtPredicate.ANY),
                                        ItemPredicate.ANY))).build(),
        },
                ModItemsRegistry.SQUID_RING.get()));
    }


}
