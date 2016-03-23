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
import net.minecraft.world.World;

public class BlockEssenceEmitterEnder extends Block{
    IIcon side;
    int axis;
    
    public BlockEssenceEmitterEnder() {
        super(Material.piston);
        //this.setTickRandomly(true);
        
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.blockIcon = iconRegister.registerIcon("endplus:emitterFace");
        this.side = iconRegister.registerIcon("endplus:wirelessSide");
        
    }
    @Override
    public int tickRate(World p_149738_1_)
    {
        //System.out.println("Hello!!!!!!!!!!!!!!!!!!!!!");
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
    public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_)
    {
        //System.out.println("Hello!!!!!!!!!!");
        p_149674_1_.scheduleBlockUpdate(p_149674_2_, p_149674_3_, p_149674_4_, this, this.tickRate(p_149674_1_));
        this.func_149675_a(p_149674_1_, p_149674_2_, p_149674_3_, p_149674_4_, this, false);
    }
    @Override
    public void onNeighborBlockChange(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_)
    {
        this.func_149675_a(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_, p_149695_5_, false);
    }
    public void func_149675_a(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_, boolean reverse)
    {
        int meta = p_149695_1_.getBlockMetadata(p_149695_2_, p_149695_3_, p_149695_4_);

        //System.out.println("HELLO??!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        if(p_149695_1_.isBlockIndirectlyGettingPowered(p_149695_2_, p_149695_3_, p_149695_4_))
        {
            //this.func_149675_a(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_, p_149695_5_, true);
            //System.out.println("HELLO&&&!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            
            int level = p_149695_1_.getStrongestIndirectPower(p_149695_2_, p_149695_3_, p_149695_4_);
            //System.out.println(level);
            int n = 1;
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
            while((p_149695_1_.getBlock(p_149695_2_+dx*n, p_149695_3_+dy*n, p_149695_4_+dz*n) == Blocks.air || p_149695_1_.getBlock(p_149695_2_+dx*n, p_149695_3_+dy*n, p_149695_4_+dz*n) == Blocks.tallgrass || p_149695_1_.getBlock(p_149695_2_+dx*n, p_149695_3_+dy*n, p_149695_4_+dz*n) == EndPlus.blocks.essenceEnder) && n<1024)
            {
                //System.out.println(p_149695_1_.getBlock(p_149695_2_, p_149695_3_, p_149695_4_));
                //if(!(dx == 255 && dy == 255 && dz == 255))
                //{
                //System.out.println(n);
                p_149695_1_.setBlock(p_149695_2_+dx*n, p_149695_3_+dy*n, p_149695_4_+dz*n, EndPlus.blocks.essenceEnder, level, 2);
                //}
                n++;
            }
            if((p_149695_1_.getBlock(p_149695_2_+dx*n, p_149695_3_+dy*n, p_149695_4_+dz*n) == EndPlus.blocks.redReceiver))
            {
                p_149695_1_.getBlock(p_149695_2_+dx*n, p_149695_3_+dy*n, p_149695_4_+dz*n).onNeighborBlockChange(p_149695_1_, p_149695_2_+dx*n, p_149695_3_+dy*n, p_149695_4_+dz*n, EndPlus.blocks.redReceiver);
            }
        }
        else
        {
            //System.out.println("HELLO!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            int n = 1;
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
            while(p_149695_1_.getBlock(p_149695_2_+dx*n, p_149695_3_+dy*n, p_149695_4_+dz*n) == EndPlus.blocks.essenceEnder  && n<1024)
            {
                //System.out.println(p_149695_1_.getBlock(p_149695_2_, p_149695_3_, p_149695_4_));
                //if(!(dx == 255 && dy == 255 && dz == 255))
                //{
            	if(n == 1)
            	{
            	if(p_149695_1_.getBlock(p_149695_2_+dx-1, p_149695_3_+dy, p_149695_4_+dz) == EndPlus.blocks.essenceEmitterEnder)
            	{
            		if(p_149695_1_.isBlockIndirectlyGettingPowered(p_149695_2_+dx-1, p_149695_3_+dy, p_149695_4_+dz))
            		{
            			n++;
            			continue;
            		}
            	}
            	if(p_149695_1_.getBlock(p_149695_2_+dx+1, p_149695_3_+dy, p_149695_4_+dz) == EndPlus.blocks.essenceEmitterEnder)
            	{
            		if(p_149695_1_.isBlockIndirectlyGettingPowered(p_149695_2_+dx+1, p_149695_3_+dy, p_149695_4_+dz))
            		{
            			n++;
            			continue;
            		}
            	}
            	if(p_149695_1_.getBlock(p_149695_2_+dx, p_149695_3_+dy-1, p_149695_4_+dz) == EndPlus.blocks.essenceEmitterEnder)
            	{
            		if(p_149695_1_.isBlockIndirectlyGettingPowered(p_149695_2_+dx, p_149695_3_+dy-1, p_149695_4_+dz))
            		{
            			n++;
            			continue;
            		}
            	}
            	if(p_149695_1_.getBlock(p_149695_2_+dx, p_149695_3_+dy+1, p_149695_4_+dz) == EndPlus.blocks.essenceEmitterEnder)
            	{
            		if(p_149695_1_.isBlockIndirectlyGettingPowered(p_149695_2_+dx, p_149695_3_+dy+1, p_149695_4_+dz))
            		{
            			n++;
            			continue;
            		}
            	}
            	if(p_149695_1_.getBlock(p_149695_2_+dx, p_149695_3_+dy, p_149695_4_+dz-1) == EndPlus.blocks.essenceEmitterEnder)
            	{
            		if(p_149695_1_.isBlockIndirectlyGettingPowered(p_149695_2_+dx-1, p_149695_3_+dy, p_149695_4_+dz-1))
            		{
            			n++;
            			continue;
            		}
            	}
            	if(p_149695_1_.getBlock(p_149695_2_+dx, p_149695_3_+dy, p_149695_4_+dz+1) == EndPlus.blocks.essenceEmitterEnder)
            	{
            		if(p_149695_1_.isBlockIndirectlyGettingPowered(p_149695_2_+dx-1, p_149695_3_+dy, p_149695_4_+dz+1))
            		{
            			n++;
            			continue;
            		}
            	}
            	//check all emitters around block unpowered
            	}
                p_149695_1_.setBlock(p_149695_2_+dx*n, p_149695_3_+dy*n, p_149695_4_+dz*n, Blocks.air);
                
                //}
                n++;
            }
        }
    }
    @Override
    public void onBlockPreDestroy(World p_149749_1_, int p_149749_2_, int p_149749_3_, int p_149749_4_, int p_149749_5_)
    {
        //p_149749_2_++;
        int meta = p_149749_5_;//.getBlockMetadata(p_149749_2_, p_149749_3_, p_149749_4_);
        //System.out.println(p_149749_2_);
        //System.out.println(p_149749_3_);
        //System.out.println(p_149749_4_);
        //System.out.println(meta);
        
        
        //System.out.println("GOODBYE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        //System.out.println("HELLO!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        int n = 1;
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
        //System.out.println(p_149749_1_.getBlock(p_149749_2_+dx, p_149749_3_+dy, p_149749_4_+dz));
        if(p_149749_1_.getBlock(p_149749_2_+dx, p_149749_3_+dy, p_149749_4_+dz) == EndPlus.blocks.essenceEnder)
        {
        p_149749_1_.setBlockToAir(p_149749_2_+dx, p_149749_3_+dy, p_149749_4_+dz);
        }
        //System.out.println(p_149749_1_.getBlock(p_149749_2_+dx, p_149749_3_+dy, p_149749_4_+dz));
        //System.out.println(p_149749_1_.getBlock(p_149749_2_+dx*n, p_149749_3_+dy*n, p_149749_4_+dz*n));
        while(p_149749_1_.getBlock(p_149749_2_+dx*n, p_149749_3_+dy*n, p_149749_4_+dz*n) == EndPlus.blocks.essenceEnder && n<1024)
        {
            //System.out.println(p_149749_1_.getBlock(p_149749_2_+dx*n, p_149749_3_+dy*n, p_149749_4_+dz*n));
            //System.out.println(p_149749_1_.getBlock(p_149749_2_, p_149749_3_, p_149749_4_));
            //if(!(dx == 255 && dy == 255 && dz == 255))
            //{
            p_149749_1_.setBlockToAir(p_149749_2_+dx*n, p_149749_3_+dy*n, p_149749_4_+dz*n);
            //}
            n++;
        }
        
    }
    @Override
    public void onBlockPlacedBy(World p_149689_1_, int p_149689_2_, int p_149689_3_, int p_149689_4_, EntityLivingBase p_149689_5_, ItemStack p_149689_6_)
    {
        int l = BlockPistonBase.determineOrientation(p_149689_1_, p_149689_2_, p_149689_3_, p_149689_4_, p_149689_5_);
        p_149689_1_.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_, p_149689_4_, l, 2);
        p_149689_1_.scheduleBlockUpdate(p_149689_2_, p_149689_3_, p_149689_4_, this, this.tickRate(p_149689_1_));
        this.func_149675_a(p_149689_1_, p_149689_2_, p_149689_3_, p_149689_4_, this, false);
        

        
    }
    
    

}


