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

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(L12sConcreteMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(L12sConcreteMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        L12sConcreteMod.LOGGER.info("L12concrete: Registering Mod Blocks");
    }
}
