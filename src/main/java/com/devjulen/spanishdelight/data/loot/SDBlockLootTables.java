package com.devjulen.spanishdelight.data.loot;


import com.devjulen.spanishdelight.common.block.GreenBeanCropBlock;
import com.devjulen.spanishdelight.common.registry.ModBlocksRegistry;
import com.devjulen.spanishdelight.common.registry.ModItemsRegistry;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import java.util.Set;

public class SDBlockLootTables extends BlockLootSubProvider {

    public SDBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        // set that the green bean crop block should be age 5 to be able to drop something
        LootItemCondition.Builder lootItemConditionBuilder = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocksRegistry.GREEN_BEAN_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(GreenBeanCropBlock.AGE, 5));

        this.add(ModBlocksRegistry.GREEN_BEAN_CROP.get(),
                this.applyExplosionDecay(ModBlocksRegistry.GREEN_BEAN_CROP.get(), LootTable.lootTable()
                        .withPool(LootPool.lootPool().add(LootItem.lootTableItem(ModItemsRegistry.GREEN_BEAN.get())))
                        .withPool(LootPool.lootPool().when(lootItemConditionBuilder).add(LootItem.lootTableItem(ModItemsRegistry.GREEN_BEAN.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 3))))));

        this.add(ModBlocksRegistry.WILD_GARLIC.get(),
                this.applyExplosionDecay(ModBlocksRegistry.WILD_GARLIC.get(), LootTable.lootTable()
                        .withPool(LootPool.lootPool().add(LootItem.lootTableItem(ModItemsRegistry.GARLIC.get()))))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 5.0F)))
                        .withPool(LootPool.lootPool().when(lootItemConditionBuilder).add(LootItem.lootTableItem(ModItemsRegistry.GARLIC.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 3)))));

        this.add(ModBlocksRegistry.WILD_RED_PEPPER.get(),
                this.applyExplosionDecay(ModBlocksRegistry.WILD_RED_PEPPER.get(), LootTable.lootTable()
                        .withPool(LootPool.lootPool().add(LootItem.lootTableItem(ModItemsRegistry.RED_PEPPER.get()))))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 5.0F)))
                        .withPool(LootPool.lootPool().when(lootItemConditionBuilder).add(LootItem.lootTableItem(ModItemsRegistry.RED_PEPPER.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 3)))));

        this.add(ModBlocksRegistry.WILD_GREEN_PEPPER.get(),
                this.applyExplosionDecay(ModBlocksRegistry.WILD_GREEN_PEPPER.get(), LootTable.lootTable()
                        .withPool(LootPool.lootPool().add(LootItem.lootTableItem(ModItemsRegistry.GREEN_PEPPER.get()))))
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 5.0F)))
                        .withPool(LootPool.lootPool().when(lootItemConditionBuilder).add(LootItem.lootTableItem(ModItemsRegistry.GREEN_PEPPER.get()).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 3)))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocksRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
