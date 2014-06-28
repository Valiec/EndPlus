package com.kpabr.EndPlus;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class TabEndplusSpawners extends CreativeTabs {

    

    public TabEndplusSpawners(int par1)
    {
        super(par1, "EndPlus Mob Spawners");
        // TODO Auto-generated constructor stub
    }
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem()
    {
        return Item.getItemFromBlock((BlockCustomSpawner)(EndPlus.spawners.spawnerData[0][4]));
        
    }
    public String getTranslatedTabLabel()
    {
        return "EndPlus Mob Spawners";
    }
    
}
