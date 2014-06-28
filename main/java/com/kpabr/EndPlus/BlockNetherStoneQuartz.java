package com.kpabr.EndPlus;

import java.util.Random;

import net.minecraft.block.BlockOre;
import net.minecraft.block.BlockQuartz;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BlockNetherStoneQuartz extends BlockOre {

    public BlockNetherStoneQuartz()
    {
        super();
    }
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Items.quartz;
    }

}
