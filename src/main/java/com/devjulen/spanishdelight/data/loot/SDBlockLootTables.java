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
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
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
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocksRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
