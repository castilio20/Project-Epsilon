package com.vulp.druidcraft.common.item;

import com.vulp.druidcraft.Druidcraft;
import com.vulp.druidcraft.common.block.ModBlocks;
import com.vulp.druidcraft.entity.custom.ModBoatEntity;
import com.vulp.druidcraft.common.item.custom.ModBoatItem;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, Druidcraft.MODID);
    // True items:
    public static final RegistryObject<Item> HEMP = ITEMS.register("hemp",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HEMP_SEEDS = ITEMS.register("hemp_seeds",
            () -> new ItemNameBlockItem(ModBlocks.HEMP_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> AMBER = ITEMS.register("amber",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MOONSTONE = ITEMS.register("moonstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FIERY_GLASS = ITEMS.register("fiery_glass",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_FIERY_GLASS = ITEMS.register("crushed_fiery_glass",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRIGHTSTONE = ITEMS.register("brightstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BLAZING_STEEL = ITEMS.register("blazing_steel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CHITIN = ITEMS.register("chitin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HEART_OF_BLAZE = ITEMS.register("heart_of_blaze",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ROCKROOT = ITEMS.register("rockroot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TEMPERED_FIERY_GLASS = ITEMS.register("tempered_fiery_glass",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> KNIFE = ITEMS.register("knife",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FLOUR = ITEMS.register("flour",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DARKWOOD_SIGN = ITEMS.register("darkwood_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.DARKWOOD_SIGN.get(), ModBlocks.DARKWOOD_WALL_SIGN.get()));
    public static final RegistryObject<Item> DARKWOOD_HANGING_SIGN = ITEMS.register("darkwood_hanging_sign",
            () -> new HangingSignItem(ModBlocks.DARKWOOD_HANGING_SIGN.get(), ModBlocks.DARKWOOD_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> DARKWOOD_BOAT = ITEMS.register("darkwood_boat",
        () -> new ModBoatItem(false, ModBoatEntity.Type.DARKWOOD, new Item.Properties()));
    public static final RegistryObject<Item> DARKWOOD_CHEST_BOAT = ITEMS.register("darkwood_chest_boat",
            () -> new ModBoatItem(true, ModBoatEntity.Type.DARKWOOD, new Item.Properties()));
    public static final RegistryObject<Item> ELDER_SIGN = ITEMS.register("elder_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.DARKWOOD_SIGN.get(), ModBlocks.DARKWOOD_WALL_SIGN.get()));
    public static final RegistryObject<Item> ELDER_HANGING_SIGN = ITEMS.register("elder_hanging_sign",
            () -> new HangingSignItem(ModBlocks.DARKWOOD_HANGING_SIGN.get(), ModBlocks.DARKWOOD_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    //Food
    public static final RegistryObject<Item> BLUEBERRIES = ITEMS.register("blueberries",
            () -> new Item(new Item.Properties().food(ModFoods.BLUEBERRIES)));
    public static final RegistryObject<Item> ELDERBERRIES = ITEMS.register("elderberries",
            () -> new Item(new Item.Properties().food(ModFoods.ELDERBERRIES)));
    public static final RegistryObject<Item> BLUEBERRY_MUFFIN = ITEMS.register("blueberry_muffin",
            () -> new Item(new Item.Properties().food(ModFoods.BLUEBERRY_MUFFIN)));
    //public static final RegistryObject<Item> APPLE_ELDERBERRY = ITEMS.register("apple_elderberry",
            //() -> new Item(new Item.Properties().food(ModFoods.APPLE_ELDERBERRY)));
    public static final RegistryObject<Item> SKYBERRIES = ITEMS.register("skyberries",
            () -> new Item(new Item.Properties().food(ModFoods.SKYBERRIES)));
    public static final RegistryObject<Item> DOUGH = ITEMS.register("dough",
            () -> new Item(new Item.Properties().food(ModFoods.DOUGH)));
    //Tools & Armour:
    public static final RegistryObject<Item> BONE_SWORD = ITEMS.register("bone_sword",
            () -> new SwordItem(ModToolTiers.BONE, 3, -2.6f, new Item.Properties()));
    public static final RegistryObject<Item> BONE_SHOVEL = ITEMS.register("bone_shovel",
            () -> new SwordItem(ModToolTiers.BONE, 1, -3f, new Item.Properties()));
    public static final RegistryObject<Item> BONE_PICKAXE = ITEMS.register("bone_pickaxe",
            () -> new SwordItem(ModToolTiers.BONE, 1, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> BONE_AXE = ITEMS.register("bone_axe",
            () -> new SwordItem(ModToolTiers.BONE, 7, -3.2f, new Item.Properties()));
    public static final RegistryObject<Item> BONE_HOE = ITEMS.register("bone_hoe",
            () -> new SwordItem(ModToolTiers.BONE, 1, 0f, new Item.Properties()));
    public static final RegistryObject<Item> BONE_SICKLE = ITEMS.register("bone_sickle",
            () -> new SwordItem(ModToolTiers.BONE, 0, -1.5f, new Item.Properties()));
    public static final RegistryObject<Item> BONE_HELMET = ITEMS.register("bone_helmet",
            () -> new ArmorItem(ArmorMaterial.BONE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> BONE_CHESTPLATE = ITEMS.register("bone_chestplate",
            () -> new ArmorItem(ArmorMaterial.BONE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> BONE_LEGGINGS = ITEMS.register("bone_leggings",
            () -> new ArmorItem(ArmorMaterial.BONE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> BONE_BOOTS = ITEMS.register("bone_boots",
            () -> new ArmorItem(ArmorMaterial.BONE, ArmorItem.Type.BOOTS , new Item.Properties()));
    public static final RegistryObject<Item> MOONSTONE_SWORD = ITEMS.register("moonstone_sword",
            () -> new SwordItem(ModToolTiers.MOOONSTONE, 4, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> MOONSTONE_SHOVEL = ITEMS.register("moonstone_shovel",
            () -> new PickaxeItem(ModToolTiers.MOOONSTONE, 3, -3f, new Item.Properties()));
    public static final RegistryObject<Item> MOONSTONE_PICKAXE = ITEMS.register("moonstone_pickaxe",
            () -> new AxeItem(ModToolTiers.MOOONSTONE, 2, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> MOONSTONE_AXE = ITEMS.register("moonstone_axe",
            () -> new ShovelItem(ModToolTiers.MOOONSTONE, 8, -3.2f, new Item.Properties()));
    public static final RegistryObject<Item> MOONSTONE_HOE = ITEMS.register("moonstone_hoe",
            () -> new HoeItem(ModToolTiers.MOOONSTONE, 1, -2.0f, new Item.Properties()));
    public static final RegistryObject<Item> MOONSTONE_SICKLE = ITEMS.register("moonstone_sickle",
            () -> new HoeItem(ModToolTiers.MOOONSTONE, 1, -1.5f, new Item.Properties()));
    public static final RegistryObject<Item> MOONSTONE_HELMET = ITEMS.register("moonstone_helmet",
            () -> new ArmorItem(ArmorMaterial.MOONSTONE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> MOONSTONE_CHESTPLATE = ITEMS.register("moonstone_chestplate",
            () -> new ArmorItem(ArmorMaterial.MOONSTONE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> MOONSTONE_LEGGINGS = ITEMS.register("moonstone_leggings",
            () -> new ArmorItem(ArmorMaterial.MOONSTONE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> MOONSTONE_BOOTS = ITEMS.register("moonstone_boots",
            () -> new ArmorItem(ArmorMaterial.MOONSTONE, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> MOONSTONE_SHIELD = ITEMS.register("moonstone_shield",
            () -> new ArmorItem(ArmorMaterial.MOONSTONE, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> CHITIN_HELMET = ITEMS.register("chitin_helmet",
            () -> new ArmorItem(ArmorMaterial.CHITIN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CHITIN_CHESTPLATE = ITEMS.register("chitin_chestplate",
            () -> new ArmorItem(ArmorMaterial.CHITIN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> CHITIN_LEGGINGS = ITEMS.register("chitin_leggings",
            () -> new ArmorItem(ArmorMaterial.CHITIN, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> CHITIN_BOOTS = ITEMS.register("chitin_boots",
            () -> new ArmorItem(ArmorMaterial.CHITIN, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> CHITIN_SHIELD = ITEMS.register("chitin_shield",
            () -> new ArmorItem(ArmorMaterial.CHITIN, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_SICKLE = ITEMS.register("wooden_sickle",
            () -> new HoeItem(ModToolTiers.MOOONSTONE, 1, -1.5f, new Item.Properties()));
    public static final RegistryObject<Item> STONE_SICKLE = ITEMS.register("stone_sickle",
            () -> new HoeItem(ModToolTiers.MOOONSTONE, 1, -1.5f, new Item.Properties()));
    public static final RegistryObject<Item> IRON_SICKLE = ITEMS.register("iron_sickle",
            () -> new HoeItem(ModToolTiers.MOOONSTONE, 1, -1.5f, new Item.Properties()));
    public static final RegistryObject<Item> GOLD_SICKLE = ITEMS.register("gold_sickle",
            () -> new HoeItem(ModToolTiers.MOOONSTONE, 1, -1.5f, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_SICKLE = ITEMS.register("diamond_sickle",
            () -> new HoeItem(ModToolTiers.MOOONSTONE, 1, -1.5f, new Item.Properties()));
    //public static final RegistryObject<Item> Netherite_SICKLE = ITEMS.register("netherite_sickle",
            //() -> new HoeItem(ModToolTiers.MOOONSTONE, 1, -1.5f, new Item.Properties()));
    // Item-blocks:


}