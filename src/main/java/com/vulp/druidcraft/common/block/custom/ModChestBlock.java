package com.vulp.druidcraft.common.block.custom;

import com.vulp.druidcraft.common.block.ModBlocks;
import com.vulp.druidcraft.common.block.entities.ModChestBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.CompoundContainer;
import net.minecraft.world.Container;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ChestBlock;
import net.minecraft.world.level.block.DoubleBlockCombiner;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;

import javax.annotation.Nullable;
import java.util.Optional;

public class ModChestBlock extends ChestBlock {
    public DoubleBlockCombiner.Combiner<ChestBlockEntity, Optional<MenuProvider>> NAME_RETRIEVER;
    public final String chestType;

    public ModChestBlock(MapColor colour, String chestType) {
        super(Properties.copy(Blocks.CHEST).mapColor(colour), () -> ModBlocks.MOD_CHEST_BLOCK_ENTITY.get());
        this.chestType = chestType;

        registerMaterialNameRetriever();
    }

    public ModChestBlock(MapColor colour, SoundType sound, String chestType) {
        super(Properties.copy(Blocks.CHEST).mapColor(colour).sound(sound), () -> ModBlocks.MOD_CHEST_BLOCK_ENTITY.get());
        this.chestType = chestType;

        registerMaterialNameRetriever();
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new ModChestBlockEntity(pos, state);
    }

    protected void registerMaterialNameRetriever() {
        NAME_RETRIEVER = new DoubleBlockCombiner.Combiner<>() {
            public Optional<MenuProvider> acceptDouble(ChestBlockEntity chestBlockEntity, ChestBlockEntity chestBlockEntity2) {
                final Container container = new CompoundContainer(chestBlockEntity, chestBlockEntity2);
                return Optional.of(new MenuProvider() {
                    @javax.annotation.Nullable
                    public AbstractContainerMenu createMenu(int p_51622_, Inventory p_51623_, Player p_51624_) {
                        if (chestBlockEntity.canOpen(p_51624_) && chestBlockEntity2.canOpen(p_51624_)) {
                            chestBlockEntity.unpackLootTable(p_51623_.player);
                            chestBlockEntity2.unpackLootTable(p_51623_.player);
                            return ChestMenu.sixRows(p_51622_, p_51623_, container);
                        } else {
                            return null;
                        }
                    }

                    public Component getDisplayName() {
                        if (chestBlockEntity.hasCustomName()) {
                            return chestBlockEntity.getDisplayName();
                        } else {
                            return chestBlockEntity2.hasCustomName() ? chestBlockEntity2.getDisplayName() :
                                    Component.translatable("container.lolmcv." + chestType + "_chestDouble");
                        }
                    }
                });
            }

            public Optional<MenuProvider> acceptSingle(ChestBlockEntity chestBlockEntity) {
                return Optional.of(chestBlockEntity);
            }

            public Optional<MenuProvider> acceptNone() {
                return Optional.empty();
            }
        };
    }

    @Override
    @Nullable
    public MenuProvider getMenuProvider(BlockState state, Level level, BlockPos pos) {
        return this.combine(state, level, pos, false)
                .apply(NAME_RETRIEVER).orElse(null);
    }

    public String getChestType() {
        return chestType;
    }
}
