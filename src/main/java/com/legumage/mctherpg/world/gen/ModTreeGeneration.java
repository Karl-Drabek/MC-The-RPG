package com.legumage.mctherpg.world.gen;

import com.legumage.mctherpg.world.biome.ModBiomeKeys;
import com.legumage.mctherpg.world.feature.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModTreeGeneration {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomeKeys.REDWOOD_FOREST_KEY),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.REDWOOD_PLACED.getKey().get());
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BANANA_TREE_PLACED.getKey().get());

    }
}
