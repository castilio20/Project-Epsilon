package com.vulp.druidcraft.common.block.entities;

import com.vulp.druidcraft.common.block.ModBlocks;
import com.vulp.druidcraft.common.block.custom.ModBlockEntities;
import com.vulp.druidcraft.common.block.custom.ModChestBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.entity.ChestBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class ModChestBlockEntity extends ChestBlockEntity {
    public ModChestBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(ModBlocks.MOD_CHEST_BLOCK_ENTITY.get(), blockPos, blockState);
    }

    //@Override
    //protected Component getDefaultName() {
      //  return Component.translatable("container.lolmcv." + getBlock().getChestType() + "_chest");
    //}

    public ModChestBlock getBlock() {
        return (ModChestBlock) getBlockState().getBlock();
    }
}
