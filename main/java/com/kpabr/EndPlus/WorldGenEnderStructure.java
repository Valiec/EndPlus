package com.kpabr.EndPlus;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenEnderStructure extends WorldGenerator
{
    private Block field_150520_a;
    private static final String __OBFID = "CL_00000433";

    public WorldGenEnderStructure(Block p_i45464_1_)
    {
        this.field_150520_a = p_i45464_1_;
    }

    public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
    {
        boolean rightblock = par2Random.nextBoolean();
        Block [][][] blockarray = {{{Blocks.anvil, Blocks.crafting_table, Blocks.acacia_stairs},{Blocks.birch_stairs, Blocks.bedrock, Blocks.bookshelf}, {Blocks.diamond_block, Blocks.emerald_ore, Blocks.furnace}},{{Blocks.water, Blocks.web, Blocks.noteblock},{Blocks.beacon, Blocks.cobblestone, Blocks.wool}, {Blocks.clay, Blocks.flower_pot, Blocks.log}},{{Blocks.brewing_stand, Blocks.coal_ore, Blocks.dispenser},{Blocks.gold_ore, Blocks.glass, Blocks.iron_block}, {Blocks.torch, Blocks.stonebrick, Blocks.sandstone}}};
        if (par1World.isAirBlock(par3, par4, par5) && par1World.getBlock(par3, par4 - 1, par5) == this.field_150520_a)
        {
            int l = 2;
            int i1 = 2;
            int ii1 = 2;
            int j1;
            int k1;
            int l1;
            int i2;

            for (j1 = par3 - i1; j1 <= par3 + i1; ++j1)
            {
                for (k1 = par5 - i1; k1 <= par5 + i1; ++k1)
                {
                    l1 = j1 - par3;
                    i2 = k1 - par5;

                    if (l1 * l1 + i2 * i2 <= i1 * i1 + 1 && par1World.getBlock(j1, par4 - 1, k1) != this.field_150520_a)
                    {
                        //return false;
                    }
                }
            }

            for (j1 = par4; j1 < par4 + l && j1 < 256; ++j1)
            {
                for (k1 = par3; k1 < par3 + i1; ++k1)
                {
                    for (l1 = par5; l1 < par5 + ii1; ++l1)
                    {
                        i2 = k1 - par3;
                        int j2 = l1 - par5;
                        par1World.setBlock(k1, j1, l1, blockarray[j1-par4][k1-par3][l1-par5], 0, 2);
                    }
                }
            }

            //EntityEnderCrystal entityendercrystal = new EntityEnderCrystal(par1World);
            //entityendercrystal.setLocationAndAngles((double)((float)par3 + 0.5F), (double)(par4 + l), (double)((float)par5 + 0.5F), par2Random.nextFloat() * 360.0F, 0.0F);
            //par1World.spawnEntityInWorld(entityendercrystal);
            //par1World.setBlock(par3, par4 + l, par5, Blocks.bedrock, 0, 2);
            return true;
        }
        else
        {
            return false;
        }
    }
}