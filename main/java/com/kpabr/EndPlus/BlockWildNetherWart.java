
package com.kpabr.EndPlus;

import net.minecraft.block.Block;
import net.minecraft.block.BlockNetherWart;
import net.minecraft.init.Blocks;



public class BlockWildNetherWart extends BlockNetherWart {


    public BlockWildNetherWart()
    {
        // TODO Auto-generated constructor stub
    }
    protected boolean canPlaceBlockOn(Block p_149854_1_)
    {
        return p_149854_1_ == Blocks.soul_sand || p_149854_1_ == EndPlus.blocks.soulDirt;
    }

}
