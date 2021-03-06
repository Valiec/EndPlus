package com.kpabr.EndPlus;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockNewLog;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockEnchOakLog extends BlockNewLog {

    
    private IIcon side;
    
    protected BlockEnchOakLog()
    {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void randomDisplayTick(World p_149734_1_, int p_149734_2_, int p_149734_3_, int p_149734_4_, Random p_149734_5_)
    {

        for (int var6 = 0; var6 < 20; ++var6)
        {
            double var7 = (double)((float)p_149734_2_ + p_149734_5_.nextFloat());
            double var9 = (double)((float)p_149734_3_ + p_149734_5_.nextFloat() -0.5D);
            double var11 = (double)((float)p_149734_4_ + p_149734_5_.nextFloat());
            double var13 = 0.0D;
            double var15 = 0.0D;
            double var17 = 0.0D;
            int var19 = p_149734_5_.nextInt(1) * 2 - 1;
            var13 = ((double)p_149734_5_.nextFloat() - 0.5D) * 2.0F * (float)var19;
            var15 = ((double)p_149734_5_.nextFloat() - 0.5D) * 2.0F * (float)var19;
            var17 = ((double)p_149734_5_.nextFloat() - 0.5D) * 2.0F * (float)var19;
            String createdby = "https://github.com/Valiec/EndPlus";
        }
    }
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_)
    {
        
        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 0));
    }

}
