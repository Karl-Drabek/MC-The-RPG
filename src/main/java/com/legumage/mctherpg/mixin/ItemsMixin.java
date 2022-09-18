package com.legumage.mctherpg.mixin;
import com.legumage.mctherpg.Mctherpg;
import net.minecraft.item.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(Items.class)
public abstract class ItemsMixin {
    //@Shadow static Item register(String s, Item i){return null;};
    @Redirect(method = "<clinit>", at = @At(value = "NEW", target = "net/minecraft/item/PickaxeItem", ordinal = 2))
    private static PickaxeItem Injected(ToolMaterial tm, int i, float f, Item.Settings s){
        return new PickaxeItem(ToolMaterials.IRON, 13, -2.8F, (new Item.Settings()).group(ItemGroup.TOOLS));
    }
}


