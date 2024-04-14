package com.vulp.druidcraft.common.block.entity;

import com.vulp.druidcraft.Druidcraft;
import com.vulp.druidcraft.common.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Druidcraft.MODID);




    public static final RegistryObject<BlockEntityType<ModSignBlockEntity>> MOD_SIGN =
            BLOCK_ENTITIES.register("mod_sign", () ->
                    BlockEntityType.Builder.of(ModSignBlockEntity::new,
                            ModBlocks.DARKWOOD_SIGN.get(), ModBlocks.DARKWOOD_WALL_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<ModHangingSignBlockEntity>> MOD_HANGING_SIGN =
            BLOCK_ENTITIES.register("mod_hanging_sign", () ->
                    BlockEntityType.Builder.of(ModHangingSignBlockEntity::new,
                            ModBlocks.DARKWOOD_WALL_SIGN.get(), ModBlocks.DARKWOOD_WALL_SIGN.get()).build(null));
    //ELDER
   // public static final RegistryObject<BlockEntityType<ModSignBlockEntity>> MOD_SIGN =
            //BLOCK_ENTITIES.register("mod_sign", () ->
                    //BlockEntityType.Builder.of(ModSignBlockEntity::new,
                            //ModBlocks.ELDER_SIGN.get(), ModBlocks.ELDER_WALL_SIGN.get()).build(null));

    //public static final RegistryObject<BlockEntityType<ModHangingSignBlockEntity>> MOD_HANGING_SIGN =
            //BLOCK_ENTITIES.register("mod_hanging_sign", () ->
                    //BlockEntityType.Builder.of(ModHangingSignBlockEntity::new,
                            //ModBlocks.ELDER_WALL_SIGN.get(), ModBlocks.ELDER_WALL_SIGN.get()).build(null));


    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}

