package com.vulp.druidcraft.common.block.custom;

import com.vulp.druidcraft.Druidcraft;
import com.vulp.druidcraft.common.block.ModBlocks;
import com.vulp.druidcraft.common.block.entities.ModChestBlockEntity;
import com.vulp.druidcraft.common.block.entities.ModTrappedChestBlockEntity;
import com.vulp.druidcraft.entity.ModHangingSignBlockEntity;
import com.vulp.druidcraft.entity.ModSignBlockEntity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

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
    public static final RegistryObject<Block> DARKWOOD_CHEST = registerChest("oak", () -> new ModChestBlock(MapColor.WOOD, "oak"));
    public static final RegistryObject<Block> DARKWOOD_TRAPPED_CHEST = registerChest("oak_trapped", () -> new ModTrappedChestBlock(MapColor.WOOD, "oak"));

    public static RegistryObject<BlockEntityType<ModChestBlockEntity>> MOD_CHEST_BLOCK_ENTITY;
    public static RegistryObject<BlockEntityType<ModTrappedChestBlockEntity>> MOD_TRAPPED_CHEST_BLOCK_ENTITY;
    public static final List<RegistryObject<Block>> mod_chest = new ArrayList<>();
    public static final List<RegistryObject<Block>> mod_trapped_chest = new ArrayList<>();

    public static void registerBlocks(IEventBus modBus) {
        addToArray(DARKWOOD_CHEST, DARKWOOD_TRAPPED_CHEST);

        MOD_CHEST_BLOCK_ENTITY = BLOCKS_ENTITIES.register("chest_tile",
                () -> BlockEntityType.Builder.of(ModChestBlockEntity::new, mod_chest.stream().map(RegistryObject::get).toArray(Block[]::new)).build(null));
        MOD_TRAPPED_CHEST_BLOCK_ENTITY = BLOCKS_ENTITIES.register("trapped_chest_tile",
                () -> BlockEntityType.Builder.of(ModTrappedChestBlockEntity::new, mod_trapped_chest.stream().map(RegistryObject::get).toArray(Block[]::new)).build(null));

        BLOCKS.register(modBus);
        BLOCKS_ENTITIES.register(modBus);
    }

    private static RegistryObject<Block> registerChest(String name, Supplier<Block> block) {
        return BLOCKS.register(name + "_chest", block);
    }

    private static void addToArray(RegistryObject<Block> chest, RegistryObject<Block> trappedChest) {
        mod_chest.add(chest);
        mod_trapped_chest.add(trappedChest);
    }
}









