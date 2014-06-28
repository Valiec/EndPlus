package com.kpabr.EndPlus;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.init.Blocks;

public class BlockMossyCobblestoneStairs extends BlockStairs {

    protected BlockMossyCobblestoneStairs(Block b, int i)
    {
        super(b, i);
        this.useNeighborBrightness = true;
        // TODO Auto-generated constructor stub
    }

}
