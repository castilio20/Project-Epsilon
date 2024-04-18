package com.vulp.druidcraft.worldgen;

import com.vulp.druidcraft.Druidcraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;

public class WorldGen {public static ResourceKey<ConfiguredFeature<?, ?>> DARKWOOD_TREE = WorldGen.registerKey("darkwood_wood");
    public static ResourceKey<ConfiguredFeature<?, ?>> ELDER_TREE = WorldGen.registerKey("elder_wood");
    ;

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(Druidcraft.MODID, name));
    }
}

