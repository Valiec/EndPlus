package com.kpabr.EndPlus;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockWoodSlab;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;

public class ItemBlockWoodSlab extends ItemSlab {

	public ItemBlockWoodSlab(Block p_i45355_1_) {
		super(p_i45355_1_, (BlockSlab)(EndPlus.blocks.enderwoodSlab), (BlockSlab)(EndPlus.blocks.doubleEnderwoodSlab), false);
	    this.setMaxDamage(0);
	    this.setHasSubtypes(true);
		// TODO Auto-generated constructor stub
	}
	@Override
    public String getUnlocalizedName(ItemStack itemstack) {
        return "tile.enderwoodSlab";
    }

}
