package com.kpabr.EndPlus;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockBreaker extends Block{
    IIcon side;
    int axis;
    
    public BlockBreaker() {
        super(Material.piston);
        this.setTickRandomly(true);
        
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("endplus:breakerFace");
        this.side = iconRegister.registerIcon("endplus:wirelessSide");
        
    }
    public int tickRate(World p_149738_1_)
    {
        return 2;
    }
    public IIcon getIcon(int i, int j)
    {
                if(j == i)
                {
                    return this.blockIcon;
                    
                }
                else
                {
                    return this.side;
                    
                }
                
    }
    @Override
    public void onNeighborBlockChange(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_)
    {
        boolean flag = p_149695_1_.isBlockIndirectlyGettingPowered(p_149695_2_, p_149695_3_, p_149695_4_) || p_149695_1_.isBlockIndirectlyGettingPowered(p_149695_2_, p_149695_3_ + 1, p_149695_4_);
        int l = p_149695_1_.getBlockMetadata(p_149695_2_, p_149695_3_, p_149695_4_);
        boolean flag1 = (l & 8) != 0;

        if (flag && !flag1)
        {
            p_149695_1_.scheduleBlockUpdate(p_149695_2_, p_149695_3_, p_149695_4_, this, this.tickRate(p_149695_1_));
            //p_149695_1_.setBlockMetadataWithNotify(p_149695_2_, p_149695_3_, p_149695_4_, l | 8, 4);
        }
        else if (!flag && flag1)
        {
            //p_149695_1_.setBlockMetadataWithNotify(p_149695_2_, p_149695_3_, p_149695_4_, l & -9, 4);
        }
    }
    public boolean canConnectRedstone(IBlockAccess iba, int i, int j, int k, int dir)
    {
            return true;
    }
    public void updateTick(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Random p_149695_5_)
    {
        if (!p_149695_1_.isRemote)
        {
        int meta = p_149695_1_.getBlockMetadata(p_149695_2_, p_149695_3_, p_149695_4_);

        
        if(true)
        {
            //System.out.println("HELLO!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            
            int level = p_149695_1_.getStrongestIndirectPower(p_149695_2_, p_149695_3_, p_149695_4_);
            //System.out.println(level);
            int dx = 0;
            int dy = 0;
            int dz = 0;
            if(meta == 0)
            {
                dx = 0;
                dy = -1;
                dz = 0;
            }
            if(meta == 1)
            {
                dx = 0;
                dy = 1;
                dz = 0;
            }
            if(meta == 2)
            {
                dx = 0;
                dy = 0;
                dz = -1;
            }
            if(meta == 3)
            {
                dx = 0;
                dy = 0;
                dz = 1;
            }
            if(meta == 4)
            {
                dx = -1;
                dy = 0;
                dz = 0;
            }
            if(meta == 5)
            {
                dx = 1;
                dy = 0;
                dz = 0;
                
            }
            //System.out.println("BREAKING THE BLOCK!");
            int meta2 = p_149695_1_.getBlockMetadata(p_149695_2_+dx, p_149695_3_+dy, p_149695_4_+dz);
            //p_149695_1_.getBlock(p_149695_2_+dx, p_149695_3_+dy, p_149695_4_+dz).dropBlockAsItem(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_, meta2, 0);
            //p_149695_1_.setBlockToAir(p_149695_2_+dx, p_149695_3_+dy, p_149695_4_+dz);
            p_149695_1_.getBlock(p_149695_2_+dx, p_149695_3_+dy, p_149695_4_+dz).harvestBlock(p_149695_1_, Minecraft.getMinecraft().thePlayer, p_149695_2_+dx*2, p_149695_3_+dy*2, p_149695_4_+dz*2, 0);
            p_149695_1_.setBlockToAir(p_149695_2_+dx, p_149695_3_+dy, p_149695_4_+dz);
            //p_149695_1_.getBlock(p_149695_2_+dx, p_149695_3_+dy, p_149695_4_+dz).onNeighborBlockChange(p_149695_1_, p_149695_2_+dx, p_149695_3_+dy, p_149695_4_+dz, EndPlus.blocks.redReceiver);
        }
        }
        
    }
    @Override
    public void onBlockPlacedBy(World p_149689_1_, int p_149689_2_, int p_149689_3_, int p_149689_4_, EntityLivingBase p_149689_5_, ItemStack p_149689_6_)
    {
        int l = BlockPistonBase.determineOrientation(p_149689_1_, p_149689_2_, p_149689_3_, p_149689_4_, p_149689_5_);
        p_149689_1_.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_, p_149689_4_, l, 2);

        
    }
    
    

}


