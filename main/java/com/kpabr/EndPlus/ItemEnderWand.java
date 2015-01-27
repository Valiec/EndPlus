package com.kpabr.EndPlus;

import java.util.Random;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.World;
/*
 * Created by Valiec2019
 * on February 18, 2014
 * using Minecraft Forge 10.12.0.1022
 */
public class ItemEnderWand extends Item {

	public int type;
	
	public ItemEnderWand(int type) {
		//super();
		this.type = type;
		this.setMaxDamage(32);
		this.setMaxStackSize(1);
		
	}
	public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
	{
	    par3EntityPlayer.addChatMessage(new ChatComponentText("The wand shakes in your hand. You are not yet ready to wield it."));
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
