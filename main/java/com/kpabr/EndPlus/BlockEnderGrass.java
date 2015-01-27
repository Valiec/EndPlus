package com.kpabr.EndPlus;

import java.util.ArrayList;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
/*
 * Created by Valiec2019
 * on February 18, 2014
 * using Minecraft Forge 10.12.0.1022
 */
class BlockEnderGrass extends Block
{
    private IIcon bottom, top, side;

        BlockEnderGrass (Material material) 
        {
            
                super(material);
        }
        @Override
        public boolean canSilkHarvest(World world, EntityPlayer player, int x, int y, int z, int metadata)
        {
            return true;
        }
        @Override
        public void registerBlockIcons(IIconRegister iconRegister) {
            this.side = iconRegister.registerIcon("EndPlus:enderGrass_side");
            this.bottom = iconRegister.registerIcon("EndPlus:enderDirt");
            this.blockIcon = iconRegister.registerIcon("EndPlus:enderGrass_top");
        }
        @Override
        public ArrayList getDrops(World world, int x, int y, int z, int metadata, int fortune)
        {
            ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
            drops.add(new ItemStack(EndPlus.blocks.endDirt,1));
            return drops;
        }
        @Override
        public IIcon getIcon(int i, int j)
        {
                if (i == 0)
                {
                        return this.bottom;
                }
                if (i == 1)
                {
                        return this.blockIcon;
                }
                else
                {
                        return this.side;
                }
        }
        public boolean canEntityDestroy(IBlockAccess world, int x, int y, int z, Entity entity)
        {
            if (entity instanceof EntityWither)
            {
                return true;
            }
            else if (entity instanceof EntityDragon)
            {
                return false;
            }

            return true;
        }
        
        
        public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_)
        {
            if (!p_149674_1_.isRemote)
            {
                if (p_149674_1_.getBlockLightValue(p_149674_2_, p_149674_3_ + 1, p_149674_4_) < 4 && p_149674_1_.getBlockLightOpacity(p_149674_2_, p_149674_3_ + 1, p_149674_4_) > 2)
                {
                    p_149674_1_.setBlock(p_149674_2_, p_149674_3_, p_149674_4_, EndPlus.blocks.endDirt);
                }
                else if (p_149674_1_.getBlockLightValue(p_149674_2_, p_149674_3_ + 1, p_149674_4_) >= 0) //grows in all light levels TEST
                {
                    for (int l = 0; l < 4; ++l)
                    {
                        int i1 = p_149674_2_ + p_149674_5_.nextInt(3) - 1;
                        int j1 = p_149674_3_ + p_149674_5_.nextInt(5) - 3;
                        int k1 = p_149674_4_ + p_149674_5_.nextInt(3) - 1;
                        Block block = p_149674_1_.getBlock(i1, j1 + 1, k1);

                        if (p_149674_1_.getBlock(i1, j1, k1) == EndPlus.blocks.endDirt && p_149674_1_.getBlockMetadata(i1, j1, k1) == 0 && p_149674_1_.getBlockLightValue(i1, j1 + 1, k1) >= 4 && p_149674_1_.getBlockLightOpacity(i1, j1 + 1, k1) <= 2)
                        {
                            p_149674_1_.setBlock(i1, j1, k1, EndPlus.blocks.endGrass);
                        }
                    }
                }
            }
        }

}