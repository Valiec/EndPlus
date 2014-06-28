package com.kpabr.EndPlus;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneWire;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Direction;
import net.minecraft.util.IIcon;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Direction;
import net.minecraft.util.IIcon;
import net.minecraft.world.ChunkPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockEnderRedstone extends BlockRedstoneWire
{
    
    private boolean isPowered = true;
    private Set field_150179_b = new HashSet();
    @SideOnly(Side.CLIENT)
    private IIcon field_150182_M;
    @SideOnly(Side.CLIENT)
    private IIcon field_150183_N;
    @SideOnly(Side.CLIENT)
    private IIcon field_150184_O;
    @SideOnly(Side.CLIENT)
    private IIcon field_150180_P;
    private static final String __OBFID = "CL_00000295";

    public BlockEnderRedstone()
    {
        super();
      
    }
    //@Override
    // JAVADOC METHOD $$ func_150174_f
    public static boolean isPowerProviderOrWire(IBlockAccess world, int x, int y, int z, int rotation)
    {
        
        Block block = world.getBlock(x, y, z);

        if (block == Blocks.redstone_wire || block == EndPlus.blocks.endRedstone)
        {
            return true;
        }
        else if (!Blocks.unpowered_repeater.func_149907_e(block)) //Blocks.unpowered_repeater.func_149907_e checks if the given block is a repeater (powered or unpowered)
        {
            return block.canProvidePower() && rotation != -1;
        }
        else
        {
            int i1 = world.getBlockMetadata(x, y, z);
            return true;//rotation == (i1 & 3) || rotation == Direction.rotateOpposite[i1 & 3]; //(i1 & 3) is clearing the leftmost two bits in the metadata, in order to compare the rotation without any other flags
        }
    }

    // JAVADOC METHOD $$ func_149734_b
    @SideOnly(Side.CLIENT)
    
    public void randomDisplayTick(World world, int x, int y, int z, Random rotation)
    {
       
        int meta = world.getBlockMetadata(x, y, z);

        if (meta > 0)
        {
            double particleX = (double)x + 0.5D + ((double)rotation.nextFloat() - 0.5D) * 0.2D;
            double particleY = (double)((float)y + 0.0625F);
            double particleZ = (double)z + 0.5D + ((double)rotation.nextFloat() - 0.5D) * 0.2D;

            Minecraft.getMinecraft().effectRenderer.addEffect(new EntityEnderReddustFX(world, particleX, particleY, particleZ, 0.0F, 0.0F, 0.0F));
        }
    }
    public boolean canProvidePower()
    {
        return this.isPowered;
    }
    public int isProvidingStrongPower(IBlockAccess world, int x, int y, int z, int rotation)
    {
        return !this.isPowered ? 0 : this.isProvidingWeakPower(world, x, y, z, rotation);
    }
    public int isProvidingWeakPower(IBlockAccess world, int x, int y, int z, int rotation)
    {
        if (!this.isPowered)
        {
            return 0;
        }
        else
        {
            int meta = world.getBlockMetadata(x, y, z);

            if (meta == 0)
            {
                return 0;
            }
            else if (rotation == 1)
            {
                return meta;
            }
            else
            {
                boolean flag = getRepeaterInput(world, x - 1, y, z, 1) || !world.getBlock(x - 1, y, z).isNormalCube() && getRepeaterInput(world, x - 1, y - 1, z, -1);
                boolean flag1 = getRepeaterInput(world, x + 1, y, z, 3) || !world.getBlock(x + 1, y, z).isNormalCube() && getRepeaterInput(world, x + 1, y - 1, z, -1);
                boolean flag2 = getRepeaterInput(world, x, y, z - 1, 2) || !world.getBlock(x, y, z - 1).isNormalCube() && getRepeaterInput(world, x, y - 1, z - 1, -1);
                boolean flag3 = getRepeaterInput(world, x, y, z + 1, 0) || !world.getBlock(x, y, z + 1).isNormalCube() && getRepeaterInput(world, x, y - 1, z + 1, -1);

                if (!world.getBlock(x, y + 1, z).isNormalCube())
                {
                    if (world.getBlock(x - 1, y, z).isNormalCube() && getRepeaterInput(world, x - 1, y + 1, z, -1))
                    {
                        flag = true;
                    }

                    if (world.getBlock(x + 1, y, z).isNormalCube() && getRepeaterInput(world, x + 1, y + 1, z, -1))
                    {
                        flag1 = true;
                    }

                    if (world.getBlock(x, y, z - 1).isNormalCube() && getRepeaterInput(world, x, y + 1, z - 1, -1))
                    {
                        flag2 = true;
                    }

                    if (world.getBlock(x, y, z + 1).isNormalCube() && getRepeaterInput(world, x, y + 1, z + 1, -1))
                    {
                        flag3 = true;
                    }
                }

                return !flag2 && !flag1 && !flag && !flag3 && rotation >= 2 && rotation <= 5 ? meta : (rotation == 2 && flag2 && !flag && !flag1 ? meta : (rotation == 3 && flag3 && !flag && !flag1 ? meta : (rotation == 4 && flag && !flag2 && !flag3 ? meta : (rotation == 5 && flag1 && !flag2 && !flag3 ? meta : 0))));
            }
        }
    }    
    
    public static boolean getRepeaterInput(IBlockAccess world, int x, int y, int z, int rotation)
    {
        if (isPowerProviderOrWire(world, x, y, z, rotation))
        {
            return true;
        }
        else if (world.getBlock(x, y, z) == Blocks.powered_repeater)
        {
            int i1 = world.getBlockMetadata(x, y, z);
            return rotation == (i1 & 3);
        }
        else
        {
            return false;
        }
    }

    // JAVADOC METHOD $$ func_149645_b
    public int getRenderType()
    {
        return 500;
    }

    // JAVADOC METHOD $$ func_149720_d
    @SideOnly(Side.CLIENT)
    public int colorMultiplier(IBlockAccess p_149720_1_, int p_149720_2_, int p_149720_3_, int p_149720_4_)
    {
        return 1234567;
    } 
    // JAVADOC METHOD $$ func_149694_d
    @Override
    public boolean canConnectRedstone(IBlockAccess world, int x, int y, int z, int rotation)
    {
            return true;
    }
    @SideOnly(Side.CLIENT)
    public static IIcon getRedstoneWireIcon(String p_150173_0_)
    {
        return p_150173_0_.equals("cross") ? EndPlus.blocks.endRedstone.field_150182_M : (p_150173_0_.equals("line") ? EndPlus.blocks.endRedstone.field_150183_N : (p_150173_0_.equals("cross_overlay") ? EndPlus.blocks.endRedstone.field_150184_O : (p_150173_0_.equals("line_overlay") ? EndPlus.blocks.endRedstone.field_150180_P : null)));
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return EndPlus.items.endRD;
    }

  
    // JAVADOC METHOD $$ func_149694_d
    @SideOnly(Side.CLIENT)
    public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
    {
        return EndPlus.items.endRD;
    }

   
}