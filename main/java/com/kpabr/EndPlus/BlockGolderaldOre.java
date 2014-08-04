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
public class BlockGolderaldOre extends Block {

	public BlockGolderaldOre(Material par2Material) {
		super(par2Material);
		// TODO Auto-generated constructor stub
	}
	@Override
	public Item getItemDropped(int par1, Random par2Random, int par3)
    {
        return EndPlus.items.enderiteGem;
    }
	@Override
    public int quantityDropped(Random par1Random)
    {
        return 1 + par1Random.nextInt(1);
    }

}
