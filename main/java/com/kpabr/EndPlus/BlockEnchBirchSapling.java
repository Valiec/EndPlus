package com.kpabr.EndPlus;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenCanopyTree;
import net.minecraft.world.gen.feature.WorldGenForest;
import net.minecraft.world.gen.feature.WorldGenMegaJungle;
import net.minecraft.world.gen.feature.WorldGenMegaPineTree;
import net.minecraft.world.gen.feature.WorldGenSavannaTree;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraft.world.gen.feature.WorldGenTrees;

public class BlockEnchBirchSapling extends BlockSapling {

    public static final String[] field_149882_a = new String[] {"ender"};
    private static final IIcon[] field_149881_b = new IIcon[field_149882_a.length];
    public void func_149879_c(World p_149879_1_, int p_149879_2_, int p_149879_3_, int p_149879_4_, Random p_149879_5_)
    {
        int l = p_149879_1_.getBlockMetadata(p_149879_2_, p_149879_3_, p_149879_4_);

        if ((l & 8) == 0)
        {
            p_149879_1_.setBlockMetadataWithNotify(p_149879_2_, p_149879_3_, p_149879_4_, l | 8, 4);
        }
        else
        {
            this.func_149878_d(p_149879_1_, p_149879_2_, p_149879_3_, p_149879_4_, p_149879_5_);
        }
    }
    public void func_149878_d(World p_149878_1_, int p_149878_2_, int p_149878_3_, int p_149878_4_, Random p_149878_5_)
    {
        int l = p_149878_1_.getBlockMetadata(p_149878_2_, p_149878_3_, p_149878_4_) & 7;
        l = 1;
        WorldGenEnchTree object;
        int i1 = p_149878_2_;
        int k1 = p_149878_3_;
        int j1 = p_149878_4_;
        boolean flag = false;
        int r = p_149878_5_.nextInt(4);
        object = new WorldGenEnchTree(false, 8, EndPlus.blocks.enchBirchLog, 0, EndPlus.blocks.enchLeavesBirchGen, 0, false);
        object.generate(p_149878_1_, p_149878_5_, i1, k1, j1);
        flag = true;
    }
    protected boolean canPlaceBlockOn(Block p_149854_1_)
    {
        return p_149854_1_ == Blocks.grass || p_149854_1_ == Blocks.dirt || p_149854_1_ == Blocks.farmland || p_149854_1_ == EndPlus.blocks.endDirt || p_149854_1_ == EndPlus.blocks.endGrass || p_149854_1_ == EndPlus.blocks.soulDirt || p_149854_1_ == EndPlus.blocks.enchGrass;
    }
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        for (int i = 0; i < field_149881_b.length; ++i)
        {
            field_149881_b[i] = p_149651_1_.registerIcon("endplus:sapling_ench_birch");
        }
    }
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        p_149691_2_ &= 7;
        return field_149881_b[0];
    }
    public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_)
    {
        p_149666_3_.add(new ItemStack(p_149666_1_, 1, 0));
    }
    
}
