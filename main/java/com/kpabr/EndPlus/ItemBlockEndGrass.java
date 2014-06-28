package com.kpabr.EndPlus;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockEndGrass extends ItemBlock{

    public ItemBlockEndGrass(Block p_i45328_1_)
    {
        super(p_i45328_1_);
        setUnlocalizedName("buoy");
    }
    
    @Override
    public int getMetadata (int damageValue) {
        return 0;
    }
   
    
}
