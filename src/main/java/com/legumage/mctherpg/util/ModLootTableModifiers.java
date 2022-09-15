package com.legumage.mctherpg.util;

import com.legumage.mctherpg.item.ModItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
    private static final Identifier ENDER_DRAGON_ID
            = new Identifier("minecraft", "entities/ender_dragon");
    private static final Identifier VILLAGE_ARMORER_ID
            = new Identifier("minecraft", "entities/village/village_armorer");
    private static final Identifier VILLAGE_TOOLSMITH_ID
            = new Identifier("minecraft", "entities/village/toolsmith_armorer");
    private static final Identifier VILLAGE_WEAPONSMITH_ID
            = new Identifier("minecraft", "entities/village/weaponsmith_armorer");
    private static final Identifier MINESHAFT_ID
            = new Identifier("minecraft", "chests/abandoned_mineshaft");
    private static final Identifier ANCIENT_CITY_ID
            = new Identifier("minecraft", "chests/ancient_city");
    private static final Identifier ANCIENT_CITY_ICE_BOX_ID
            = new Identifier("minecraft", "chests/ancient_city_ice_box");
    private static final Identifier BASTION_BRIDGE_ID
            = new Identifier("minecraft", "chests/bastion_bridge");
    private static final Identifier BASTION_HOGLIN_STABLE_ID
            = new Identifier("minecraft", "chests/bastion_hoglin_stable");
    private static final Identifier BASTION_OTHER_ID
            = new Identifier("minecraft", "chests/bastion_other");
    private static final Identifier BASTOIN_TREASURE_ID
            = new Identifier("minecraft", "chests/bastion_treasure");
    private static final Identifier BURRIED_TREASURE_ID
            = new Identifier("minecraft", "chests/buried_treasure");
    private static final Identifier DESERT_PYRAMID_ID
            = new Identifier("minecraft", "chests/desert_pyramid");
    private static final Identifier END_CITY_TREASURE_ID
            = new Identifier("minecraft", "chests/end_city_treasure");
    private static final Identifier IGLOO_CHEST_ID
            = new Identifier("minecraft", "chests/igloo_chest");
    private static final Identifier JUNGLE_TEMPLE_ID
            = new Identifier("minecraft", "chests/jungle_temple");
    private static final Identifier NETHER_BRIDGE_ID
            = new Identifier("minecraft", "chests/nether_bridge");
    private static final Identifier PILLAGER_OUTPOST_ID
            = new Identifier("minecraft", "chests/pillager_outpost");
    private static final Identifier RUINED_PORTAL_ID
            = new Identifier("minecraft", "chests/ruined_portal");
    private static final Identifier SHIPWRECK_MAP_ID
            = new Identifier("minecraft", "chests/shipwreck_map");
    private static final Identifier SHIPWRECK_SUPPLY_ID
            = new Identifier("minecraft", "chests/shipwreck_supply");
    private static final Identifier SHIPWRECK_TREASURE_ID
            = new Identifier("minecraft", "chests/shipwreck_treasure");
    private static final Identifier SIMPLE_DUNGEON_ID
            = new Identifier("minecraft", "chests/simple_dungeon");
    private static final Identifier STRONGHOLD_CORRIDOR_ID
            = new Identifier("minecraft", "chests/stronghold_corridor");
    private static final Identifier STRONGHOLD_CROSSING_ID
            = new Identifier("minecraft", "chests/stronghold_crossing");
    private static final Identifier STRONGHOLD_LIBRARY_ID
            = new Identifier("minecraft", "chests/stronghold_library");
    private static final Identifier UNDERWATER_RUIN_BIG_ID
            = new Identifier("minecraft", "chests/underwater_ruin_big");
    private static final Identifier UNDERWATER_RUIN_SMALL_ID
            = new Identifier("minecraft", "chests/underwater_ruin_small");
    private static final Identifier WOODLAND_MANSION_ID
            = new Identifier("minecraft", "chests/woodland_mansion");

    public static void ModifyLootTables(){
        LootTableEvents.MODIFY.register(((resourceManager, lootManager, id, tableBuilder, source) -> {
            if(MINESHAFT_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15f))
                        .with(ItemEntry.builder(ModItems.RAW_BRONZE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 4.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }if(ENDER_DRAGON_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(32))
                        .conditionally(RandomChanceLootCondition.builder(0.5f))
                        .with(ItemEntry.builder(ModItems.DRAGON_SCALE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
        }));
    }
}
