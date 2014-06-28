package com.kpabr.EndPlus;
/*
 * Created by Valiec2019
 * on February 18, 2014
 * using Minecraft Forge 10.12.0.1022
 */
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;

public class EnderStalkSeeds extends ItemSeedFood {

	private Block par4;
	private Block soilId;
	public EnderStalkSeeds(int par2, float par3, Block par4, Block par5) {
		super(par2, par3, par4, par5);
		this.par4 = par4;
		//System.out.println(this.par4.func_149739_a());
		this.soilId = par4;
		
		// TODO Auto-generated constructor stub
		
	}
	@Override
	public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
        if (par7 != 1)
        {
            return false;
        }
        else if (par2EntityPlayer.canPlayerEdit(par4, par5, par6, par7, par1ItemStack) && par2EntityPlayer.canPlayerEdit(par4, par5 + 1, par6, par7, par1ItemStack))
        {
            if (par3World.getBlock(par4, par5, par6) == EndPlus.blocks.endDirt && par3World.isAirBlock(par4, par5 + 1, par6))
            {
                par3World.setBlock(par4, par5 + 1, par6, this.par4);
                --par1ItemStack.stackSize;
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
	}
