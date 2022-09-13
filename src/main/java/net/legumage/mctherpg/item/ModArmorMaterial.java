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
    DRAGON_SCALE("dragon_scale", 40, new int[]{3, 6, 8, 3}, 5, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN,
            3.0F, 0.0F, () -> {
        return Ingredient.ofItems(ModItems.DRAGON_SCALE);
    }),
    AERIALITE("aerialite", 40, new int[]{3, 6, 8, 3}, 7, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            3.0F, 0.0F, () -> {
        return Ingredient.ofItems(ModItems.AERIALITE_INGOT);
    }),
    BRONZE("bronze", 30, new int[]{3, 5, 7, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            1.0F, 0.0F, () -> {
        return Ingredient.ofItems(ModItems.BRONZE_INGOT);
    }),
    COPPER("copper", 10, new int[]{2, 3, 5, 1}, 25, SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            0.0F, 0.0F, () -> {
        return Ingredient.ofItems(Items.COPPER_INGOT);
    }),
    STEEL("steel", 30, new int[]{3, 5, 7, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            1.0F, 0.0F, () -> {
        return Ingredient.ofItems(Items.COPPER_INGOT);
    })
    ;

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