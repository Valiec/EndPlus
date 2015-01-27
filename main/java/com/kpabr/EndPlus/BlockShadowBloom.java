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
import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

/*
 * Created by Valiec2019
 * on February 18, 2014
 * using Minecraft Forge 10.12.0.1022
 */

public class BlockShadowBloom extends BlockFlower
{
    private static final String[] field_149883_a = new String[] {"enderStalk_0", "enderStalk_1", "enderStalk_2"};
    private IIcon[] iconArray;
	private IIcon[] field_149861_N;

    protected BlockShadowBloom()
    {
        super(0);
        
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
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {

        return this.field_149861_N[p_149691_2_];
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.field_149861_N = new IIcon[1];

        for (int i = 0; i < this.field_149861_N.length; ++i)
        {
            this.field_149861_N[i] = p_149651_1_.registerIcon("endplus:shadow_bloom");
        }
    }
    @SideOnly(Side.CLIENT)
    @Override
    public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_)
    {
    	p_149666_3_.add(new ItemStack(p_149666_1_, 1, 0));
    }
    @Override
    protected boolean canPlaceBlockOn(Block p_149854_1_)
    {
    	
    	//System.out.println(p_149854_1_.func_149702_O());
        return p_149854_1_ == EndPlus.blocks.endDirt || p_149854_1_ == EndPlus.blocks.endGrass;
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
}
