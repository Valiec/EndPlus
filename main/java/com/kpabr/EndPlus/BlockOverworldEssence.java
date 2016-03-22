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
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
/*
 * Created by Valiec2019
 * on February 18, 2014
 * using Minecraft Forge 10.12.0.1022
 */
public class BlockOverworldEssence extends Block {

	public BlockOverworldEssence(Material par2Material) {
		super(par2Material);
		// TODO Auto-generated constructor stub
	}
	//@Override
	@Override
	public boolean canSilkHarvest()
    {
        return true;
    }
	@Override
    public int quantityDropped(Random par1Random)
    {
        return 1 + par1Random.nextInt(3);
    }
	@Override
	public Item getItemDropped(int par1, Random par2Random, int par3)
    {
        return EndPlus.items.overworldEssence;
    }
	/*@Override
    @SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
        this. = iconRegister.registerIcon("EndPlus:enderiteOre");
    }*/

}
