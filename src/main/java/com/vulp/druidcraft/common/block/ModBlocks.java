package com.vulp.druidcraft.common.block;

import com.vulp.druidcraft.Druidcraft;
import com.vulp.druidcraft.common.fluid.ModFluids;
import com.vulp.druidcraft.worldgen.tree.growers.DarkwoodWoodTree;
import com.vulp.druidcraft.worldgen.tree.growers.ElderWoodTree;
import com.vulp.druidcraft.common.block.custom.*;
import com.vulp.druidcraft.common.item.ModItems;
import com.vulp.druidcraft.common.util.ModWoodTypes;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;


public class ModBlocks {
        public static final DeferredRegister<Block> BLOCKS =
                DeferredRegister.create(ForgeRegistries.BLOCKS, Druidcraft.MODID);
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Druidcraft.MODID);

    private static final DeferredRegister<BlockEntityType<?>> BLOCKS_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, Druidcraft.MODID);
    public static final RegistryObject<Block> AMBER_ORE = registerBlock("amber_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));
    public static final RegistryObject<Block> MOONSTONE_ORE = registerBlock("moonstone_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));
    public static final RegistryObject<Block> FIERY_GLASS_ORE = registerBlock("fiery_glass_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));
    public static final RegistryObject<Block> ROCKROOT_ORE = registerBlock("rockroot_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(2f).requiresCorrectToolForDrops(), UniformInt.of(3, 6)));
    public static final RegistryObject<Block> DEEPSLATE_DURAGEM_ORE = registerBlock("duragem_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE)
                    .strength(3f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> NETHER_BRIGHTSTONE_ORE = registerBlock("brightstone_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .strength(1f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));
    public static final RegistryObject<Block> NETHER_FIERY_GLASS_ORE = registerBlock("nether_fiery_glass_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)
                    .strength(1f).requiresCorrectToolForDrops(), UniformInt.of(3, 7)));

    public static final RegistryObject<Block> AMBER_BLOCK = registerBlock("amber_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> HEMP_CROP = BLOCKS.register("hemp_crop",
            () -> new HempCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().randomTicks()
                    .offsetType(BlockBehaviour.OffsetType.NONE)
                    .instabreak()
                    .sound(SoundType.CROP)));
    public static final RegistryObject<Block> MOONSTONE_BLOCK = registerBlock("moonstone_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> FIERY_GLASS_BLOCK = registerBlock("fiery_glass_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ROCKROOT_BLOCK = registerBlock("rockroot_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CERAMIC_LANTERN = registerBlock("ceramic_lantern",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.LANTERN).lightLevel((state)->15).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> DARKWOOD_LOG = registerBlock("darkwood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> DARKWOOD_WOOD = registerBlock("darkwood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_DARKWOOD_LOG= registerBlock("stripped_darkwood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> DARKWOOD_LEAVES = registerBlock("darkwood_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });

    public static final RegistryObject<Block> DARKWOOD_SAPLING = registerBlock("darkwood_sapling",
            () -> new SaplingBlock(new DarkwoodWoodTree(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> DARKWOOD_PLANKS = registerBlock("darkwood_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> STRIPPED_DARKWOOD_WOOD = registerBlock("stripped_darkwood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> DARKWOOD_SLAB = registerBlock("darkwood_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> DARKWOOD_STAIRS = registerBlock("darkwood_stairs",
            () -> new StairBlock(() -> ModBlocks.DARKWOOD_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> DARKWOOD_FENCE = registerBlock("darkwood_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> DARKWOOD_FENCE_GATE = registerBlock("darkwood_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST), SoundEvents.CHAIN_PLACE, SoundEvents.ANVIL_BREAK));
    public static final RegistryObject<Block> DARKWOOD_PRESSURE_PLATE = registerBlock("darkwood_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST),
                    BlockSetType.IRON));
    public static final RegistryObject<Block> DARKWOOD_BUTTON = registerBlock("darkwood_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.AMETHYST),
                    BlockSetType.IRON, 10, true));

    public static final RegistryObject<Block> DARKWOOD_TRAPDOOR = registerBlock("darkwood_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST).noOcclusion(), BlockSetType.IRON));
    public static final RegistryObject<Block> DARKWOOD_DOOR = registerBlock("darkwood_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> DARKWOOD_SIGN = BLOCKS.register("darkwood_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.DARKWOOD));
    public static final RegistryObject<Block> DARKWOOD_WALL_SIGN = BLOCKS.register("darkwood_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.DARKWOOD));

    public static final RegistryObject<Block> DARKWOOD_HANGING_SIGN = BLOCKS.register("darkwood_hanging_sign",
            () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.DARKWOOD));
    public static final RegistryObject<Block> DARKWOOD_WALL_HANGING_SIGN = BLOCKS.register("darkwood_wall_hanging_sign",
            () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.DARKWOOD));

    //public static final RegistryObject<Block> DARKWOOD_CHEST = registerChest("darkwood", () -> new ModChestBlock(MapColor.WOOD, "darkwood"));
   // public static final RegistryObject<Block> DARKWOOD_TRAPPED_CHEST = registerChest("darkwood_trapped", () -> new ModTrappedChestBlock(MapColor.WOOD, "darkwood_trapped"));

    public static final RegistryObject<Block> DARKWOOD_BOOKSHELF = registerBlock("darkwood_bookshelf",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> DARKWOOD_LADDER = registerBlock("darkwood_ladder",
            () -> new LadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> DARKWOOD_BEEHIVE = registerBlock("darkwood_beehive",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    //Elder
    public static final RegistryObject<Block> ELDER_LOG = registerBlock("elder_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> ELDER_WOOD = registerBlock("elder_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_ELDER_LOG= registerBlock("stripped_elder_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> ELDER_LEAVES = registerBlock("elder_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });
    public static final RegistryObject<Block> ELDER_SAPLING = registerBlock("elder_sapling",
            () -> new SaplingBlock(new ElderWoodTree(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> ELDER_PLANKS = registerBlock("elder_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> STRIPPED_ELDER_WOOD = registerBlock("stripped_elder_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> ELDER_SLAB = registerBlock("elder_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ELDER_STAIRS = registerBlock("elder_stairs",
            () -> new StairBlock(() -> ModBlocks.DARKWOOD_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ELDER_FENCE = registerBlock("elder_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ELDER_FENCE_GATE = registerBlock("elder_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST), SoundEvents.CHAIN_PLACE, SoundEvents.ANVIL_BREAK));
    public static final RegistryObject<Block> ELDER_PRESSURE_PLATE = registerBlock("elder_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST),
                    BlockSetType.IRON));
    public static final RegistryObject<Block> ELDER_BUTTON = registerBlock("elder_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON).sound(SoundType.AMETHYST),
                    BlockSetType.IRON, 10, true));
    public static final RegistryObject<Block> ELDER_TRAPDOOR = registerBlock("elder_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST).noOcclusion(), BlockSetType.IRON));
    public static final RegistryObject<Block> ELDER_DOOR = registerBlock("elder_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST).noOcclusion(), BlockSetType.OAK));
    public static final RegistryObject<Block> ELDER_SIGN = BLOCKS.register("elder_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.ELDER));
    public static final RegistryObject<Block> ELDER_WALL_SIGN = BLOCKS.register("elder_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.ELDER));
    public static final RegistryObject<Block> ELDER_HANGING_SIGN = BLOCKS.register("elder_hanging_sign",
            () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.ELDER));
    public static final RegistryObject<Block> ELDER_WALL_HANGING_SIGN = BLOCKS.register("elder_wall_hanging_sign",
            () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.ELDER));
    //public static final RegistryObject<Block> ELDER_CHEST = registerChest("elder", () -> new ModChestBlock(MapColor.WOOD, "elder"));
   //public static final RegistryObject<Block> ELDER_TRAPPED_CHEST = registerChest("elder_trapped", () -> new ModTrappedChestBlock(MapColor.WOOD, "elder_traped"));

    public static final RegistryObject<Block> ELDER_BOOKSHELF = registerBlock("elder_bookshelf",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BOOKSHELF).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ELDER_LADDER = registerBlock("elder_ladder",
            () -> new LadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ELDER_BEEHIVE = registerBlock("elder_beehive",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    //Beam blocks
    public static final RegistryObject<Block> OAK_BEAM = registerBlock("oak_beam",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> SPRUCE_BEAM = registerBlock("spruce_beam",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> BIRCH_BEAM = registerBlock("birch_beam",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> JUNGLE_BEAM = registerBlock("jungle_beam",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> ACACIA_BEAM = registerBlock("acacia_beam",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> DARK_OAK_BEAM = registerBlock("dark_oak_beam",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> DARKWOOD_BEAM = registerBlock("darkwood_beam",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_DARKWOOD_BEAM = registerBlock("stripped_darkwood_beam",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> ELDER_BEAM = registerBlock("elder_beam",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    //Panels
    public static final RegistryObject<Block> OAK_PANELS = registerBlock("oak_panels",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SPRUCE_PANELS = registerBlock("spruce_panels",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BIRCH_PANELS = registerBlock("birch_panels",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> JUNGLE_PANELS = registerBlock("jungle_panels",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ACACIA_PANELS = registerBlock("acacia_panels",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> DARK_OAK_PANELS = registerBlock("dark_oak_panels",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> DARKWOOD_PANELS = registerBlock("darkwood_panels",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ELDER_PANELS = registerBlock("elder_panels",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> OAK_ORNATE = registerBlock("oak_ornate_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SPRUCE_ORNATE = registerBlock("spruce_ornate_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BIRCH_ORNATE = registerBlock("birch_ornate_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> JUNGLE_ORNATE = registerBlock("jungle_ornate_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> ACACIA_ORNATE = registerBlock("acacia_ornate_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> DARK_OAK_ORNATE = registerBlock("dark_oak_ornate_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    //Fruit
    public static final RegistryObject<Block> FRUIT_LOG = registerBlock("fruit_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> FRUIT_PLANKS = registerBlock("fruit_planks",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_FRUIT_LOG = registerBlock("stripped_fruit_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> FRUIT_WOOD = registerBlock("fruit_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_FRUIT_WOOD = registerBlock("stripped_fruit_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));

    //Mud
    public static final RegistryObject<Block> WET_MUD_BRICKS = registerBlock("wet_mud_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> DRY_MUD_BRICKS = registerBlock("dry_mud_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> DRY_MUD_BRICK_SLAB = registerBlock("dry_mud_brick_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> DRY_MUD_BRICK_STAIRS = registerBlock("dry_mud_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.DRY_MUD_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> DRY_MUD_BRICK_WALL= registerBlock("dry_mud_brick_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.AMETHYST)));
    //Ice
    public static final RegistryObject<Block> ICE_BRICKS = registerBlock("ice_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ICE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> WORKED_ICE = registerBlock("worked_ice",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ICE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> PACKED_ICE_BRICKS = registerBlock("packed_ice_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ICE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> WORKED_PACKED_ICE = registerBlock("worked_packed_ice",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ICE).sound(SoundType.AMETHYST)));
    //Snow
    public static final RegistryObject<Block> SNOW_BRICKS = registerBlock("snow_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ICE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SNOW_TILES = registerBlock("snow_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.ICE).sound(SoundType.AMETHYST)));
    //Bricks
    public static final RegistryObject<Block> MOSSY_BRICKS = registerBlock("mossy_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.AMETHYST)));
    //Cloud
    public static final RegistryObject<Block> CLOUD_BLOCK = registerBlock("cloud_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> THUNDERCLOUD_BLOCK = registerBlock("thundercloud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> CRYSTALIZED_THUNDERCLOUD_BLOCK = registerBlock("crystalized_thundercloud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> SULFUR_CLOUD_BLOCK = registerBlock("sulfur_cloud",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).sound(SoundType.AMETHYST)));
    //Misc
    public static final RegistryObject<Block> MORTAR_AND_PESTLE = registerBlock("mortar_and_pestle",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));

    public static final RegistryObject<LiquidBlock> LIQUID_RAINBOW_BLOCK = BLOCKS.register("liquid_rainbow",
            () -> new LiquidBlock(ModFluids.SOURCE_LIQUID_RAINBOW, BlockBehaviour.Properties.copy(Blocks.WATER)));
    //Flowers
    public static final RegistryObject<Block> LAVENDER = registerBlock("lavender",
            () -> new FlowerBlock(() -> MobEffects.LUCK, 5,
                    BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission()));
    public static final RegistryObject<Block> POTTED_LAVENDER = BLOCKS.register("potted_lavender",
            () -> new FlowerPotBlock(() -> ((FlowerPotBlock) Blocks.FLOWER_POT), ModBlocks.LAVENDER,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));
    public static final RegistryObject<Block> OAK_SMALL_BEAM = registerBlock("oak_small_beam",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).sound(SoundType.AMETHYST)));
    public static final RegistryObject<Block> BLUEBERRY_BUSH = registerBlock("blueberry_bush",
            () ->new BlueberryBushBlock(BlockBehaviour.Properties.of().mapColor(MapColor.PLANT).randomTicks().noCollission().sound(SoundType.SWEET_BERRY_BUSH).pushReaction(PushReaction.DESTROY)));
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }


    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
    private static RegistryObject<Block> registerChest(String name, Supplier<Block> block) {
        return BLOCKS.register(name + "_chest", block);}


    }



