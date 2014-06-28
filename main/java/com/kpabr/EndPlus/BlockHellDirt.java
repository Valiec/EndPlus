package com.kpabr.EndPlus;

import static net.minecraftforge.common.util.ForgeDirection.UP;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.util.ForgeDirection;
import net.minecraftforge.common.IPlantable;
/*
 * Created by Valiec2019
 * on February 18, 2014
 * using Minecraft Forge 10.12.0.1022
 */
public class BlockHellDirt extends Block {

	public BlockHellDirt(int par1, Material par2Material) {
		super(par2Material);
		// TODO Auto-generated constructor stub
	}
	public boolean canSustainPlant(World world, int x, int y, int z, ForgeDirection direction, IPlantable plant)
    {
        Block plantID = plant.getPlant(world, x, y + 1, z);
        EnumPlantType plantType = plant.getPlantType(world, x, y + 1, z);
        if (plantID == Blocks.nether_wart && this == EndPlus.blocks.soulDirt)
        {
            return true;
        }
        return false;

    }
	@Override
	public boolean isFireSource(World world, int x, int y, int z, ForgeDirection side)
	{
	    return true;
	}
	//@SideOnly(Side.CLIENT)
	///public void registerIcons(IIconRegister iconRegister) {
     //   this.field_149761_L = iconRegister.registerIcon("EndPlus:enderDirt");
    //}

}
