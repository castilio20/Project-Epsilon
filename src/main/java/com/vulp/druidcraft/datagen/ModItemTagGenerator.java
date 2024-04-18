package com.vulp.druidcraft.datagen;

import com.vulp.druidcraft.Druidcraft;
import com.vulp.druidcraft.common.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, Druidcraft.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.BONE_HELMET.get(),
                        ModItems.BONE_CHESTPLATE.get(),
                        ModItems.BONE_LEGGINGS.get(),
                        ModItems.BONE_BOOTS.get());
                this.tag(ItemTags.TRIMMABLE_ARMOR)
                        .add(ModItems.CHITIN_HELMET.get(),
                                ModItems.CHITIN_CHESTPLATE.get(),
                                ModItems.CHITIN_LEGGINGS.get(),
                                ModItems.CHITIN_BOOTS.get());
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.MOONSTONE_HELMET.get(),
                        ModItems.MOONSTONE_CHESTPLATE.get(),
                        ModItems.MOONSTONE_LEGGINGS.get(),
                        ModItems.MOONSTONE_BOOTS.get());
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.FIERY_HELMET.get(),
                        ModItems.FIERY_CHESTPLATE.get(),
                        ModItems.FIERY_LEGGINGS.get(),
                        ModItems.FIERY_BOOTS.get());


    }
}