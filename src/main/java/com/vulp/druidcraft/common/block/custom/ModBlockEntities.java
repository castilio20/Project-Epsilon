package com.vulp.druidcraft.common.block.custom;

import com.vulp.druidcraft.Druidcraft;
import com.vulp.druidcraft.common.block.ModBlocks;
import com.vulp.druidcraft.common.block.entities.ModChestBlockEntity;
import com.vulp.druidcraft.common.block.entities.ModTrappedChestBlockEntity;
import com.vulp.druidcraft.entity.ModHangingSignBlockEntity;
import com.vulp.druidcraft.entity.ModSignBlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Druidcraft.MODID);


    public static final RegistryObject<BlockEntityType<ModSignBlockEntity>> MOD_SIGN = BLOCK_ENTITIES.register("mod_sign",
                    () -> BlockEntityType.Builder.of(ModSignBlockEntity::new,
                            ModBlocks.DARKWOOD_SIGN.get(), ModBlocks.DARKWOOD_WALL_SIGN.get(),
                    ModBlocks.ELDER_SIGN.get(), ModBlocks.ELDER_WALL_SIGN.get())
            .build(null));
    public static final RegistryObject<BlockEntityType<ModHangingSignBlockEntity>> MOD_HANGING_SIGN = BLOCK_ENTITIES.register("mod_hanging_sign",
            () -> BlockEntityType.Builder.of(ModHangingSignBlockEntity::new,
                    ModBlocks.DARKWOOD_HANGING_SIGN.get(), ModBlocks.DARKWOOD_WALL_HANGING_SIGN.get(),
                    ModBlocks.ELDER_HANGING_SIGN.get(), ModBlocks.ELDER_WALL_HANGING_SIGN.get())
            .build(null));
    public static void register(IEventBus eventBus) {

        BLOCK_ENTITIES.register(eventBus);
    }

    public static RegistryObject<BlockEntityType<ModChestBlockEntity>> MOD_CHEST_BLOCK_ENTITY;
    public static RegistryObject<BlockEntityType<ModTrappedChestBlockEntity>> MOD_TRAPPED_CHEST_BLOCK_ENTITY;



    }


