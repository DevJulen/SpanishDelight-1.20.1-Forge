package com.devjulen.spanishdelight.common.event;

import com.devjulen.spanishdelight.SpanishDelight;
import com.devjulen.spanishdelight.common.registry.ModItemsRegistry;
import com.devjulen.spanishdelight.common.tag.SDModTags;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.swing.text.html.HTML;
import java.util.List;

@Mod.EventBusSubscriber(modid = SpanishDelight.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if(event.getType().equals(VillagerProfession.FARMER)) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // Level 1
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModItemsRegistry.GREEN_BEAN.get(), 10),
                    10, 8, 0.02f));

            // Level 2
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(vectorwing.farmersdelight.common.registry.ModItems.TOMATO.get(), 15),
                    new ItemStack(ModItemsRegistry.GARLIC.get(), 5),
                    8, 8, 0.02f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItemsRegistry.SLICED_POTATO.get(), 24),
                    new ItemStack(ModItemsRegistry.RED_PEPPER.get(), 3),
                    8, 8, 0.02f));
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(vectorwing.farmersdelight.common.registry.ModItems.RICE.get(), 27),
                    new ItemStack(ModItemsRegistry.GREEN_PEPPER.get(), 9),
                    8, 8, 0.02f));

            // Level 3
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItemsRegistry.GAZPACHO.get(), 1),
                    new ItemStack(ModItemsRegistry.GARLIC.get(), 20),
                    8, 8, 0.02f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItemsRegistry.BRAVA_POTATOES.get(), 1),
                    new ItemStack(ModItemsRegistry.RED_PEPPER.get(), 20),
                    8, 8, 0.02f));
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(ModItemsRegistry.PIL_PIL_COD.get(), 1),
                    new ItemStack(ModItemsRegistry.GREEN_PEPPER.get(), 20),
                    8, 8, 0.02f));

            // Level 4
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModItemsRegistry.GARLIC.get(), 34),
                    6, 10, 0.15f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModItemsRegistry.RED_PEPPER.get(), 34),
                    6, 10, 0.15f));
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(ModItemsRegistry.GREEN_PEPPER.get(), 34),
                    6, 10, 0.15f));

            // Level 5
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 6),
                    new ItemStack(ModItemsRegistry.GARLIC.get(), 64),
                    1, 15, 0.02f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 6),
                    new ItemStack(ModItemsRegistry.RED_PEPPER.get(), 64),
                    1, 15, 0.02f));
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 6),
                    new ItemStack(ModItemsRegistry.GREEN_PEPPER.get(), 64),
                    1, 15, 0.02f));
        }
    }

    @SubscribeEvent
    public static void addCustomWanderingTrades(WandererTradesEvent event) {
        List<VillagerTrades.ItemListing> genericTrades = event.getGenericTrades();
        List<VillagerTrades.ItemListing> rareTrades = event.getRareTrades();

        // Generic trades
        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(ModItemsRegistry.GREEN_BEAN.get(), 32),
                new ItemStack(ModItemsRegistry.GARLIC.get(), 5),
                10, 12, 0.1f));
        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(ModItemsRegistry.GREEN_BEAN.get(), 32),
                new ItemStack(ModItemsRegistry.RED_PEPPER.get(), 5),
                10, 12, 0.1f));
        genericTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(ModItemsRegistry.GREEN_BEAN.get(), 32),
                new ItemStack(ModItemsRegistry.GREEN_PEPPER.get(), 5),
                10, 12, 0.1f));

        // Rare trades
        rareTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(ModItemsRegistry.GARLIC.get(), 64),
                new ItemStack(vectorwing.farmersdelight.common.registry.ModItems.DIAMOND_KNIFE.get(), 1),
                1, 12, 0.15f));
        rareTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(ModItemsRegistry.RED_PEPPER.get(), 64),
                new ItemStack(vectorwing.farmersdelight.common.registry.ModItems.DIAMOND_KNIFE.get(), 1),
                1, 12, 0.15f));
        rareTrades.add((pTrader, pRandom) -> new MerchantOffer(
                new ItemStack(ModItemsRegistry.GREEN_PEPPER.get(), 64),
                new ItemStack(vectorwing.farmersdelight.common.registry.ModItems.DIAMOND_KNIFE.get(), 1),
                1, 12, 0.15f));
    }
}
