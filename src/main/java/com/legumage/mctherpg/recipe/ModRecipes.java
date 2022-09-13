package com.legumage.mctherpg.recipe;

import com.legumage.mctherpg.Mctherpg;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModRecipes {
    public static void register() {
        Registry.register(Registry.RECIPE_SERIALIZER, new Identifier(Mctherpg.MOD_ID, RefineryRecipe.Serializer.ID),
                RefineryRecipe.Serializer.INSTANCE);
        Registry.register(Registry.RECIPE_TYPE, new Identifier(Mctherpg.MOD_ID, RefineryRecipe.Type.ID),
                RefineryRecipe.Type.INSTANCE);
    }
}