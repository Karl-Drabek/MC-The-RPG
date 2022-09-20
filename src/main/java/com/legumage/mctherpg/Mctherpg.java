package com.legumage.mctherpg;

import com.legumage.mctherpg.block.ModBlocks;
import com.legumage.mctherpg.item.ModItems;
import com.legumage.mctherpg.registries.ModRegistries;
import com.legumage.mctherpg.util.ModLootTableModifiers;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mctherpg implements ModInitializer {

    public static final String MOD_ID = "mctherpg";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModRegistries.registerModFuels();
        ModRegistries.registerStrippables();
        ModLootTableModifiers.ModifyLootTables();
        }
// https://crafting.thedestruc7i0n.ca/
// https://misode.github.io/loot-table/
// https://misode.github.io/advancement/
}
