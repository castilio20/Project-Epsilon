package com.vulp.druidcraft.common.block.render;

import com.vulp.druidcraft.Druidcraft;
import com.vulp.druidcraft.common.block.entities.ModTrappedChestBlockEntity;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.ChestRenderer;
import net.minecraft.client.resources.model.Material;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.ChestType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ModTrappedChestRenderer extends ChestRenderer<ModTrappedChestBlockEntity> {

    public ModTrappedChestRenderer(BlockEntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    protected Material getMaterial(ModTrappedChestBlockEntity blockEntity, ChestType chestType) {
        return getChestMaterial(blockEntity, chestType);
    }

    public static Material chooseMaterial(ChestType type, Material left, Material right, Material single) {
        return switch (type) {
            case LEFT -> left;
            case RIGHT -> right;
            default -> single;
        };
    }

    public static Material getChestPath(String path) {
        return new Material(Sheets.CHEST_SHEET, new ResourceLocation(Druidcraft.MODID, "entity/chest/trapped/" + path));
    }

    private Material getChestMaterial(ModTrappedChestBlockEntity blockEntity, ChestType type) {
        if (ModChestRenderer.christmas) {
            return Sheets.chooseMaterial(blockEntity, type, true);
        } else if (ModChestRenderer.starwarsday) {
            return chooseMaterial(type, ModChestRenderer.getChestPath("starwars_left"), ModChestRenderer.getChestPath("starwars_right"), ModChestRenderer.getChestPath("starwars"));
        } else {
            return chooseMaterial(type, getChestPath(blockEntity.getBlock().chestType + "_left"),
                    getChestPath(blockEntity.getBlock().chestType + "_right"), getChestPath(blockEntity.getBlock().chestType));
        }
    }
}