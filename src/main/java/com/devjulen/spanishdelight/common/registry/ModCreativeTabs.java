package com.devjulen.spanishdelight.common.registry;

import com.devjulen.spanishdelight.SpanishDelight;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = SpanishDelight.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModCreativeTabs
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SpanishDelight.MOD_ID);

    public static final List<Supplier<? extends ItemLike>> CREATIVE_TAB_ITEMS = new ArrayList<>();

    public static final RegistryObject<CreativeModeTab> TAB_SPANISH_DELIGHT = CREATIVE_TABS.register("sdelight_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("creativetab.sdelight_tab"))
                    .icon(ModItemsRegistry.SPANISH_TORTILLA.get()::getDefaultInstance)
                    .displayItems((itemDisplayParameters, output) -> {
                        CREATIVE_TAB_ITEMS.forEach(itemLike -> output.accept(itemLike.get()));
                    })
                    .build()
    );

    public static void register(IEventBus eventBus) { CREATIVE_TABS.register(eventBus); }

    public static <T extends Item> RegistryObject<T> addToTab(RegistryObject<T> itemLike) {
        CREATIVE_TAB_ITEMS.add(itemLike);
        return itemLike;
    }
}
