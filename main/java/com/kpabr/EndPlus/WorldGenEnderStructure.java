package com.kpabr.EndPlus;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStoneBrick;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.ChestGenHooks;
//import static net.minecraftforge.common.ChestGenHooks;

public class WorldGenEnderStructure extends WorldGenerator
{
    private Block field_150520_a;
    private static final String __OBFID = "CL_00000433";
    public static final WeightedRandomChestContent[] chestItems = new WeightedRandomChestContent[] {new WeightedRandomChestContent(EndPlus.items.enderiteGem, 0, 1, 3, 3), new WeightedRandomChestContent(Items.iron_ingot, 0, 1, 5, 10), new WeightedRandomChestContent(new ItemStack(EndPlus.blocks.shadowBloom, 1).getItem(), 0, 1, 5, 10), new WeightedRandomChestContent(new ItemStack(EndPlus.blocks.enderEssence, 1).getItem(), 0, 1, 5, 10), new WeightedRandomChestContent(EndPlus.items.flameriteIngot, 0, 1, 3, 2), new WeightedRandomChestContent(EndPlus.items.enderWart, 0, 4, 6, 20), new WeightedRandomChestContent(Items.gold_ingot, 0, 3, 7, 16), new WeightedRandomChestContent(Items.saddle, 0, 1, 1, 3), new WeightedRandomChestContent(Items.emerald, 0, 1, 1, 1)};
    public static ChestGenHooks chestStuff = new ChestGenHooks("chest", chestItems, 8, 8);

    public WorldGenEnderStructure(Block p_i45464_1_)
    {
        this.field_150520_a = p_i45464_1_;
    }

    public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
    {
        boolean rightblock = par2Random.nextBoolean();
        Block [][][] blockarray = {{{Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air},
									{Blocks.air, EndPlus.blocks.endLog, EndPlus.blocks.endLog, EndPlus.blocks.endLog, EndPlus.blocks.endLog, EndPlus.blocks.endLog, Blocks.air},
									{Blocks.air, EndPlus.blocks.endLog, EndPlus.blocks.EnchEnderblock, EndPlus.blocks.EnchEnderblock, EndPlus.blocks.EnchEnderblock, EndPlus.blocks.endLog, Blocks.air},
									{Blocks.air, EndPlus.blocks.endLog, EndPlus.blocks.EnchEnderblock, EndPlus.blocks.EnchEnderblock, EndPlus.blocks.EnchEnderblock, EndPlus.blocks.endLog, Blocks.air},
									{Blocks.air, EndPlus.blocks.endLog, EndPlus.blocks.EnchEnderblock, EndPlus.blocks.EnchEnderblock, EndPlus.blocks.EnchEnderblock, EndPlus.blocks.endLog, Blocks.air},
									{Blocks.air, EndPlus.blocks.endLog, EndPlus.blocks.endLog, EndPlus.blocks.endLog, EndPlus.blocks.endLog, EndPlus.blocks.endLog, Blocks.air},
									{Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air}},
			
								   {{EndPlus.blocks.endLog, EndPlus.blocks.endLog, EndPlus.blocks.endLog, EndPlus.blocks.endLog, EndPlus.blocks.endLog, EndPlus.blocks.endLog, EndPlus.blocks.endLog},
        							{EndPlus.blocks.endLog, EndPlus.blocks.endLog, EndPlus.blocks.endLog, EndPlus.blocks.endLog, EndPlus.blocks.endLog, EndPlus.blocks.endLog, EndPlus.blocks.endLog},
        							{EndPlus.blocks.endLog, EndPlus.blocks.endLog, EndPlus.blocks.EnchEnderblock, EndPlus.blocks.EnchEnderblock, EndPlus.blocks.EnchEnderblock, EndPlus.blocks.endLog, EndPlus.blocks.endLog}, 
        							{EndPlus.blocks.endLog, EndPlus.blocks.endLog, EndPlus.blocks.EnchEnderblock, EndPlus.blocks.EnchEnderblock, EndPlus.blocks.EnchEnderblock, EndPlus.blocks.endLog, EndPlus.blocks.endLog},
        							{EndPlus.blocks.endLog, EndPlus.blocks.endLog, EndPlus.blocks.EnchEnderblock, EndPlus.blocks.EnchEnderblock, EndPlus.blocks.EnchEnderblock, EndPlus.blocks.endLog, EndPlus.blocks.endLog},
        							{EndPlus.blocks.endLog, EndPlus.blocks.endLog, EndPlus.blocks.endLog, EndPlus.blocks.endLog, EndPlus.blocks.endLog, EndPlus.blocks.endLog, EndPlus.blocks.endLog}, 
        							{EndPlus.blocks.endLog, EndPlus.blocks.endLog, EndPlus.blocks.endLog, EndPlus.blocks.endLog, EndPlus.blocks.endLog, EndPlus.blocks.endLog, EndPlus.blocks.endLog}},
        							
        						   {{Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air},
        							{Blocks.air, EndPlus.blocks.endLog, EndPlus.blocks.endLog, EndPlus.blocks.endLog, EndPlus.blocks.endLog, EndPlus.blocks.endLog, Blocks.air},
        							{Blocks.air, EndPlus.blocks.endLog, EndPlus.blocks.EnchEnderblock, EndPlus.blocks.EnchEnderblock, EndPlus.blocks.EnchEnderblock, EndPlus.blocks.endLog, Blocks.air},
        							{Blocks.air, EndPlus.blocks.endLog, EndPlus.blocks.EnchEnderblock, EndPlus.blocks.EnchEnderblock, EndPlus.blocks.EnchEnderblock, EndPlus.blocks.endLog, Blocks.air},
        							{Blocks.air, EndPlus.blocks.endLog, EndPlus.blocks.EnchEnderblock, EndPlus.blocks.EnchEnderblock, EndPlus.blocks.EnchEnderblock, EndPlus.blocks.endLog, Blocks.air},
        							{Blocks.air, EndPlus.blocks.endLog, EndPlus.blocks.endLog, EndPlus.blocks.endLog, EndPlus.blocks.endLog, EndPlus.blocks.endLog, Blocks.air},
        							{Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air}},
        							 
        						   {{Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air},
        							{Blocks.air, EndPlus.blocks.endLog, Blocks.air, Blocks.air, Blocks.air, EndPlus.blocks.endLog, Blocks.air},
        							{Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air},
        							{Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air},
        							{Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air},
        							{Blocks.air, EndPlus.blocks.endLog, Blocks.air, Blocks.air, Blocks.air, EndPlus.blocks.endLog, Blocks.air},
        							{Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air}},
        							
        						   {{Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air},
        						    {Blocks.air, EndPlus.blocks.enderTorch, Blocks.air, Blocks.air, Blocks.air, EndPlus.blocks.enderTorch, Blocks.air},
        						    {Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air},
        						    {Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air},
        						    {Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air},
        						    {Blocks.air, EndPlus.blocks.enderTorch, Blocks.air, Blocks.air, Blocks.air, EndPlus.blocks.enderTorch, Blocks.air},
        						    {Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air, Blocks.air}}};
        if (par1World.isAirBlock(par3, par4, par5) && par1World.getBlock(par3, par4 - 1, par5) == this.field_150520_a)
        {
        	par4 = par4-1;
            int l = 5;
            int i1 = 7;
            int ii1 = 7;
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
                    	if (j1 == par4+1 && k1 == par3+3 && l1 == par5+3)
                    	{
                    		i2 = k1 - par3;
                            int j2 = l1 - par5;
                            par1World.setBlock(k1, j1, l1, Blocks.chest, 0, 2);
                            TileEntityChest tileentitychest = (TileEntityChest)par1World.getTileEntity(k1, j1, l1);

                            if (tileentitychest != null)
                            {
                                WeightedRandomChestContent.generateChestContents(par2Random, chestItems, tileentitychest, chestStuff.getCount(par2Random));
                            }
                    	}
                    	else
                    	{
                    		i2 = k1 - par3;
                        	int j2 = l1 - par5;
                        	par1World.setBlock(k1, j1, l1, blockarray[j1-par4][k1-par3][l1-par5], 0, 2);
                    	}
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