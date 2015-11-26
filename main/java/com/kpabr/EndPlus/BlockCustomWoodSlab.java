package com.kpabr.EndPlus;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.List;
import java.util.Random;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStoneSlab;
import net.minecraft.block.BlockWoodSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class BlockCustomWoodSlab extends BlockWoodSlab
{

	public BlockCustomWoodSlab(boolean p_i45410_1_, Material p_i45410_2_) {
		super(p_i45410_1_);
	}

	@Override
	public String func_150002_b(int p_150002_1_) {
		return null;
	}
	
}