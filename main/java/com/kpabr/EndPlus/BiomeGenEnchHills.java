package com.kpabr.EndPlus;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.Random;

import net.minecraft.block.BlockFlower;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenBigMushroom;
import net.minecraft.world.gen.feature.WorldGenCanopyTree;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenEnchHills extends BiomeGenBase
{
    public WorldGenerator theWorldGenerator;

    public BiomeGenEnchHills(int p_i45377_1_, int p_i45377_2_)
    {
        super(p_i45377_1_);
        this.theWorldGenerator = new WorldGenMinable(EndPlus.blocks.golderaldOre, 8);
    	this.biomeName = "Enchanted Hills";
        this.temperature = 0.80F;
        this.setHeight(BiomeGenBase.height_LowHills);
        this.topBlock = EndPlus.blocks.enchGrass;
        this.theBiomeDecorator.treesPerChunk = 0;
        this.theBiomeDecorator.grassPerChunk = 0;
        this.theBiomeDecorator.flowersPerChunk = 0;
        this.theBiomeDecorator.generateLakes = true;
        this.fillerBlock = Blocks.dirt;
        this.rainfall = 0.68F;
        this.theBiomeDecorator = new BiomeModdedDecorator();

    }
    public void decorate(World par1World, Random par2Random, int par3, int par4)
    {
        super.decorate(par1World, par2Random, par3, par4);
        int k = 3 + par2Random.nextInt(6);
        int l;
        int i1;
        int j1;

        for (k = 0; k < 7; ++k)
        {
            l = par3 + par2Random.nextInt(16);
            i1 = par2Random.nextInt(64);
            j1 = par4 + par2Random.nextInt(16);
            this.theWorldGenerator.generate(par1World, par2Random, l, i1, j1);
        }
    }
}