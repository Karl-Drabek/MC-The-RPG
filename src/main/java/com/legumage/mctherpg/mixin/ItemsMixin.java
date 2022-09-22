package com.legumage.mctherpg.mixin;
import com.legumage.mctherpg.item.ModToolMaterial;
import com.legumage.mctherpg.item.custom.ModHoeItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.*;

@Mixin(Items.class)
public abstract class ItemsMixin {
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/PickaxeItem", ordinal = 0))
    private static PickaxeItem InjectWoodPickaxe(ToolMaterial tm, int i, float f, Item.Settings s){
        return new PickaxeItem(ModToolMaterial.WOOD, 1, -2.8F, (new Item.Settings()).group(ItemGroup.TOOLS));
    }
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/HoeItem", ordinal = 0))
    private static HoeItem InjectWoodHoe(ToolMaterial tm, int i, float f, Item.Settings s){
        return (HoeItem)(new ModHoeItem(ModToolMaterial.WOOD, 0, -2.0F, (new Item.Settings()).group(ItemGroup.TOOLS)));
    }
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/ShovelItem", ordinal = 0))
    private static ShovelItem InjectWoodShovel(ToolMaterial tm, float i, float f, Item.Settings s){
        return new ShovelItem(ModToolMaterial.WOOD, 0, -2.2F, (new Item.Settings()).group(ItemGroup.TOOLS));
    }
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/SwordItem", ordinal = 0))
    private static SwordItem InjectWoodSword(ToolMaterial tm, int i, float f, Item.Settings s){
        return new SwordItem(ModToolMaterial.WOOD, 2, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT));
    }
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/AxeItem", ordinal = 0))
    private static AxeItem InjectWoodAxe(ToolMaterial tm, float i, float f, Item.Settings s){
        return new AxeItem(ModToolMaterial.WOOD, 3, -3.0F, (new Item.Settings()).group(ItemGroup.COMBAT));
    }

    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/PickaxeItem", ordinal = 1))
    private static PickaxeItem InjectStonePickaxe(ToolMaterial tm, int i, float f, Item.Settings s){
        return new PickaxeItem(ModToolMaterial.STONE, 1, -2.8F, (new Item.Settings()).group(ItemGroup.TOOLS));
    }
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/HoeItem", ordinal = 1))
    private static HoeItem InjectStoneHoe(ToolMaterial tm, int i, float f, Item.Settings s){
        return (HoeItem)(new ModHoeItem(ModToolMaterial.STONE, -1, -2.0F, (new Item.Settings()).group(ItemGroup.TOOLS)));
    }
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/ShovelItem", ordinal = 1))
    private static ShovelItem InjectStoneShovel(ToolMaterial tm, float i, float f, Item.Settings s){
        return new ShovelItem(ModToolMaterial.STONE, 0, -2.2F, (new Item.Settings()).group(ItemGroup.TOOLS));
    }
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/SwordItem", ordinal = 1))
    private static SwordItem InjectStoneSword(ToolMaterial tm, int i, float f, Item.Settings s){
        return new SwordItem(ModToolMaterial.STONE, 2, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT));
    }
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/AxeItem", ordinal = 1))
    private static AxeItem InjectStoneAxe(ToolMaterial tm, float i, float f, Item.Settings s){
        return new AxeItem(ModToolMaterial.STONE, 3, -3.0F, (new Item.Settings()).group(ItemGroup.COMBAT));
    }

    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/PickaxeItem", ordinal = 3))
    private static PickaxeItem InjectIronPickaxe(ToolMaterial tm, int i, float f, Item.Settings s){
        return new PickaxeItem(ModToolMaterial.IRON, 1, -2.8F, (new Item.Settings()).group(ItemGroup.TOOLS));
    }
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/HoeItem", ordinal = 3))
    private static HoeItem InjectIronHoe(ToolMaterial tm, int i, float f, Item.Settings s){
        return (HoeItem)(new ModHoeItem(ModToolMaterial.IRON, -1, -2.0F, (new Item.Settings()).group(ItemGroup.TOOLS)));
    }
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/ShovelItem", ordinal = 3))
    private static ShovelItem InjectIronShovel(ToolMaterial tm, float i, float f, Item.Settings s){
        return new ShovelItem(ModToolMaterial.IRON, 0, -2.2F, (new Item.Settings()).group(ItemGroup.TOOLS));
    }
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/SwordItem", ordinal = 3))
    private static SwordItem InjectIronSword(ToolMaterial tm, int i, float f, Item.Settings s){
        return new SwordItem(ModToolMaterial.IRON, 3, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT));
    }
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/AxeItem", ordinal = 3))
    private static AxeItem InjectIronAxe(ToolMaterial tm, float i, float f, Item.Settings s){
        return new AxeItem(ModToolMaterial.IRON, 5, -3.0F, (new Item.Settings()).group(ItemGroup.COMBAT));
    }

    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/PickaxeItem", ordinal = 4))
    private static PickaxeItem InjectDiamondPickaxe(ToolMaterial tm, int i, float f, Item.Settings s){
        return new PickaxeItem(ModToolMaterial.DIAMOND, 1, -2.8F, (new Item.Settings()).group(ItemGroup.TOOLS));
    }
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/HoeItem", ordinal = 4))
    private static HoeItem InjectDiamondHoe(ToolMaterial tm, int i, float f, Item.Settings s){
        return (HoeItem)(new ModHoeItem(ModToolMaterial.DIAMOND, -1, -2.0F, (new Item.Settings()).group(ItemGroup.TOOLS)));
    }
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/ShovelItem", ordinal = 4))
    private static ShovelItem InjectDiamondShovel(ToolMaterial tm, float i, float f, Item.Settings s){
        return new ShovelItem(ModToolMaterial.DIAMOND, 0, -2.2F, (new Item.Settings()).group(ItemGroup.TOOLS));
    }
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/SwordItem", ordinal = 4))
    private static SwordItem InjectDiamondSword(ToolMaterial tm, int i, float f, Item.Settings s){
        return new SwordItem(ModToolMaterial.DIAMOND, 4, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT));
    }
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/AxeItem", ordinal = 4))
    private static AxeItem InjectDiamondAxe(ToolMaterial tm, float i, float f, Item.Settings s){
        return new AxeItem(ModToolMaterial.DIAMOND, 7, -3.0F, (new Item.Settings()).group(ItemGroup.COMBAT));
    }

    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/PickaxeItem", ordinal = 5))
    private static PickaxeItem InjectNetheritePickaxe(ToolMaterial tm, int i, float f, Item.Settings s){
        return new PickaxeItem(ModToolMaterial.NETHERITE, 1, -2.8F, (new Item.Settings()).group(ItemGroup.TOOLS));
    }
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/HoeItem", ordinal = 5))
    private static HoeItem InjectNetheriteHoe(ToolMaterial tm, int i, float f, Item.Settings s){
        return (HoeItem)(new ModHoeItem(ModToolMaterial.NETHERITE, -1, -2.0F, (new Item.Settings()).group(ItemGroup.TOOLS)));
    }
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/ShovelItem", ordinal = 5))
    private static ShovelItem InjectNetheriteShovel(ToolMaterial tm, float i, float f, Item.Settings s){
        return new ShovelItem(ModToolMaterial.NETHERITE, 0, -2.2F, (new Item.Settings()).group(ItemGroup.TOOLS));
    }
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/SwordItem", ordinal = 5))
    private static SwordItem InjectNetheriteSword(ToolMaterial tm, int i, float f, Item.Settings s){
        return new SwordItem(ModToolMaterial.NETHERITE, 4, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT));
    }
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/AxeItem", ordinal = 5))
    private static AxeItem InjectNetheriteAxe(ToolMaterial tm, float i, float f, Item.Settings s){
        return new AxeItem(ModToolMaterial.NETHERITE, 7, -3.0F, (new Item.Settings()).group(ItemGroup.COMBAT));
    }


    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/ArmorItem", ordinal = 0))
    private static ArmorItem InjectTurtleHelmet(ArmorMaterial tm, EquipmentSlot es, Item.Settings s){
        return new ArmorItem(ArmorMaterials.TURTLE, EquipmentSlot.HEAD, (new Item.Settings()).group(ItemGroup.COMBAT));
    }

    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/DyeableArmorItem", ordinal = 0))
    private static DyeableArmorItem InjectLeatherHelmet(ArmorMaterial tm, EquipmentSlot es, Item.Settings s){
        return new DyeableArmorItem(ArmorMaterials.LEATHER, EquipmentSlot.HEAD, (new Item.Settings()).group(ItemGroup.COMBAT));
    }
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/DyeableArmorItem", ordinal = 1))
    private static DyeableArmorItem InjectLeatherHChestplate(ArmorMaterial tm, EquipmentSlot es, Item.Settings s){
        return new DyeableArmorItem(ArmorMaterials.LEATHER, EquipmentSlot.CHEST, (new Item.Settings()).group(ItemGroup.COMBAT));
    }
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/DyeableArmorItem", ordinal = 2))
    private static DyeableArmorItem InjectLeatherLeggings(ArmorMaterial tm, EquipmentSlot es, Item.Settings s){
        return new DyeableArmorItem(ArmorMaterials.LEATHER, EquipmentSlot.LEGS, (new Item.Settings()).group(ItemGroup.COMBAT));
    }
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/DyeableArmorItem", ordinal = 3))
    private static DyeableArmorItem InjectLeatherBoots(ArmorMaterial tm, EquipmentSlot es, Item.Settings s){
        return new DyeableArmorItem(ArmorMaterials.LEATHER, EquipmentSlot.FEET, (new Item.Settings()).group(ItemGroup.COMBAT));
    }

    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/ArmorItem", ordinal = 1))
    private static ArmorItem InjectChainHelmet(ArmorMaterial tm, EquipmentSlot es, Item.Settings s){
        return new ArmorItem(ArmorMaterials.CHAIN, EquipmentSlot.HEAD, (new Item.Settings()).group(ItemGroup.COMBAT));
    }
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/ArmorItem", ordinal = 2))
    private static ArmorItem InjectChainChestplate(ArmorMaterial tm, EquipmentSlot es, Item.Settings s){
        return new ArmorItem(ArmorMaterials.CHAIN, EquipmentSlot.CHEST, (new Item.Settings()).group(ItemGroup.COMBAT));
    }
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/ArmorItem", ordinal = 3))
    private static ArmorItem InjectChainLeggings(ArmorMaterial tm, EquipmentSlot es, Item.Settings s){
        return new ArmorItem(ArmorMaterials.CHAIN, EquipmentSlot.LEGS, (new Item.Settings()).group(ItemGroup.COMBAT));
    }
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/ArmorItem", ordinal = 4))
    private static ArmorItem InjectChainBoots(ArmorMaterial tm, EquipmentSlot es, Item.Settings s){
        return new ArmorItem(ArmorMaterials.CHAIN, EquipmentSlot.FEET, (new Item.Settings()).group(ItemGroup.COMBAT));
    }

    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/ArmorItem", ordinal = 5))
    private static ArmorItem InjectIronHelmet(ArmorMaterial tm, EquipmentSlot es, Item.Settings s){
        return new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.HEAD, (new Item.Settings()).group(ItemGroup.COMBAT));
    }
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/ArmorItem", ordinal = 6))
    private static ArmorItem InjectIronChestplate(ArmorMaterial tm, EquipmentSlot es, Item.Settings s){
        return new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.CHEST, (new Item.Settings()).group(ItemGroup.COMBAT));
    }
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/ArmorItem", ordinal = 7))
    private static ArmorItem InjectIronLeggings(ArmorMaterial tm, EquipmentSlot es, Item.Settings s){
        return new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.LEGS, (new Item.Settings()).group(ItemGroup.COMBAT));
    }
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/ArmorItem", ordinal = 8))
    private static ArmorItem InjectIronBoots(ArmorMaterial tm, EquipmentSlot es, Item.Settings s){
        return new ArmorItem(ArmorMaterials.IRON, EquipmentSlot.FEET, (new Item.Settings()).group(ItemGroup.COMBAT));
    }

    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/ArmorItem", ordinal = 9))
    private static ArmorItem InjectDiamondHelmet(ArmorMaterial tm, EquipmentSlot es, Item.Settings s){
        return new ArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.HEAD, (new Item.Settings()).group(ItemGroup.COMBAT));
    }
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/ArmorItem", ordinal = 10))
    private static ArmorItem InjectDiamondChestplate(ArmorMaterial tm, EquipmentSlot es, Item.Settings s){
        return new ArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.CHEST, (new Item.Settings()).group(ItemGroup.COMBAT));
    }
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/ArmorItem", ordinal = 11))
    private static ArmorItem InjectDiamondLeggings(ArmorMaterial tm, EquipmentSlot es, Item.Settings s){
        return new ArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.LEGS, (new Item.Settings()).group(ItemGroup.COMBAT));
    }
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/ArmorItem", ordinal = 12))
    private static ArmorItem InjectDiamondBoots(ArmorMaterial tm, EquipmentSlot es, Item.Settings s){
        return new ArmorItem(ArmorMaterials.DIAMOND, EquipmentSlot.FEET, (new Item.Settings()).group(ItemGroup.COMBAT));
    }

    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/ArmorItem", ordinal = 17))
    private static ArmorItem InjectNetheriteHelmet(ArmorMaterial tm, EquipmentSlot es, Item.Settings s){
        return new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.HEAD, (new Item.Settings()).group(ItemGroup.COMBAT));
    }
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/ArmorItem", ordinal = 18))
    private static ArmorItem InjectNetheriteChestplate(ArmorMaterial tm, EquipmentSlot es, Item.Settings s){
        return new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.CHEST, (new Item.Settings()).group(ItemGroup.COMBAT));
    }
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/ArmorItem", ordinal = 19))
    private static ArmorItem InjectNetheriteLeggings(ArmorMaterial tm, EquipmentSlot es, Item.Settings s){
        return new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.LEGS, (new Item.Settings()).group(ItemGroup.COMBAT));
    }
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/ArmorItem", ordinal = 20))
    private static ArmorItem InjectNetheriteBoots(ArmorMaterial tm, EquipmentSlot es, Item.Settings s){
        return new ArmorItem(ArmorMaterials.NETHERITE, EquipmentSlot.FEET, (new Item.Settings()).group(ItemGroup.COMBAT));
    }


}


