package com.kpabr.EndPlus;

import java.lang.reflect.Method;
import java.util.Random;

import com.jcraft.jorbis.Block;
import com.kpabr.EndPlus.EndPlus;

import net.minecraft.block.BlockNetherWart;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenNetherPlant extends WorldGenerator
{
    private static final String __OBFID = "CL_00000412";

    public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
    {
        //System.out.println("HELLO THIS IS ALSO NETHERWART ALSO");
        for (int l = 0; l < 128; ++l)
        {
            //System.out.println("HELLO THIS IS ALSO ALSO NETHERWART ALSO");
            int i1 = par3 + par2Random.nextInt(8) - par2Random.nextInt(8);
            int j1 = par4 + par2Random.nextInt(4) - par2Random.nextInt(4);
            int k1 = par5 + par2Random.nextInt(8) - par2Random.nextInt(8);
            //boolean flag = false;
            while(par1World.isAirBlock(i1, j1-1, k1) && j1>=64)
            {
                //if(par2Random.nextInt(1) == 0 && flag == false)
                //{
                    //break;
                //}
               // flag = true;
                
                j1 = j1-1;
            }

            if (par1World.isAirBlock(i1, j1, k1) && par1World.getBlock(i1, j1 - 1, k1) == Blocks.soul_sand)
            {
                //System.out.println("HELLO THIS IS ALSO NETHERWART HI HI HI");
                par1World.setBlock(i1, j1, k1, Blocks.nether_wart, 0, 2);
            }
            else
            {
                //par1World.setBlock(i1, j1, k1, Blocks.dirt, 0, 2);
            }
        }

        return true;
    }
}