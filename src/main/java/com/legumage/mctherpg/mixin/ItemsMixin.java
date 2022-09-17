package com.legumage.mctherpg.mixin;

import com.legumage.mctherpg.Mctherpg;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.EndermanEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
/*
@Mixin( Items.class)
public class ItemsMixin {
    @Inject(method = "register(Lnet/minecraft/util/Identifier;Lnet/minecraft/item/Item;)Lnet/minecraft/item/Item;", at = @At("TAIL"), cancellable = true)
    private static void injected(Identifier id, Item item, CallbackInfoReturnable<Item> cir) {
        if(id.getPath() == "wooden_sword"){
            Mctherpg.LOGGER.info("Wooden sword found");
            cir.setReturnValue((Item)Registry.register(Registry.ITEM, id, (Item)(new SwordItem(ToolMaterials.WOOD, 30, -2.4F, (new Item.Settings()).group(ItemGroup.COMBAT)))));
            Mctherpg.LOGGER.info("Wooden sword added");
        }
    }
}*/
