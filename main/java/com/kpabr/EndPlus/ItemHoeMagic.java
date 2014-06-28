package com.kpabr.EndPlus;


import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
/*
 * Created by Valiec2019
 * on February 18, 2014
 * using Minecraft Forge 10.12.0.1022
 */
public class ItemHoeMagic extends ItemHoe{

	public ItemHoeMagic(ToolMaterial p_i45353_1_) {
		super(p_i45353_1_);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5)
	{
		if (!par1ItemStack.isItemEnchanted())
		{
		par1ItemStack.addEnchantment(Enchantment.unbreaking, 2);
		}
	}

}
