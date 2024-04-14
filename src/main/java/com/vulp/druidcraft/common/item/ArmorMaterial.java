package com.vulp.druidcraft.common.item;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public class ArmorMaterial {
    public static final ModArmorMaterial MOONSTONE = new ModArmorMaterial(
            new int[] { 500, 1200, 600, 400 },
            new int[] { 4, 9, 7, 3 },
            20,
            SoundEvents.ARMOR_EQUIP_TURTLE,
            () -> Ingredient.of(ModItems.MOONSTONE::get),
            "moonstone",
            3f,
            0f);
    public static final ModArmorMaterial BONE = new ModArmorMaterial(
            new int[] { 500, 1200, 600, 400 },
            new int[] { 2, 5, 4, 1 },
            20,
            SoundEvents.ARMOR_EQUIP_TURTLE,
            () -> Ingredient.of(Items.BONE),
            "bone",
            0,
            0f);
    public static final ModArmorMaterial CHITIN = new ModArmorMaterial(
            new int[] { 500, 1200, 600, 400 },
            new int[] { 2, 5, 4, 1 },
            20,
            SoundEvents.FOX_TELEPORT,
            () -> Ingredient.of(ModItems.CHITIN::get),
            "chitin",
            0,
            0f);


}