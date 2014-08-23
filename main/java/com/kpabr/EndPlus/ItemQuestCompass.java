package com.kpabr.EndPlus;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.item.Item;
/*
 * Created by Valiec2019
 * on February 18, 2014
 * using Minecraft Forge 10.12.0.1022
 */
public class ItemQuestCompass extends Item {

	public ItemQuestCompass() {
		//super();
	    //this.setUnlocalizedName("Creeperite");
		
	}
	public void registerIcons(IIconRegister iconRegister) {
        TextureMap map = (TextureMap)(iconRegister);
        map.setTextureEntry("endplus:questcompass", new TextureQuestCompass("endplus:questcompass"));
        this.itemIcon = map.getTextureExtry("endplus:questcompass");
    }

}
