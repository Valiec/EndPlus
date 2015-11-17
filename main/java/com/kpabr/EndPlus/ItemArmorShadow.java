package com.kpabr.EndPlus;

import java.util.Random;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
/*
 * Created by Valiec2019
 * on February 18, 2014
 * using Minecraft Forge 10.12.0.1022
 */
public class ItemArmorShadow extends ItemArmor {

	public ItemArmorShadow(ArmorMaterial arg0, int arg1, int arg2) {
		super(arg0, arg1, arg2);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
    {
		return null;

    }
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
    {
		if(player.isWet() || (player.getBrightness(1.0F) > 0.5F && player.worldObj.canBlockSeeTheSky((int)player.posX, (int)player.posY, (int)player.posZ)))
		{
			if(itemStack.getItemDamage() < itemStack.getMaxDamage())
			{
				itemStack.damageItem(1, player);
			}
			else
			{
				itemStack.stackSize = 0;
			}
		}
    }
	

}
