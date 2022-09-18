package com.legumage.mctherpg.item;

import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    WOOD(0, 64, 3.0F, 0.0F, 50, () -> {
        return Ingredient.fromTag(ItemTags.PLANKS);
    }),
    FLINT(0, 96, 4.0F, 1.0F, 45, () -> {
        return Ingredient.ofItems(Items.FLINT);
    }),
    STONE(1, 128, 5.0F, 1.0F, 40, () -> {
        return Ingredient.fromTag(ItemTags.PLANKS);
    }),
    COPPER(2, 192, 6.0F, 2.0F, 35 , () -> {
        return Ingredient.ofItems(Items.COPPER_INGOT);
    }),
    IRON(3, 256, 7.0F, 2.0F, 30, () -> {
        return Ingredient.ofItems(Items.IRON_INGOT);
    }),
    STEEL(4, 512, 8.0F, 3.0F, 25 , () -> {
        return Ingredient.ofItems(ModItems.STEEL_INGOT);
    }),
    BRONZE(5, 768, 9.0F, 4.0F, 20, () -> {
        return Ingredient.ofItems(ModItems.BRONZE_INGOT);
    }),
    DIAMOND(6, 1024, 10.0F, 4.0F, 15, () -> {
        return Ingredient.ofItems(ModItems.BRONZE_INGOT);
    }),
    OBSIDIAN(6, 1536, 10.0F, 4.5F, 20 , () -> {
        return Ingredient.ofItems(Items.OBSIDIAN);
    }),
    AERIALITE(7, 2048, 11.0F, 6.0F, 10, () -> {
        return Ingredient.ofItems(ModItems.AERIALITE_INGOT);
    }),
    NETHERITE(7, 2048, 11.0F, 5.0F, 10, () -> {
        return Ingredient.ofItems(Items.NETHERITE_CHESTPLATE);
    });


    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed,
                            float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}