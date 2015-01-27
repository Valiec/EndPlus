package com.kpabr.EndPlus;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneOre;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
/*
 * Created by Valiec2019
 * on February 18, 2014
 * using Minecraft Forge 10.12.0.1022
 */
public class BlockEnderRedstoneOre extends Block {
    public boolean field_150187_a;
	public BlockEnderRedstoneOre(boolean p_i45420_1_) {
		super(Material.rock);
		this.setTickRandomly(true);
        if (p_i45420_1_)
        {
            this.setTickRandomly(true);
            
        }

        this.field_150187_a = p_i45420_1_;
		}
	 // JAVADOC METHOD $$ func_149699_a
    public void onBlockClicked(World p_149699_1_, int p_149699_2_, int p_149699_3_, int p_149699_4_, EntityPlayer p_149699_5_)
    {
        this.func_150185_ef(p_149699_1_, p_149699_2_, p_149699_3_, p_149699_4_);
        super.onBlockClicked(p_149699_1_, p_149699_2_, p_149699_3_, p_149699_4_, p_149699_5_);
    }
    @SideOnly(Side.CLIENT)
    public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
    {
        if(field_150187_a)
        {
        return Item.getItemById(0);
        }
        else
        {
        return Item.getItemById(this.getIdFromBlock(this));   
        }
    }
    // JAVADOC METHOD $$ func_149724_b
    public void onEntityWalking(World p_149724_1_, int p_149724_2_, int p_149724_3_, int p_149724_4_, Entity p_149724_5_)
    {
        this.func_150185_ef(p_149724_1_, p_149724_2_, p_149724_3_, p_149724_4_);
        super.onEntityWalking(p_149724_1_, p_149724_2_, p_149724_3_, p_149724_4_, p_149724_5_);
    }

    // JAVADOC METHOD $$ func_149727_a
    public boolean onBlockActivated(World p_149727_1_, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
        this.func_150185_ef(p_149727_1_, p_149727_2_, p_149727_3_, p_149727_4_);
        return super.onBlockActivated(p_149727_1_, p_149727_2_, p_149727_3_, p_149727_4_, p_149727_5_, p_149727_6_, p_149727_7_, p_149727_8_, p_149727_9_);
    }
	private void func_150185_ef(World p_150185_1_, int p_150185_2_, int p_150185_3_, int p_150185_4_)
	    {
	        this.func_150186_mn(p_150185_1_, p_150185_2_, p_150185_3_, p_150185_4_, new Random());

	        if (this == EndPlus.blocks.endRedstoneOre)
	        {
	            p_150185_1_.setBlock(p_150185_2_, p_150185_3_, p_150185_4_, EndPlus.blocks.litEndRedstoneOre);
	        }
	    }
	 // JAVADOC METHOD $$ func_149738_a
	    @Override
	    public int tickRate(World p_149738_1_)
	    {
	        return 30;
	    }
	    // JAVADOC METHOD $$ func_149674_a
	    public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_)
	    {
	        if (this == EndPlus.blocks.litEndRedstoneOre)
	        {
	            p_149674_1_.setBlock(p_149674_2_, p_149674_3_, p_149674_4_, EndPlus.blocks.endRedstoneOre);
	        }
	    }
	    @SideOnly(Side.CLIENT)
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

	            //p_149734_1_.spawnParticle("portal", var7, var9, var11, var13, var15, var17);
	        }
	    }
	    // JAVADOC METHOD $$ func_149734_b
	    @SideOnly(Side.CLIENT)
	    public void randomDisplayTick(World p_149734_1_, int p_149734_2_, int p_149734_3_, int p_149734_4_, Random p_149734_5_)
	    {
	        if (this.field_150187_a)
	        {
	            this.func_150186_mno(p_149734_1_, p_149734_2_, p_149734_3_, p_149734_4_, new Random());
	        }
	    }
	    @SideOnly(Side.CLIENT)
	    private void func_150186_mno(World p_150186_1_, int p_150186_2_, int p_150186_3_, int p_150186_4_, Random p_149734_5_)
	    {
	        Random random = p_150186_1_.rand;
	        double d0 = 0.0625D;

	        for (int l = 0; l < 6; ++l)
	        {
	            double d1 = (double)((float)p_150186_2_ + random.nextFloat());
	            double d2 = (double)((float)p_150186_3_ + random.nextFloat());
	            double d3 = (double)((float)p_150186_4_ + random.nextFloat());

	            if (l == 0 && !p_150186_1_.getBlock(p_150186_2_, p_150186_3_ + 1, p_150186_4_).isOpaqueCube())
	            {
	                d2 = (double)(p_150186_3_ + 1) + d0;
	            }

	            if (l == 1 && !p_150186_1_.getBlock(p_150186_2_, p_150186_3_ - 1, p_150186_4_).isOpaqueCube())
	            {
	                d2 = (double)(p_150186_3_ + 0) - d0;
	            }

	            if (l == 2 && !p_150186_1_.getBlock(p_150186_2_, p_150186_3_, p_150186_4_ + 1).isOpaqueCube())
	            {
	                d3 = (double)(p_150186_4_ + 1) + d0;
	            }

	            if (l == 3 && !p_150186_1_.getBlock(p_150186_2_, p_150186_3_, p_150186_4_ - 1).isOpaqueCube())
	            {
	                d3 = (double)(p_150186_4_ + 0) - d0;
	            }

	            if (l == 4 && !p_150186_1_.getBlock(p_150186_2_ + 1, p_150186_3_, p_150186_4_).isOpaqueCube())
	            {
	                d1 = (double)(p_150186_2_ + 1) + d0;
	            }

	            if (l == 5 && !p_150186_1_.getBlock(p_150186_2_ - 1, p_150186_3_, p_150186_4_).isOpaqueCube())
	            {
	                d1 = (double)(p_150186_2_ + 0) - d0;
	            }

	            if (d1 < (double)p_150186_2_ || d1 > (double)(p_150186_2_ + 1) || d2 < 0.0D || d2 > (double)(p_150186_3_ + 1) || d3 < (double)p_150186_4_ || d3 > (double)(p_150186_4_ + 1))
	            {
	                Minecraft.getMinecraft().effectRenderer.addEffect(new EntityEnderReddustFX(p_150186_1_, d1, d2, d3, 0.0F, 0.0F, 0.0F));
	                //p_150186_1_.spawnParticle("portal", d1, d2, d3, 0.0D, 0.0D, 0.0D);
	            }
	        }
	    }
	@Override
	public Item getItemDropped(int par1, Random par2Random, int par3)
    {
        return EndPlus.items.endRD;
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
	/*@Override
    @SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
        this. = iconRegister.registerIcon("EndPlus:enderiteOre");
    }*/

}
