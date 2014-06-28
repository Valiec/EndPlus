package com.kpabr.EndPlus;

import cpw.mods.fml.common.IFuelHandler;
import net.minecraft.item.ItemStack;

public class EndFuelHandler implements IFuelHandler {
    @Override
    public int getBurnTime(ItemStack fuel)
    {
        if (fuel.isItemEqual(new ItemStack(EndPlus.blocks.endLog, fuel.stackSize)))
        {
            return 300;
        }
        return 0;
    }
}
