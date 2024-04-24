package com.vulp.druidcraft.common.block.custom;

import com.vulp.druidcraft.Druidcraft;
import com.vulp.druidcraft.common.block.ModBlocks;
import com.vulp.druidcraft.entity.ModHangingSignBlockEntity;
import com.vulp.druidcraft.entity.ModSignBlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BeehiveBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Druidcraft.MODID);

    public static final DeferredRegister<BlockEntityType<?>> BLOCKS_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Druidcraft.MODID);


    public static final RegistryObject<BlockEntityType<ModSignBlockEntity>> MOD_SIGN = BLOCKS_ENTITIES.register("mod_sign",
                    () -> BlockEntityType.Builder.of(ModSignBlockEntity::new,
                            ModBlocks.DARKWOOD_SIGN.get(), ModBlocks.DARKWOOD_WALL_SIGN.get(),
                    ModBlocks.ELDER_SIGN.get(), ModBlocks.ELDER_WALL_SIGN.get())
            .build(null));
    public static final RegistryObject<BlockEntityType<ModHangingSignBlockEntity>> MOD_HANGING_SIGN = BLOCKS_ENTITIES.register("mod_hanging_sign",
            () -> BlockEntityType.Builder.of(ModHangingSignBlockEntity::new,
                    ModBlocks.DARKWOOD_HANGING_SIGN.get(), ModBlocks.DARKWOOD_WALL_HANGING_SIGN.get(),
                    ModBlocks.ELDER_HANGING_SIGN.get(), ModBlocks.ELDER_WALL_HANGING_SIGN.get())
            .build(null));



    public static void register(IEventBus eventBus) {
        BLOCKS_ENTITIES.register(eventBus);
    }




}






