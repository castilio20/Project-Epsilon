package com.vulp.druidcraft;

import com.vulp.druidcraft.common.block.ModBlocks;
import com.vulp.druidcraft.common.block.custom.ModBlockEntities;
import com.vulp.druidcraft.common.block.render.ModChestRenderer;
import com.vulp.druidcraft.common.block.render.ModTrappedChestRenderer;
import com.vulp.druidcraft.common.fluid.ModFluidTypes;
import com.vulp.druidcraft.common.fluid.ModFluids;
import com.vulp.druidcraft.common.item.ModItems;
import com.vulp.druidcraft.common.itemgroup.DruidcraftItemGroup;
import com.vulp.druidcraft.common.util.ModWoodTypes;
import com.vulp.druidcraft.entity.Entities;
import com.vulp.druidcraft.entity.client.render.CustomBoatModel;
import com.vulp.druidcraft.entity.custom.CustomBoatEntity;
import com.vulp.druidcraft.worldgen.tree.ModFoliagePlacers;
import com.vulp.druidcraft.worldgen.tree.ModTrunkPlacerTypes;
import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.ChestBoatModel;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


import static com.vulp.druidcraft.common.block.ModBlocks.BLOCKS;
import static com.vulp.druidcraft.common.item.ModItems.ITEMS;

@Mod("druidcraft")
public class Druidcraft {
    public static final String MODID = "druidcraft";

    public Druidcraft() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::commonSetup);

        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        ModTrunkPlacerTypes.register(modEventBus);
        ModFoliagePlacers.register(modEventBus);
        Entities.ENTITIES.register(modEventBus);
        ModFluids.register(modEventBus);
        ModFluidTypes.register(modEventBus);
        ModBlockEntities.registerBlocks(modEventBus);
        DruidcraftItemGroup.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.LAVENDER.getId(), ModBlocks.POTTED_LAVENDER);
        BlockEntityRenderers.register(ModBlockEntities.MOD_CHEST_BLOCK_ENTITY.get(), ModChestRenderer::new);
        BlockEntityRenderers.register(ModBlockEntities.MOD_TRAPPED_CHEST_BLOCK_ENTITY.get(), ModTrappedChestRenderer::new);

    };



    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.HEMP);
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onRenderTypeSetup(FMLClientSetupEvent event) {
            Sheets.addWoodType(ModWoodTypes.DARKWOOD);

            EntityRenderers.register(Entities.MOD_BOAT.get(), m -> new CustomBoatModel(m, false));
            EntityRenderers.register(Entities.MOD_CHEST_BOAT.get(), m -> new CustomBoatModel(m, true));
        }

        @SubscribeEvent
        public static void onRegisterLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
            for (CustomBoatEntity.Type boatType : CustomBoatEntity.Type.values()) {
                event.registerLayerDefinition(CustomBoatModel.createBoatModelName(boatType), BoatModel::createBodyModel);
                event.registerLayerDefinition(CustomBoatModel.createChestBoatModelName(boatType), ChestBoatModel::createBodyModel);
            }
        }
    }
}


