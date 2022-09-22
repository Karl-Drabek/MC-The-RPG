package com.legumage.mctherpg.world.biome;

import com.legumage.mctherpg.Mctherpg;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;

public class ModBiomeKeys {
    public static final RegistryKey<Biome> REDWOOD_FOREST_KEY = register("redwood_forest");

    private static RegistryKey<Biome> register(String name) {
        return RegistryKey.of(Registry.BIOME_KEY, new Identifier(name));
    }
    public static void registerModBiomes() {
        Mctherpg.LOGGER.debug("Registering ModBiomes for " + Mctherpg.MOD_ID);
    }
}
