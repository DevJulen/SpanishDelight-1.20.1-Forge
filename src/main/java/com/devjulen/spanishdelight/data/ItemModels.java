package com.devjulen.spanishdelight.data;

import com.devjulen.spanishdelight.SpanishDelight;
import com.devjulen.spanishdelight.common.registry.ModItemsRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ItemModels extends ItemModelProvider {
    public ItemModels(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, SpanishDelight.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItemsRegistry.PAPRIKA);
        simpleItem(ModItemsRegistry.SLICED_POTATO);
        simpleItem(ModItemsRegistry.SLICED_ONION);
        simpleItem(ModItemsRegistry.GARLIC);
        simpleItem(ModItemsRegistry.GREEN_BEAN);
        simpleItem(ModItemsRegistry.RED_PEPPER);
        simpleItem(ModItemsRegistry.GREEN_PEPPER);
        simpleItem(ModItemsRegistry.SQUID_RINGS);
        simpleItem(ModItemsRegistry.SPANISH_TORTILLA);
        simpleItem(ModItemsRegistry.PAELLA);
        simpleItem(ModItemsRegistry.PIL_PIL_COD);
        simpleItem(ModItemsRegistry.CROQUETTES);
        simpleItem(ModItemsRegistry.BRAVA_POTATOES);
        simpleItem(ModItemsRegistry.CHURROS);
        simpleItem(ModItemsRegistry.GAZPACHO);
        simpleItem(ModItemsRegistry.PANTUMACA);
        simpleItem(ModItemsRegistry.FRIED_SQUID_RINGS);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(SpanishDelight.MOD_ID,"item/" + item.getId().getPath()));
    }
}
