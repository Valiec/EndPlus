package com.kpabr.EndPlus;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockEndPortal;
import net.minecraft.block.BlockRedstoneWire;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.BlockWood;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.oredict.OreDictionary;

public class EndBlocks {


    /*Block declarations*/
    
    public static Block enderiteOre;
    public static Block netherStoneQuartz;
    public static Block shadowBloom;
    public static Block endSapling;
    public static Block enchSapling;
    public static Block enchBirchSapling;
    public static Block soulDirt;
    public static Block umbriteOre;
    public static Block luciteOre;
    public static Block luciteBlock;
    public static Block buoy;
    public static Block endLeaves;
    public static Block endLeavesGen;
    public static Block enchLeaves;
    public static Block enchLeavesGen;
    public static Block enchLeavesBirch;
    public static Block enchLeavesBirchGen;
    public static Block endLog;
    public static Block enchOakLog;
    public static Block enchBirchLog;
    public static Block enderiteBlock;
    public static Block golderaldBlock;
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
    public static BlockRedstoneWire endRedstone;
    public static Block endRedstoneOre;
    public static Block litEndRedstoneOre;
    public static Block redEmitter;
    public static Block redReceiver;
    public static Block red;
    public static Block bBreaker;
    public static Block mossStairs;
    //public static Block mossStone;
    public static Block bPlacer;
    public static Block Enderblock;
    public static Block EnchEnderblock;
    public static Block blockEnderRedstone;
    public static Block questBlock0;
    public static Block questBlock1;
    public static Block questBlock2;
    public static Block questBlock3;
    public static Block questBlock4;
    public static Block questBlock5;
    public static Block questBlock6;
    public static Block questBlock7;
    public static Block questBlock8;
    public static Block questBlock9;
    public static Block questBlock10;
    public static Block questBlock11;
    public static Block questBlock12;
    public static Block questBlock13;
    public static Block questBlock14;
    public static Block questBlock15;
    public static Block[] questBlocks = {questBlock0, questBlock1, questBlock2, questBlock3, questBlock4, questBlock5, questBlock6, questBlock7, questBlock8, questBlock9, questBlock10, questBlock11, questBlock12, questBlock13, questBlock14, questBlock15};
	public static Block infusedQuartzBlock;
	public static Block enchGrass;
    public static Block golderaldOre;
    public static Block chiseledStone;
	public static Block stoneSlab;
	public static Block doubleStoneSlab;
	public static Block endportal;
	public static Block enderwoodPlanks;
	public static Block enderwoodStairs;
	public static Block enderwoodSlab;
	public static Block doubleEnderwoodSlab;
	public static Block essenceOverworld;
	public static Block essenceEmitterOverworld;
	//public static Block enderwoodChest;
	public static Block essenceNether;
	public static Block essenceEmitterNether;
	public static Block essenceEnder;
	public static Block essenceEmitterEnder;
    
    
    public void registerBlocks()
    {
        GameRegistry.registerBlock(this.enderiteOre, "enderite_ore");
        GameRegistry.registerBlock(this.netherStoneQuartz, "nether_stone_quartz");
        GameRegistry.registerBlock(this.endSapling, "ender_sapling");
        GameRegistry.registerBlock(this.enchSapling, "enchanted_oak_sapling");
        GameRegistry.registerBlock(this.enchBirchSapling, "enchanted_birch_sapling");
        GameRegistry.registerBlock(this.buoy, ItemBlockBuoy.class, "buoy");
        GameRegistry.registerBlock(this.endLeaves, "ender_leaves");
        GameRegistry.registerBlock(this.endLeavesGen, "ender_leaves_decay");
        GameRegistry.registerBlock(this.enchLeaves, "enchanted_leaves");
        GameRegistry.registerBlock(this.enchLeavesGen, "enchanted_leaves_decay");
        GameRegistry.registerBlock(this.enchLeavesBirch, "enchanted_birch_leaves");
        GameRegistry.registerBlock(this.enchLeavesBirchGen, "enchanted_birch_leaves_decay");
        GameRegistry.registerBlock(this.endLog, "ender_log");
        GameRegistry.registerBlock(this.enchOakLog, "enchanted_oak_log");
        GameRegistry.registerBlock(this.enchBirchLog, "enchanted_birch_log");
        GameRegistry.registerBlock(this.netherEssence, "nether_essence");
        GameRegistry.registerBlock(this.enderEssence, "ender_essence");
        GameRegistry.registerBlock(this.overworldEssence, "overworld_essence");
        GameRegistry.registerBlock(this.cavernStone, "cavern_stone");
        GameRegistry.registerBlock(this.soulDirt, "soul_dirt");
        GameRegistry.registerBlock(this.umbriteOre, "umbrite_ore");
        GameRegistry.registerBlock(this.luciteOre, "lucite_ore");
        GameRegistry.registerBlock(this.enderiteBlock, "enderite_block");
        GameRegistry.registerBlock(this.golderaldBlock, "golderald_block");
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
        //GameRegistry.registerBlock(this.endRedstone, "ender_redstone");
        GameRegistry.registerBlock(this.endRedstoneOre, "ender_redstone_ore");
        GameRegistry.registerBlock(this.litEndRedstoneOre, "lit_ender_redstone_ore");
        GameRegistry.registerBlock(this.redEmitter, ItemBlockRedstone.class, "redstone_emitter");
        GameRegistry.registerBlock(this.redReceiver, ItemBlockRedstone.class, "redstone_receiver");
        GameRegistry.registerBlock(this.red, "redstone_emitted");
        GameRegistry.registerBlock(this.bBreaker, ItemBlockRedstone.class, "block_breaker");
        GameRegistry.registerBlock(this.mossStairs, "moss_stone_stairs");
        //GameRegistry.registerBlock(this.mossStone, "moss_stone_2");
        GameRegistry.registerBlock(this.bPlacer, ItemBlockRedstone.class, "block_placer");
        GameRegistry.registerBlock(this.Enderblock, "ender_block");
        GameRegistry.registerBlock(this.EnchEnderblock, "ench_ender_block");
        GameRegistry.registerBlock(this.blockEnderRedstone, "ender_redstone_block");
        GameRegistry.registerBlock(this.questBlock0, "quest_block_0");
        GameRegistry.registerBlock(this.questBlock1, "quest_block_1");
        GameRegistry.registerBlock(this.questBlock2, "quest_block_2");
        GameRegistry.registerBlock(this.questBlock3, "quest_block_3");
        GameRegistry.registerBlock(this.questBlock4, "quest_block_4");
        GameRegistry.registerBlock(this.questBlock5, "quest_block_5");
        GameRegistry.registerBlock(this.questBlock6, "quest_block_6");
        GameRegistry.registerBlock(this.questBlock7, "quest_block_7");
        GameRegistry.registerBlock(this.questBlock8, "quest_block_8");
        GameRegistry.registerBlock(this.questBlock9, "quest_block_9");
        GameRegistry.registerBlock(this.questBlock10, "quest_block_10");
        GameRegistry.registerBlock(this.questBlock11, "quest_block_11");
        GameRegistry.registerBlock(this.questBlock12, "quest_block_12");
        GameRegistry.registerBlock(this.questBlock13, "quest_block_13");
        GameRegistry.registerBlock(this.questBlock14, "quest_block_14");
        GameRegistry.registerBlock(this.questBlock15, "quest_block_15");
        GameRegistry.registerBlock(this.infusedQuartzBlock, "infused_quartz_block");
        GameRegistry.registerBlock(this.enchGrass, ItemBlockEndGrass.class, "enchanted_grass");
        GameRegistry.registerBlock(this.golderaldOre, "golderald_ore");
        GameRegistry.registerBlock(this.chiseledStone, "chiseled_stone");
        GameRegistry.registerBlock(this.shadowBloom, "shadow_bloom");
        //GameRegistry.registerBlock(this.endportal, "end_portal");
        GameRegistry.registerBlock(this.stoneSlab, ItemBlockStoneSlab.class, "single_stone_slab");
        GameRegistry.registerBlock(this.doubleStoneSlab, ItemBlockStoneSlab.class, "double_stone_slab");
        //Block.blockRegistry.addObject(119, "end_portal", (new BlockEnderPortal(Material.portal)).setHardness(-1.0F).setResistance(6000000.0F));
        GameRegistry.registerBlock(this.enderwoodPlanks, "enderwood_planks");
        GameRegistry.registerBlock(this.enderwoodStairs, "enderwood_stairs");
        GameRegistry.registerBlock(this.enderwoodSlab, ItemBlockWoodSlab.class, "single_enderwood_slab");
        GameRegistry.registerBlock(this.doubleEnderwoodSlab, ItemBlockWoodSlab.class, "double_enderwood_slab");
        //GameRegistry.registerBlock(this.enderwoodChest, "enderwood_chest");
        
        GameRegistry.registerBlock(this.essenceOverworld, "essence_emitted_overworld");
        
        GameRegistry.registerBlock(this.essenceEmitterOverworld, "essence_emitter_overworld");
        
        GameRegistry.registerBlock(this.essenceNether, "essence_emitted_nether");
        
        GameRegistry.registerBlock(this.essenceEmitterNether, "essence_emitter_nether");
        
        GameRegistry.registerBlock(this.essenceEnder, "essence_emitted_ender");
        
        GameRegistry.registerBlock(this.essenceEmitterEnder, "essence_emitter_ender");
    }
    public void setupBlocks()
    {
        this.buoy = new BlockBuoy(Material.rock).setBlockName("buoy").setCreativeTab(EndPlus.tabEndplus).setLightLevel(0.9F);
        this.endLeaves = new BlockEnderLeaves(false).setBlockName("enderLeaves").setCreativeTab(EndPlus.tabEndplus).setLightOpacity(1);
        this.endLeavesGen = new BlockEnderLeaves(true).setBlockName("enderLeaves").setCreativeTab(null).setLightOpacity(1);
        this.enchLeaves = new BlockEnchLeaves(false).setBlockName("enchLeaves").setCreativeTab(EndPlus.tabEndplusMagic).setLightOpacity(1);
        this.enchLeavesGen = new BlockEnchLeaves(true).setBlockName("enchLeaves").setCreativeTab(null).setLightOpacity(1);
        this.enchLeavesBirch = new BlockEnchLeavesBirch(false).setBlockName("enchLeavesBirch").setCreativeTab(EndPlus.tabEndplusMagic).setLightOpacity(1);
        this.enchLeavesBirchGen = new BlockEnchLeavesBirch(true).setBlockName("enchLeavesBirch").setCreativeTab(null).setLightOpacity(1);
        this.endLog = new BlockEnderLog().setBlockName("enderLog").setCreativeTab(EndPlus.tabEndplus).setBlockTextureName("EndPlus:log_big_oak1");
        this.enchOakLog = new BlockEnchOakLog().setBlockName("enchOakLog").setCreativeTab(EndPlus.tabEndplusMagic).setBlockTextureName("EndPlus:log_oak");
        this.enchBirchLog = new BlockEnchBirchLog().setBlockName("enchBirchLog").setCreativeTab(EndPlus.tabEndplusMagic).setBlockTextureName("EndPlus:log_birch");
        this.netherTorch = new BlockTorchBase(false).setBlockTextureName("endplus:netherTorch").setBlockName("netherTorch").setCreativeTab(EndPlus.tabEndplus).setLightLevel(0.99F);
        this.enderTorch = new BlockTorchBase(true).setBlockTextureName("endplus:enderTorch").setBlockName("enderTorch").setCreativeTab(EndPlus.tabEndplus).setLightLevel(0.99F);
        this.graniteRough = new BlockBase(Material.rock).setBlockTextureName("endplus:graniteRough").setBlockName("graniteRough").setCreativeTab(EndPlus.tabEndplus).setHardness(1.6F).setResistance(10.0F);
        this.graniteSmooth = new BlockBase(Material.rock).setBlockTextureName("endplus:graniteSmooth").setBlockName("graniteSmooth").setCreativeTab(EndPlus.tabEndplus).setHardness(1.6F).setResistance(10.0F);
        this.enderStalk = new BlockEnderStalk().setBlockTextureName("endplus:enderStalk").setBlockName("enderStalk");
        this.shadowBloom = new BlockShadowBloom().setBlockTextureName("endplus:shadow_bloom").setBlockName("shadowBloom").setCreativeTab(EndPlus.tabEndplusMagic);
        this.endDirt = new BlockEnderDirt(0, Material.ground).setBlockTextureName("endplus:enderDirt").setBlockName("enderDirt").setHardness(1.6F).setCreativeTab(EndPlus.tabEndplus);
        this.endGrass = new BlockEnderGrass(Material.grass).setBlockName("enderGrass").setHardness(1.6F).setCreativeTab(EndPlus.tabEndplus).setTickRandomly(true);
        this.soulDirt = new BlockHellDirt(0, Material.ground).setBlockTextureName("endplus:helldirt").setBlockName("soulDirt").setHardness(1.6F).setCreativeTab(EndPlus.tabEndplus);
        this.enderiteOre = new BlockEnderiteOre(Material.rock).setBlockTextureName("endplus:enderiteOre").setCreativeTab(EndPlus.tabEndplus).setBlockName("enderiteOre").setHardness(1.5F).setResistance(15.0F);
        this.netherEssence = new BlockNetherEssence(Material.rock).setBlockTextureName("endplus:netherEssence").setCreativeTab(EndPlus.tabEndplus).setBlockName("netherEssence").setHardness(1.6F).setResistance(12.0F); 
        this.enderEssence = new BlockEnderEssence(Material.rock).setBlockTextureName("endplus:enderEssence").setCreativeTab(EndPlus.tabEndplus).setBlockName("enderEssence").setHardness(3.0F).setResistance(15.0F);
        this.overworldEssence = new BlockOverworldEssence(Material.rock).setBlockTextureName("endplus:overworldEssence").setCreativeTab(EndPlus.tabEndplus).setBlockName("overworldEssence").setHardness(1.5F).setResistance(10.0F);
        this.cavernStone = new BlockCavernStone(Material.rock).setBlockTextureName("endplus:cavernStone").setCreativeTab(EndPlus.tabEndplus).setBlockName("cavernStone").setHardness(1.6F).setResistance(9.5F);
        this.umbriteOre = new BlockUmbriteOre(Material.rock).setBlockTextureName("endplus:umbriteOre").setCreativeTab(EndPlus.tabEndplus).setBlockName("umbriteOre").setHardness(1.5F).setResistance(3.0F);
        this.netherStoneQuartz = new BlockNetherStoneQuartz().setBlockTextureName("endplus:stoneQuartz").setCreativeTab(EndPlus.tabEndplus).setBlockName("quartzOre").setHardness(1.5F).setResistance(10.0F);
        this.luciteOre = new BlockLuciteOre(Material.rock).setBlockTextureName("endplus:luciteOre").setCreativeTab(EndPlus.tabEndplus).setBlockName("luciteOre").setHardness(1.5F).setResistance(10.0F);
        this.enderiteBlock = new BlockBase(Material.rock).setBlockTextureName("endplus:blockEnderite").setCreativeTab(EndPlus.tabEndplus).setBlockName("blockEnderite").setHardness(3.5F).setResistance(17.0F); 
        this.golderaldBlock = new BlockBase(Material.rock).setBlockTextureName("endplus:quest_block").setCreativeTab(EndPlus.tabEndplus).setBlockName("blockGolderald").setHardness(3.5F).setResistance(17.0F); 
        this.flameriteBlock = new BlockBase(Material.rock).setBlockTextureName("endplus:blockFlamerite").setCreativeTab(EndPlus.tabEndplus).setBlockName("blockFlamerite").setHardness(3.0F).setResistance(10.0F); 
        this.blockGoldFlamerite = new BlockBase(Material.rock).setBlockTextureName("endplus:blockGFlamerite").setCreativeTab(EndPlus.tabEndplus).setBlockName("blockGoldFlamerite").setHardness(3.0F).setResistance(9.0F);
        this.umbriteBlock = new BlockBase(Material.rock).setBlockTextureName("endplus:blockUmbrite").setCreativeTab(EndPlus.tabEndplusMagic).setBlockName("blockUmbrite").setHardness(3.0F).setResistance(10.0F);
        this.luciteBlock = new BlockBase(Material.rock).setBlockTextureName("endplus:blockLucite").setCreativeTab(EndPlus.tabEndplusMagic).setBlockName("blockLucite").setHardness(3.0F).setResistance(10.0F);
        this.netherStone = new BlockBase(Material.rock).setBlockTextureName("endplus:netherStone").setCreativeTab(EndPlus.tabEndplus).setBlockName("netherStone").setHardness(1.3F).setResistance(10.0F); 
        this.flameriteOre = new BlockBase(Material.rock).setBlockTextureName("endplus:flameriteOre").setCreativeTab(EndPlus.tabEndplus).setBlockName("flameriteOre").setHardness(1.5F).setResistance(3.0F);
        this.endSapling = new BlockEnderSapling().setCreativeTab(EndPlus.tabEndplus).setBlockName("enderSapling");
        this.enchSapling = new BlockEnchOakSapling().setCreativeTab(EndPlus.tabEndplusMagic).setBlockName("enchSapling");
        this.enchBirchSapling = new BlockEnchBirchSapling().setCreativeTab(EndPlus.tabEndplusMagic).setBlockName("enchBirchSapling");
        this.endRedstone = (BlockRedstoneWire)(new BlockRedstoneWire().setCreativeTab(null).setBlockName("enderRedstoneDust")).setTickRandomly(true);
        this.endRedstoneOre = new BlockEnderRedstoneOre(false).setCreativeTab(EndPlus.tabEndplus).setBlockName("enderRedstoneOre").setBlockTextureName("endplus:enderRedstoneOre").setHardness(3.0F).setResistance(15.0F);
        this.litEndRedstoneOre = new BlockEnderRedstoneOre(true).setCreativeTab(null).setBlockName("litEnderRedstoneOre").setBlockTextureName("endplus:enderRedstoneOre").setTickRandomly(true).setLightLevel(0.625F).setHardness(3.0F).setResistance(15.0F);
        this.redEmitter = new BlockRedstoneEmitter().setCreativeTab(EndPlus.tabEndplusRedstone).setBlockName("RedstoneEmitter").setHardness(0.5F);
        this.bBreaker = new BlockBreaker().setCreativeTab(EndPlus.tabEndplusRedstone).setBlockName("BlockBreaker").setHardness(0.5F);
        this.redReceiver = new BlockRedstoneReceiver().setCreativeTab(EndPlus.tabEndplusRedstone).setBlockName("RedstoneReceiver").setHardness(0.5F);
        this.red = new BlockEmittedRedstone().setCreativeTab(null).setBlockName("RedstoneEmitted").setBlockTextureName("endplus:enderRed");
        //this.mossStone = new BlockBase(Material.rock).setHardness(2.0F).setResistance(10.0F).setStepSound(Block.soundTypePiston).setBlockName("stoneMoss2").setCreativeTab(null).setBlockTextureName("endplus:stoneMoss");
        this.mossStairs = new BlockMossyCobblestoneStairs(Blocks.mossy_cobblestone, 0).setCreativeTab(EndPlus.tabEndplus).setBlockName("mossStairs");
        this.bPlacer = new BlockPlacer().setCreativeTab(EndPlus.tabEndplusRedstone).setBlockName("BlockPlacer").setTickRandomly(true).setHardness(0.5F);
        this.Enderblock = new BlockEnder(false).setCreativeTab(EndPlus.tabEndplus).setBlockName("Enderblock").setBlockTextureName("endplus:enderBlock").setHardness(50.0F).setResistance(2000.0F);
        this.EnchEnderblock = new BlockEnder(true).setCreativeTab(EndPlus.tabEndplusMagic).setBlockName("EnchEnderblock").setBlockTextureName("endplus:enderBlock").setHardness(50.0F).setResistance(2000.0F);
        this.blockEnderRedstone = new BlockEnderRedstoneCompressed().setCreativeTab(EndPlus.tabEndplusRedstone).setBlockName("BlockEnderRedstone").setBlockTextureName("endplus:blockEnderRedstone").setHardness(5.0F).setResistance(10.0F);
        this.questBlock0 = new BlockQuest().setBlockTextureName("endplus:quest_block_gflamerite_sword").setCreativeTab(EndPlus.tabEndplus).setBlockName("questBlock_0").setHardness(1.5F).setResistance(10.0F);
        this.questBlock1 = new BlockQuest().setBlockTextureName("endplus:quest_block_gflamerite_pickaxe").setCreativeTab(EndPlus.tabEndplus).setBlockName("questBlock_1").setHardness(1.5F).setResistance(10.0F);
        this.questBlock2 = new BlockQuest().setBlockTextureName("endplus:quest_block_gflamerite_hatchet").setCreativeTab(EndPlus.tabEndplus).setBlockName("questBlock_2").setHardness(1.5F).setResistance(10.0F);
        this.questBlock3 = new BlockQuest().setBlockTextureName("endplus:quest_block_gflamerite_helmet").setCreativeTab(EndPlus.tabEndplus).setBlockName("questBlock_3").setHardness(1.5F).setResistance(10.0F);
        this.questBlock4 = new BlockQuest().setBlockTextureName("endplus:quest_block_bbreaker").setCreativeTab(EndPlus.tabEndplus).setBlockName("questBlock_4").setHardness(1.5F).setResistance(10.0F);
        this.questBlock5 = new BlockQuest().setBlockTextureName("endplus:quest_block_bplacer").setCreativeTab(EndPlus.tabEndplus).setBlockName("questBlock_5").setHardness(1.5F).setResistance(10.0F);
        this.questBlock6 = new BlockQuest().setBlockTextureName("endplus:quest_block_umbrite_block").setCreativeTab(EndPlus.tabEndplus).setBlockName("questBlock_6").setHardness(1.5F).setResistance(10.0F);
        this.questBlock7 = new BlockQuest().setBlockTextureName("endplus:quest_block_lucite_block").setCreativeTab(EndPlus.tabEndplus).setBlockName("questBlock_7").setHardness(1.5F).setResistance(10.0F);
        this.questBlock8 = new BlockQuest().setBlockTextureName("endplus:quest_block_netherstone_pickaxe").setCreativeTab(EndPlus.tabEndplus).setBlockName("questBlock_8").setHardness(1.5F).setResistance(10.0F);
        this.questBlock9 = new BlockQuest().setBlockTextureName("endplus:quest_block_ender_wart").setCreativeTab(EndPlus.tabEndplus).setBlockName("questBlock_9").setHardness(1.5F).setResistance(10.0F);
        this.questBlock10 = new BlockQuest().setBlockTextureName("endplus:quest_block_cavern_stone").setCreativeTab(EndPlus.tabEndplus).setBlockName("questBlock_10").setHardness(1.5F).setResistance(10.0F);
        this.questBlock11 = new BlockQuest().setBlockTextureName("endplus:quest_block_overworld_essence").setCreativeTab(EndPlus.tabEndplus).setBlockName("questBlock_11").setHardness(1.5F).setResistance(10.0F);
        this.questBlock12 = new BlockQuest().setBlockTextureName("endplus:quest_block_enchanted_golden_apple").setCreativeTab(EndPlus.tabEndplus).setBlockName("questBlock_12").setHardness(1.5F).setResistance(10.0F);
        this.questBlock13 = new BlockQuest().setBlockTextureName("endplus:quest_block_enchanted_ender_obsidian").setCreativeTab(EndPlus.tabEndplus).setBlockName("questBlock_13").setHardness(1.5F).setResistance(10.0F);
        this.questBlock14 = new BlockQuest().setBlockTextureName("endplus:quest_block_enderwood_sapling").setCreativeTab(EndPlus.tabEndplus).setBlockName("questBlock_14").setHardness(1.5F).setResistance(10.0F);
        this.questBlock15 = new BlockQuest().setBlockTextureName("endplus:quest_block_nether_star").setCreativeTab(EndPlus.tabEndplus).setBlockName("questBlock_15").setHardness(1.5F).setResistance(10.0F);
        this.infusedQuartzBlock = new BlockBase(Material.rock).setBlockTextureName("endplus:blockQI").setCreativeTab(EndPlus.tabEndplus).setBlockName("blockInfusedQuartz").setHardness(0.8F);
        this.enchGrass = new BlockEnchGrass(Material.grass).setBlockName("enchGrass").setHardness(0.6F).setCreativeTab(EndPlus.tabEndplusMagic).setTickRandomly(true);
        this.golderaldOre = new BlockGolderaldOre(Material.rock).setBlockTextureName("endplus:oreGolderald").setCreativeTab(EndPlus.tabEndplusMagic).setBlockName("golderaldOre").setHardness(1.5F).setResistance(15.0F);
        this.chiseledStone = new BlockBase(Material.rock).setBlockTextureName("endplus:chiseled_stone").setCreativeTab(EndPlus.tabEndplus).setBlockName("blockChiseledStone").setHardness(0.8F);
        this.stoneSlab = new BlockCustomSlab(false, Material.rock).setCreativeTab(EndPlus.tabEndplus).setBlockTextureName("minecraft:stone").setLightOpacity(0).setBlockName("smoothStoneSlab").setHardness(0.8F);
        this.doubleStoneSlab = new BlockCustomSlab(true, Material.rock).setCreativeTab(null).setBlockTextureName("minecraft:stone").setBlockName("smoothDoubleStoneSlab").setHardness(0.8F);
        this.enderwoodPlanks = new BlockBase(Material.wood).setHardness(2.0F).setResistance(5.0F).setCreativeTab(EndPlus.tabEndplus).setBlockName("enderwoodPlanks").setBlockTextureName("endplus:planks_enderwood");
        this.enderwoodSlab = new BlockCustomSlab(false, Material.wood).setHardness(2.0F).setResistance(5.0F).setCreativeTab(EndPlus.tabEndplus).setLightOpacity(0).setBlockName("enderwoodSlab").setBlockTextureName("endplus:planks_enderwood");
        this.doubleEnderwoodSlab = new BlockCustomSlab(true, Material.wood).setHardness(2.0F).setResistance(5.0F).setCreativeTab(null).setBlockName("enderwoodDoubleSlab").setBlockTextureName("endplus:planks_enderwood");
        this.enderwoodStairs = new BlockMossyCobblestoneStairs(EndPlus.blocks.enderwoodPlanks, 0).setCreativeTab(EndPlus.tabEndplus).setBlockName("enderwoodStairs");
        this.essenceEmitterOverworld = new BlockEssenceEmitterOverworld().setCreativeTab(EndPlus.tabEndplusMagic).setBlockName("EssenceEmitterOverworld").setHardness(0.5F);
        this.essenceOverworld = new BlockEmittedEssenceOverworld().setCreativeTab(null).setBlockName("EssenceEmittedOverworld").setBlockTextureName("endplus:enderRed");
        this.essenceEmitterNether = new BlockEssenceEmitterNether().setCreativeTab(EndPlus.tabEndplusMagic).setBlockName("EssenceEmitterNether").setHardness(0.5F);
        this.essenceNether = new BlockEmittedEssenceNether().setCreativeTab(null).setBlockName("EssenceEmittedNether").setBlockTextureName("endplus:enderRed");
        this.essenceEmitterEnder = new BlockEssenceEmitterEnder().setCreativeTab(EndPlus.tabEndplusMagic).setBlockName("EssenceEmitterEnder").setHardness(0.5F);
        this.essenceEnder = new BlockEmittedEssenceEnder().setCreativeTab(null).setBlockName("EssenceEmittedEnder").setBlockTextureName("endplus:enderRed");
        //this.endportal = new BlockEnderPortal(Material.portal).setHardness(-1.0F).setResistance(6000000.0F);
        //this.enderwoodChest = new BlockEnderwoodChest(0).setHardness(2.0F).setResistance(5.0F).setCreativeTab(EndPlus.tabEndplus).setBlockName("enderwoodPlanks");

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
        infusedQuartzBlock.setHarvestLevel("pickaxe", 1);
        questBlock0.setHarvestLevel("pickaxe", 2);
        questBlock1.setHarvestLevel("pickaxe", 2);
        questBlock2.setHarvestLevel("pickaxe", 2);
        questBlock3.setHarvestLevel("pickaxe", 2);
        questBlock4.setHarvestLevel("pickaxe", 2);
        questBlock5.setHarvestLevel("pickaxe", 2);
        questBlock6.setHarvestLevel("pickaxe", 2);
        questBlock7.setHarvestLevel("pickaxe", 2);
        questBlock8.setHarvestLevel("pickaxe", 2);
        questBlock9.setHarvestLevel("pickaxe", 2);
        questBlock10.setHarvestLevel("pickaxe", 2);
        questBlock11.setHarvestLevel("pickaxe", 2);
        questBlock12.setHarvestLevel("pickaxe", 2);
        questBlock13.setHarvestLevel("pickaxe", 2);
        questBlock14.setHarvestLevel("pickaxe", 2);
        questBlock15.setHarvestLevel("pickaxe", 2);
        enchGrass.setHarvestLevel("shovel", 0);
        chiseledStone.setHarvestLevel("pickaxe", 0); 
        stoneSlab.setHarvestLevel("pickaxe", 0); 
        doubleStoneSlab.setHarvestLevel("pickaxe", 0); 
        stoneSlab.setHarvestLevel("axe", 0); 
        doubleStoneSlab.setHarvestLevel("axe", 0); 
       
    }
    public void registerBlocksOreDict()
    {
    	OreDictionary.registerOre("logWood", this.endLog);
    	OreDictionary.registerOre("plankWood", this.enderwoodPlanks);
    	OreDictionary.registerOre("slabWood", this.enderwoodSlab);
    	OreDictionary.registerOre("stairWood", this.enderwoodStairs);
    	
    	
        
    }
    
}
