package com.vulp.druidcraft.common.item;

import com.vulp.druidcraft.Druidcraft;
import com.vulp.druidcraft.common.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier MOOONSTONE = TierSortingRegistry.registerTier(
        new ForgeTier(3, 1500, 0f, 3f, 25,
                ModTags.Blocks.NEEDS_MOONSTONE_TOOL, () -> Ingredient.of(ModItems.MOONSTONE.get())),
        new ResourceLocation(Druidcraft.MODID, "moonstone"), List.of(Tiers.IRON), List.of());
    public static final Tier BONE = TierSortingRegistry.registerTier(
            new ForgeTier(2, 1500, 0f, 1f, 25,
                    ModTags.Blocks.NEEDS_MOONSTONE_TOOL, () -> Ingredient.of(Items.BONE)),
            new ResourceLocation(Druidcraft.MODID, "bone"), List.of(Tiers.STONE), List.of());
}