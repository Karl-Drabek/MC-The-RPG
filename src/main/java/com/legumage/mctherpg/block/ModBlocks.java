package com.legumage.mctherpg.block;


import com.legumage.mctherpg.Mctherpg;
import com.legumage.mctherpg.block.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;

import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block WEATHERED_JETSAM = registerBlock("weathered_jetsam",
            new Block(FabricBlockSettings.of(Material.METAL)
                    .strength(30, 1200).requiresTool()));
    public static final Block PLATINUM_ORE = registerBlock("platinum_ore",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(2.5f, 2.5f).requiresTool()));
    public static final Block DEEPSLATE_PLATINUM_ORE = registerBlock("deepslate_platinum_ore",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(2.5f, 2.5f).requiresTool()));
    public static final Block PLATINUM_BLOCK = registerBlock("platinum_block",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(3f, 3f).requiresTool()));
    public static final Block AERIALITE_BLOCK = registerBlock("aerialite_block",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(45f, 1200f).requiresTool()));
    public static final Block TIN_ORE = registerBlock("tin_ore",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(2.5f, 2.5f).requiresTool()));
    public static final Block DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(2.5f, 2.5f).requiresTool()));
    public static final Block BRONZE_BLOCK = registerBlock("bronze_block",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(2.5f, 2.5f).requiresTool()));
    public static final Block STEEL_BLOCK = registerBlock("steel_block",
            new Block(FabricBlockSettings.of(Material.STONE)
                    .strength(2.5f, 2.5f).requiresTool()));


    public static final Block REDWOOD_LOG = registerBlock("redwood_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)));
    public static final Block REDWOOD_WOOD = registerBlock("redwood_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_REDWOOD_LOG = registerBlock("stripped_redwood_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_REDWOOD_WOOD = registerBlock("stripped_redwood_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block REDWOOD_PLANKS = registerBlock("redwood_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block REDWOOD_LEAVES = registerBlock("redwood_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)));
        public static final Block REDWOOD_FENCE = registerBlock("redwood_fence",
            new FenceBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block REDWOOD_FENCE_GATE = registerBlock("redwood_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block REDWOOD_STAIRS = registerBlock("redwood_stairs",
            new ModStairsBlock(ModBlocks.REDWOOD_PLANKS.getDefaultState(), FabricBlockSettings.of(Material.STONE)));
    public static final Block REDWOOD_SLAB = registerBlock("redwood_slab",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block REDWOOD_BUTTON = registerBlock("redwood_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block REDWOOD_PRESSURE_PLATE = registerBlock("redwood_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.WOOD)));
    public static final Block REDWOOD_DOOR = registerBlock("redwood_door",
            new ModDoorBlock( FabricBlockSettings.of(Material.WOOD).nonOpaque()));
    public static final Block REDWOOD_TRAPDOOR = registerBlock("redwood_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque()));

    public static final Block BANANA_TREE_LOG = registerBlock("banana_tree_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG)));
    public static final Block BANANA_TREE_WOOD = registerBlock("banana_tree_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD)));
    public static final Block STRIPPED_BANANA_TREE_LOG = registerBlock("stripped_banana_tree_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final Block STRIPPED_BANANA_TREE_WOOD = registerBlock("stripped_banana_tree_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block BANANA_TREE_PLANKS = registerBlock("banana_tree_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)));
    public static final Block BANANA_TREE_LEAVES = registerBlock("banana_tree_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES)));
    public static final Block BANANA_TREE_FENCE = registerBlock("banana_tree_fence",
            new FenceBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block BANANA_TREE_FENCE_GATE = registerBlock("banana_tree_fence_gate",
            new FenceGateBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block BANANA_TREE_STAIRS = registerBlock("banana_tree_stairs",
            new ModStairsBlock(ModBlocks.BANANA_TREE_PLANKS.getDefaultState(), FabricBlockSettings.of(Material.STONE)));
    public static final Block BANANA_TREE_SLAB = registerBlock("banana_tree_slab",
            new SlabBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block BANANA_TREE_BUTTON = registerBlock("banana_tree_button",
            new ModStoneButtonBlock(FabricBlockSettings.of(Material.WOOD)));
    public static final Block BANANA_TREE_PRESSURE_PLATE = registerBlock("banana_tree_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.of(Material.WOOD)));
    public static final Block BANANA_TREE_DOOR = registerBlock("banana_tree_door",
            new ModDoorBlock( FabricBlockSettings.of(Material.WOOD).nonOpaque()));
    public static final Block BANANA_TREE_TRAPDOOR = registerBlock("banana_tree_trapdoor",
            new ModTrapdoorBlock(FabricBlockSettings.of(Material.WOOD).nonOpaque()));

    //registers blocks
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(Mctherpg.MOD_ID, name), block);
    }
    private static Block registerBlockWithoutBlockItem(String name, Block block){
        return Registry.register(Registry.BLOCK, new Identifier(Mctherpg.MOD_ID, name), block);
    }
    //registers block items
    private static Item registerBlockItem(String name, Block block){
        return Registry.register(Registry.ITEM, new Identifier(Mctherpg.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    }
    public static void registerModBlocks(){
System.out.println("Registering ModBlocks for" + Mctherpg.MOD_ID);
    }

}
