package com.vulp.druidcraft.common.fluid;

import com.vulp.druidcraft.Druidcraft;
import com.vulp.druidcraft.common.block.ModBlocks;
import com.vulp.druidcraft.common.item.ModItems;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(ForgeRegistries.FLUIDS, Druidcraft.MODID);

    public static final RegistryObject<FlowingFluid> SOURCE_LIQUID_RAINBOW = FLUIDS.register("liquid_rainbow",
            () -> new ForgeFlowingFluid.Source(ModFluids.LIQUID_RAINBOW_FLUID_PROPERTIES));
    public static final RegistryObject<FlowingFluid> FLOWING_LIQUID_RAINBOW = FLUIDS.register("flowing_liquid_rainbow",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.LIQUID_RAINBOW_FLUID_PROPERTIES));


    public static final ForgeFlowingFluid.Properties LIQUID_RAINBOW_FLUID_PROPERTIES = new ForgeFlowingFluid.Properties(
            ModFluidTypes.LIQUID_RAINBOW_TYPE, SOURCE_LIQUID_RAINBOW, FLOWING_LIQUID_RAINBOW)
            .slopeFindDistance(2).levelDecreasePerBlock(2).block(ModBlocks.LIQUID_RAINBOW_BLOCK)
            .bucket(ModItems.LIQUID_RAINBOW_BUCKET);


    public static void register(IEventBus eventBus) {
        FLUIDS.register(eventBus);
    }
}
