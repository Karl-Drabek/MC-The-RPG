package com.legumage.mctherpg.screen;

import com.legumage.mctherpg.Mctherpg;
import net.fabricmc.fabric.api.screenhandler.v1.ScreenHandlerRegistry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

    public class ModScreenHandlers {
        public static ScreenHandlerType<RefineryScreenHandler> REFINERY_SCREEN_HANDLER =
                ScreenHandlerRegistry.registerSimple(new Identifier(Mctherpg.MOD_ID, "refinery"),
                        RefineryScreenHandler::new);
    }
