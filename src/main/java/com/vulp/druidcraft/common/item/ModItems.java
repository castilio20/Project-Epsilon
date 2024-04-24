package com.vulp.druidcraft.common.item;

import com.vulp.druidcraft.Druidcraft;
import com.vulp.druidcraft.common.block.ModBlocks;

import com.vulp.druidcraft.common.fluid.ModFluids;
import com.vulp.druidcraft.common.item.custom.CustomBoatItem;
import com.vulp.druidcraft.common.item.custom.ModShield;
import com.vulp.druidcraft.common.item.custom.SickleItem;
import com.vulp.druidcraft.entity.custom.CustomBoatEntity;
import net.minecraft.world.food.Foods;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
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
    public static final RegistryObject<Item> DURAGEM = ITEMS.register("duragem",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BISMUTH = ITEMS.register("bismuth",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENCHANTED_SOAP = ITEMS.register("enchanted_soap",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_DIAMOND = ITEMS.register("crushed_diamond",
           () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CRUSHED_DURAGEM = ITEMS.register("crushed_duragem",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> KNIFE = ITEMS.register("knife",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FLOUR = ITEMS.register("flour",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DARKWOOD_SIGN = ITEMS.register("darkwood_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.DARKWOOD_SIGN.get(), ModBlocks.DARKWOOD_WALL_SIGN.get()));
    public static final RegistryObject<Item> DARKWOOD_HANGING_SIGN = ITEMS.register("darkwood_hanging_sign",
            () -> new HangingSignItem(ModBlocks.DARKWOOD_HANGING_SIGN.get(), ModBlocks.DARKWOOD_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> DARKWOOD_WOOD_BOAT_ITEM = ITEMS.register("darkwood_boat",
            () -> new CustomBoatItem(false, CustomBoatEntity.Type.DARKWOOD_WOOD, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> DARKWOOD_WOOD_CHEST_BOAT_ITEM = ITEMS.register("darkwood_chest_boat",
            () -> new CustomBoatItem(true, CustomBoatEntity.Type.DARKWOOD_WOOD, new Item.Properties().stacksTo(1)));
    //public static final RegistryObject<BlockItem> DARKWOOD_CHEST_I = registerItem("darkwood", ModBlocks.DARKWOOD_CHEST);
    //public static final RegistryObject<BlockItem> DARKWOOD_TRAPPED_CHEST_I = registerItem("darkwood_trapped", ModBlocks.DARKWOOD_TRAPPED_CHEST);

    public static final RegistryObject<Item> ELDER_SIGN = ITEMS.register("elder_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ELDER_SIGN.get(), ModBlocks.ELDER_WALL_SIGN.get()));
    public static final RegistryObject<Item> ELDER_HANGING_SIGN = ITEMS.register("elder_hanging_sign",
            () -> new HangingSignItem(ModBlocks.DARKWOOD_HANGING_SIGN.get(), ModBlocks.ELDER_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));
    public static final RegistryObject<Item> ELDER_WOOD_BOAT_ITEM = ITEMS.register("elder_boat",
            () -> new CustomBoatItem(false, CustomBoatEntity.Type.ELDER_WOOD, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ELDER_WOOD_CHEST_BOAT_ITEM = ITEMS.register("elder_chest_boat",
            () -> new CustomBoatItem(true, CustomBoatEntity.Type.ELDER_WOOD, new Item.Properties().stacksTo(1)));
    //public static final RegistryObject<BlockItem> ELDER_CHEST_I = registerItem("elder", ModBlocks.ELDER_CHEST);
    //public static final RegistryObject<BlockItem> ELDER_TRAPPED_CHEST_I = registerItem("elder_trapped", ModBlocks.ELDER_TRAPPED_CHEST);

    //Food
    public static final RegistryObject<Item> BLUEBERRIES = ITEMS.register("blueberries",
            () -> new ItemNameBlockItem(ModBlocks.BLUEBERRY_BUSH.get(), (new Item.Properties()).food(ModFoods.BLUEBERRIES)));
    public static final RegistryObject<Item> ELDERBERRIES = ITEMS.register("elderberries",
            () -> new Item(new Item.Properties().food(ModFoods.ELDERBERRIES)));
    public static final RegistryObject<Item> BLUEBERRY_MUFFIN = ITEMS.register("blueberry_muffin",
            () -> new Item(new Item.Properties().food(ModFoods.BLUEBERRY_MUFFIN)));
    public static final RegistryObject<Item> APPLE_ELDERBERRY_CRUMBLE = ITEMS.register("apple_elderberry_crumble",
            () -> new Item(new Item.Properties().food(ModFoods.APPLE_ELDERBERRY_CRUMBLE)));
    public static final RegistryObject<Item> SKYBERRIES = ITEMS.register("skyberries",
            () -> new Item(new Item.Properties().food(ModFoods.SKYBERRIES)));
    public static final RegistryObject<Item> LIVE_SKYBERRIES = ITEMS.register("live_skyberries",
            () -> new Item(new Item.Properties().food(ModFoods.LIVE_SKYBERRIES)));
    public static final RegistryObject<Item> DOUGH = ITEMS.register("dough",
            () -> new Item(new Item.Properties().food(ModFoods.DOUGH)));
    //Tools & Armour:
    public static final RegistryObject<Item> BONE_SWORD = ITEMS.register("bone_sword",
            () -> new SwordItem(ModToolTiers.BONE, 3, -2.6f, new Item.Properties()));
    public static final RegistryObject<Item> BONE_SHOVEL = ITEMS.register("bone_shovel",
            () -> new ShovelItem(ModToolTiers.BONE, 1, -3f, new Item.Properties()));
    public static final RegistryObject<Item> BONE_PICKAXE = ITEMS.register("bone_pickaxe",
            () -> new PickaxeItem(ModToolTiers.BONE, 1, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> BONE_AXE = ITEMS.register("bone_axe",
            () -> new AxeItem(ModToolTiers.BONE, 7, -3.2f, new Item.Properties()));
    public static final RegistryObject<Item> BONE_HOE = ITEMS.register("bone_hoe",
            () -> new HoeItem(ModToolTiers.BONE, 1, 0f, new Item.Properties()));
    public static final RegistryObject<Item> BONE_SICKLE = ITEMS.register("bone_sickle",
            () -> new SickleItem(Tiers.STONE, 1 ));
    public static final RegistryObject<Item> BONE_HELMET = ITEMS.register("bone_helmet",
            () -> new ArmorItem(ModArmorMaterials.BONE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> BONE_CHESTPLATE = ITEMS.register("bone_chestplate",
            () -> new ArmorItem(ModArmorMaterials.BONE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> BONE_LEGGINGS = ITEMS.register("bone_leggings",
            () -> new ArmorItem(ModArmorMaterials.BONE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> BONE_BOOTS = ITEMS.register("bone_boots",
            () -> new ArmorItem(ModArmorMaterials.BONE, ArmorItem.Type.BOOTS , new Item.Properties()));
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
    public static final RegistryObject<Item> FIERY_SWORD = ITEMS.register("fiery_sword",
            () -> new SwordItem(ModToolTiers.MOOONSTONE, 4, -2.4f, new Item.Properties()));
    public static final RegistryObject<Item> FIERY_SHOVEL = ITEMS.register("fiery_shovel",
            () -> new PickaxeItem(ModToolTiers.MOOONSTONE, 3, -3f, new Item.Properties()));
    public static final RegistryObject<Item> FIERY_PICKAXE = ITEMS.register("fiery_pickaxe",
            () -> new AxeItem(ModToolTiers.MOOONSTONE, 2, -2.8f, new Item.Properties()));
    public static final RegistryObject<Item> FIERY_AXE = ITEMS.register("fiery_axe",
            () -> new ShovelItem(ModToolTiers.MOOONSTONE, 8, -3.2f, new Item.Properties()));
    public static final RegistryObject<Item> FIERY_HOE = ITEMS.register("fiery_hoe",
            () -> new HoeItem(ModToolTiers.MOOONSTONE, 1, -2.0f, new Item.Properties()));
    public static final RegistryObject<Item> FIERY_SICKLE = ITEMS.register("fiery_sickle",
            () -> new HoeItem(ModToolTiers.MOOONSTONE, 1, -1.5f, new Item.Properties()));
    public static final RegistryObject<Item> MOONSTONE_HELMET = ITEMS.register("moonstone_helmet",
            () -> new ArmorItem(ModArmorMaterials.MOONSTONE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> MOONSTONE_CHESTPLATE = ITEMS.register("moonstone_chestplate",
            () -> new ArmorItem(ModArmorMaterials.MOONSTONE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> MOONSTONE_LEGGINGS = ITEMS.register("moonstone_leggings",
            () -> new ArmorItem(ModArmorMaterials.MOONSTONE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> MOONSTONE_BOOTS = ITEMS.register("moonstone_boots",
            () -> new ArmorItem(ModArmorMaterials.MOONSTONE, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> MOONSTONE_SHIELD = ITEMS.register("moonstone_shield",
            () -> new ShieldItem((new Item.Properties()).durability(336)));
    public static final RegistryObject<Item> CHITIN_HELMET = ITEMS.register("chitin_helmet",
            () -> new ArmorItem(ModArmorMaterials.CHITIN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> CHITIN_CHESTPLATE = ITEMS.register("chitin_chestplate",
            () -> new ArmorItem(ModArmorMaterials.CHITIN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> CHITIN_LEGGINGS = ITEMS.register("chitin_leggings",
            () -> new ArmorItem(ModArmorMaterials.CHITIN, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> CHITIN_BOOTS = ITEMS.register("chitin_boots",
            () -> new ArmorItem(ModArmorMaterials.CHITIN, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> FIERY_HELMET = ITEMS.register("fiery_helmet",
            () -> new ArmorItem(ModArmorMaterials.FIERY, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> FIERY_CHESTPLATE = ITEMS.register("fiery_chestplate",
            () -> new ArmorItem(ModArmorMaterials.FIERY, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> FIERY_LEGGINGS = ITEMS.register("fiery_leggings",
            () -> new ArmorItem(ModArmorMaterials.FIERY, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> FIERY_BOOTS = ITEMS.register("fiery_boots",
            () -> new ArmorItem(ModArmorMaterials.FIERY, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> CHITIN_SHIELD = ITEMS.register("chitin_shield",
            () -> new ModShield((new Item.Properties()).durability(336)));
    public static final RegistryObject<Item> WOODEN_SICKLE = ITEMS.register("wooden_sickle",
            () -> new SickleItem(Tiers.WOOD, 1));
    public static final RegistryObject<Item> STONE_SICKLE = ITEMS.register("stone_sickle",
            () -> new SickleItem(Tiers.STONE, 1));
    public static final RegistryObject<Item> IRON_SICKLE = ITEMS.register("iron_sickle",
            () -> new SickleItem(Tiers.IRON, 2));
    public static final RegistryObject<Item> GOLD_SICKLE = ITEMS.register("gold_sickle",
            () -> new SickleItem(Tiers.GOLD, 2));
    public static final RegistryObject<Item> DIAMOND_SICKLE = ITEMS.register("diamond_sickle",
            () -> new SickleItem(Tiers.DIAMOND, 3));
    public static final RegistryObject<Item> LIQUID_RAINBOW_BUCKET = ITEMS.register("liquid_rainbow_bucket",
            () -> new BucketItem(ModFluids.SOURCE_LIQUID_RAINBOW,
                    new Item.Properties()));

    //public static final RegistryObject<Item> Netherite_SICKLE = ITEMS.register("netherite_sickle",
            //() -> new HoeItem(ModToolTiers.MOOONSTONE, 1, -1.5f, new Item.Properties()));
    // Item-blocks:
    public static void registerItems(IEventBus modBus) {
        ITEMS.register(modBus);
    }
    public static RegistryObject<BlockItem> registerItem(String name, RegistryObject<Block> block) {
        return ITEMS.register(name + "_chest", ()-> new BlockItem(block.get(), new Item.Properties()));
    }}