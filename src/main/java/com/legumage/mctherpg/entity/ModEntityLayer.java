package com.legumage.mctherpg.entity;

import com.legumage.mctherpg.Mctherpg;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class ModEntityLayer {
    public static final EntityModelLayer MODEL_TEST_LAYER = new EntityModelLayer(new Identifier(Mctherpg.MOD_ID, "test"), "main");
    public static void registerRenderLayers(){
        EntityRendererRegistry.register(ModEntities.TEST, (context) -> {
            return new TestEntityRenderer(context);});
        EntityModelLayerRegistry.registerModelLayer(MODEL_TEST_LAYER, TestEntityModel::getTexturedModelData);
    }
}
