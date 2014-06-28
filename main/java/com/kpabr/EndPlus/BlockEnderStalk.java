package com.kpabr.EndPlus;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockNetherWart;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.Random;

/*
 * Created by Valiec2019
 * on February 18, 2014
 * using Minecraft Forge 10.12.0.1022
 */

public class BlockEnderStalk extends BlockNetherWart
{
    private static final String[] field_149883_a = new String[] {"enderStalk_0", "enderStalk_1", "enderStalk_2"};
    private IIcon[] iconArray;

    protected BlockEnderStalk()
    {
        super();
        
    }
    public boolean canEntityDestroy(World world, int x, int y, int z, Entity entity)
    {
        if (entity instanceof EntityWither)
        {
            return this != Blocks.bedrock && this != Blocks.end_portal && this != Blocks.end_portal_frame;
        }
        else if (entity instanceof EntityDragon)
        {
            return false;
        }

        return true;
    }
    @Override
    protected boolean canPlaceBlockOn(Block p_149854_1_)
    {
    	
    	//System.out.println(p_149854_1_.func_149702_O());
        return p_149854_1_ == EndPlus.blocks.endDirt;
    }
    @Override
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return p_149691_2_ >= 3 ? this.iconArray[2] : (p_149691_2_ > 0 ? this.iconArray[1] : this.iconArray[0]);
    }
    @Override
    public Item getItem(World p_149694_1_, int p_149694_2_, int p_149694_3_, int p_149694_4_)
    {
        
        return EndPlus.items.enderWart;
    }
    @Override
    public Item getItemDropped(int p_149694_1_, Random p_149694_2_, int p_149694_3_)
    {  
        return EndPlus.items.enderWart;
    }
    @Override
    public ArrayList<ItemStack> getDrops(World world, int x, int y, int z, int metadata, int fortune)
    {
        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
        int count = 1;

        if (metadata >= 3)
        {
            count = 2 + world.rand.nextInt(3) + (fortune > 0 ? world.rand.nextInt(fortune + 1) : 0);
        }

        for (int i = 0; i < count; i++)
        {
            ret.add(new ItemStack(EndPlus.items.enderWart));
        }

        return ret;
    }

    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    @Override
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        
        this.iconArray = new IIcon[field_149883_a.length];

        for (int var2 = 0; var2 < this.iconArray.length; ++var2)
        {
            this.iconArray[var2] = par1IconRegister.registerIcon("EndPlus:"+field_149883_a[var2]);
        }
    }
}
