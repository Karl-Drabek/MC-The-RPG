package com.legumage.mctherpg.world.feature;

import com.legumage.mctherpg.Mctherpg;
import com.legumage.mctherpg.block.ModBlocks;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.JungleFoliagePlacer;
import net.minecraft.world.gen.foliage.MegaPineFoliagePlacer;
import net.minecraft.world.gen.foliage.RandomSpreadFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.DarkOakTrunkPlacer;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;
import net.minecraft.world.gen.trunk.MegaJungleTrunkPlacer;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> REDWOOD_TREE =
            ConfiguredFeatures.register("redwood_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.REDWOOD_LOG),
                    new MegaJungleTrunkPlacer(30, 20, 10),
                    BlockStateProvider.of(ModBlocks.REDWOOD_LEAVES),
                    new JungleFoliagePlacer(ConstantIntProvider.create(4), ConstantIntProvider.create(2), 4),
                    new TwoLayersFeatureSize(4, 3, 5)).build());
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> BANANA_TREE =
            ConfiguredFeatures.register("banana_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.BANANA_TREE_LOG),
                    new ForkingTrunkPlacer(5, 6, 3),
                    BlockStateProvider.of(ModBlocks.BANANA_TREE_LEAVES),
                    new RandomSpreadFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), ConstantIntProvider.create(6), 15),
                    new TwoLayersFeatureSize(0, 0, 1)).build());

    public static final RegistryEntry<PlacedFeature> REDWOOD_CHECKED =
            PlacedFeatures.register("redwood_checked", REDWOOD_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.REDWOOD_SAPLING));
    public static final RegistryEntry<PlacedFeature> BANANA_TREE_CHECKED =
            PlacedFeatures.register("banana_tree_checked", BANANA_TREE,
                    PlacedFeatures.wouldSurvive(ModBlocks.BANANA_TREE_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> REDWOOD_SPAWN =
            ConfiguredFeatures.register("redwood_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(REDWOOD_CHECKED, 0.5f)),
                            REDWOOD_CHECKED));
    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> BANANA_TREE_SPAWN =
            ConfiguredFeatures.register("banana_tree_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(BANANA_TREE_CHECKED, 0.5f)),
                            BANANA_TREE_CHECKED));

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + Mctherpg.MOD_ID);
    }
}
