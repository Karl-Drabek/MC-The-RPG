package com.legumage.mctherpg.item;

import com.legumage.mctherpg.Mctherpg;
import com.legumage.mctherpg.block.ModBlocks;
import com.legumage.mctherpg.entity.ModEntities;
import com.legumage.mctherpg.item.custom.ModAxeItem;
import com.legumage.mctherpg.item.custom.ModHoeItem;
import com.legumage.mctherpg.item.custom.ModPickaxeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.legumage.mctherpg.item.ModArmorMaterial;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //registers items
    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(Mctherpg.MOD_ID, name), item);
    }
    //items
    public static Item MUD_BALL = registerItem("mud_ball", new Item(new FabricItemSettings()
            .group(ItemGroup.MISC))); // ModItemGroup.MATERIALS
    public static Item DRAGON_SCALE = registerItem("dragon_scale", new Item(new FabricItemSettings()
            .group(ItemGroup.MISC)));

    public static Item BANANA = registerItem("banana", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().snack().hunger(2).saturationModifier(0.2f).build())
            .group(ItemGroup.FOOD)));
    public static Item PEPPER = registerItem("pepper", new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder().snack().hunger(2).saturationModifier(0.2f).build())
            .group(ItemGroup.FOOD)));

    public static Item MUD_BRICK = registerItem("mud_brick", new Item(new FabricItemSettings()
            .group(ItemGroup.MISC)));


    public static Item FLINT_DAGGER = registerItem("flint_dagger",
            new SwordItem(ModToolMaterial.FLINT, 2, -1.6f, new FabricItemSettings()
            .group(ItemGroup.TOOLS)));
    public static Item FLINT_HATCHET = registerItem("flint_hatchet",
            new ModAxeItem(ModToolMaterial.FLINT, 3f, -2.6f, new FabricItemSettings()
            .group(ItemGroup.TOOLS)));

    public static Item SCALEMAIL_HELMET = registerItem("scalemail_helmet",
            new ArmorItem(ModArmorMaterial.DRAGON_SCALE, EquipmentSlot.HEAD, new FabricItemSettings()
                    .group(ItemGroup.COMBAT)));
    public static Item SCALEMAIL_CHESTPLATE = registerItem("scalemail_chestplate",
            new ArmorItem(ModArmorMaterial.DRAGON_SCALE, EquipmentSlot.CHEST, new FabricItemSettings()
                    .group(ItemGroup.COMBAT)));
    public static Item SCALEMAIL_LEGGINGS = registerItem("scalemail_leggings",
            new ArmorItem(ModArmorMaterial.DRAGON_SCALE, EquipmentSlot.LEGS, new FabricItemSettings()
                    .group(ItemGroup.COMBAT)));
    public static Item SCALEMAIL_BOOTS = registerItem("scalemail_boots",
            new ArmorItem(ModArmorMaterial.DRAGON_SCALE, EquipmentSlot.FEET, new FabricItemSettings()
                    .group(ItemGroup.COMBAT)));
    public static Item NETHERITE_HORSE_ARMOR = registerItem("netherite_horse_armor",
            new HorseArmorItem(20, "netherite", new FabricItemSettings()
                    .group(ItemGroup.COMBAT)));

    public static Item AERIALITE_HELMET = registerItem("aerialite_helmet",
            new ArmorItem(ModArmorMaterial.AERIALITE, EquipmentSlot.HEAD, new FabricItemSettings()
                    .group(ItemGroup.COMBAT)));
    public static Item AERIALITE_CHESTPLATE = registerItem("aerialite_chestplate",
            new ArmorItem(ModArmorMaterial.AERIALITE, EquipmentSlot.CHEST, new FabricItemSettings()
                    .group(ItemGroup.COMBAT)));
    public static Item AERIALITE_LEGGINGS = registerItem("aerialite_leggings",
            new ArmorItem(ModArmorMaterial.AERIALITE, EquipmentSlot.LEGS, new FabricItemSettings()
                    .group(ItemGroup.COMBAT)));
    public static Item AERIALITE_BOOTS = registerItem("aerialite_boots",
            new ArmorItem(ModArmorMaterial.AERIALITE, EquipmentSlot.FEET, new FabricItemSettings()
                    .group(ItemGroup.COMBAT)));
    public static Item AERIALITE_HORSE_ARMOR = registerItem("aerialite_horse_armor",
            new HorseArmorItem(20, "aerialite", new FabricItemSettings()
                    .group(ItemGroup.COMBAT)));
    public static Item AERIALITE_SWORD = registerItem("aerialite_sword",
            new SwordItem(ModToolMaterial.AERIALITE, 9, -2.4f, new FabricItemSettings()
                    .group(ItemGroup.COMBAT)));
    public static Item AERIALITE_AXE = registerItem("aerialite_axe",
            new ModAxeItem(ModToolMaterial.AERIALITE, 12, -3f, new FabricItemSettings()
                    .group(ItemGroup.TOOLS)));
    public static Item AERIALITE_HOE = registerItem("aerialite_hoe",
            new ModHoeItem(ModToolMaterial.AERIALITE, 0, -3f, new FabricItemSettings()
                    .group(ItemGroup.TOOLS)));
    public static Item AERIALITE_SHOVEL= registerItem("aerialite_shovel",
            new ShovelItem(ModToolMaterial.AERIALITE, 0, -3f, new FabricItemSettings()
                    .group(ItemGroup.TOOLS)));
    public static Item AERIALITE_PICKAXE= registerItem("aerialite_pickaxe",
            new ModPickaxeItem(ModToolMaterial.AERIALITE, 0, -3f, new FabricItemSettings()
                    .group(ItemGroup.TOOLS)));
    public static Item AERIALITE_BOW= registerItem("aerialite_bow",
            new BowItem(new FabricItemSettings()
                    .group(ItemGroup.COMBAT).maxDamage(640)));

    public static Item REFINED_AERIALITE = registerItem("refined_aerialite", new Item(new FabricItemSettings()
            .group(ItemGroup.MISC)));
    public static Item AERIALITE_INGOT = registerItem("aerialite_ingot", new Item(new FabricItemSettings()
            .group(ItemGroup.MISC)));
    public static Item PLATINUM_NUGGET = registerItem("platinum_nugget", new Item(new FabricItemSettings()
            .group(ItemGroup.MISC)));
    public static Item PLATINUM_INGOT = registerItem("platinum_ingot", new Item(new FabricItemSettings()
            .group(ItemGroup.MISC)));
    public static Item RAW_PLATINUM = registerItem("raw_platinum", new Item(new FabricItemSettings()
            .group(ItemGroup.MISC)));

    public static Item RAW_TIN = registerItem("raw_tin", new Item(new FabricItemSettings()
            .group(ItemGroup.MISC)));
    public static Item RAW_BRONZE = registerItem("raw_bronze", new Item(new FabricItemSettings()
            .group(ItemGroup.MISC)));
    public static Item BRONZE_INGOT = registerItem("bronze_ingot", new Item(new FabricItemSettings()
            .group(ItemGroup.MISC)));

    public static Item BRONZE_SWORD = registerItem("bronze_sword",
            new SwordItem(ModToolMaterial.BRONZE, 7, -2.4f, new FabricItemSettings()
                    .group(ItemGroup.COMBAT)));
    public static Item BRONZE_AXE = registerItem("bronze_axe",
            new ModAxeItem(ModToolMaterial.BRONZE, 9f, -3f, new FabricItemSettings()
                    .group(ItemGroup.TOOLS)));
    public static Item BRONZE_HOE = registerItem("bronze_hoe",
            new ModHoeItem(ModToolMaterial.BRONZE, 0, -3f, new FabricItemSettings()
                    .group(ItemGroup.TOOLS)));
    public static Item BRONZE_SHOVEL= registerItem("bronze_shovel",
            new ShovelItem(ModToolMaterial.BRONZE, 0, -3f, new FabricItemSettings()
                    .group(ItemGroup.TOOLS)));
    public static Item BRONZE_PICKAXE= registerItem("bronze_pickaxe",
            new ModPickaxeItem(ModToolMaterial.BRONZE, 0, -3f, new FabricItemSettings()
                    .group(ItemGroup.TOOLS)));
    public static Item BRONZE_HELMET = registerItem("bronze_helmet",
            new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlot.HEAD, new FabricItemSettings()
                    .group(ItemGroup.COMBAT)));
    public static Item BRONZE_CHESTPLATE = registerItem("bronze_chestplate",
            new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlot.CHEST, new FabricItemSettings()
                    .group(ItemGroup.COMBAT)));
    public static Item BRONZE_LEGGINGS = registerItem("bronze_leggings",
            new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlot.LEGS, new FabricItemSettings()
                    .group(ItemGroup.COMBAT)));
    public static Item BRONZE_BOOTS = registerItem("bronze_boots",
            new ArmorItem(ModArmorMaterial.BRONZE, EquipmentSlot.FEET, new FabricItemSettings()
                    .group(ItemGroup.COMBAT)));

    public static Item COPPER_SWORD = registerItem("copper_sword",
            new SwordItem(ModToolMaterial.COPPER, 5, -2.4f, new FabricItemSettings()
                    .group(ItemGroup.COMBAT)));
    public static Item COPPER_AXE = registerItem("copper_axe",
            new ModAxeItem(ModToolMaterial.COPPER, 6.5f, -3f, new FabricItemSettings()
                    .group(ItemGroup.TOOLS)));
    public static Item COPPER_HOE = registerItem("copper_hoe",
            new ModHoeItem(ModToolMaterial.COPPER, 0, -3f, new FabricItemSettings()
                    .group(ItemGroup.TOOLS)));
    public static Item COPPER_SHOVEL= registerItem("copper_shovel",
            new ShovelItem(ModToolMaterial.COPPER, 0f, -3f, new FabricItemSettings()
                    .group(ItemGroup.TOOLS)));
    public static Item COPPER_PICKAXE= registerItem("copper_pickaxe",
            new ModPickaxeItem(ModToolMaterial.COPPER, 0, -3f, new FabricItemSettings()
                    .group(ItemGroup.TOOLS)));
    public static Item COPPER_HELMET = registerItem("copper_helmet",
            new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlot.HEAD, new FabricItemSettings()
                    .group(ItemGroup.COMBAT)));
    public static Item COPPER_CHESTPLATE = registerItem("copper_chestplate",
            new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlot.CHEST, new FabricItemSettings()
                    .group(ItemGroup.COMBAT)));
    public static Item COPPER_LEGGINGS = registerItem("copper_leggings",
            new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlot.LEGS, new FabricItemSettings()
                    .group(ItemGroup.COMBAT)));
    public static Item COPPER_BOOTS = registerItem("copper_boots",
            new ArmorItem(ModArmorMaterial.COPPER, EquipmentSlot.FEET, new FabricItemSettings()
                    .group(ItemGroup.COMBAT)));

    public static Item STEEL_SWORD = registerItem("steel_sword",
            new SwordItem(ModToolMaterial.STEEL, 7, -2.4f, new FabricItemSettings()
                    .group(ItemGroup.COMBAT)));
    public static Item STEEL_AXE = registerItem("steel_axe",
            new ModAxeItem(ModToolMaterial.STEEL, 9f, -3f, new FabricItemSettings()
                    .group(ItemGroup.TOOLS)));
    public static Item STEEL_HOE = registerItem("steel_hoe",
            new ModHoeItem(ModToolMaterial.STEEL, 0, -3f, new FabricItemSettings()
                    .group(ItemGroup.TOOLS)));
    public static Item STEEL_SHOVEL= registerItem("steel_shovel",
            new ShovelItem(ModToolMaterial.STEEL, 0f, -3f, new FabricItemSettings()
                    .group(ItemGroup.TOOLS)));
    public static Item STEEL_PICKAXE= registerItem("steel_pickaxe",
            new ModPickaxeItem(ModToolMaterial.STEEL, 0, -3f, new FabricItemSettings()
                    .group(ItemGroup.TOOLS)));
    public static Item STEEL_HELMET = registerItem("steel_helmet",
            new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlot.HEAD, new FabricItemSettings()
                    .group(ItemGroup.COMBAT)));
    public static Item STEEL_CHESTPLATE = registerItem("steel_chestplate",
            new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlot.CHEST, new FabricItemSettings()
                    .group(ItemGroup.COMBAT)));
    public static Item STEEL_LEGGINGS = registerItem("steel_leggings",
            new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlot.LEGS, new FabricItemSettings()
                    .group(ItemGroup.COMBAT)));
    public static Item STEEL_BOOTS = registerItem("steel_boots",
            new ArmorItem(ModArmorMaterial.STEEL, EquipmentSlot.FEET, new FabricItemSettings()
                    .group(ItemGroup.COMBAT)));

    public static Item OBSIDIAN_DAGGER = registerItem("obsidian_dagger",
            new SwordItem(ModToolMaterial.FLINT, 5, -1.6f, new FabricItemSettings()
                    .group(ItemGroup.TOOLS)));
    public static Item OBSIDIAN_HATCHET = registerItem("obsidian_hatchet",
            new ModAxeItem(ModToolMaterial.FLINT, 7f, -2.6f, new FabricItemSettings()
                    .group(ItemGroup.TOOLS)));

    public static Item TEST_SPAWN_EGG = registerItem("test_spawn_egg",
            new SpawnEggItem(ModEntities.TEST, 255255255, 000000000, new FabricItemSettings()
                    .group(ItemGroup.MISC)));

    public static Item STEEL_INGOT = registerItem("steel_ingot", new Item(new FabricItemSettings()
            .group(ItemGroup.MISC)));


    public static Item PEPPER_SEEDS = registerItem("pepper_seeds", new AliasedBlockItem(ModBlocks.PEPPER_PLANT, new FabricItemSettings()
            .group(ItemGroup.MISC)));

    public static void registerModItems() {
        System.out.println("Registering Mod Items for" + Mctherpg.MOD_ID);
    }
}
