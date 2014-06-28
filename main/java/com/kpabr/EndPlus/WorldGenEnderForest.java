package com.kpabr.EndPlus;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraftforge.common.util.ForgeDirection;

public class WorldGenEnderForest extends WorldGenAbstractTree
{
    private boolean field_150531_a;
    private static final String __OBFID = "CL_00000401";

    public WorldGenEnderForest(boolean p_i45449_1_, boolean p_i45449_2_)
    {
        super(p_i45449_1_);
        this.field_150531_a = p_i45449_2_;
    }

    public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
    {
        int l = par2Random.nextInt(3) + 5;

        if (this.field_150531_a)
        {
            l += par2Random.nextInt(7);
        }

        boolean flag = true;

        if (par4 >= 1 && par4 + l + 1 <= 256)
        {
            int j1;
            int k1;

            for (int i1 = par4; i1 <= par4 + 1 + l; ++i1)
            {
                byte b0 = 1;

                if (i1 == par4)
                {
                    b0 = 0;
                }

                if (i1 >= par4 + 1 + l - 2)
                {
                    b0 = 2;
                }

                for (j1 = par3 - b0; j1 <= par3 + b0 && flag; ++j1)
                {
                    for (k1 = par5 - b0; k1 <= par5 + b0 && flag; ++k1)
                    {
                        if (i1 >= 0 && i1 < 256)
                        {
                            Block block = par1World.getBlock(j1, i1, k1);

                            if (!this.isReplaceable(par1World, j1, i1, k1))
                            {
                                //i1 = par1World.getTopSolidOrLiquidBlock(j1, k1);
                            }
                        }
                        else
                        {
                            flag = false;
                        }
                    }
                }
            }

            if (!flag)
            {
                return true;
                //return false;
            }
            else
            {
                Block block2 = par1World.getBlock(par3, par4 - 1, par5);

                boolean isSoil = (!block2.isAir(par1World, par3, par4-1, par5));//block2.canSustainPlant(par1World, par3, par4 - 1, par5, ForgeDirection.UP, (BlockSapling)Blocks.sapling);
                if (isSoil && par4 < 256 - l - 1)
                {
                    block2.onPlantGrow(par1World, par3, par4 - 1, par5, par3, par4, par5);
                    int k2;

                    for (k2 = par4 - 3 + l; k2 <= par4 + l; ++k2)
                    {
                        j1 = k2 - (par4 + l);
                        k1 = 1 - j1 / 2;

                        for (int l2 = par3 - k1; l2 <= par3 + k1; ++l2)
                        {
                            int l1 = l2 - par3;

                            for (int i2 = par5 - k1; i2 <= par5 + k1; ++i2)
                            {
                                int j2 = i2 - par5;

                                if (Math.abs(l1) != k1 || Math.abs(j2) != k1 || par2Random.nextInt(2) != 0 && j1 != 0)
                                {
                                    Block block1 = par1World.getBlock(l2, k2, i2);

                                    if (block1.isAir(par1World, l2, k2, i2) || block1.isLeaves(par1World, l2, k2, i2))
                                    {
                                        this.setBlockAndNotifyAdequately(par1World, l2, k2, i2, EndPlus.blocks.endLeaves, 0);
                                    }
                                }
                            }
                        }
                    }

                    for (k2 = 0; k2 < l; ++k2)
                    {
                        Block block3 = par1World.getBlock(par3, par4 + k2, par5);

                        if (block3.isAir(par1World, par3, par4 + k2, par5) || block3.isLeaves(par1World, par3, par4 + k2, par5))
                        {
                            this.setBlockAndNotifyAdequately(par1World, par3, par4 + k2, par5, EndPlus.blocks.endLog, 1);
                        }
                    }

                    return true;
                }
                else
                {
                    return true;// false;
                }
            }
        }
        else
        {
           return true;//false;
        }
    }
    protected boolean func_150523_a(Block p_150523_1_)
    {
        return p_150523_1_.getMaterial() == Material.air || p_150523_1_.getMaterial() == Material.leaves || p_150523_1_ == Blocks.grass || p_150523_1_ == Blocks.dirt || p_150523_1_ == Blocks.log || p_150523_1_ == Blocks.log2 || p_150523_1_ == Blocks.sapling || p_150523_1_ == Blocks.vine || p_150523_1_ == EndPlus.blocks.endGrass || p_150523_1_ == EndPlus.blocks.endDirt;
    }

    protected boolean isReplaceable(World world, int x, int y, int z)
    {
        Block block = world.getBlock(x, y, z);
        return block.isAir(world, x, y, z) || block.isLeaves(world, x, y, z) || block.isWood(world, x, y, z) || func_150523_a(block);
    }
}