package com.vulp.druidcraft.datagen;

import com.vulp.druidcraft.Druidcraft;
import com.vulp.druidcraft.common.block.HempCropBlock;
import com.vulp.druidcraft.common.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Locale;
import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Druidcraft.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.AMBER_BLOCK);
        blockWithItem(ModBlocks.DARKWOOD_PLANKS);
        blockWithItem(ModBlocks.MOONSTONE_BLOCK);
        blockWithItem(ModBlocks.FIERY_GLASS_BLOCK);
        blockWithItem(ModBlocks.FRUIT_PLANKS);
        saplingBlock(ModBlocks.DARKWOOD_SAPLING);
        saplingBlock(ModBlocks.ELDER_SAPLING);

        blockWithItem(ModBlocks.ROCKROOT_BLOCK);

        blockWithItem(ModBlocks.ELDER_PLANKS);
        //Ores
        blockWithItem(ModBlocks.AMBER_ORE);
        blockWithItem(ModBlocks.MOONSTONE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_DURAGEM_ORE);
        blockWithItem(ModBlocks.ROCKROOT_ORE);
        blockWithItem(ModBlocks.FIERY_GLASS_ORE);
        blockWithItem(ModBlocks.NETHER_FIERY_GLASS_ORE);


        //Panels
        blockWithItem(ModBlocks.OAK_PANELS);
        blockWithItem(ModBlocks.SPRUCE_PANELS);
        blockWithItem(ModBlocks.BIRCH_PANELS);
        blockWithItem(ModBlocks.JUNGLE_PANELS);
        blockWithItem(ModBlocks.ACACIA_PANELS);
        blockWithItem(ModBlocks.DARK_OAK_PANELS);
        blockWithItem(ModBlocks.DARKWOOD_PANELS);
        blockWithItem(ModBlocks.ELDER_PANELS);
        //Mud
        blockWithItem(ModBlocks.WET_MUD_BRICKS);
        blockWithItem(ModBlocks.DRY_MUD_BRICKS);
        //Ice
        blockWithItem(ModBlocks.ICE_BRICKS);
        blockWithItem(ModBlocks.WORKED_ICE);
        blockWithItem(ModBlocks.PACKED_ICE_BRICKS);
        blockWithItem(ModBlocks.WORKED_PACKED_ICE);
        //Sow
        blockWithItem(ModBlocks.SNOW_BRICKS);
        blockWithItem(ModBlocks.SNOW_TILES);
        //Cloud
        blockWithItem(ModBlocks.CLOUD_BLOCK);
        blockWithItem(ModBlocks.THUNDERCLOUD_BLOCK);
        blockWithItem(ModBlocks.CRYSTALIZED_THUNDERCLOUD_BLOCK);
        blockWithItem(ModBlocks.SULFUR_CLOUD_BLOCK);
        //Bricks
        blockWithItem(ModBlocks.MOSSY_BRICKS);

        //DarkWood
        logBlock(((RotatedPillarBlock) ModBlocks.DARKWOOD_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_DARKWOOD_LOG.get()));
        stairsBlock(((StairBlock) ModBlocks.DARKWOOD_STAIRS.get()), blockTexture(ModBlocks.DARKWOOD_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.DARKWOOD_SLAB.get()), blockTexture(ModBlocks.DARKWOOD_PLANKS.get()), blockTexture(ModBlocks.DARKWOOD_PLANKS.get()));
        simpleBlock(ModBlocks.DARKWOOD_WOOD.get(), models().cubeAll(ModBlocks.DARKWOOD_WOOD.getId().getPath(), prefix("block/" + ModBlocks.DARKWOOD_LOG.getId().getPath())));
        simpleBlock(ModBlocks.STRIPPED_DARKWOOD_WOOD.get(), models().cubeAll(ModBlocks.STRIPPED_DARKWOOD_WOOD.getId().getPath(), prefix("block/" + ModBlocks.STRIPPED_DARKWOOD_LOG.getId().getPath())));

        buttonBlock(((ButtonBlock) ModBlocks.DARKWOOD_BUTTON.get()), blockTexture(ModBlocks.DARKWOOD_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.DARKWOOD_PRESSURE_PLATE.get()), blockTexture(ModBlocks.DARKWOOD_PLANKS.get()));

        fenceBlock(((FenceBlock) ModBlocks.DARKWOOD_FENCE.get()), blockTexture(ModBlocks.DARKWOOD_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.DARKWOOD_FENCE_GATE.get()), blockTexture(ModBlocks.DARKWOOD_PLANKS.get()));

        doorBlockWithRenderType(((DoorBlock) ModBlocks.DARKWOOD_DOOR.get()), modLoc("block/darkwood_door_bottom"), modLoc("block/darkwood_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.DARKWOOD_TRAPDOOR.get()), modLoc("block/darkwood_trapdoor"), true, "cutout");
        signBlock(((StandingSignBlock) ModBlocks.DARKWOOD_SIGN.get()),
                ((WallSignBlock) ModBlocks.DARKWOOD_WALL_SIGN.get()),
               blockTexture(ModBlocks.DARKWOOD_PLANKS.get()));

        hangingSignBlock(ModBlocks.DARKWOOD_HANGING_SIGN.get(), ModBlocks.DARKWOOD_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.DARKWOOD_PLANKS.get()));
        //ElderWood
        simpleBlock(ModBlocks.ELDER_WOOD.get(), models().cubeAll(ModBlocks.ELDER_WOOD.getId().getPath(), prefix("block/" + ModBlocks.ELDER_LOG.getId().getPath())));
        simpleBlock(ModBlocks.STRIPPED_ELDER_WOOD.get(), models().cubeAll(ModBlocks.STRIPPED_ELDER_WOOD.getId().getPath(), prefix("block/" + ModBlocks.STRIPPED_ELDER_LOG.getId().getPath())));

        stairsBlock(((StairBlock) ModBlocks.ELDER_STAIRS.get()), blockTexture(ModBlocks.ELDER_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.ELDER_SLAB.get()), blockTexture(ModBlocks.ELDER_PLANKS.get()), blockTexture(ModBlocks.ELDER_PLANKS.get()));

        buttonBlock(((ButtonBlock) ModBlocks.ELDER_BUTTON.get()), blockTexture(ModBlocks.ELDER_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.ELDER_PRESSURE_PLATE.get()), blockTexture(ModBlocks.ELDER_PLANKS.get()));

        fenceBlock(((FenceBlock) ModBlocks.ELDER_FENCE.get()), blockTexture(ModBlocks.ELDER_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.ELDER_FENCE_GATE.get()), blockTexture(ModBlocks.ELDER_PLANKS.get()));
        doorBlockWithRenderType(((DoorBlock) ModBlocks.ELDER_DOOR.get()), modLoc("block/elder_door_bottom"), modLoc("block/elder_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.ELDER_TRAPDOOR.get()), modLoc("block/elder_trapdoor"), true, "cutout");
        logBlock(((RotatedPillarBlock) ModBlocks.ELDER_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_ELDER_LOG.get()));
        //Fruit
        logBlock(((RotatedPillarBlock) ModBlocks.FRUIT_LOG.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_FRUIT_LOG.get()));
        simpleBlock(ModBlocks.FRUIT_WOOD.get(), models().cubeAll(ModBlocks.FRUIT_WOOD.getId().getPath(), prefix("block/" + ModBlocks.FRUIT_LOG.getId().getPath())));
        simpleBlock(ModBlocks.STRIPPED_FRUIT_WOOD.get(), models().cubeAll(ModBlocks.STRIPPED_FRUIT_WOOD.getId().getPath(), prefix("block/" + ModBlocks.STRIPPED_FRUIT_LOG.getId().getPath())));
        //Mud
        stairsBlock(((StairBlock) ModBlocks.DRY_MUD_BRICK_STAIRS.get()), blockTexture(ModBlocks.DRY_MUD_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.DRY_MUD_BRICK_SLAB.get()), blockTexture(ModBlocks.DRY_MUD_BRICKS.get()), blockTexture(ModBlocks.DRY_MUD_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.DRY_MUD_BRICK_WALL.get()), blockTexture(ModBlocks.DRY_MUD_BRICKS.get()));
        //Flowers

        //Beam
        logBlock(((RotatedPillarBlock) ModBlocks.OAK_BEAM.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.SPRUCE_BEAM.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.BIRCH_BEAM.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.JUNGLE_BEAM.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.ACACIA_BEAM.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.DARK_OAK_BEAM.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.DARKWOOD_BEAM.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_DARKWOOD_BEAM.get()));
        logBlock(((RotatedPillarBlock) ModBlocks.ELDER_BEAM.get()));




        blockItem(ModBlocks.DARKWOOD_LOG);
        blockItem(ModBlocks.STRIPPED_DARKWOOD_LOG);
        blockItem(ModBlocks.STRIPPED_DARKWOOD_WOOD);



        blockItem(ModBlocks.ELDER_LOG);
        blockItem(ModBlocks.STRIPPED_ELDER_LOG);
        blockItem(ModBlocks.STRIPPED_ELDER_WOOD);

        //
        leavesBlock(ModBlocks.DARKWOOD_LEAVES);
        leavesBlock(ModBlocks.ELDER_LEAVES);


    }




    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }
    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(Druidcraft.MODID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }


    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    public static ResourceLocation prefix(String name) {
        return new ResourceLocation(Druidcraft.MODID, name.toLowerCase(Locale.ROOT));
}}