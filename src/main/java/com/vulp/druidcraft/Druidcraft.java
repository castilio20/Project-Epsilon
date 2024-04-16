package com.vulp.druidcraft;

import com.vulp.druidcraft.common.block.custom.ModBlockEntities;
import com.vulp.druidcraft.common.item.ModItems;
import com.vulp.druidcraft.common.itemgroup.DruidcraftItemGroup;
import com.vulp.druidcraft.entity.Entities;
import com.vulp.druidcraft.entity.client.render.CustomBoatModel;
import com.vulp.druidcraft.entity.custom.CustomBoatEntity;
import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.ChestBoatModel;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTabs;
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

public class Druidcraft
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "druidcraft";
    // Directly reference a slf4j logger
    // Create a Deferred Register to hold Blocks which will all be registered under the "examplemod" namespace
    // Create a Deferred Register to hold Items which will all be registered under the "examplemod" namespace
    // Create a Deferred Register to hold CreativeModeTabs which will all be registered under the "examplemod" namespace

    // Creates a new Block with the id "examplemod:example_block", combining the namespace and path
    // Creates a new BlockItem with the id "examplemod:example_block", combining the namespace and path

    // Creates a new food item with the id "examplemod:example_id", nutrition 1 and saturation 2
    // Creates a creative tab with the id "examplemod:example_tab" for the example item, that is placed after the combat tab

    public Druidcraft()

    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register the Deferred Register to the mod event bus so blocks get registered
        BLOCKS.register(modEventBus);
        // Register the Deferred Register to the mod event bus so items get registered
        ITEMS.register(modEventBus);
        Entities.ENTITIES.register(modEventBus);
        //ModEntities.register(modEventBus);

        ModBlockEntities.register(modEventBus);
      // ModEntities.register(modEventBus);

        // Register the Deferred Register to the mod event bus so tabs get registered
        DruidcraftItemGroup.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code



    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if (event.getTabKey() ==  CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.HEMP);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
    }
    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onRenderTypeSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(Entities.BOAT.get(), m -> new CustomBoatModel(m, false));
            EntityRenderers.register(Entities.CHEST_BOAT.get(), m -> new CustomBoatModel(m, true));
        }
}
    @SubscribeEvent
    public static void onRegisterLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        for (CustomBoatEntity.Type boatType : CustomBoatEntity.Type.values()) {
            event.registerLayerDefinition(CustomBoatModel.createBoatModelName(boatType), BoatModel::createBodyModel);
            event.registerLayerDefinition(CustomBoatModel.createChestBoatModelName(boatType), ChestBoatModel::createBodyModel);
        }

        // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent


    {

          //  Sheets.addWoodType(ModWoodTypes.DARKWOOD);
           // EntityRenderers.register(ModEntities.MOD_BOAT.get(), pContext -> new ModBoatRenderer(pContext, false));
            //EntityRenderers.register(ModEntities.MOD_CHEST_BOAT.get(), pContext -> new ModBoatRenderer(pContext, true));
            // Some client setup code
            };
        }
    }

