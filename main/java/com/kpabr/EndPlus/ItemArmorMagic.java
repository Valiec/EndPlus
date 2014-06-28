package com.kpabr.EndPlus;

import java.util.Random;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
/*
 * Created by Valiec2019
 * on February 18, 2014
 * using Minecraft Forge 10.12.0.1022
 */
public class ItemArmorMagic extends ItemArmor {

	public ItemArmorMagic(ArmorMaterial arg0, int arg1, int arg2) {
		super(arg0, arg1, arg2);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
		return null;

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
			par1ItemStack.addEnchantment(Enchantment.protection, 2);
			}
			else if(number < 2)
			{
			par1ItemStack.addEnchantment(Enchantment.fireProtection, 2);
			}
			else
			{
			par1ItemStack.addEnchantment(Enchantment.unbreaking, 2);
			}
			}
	}

}
