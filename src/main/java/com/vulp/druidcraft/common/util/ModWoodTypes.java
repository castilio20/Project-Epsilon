package com.vulp.druidcraft.common.util;

import com.vulp.druidcraft.Druidcraft;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModWoodTypes {
    public static final WoodType DARKWOOD = WoodType.register(new WoodType(Druidcraft.MODID + ":darkwood", BlockSetType.OAK));
    public static final WoodType ELDER = WoodType.register(new WoodType(Druidcraft.MODID + ":elder", BlockSetType.OAK));
}
