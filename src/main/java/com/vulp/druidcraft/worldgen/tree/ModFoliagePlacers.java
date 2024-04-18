package com.vulp.druidcraft.worldgen.tree;

import com.vulp.druidcraft.Druidcraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraft.world.level.levelgen.feature.foliageplacers.PineFoliagePlacer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModFoliagePlacers {
    public static final DeferredRegister<FoliagePlacerType<?>> FOLIAGE_PLACERS =
        DeferredRegister.create(Registries.FOLIAGE_PLACER_TYPE, Druidcraft.MODID);

    public static final RegistryObject<FoliagePlacerType<PineFoliagePlacer>> DARKWOOD_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("darkwood_foliage_placer", () -> new FoliagePlacerType<>(PineFoliagePlacer.CODEC));

    public static void register(IEventBus eventBus) {
        FOLIAGE_PLACERS.register(eventBus);
    }
}

