package com.vulp.druidcraft.common.util;

import com.vulp.druidcraft.Druidcraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

public class ModTags {   public static class Blocks {
    public static final TagKey<Block> NEEDS_CHITIN_TOOL = tag("chitin");
    public static final TagKey<Block> NEEDS_BONE_TOOL = tag("needs_bone_tool");
    public static final TagKey<Block> NEEDS_MOONSTONE_TOOL = tag("needs_moonstone_tool");
    public static final TagKey<Block> NEEDS_FIERY_TOOL = tag("needs_fiery_tool");
    public static final TagKey<Block> MINEABLE_WITH_SICKLE = BlockTags.create(new ResourceLocation(Druidcraft.MODID, "mineable/sickle"));



    private static TagKey<Block> tag(String name) {
        return BlockTags.create(new ResourceLocation(Druidcraft.MODID, name));
    }
}

    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Druidcraft.MODID, name));
        }
    }
}

