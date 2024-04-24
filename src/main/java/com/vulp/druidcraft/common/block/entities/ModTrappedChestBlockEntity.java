package com.vulp.druidcraft.common.block.entities;

import com.vulp.druidcraft.common.block.custom.ModBlockEntities;
import com.vulp.druidcraft.common.block.custom.ModTrappedChestBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class ModTrappedChestBlockEntity extends ChestBlockEntity {
    public ModTrappedChestBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(ModBlockEntities.MOD_TRAPPED_CHEST_BLOCK_ENTITY.get(), blockPos, blockState);
    }

    protected void signalOpenCount(Level level, BlockPos pos, BlockState state, int i, int j) {
        super.signalOpenCount(level, pos, state, i, j);
        if (i != j) {
            Block block = state.getBlock();
            level.updateNeighborsAt(pos, block);
            level.updateNeighborsAt(pos.below(), block);
        }
    }

    @Override
    protected Component getDefaultName() {
        return Component.translatable("container.lolmcv." + getBlock().getChestType() + "_chest");
    }

    public ModTrappedChestBlock getBlock() {
        return (ModTrappedChestBlock) getBlockState().getBlock();
    }
}