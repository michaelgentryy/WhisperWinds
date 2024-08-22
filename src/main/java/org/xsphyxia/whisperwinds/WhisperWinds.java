package org.xsphyxia.whisperwinds;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xsphyxia.whisperwinds.item.ModItems;

public class WhisperWinds implements ModInitializer {
	public static final String MOD_ID = "whisperwinds";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		// Use the ItemGroupEvents to modify the creative inventory
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(this::removeVanillaItems);
	}

	private void removeVanillaItems(FabricItemGroupEntries entries) {

	}
}