package com.kpabr.EndPlus;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
/*
 * Created by Valiec2019
 * on February 18, 2014
 * using Minecraft Forge 10.12.0.1022
 */
public class BlockEmittedRedstone extends Block {

    public BlockEmittedRedstone() {
        super(Material.circuits);
        this.setBlockUnbreakable();
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
    {
        return null;
    }
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World p_149734_1_, int p_149734_2_, int p_149734_3_, int p_149734_4_, Random p_149734_5_)
    {

        for (int var6 = 0; var6 < 20; ++var6)
        {
            double var7 = (double)((float)p_149734_2_ + p_149734_5_.nextFloat());
            double var9 = (double)((float)p_149734_3_ + p_149734_5_.nextFloat());
            double var11 = (double)((float)p_149734_4_ + p_149734_5_.nextFloat());
            double var13 = 0.0D;
            double var15 = 0.0D;
            double var17 = 0.0D;
            int var19 = p_149734_5_.nextInt(2) * 2 - 1;
            var13 = ((double)p_149734_5_.nextFloat() - 0.5D) * 0.5D;
            var15 = ((double)p_149734_5_.nextFloat() - 0.5D) * 0.5D;
            var17 = ((double)p_149734_5_.nextFloat() - 0.5D) * 0.5D;

            /*if (p_149734_1_.getBlock(p_149734_2_ - 1, p_149734_3_, p_149734_4_) != this && p_149734_1_.getBlock(p_149734_2_ + 1, p_149734_3_, p_149734_4_) != this)
            {
                var7 = (double)p_149734_2_ + 0.5D + 0.25D * (double)var19;
                var13 = (double)(p_149734_5_.nextFloat() * 2.0F * (float)var19);
            }*/
            //else
            //{
                var11 = (double)p_149734_4_ + 0.5D + 0.25D * (double)var19;
                //var17 = (double)(p_149734_5_.nextFloat() * 2.0F * (float)var19); //FIX FOR OTHER DIRECTIONS var13,var15,var17=MOTION
            //}

            p_149734_1_.spawnParticle("portal", var7, var9, var11, var13, var15, var17);
        }
    }
    
    public void randomDissssplayTick(World p_149734_1_, int p_149734_2_, int p_149734_3_, int p_149734_4_, Random p_149734_5_)
    {
            int l = 8;//p_149734_1_.getBlockMetadata(p_149734_2_, p_149734_3_, p_149734_4_);
            double d0 = (double)((float)p_149734_2_ + 0.5F) + (double)(p_149734_5_.nextFloat() - 0.5F) * 0.2D;
            double d1 = (double)((float)p_149734_3_ + 0.7F) + (double)(p_149734_5_.nextFloat() - 0.5F) * 0.2D;
            double d2 = (double)((float)p_149734_4_ + 0.5F) + (double)(p_149734_5_.nextFloat() - 0.5F) * 0.2D;
            double d3 = 0.2199999988079071D;
            double d4 = 0.27000001072883606D;

            if (l == 1)
            {
                p_149734_1_.spawnParticle("portal", d0 , d1-0.1D, d2, 0.0D, -0.5D, 0.5D);
            }
            else if (l == 2)
            {
                p_149734_1_.spawnParticle("portal", d0 , d1-0.1D, d2, 0.0D, -0.5D, 0.5D);
            }
            else if (l == 3)
            {
                p_149734_1_.spawnParticle("portal", d0 , d1-0.1D, d2, 0.0D, -0.5D, 0.5D);
            }
            else if (l == 4)
            {
                p_149734_1_.spawnParticle("portal", d0 , d1-0.1D, d2, 0.0D, -0.5D, 0.5D);
            }
            else
            {
                p_149734_1_.spawnParticle("portal", d0, d1, d2, 0.0D, -0.5D, 0.0D);
                p_149734_1_.spawnParticle("portal", d0, d1, d2, 0.0D, -0.5D, 0.0D);
                p_149734_1_.spawnParticle("portal", d0, d1, d2, 0.0D, -0.5D, 0.0D);
                p_149734_1_.spawnParticle("portal", d0, d1, d2, 0.0D, -0.5D, 0.0D);
                p_149734_1_.spawnParticle("portal", d0, d1, d2, 0.0D, -0.5D, 0.0D);
                
                p_149734_1_.spawnParticle("portal", d0, d1, d2, 0.0D, -0.5D, 0.0D);
                p_149734_1_.spawnParticle("portal", d0, d1, d2, 0.0D, -0.5D, 0.0D);
                p_149734_1_.spawnParticle("portal", d0, d1, d2, 0.0D, -0.5D, 0.0D);
                p_149734_1_.spawnParticle("portal", d0, d1, d2, 0.0D, -0.5D, 0.0D);
                p_149734_1_.spawnParticle("portal", d0, d1, d2, 0.0D, -0.5D, 0.0D);
                
            }
    }
    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }
    
    @Override
    public int quantityDropped(Random par1Random)
    {
        
        return 0;
    }
    public void onNeighborBlockChange(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_)
    {
        Block b1 = p_149695_1_.getBlock(p_149695_2_+1, p_149695_3_, p_149695_4_);
        Block b2 = p_149695_1_.getBlock(p_149695_2_-1, p_149695_3_, p_149695_4_);
        
        Block b3 = p_149695_1_.getBlock(p_149695_2_, p_149695_3_+1, p_149695_4_);
        Block b4 = p_149695_1_.getBlock(p_149695_2_, p_149695_3_-1, p_149695_4_);
        
        Block b5 = p_149695_1_.getBlock(p_149695_2_, p_149695_3_, p_149695_4_+1);
        Block b6 = p_149695_1_.getBlock(p_149695_2_, p_149695_3_, p_149695_4_-1);
        
        if(!(b1 == EndPlus.blocks.red || b2 == EndPlus.blocks.red || b3 == EndPlus.blocks.red ||  b4 == EndPlus.blocks.red ||  b5 == EndPlus.blocks.red ||  b6 == EndPlus.blocks.red))
        {
            if(!(b1 == EndPlus.blocks.redEmitter || b2 == EndPlus.blocks.redEmitter || b3 == EndPlus.blocks.redEmitter ||  b4 == EndPlus.blocks.redEmitter ||  b5 == EndPlus.blocks.redEmitter ||  b6 == EndPlus.blocks.redEmitter))
            {
                p_149695_1_.setBlockToAir(p_149695_2_, p_149695_3_, p_149695_4_);
            }
        }
    }
    
    /*@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister iconRegister) {
        this. = iconRegister.registerIcon("EndPlus:enderiteOre");
    }*/

}
