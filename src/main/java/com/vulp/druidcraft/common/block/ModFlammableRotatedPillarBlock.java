package com.vulp.druidcraft.common.block;

import com.vulp.druidcraft.common.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import org.jetbrains.annotations.Nullable;

public class ModFlammableRotatedPillarBlock extends RotatedPillarBlock {
    public ModFlammableRotatedPillarBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return true;
    }

    @Override
    public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
        return 5;
    }

    @Override
    public @Nullable BlockState getToolModifiedState(BlockState state, UseOnContext context, ToolAction toolAction, boolean simulate) {
        if(context.getItemInHand().getItem() instanceof AxeItem) {
            //DarkWood
            if(state.is(ModBlocks.DARKWOOD_LOG.get())) {
            }
            if(state.is(ModBlocks.STRIPPED_DARKWOOD_LOG.get())) {
            }
            if(state.is(ModBlocks.STRIPPED_DARKWOOD_WOOD.get())) {
            }
            if(state.is(ModBlocks.DARKWOOD_PLANKS.get())) {
            }
            //Elder
            if(state.is(ModBlocks.ELDER_LOG.get())) {
            }
            if(state.is(ModBlocks.STRIPPED_ELDER_LOG.get())) {
            }
            if(state.is(ModBlocks.STRIPPED_ELDER_WOOD.get())) {
            }
            if(state.is(ModBlocks.ELDER_PLANKS.get())) {
            }
            //Beam
            if(state.is(ModBlocks.OAK_BEAM.get())) {
            }
            if(state.is(ModBlocks.SPRUCE_BEAM.get())) {
            }
            if(state.is(ModBlocks.BIRCH_BEAM.get())) {
            }
            if(state.is(ModBlocks.JUNGLE_BEAM.get())) {
            }
            if(state.is(ModBlocks.ACACIA_BEAM.get())) {
            }
            if(state.is(ModBlocks.DARK_OAK_BEAM.get())) {
            }
            if(state.is(ModBlocks.DARKWOOD_BEAM.get())) {
            }
            if(state.is(ModBlocks.STRIPPED_DARKWOOD_BEAM.get())) {
            }
            if(state.is(ModBlocks.ELDER_BEAM.get())) {
            }
            if(state.is(ModBlocks.DARKWOOD_BOOKSHELF.get())) {
            }
        }

        return super.getToolModifiedState(state, context, toolAction, simulate);
    }
}