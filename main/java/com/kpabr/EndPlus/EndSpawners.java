package com.kpabr.EndPlus;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class EndSpawners {
    /*Mob Spawners*/
    /*{Mob Name, Mob-Specific Item or Block, In-Game Name, Unlocalized Name, BlockCustomSpawner object (defined later), Is Mob-Specific Item or Block a Block}*/
    public static Object[][] spawnerData = {
        {"Zombie", Items.rotten_flesh, "Zombie Spawner", "zombieSpawner", null, false},
        {"Skeleton", Items.arrow, "Skeleton Spawner", "skeletonSpawner", null, false},
        {"Spider", Items.string, "Spider Spawner", "spiderSpawner", null, false},
        {"Blaze", Items.blaze_rod, "Blaze Spawner", "blazeSpawner", null, false},
        {"Enderman", Items.ender_pearl, "Enderman Spawner", "endermanSpawner", null, false},
        {"Creeper", Items.gunpowder, "Creeper Spawner", "creeperSpawner", null, false},
        {"CaveSpider", Items.spider_eye, "Cave Spider Spawner", "caveSpiderSpawner", null, false},
        {"Ghast", Items.ghast_tear, "Ghast Spawner", "ghastSpawner", null, false},
        {"PigZombie", Items.gold_nugget, "Zombie Pigman Spawner", "zombiePigmanSpawner", null, false},
        {"Silverfish", Blocks.stone, "Silverfish Spawner", "silverfishSpawner", null, true},
        {"Witch", Items.glowstone_dust, "Witch Spawner", "witchSpawner", null, false},
        {"Chicken", Items.chicken, "Chicken Spawner", "chickenSpawner", null, false},
        {"Cow", Items.beef, "Cow Spawner", "cowSpawner", null, false},
        {"EntityHorse", Items.leather, "Horse Spawner", "horseSpawner", null, false},
        {"MushroomCow", Blocks.red_mushroom, "Mooshroom Spawner", "mooshroomSpawner", null, true},
        {"Ozelot", Items.fish, "Ocelot Spawner", "ocelotSpawner", null, false},
        {"Pig", Items.porkchop, "Pig Spawner", "pigSpawner", null, false},
        {"Sheep", Blocks.wool, "Sheep Spawner", "sheepSpawner", null, true},
        {"Squid", Items.dye, "Squid Spawner", "squidSpawner", null, false},
        {"Wolf", Items.bone, "Wolf Spawner", "wolfSpawner", null, false},
        {"Villager", Items.emerald, "Villager Spawner", "villagerSpawner", null, false},
        {"Slime", Items.slime_ball, "Slime Spawner", "slimeSpawner", null, false},
        {"LavaSlime", Items.magma_cream, "Magma Cube Spawner", "magmaCubeSpawner", null, false},
        {"Dragonfire", EndPlus.items.enderiteGem, "Dragonfire Spawner", "dragonfireSpawner", null, false},
        {"Bat", Blocks.cobblestone, "Bat Spawner", "batSpawner", null, true}};
    

    
    public void setupSpawnerBlocks()
    {
        /*Initializing mob spawner blocks*/
        for (Object[] spawner : spawnerData)
        {
            spawner[4] = new BlockCustomSpawner((String)spawner[0]).setBlockName((String)spawner[3]).setCreativeTab(EndPlus.tabEndplusSpawners).setBlockTextureName("endplus:zombieSpawner");
        }
        
    }
    public void registerSpawnerBlocks()
    {
        /*Registering mob spawner blocks*/
        for (Object[] spawner : spawnerData)
        {
            GameRegistry.registerBlock((BlockCustomSpawner)spawner[4], (String)spawner[3]);
        }
        
    }
    public void setupSpawnerRecipes()
    {
        /*Registering crafting recipes for mob spawners*/
        for (Object[] spawner : spawnerData)
        {
            if ((Boolean)spawner[5])
            {
                GameRegistry.addRecipe(new ItemStack((BlockCustomSpawner)spawner[4], 1), new Object[]{"XXX", "XYX", "XZX", 'X', Blocks.iron_bars, 'Y', (Block)spawner[1], 'Z', EndPlus.items.umbriteCrystal});
            }
            else
            {
                GameRegistry.addRecipe(new ItemStack((BlockCustomSpawner)spawner[4], 1), new Object[]{"XXX", "XYX", "XZX", 'X', Blocks.iron_bars, 'Y', (Item)spawner[1], 'Z',EndPlus.items.umbriteCrystal});
            }
        }
    }
    public void setupSpawners()
    {
        setupSpawnerBlocks();
        registerSpawnerBlocks();
        setupSpawnerRecipes();
    }
}
