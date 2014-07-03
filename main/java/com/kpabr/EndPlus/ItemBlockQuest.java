package com.kpabr.EndPlus;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockQuest extends ItemBlock{

    public ItemBlockQuest(Block p_i45328_1_)
    {
        super(p_i45328_1_);
        setHasSubtypes(true);
        setUnlocalizedName("questBlock");
      
    }
    
    @Override
    public int getMetadata (int damageValue) {
        return damageValue;
    }
    
    @Override
    public String getUnlocalizedName(ItemStack itemstack) {
        return getUnlocalizedName()+"_"+this.getMetadata(itemstack.getItemDamage());
    }
    
}
