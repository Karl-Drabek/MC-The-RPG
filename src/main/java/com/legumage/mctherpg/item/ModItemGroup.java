package com.legumage.mctherpg.item;

import com.legumage.mctherpg.Mctherpg;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup MODITEMS = FabricItemGroupBuilder.build(new Identifier(Mctherpg.MOD_ID, "materials"),
            () -> new ItemStack(ModItems.REFINED_AERIALITE));
}
