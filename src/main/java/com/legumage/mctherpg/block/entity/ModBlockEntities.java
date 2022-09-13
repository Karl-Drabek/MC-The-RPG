package com.legumage.mctherpg.block.entity;

import com.legumage.mctherpg.Mctherpg;
import com.legumage.mctherpg.block.ModBlocks;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEntities {
    public static BlockEntityType<RefineryBlockEntity> REFINERY_BLOCK_ENTITY =
            Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(Mctherpg.MOD_ID, "lightning_channeler"),
                    FabricBlockEntityTypeBuilder.create(RefineryBlockEntity::new,
                            ModBlocks.REFINERY).build(null));
}
