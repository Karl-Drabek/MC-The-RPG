package com.legumage.mctherpg.entity;

import com.legumage.mctherpg.Mctherpg;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<ModPathAwareEntity> TEST = registerEntityType("test",
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE,
                    ModPathAwareEntity::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build());

    private static EntityType registerEntityType(String name, EntityType entityType){
            return Registry.register(Registry.ENTITY_TYPE, new Identifier(Mctherpg.MOD_ID, name), entityType);
    }


    public static void registerModEntities(){
        FabricDefaultAttributeRegistry.register(TEST, ModPathAwareEntity.createMobAttributes());
        System.out.println("Registering ModEntities for" + Mctherpg.MOD_ID);
    }
}
