package com.vulp.druidcraft.common.block.custom;

import com.vulp.druidcraft.entity.ModSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModStandingSignBlock extends StandingSignBlock {
    public ModStandingSignBlock(Properties pProperties, WoodType pType) {
        super(pProperties, pType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new ModSignBlockEntity(pPos, pState);
    }
}