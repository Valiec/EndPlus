package com.kpabr.EndPlus;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.ColorizerFoliage;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockEnderLeaves extends BlockLeaves {
    String[] type  = {"ender"};
    IIcon blockIconFast;
    boolean doDecay;
    protected BlockEnderLeaves(boolean par1)
    {
        super();
        this.doDecay = par1;
    }
    @Override
    public ArrayList<ItemStack> onSheared(ItemStack item, IBlockAccess world, int x, int y, int z, int fortune)
    {
        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
        ret.add(new ItemStack(EndPlus.blocks.endLeaves, 1, world.getBlockMetadata(x, y, z) & 3));
        return ret;
    }
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int var1, int var2)
    {
        if(Minecraft.getMinecraft().gameSettings.fancyGraphics)
        {
        return this.blockIcon;
        }
        else
        {
        return this.blockIconFast;
        }

    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("EndPlus:leaves_ender");
        this.blockIconFast = iconRegister.registerIcon("EndPlus:leaves_ender_opaque"); 
    }
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Item.getItemFromBlock(EndPlus.blocks.endSapling);
    }

    @Override
    public String[] func_150125_e()
    {
        
        return this.type;
    }
    
    @SideOnly(Side.CLIENT)
    public int getBlockColor()
    {
        double d0 = 0.5D;
        double d1 = 1.0D;
        return -1;
    }
    

    // JAVADOC METHOD $$ func_149741_i
    @SideOnly(Side.CLIENT)
    public int getRenderColor(int p_149741_1_)
    {
        return -1;
    }
    
    @SideOnly(Side.CLIENT)
    public int colorMultiplier(IBlockAccess p_149720_1_, int p_149720_2_, int p_149720_3_, int p_149720_4_)
    {
        int l = 0;
        int i1 = 0;
        int j1 = 0;

        for (int k1 = -1; k1 <= 1; ++k1)
        {
            for (int l1 = -1; l1 <= 1; ++l1)
            {
                int i2 = p_149720_1_.getBiomeGenForCoords(p_149720_2_ + l1, p_149720_4_ + k1).getBiomeFoliageColor(p_149720_2_ + l1, p_149720_3_, p_149720_4_ + k1);
                l += (i2 & 16711680) >> 16;
                i1 += (i2 & 65280) >> 8;
                j1 += i2 & 255;
            }
        }

        return -1;
    }
    public boolean isOpaqueCube()
    {
        return false;
    }
    @Override
    public int onBlockPlaced(World p_149660_1_,int p_149660_2_,int p_149660_3_,int p_149660_4_,int p_149660_5_,float p_149660_6_,float p_149660_7_,float p_149660_8_,int p_149660_9_)  
    {
       if (((p_149660_1_.getBlockMetadata(p_149660_3_, p_149660_4_, p_149660_5_)) & 4) == 0)
       {
           p_149660_1_.setBlockMetadataWithNotify(p_149660_3_, p_149660_4_, p_149660_5_, 4, 4);
           return 1;
       }
       return 1;
    }
    @Override
    public boolean shouldSideBeRendered(IBlockAccess p_149646_1_, int p_149646_2_, int p_149646_3_, int p_149646_4_, int p_149646_5_)
    {
        Block block = p_149646_1_.getBlock(p_149646_2_, p_149646_3_, p_149646_4_);
        return !this.field_150121_P && block == this ? true : super.shouldSideBeRendered(p_149646_1_, p_149646_2_, p_149646_3_, p_149646_4_, p_149646_5_);
    }
    @Override
    public void beginLeavesDecay(World world, int x, int y, int z)
    {
        if(!this.doDecay)
        {
            return;
        }

        int i2 = world.getBlockMetadata(x, y, z);

        if ((i2 & 8) == 0) //using a mask to clear all bits but 0x8
        {
            world.setBlockMetadataWithNotify(x, y, z, i2 | 8, 4);
        }
        world.setBlockMetadataWithNotify(x, y, z, world.getBlockMetadata(x, y, z) | 8, 4);
    }
    @Override
   
    public boolean canEntityDestroy(IBlockAccess world, int x, int y, int z, Entity entity)
    {
        if (entity instanceof EntityWither)
        {
            return true;
        }
        else if (entity instanceof EntityDragon)
        {
            return false;
        }

        return true;
    }

   
    
 

}
