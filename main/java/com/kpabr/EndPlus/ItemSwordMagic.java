package com.kpabr.EndPlus;

import java.util.Random;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
/*
 * Created by Valiec2019
 * on February 18, 2014
 * using Minecraft Forge 10.12.0.1022
 */
public class ItemSwordMagic extends ItemSword{

	public ItemSwordMagic(ToolMaterial p_i45353_1_) {
		super(p_i45353_1_);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5)
	{
		if (!par1ItemStack.isItemEnchanted())
		{
		Random rand = new Random();
		int number = rand.nextInt(3);
		if(number < 1)
		{
		par1ItemStack.addEnchantment(Enchantment.looting, 2);
		}
		else if(number < 2)
		{
		par1ItemStack.addEnchantment(Enchantment.fireAspect, 2);
		}
		else
		{
		par1ItemStack.addEnchantment(Enchantment.unbreaking, 2);
		}
		}
	}

}
