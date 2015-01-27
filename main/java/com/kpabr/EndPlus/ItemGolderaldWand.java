package com.kpabr.EndPlus;

import java.util.Random;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
/*
 * Created by Valiec2019
 * on February 18, 2014
 * using Minecraft Forge 10.12.0.1022
 */
public class ItemGolderaldWand extends Item {

	public int type;
	
	public ItemGolderaldWand(int type) {
		//super();
		this.type = type;
		this.setMaxDamage(32);
		this.setMaxStackSize(1);
		
	}
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
	    if(this.type == 0)
	    {
    	    par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.digSpeed.getId(), 7200, 1, true));
    	    par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 7200, 1, true));
    	    
    	    
	    }
	    else if(this.type == 1)
	    {
    	    par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 7200, 1, true));
    	    par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.jump.getId(), 7200, 1, true)); 
	    }
	    else
	    {
            	par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 7200, 1, true));
            	par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 7200, 1, true));
            	par3EntityPlayer.addExperience(-3);
	    }
	    if(par1ItemStack.getItemDamage()<31)
	    {
	    par1ItemStack.setItemDamage(par1ItemStack.getItemDamage()+1);
	    }
	    else
	    {
	    par1ItemStack.stackSize = 0;
	    }
	    par3EntityPlayer.addExperience(-3);
	    
	    return par1ItemStack;
	}

}
