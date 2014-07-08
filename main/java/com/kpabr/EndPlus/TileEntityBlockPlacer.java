package com.kpabr.EndPlus;

import net.minecraft.tileentity.TileEntityDispenser;

public class TileEntityBlockPlacer extends TileEntityDispenser {
    protected String field_146020_a = "Block Placer";
    @Override
    public String getInventoryName()
    {
        return "Block Placer";
    }
    @Override
    public boolean hasCustomInventoryName()
    {
        return true;
    }
}
