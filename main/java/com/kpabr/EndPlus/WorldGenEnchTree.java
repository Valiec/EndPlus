package com.kpabr.EndPlus;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.init.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraftforge.common.util.ForgeDirection;

public class WorldGenEnchTree extends WorldGenTrees {


    // JAVADOC FIELD $$ field_76533_a
    private final int minTreeHeight;
    // JAVADOC FIELD $$ field_76531_b
    private final boolean vinesGrow;
    // JAVADOC FIELD $$ field_76532_c
    private final Block blockWood;
    // JAVADOC FIELD $$ field_76530_d
    private final Block blockLeaves;
	private int metaWood;
	private int metaLeaves;
    private static final String __OBFID = "CL_00000438";
    
    public WorldGenEnchTree(boolean par1)
    {
        this(par1, 4, Blocks.log, 0, Blocks.leaves, 0, false);
    }

    public WorldGenEnchTree(boolean par1, int par2, Block par3, int par3b, Block par4, int par4b, boolean par5)
    {
        super(par1);
        this.minTreeHeight = par2;
        this.blockWood = par3;
        this.metaWood = par3b;
        this.blockLeaves = par4;
        this.metaLeaves = par4b;
        this.vinesGrow = par5;
    }

    public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
    {
        int l = par2Random.nextInt(3) + this.minTreeHeight;
        boolean flag = true;

        if (par4 >= 1 && par4 + l + 1 <= 256)
        {
            byte b0;
            int k1;
            Block block;

            for (int i1 = par4; i1 <= par4 + 1 + l; ++i1)
            {
                b0 = 1;

                if (i1 == par4)
                {
                    b0 = 0;
                }

                if (i1 >= par4 + 1 + l - 2)
                {
                    b0 = 2;
                }

                for (int j1 = par3 - b0; j1 <= par3 + b0 && flag; ++j1)
                {
                    for (k1 = par5 - b0; k1 <= par5 + b0 && flag; ++k1)
                    {
                        if (i1 >= 0 && i1 < 256)
                        {
                            block = par1World.getBlock(j1, i1, k1);

                            if (!this.isReplaceable(par1World, j1, i1, k1))
                            {
                                //flag = false;
                            }
                        }
                        else
                        {
                            //flag = false;
                        }
                    }
                }
            }

            if (!flag)
            {
                return false;
            }
            else
            {
                Block block2 = par1World.getBlock(par3, par4 - 1, par5);

                boolean isSoil = block2.canSustainPlant(par1World, par3, par4 - 1, par5, ForgeDirection.UP, (BlockSapling)Blocks.sapling);
                if (par4 < 256 - l - 1)
                {
                    block2.onPlantGrow(par1World, par3, par4 - 1, par5, par3, par4, par5);
                    b0 = 3;
                    byte b1 = 0;
                    int l1;
                    int i2;
                    int j2;
                    int i3;

                    for (k1 = par4 - b0 + l; k1 <= par4 + l; ++k1)
                    {
                        i3 = k1 - (par4 + l);
                        l1 = b1 + 1 - i3 / 2;

                        for (i2 = par3 - l1; i2 <= par3 + l1; ++i2)
                        {
                            j2 = i2 - par3;

                            for (int k2 = par5 - l1; k2 <= par5 + l1; ++k2)
                            {
                                int l2 = k2 - par5;

                                if (Math.abs(j2) != l1 || Math.abs(l2) != l1 || par2Random.nextInt(2) != 0 && i3 != 0)
                                {
                                    Block block1 = par1World.getBlock(i2, k1, k2);

                                    //if (block1.isAir(par1World, i2, k1, k2) || block1.isLeaves(par1World, i2, k1, k2))
                                    //{
                                        this.setBlockAndNotifyAdequately(par1World, i2, k1, k2, this.blockLeaves, this.metaLeaves);
                                    
                                   // }
                                }
                            }
                        }
                    }

                    for (k1 = 0; k1 < l; ++k1)
                    {
                        block = par1World.getBlock(par3, par4 + k1, par5);

                       // if (block.isAir(par1World, par3, par4 + k1, par5) || block.isLeaves(par1World, par3, par4 + k1, par5))
                        //{
                            this.setBlockAndNotifyAdequately(par1World, par3, par4 + k1, par5, this.blockWood, this.metaWood);
                        //}
                    }



                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        else
        {
            return false;
        }
        
    }
 // JAVADOC METHOD $$ func_76529_b
    private void growVines(World par1World, int par2, int par3, int par4, int par5)
    {
        this.setBlockAndNotifyAdequately(par1World, par2, par3, par4, Blocks.vine, par5);
        int i1 = 4;

        while (true)
        {
            --par3;

            if (par1World.getBlock(par2, par3, par4).isAir(par1World, par2, par3, par4) || i1 <= 0)
            {
                return;
            }

            this.setBlockAndNotifyAdequately(par1World, par2, par3, par4, Blocks.vine, par5);
            --i1;
        }
    }

}
