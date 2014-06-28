package com.kpabr.EndPlus;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockRedstone extends ItemBlock{
    public ItemBlockRedstone(Block p_i45328_1_)
    {
        super(p_i45328_1_);
        //setHasSubtypes(true);
      
    }
    
    @Override
    public int getMetadata (int damageValue) {
        return 2;
    }
    
    @Override
    public String getUnlocalizedName(ItemStack itemstack) {
        return getUnlocalizedName();
    }
    
}
