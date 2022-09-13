package com.legumage.mctherpg.item;

import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    FLINT(1, 96, 3.0F, 0.0F, 35, () -> {
        return Ingredient.ofItems(Items.FLINT);
    }),
    AERIALITE(4, 2048, 10F, 0.0F, 7, () -> {
        return Ingredient.ofItems(ModItems.AERIALITE_INGOT);
    }),
    BRONZE(3, 768, 7F, 0.0F, 20, () -> {
        return Ingredient.ofItems(ModItems.BRONZE_INGOT);
    }),
    COPPER(2, 192, 5F, 0.0F, 25 , () -> {
        return Ingredient.ofItems(Items.COPPER_INGOT);
    }),
    STEEL(2, 512, 7F, 0.0F, 15 , () -> {
        return Ingredient.ofItems(ModItems.STEEL_INGOT);
    }),
    OBSIDIAN(4, 1536, 9F, 0.0F, 12 , () -> {
        return Ingredient.ofItems(Items.OBSIDIAN);
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