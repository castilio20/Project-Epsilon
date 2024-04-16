package com.vulp.druidcraft.entity;

import com.vulp.druidcraft.entity.custom.CustomBoatEntity;
import com.vulp.druidcraft.entity.custom.CustomChestBoatEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod("druidcraft")
public class Entities {
    public static final String MOD_ID = "druidcraft";
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, MOD_ID);
    public static final RegistryObject<EntityType<CustomBoatEntity>> BOAT = ENTITIES.register("boat",
            () -> EntityType.Builder.<CustomBoatEntity>of(CustomBoatEntity::new, MobCategory.MISC).sized(1.375f, 0.5625f).build(new ResourceLocation(MOD_ID, "darkwood_wood_boat").toString()));
    public static final RegistryObject<EntityType<CustomChestBoatEntity>> CHEST_BOAT = ENTITIES.register("chest_boat",
            () -> EntityType.Builder.<CustomChestBoatEntity>of(CustomChestBoatEntity::new, MobCategory.MISC).sized(1.375f, 0.5625f).build(new ResourceLocation(MOD_ID, "darkwood_wood_chest_boat").toString()));
}
