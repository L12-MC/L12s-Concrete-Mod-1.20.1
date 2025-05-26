package net.l12.l12concrete.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.l12.l12concrete.L12sConcreteMod;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block REALISTIC_CONCRETE = registerBlock("realistic_concrete", new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block POLISHED_CONCRETE = registerBlock("polished_concrete", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)));
    public static final Block DARK_POLISHED_CONCRETE = registerBlock("dark_polished_concrete", new Block(FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE)));
    public static final Block TILED_CONCRETE = registerBlock("tiled_concrete", new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block LIGHT_GRAY_REALISTIC_CONCRETE = registerBlock("light_gray_realistic_concrete", new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_CONCRETE)));
    public static final Block GRAY_REALISTIC_CONCRETE = registerBlock("gray_realistic_concrete", new Block(FabricBlockSettings.copyOf(Blocks.GRAY_CONCRETE)));
    public static final Block BLACK_REALISTIC_CONCRETE = registerBlock("black_realistic_concrete", new Block(FabricBlockSettings.copyOf(Blocks.BLACK_CONCRETE)));
    public static final Block BROWN_REALISTIC_CONCRETE = registerBlock("brown_realistic_concrete", new Block(FabricBlockSettings.copyOf(Blocks.BROWN_CONCRETE)));
    public static final Block RED_REALISTIC_CONCRETE = registerBlock("red_realistic_concrete", new Block(FabricBlockSettings.copyOf(Blocks.RED_CONCRETE)));
    public static final Block ORANGE_REALISTIC_CONCRETE = registerBlock("orange_realistic_concrete", new Block(FabricBlockSettings.copyOf(Blocks.ORANGE_CONCRETE)));
    public static final Block YELLOW_REALISTIC_CONCRETE = registerBlock("yellow_realistic_concrete", new Block(FabricBlockSettings.copyOf(Blocks.YELLOW_CONCRETE)));
    public static final Block LIME_REALISTIC_CONCRETE = registerBlock("lime_realistic_concrete", new Block(FabricBlockSettings.copyOf(Blocks.LIME_CONCRETE)));
    public static final Block GREEN_REALISTIC_CONCRETE = registerBlock("green_realistic_concrete", new Block(FabricBlockSettings.copyOf(Blocks.GREEN_CONCRETE)));
    public static final Block CYAN_REALISTIC_CONCRETE = registerBlock("cyan_realistic_concrete", new Block(FabricBlockSettings.copyOf(Blocks.CYAN_CONCRETE)));
    public static final Block LIGHT_BLUE_REALISTIC_CONCRETE = registerBlock("light_blue_realistic_concrete", new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_CONCRETE)));
    public static final Block BLUE_REALISTIC_CONCRETE = registerBlock("blue_realistic_concrete", new Block(FabricBlockSettings.copyOf(Blocks.BLUE_CONCRETE)));
    public static final Block PURPLE_REALISTIC_CONCRETE = registerBlock("purple_realistic_concrete", new Block(FabricBlockSettings.copyOf(Blocks.PURPLE_CONCRETE)));
    public static final Block MAGENTA_REALISTIC_CONCRETE = registerBlock("magenta_realistic_concrete", new Block(FabricBlockSettings.copyOf(Blocks.MAGENTA_CONCRETE)));
    public static final Block PINK_REALISTIC_CONCRETE = registerBlock("pink_realistic_concrete", new Block(FabricBlockSettings.copyOf(Blocks.PINK_CONCRETE)));
    public static final Block WHITE_REALISTIC_CONCRETE = registerBlock("white_realistic_concrete", new Block(FabricBlockSettings.copyOf(Blocks.WHITE_CONCRETE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        L12sConcreteMod.LOGGER.info("Registering block: " + name);
        return Registry.register(Registries.BLOCK, new Identifier(L12sConcreteMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(L12sConcreteMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        L12sConcreteMod.LOGGER.info("L12concrete: Registered Mod Blocks...");
    }
}
