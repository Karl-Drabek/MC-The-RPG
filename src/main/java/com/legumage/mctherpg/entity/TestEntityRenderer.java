package com.legumage.mctherpg.entity;

import com.legumage.mctherpg.Mctherpg;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.Identifier;

public class TestEntityRenderer extends MobEntityRenderer<ModPathAwareEntity, TestEntityModel> {

    public TestEntityRenderer(EntityRendererFactory.Context context) {
        super(context, new TestEntityModel(context.getPart(ModEntityLayer.MODEL_TEST_LAYER)), 0.5f);
    }

    @Override
    public Identifier getTexture(ModPathAwareEntity entity) {
        return new Identifier(Mctherpg.MOD_ID, "textures/entity/cube/cube.png");
    }
}
