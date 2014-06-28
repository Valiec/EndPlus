package com.kpabr.EndPlus;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
/*
 * Created by Valiec2019
 * on February 18, 2014
 * using Minecraft Forge 10.12.0.1022
 */
public class WorldGenWart extends WorldGenerator
{
    /**
     * The Block ID that the generator is allowed to replace while generating the terrain.
     */
    private Block replaceID;

    public WorldGenWart()
    {
        this.replaceID = Blocks.end_stone;
    }
    @Override
    public boolean generate(World par1World, Random par2Random, int par3, int par4a, int par5)
    {
    	
    	int par4 = par1World.getTopSolidOrLiquidBlock(par3, par5)-1;
    	if(par1World.getBlock(par3, par4, par5) == EndPlus.blocks.endGrass)
    	{

    	System.out.println(par4);
    	par1World.setBlock(par3, par4, par5, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3+1, par4, par5, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3-1, par4, par5, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3+2, par4, par5, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3-2, par4, par5, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3+1, par4, par5+1, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3-1, par4, par5-1, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3-1, par4, par5+1, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3+1, par4, par5-1, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3, par4, par5+1, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3, par4, par5-1, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3, par4, par5+2, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3, par4, par5-2, EndPlus.blocks.endDirt, 0, 2);

    	par1World.setBlock(par3, par4-1, par5, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3+1, par4-1, par5, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3-1, par4-1, par5, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3+2, par4-1, par5, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3-2, par4-1, par5, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3+1, par4-1, par5+1, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3-1, par4-1, par5-1, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3-1, par4-1, par5+1, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3+1, par4-1, par5-1, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3, par4-1, par5+1, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3, par4-1, par5-1, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3, par4-1, par5+2, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3, par4-1, par5-2, EndPlus.blocks.endDirt, 0, 2);

    	par1World.setBlock(par3, par4-2, par5, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3+1, par4-2, par5, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3-1, par4-2, par5, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3+2, par4-2, par5, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3-2, par4-2, par5, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3+1, par4-2, par5+1, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3-1, par4-2, par5-1, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3-1, par4-2, par5+1, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3+1, par4-2, par5-1, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3, par4-2, par5+1, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3, par4-2, par5-1, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3, par4-2, par5+2, EndPlus.blocks.endDirt, 0, 2);
    	par1World.setBlock(par3, par4-2, par5-2, EndPlus.blocks.endDirt, 0, 2);
    	
    	par1World.setBlock(par3, par4+1, par5, EndPlus.blocks.enderStalk, 0, 2);
    	par1World.setBlock(par3+1, par4+1, par5, EndPlus.blocks.enderStalk, 0, 2);
    	par1World.setBlock(par3-1, par4+1, par5, EndPlus.blocks.enderStalk, 0, 2);
    	par1World.setBlock(par3+2, par4+1, par5, EndPlus.blocks.enderStalk, 0, 2);
    	par1World.setBlock(par3-2, par4+1, par5, EndPlus.blocks.enderStalk, 0, 2);
    	par1World.setBlock(par3+1, par4+1, par5+1, EndPlus.blocks.enderStalk, 0, 2);
    	par1World.setBlock(par3-1, par4+1, par5-1, EndPlus.blocks.enderStalk, 0, 2);
    	par1World.setBlock(par3-1, par4+1, par5+1, EndPlus.blocks.enderStalk, 0, 2);
    	par1World.setBlock(par3+1, par4+1, par5-1, EndPlus.blocks.enderStalk, 0, 2);
    	par1World.setBlock(par3, par4+1, par5+1, EndPlus.blocks.enderStalk, 0, 2);
    	par1World.setBlock(par3, par4+1, par5-1, EndPlus.blocks.enderStalk, 0, 2);
    	par1World.setBlock(par3, par4+1, par5+2, EndPlus.blocks.enderStalk, 0, 2);
    	par1World.setBlock(par3, par4+1, par5-2, EndPlus.blocks.enderStalk, 0, 2);
    	return true;
    	}
    	else
    	{
    		return false;
    	}
    }
}
    
