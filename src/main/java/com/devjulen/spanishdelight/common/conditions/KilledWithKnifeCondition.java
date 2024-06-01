package com.devjulen.spanishdelight.common.conditions;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemConditionType;
import net.minecraft.world.level.storage.loot.predicates.LootItemConditions;

import java.util.Set;

public class KilledWithKnifeCondition implements LootItemCondition {
    static final KilledWithKnifeCondition INSTANCE = new KilledWithKnifeCondition();

    private KilledWithKnifeCondition() {
    }

    @Override
    public boolean test(LootContext lootContext) {
        return lootContext.getLevel().players().get(0).getItemInHand(InteractionHand.MAIN_HAND).equals(vectorwing.farmersdelight.common.registry.ModItems.DIAMOND_KNIFE);
    }

    public static LootItemCondition.Builder killedWithKnife() {
        return () -> {
            return INSTANCE;
        };
    }

    @Override
    public LootItemConditionType getType() {
        return LootItemConditions.ANY_OF;
    }
}
