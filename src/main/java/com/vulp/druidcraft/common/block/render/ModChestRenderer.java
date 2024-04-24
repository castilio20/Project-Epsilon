package com.vulp.druidcraft.common.block.render;

import com.vulp.druidcraft.Druidcraft;
import com.vulp.druidcraft.common.block.entities.ModChestBlockEntity;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.ChestRenderer;
import net.minecraft.client.resources.model.Material;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.ChestType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Calendar;

@OnlyIn(Dist.CLIENT)
public class ModChestRenderer extends ChestRenderer<ModChestBlockEntity> {
    public static boolean christmas;
    public static boolean starwarsday;

    public ModChestRenderer(BlockEntityRendererProvider.Context context) {
        super(context);
        Calendar calendar = Calendar.getInstance();
        if (calendar.get(2) + 1 == 12 && calendar.get(5) >= 24 && calendar.get(5) <= 26) {
            christmas = true;
        }
        if (calendar.get(2) + 1 == 5 && calendar.get(5) >= 3 && calendar.get(5) <= 5) {
            starwarsday = true;
        }
    }

    @Override
    protected Material getMaterial(ModChestBlockEntity blockEntity, ChestType chestType) {
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
        return new Material(Sheets.CHEST_SHEET, new ResourceLocation(Druidcraft.MODID, "entity/chest/" + path));
    }

    private Material getChestMaterial(ModChestBlockEntity blockEntity, ChestType type) {
        if (christmas) {
            return Sheets.chooseMaterial(blockEntity, type, true);
        } else if (starwarsday) {
            return chooseMaterial(type, getChestPath("starwars_left"), getChestPath("starwars_right"), getChestPath("starwars"));
        } else {
            return chooseMaterial(type, getChestPath(blockEntity.getBlock().chestType + "_left"),
                    getChestPath(blockEntity.getBlock().chestType + "_right"), getChestPath(blockEntity.getBlock().chestType));
        }
    }
}
