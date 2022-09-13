package com.legumage.mctherpg;

import com.legumage.mctherpg.entity.ModEntityLayer;
import com.legumage.mctherpg.screen.ModScreenHandlers;
import com.legumage.mctherpg.screen.RefineryScreen;
import com.legumage.mctherpg.util.ModModelPredicateProvider;
import com.legumage.mctherpg.util.ModRenderHelper;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;

@Environment(EnvType.CLIENT)
public class MctherpgClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModRenderHelper.setRenderLayers();
        ModEntityLayer.registerRenderLayers();
        ScreenRegistry.register(ModScreenHandlers.REFINERY_SCREEN_HANDLER, RefineryScreen::new);
        ModModelPredicateProvider.registerModModels();

    }
}
