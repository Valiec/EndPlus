package com.kpabr.EndPlus;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;

public class ItemBlockStoneSlab extends ItemSlab {

	public ItemBlockStoneSlab(Block p_i45355_1_) {
		super(p_i45355_1_, (BlockSlab)(EndPlus.blocks.stoneSlab), (BlockSlab)(EndPlus.blocks.doubleStoneSlab), false);
	    this.setMaxDamage(0);
	    this.setHasSubtypes(true);
		// TODO Auto-generated constructor stub
	}
	@Override
    public String getUnlocalizedName(ItemStack itemstack) {
        return "tile.smoothStoneSlab";
    }

}
