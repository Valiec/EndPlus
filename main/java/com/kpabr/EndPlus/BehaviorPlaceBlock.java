package com.kpabr.EndPlus;

import java.io.IOException;

import net.minecraft.block.BlockDispenser;
import net.minecraft.client.Minecraft;
import net.minecraft.dispenser.BehaviorDefaultDispenseItem;
import net.minecraft.dispenser.IBehaviorDispenseItem;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.dispenser.IPosition;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import net.minecraft.block.Block;

public class BehaviorPlaceBlock implements IBehaviorDispenseItem{
    @Override
    public final ItemStack dispense(IBlockSource par1IBlockSource, ItemStack par2ItemStack)
    {
        ItemStack itemstack1 = this.dispenseStack(par1IBlockSource, par2ItemStack);
        return itemstack1;
    }
    protected ItemStack dispenseStack(IBlockSource par1IBlockSource, ItemStack par2ItemStack)
    {
    	
        EnumFacing enumfacing = BlockDispenser.func_149937_b(par1IBlockSource.getBlockMetadata());
        double[] iposition = BlockPlacer.func_149937_bc(par1IBlockSource);
        ItemStack itemstack1 = par2ItemStack.splitStack(1);
        if(!doDispense2(par1IBlockSource.getWorld(), itemstack1, 6, enumfacing, iposition[0], iposition[1], iposition[2], (int)(iposition[3])))
        {
           par2ItemStack.stackSize++;
        }
        else
        {
            this.playDispenseSound(par1IBlockSource);
            this.spawnDispenseParticles(par1IBlockSource, BlockDispenser.func_149937_b(par1IBlockSource.getBlockMetadata()));
        }
        return par2ItemStack;
    }

    public static boolean doDispense2(World par0World, ItemStack par1ItemStack, int par2, EnumFacing par3EnumFacing, double par4, double par5, double par6, int meta)
    {
    	
        System.out.println("ERROR: "+par1ItemStack.getItemDamage()+","+(int)(par4)+","+(int)(par5)+","+(int)(par6)+","); 
        if(par1ItemStack.getItem() instanceof ItemBlock && par0World.getBlock((int)(par4), (int)(par5), (int)(par6)) == Blocks.air)
        {
            if(meta%2 == 0)
            {
                meta++;
            }
            else
            {
                meta--;
            }
            System.out.println("ERROR: "+par1ItemStack.getItemDamage()+","+(int)(par4)+","+(int)(par5)+","+(int)(par6)+","); 
        return (((ItemBlock)par1ItemStack.getItem()).placeBlockAt(par1ItemStack, Minecraft.getMinecraft().thePlayer, par0World, (int)(par4), (int)(par5), (int)(par6), meta, 0.5F, 0.5F, 0.5F,  par1ItemStack.getItemDamage()));
            
        }
        else
        {
            
            return false;
        }
    }
 // JAVADOC METHOD $$ func_82485_a
    protected void playDispenseSound(IBlockSource par1IBlockSource)
    {
        par1IBlockSource.getWorld().playAuxSFX(1000, par1IBlockSource.getXInt(), par1IBlockSource.getYInt(), par1IBlockSource.getZInt(), 0);
    }

    // JAVADOC METHOD $$ func_82489_a
    protected void spawnDispenseParticles(IBlockSource par1IBlockSource, EnumFacing par2EnumFacing)
    {
        par1IBlockSource.getWorld().playAuxSFX(2000, par1IBlockSource.getXInt(), par1IBlockSource.getYInt(), par1IBlockSource.getZInt(), this.func_82488_a(par2EnumFacing));
    }

    private int func_82488_a(EnumFacing par1EnumFacing)
    {
        return par1EnumFacing.getFrontOffsetX() + 1 + (par1EnumFacing.getFrontOffsetZ() + 1) * 3;
    }


}
