package com.kpabr.EndPlus;
/*
 * Created by Valiec2019
 * on February 18, 2014
 * using Minecraft Forge 10.12.0.1022
 */
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.QUARTZ;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenForest;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenSpikes;
import net.minecraft.world.gen.structure.MapGenVillage;
import net.minecraftforge.event.terraingen.TerrainGen;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

import java.util.Date;
public class EndOregen implements IWorldGenerator
{   
	   @Override
       public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
       {
             switch(world.provider.dimensionId)
             {
                    case -1: generateNether(world, random, chunkX * 16, chunkZ * 16);
                    case 0: generateSurface(world, random, chunkX * 16, chunkZ * 16);
                    case 1: generateEnd(world, random, chunkX * 16, chunkZ * 16);
                    default: generateNether(world, random, chunkX * 16, chunkZ * 16); //testing
             }
       }
      
       private void generateEnd(World world, Random random, int x, int z)
       {
           if (world.provider.dimensionId == 1)
           {
        	   this.addOre(EndPlus.blocks.enderiteOre, world, random, x, z, 16, 16, 9, 10, 5, 100, Blocks.end_stone);
        	   this.addOre(EndPlus.blocks.endRedstoneOre, world, random, x, z, 16, 16, 9, 48, 5, 100, Blocks.end_stone);
        	   this.addOre(EndPlus.blocks.enderEssence, world, random, x, z, 16, 16, 13, 10, 5, 100, Blocks.end_stone);
        	   if(random.nextInt(17) == 0)
        	   {
        	       int Xcoord1 = x + random.nextInt(16);
        	       int Zcoord1 = z + random.nextInt(16);
        	       int Ycoord1 = world.getTopSolidOrLiquidBlock(Xcoord1, Zcoord1);
        	       (new WorldGenWart()).generate(world, random, Xcoord1, Ycoord1, Zcoord1);
        	   }
               if (random.nextInt(5) == 0)
               {
                   int i = x + random.nextInt(16) + 8;
                   int j = z + random.nextInt(16) + 8;
                   int k = world.getTopSolidOrLiquidBlock(i, j);
                   (new WorldGenEnderSpikes(EndPlus.blocks.endGrass)).generate(world, random, i, k, j);
               }
               if (random.nextInt(15) == 0)
               {
                   int i = x + random.nextInt(16) + 8;
                   int j = z + random.nextInt(16) + 8;
                   int k = world.getTopSolidOrLiquidBlock(i, j);
                   (new WorldGenEnderStructure(EndPlus.blocks.endGrass)).generate(world, random, i, k, j);
               }
               if(random.nextInt(3) == 0)
               {
                   int Xcoord1 = x + random.nextInt(16);
                   int Zcoord1 = z + random.nextInt(16);
                   int Ycoord1 = world.getTopSolidOrLiquidBlock(Xcoord1, Zcoord1);
                   //System.out.println(Xcoord1);
                   //System.out.println(Ycoord1);
                   //System.out.println(Zcoord1);
                   (new WorldGenEnderForest(false,true)).generate(world, random, Xcoord1, Ycoord1, Zcoord1);
               }
           }
 


       }

       private void generateSurface(World world, Random random, int x, int z)
       {
    	   this.addOre(EndPlus.blocks.graniteRough, world, random, x, z, 16, 16, 64, 10, 14, 256, Blocks.stone);
    	   this.addOre(EndPlus.blocks.luciteOre, world, random, x, z, 16, 16, 8, 15, 0, 32, Blocks.stone);
    	   this.addOre(EndPlus.blocks.cavernStone, world, random, x, z, 16, 16, 40, 12, 14, 64, Blocks.stone);
    	   this.addOre(EndPlus.blocks.overworldEssence, world, random, x, z, 16, 16, 13, 10, 0, 256, Blocks.stone);
           if (random.nextInt(17) == 0)
           {
               int i = x + random.nextInt(16) + 8;
               int j = z + random.nextInt(16) + 8;
               int k = world.getTopSolidOrLiquidBlock(i, j);
               (new WorldGenEnderSpikes(EndPlus.blocks.endGrass)).generate(world, random, i, k, j);
           }
       }

       private void generateNether(World world, Random random, int x, int z)
       {
    	  
    	   this.addOre(EndPlus.blocks.flameriteOre, world, random, x, z, 16, 16, 7, 10, 0, 64, EndPlus.blocks.netherStone); //?
    	   this.addOre(EndPlus.blocks.netherStoneQuartz, world, random, x, z, 16, 16, 13, 10, 0, 64, EndPlus.blocks.netherStone); //?
    	   this.addOre(EndPlus.blocks.umbriteOre, world, random, x, z, 16, 16, 8, 10, 64, 128, EndPlus.blocks.netherStone); //?
    	   this.addOre(EndPlus.blocks.netherEssence, world, random, x, z, 16, 16, 13, 10, 59, 69, EndPlus.blocks.netherStone);
           this.addOre(Blocks.soul_sand, world, random, x, z, 16, 16, 32, 10, 64, 128, EndPlus.blocks.soulDirt);
    	   if(random.nextInt(17) == 0)
           {
    	       int j1 = x + random.nextInt(16);
    	       int k1 = random.nextInt(80);
               int l1 = z + random.nextInt(16);
               (new WorldGenFlowers(Blocks.nether_wart)).generate(world, random, j1, k1, l1);
           }
    	   
       }

       public void addOre(Block block, World world, Random random, int x, int z, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY, Block generateIn)
       {
             int heightRange = maxY - minY;             
             WorldGenMinable worldgenminable = new WorldGenMinable(block, maxVeinSize, generateIn);
             for (int k1 = 0; k1 < chancesToSpawn; ++k1)
             {
                 int l1 = random.nextInt(16);
                 int i2 = random.nextInt(heightRange) + minY;
                 int j2 = random.nextInt(16);
                 worldgenminable.generate(world, random, x+l1, i2, z+j2);
             }
       }
}
       
       
       
       