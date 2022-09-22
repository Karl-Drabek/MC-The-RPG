package com.legumage.mctherpg.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;

public class ModPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> REDWOOD_PLACED = PlacedFeatures.register("redwood_placed",
            ModConfiguredFeatures.REDWOOD_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(1, 0.5f, 2)));
    public static final RegistryEntry<PlacedFeature> BANANA_TREE_PLACED = PlacedFeatures.register("banana_tree_placed",
            ModConfiguredFeatures.BANANA_TREE_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(1, 0.1f, 2)));
}
