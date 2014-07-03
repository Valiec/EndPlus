package com.kpabr.EndPlus;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
/*
 * Created by Valiec2019
 * on February 18, 2014
 * using Minecraft Forge 10.12.0.1022
 */
public class BlockQuest extends Block {

	public BlockQuest() {
		super(Material.rock);
		// TODO Auto-generated constructor stub
	}
	//@Override
	
	@Override
    public int quantityDropped(Random par1Random)
    {
	    
        return 1 + par1Random.nextInt(1); //!!!!!BUG!!!!!
    }
	//public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_)
    //{
        //for (int i = 0; i<16; i++)
        //{
            //p_149666_3_.add(new ItemStack(p_149666_1_, 1, i));
        //}
    //}
	/*@Override
    @SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
        this. = iconRegister.registerIcon("EndPlus:enderiteOre");
    }*/

}
