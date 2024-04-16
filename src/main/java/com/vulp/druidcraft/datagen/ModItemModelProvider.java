package com.vulp.druidcraft.datagen;

import com.vulp.druidcraft.Druidcraft;
import com.vulp.druidcraft.common.block.ModBlocks;
import com.vulp.druidcraft.common.item.ModItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import java.util.LinkedHashMap;
import java.util.Locale;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Druidcraft.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.AMBER);
        simpleItem(ModItems.BLAZING_STEEL);
        simpleItem(ModItems.CHITIN);
        simpleItem(ModItems.HEMP);
        simpleItem(ModItems.HEMP_SEEDS);
        simpleItem(ModItems.KNIFE);
        simpleItem(ModItems.MOONSTONE);
        simpleItem(ModItems.ROCKROOT);
        simpleItem(ModItems.TEMPERED_FIERY_GLASS);
        simpleItem(ModItems.FIERY_GLASS);
        simpleItem(ModItems.BRIGHTSTONE);
        simpleItem(ModItems.CRUSHED_FIERY_GLASS);
        simpleItem(ModItems.HEART_OF_BLAZE);
        simpleItem(ModItems.HEMP_SEEDS);
        //Food
        simpleItem(ModItems.APPLE_ELDERBERRY_CRUMBLE);
        simpleItem(ModItems.BLUEBERRIES);
        simpleItem(ModItems.BLUEBERRY_MUFFIN);
        simpleItem(ModItems.ELDERBERRIES);
        simpleItem(ModItems.SKYBERRIES);
        simpleItem(ModItems.FLOUR);
        simpleItem(ModItems.DOUGH);

        //BLOCKS


        //DarkWood
        toBlock(ModBlocks.DARKWOOD_WOOD.get());
        simpleItem(ModItems.DARKWOOD_SIGN);
        //simpleItem(ModItems.DARKWOOD_HANGING_SIGN);
        simpleBlockItem(ModBlocks.DARKWOOD_DOOR);

        fenceItem(ModBlocks.DARKWOOD_FENCE, ModBlocks.DARKWOOD_PLANKS);
        buttonItem(ModBlocks.DARKWOOD_BUTTON, ModBlocks.DARKWOOD_PLANKS);
        evenSimplerBlockItem(ModBlocks.DARKWOOD_STAIRS);
        evenSimplerBlockItem(ModBlocks.DARKWOOD_SLAB);
        evenSimplerBlockItem(ModBlocks.DARKWOOD_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.DARKWOOD_FENCE_GATE);
        simpleItem(ModItems.DARKWOOD_WOOD_BOAT_ITEM);
        //simpleItem(ModItems.PINE_CHEST_BOAT);
        trapdoorItem(ModBlocks.DARKWOOD_TRAPDOOR);
        //ElderWood
        simpleBlockItem(ModBlocks.ELDER_DOOR);
        toBlock(ModBlocks.ELDER_WOOD.get());
        toBlock(ModBlocks.STRIPPED_ELDER_WOOD.get());


        fenceItem(ModBlocks.ELDER_FENCE, ModBlocks.ELDER_PLANKS);
        buttonItem(ModBlocks.ELDER_BUTTON, ModBlocks.ELDER_PLANKS);
        evenSimplerBlockItem(ModBlocks.ELDER_STAIRS);
        evenSimplerBlockItem(ModBlocks.ELDER_SLAB);
        evenSimplerBlockItem(ModBlocks.ELDER_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.ELDER_FENCE_GATE);

        trapdoorItem(ModBlocks.ELDER_TRAPDOOR);
        //TOOLS
        handheldItem(ModItems.BONE_SWORD);
        handheldItem(ModItems.BONE_PICKAXE);
        handheldItem(ModItems.BONE_AXE);
        handheldItem(ModItems.BONE_SHOVEL);
        handheldItem(ModItems.BONE_HOE);
        handheldItem(ModItems.BONE_SICKLE);

        handheldItem(ModItems.MOONSTONE_SWORD);
        handheldItem(ModItems.MOONSTONE_PICKAXE);
        handheldItem(ModItems.MOONSTONE_AXE);
        handheldItem(ModItems.MOONSTONE_SHOVEL);
        handheldItem(ModItems.MOONSTONE_HOE);
        handheldItem(ModItems.MOONSTONE_SICKLE);
        //handheldItem(ModItems.CHITIN_SHIELD);


        trimmedArmorItem(ModItems.BONE_HELMET);
        trimmedArmorItem(ModItems.BONE_CHESTPLATE);
        trimmedArmorItem(ModItems.BONE_LEGGINGS);
        trimmedArmorItem(ModItems.BONE_BOOTS);

        trimmedArmorItem(ModItems.CHITIN_HELMET);
        trimmedArmorItem(ModItems.CHITIN_CHESTPLATE);
        trimmedArmorItem(ModItems.CHITIN_LEGGINGS);
        trimmedArmorItem(ModItems.CHITIN_BOOTS);

        trimmedArmorItem(ModItems.FIERY_HELMET);
        trimmedArmorItem(ModItems.FIERY_CHESTPLATE);
        trimmedArmorItem(ModItems.FIERY_LEGGINGS);
        trimmedArmorItem(ModItems.FIERY_BOOTS);

        trimmedArmorItem(ModItems.MOONSTONE_HELMET);
        trimmedArmorItem(ModItems.MOONSTONE_CHESTPLATE);
        trimmedArmorItem(ModItems.MOONSTONE_LEGGINGS);
        trimmedArmorItem(ModItems.MOONSTONE_BOOTS);

        handheldItem(ModItems.WOODEN_SICKLE);
        handheldItem(ModItems.STONE_SICKLE);
        handheldItem(ModItems.IRON_SICKLE);
        handheldItem(ModItems.GOLD_SICKLE);
        handheldItem(ModItems.DIAMOND_SICKLE);
        //handheldItem(ModItems.Netherite_SICKLE);
    }
    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = Druidcraft.MODID; // Change this to your mod id

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = new ResourceLocation(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = new ResourceLocation(MOD_ID, currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                new ResourceLocation(MOD_ID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Druidcraft.MODID,"item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(Druidcraft.MODID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(Druidcraft.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(Druidcraft.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Druidcraft.MODID,"item/" + item.getId().getPath()));
    }




    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Druidcraft.MODID,"item/" + item.getId().getPath()));
    }
    private void toBlock(Block b) {
        toBlockModel(b, BuiltInRegistries.BLOCK.getKey(b).getPath());
    }

    private void woodBlock(Block b, String variant) {
        woodBlockModel(b, BuiltInRegistries.BLOCK.getKey(b).getPath(), variant);
    }

    private void toBlockModel(Block b, String model) {
        toBlockModel(b, prefix("block/" + model));
    }

    private void woodBlockModel(Block b, String model, String variant) {
        toBlockModel(b, prefix("block/wood/" + variant + "/" + model));
    }

    private void toBlockModel(Block b, ResourceLocation model) {
        withExistingParent(BuiltInRegistries.BLOCK.getKey(b).getPath(), model);
    }
    public static ResourceLocation prefix(String name) {
        return new ResourceLocation(Druidcraft.MODID, name.toLowerCase(Locale.ROOT));
}}
