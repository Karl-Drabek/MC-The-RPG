package com.legumage.mctherpg.registries;

import com.legumage.mctherpg.Mctherpg;
import com.legumage.mctherpg.block.ModBlocks;
import com.legumage.mctherpg.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModRegistries {
    public static void registerModFuels(){
        System.out.println("Now registering Fuels for " + Mctherpg.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.BANANA, 300); // ticks
    }

    public static void registerStrippables(){
        StrippableBlockRegistry.register(ModBlocks.REDWOOD_LOG, ModBlocks.STRIPPED_REDWOOD_LOG);
        StrippableBlockRegistry.register(ModBlocks.REDWOOD_WOOD, ModBlocks.STRIPPED_REDWOOD_WOOD);
    }

}
