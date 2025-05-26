package net.l12.l12concrete;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.l12.l12concrete.block.ModBlocks;
import net.minecraft.item.ItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class L12sConcreteMod implements ModInitializer {
	public static final String MOD_ID = "l12_concrete";
	public static final String MOD_VER = "1.3";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
			content.add(ModBlocks.REALISTIC_CONCRETE);
			content.add(ModBlocks.POLISHED_CONCRETE);
			content.add(ModBlocks.DARK_POLISHED_CONCRETE);
			content.add(ModBlocks.TILED_CONCRETE);
			content.add(ModBlocks.LIGHT_GRAY_REALISTIC_CONCRETE);
			content.add(ModBlocks.GRAY_REALISTIC_CONCRETE);
			content.add(ModBlocks.BLACK_REALISTIC_CONCRETE);
			content.add(ModBlocks.BROWN_REALISTIC_CONCRETE);
			content.add(ModBlocks.RED_REALISTIC_CONCRETE);
			content.add(ModBlocks.ORANGE_REALISTIC_CONCRETE);
			content.add(ModBlocks.YELLOW_REALISTIC_CONCRETE);
			content.add(ModBlocks.LIME_REALISTIC_CONCRETE);
			content.add(ModBlocks.GREEN_REALISTIC_CONCRETE);
			content.add(ModBlocks.CYAN_REALISTIC_CONCRETE);
			content.add(ModBlocks.LIGHT_BLUE_REALISTIC_CONCRETE);
			content.add(ModBlocks.BLUE_REALISTIC_CONCRETE);
			content.add(ModBlocks.PURPLE_REALISTIC_CONCRETE);
			content.add(ModBlocks.MAGENTA_REALISTIC_CONCRETE);
			content.add(ModBlocks.PINK_REALISTIC_CONCRETE);
			content.add(ModBlocks.WHITE_REALISTIC_CONCRETE);
		});
		LOGGER.info(MOD_ID + ", made by L12,  " + "version: " + MOD_VER + " : Initialized Successfully!!");
		ModBlocks.registerModBlocks();

	}
}