package com.kpabr.EndPlus;

import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
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
public class ItemSpellBase extends Item {

    public boolean light;
	public ItemSpellBase(boolean isLight) {
		super();
		this.light = isLight;
		
		
	}
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
	    if(this.light)
	    {
    	    par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.digSpeed.getId(), 7200, 0, true));
    	    par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.nightVision.getId(), 7200, 0, true)); 
	    }
	    else
	    {
    	    Random rand = new Random();
    	    if(rand.nextInt(9) == 0)
    	    {
    	        par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.confusion.getId(), 1800, 0, true));
    	    }
    	    else
    	    {
            	par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 7200, 0, true));
            	par3EntityPlayer.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 7200, 0, true));
    	    }
	    }
	    par3EntityPlayer.addExperience(-3);
	    par1ItemStack.stackSize--;
	    return par1ItemStack;
	}

}
