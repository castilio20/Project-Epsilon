package com.vulp.druidcraft.worldgen.tree;

import com.vulp.druidcraft.Druidcraft;
import com.vulp.druidcraft.worldgen.tree.custom.DarkwoodTrunkPlacer;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModTrunkPlacerTypes {
    public static final DeferredRegister<TrunkPlacerType<?>> TRUNK_PLACER =
            DeferredRegister.create(Registries.TRUNK_PLACER_TYPE, Druidcraft.MODID);

    public static final RegistryObject<TrunkPlacerType<DarkwoodTrunkPlacer>> DARKWOOD_TRUNK_PLACER =
            TRUNK_PLACER.register("darkwood_trunk_placer", () -> new TrunkPlacerType<>(DarkwoodTrunkPlacer.CODEC));

    public static void register(IEventBus eventBus) {
        TRUNK_PLACER.register(eventBus);
    }
}
