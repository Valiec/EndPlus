package com.kpabr.EndPlus;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;

public class EndBlocks {


    /*Block declarations*/
    
    public static Block enderiteOre;
    public static Block netherStoneQuartz;
    public static Block wildNetherWart;
    public static Block endSapling;
    public static Block soulDirt;
    public static Block umbriteOre;
    public static Block luciteOre;
    public static Block luciteBlock;
    public static Block buoy;
    public static Block endLeaves;
    public static Block endLeavesGen;
    public static Block endLog;
    public static Block enderiteBlock;
    public static Block flameriteBlock;
    public static Block netherTorch;
    public static Block enderTorch;
    public static Block blockGoldFlamerite;
    public static Block umbriteBlock;
    public static Block netherStone;
    public static Block netherEssence;
    public static Block enderEssence;
    public static Block overworldEssence;
    public static Block cavernStone;
    public static Block flameriteOre;
    public static Block endDirt;
    public static Block endGrass;
    public static Block enderStalk;
    public static Block graniteRough;
    public static Block graniteSmooth;
    public static BlockEnderRedstone endRedstone;
    public static Block endRedstoneOre;
    public static Block litEndRedstoneOre;
    public static Block redEmitter;
    public static Block redReceiver;
    public static Block red;
    public static Block bBreaker;
    public static Block mossStairs;
    public static Block mossStone;
    public static Block bPlacer;
    public static Block Enderblock;
    public static Block EnchEnderblock;
    public static Block blockEnderRedstone;
    public static Block questBlock;
    
    public void registerBlocks()
    {
        GameRegistry.registerBlock(this.enderiteOre, "enderite_ore");
        GameRegistry.registerBlock(this.netherStoneQuartz, "nether_stone_quartz");
        GameRegistry.registerBlock(this.endSapling, "ender_sapling");
        GameRegistry.registerBlock(this.buoy, ItemBlockBuoy.class, "buoy");
        GameRegistry.registerBlock(this.endLeaves, "ender_leaves");
        GameRegistry.registerBlock(this.endLeavesGen, "ender_leaves_decay");
        GameRegistry.registerBlock(this.endLog, "ender_log");
        GameRegistry.registerBlock(this.netherEssence, "nether_essence");
        GameRegistry.registerBlock(this.enderEssence, "ender_essence");
        GameRegistry.registerBlock(this.overworldEssence, "overworld_essence");
        GameRegistry.registerBlock(this.cavernStone, "cavern_stone");
        GameRegistry.registerBlock(this.soulDirt, "soul_dirt");
        GameRegistry.registerBlock(this.umbriteOre, "umbrite_ore");
        GameRegistry.registerBlock(this.luciteOre, "lucite_ore");
        GameRegistry.registerBlock(this.enderiteBlock, "enderite_block");
        GameRegistry.registerBlock(this.flameriteBlock, "flamerite_block");
        GameRegistry.registerBlock(this.blockGoldFlamerite, "gold_flamerite_block");
        GameRegistry.registerBlock(this.umbriteBlock, "umbrite_block");
        GameRegistry.registerBlock(this.luciteBlock, "lucite_block");
        GameRegistry.registerBlock(this.flameriteOre, "flamerite_ore");
        GameRegistry.registerBlock(this.netherStone, "nether_stone");
        GameRegistry.registerBlock(this.endDirt, "ender_dirt");
        GameRegistry.registerBlock(this.endGrass, ItemBlockEndGrass.class, "ender_grass");
        GameRegistry.registerBlock(this.enderStalk, "ender_stalk");
        GameRegistry.registerBlock(this.netherTorch, "glowstone_torch");
        GameRegistry.registerBlock(this.enderTorch, "ender_torch");
        GameRegistry.registerBlock(this.graniteRough, "granite");
        GameRegistry.registerBlock(this.graniteSmooth, "polished_granite");
        GameRegistry.registerBlock(this.endRedstone, "ender_redstone");
        GameRegistry.registerBlock(this.endRedstoneOre, "ender_redstone_ore");
        GameRegistry.registerBlock(this.litEndRedstoneOre, "lit_ender_redstone_ore");
        GameRegistry.registerBlock(this.redEmitter, ItemBlockRedstone.class, "redstone_emitter");
        GameRegistry.registerBlock(this.redReceiver, ItemBlockRedstone.class, "redstone_receiver");
        GameRegistry.registerBlock(this.red, "redstone_emitted");
        GameRegistry.registerBlock(this.bBreaker, ItemBlockRedstone.class, "block_breaker");
        GameRegistry.registerBlock(this.mossStairs, "moss_stone_stairs");
        GameRegistry.registerBlock(this.mossStone, "moss_stone_2");
        GameRegistry.registerBlock(this.bPlacer, ItemBlockRedstone.class, "block_placer");
        GameRegistry.registerBlock(this.Enderblock, "ender_block");
        GameRegistry.registerBlock(this.EnchEnderblock, "ench_ender_block");
        GameRegistry.registerBlock(this.blockEnderRedstone, "ender_redstone_block");
        GameRegistry.registerBlock(this.questBlock, "quest_block");
    }
    public void setupBlocks()
    {
        this.buoy = new BlockBuoy(Material.rock).setBlockName("buoy").setCreativeTab(EndPlus.tabEndplus).setLightLevel(0.9F);
        this.endLeaves = new BlockEnderLeaves(false).setBlockName("enderLeaves").setCreativeTab(EndPlus.tabEndplus).setLightOpacity(1);
        this.endLeavesGen = new BlockEnderLeaves(true).setBlockName("enderLeaves").setCreativeTab(null).setLightOpacity(1);
        this.endLog = new BlockEnderLog().setBlockName("enderLog").setCreativeTab(EndPlus.tabEndplus).setBlockTextureName("EndPlus:log_big_oak");
        this.netherTorch = new BlockTorchBase().setBlockTextureName("endplus:netherTorch").setBlockName("netherTorch").setCreativeTab(EndPlus.tabEndplus).setLightLevel(0.99F);
        this.enderTorch = new BlockTorchBase().setBlockTextureName("endplus:enderTorch").setBlockName("enderTorch").setCreativeTab(EndPlus.tabEndplus).setLightLevel(0.99F);
        this.graniteRough = new BlockBase(Material.rock).setBlockTextureName("endplus:graniteRough").setBlockName("graniteRough").setCreativeTab(EndPlus.tabEndplus).setHardness(1.6F).setResistance(10.0F);
        this.graniteSmooth = new BlockBase(Material.rock).setBlockTextureName("endplus:graniteSmooth").setBlockName("graniteSmooth").setCreativeTab(EndPlus.tabEndplus).setHardness(1.6F).setResistance(10.0F);
        this.enderStalk = new BlockEnderStalk().setBlockTextureName("endplus:enderStalk").setBlockName("enderStalk");
        this.wildNetherWart = new BlockWildNetherWart().setBlockTextureName("minecraft:nether_wart").setBlockName("wildNetherWart");
        this.endDirt = new BlockEnderDirt(0, Material.ground).setBlockTextureName("endplus:enderDirt").setBlockName("enderDirt").setHardness(1.6F).setCreativeTab(EndPlus.tabEndplus);
        this.endGrass = new BlockEnderGrass(Material.grass).setBlockName("enderGrass").setHardness(1.6F).setCreativeTab(EndPlus.tabEndplus).setTickRandomly(true);
        this.soulDirt = new BlockHellDirt(0, Material.ground).setBlockTextureName("endplus:helldirt").setBlockName("soulDirt").setHardness(1.6F).setCreativeTab(EndPlus.tabEndplus);
        this.enderiteOre = new BlockEnderiteOre(Material.rock).setBlockTextureName("endplus:enderiteOre").setCreativeTab(EndPlus.tabEndplus).setBlockName("enderiteOre").setHardness(1.5F).setResistance(15.0F);
        this.netherEssence = new BlockNetherEssence(Material.rock).setBlockTextureName("endplus:netherEssence").setCreativeTab(EndPlus.tabEndplus).setBlockName("netherEssence").setHardness(1.6F).setResistance(12.0F); 
        this.enderEssence = new BlockEnderEssence(Material.rock).setBlockTextureName("endplus:enderEssence").setCreativeTab(EndPlus.tabEndplus).setBlockName("enderEssence").setHardness(3.0F).setResistance(15.0F);
        this.overworldEssence = new BlockOverworldEssence(Material.rock).setBlockTextureName("endplus:overworldEssence").setCreativeTab(EndPlus.tabEndplus).setBlockName("overworldEssence").setHardness(1.5F).setResistance(10.0F);
        this.cavernStone = new BlockCavernStone(Material.rock).setBlockTextureName("endplus:cavernStone3").setCreativeTab(EndPlus.tabEndplus).setBlockName("cavernStone").setHardness(1.6F).setResistance(9.5F);
        this.umbriteOre = new BlockUmbriteOre(Material.rock).setBlockTextureName("endplus:umbriteOre").setCreativeTab(EndPlus.tabEndplus).setBlockName("umbriteOre").setHardness(1.5F).setResistance(3.0F);
        this.netherStoneQuartz = new BlockNetherStoneQuartz().setBlockTextureName("endplus:stoneQuartz").setCreativeTab(EndPlus.tabEndplus).setBlockName("quartzOre").setHardness(1.5F).setResistance(10.0F);
        this.luciteOre = new BlockLuciteOre(Material.rock).setBlockTextureName("endplus:luciteOre").setCreativeTab(EndPlus.tabEndplus).setBlockName("luciteOre").setHardness(1.5F).setResistance(10.0F);
        this.enderiteBlock = new BlockBase(Material.rock).setBlockTextureName("endplus:blockEnderite").setCreativeTab(EndPlus.tabEndplus).setBlockName("blockEnderite").setHardness(3.5F).setResistance(17.0F); 
        this.flameriteBlock = new BlockBase(Material.rock).setBlockTextureName("endplus:blockFlamerite").setCreativeTab(EndPlus.tabEndplus).setBlockName("blockFlamerite").setHardness(3.0F).setResistance(10.0F); 
        this.blockGoldFlamerite = new BlockBase(Material.rock).setBlockTextureName("endplus:blockGFlamerite").setCreativeTab(EndPlus.tabEndplus).setBlockName("blockGoldFlamerite").setHardness(3.0F).setResistance(9.0F);
        this.umbriteBlock = new BlockBase(Material.rock).setBlockTextureName("endplus:blockUmbrite").setCreativeTab(EndPlus.tabEndplus).setBlockName("blockUmbrite").setHardness(3.0F).setResistance(10.0F);
        this.luciteBlock = new BlockBase(Material.rock).setBlockTextureName("endplus:blockLucite").setCreativeTab(EndPlus.tabEndplus).setBlockName("blockLucite").setHardness(3.0F).setResistance(10.0F);
        this.netherStone = new BlockBase(Material.rock).setBlockTextureName("endplus:netherStone").setCreativeTab(EndPlus.tabEndplus).setBlockName("netherStone").setHardness(1.3F).setResistance(10.0F); 
        this.flameriteOre = new BlockBase(Material.rock).setBlockTextureName("endplus:flameriteOre").setCreativeTab(EndPlus.tabEndplus).setBlockName("flameriteOre").setHardness(1.5F).setResistance(3.0F);
        this.endSapling = new BlockEnderSapling().setCreativeTab(EndPlus.tabEndplus).setBlockName("enderSapling");
        this.endRedstone = (BlockEnderRedstone)(new BlockEnderRedstone().setCreativeTab(null).setBlockName("enderRedstoneDust")).setTickRandomly(true);
        this.endRedstoneOre = new BlockEnderRedstoneOre(false).setCreativeTab(EndPlus.tabEndplus).setBlockName("enderRedstoneOre").setBlockTextureName("endplus:enderRedstoneOre").setHardness(3.0F).setResistance(15.0F);
        this.litEndRedstoneOre = new BlockEnderRedstoneOre(true).setCreativeTab(null).setBlockName("litEnderRedstoneOre").setBlockTextureName("endplus:enderRedstoneOre").setTickRandomly(true).setLightLevel(0.625F).setHardness(3.0F).setResistance(15.0F);
        this.redEmitter = new BlockRedstoneEmitter().setCreativeTab(EndPlus.tabEndplusRedstone).setBlockName("RedstoneEmitter").setHardness(0.5F);
        this.bBreaker = new BlockBreaker().setCreativeTab(EndPlus.tabEndplusRedstone).setBlockName("BlockBreaker").setHardness(0.5F);
        this.redReceiver = new BlockRedstoneReceiver().setCreativeTab(EndPlus.tabEndplusRedstone).setBlockName("RedstoneReceiver").setHardness(0.5F);
        this.red = new BlockEmittedRedstone().setCreativeTab(null).setBlockName("RedstoneEmitted").setBlockTextureName("endplus:enderRed");
        this.mossStone = new BlockBase(Material.rock).setHardness(2.0F).setResistance(10.0F).setStepSound(Block.soundTypePiston).setBlockName("stoneMoss2").setCreativeTab(null).setBlockTextureName("endplus:stoneMoss");
        this.mossStairs = new BlockMossyCobblestoneStairs(this.mossStone, 0).setCreativeTab(EndPlus.tabEndplus).setBlockName("mossStairs");
        this.bPlacer = new BlockPlacer().setCreativeTab(EndPlus.tabEndplusRedstone).setBlockName("BlockPlacer").setTickRandomly(true).setHardness(0.5F);
        this.Enderblock = new BlockEnder(false).setCreativeTab(EndPlus.tabEndplus).setBlockName("Enderblock").setBlockTextureName("endplus:enderBlock").setHardness(50.0F).setResistance(2000.0F);
        this.EnchEnderblock = new BlockEnder(true).setCreativeTab(EndPlus.tabEndplus).setBlockName("EnchEnderblock").setBlockTextureName("endplus:enderBlock").setHardness(50.0F).setResistance(2000.0F);
        this.blockEnderRedstone = new BlockEnderRedstoneCompressed().setCreativeTab(EndPlus.tabEndplusRedstone).setBlockName("BlockEnderRedstone").setBlockTextureName("endplus:blockEnderRedstone").setHardness(5.0F).setResistance(10.0F);
        this.questBlock = new BlockBase(Material.rock).setBlockTextureName("endplus:quest_block").setCreativeTab(EndPlus.tabEndplus).setBlockName("questBlock").setHardness(1.5F).setResistance(10.0F);
        
    }
    public void setupHarvestLevels()
    {
        /*Setting up block harvest levels*/
        graniteRough.setHarvestLevel("pickaxe", 1); 
        graniteSmooth.setHarvestLevel("pickaxe", 1); 
        flameriteOre.setHarvestLevel("pickaxe", 2);
        umbriteOre.setHarvestLevel("pickaxe", 2);
        luciteOre.setHarvestLevel("pickaxe", 2);
        umbriteBlock.setHarvestLevel("pickaxe", 2);
        luciteBlock.setHarvestLevel("pickaxe", 2);
        flameriteBlock.setHarvestLevel("pickaxe", 2);
        enderiteBlock.setHarvestLevel("pickaxe", 3);
        blockGoldFlamerite.setHarvestLevel("pickaxe", 1);
        enderiteOre.setHarvestLevel("pickaxe", 3);
        endDirt.setHarvestLevel("shovel", 0);
        endGrass.setHarvestLevel("shovel", 0);
        soulDirt.setHarvestLevel("shovel", 0);
        netherEssence.setHarvestLevel("pickaxe", 1); //Work In Progress
        enderEssence.setHarvestLevel("pickaxe", 1); //Work In Progress
        overworldEssence.setHarvestLevel("pickaxe", 1); //Work In Progress
        cavernStone.setHarvestLevel("pickaxe", 1);
        netherStone.setHarvestLevel("pickaxe", 0);
        endRedstoneOre.setHarvestLevel("pickaxe", 2);
        litEndRedstoneOre.setHarvestLevel("pickaxe", 2);
        mossStairs.setHarvestLevel("pickaxe", 0);
        Enderblock.setHarvestLevel("pickaxe", 3);
        EnchEnderblock.setHarvestLevel("pickaxe", 3);
        
    }
    
}
