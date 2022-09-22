package net.legumage.mctherpg.item;

import com.legumage.mctherpg.item.ModItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;

import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;

import java.util.function.Supplier;

public enum ModArmorMaterial implements ArmorMaterial {
    LEATHER("leather", 5, new int[]{1, 2, 4, 1}, 50, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.0f, 0.0f, () -> Ingredient.ofItems(Items.LEATHER)),
    COPPER("copper", 10, new int[]{2, 3, 4, 1}, 45, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0F, 0.0F, () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    CHAIN("chainmail", 15, new int[]{2, 3, 5, 2}, 40, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 1.0f, 0.0f, () -> Ingredient.ofItems(Items.CHAIN)),
    IRON("iron", 20, new int[]{2, 4, 6, 2}, 35, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 1.0f, 0.0f, () -> Ingredient.ofItems(Items.IRON_INGOT)),
    STEEL("steel", 25, new int[]{2, 5, 7, 2}, 25, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F, 0.0F, () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    BRONZE("bronze", 30, new int[]{3, 5, 7, 3}, 30, SoundEvents.ITEM_ARMOR_EQUIP_IRON,2.0F, 0.0F, () -> Ingredient.ofItems(ModItems.BRONZE_INGOT)),
    DIAMOND("diamond", 35, new int[]{3, 6, 8, 3}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0f, 0.0f, () -> Ingredient.ofItems(Items.DIAMOND)),
    TURTLE("turtle", 30, new int[]{2, 4, 6, 2}, 30, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 2.0f, 0.0f, () -> Ingredient.ofItems(Items.SCUTE)),
    NETHERITE("netherite", 40, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 4.0f, 0.2f, () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),
    DRAGON_SCALE("dragon_scale", 40, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 4.0F, 0.0F, () -> Ingredient.ofItems(ModItems.DRAGON_SCALE)),
    AERIALITE("aerialite", 40, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 4.0F, 0.0F, () -> Ingredient.ofItems(ModItems.AERIALITE_INGOT));

    private static final int[] BASE_DURABILITY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredientSupplier;

    private ModArmorMaterial(String name, int durabilityMultiplier, int[] protectionAmounts,
                             int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy(repairIngredientSupplier);
    }

    public int getDurability(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * this.durabilityMultiplier;
    }

    public int getProtectionAmount(EquipmentSlot slot) {
        return this.protectionAmounts[slot.getEntitySlotId()];
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredientSupplier.get();
    }

    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}