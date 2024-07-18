package com.devjulen.spanishdelight.common.item;

import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GreenBean extends ItemNameBlockItem {

    public GreenBean(Block pBlock, Properties pProperties) {
        super(pBlock, pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        if(Screen.hasShiftDown()) {
            pTooltipComponents.add(Component.translatable("tooltip.spanishdelight.green_bean"));
        } else {
            pTooltipComponents.add(Component.translatable("tooltip.spanishdelight.press_shift").withStyle(ChatFormatting.YELLOW));
        }


        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }
}
