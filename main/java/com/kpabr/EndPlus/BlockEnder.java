package com.kpabr.EndPlus;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.world.World;

public class BlockEnder extends Block{
    public boolean ench;
    public BlockEnder(boolean par1)
    {
        super(Material.rock);
        this.ench = par1;
        // TODO Auto-generated constructor stub
    }
    public void randomDisplayTick(World p_149734_1_, int p_149734_2_, int p_149734_3_, int p_149734_4_, Random p_149734_5_)
    {
        if(ench)
        {
            this.func_150186_mn(p_149734_1_, p_149734_2_, p_149734_3_, p_149734_4_, new Random());
        }
    }
    public void func_150186_mn(World p_149734_1_, int p_149734_2_, int p_149734_3_, int p_149734_4_, Random p_149734_5_)
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

            /*if (p_149734_1_.getBlock(p_149734_2_ - 1, p_149734_3_, p_149734_4_) != this && p_149734_1_.getBlock(p_149734_2_ + 1, p_149734_3_, p_149734_4_) != this)
            {
                var7 = (double)p_149734_2_ + 0.5D + 0.25D * (double)var19;
                var13 = (double)(p_149734_5_.nextFloat() * 2.0F * (float)var19);
            }*/
            //else
            //{
                //var11 = (double)p_149734_4_ + 0.5D + 0.25D * (double)var19;
                //var17 = (double)(p_149734_5_.nextFloat() * 2.0F * (float)var19); //FIX FOR OTHER DIRECTIONS var13,var15,var17=MOTION
            //}

            p_149734_1_.spawnParticle("portal", var7, var9, var11, var13, var15, var17);
        }
    }
    public boolean canEntityDestroy(World world, int x, int y, int z, Entity entity)
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
