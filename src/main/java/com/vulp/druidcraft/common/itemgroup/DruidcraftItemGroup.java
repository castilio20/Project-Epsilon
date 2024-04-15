package com.vulp.druidcraft.common.itemgroup;

import com.vulp.druidcraft.common.block.ModBlocks;
import com.vulp.druidcraft.common.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static net.minecraftforge.versions.forge.ForgeVersion.MOD_ID;



public class DruidcraftItemGroup {public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.HEMP.get()))
                    .title(Component.translatable("Druidcraft"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.HEMP.get());
                        pOutput.accept(ModItems.HEMP_SEEDS.get());
                        pOutput.accept(ModItems.MOONSTONE.get());
                        pOutput.accept(ModItems.ROCKROOT.get());
                        pOutput.accept(ModItems.TEMPERED_FIERY_GLASS.get());
                        pOutput.accept(ModItems.AMBER.get());
                        pOutput.accept(ModItems.FIERY_GLASS.get());
                        pOutput.accept(ModItems.BLAZING_STEEL.get());
                        pOutput.accept(ModItems.BRIGHTSTONE.get());
                        pOutput.accept(ModItems.CHITIN.get());
                        pOutput.accept(ModItems.CRUSHED_FIERY_GLASS.get());
                        pOutput.accept(ModItems.HEART_OF_BLAZE.get());
                        pOutput.accept(ModItems.KNIFE.get());
                        //TOOLS ARMOR
                        pOutput.accept(ModItems.BONE_SWORD.get());
                        pOutput.accept(ModItems.BONE_SHOVEL.get());
                        pOutput.accept(ModItems.BONE_PICKAXE.get());
                        pOutput.accept(ModItems.BONE_AXE.get());
                        pOutput.accept(ModItems.BONE_HOE.get());
                        pOutput.accept(ModItems.BONE_SICKLE.get());
                        pOutput.accept(ModItems.BONE_HELMET.get());
                        pOutput.accept(ModItems.BONE_CHESTPLATE.get());
                        pOutput.accept(ModItems.BONE_LEGGINGS.get());
                        pOutput.accept(ModItems.BONE_BOOTS.get());

                        pOutput.accept(ModItems.CHITIN_HELMET.get());
                        pOutput.accept(ModItems.CHITIN_CHESTPLATE.get());
                        pOutput.accept(ModItems.CHITIN_LEGGINGS.get());
                        pOutput.accept(ModItems.CHITIN_BOOTS.get());

                        pOutput.accept(ModItems.MOONSTONE_SWORD.get());
                        pOutput.accept(ModItems.MOONSTONE_SHOVEL.get());
                        pOutput.accept(ModItems.MOONSTONE_PICKAXE.get());
                        pOutput.accept(ModItems.MOONSTONE_AXE.get());
                        pOutput.accept(ModItems.MOONSTONE_HOE.get());
                        pOutput.accept(ModItems.MOONSTONE_SICKLE.get());
                        pOutput.accept(ModItems.MOONSTONE_HELMET.get());
                        pOutput.accept(ModItems.MOONSTONE_CHESTPLATE.get());
                        pOutput.accept(ModItems.MOONSTONE_LEGGINGS.get());
                        pOutput.accept(ModItems.MOONSTONE_BOOTS.get());
                        pOutput.accept(ModItems.WOODEN_SICKLE.get());
                        pOutput.accept(ModItems.STONE_SICKLE.get());
                        pOutput.accept(ModItems.IRON_SICKLE.get());
                        pOutput.accept(ModItems.GOLD_SICKLE.get());
                        pOutput.accept(ModItems.DIAMOND_SICKLE.get());
                        //pOutput.accept(ModItems.Netherite_SICKLE.get());

                   //blocks and items
                        pOutput.accept(ModBlocks.AMBER_BLOCK.get());
                        pOutput.accept(ModBlocks.MOONSTONE_BLOCK.get());
                        pOutput.accept(ModBlocks.FIERY_GLASS_BLOCK.get());
                        pOutput.accept(ModBlocks.ROCKROOT_BLOCK.get());
                        //DarkWood
                        pOutput.accept(ModBlocks.DARKWOOD_LOG.get());
                        pOutput.accept(ModBlocks.DARKWOOD_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_DARKWOOD_LOG.get());
                        pOutput.accept(ModBlocks.DARKWOOD_LEAVES.get());
                        pOutput.accept(ModBlocks.DARKWOOD_SAPLING.get());
                        pOutput.accept(ModBlocks.DARKWOOD_PLANKS.get());
                        pOutput.accept(ModBlocks.STRIPPED_DARKWOOD_WOOD.get());
                        pOutput.accept(ModBlocks.DARKWOOD_SLAB.get());
                        pOutput.accept(ModBlocks.DARKWOOD_STAIRS.get());
                        pOutput.accept(ModBlocks.DARKWOOD_FENCE.get());
                        pOutput.accept(ModBlocks.DARKWOOD_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.DARKWOOD_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.DARKWOOD_BUTTON.get());
                        pOutput.accept(ModBlocks.DARKWOOD_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.DARKWOOD_DOOR.get());
                        //pOutput.accept(ModItems.DARKWOOD_BOAT.get());
                        pOutput.accept(ModItems.DARKWOOD_SIGN.get());
                        pOutput.accept(ModItems.DARKWOOD_HANGING_SIGN.get());
                        pOutput.accept(ModBlocks.DARKWOOD_CHEST.get());
                        pOutput.accept(ModBlocks.TRAPPED_DARKWOOD_CHEST.get());
                        pOutput.accept(ModBlocks.DARKWOOD_BOOKSHELF.get());
                        pOutput.accept(ModBlocks.DARKWOOD_LADDER.get());
                        pOutput.accept(ModBlocks.DARKWOOD_BEEHIVE.get());
                        //ElderWood
                        pOutput.accept(ModBlocks.ELDER_LOG.get());
                        pOutput.accept(ModBlocks.ELDER_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_ELDER_LOG.get());
                        pOutput.accept(ModBlocks.ELDER_LEAVES.get());
                        pOutput.accept(ModBlocks.ELDER_SAPLING.get());
                        pOutput.accept(ModBlocks.ELDER_PLANKS.get());
                        pOutput.accept(ModBlocks.STRIPPED_ELDER_WOOD.get());
                        pOutput.accept(ModBlocks.ELDER_SLAB.get());
                        pOutput.accept(ModBlocks.ELDER_STAIRS.get());
                        pOutput.accept(ModBlocks.ELDER_FENCE.get());
                        pOutput.accept(ModBlocks.ELDER_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.ELDER_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.ELDER_BUTTON.get());
                        pOutput.accept(ModBlocks.ELDER_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.ELDER_DOOR.get());
                        pOutput.accept(ModBlocks.ELDER_BOAT.get());
                        //pOutput.accept(ModItems.ELDER_SIGN.get());
                        //pOutput.accept(ModItems.ELDER_HANGING_SIGN.get());
                        pOutput.accept(ModBlocks.ELDER_CHEST.get());
                        pOutput.accept(ModBlocks.TRAPPED_ELDER_CHEST.get());
                        pOutput.accept(ModBlocks.ELDER_BOOKSHELF.get());
                        pOutput.accept(ModBlocks.ELDER_LADDER.get());
                        pOutput.accept(ModBlocks.ELDER_BEEHIVE.get());
                        //Food
                        //pOutput.accept(ModItems.APPLE_ELDERBERRY.get());
                        pOutput.accept(ModItems.BLUEBERRIES.get());
                        pOutput.accept(ModItems.BLUEBERRY_MUFFIN.get());
                        pOutput.accept(ModItems.ELDERBERRIES.get());
                        pOutput.accept(ModItems.SKYBERRIES.get());
                        pOutput.accept(ModItems.FLOUR.get());
                        pOutput.accept(ModItems.DOUGH.get());
                        //Flowers
                        //pOutput.accept(ModBlocks.ELDERFLOWER_CORDIAL.get());
                        //pOutput.accept(ModBlocks.DOUGH.get());











                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}

