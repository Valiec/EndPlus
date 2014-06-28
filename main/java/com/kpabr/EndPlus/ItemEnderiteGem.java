package com.kpabr.EndPlus;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
/*
 * Created by Valiec2019
 * on February 18, 2014
 * using Minecraft Forge 10.12.0.1022
 */
public class ItemEnderiteGem extends Item {

	public ItemEnderiteGem() {
		//super();
	    this.setUnlocalizedName("Creeperite");
		EndPlus.spawners.spawnerData[23][1] = this;
		
	}
	/*public void registerIcons(IIconRegister iconRegister) {
        this.itemIcon = iconRegister.registerIcon("EndPlus:gemEnderite");
    }*/

}
