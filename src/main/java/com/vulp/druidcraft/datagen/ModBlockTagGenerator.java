package com.vulp.druidcraft.datagen;

import com.vulp.druidcraft.Druidcraft;
import com.vulp.druidcraft.common.block.ModBlocks;
import com.vulp.druidcraft.common.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, Druidcraft.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.NEEDS_BONE_TOOL)
                .add(ModBlocks.AMBER_BLOCK.get()).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.AMBER_BLOCK.get(),
                        ModBlocks.AMBER_BLOCK.get());




        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.AMBER_BLOCK.get());

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.DARKWOOD_FENCE.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.DARKWOOD_FENCE_GATE.get());
        this.tag(BlockTags.FENCES)
                .add(ModBlocks.ELDER_FENCE.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.ELDER_FENCE_GATE.get());
        this.tag(BlockTags.WALLS)
                .add(ModBlocks.DRY_MUD_BRICK_WALL.get());
        var bookshelves = tag(Tags.Blocks.BOOKSHELVES);
        var enchantment = tag(BlockTags.ENCHANTMENT_POWER_PROVIDER);
        bookshelves.add(ModBlocks.DARKWOOD_BOOKSHELF.get());
        enchantment.add(ModBlocks.DARKWOOD_BOOKSHELF.get());
        bookshelves.add(ModBlocks.ELDER_BOOKSHELF.get());
        enchantment.add(ModBlocks.ELDER_BOOKSHELF.get());
        this.tag(BlockTags.CLIMBABLE).add(ModBlocks.DARKWOOD_LADDER.get());
        this.tag(BlockTags.CLIMBABLE).add(ModBlocks.ELDER_LADDER.get());
        this.tag(BlockTags.BEEHIVES).add(ModBlocks.DARKWOOD_BEEHIVE.get());
    }
}