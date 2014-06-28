package com.kpabr.EndPlus;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
/*
 * Created by Valiec2019
 * on February 18, 2014
 * using Minecraft Forge 10.12.0.1022
 */
public class BlockBuoy extends Block 
{
	private IIcon[] top;
	private IIcon[] side;
	private IIcon bottom;
	
    
        public BlockBuoy (Material material) 
        {
                super(material); 
                
                    this.top = new IIcon[16];
                    this.side = new IIcon[16];
                    
                    
                    
                
                
               
        }
        @Override
        public int damageDropped(int p_149692_1_)
        {
            return p_149692_1_;
        }
        
        @Override
        @SideOnly(Side.CLIENT)
        public void registerBlockIcons(IIconRegister iconRegister) {
            for (int i  = 0; i<16; i++)
            {
            this.side[i] = iconRegister.registerIcon("EndPlus:buoy_side_"+Integer.toString(i));
            this.bottom = iconRegister.registerIcon("EndPlus:buoy_bottom");
            this.top[i] = iconRegister.registerIcon("EndPlus:buoy_top_"+Integer.toString(i));
            }
        }
        @Override
        @SideOnly(Side.CLIENT)
        public IIcon getIcon(int i, int j)
        {
                if (i == 0)
                {
                        return this.bottom;
                }
                if (i == 1)
                {
                        return this.top[j];
                }
                else
                {
                        return this.side[j];
                }
        }
        public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_)
        {
            for (int i = 0; i<16; i++)
            {
                p_149666_3_.add(new ItemStack(p_149666_1_, 1, i));
            }
        }

}