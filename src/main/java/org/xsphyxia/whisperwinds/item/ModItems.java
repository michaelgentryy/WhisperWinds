package org.xsphyxia.whisperwinds.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.impl.itemgroup.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.xsphyxia.whisperwinds.WhisperWinds;

public class ModItems {

    // Runestones
    public static final Item RED_RUNESTONE = registerItem("red_runestone", new Item(new FabricItemSettings()));
    public static final Item BLUE_RUNESTONE = registerItem("blue_runestone", new Item(new FabricItemSettings()));
    public static final Item GREEN_RUNESTONE = registerItem("green_runestone", new Item(new FabricItemSettings()));


    // Method to register items
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(WhisperWinds.MOD_ID, name), item);
    }

    public static void registerModItems() {
        WhisperWinds.LOGGER.info("Registering Mod Items for " + WhisperWinds.MOD_ID);

        // Add Item to ItemGroups
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemToIngredientTabItemGroup);
    }

    public static void addItemToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(RED_RUNESTONE);
        entries.add(BLUE_RUNESTONE);
        entries.add(GREEN_RUNESTONE);
    }

}
