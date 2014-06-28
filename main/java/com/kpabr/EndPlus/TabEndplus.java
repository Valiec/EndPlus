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

public class TabEndplus extends CreativeTabs {

    public boolean isBlock = false;
    public int i;
    public Block block;
    public String name;
    
    public TabEndplus(int par1, String par2Str, int i)
    {
        super(par1, par2Str);
        this.i = i;
        this.name = par2Str;
        // TODO Auto-generated constructor stub
    }
    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem()
    {
        if (i == 0)
        {
        return EndPlus.items.enderiteGem;
        }
        else if (i == 1)
        {
        return EndPlus.items.pickaxeEnderite;
        }
        else if (i == 2)
        {         
        return EndPlus.items.swordEnderite;
        }
        else
        {
        return EndPlus.items.endRD;
        }
    }
    public String getTranslatedTabLabel()
    {
        return this.name;
    }

}
