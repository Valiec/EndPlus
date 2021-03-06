package com.kpabr.EndPlus;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import cpw.mods.fml.common.registry.GameRegistry;

public class EndRecipes {

    public void setupShapedCrafting()
    {
        /*Registering shaped crafting recipes in GameRegistry*/
        for(int i = 0; i<16; i++)
        {
            GameRegistry.addShapelessRecipe(new ItemStack(EndPlus.blocks.buoy, 1, i), new Object[]{new ItemStack(EndPlus.blocks.buoy, 1, OreDictionary.WILDCARD_VALUE), new ItemStack(Items.dye, 1, 15-i)});
            GameRegistry.addRecipe(new ItemStack(EndPlus.blocks.buoy, 1, i), new Object[]{"WWW", "WZW", "WXW", 'W', new ItemStack(Blocks.wool, 1, i), 'X', Items.iron_ingot, 'Z', Blocks.torch});
            GameRegistry.addRecipe(new ItemStack(EndPlus.blocks.buoy, 1, i), new Object[]{"WWW", "WZW", "WXW", 'W', new ItemStack(Blocks.wool, 1, i), 'X', Items.iron_ingot, 'Z', EndPlus.blocks.netherTorch});
            GameRegistry.addRecipe(new ItemStack(EndPlus.blocks.buoy, 1, i), new Object[]{"WWW", "WZW", "WXW", 'W', new ItemStack(Blocks.wool, 1, i), 'X', Items.iron_ingot, 'Z', EndPlus.blocks.enderTorch});
        }
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.swordEnderite, 1), new Object[]{" X ", " X ", " W ", 'W', Items.stick, 'X', EndPlus.items.enderiteGem});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.pickaxeEnderite, 1), new Object[]{"XXX", " W ", " W ", 'W', Items.stick, 'X', EndPlus.items.enderiteGem});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.hoeEnderite, 1), new Object[]{"XX ", " W ", " W ", 'W', Items.stick, 'X', EndPlus.items.enderiteGem});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.hoeEnderite, 1), new Object[]{" XX", " W ", " W ", 'W', Items.stick, 'X', EndPlus.items.enderiteGem});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.shovelEnderite, 1), new Object[]{" X ", " W ", " W ", 'W', Items.stick, 'X', EndPlus.items.enderiteGem});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.axeEnderite, 1), new Object[]{"XX ", "XW ", " W ", 'W', Items.stick, 'X', EndPlus.items.enderiteGem});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.axeEnderite, 1), new Object[]{" XX", " WX", " W ", 'W', Items.stick, 'X', EndPlus.items.enderiteGem});
        
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.pickaxeEndstone, 1), new Object[]{"XXX", " W ", " W ", 'W', Items.stick, 'X', Blocks.end_stone});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.hoeEndstone, 1), new Object[]{"XX ", " W ", " W ", 'W', Items.stick, 'X', Blocks.end_stone});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.hoeEndstone, 1), new Object[]{" XX", " W ", " W ", 'W', Items.stick, 'X', Blocks.end_stone});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.shovelEndstone, 1), new Object[]{" X ", " W ", " W ", 'W', Items.stick, 'X', Blocks.end_stone});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.axeEndstone, 1), new Object[]{"XX ", "XW ", " W ", 'W', Items.stick, 'X', Blocks.end_stone});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.axeEndstone, 1), new Object[]{" XX", " WX", " W ", 'W', Items.stick, 'X', Blocks.end_stone});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.swordEndstone, 1), new Object[]{" X ", " X ", " W ", 'W', Items.stick, 'X', Blocks.end_stone});
        
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.pickaxeNetherstone, 1), new Object[]{"XXX", " W ", " W ", 'W', Items.stick, 'X', EndPlus.blocks.netherStone});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.hoeNetherstone, 1), new Object[]{"XX ", " W ", " W ", 'W', Items.stick, 'X', EndPlus.blocks.netherStone});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.hoeNetherstone, 1), new Object[]{" XX", " W ", " W ", 'W', Items.stick, 'X', EndPlus.blocks.netherStone});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.shovelNetherstone, 1), new Object[]{" X ", " W ", " W ", 'W', Items.stick, 'X',EndPlus.blocks.netherStone});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.axeNetherstone, 1), new Object[]{"XX ", "XW ", " W ", 'W', Items.stick, 'X', EndPlus.blocks.netherStone});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.axeNetherstone, 1), new Object[]{" XX", " WX", " W ", 'W', Items.stick, 'X', EndPlus.blocks.netherStone});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.swordNetherstone, 1), new Object[]{" X ", " X ", " W ", 'W', Items.stick, 'X', EndPlus.blocks.netherStone});
        
        
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.swordFlamerite, 1), new Object[]{" X ", " X ", " W ", 'W', Items.stick, 'X', EndPlus.items.flameriteIngot});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.swordGFlamerite, 1), new Object[]{" X ", " X ", " W ", 'W', Items.stick, 'X', EndPlus.items.gflameriteIngot});
        GameRegistry.addRecipe(new ItemStack(EndPlus.blocks.netherTorch, 6), new Object[]{"X", "W", 'W', Items.stick, 'X', Items.glowstone_dust});
        GameRegistry.addRecipe(new ItemStack(EndPlus.blocks.enderTorch, 6), new Object[]{"X", "W", 'W', Items.stick, 'X', Items.ender_pearl});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.pickaxeFlamerite, 1), new Object[]{"XXX", " W ", " W ", 'W', Items.stick, 'X', EndPlus.items.flameriteIngot});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.swordFlamerite, 1), new Object[]{"XX ", " W ", " W ", 'W', Items.stick, 'X', EndPlus.items.flameriteIngot});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.swordFlamerite, 1), new Object[]{" XX", " W ", " W ", 'W', Items.stick, 'X', EndPlus.items.flameriteIngot});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.shovelFlamerite, 1), new Object[]{" X ", " W ", " W ", 'W', Items.stick, 'X', EndPlus.items.flameriteIngot});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.pickaxeGFlamerite, 1), new Object[]{"XXX", " W ", " W ", 'W', Items.stick, 'X', EndPlus.items.gflameriteIngot});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.swordGFlamerite, 1), new Object[]{"XX ", " W ", " W ", 'W', Items.stick, 'X', EndPlus.items.gflameriteIngot});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.swordGFlamerite, 1), new Object[]{" XX", " W ", " W ", 'W', Items.stick, 'X', EndPlus.items.gflameriteIngot});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.shovelGFlamerite, 1), new Object[]{" X ", " W ", " W ", 'W', Items.stick, 'X', EndPlus.items.gflameriteIngot});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.axeFlamerite, 1), new Object[]{"XX ", "XW ", " W ", 'W', Items.stick, 'X', EndPlus.items.flameriteIngot});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.axeGFlamerite, 1), new Object[]{"XX ", "XW ", " W ", 'W', Items.stick, 'X', EndPlus.items.gflameriteIngot});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.axeFlamerite, 1), new Object[]{" XX", " WX", " W ", 'W', Items.stick, 'X', EndPlus.items.flameriteIngot});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.chestplateEnderite, 1), new Object[]{"X X", "XXX", "XXX", 'X', EndPlus.items.enderiteGem});
        GameRegistry.addRecipe(new ItemStack(EndPlus.blocks.flameriteBlock, 1), new Object[]{"XXX", "XXX", "XXX", 'X', EndPlus.items.flameriteIngot});
        GameRegistry.addRecipe(new ItemStack(EndPlus.blocks.graniteSmooth, 4), new Object[]{"XX", "XX", 'X', EndPlus.blocks.graniteRough});
        GameRegistry.addRecipe(new ItemStack(EndPlus.blocks.umbriteBlock, 1), new Object[]{"XXX", "XXX", "XXX", 'X', EndPlus.items.umbriteCrystal});
        GameRegistry.addRecipe(new ItemStack(EndPlus.blocks.luciteBlock, 1), new Object[]{"XXX", "XXX", "XXX", 'X', EndPlus.items.luciteCrystal});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.legsEnderite, 1), new Object[]{"XXX", "X X", "X X", 'X', EndPlus.items.enderiteGem});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.helmetEnderite, 1), new Object[]{"XXX", "X X", 'X', EndPlus.items.enderiteGem});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.helmetEnderite, 1), new Object[]{"XXX", "X X", 'X', EndPlus.items.enderiteGem});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.bootsEnderite, 1), new Object[]{"X X", "X X", 'X', EndPlus.items.enderiteGem});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.chestplateFlamerite, 1), new Object[]{"X X", "XXX", "XXX", 'X', EndPlus.items.flameriteIngot});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.legsFlamerite, 1), new Object[]{"XXX", "X X", "X X", 'X', EndPlus.items.flameriteIngot});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.helmetFlamerite, 1), new Object[]{"XXX", "X X", 'X', EndPlus.items.flameriteIngot});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.bootsFlamerite, 1), new Object[]{"X X", "X X", 'X', EndPlus.items.flameriteIngot});
        GameRegistry.addRecipe(new ItemStack(Blocks.monster_egg, 4), new Object[]{" X ", "XYX", " X ", 'X', Blocks.stone, 'Y', EndPlus.items.umbriteCrystal});
        GameRegistry.addRecipe(new ItemStack(Blocks.monster_egg, 4, 1), new Object[]{" X ", "XYX", " X ", 'X', Blocks.cobblestone, 'Y', EndPlus.items.umbriteCrystal});
        GameRegistry.addRecipe(new ItemStack(Blocks.monster_egg, 4, 2), new Object[]{" X ", "XYX", " X ", 'X', Blocks.stonebrick, 'Y', EndPlus.items.umbriteCrystal});
        GameRegistry.addRecipe(new ItemStack(EndPlus.blocks.enderiteBlock, 1), new Object[]{"XXX", "XXX", "XXX", 'X', EndPlus.items.enderiteGem});
        GameRegistry.addRecipe(new ItemStack(EndPlus.blocks.golderaldBlock, 1), new Object[]{"XXX", "XXX", "XXX", 'X', EndPlus.items.golderaldGem});
        
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.chestplateGFlamerite, 1), new Object[]{"X X", "XXX", "XXX", 'X', EndPlus.items.gflameriteIngot});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.legsGFlamerite, 1), new Object[]{"XXX", "X X", "X X", 'X', EndPlus.items.gflameriteIngot});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.helmetGFlamerite, 1), new Object[]{"XXX", "X X", 'X', EndPlus.items.gflameriteIngot});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.bootsGFlamerite, 1), new Object[]{"X X", "X X", 'X', EndPlus.items.gflameriteIngot});
        GameRegistry.addRecipe(new ItemStack(EndPlus.blocks.blockGoldFlamerite, 1), new Object[]{"XXX", "XXX", "XXX", 'X', EndPlus.items.gflameriteIngot});
        GameRegistry.addRecipe(new ItemStack(EndPlus.blocks.redEmitter, 1), new Object[]{"XZX", "ZYZ", "XZX", 'X', EndPlus.items.endRD, 'Y', Items.redstone, 'Z', Blocks.cobblestone});
        GameRegistry.addRecipe(new ItemStack(EndPlus.blocks.redReceiver, 1), new Object[]{"YZY", "ZXZ", "YZY", 'X', EndPlus.items.endRD, 'Y', Items.redstone, 'Z', Blocks.cobblestone});
        GameRegistry.addRecipe(new ItemStack(EndPlus.blocks.bPlacer, 1), new Object[]{"YZY", "ZXZ", "YZY", 'Y', EndPlus.items.endRD, 'X', Blocks.dispenser, 'Z', Blocks.cobblestone});
        GameRegistry.addRecipe(new ItemStack(EndPlus.blocks.bBreaker, 1), new Object[]{"YZY", "Z Z", "YZY", 'Y', EndPlus.items.endRD, 'X', Items.redstone, 'Z', Blocks.cobblestone});
        
        GameRegistry.addRecipe(new ItemStack(EndPlus.blocks.blockEnderRedstone, 1), new Object[]{"XXX", "XXX", "XXX", 'X', EndPlus.items.endRD});
        GameRegistry.addRecipe(new ItemStack(EndPlus.blocks.Enderblock, 8), new Object[]{"XXX", "XYX", "XXX", 'X', Blocks.obsidian, 'Y', Items.ender_pearl});
        GameRegistry.addRecipe(new ItemStack(EndPlus.blocks.EnchEnderblock, 8), new Object[]{"XXX", "XYX", "XXX", 'X', Blocks.obsidian, 'Y', Items.ender_eye});
        GameRegistry.addRecipe(new ItemStack(EndPlus.blocks.mossStairs, 4), new Object[]{"  X", " XX", "XXX", 'X', Blocks.mossy_cobblestone});
        GameRegistry.addRecipe(new ItemStack(EndPlus.blocks.mossStairs, 4), new Object[]{"X  ", "XX ", "XXX", 'X', Blocks.mossy_cobblestone});
        
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.swordInfusedQuartz, 1), new Object[]{" X ", " X ", " W ", 'W', Items.stick, 'X', EndPlus.items.infusedQuartz});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.pickaxeInfusedQuartz, 1), new Object[]{"XXX", " W ", " W ", 'W', Items.stick, 'X', EndPlus.items.infusedQuartz});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.axeInfusedQuartz, 1), new Object[]{"XX ", "XW ", " W ", 'W', Items.stick, 'X', EndPlus.items.infusedQuartz});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.axeInfusedQuartz, 1), new Object[]{" XX", " WX", " W ", 'W', Items.stick, 'X', EndPlus.items.infusedQuartz});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.hoeInfusedQuartz, 1), new Object[]{" XX", " W ", " W ", 'W', Items.stick, 'X', EndPlus.items.infusedQuartz});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.hoeInfusedQuartz, 1), new Object[]{"XX ", " W ", " W ", 'W', Items.stick, 'X', EndPlus.items.infusedQuartz});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.shovelInfusedQuartz, 1), new Object[]{" X ", " W ", " W ", 'W', Items.stick, 'X', EndPlus.items.infusedQuartz});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.chestplateInfusedQuartz, 1), new Object[]{"X X", "XXX", "XXX", 'X', EndPlus.items.infusedQuartz});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.legsInfusedQuartz, 1), new Object[]{"XXX", "X X", "X X", 'X', EndPlus.items.infusedQuartz});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.helmetInfusedQuartz, 1), new Object[]{"XXX", "X X", 'X', EndPlus.items.infusedQuartz});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.bootsInfusedQuartz, 1), new Object[]{"X X", "X X", 'X', EndPlus.items.infusedQuartz});
        GameRegistry.addRecipe(new ItemStack(EndPlus.blocks.infusedQuartzBlock, 1), new Object[]{"XXX", "XXX", "XXX", 'X', EndPlus.items.infusedQuartz});
        
        GameRegistry.addRecipe(new ItemStack(EndPlus.blocks.EnchEnderblock, 8), new Object[]{"XXX", "XYX", "XXX", 'X', EndPlus.blocks.Enderblock, 'Y', Items.blaze_powder});
        
        GameRegistry.addRecipe(new ItemStack(EndPlus.blocks.chiseledStone, 1), new Object[]{"X", "X", 'X', Blocks.stone_slab});
        GameRegistry.addRecipe(new ItemStack(EndPlus.blocks.stoneSlab, 12), new Object[]{"XXX", "XXX", 'X', Blocks.stone});
        
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.questCompass, 1), new Object[]{" X ", "XYX", " X ", 'X', Items.iron_ingot, 'Y', Items.emerald});
        
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.golderaldWand, 1), new Object[]{" Y ", "X  ", 'X', Items.blaze_rod, 'Y', EndPlus.items.golderaldGem});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.luciteWand, 1), new Object[]{" Y ", "X  ", 'X', Items.blaze_rod, 'Y', EndPlus.items.luciteCrystal});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.umbriteWand, 1), new Object[]{" Y ", "X  ", 'X', Items.blaze_rod, 'Y', EndPlus.items.umbriteCrystal});
        
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.chestplateShadow, 1), new Object[]{"X X", "XXX", "XXX", 'X', EndPlus.items.shadowCrystal});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.legsShadow, 1), new Object[]{"XXX", "X X", "X X", 'X', EndPlus.items.shadowCrystal});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.helmetShadow, 1), new Object[]{"XXX", "X X", 'X', EndPlus.items.shadowCrystal});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.helmetShadow, 1), new Object[]{"XXX", "X X", 'X', EndPlus.items.shadowCrystal});
        GameRegistry.addRecipe(new ItemStack(EndPlus.items.bootsShadow, 1), new Object[]{"X X", "X X", 'X', EndPlus.items.shadowCrystal});
        
        GameRegistry.addRecipe(new ItemStack(EndPlus.blocks.enderwoodStairs, 4), new Object[]{"  X", " XX", "XXX", 'X', EndPlus.blocks.enderwoodPlanks});
        GameRegistry.addRecipe(new ItemStack(EndPlus.blocks.enderwoodStairs, 4), new Object[]{"X  ", "XX ", "XXX", 'X', EndPlus.blocks.enderwoodPlanks});
        
        GameRegistry.addRecipe(new ItemStack(EndPlus.blocks.enderwoodSlab, 6), new Object[]{"XXX", 'X', EndPlus.blocks.enderwoodPlanks});
        
    }
    public void setupShapelessCrafting()
    {
        /*Registering shapeless crafting recipes in GameRegistry*/
        GameRegistry.addShapelessRecipe(new ItemStack(Items.skull, 3), new Object[]{Blocks.soul_sand, EndPlus.items.umbriteCrystal, Items.arrow});
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 4, 0), new Object[]{EndPlus.blocks.enchOakLog});
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.planks, 4, 2), new Object[]{EndPlus.blocks.enchBirchLog});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.skull, 3, 4), new Object[]{Blocks.soul_sand, EndPlus.items.umbriteCrystal, Items.gunpowder});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.skull, 3, 2), new Object[]{Blocks.soul_sand, EndPlus.items.umbriteCrystal, Items.rotten_flesh});
        GameRegistry.addShapelessRecipe(new ItemStack(Items.skull, 3, 3), new Object[]{Blocks.soul_sand, EndPlus.items.umbriteCrystal, Blocks.cobblestone});
        GameRegistry.addShapelessRecipe(new ItemStack(EndPlus.items.flameriteIngot, 9), new Object[]{EndPlus.blocks.flameriteBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(EndPlus.items.golderaldGem, 9), new Object[]{EndPlus.blocks.golderaldBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(EndPlus.items.umbriteCrystal, 9), new Object[]{EndPlus.blocks.umbriteBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(EndPlus.items.luciteCrystal, 9), new Object[]{EndPlus.blocks.luciteBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(EndPlus.items.gflameriteIngot, 9), new Object[]{EndPlus.blocks.blockGoldFlamerite});
        GameRegistry.addShapelessRecipe(new ItemStack(EndPlus.items.gflameriteIngot, 1), new Object[]{EndPlus.items.flameriteIngot, Items.gold_ingot});
        GameRegistry.addShapelessRecipe(new ItemStack(EndPlus.items.enderiteGem, 9), new Object[]{EndPlus.blocks.enderiteBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(EndPlus.items.endRD, 9), new Object[]{EndPlus.blocks.blockEnderRedstone});
        GameRegistry.addShapelessRecipe(new ItemStack(EndPlus.items.infusedQuartz, 1), new Object[]{Items.quartz, Items.gold_nugget});
        GameRegistry.addShapelessRecipe(new ItemStack(EndPlus.items.infusedQuartz, 9), new Object[]{EndPlus.blocks.infusedQuartzBlock});
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.stone_slab), new Object[]{EndPlus.blocks.stoneSlab});
        GameRegistry.addShapelessRecipe(new ItemStack(EndPlus.blocks.stoneSlab), new Object[]{Blocks.stone_slab});
        GameRegistry.addShapelessRecipe(new ItemStack(EndPlus.items.shadowCrystal), new Object[]{EndPlus.blocks.shadowBloom});
        GameRegistry.addShapelessRecipe(new ItemStack(EndPlus.blocks.enderwoodPlanks, 4), new Object[]{EndPlus.blocks.endLog});
        
        GameRegistry.addShapelessRecipe(new ItemStack(EndPlus.items._3WorldsEssence, 1), new Object[]{EndPlus.items.overworldEssence, EndPlus.items.netherEssence, EndPlus.items.enderEssence, EndPlus.items.golderaldGem});
    }
    /*public void addMissingWoodRecipes()
    {
    	for(ItemStack ore : OreDictionary.getOres("plankWood")) //all wood planks
    	{
    		GameRegistry.addRecipe(new ItemStack(EndPlus.blocks.enderwoodSlab, 6), new Object[]{"XXX", 'X', });
    }*/
    public void addEgg(Item mobItem, int id)
    {
        /*Registering shapeless spawn egg crafting recipes in GameRegistry*/
        GameRegistry.addShapelessRecipe(new ItemStack(Items.spawn_egg, 4, id), new Object[]{mobItem, EndPlus.items.umbriteCrystal});
    }
    public void addEgg(Block mobBlock, int id)
    {
        /*Registering shapeless spawn egg crafting recipes in GameRegistry*/
        GameRegistry.addShapelessRecipe(new ItemStack(Items.spawn_egg, 4, id), new Object[]{mobBlock, EndPlus.items.umbriteCrystal});
    }
    public void setupEggs()
    {
        /*Registering shapeless crafting recipes for spawn eggs in GameRegistry by calling addEgg*/
        addEgg(Items.blaze_rod, 61);
        addEgg(Items.spider_eye, 59);
        addEgg(Items.gunpowder, 50);
        addEgg(Items.ender_pearl, 58);
        addEgg(Items.ghast_tear, 56); 
        addEgg(Items.magma_cream, 62);
        addEgg(Blocks.stone, 60);
        addEgg(Items.arrow, 51); //Work In Progress (skeleton/wither skeleton egg)
        addEgg(Items.slime_ball, 55);
        addEgg(Items.string, 52);
        addEgg(Items.glowstone_dust, 66);
        addEgg(Items.rotten_flesh, 54);
        addEgg(Items.gold_nugget, 57);
        addEgg(Blocks.cobblestone, 65);
        addEgg(Items.chicken, 93);
        addEgg(Items.beef, 92);
        addEgg(Items.leather, 100);
        addEgg(Blocks.red_mushroom, 96);
        addEgg(Items.fish, 98);
        addEgg(Items.porkchop, 90);
        addEgg(Blocks.wool, 91);
        addEgg(Items.dye, 94);
        addEgg(Items.bone, 95);
        addEgg(Items.emerald, 120);
        addEgg(EndPlus.items.enderiteGem, 80);
    }
    public void setupSmelting()
    {
        /*Registering smelting recipes in GameRegistry*/
        GameRegistry.addSmelting(EndPlus.blocks.flameriteOre, new ItemStack(EndPlus.items.flameriteIngot, 1) , 0.6F);
        GameRegistry.addSmelting(EndPlus.blocks.enderiteOre, new ItemStack(EndPlus.items.enderiteGem, 1) , 0.6F);
        GameRegistry.addSmelting(EndPlus.blocks.umbriteOre, new ItemStack(EndPlus.items.umbriteCrystal, 1) , 0.6F);
        GameRegistry.addSmelting(EndPlus.blocks.luciteOre, new ItemStack(EndPlus.items.luciteCrystal, 1) , 0.6F);
        GameRegistry.addSmelting(EndPlus.blocks.golderaldOre, new ItemStack(EndPlus.items.golderaldGem, 1) , 0.6F);
        GameRegistry.addSmelting(EndPlus.items.enderWart, new ItemStack(EndPlus.items.enderWartCooked, 1) , 0.2F);
        GameRegistry.addSmelting(EndPlus.blocks.endLog, new ItemStack(Items.coal, 1, 1) , 0.15F);
        
        
    }
}
