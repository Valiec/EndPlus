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
import net.minecraftforge.common.util.ForgeDirection;

public class BlockRedstoneReceiver extends Block{
    IIcon side;
    int axis;
    
    public BlockRedstoneReceiver() {
        super(Material.piston);
        this.setTickRandomly(true);
        
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("endplus:receiverFace");
        this.side = iconRegister.registerIcon("endplus:wirelessSide");
        this.setTickRandomly(true);
        
        
    }
    public int getPower(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_)
    {
        int meta = p_149695_1_.getBlockMetadata(p_149695_2_, p_149695_3_, p_149695_4_);
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
/*        System.out.println("HI2!!!!!!!!!!!!!!!!!!!!!!!"); 
        System.out.println(p_149695_2_); 
        System.out.println(p_149695_3_); 
        System.out.println(p_149695_4_); 
        System.out.println((p_149695_1_.getBlock(p_149695_2_, p_149695_3_, p_149695_4_)));
        System.out.println(meta); 
        System.out.println(dx); 
        System.out.println(dy); 
        System.out.println(dz); 
        System.out.println((p_149695_1_.getBlock(p_149695_2_+dx, p_149695_3_+dy, p_149695_4_+dz)));*/
        if((p_149695_1_.getBlock(p_149695_2_+dx, p_149695_3_+dy, p_149695_4_+dz) == EndPlus.blocks.red))
        {
            int meta2 = p_149695_1_.getBlockMetadata(p_149695_2_+dx, p_149695_3_+dy, p_149695_4_+dz);
            //System.out.println("HI!!!!!!!!!!!!!!!!!!!!!!!");           
            return meta2;
        }
        return 0;
    }
    @Override
    public void onNeighborBlockChange(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_)
    {
        int meta = p_149695_1_.getBlockMetadata(p_149695_2_, p_149695_3_, p_149695_4_);
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
        /*System.out.println("HELLO2!!!!!!!!!!!!!!!!!!!!!!!"); 
        System.out.println(p_149695_2_); 
        System.out.println(p_149695_3_); 
        System.out.println(p_149695_4_); 
        System.out.println((p_149695_1_.getBlock(p_149695_2_, p_149695_3_, p_149695_4_)));
        System.out.println(meta); 
        System.out.println(dx); 
        System.out.println(dy); 
        System.out.println(dz); 
        System.out.println((p_149695_1_.getBlock(p_149695_2_+dx, p_149695_3_+dy, p_149695_4_+dz)));*/
        if((p_149695_1_.getBlock(p_149695_2_+dx, p_149695_3_+dy, p_149695_4_+dz) == EndPlus.blocks.red))
        {
            int meta2 = p_149695_1_.getBlockMetadata(p_149695_2_+dx, p_149695_3_+dy, p_149695_4_+dz);
            if(p_149695_1_.getBlock(p_149695_2_ - 1, p_149695_3_, p_149695_4_) != this)
            {
            p_149695_1_.notifyBlockOfNeighborChange(p_149695_2_ - 1, p_149695_3_, p_149695_4_, p_149695_5_);
            }
            if(p_149695_1_.getBlock(p_149695_2_ + 1, p_149695_3_, p_149695_4_) != this)
            {
            p_149695_1_.notifyBlockOfNeighborChange(p_149695_2_ + 1, p_149695_3_, p_149695_4_, p_149695_5_);
            }
            if(p_149695_1_.getBlock(p_149695_2_, p_149695_3_ - 1, p_149695_4_) != this)
            {
            p_149695_1_.notifyBlockOfNeighborChange(p_149695_2_, p_149695_3_ - 1, p_149695_4_, p_149695_5_);
            }
            if(p_149695_1_.getBlock(p_149695_2_, p_149695_3_ + 1, p_149695_4_) != this)
            {
            p_149695_1_.notifyBlockOfNeighborChange(p_149695_2_, p_149695_3_ + 1, p_149695_4_, p_149695_5_);
            }
            if(p_149695_1_.getBlock(p_149695_2_, p_149695_3_, p_149695_4_ - 1) != this)
            {
            p_149695_1_.notifyBlockOfNeighborChange(p_149695_2_, p_149695_3_, p_149695_4_ - 1, p_149695_5_);
            }
            if(p_149695_1_.getBlock(p_149695_2_, p_149695_3_, p_149695_4_ + 1) != this)
            {
            p_149695_1_.notifyBlockOfNeighborChange(p_149695_2_, p_149695_3_, p_149695_4_ + 1, p_149695_5_);
            }
            //p_149695_1_.notifyBlocksOfNeighborChange(p_149695_2_, p_149695_3_, p_149695_4_, p_149695_5_);
            //System.out.println("HI3!!!!!!!!!!!!!!!!!!!!!!!");           
            //System.out.println(meta2);
          
        }
        
       
    }
    public int tickRate(World p_149738_1_)
    {
        return 2;
    }
    @Override
    public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_)
    {
        this.onNeighborBlockChange(p_149674_1_, p_149674_2_, p_149674_3_, p_149674_4_, this);
    }
    @Override
    public boolean canProvidePower()
    {
        
        return true;
    }
    @Override
    public int isProvidingWeakPower(IBlockAccess p_149709_1_, int p_149709_2_, int p_149709_3_, int p_149709_4_, int p_149709_5_)
    {     
        int i1 = getPower((World)(p_149709_1_), p_149709_2_, p_149709_3_, p_149709_4_);
        //System.out.println("weak:"+i1);
        return i1;
    }
    //@Override
    public int isProvidingStronggggPower(IBlockAccess p_149709_1_, int p_149709_2_, int p_149709_3_, int p_149709_4_, int p_149709_5_)
    {     
        int i1 = getPower((World)(p_149709_1_), p_149709_2_, p_149709_3_, p_149709_4_);
        //System.out.println("strong:"+i1);
        return i1;
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
    public void onBlockPlacedBy(World p_149689_1_, int p_149689_2_, int p_149689_3_, int p_149689_4_, EntityLivingBase p_149689_5_, ItemStack p_149689_6_)
    {
        int l = BlockPistonBase.determineOrientation(p_149689_1_, p_149689_2_, p_149689_3_, p_149689_4_, p_149689_5_);
        p_149689_1_.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_, p_149689_4_, l, 2);

        
    }
    
    

}


