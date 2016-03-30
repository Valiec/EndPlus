package com.kpabr.EndPlus;

import java.lang.reflect.Field;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockDispenser;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.block.BlockSourceImpl;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.dispenser.BehaviorDefaultDispenseItem;
import net.minecraft.dispenser.IBehaviorDispenseItem;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.dispenser.IPosition;
import net.minecraft.dispenser.PositionImpl;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityDispenser;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IIcon;
import net.minecraft.util.IRegistry;
import net.minecraft.util.RegistryDefaulted;
import net.minecraft.world.World;

public class BlockPlacer extends BlockDispenser {
    IIcon side;
   
    
    public static IRegistry dispenseBehaviorRegistry;
    protected BlockPlacer()
    {
        super();
        BehaviorPlaceBlock bpb = new BehaviorPlaceBlock();
        this.dispenseBehaviorRegistry = new RegistryDefaulted(bpb);
    }
    public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_)
    {
        TileEntityDispenser disp =  new TileEntityDispenser();
        try
        {
            Field name = disp.getClass().getDeclaredField("field_146020_a");
            name.setAccessible(true);
            name.set(disp, "Block Placer");
        }
        catch (SecurityException e)
        {
            e.printStackTrace();
        }
        catch (NoSuchFieldException e)
        {
            e.printStackTrace();
        }
        catch (IllegalArgumentException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }
        return disp;
        
    }
 // JAVADOC METHOD $$ func_149689_a
    @SideOnly(Side.CLIENT)
    public void onBlockPlacedBy(World p_149689_1_, int p_149689_2_, int p_149689_3_, int p_149689_4_, EntityLivingBase p_149689_5_, ItemStack p_149689_6_)
    {
        int l = BlockPistonBase.determineOrientation(p_149689_1_, p_149689_2_, p_149689_3_, p_149689_4_, p_149689_5_);
        p_149689_1_.setBlockMetadataWithNotify(p_149689_2_, p_149689_3_, p_149689_4_, l, 2);

        if (p_149689_6_.hasDisplayName())
        {
            ((TileEntityDispenser)p_149689_1_.getTileEntity(p_149689_2_, p_149689_3_, p_149689_4_)).func_146018_a(p_149689_6_.getDisplayName());
        }
    }

    @SideOnly(Side.CLIENT)
    public boolean onBlockActivated(World p_149727_1_, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer p_149727_5_, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
    {
        if (p_149727_1_.isRemote)
        {
            return true;
        }
        else
        {
            TileEntityDispenser TileEntityDispenser = (TileEntityDispenser)p_149727_1_.getTileEntity(p_149727_2_, p_149727_3_, p_149727_4_);

            if (TileEntityDispenser != null)
            {
                p_149727_5_.func_146102_a(TileEntityDispenser);
            }

            return true;
        }
    }
    @SideOnly(Side.CLIENT)
    public void onNeighborBlockChange(World p_149695_1_, int p_149695_2_, int p_149695_3_, int p_149695_4_, Block p_149695_5_)
    {
        boolean flag = p_149695_1_.isBlockIndirectlyGettingPowered(p_149695_2_, p_149695_3_, p_149695_4_) || p_149695_1_.isBlockIndirectlyGettingPowered(p_149695_2_, p_149695_3_ + 1, p_149695_4_);
        int l = p_149695_1_.getBlockMetadata(p_149695_2_, p_149695_3_, p_149695_4_);
        boolean flag1 = (l & 8) != 0;

        if (flag && !flag1)
        {
            p_149695_1_.scheduleBlockUpdate(p_149695_2_, p_149695_3_, p_149695_4_, this, this.tickRate(p_149695_1_));
            this.func_149941_e(p_149695_1_, p_149695_2_, p_149695_3_, p_149695_4_);
        }
        else if (!flag && flag1)
        {
        }
    }
    @SideOnly(Side.CLIENT)
    private void func_149938_m(World p_149938_1_, int p_149938_2_, int p_149938_3_, int p_149938_4_)
    {
        if (!p_149938_1_.isRemote)
        {
            Block block = p_149938_1_.getBlock(p_149938_2_, p_149938_3_, p_149938_4_ - 1);
            Block block1 = p_149938_1_.getBlock(p_149938_2_, p_149938_3_, p_149938_4_ + 1);
            Block block2 = p_149938_1_.getBlock(p_149938_2_ - 1, p_149938_3_, p_149938_4_);
            Block block3 = p_149938_1_.getBlock(p_149938_2_ + 1, p_149938_3_, p_149938_4_);
            byte b0 = 3;

            if (block.func_149730_j() && !block1.func_149730_j())
            {
                b0 = 3;
            }

            if (block1.func_149730_j() && !block.func_149730_j())
            {
                b0 = 2;
            }

            if (block2.func_149730_j() && !block3.func_149730_j())
            {
                b0 = 5;
            }

            if (block3.func_149730_j() && !block2.func_149730_j())
            {
                b0 = 4;
            }

        }
    }
    @SideOnly(Side.CLIENT)
    public static double[] func_149937_bc(IBlockSource p_149939_0_)
    {
        int meta = p_149939_0_.getBlockMetadata();

        
  
            int dx = 0;
            int dy = 0;
            int dz = 0;
            if(meta>5)
            {
                meta = 5;
            }
            if(meta == 0)
            {
                dx = 0;
                dy = -1;
                dz = 0;
            }
            else if(meta == 1)
            {
                dx = 0;
                dy = 1;
                dz = 0;
            }
            else if(meta == 2)
            {
                dx = 0;
                dy = 0;
                dz = -1;
            }
            else if(meta == 3)
            {
                dx = 0;
                dy = 0;
                dz = 1;
            }
            else if(meta == 4)
            {
                dx = -1;
                dy = 0;
                dz = 0;
            }
            else if(meta == 5)
            {
                dx = 1;
                dy = 0;
                dz = 0;
                
            }
            else if(meta == 6)
            {
                dx = 0;
                dy = -2;
                dz = 0;
            }
            else if(meta == 7)
            {
                dx = 0;
                dy = 2;
                dz = 0;
            }
            else if(meta == 8)
            {
                dx = 0;
                dy = 0;
                dz = -2;
            }
            else if(meta == 9)
            {
                dx = 0;
                dy = 0;
                dz = 2;
            }
            else if(meta == 10)
            {
                dx = -2;
                dy = 0;
                dz = 0;
            }
            else if(meta == 11)
            {
                dx = 2;
                dy = 0;
                dz = 0;
                
            }
            else if(meta == 12)
            {
                dx = 0;
                dy = -3;
                dz = 0;
            }
            else if(meta == 13)
            {
                dx = 0;
                dy = 3;
                dz = 0;
            }
            else if(meta == 14)
            {
                dx = 0;
                dy = 0;
                dz = -3;
            }
            else if(meta == 15)
            {
                dx = 0;
                dy = 0;
                dz = 3;
            }
        EnumFacing enumfacing = func_149937_b(p_149939_0_.getBlockMetadata());
        double d0 = p_149939_0_.getX()-1+dx;
        double d1 = p_149939_0_.getY()+dy;
        double d2 = p_149939_0_.getZ()-1+dz;
        double[] output = {d0, d1, d2, meta};
        return output;
    }
    
    @SideOnly(Side.CLIENT)
    protected void func_149941_e(World p_149941_1_, int p_149941_2_, int p_149941_3_, int p_149941_4_)
    {
        BlockSourceImpl blocksourceimpl = new BlockSourceImpl(p_149941_1_, p_149941_2_, p_149941_3_, p_149941_4_);
        TileEntityDispenser TileEntityDispenser = (TileEntityDispenser)blocksourceimpl.getBlockTileEntity();

        if (TileEntityDispenser != null)
        {
            int l = TileEntityDispenser.func_146017_i();

            if (l < 0)
            {
                p_149941_1_.playAuxSFX(1001, p_149941_2_, p_149941_3_, p_149941_4_, 0);
            }
            else
            {
                ItemStack itemstack = TileEntityDispenser.getStackInSlot(l);
                IBehaviorDispenseItem ibehaviordispenseitem = new BehaviorPlaceBlock();
                if (true)
                {
                    ItemStack itemstack1 = ibehaviordispenseitem.dispense(blocksourceimpl, itemstack);
                    TileEntityDispenser.setInventorySlotContents(l, itemstack1.stackSize == 0 ? null : itemstack1);
                }
            }
        }
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        this.side = iconRegister.registerIcon("endplus:placerFace");
        this.blockIcon = iconRegister.registerIcon("endplus:wirelessSide");
        
    }
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int i, int j)
    {
                if(j == i)
                {
                    return this.side;
                    
                }
                else
                {
                    return this.blockIcon;
                    
                }
                
    }

}
