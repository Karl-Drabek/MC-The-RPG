package com.legumage.mctherpg.registries;

import com.legumage.mctherpg.Mctherpg;
import com.legumage.mctherpg.block.ModBlocks;
import com.legumage.mctherpg.item.ModItems;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModRegistries {
    public static void registerModRegistries(){
        registerModFuels();
        registerStrippables();
        registerFlammableBlocks();

    }
    public static void registerModFuels(){
        System.out.println("Now registering Fuels for " + Mctherpg.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        //registry.add(ModItems.BANANA, 300); // ticks
    }

    public static void registerStrippables(){
        StrippableBlockRegistry.register(ModBlocks.REDWOOD_LOG, ModBlocks.STRIPPED_REDWOOD_LOG);
        StrippableBlockRegistry.register(ModBlocks.REDWOOD_WOOD, ModBlocks.STRIPPED_REDWOOD_WOOD);
        StrippableBlockRegistry.register(ModBlocks.BANANA_TREE_LOG, ModBlocks.STRIPPED_BANANA_TREE_LOG);
        StrippableBlockRegistry.register(ModBlocks.BANANA_TREE_WOOD, ModBlocks.STRIPPED_BANANA_TREE_WOOD);
    }
    public static void registerFlammableBlocks(){
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(ModBlocks.REDWOOD_LOG, 5, 5);
        instance.add(ModBlocks.STRIPPED_REDWOOD_LOG, 5, 5);
        instance.add(ModBlocks.REDWOOD_WOOD, 5, 5);
        instance.add(ModBlocks.STRIPPED_REDWOOD_WOOD, 5, 5);
        instance.add(ModBlocks.REDWOOD_PLANKS, 5, 20);
        instance.add(ModBlocks.REDWOOD_LEAVES, 30, 60);

        instance.add(ModBlocks.BANANA_TREE_LOG, 5, 5);
        instance.add(ModBlocks.STRIPPED_BANANA_TREE_LOG, 5, 5);
        instance.add(ModBlocks.BANANA_TREE_WOOD, 5, 5);
        instance.add(ModBlocks.STRIPPED_BANANA_TREE_WOOD, 5, 5);
        instance.add(ModBlocks.BANANA_TREE_PLANKS, 5, 20);
        instance.add(ModBlocks.BANANA_TREE_LEAVES, 30, 60);
    }

}
