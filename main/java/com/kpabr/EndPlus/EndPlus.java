package com.kpabr.EndPlus;
/*
 * Created by Valiec2019
 * started on July 6, 2013
 * released on November 28, 2013
 * currently using Minecraft Forge 10.12.0.1022
 */

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Arrays;

import com.kpabr.EndPlus.CommonProxy;
import com.kpabr.EndPlus.client.GuiHandler;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;
import cpw.mods.fml.relauncher.Side;
@Mod(modid = EndPlus.MODID, version = EndPlus.VERSION, name = EndPlus.NAME, guiFactory = "com.kpabr.EndPlus.EndPlusConfigGUIFactory")
public class EndPlus
{
    @SidedProxy(clientSide="com.kpabr.EndPlus.client.ClientProxy", serverSide="com.kpabr.EndPlus.CommonProxy")
    public static CommonProxy proxy;
 
    /*Mod ID and Version declarations*/
    public static final String MODID = "endplus";
    public static final String VERSION = "1.7.0";
    public static final String NAME = "endplus";
    static int versionID = 18; //Used by version checker!
    
    static EndBlocks blocks = new EndBlocks();
    static EndItems items = new EndItems();
    static EndRecipes recipes = new EndRecipes();
    static EndWorldgen worldgen = new EndWorldgen();
    static EndSpawners spawners = new EndSpawners();
    public static EndRendering rendering = new EndRendering();
    static EndMobs mobs = new EndMobs();
    static EndVersionChecker versionChecker = new EndVersionChecker();
    public static EndPlus instance;
    public static Configuration config;
    
    
    static CreativeTabs tabEndplus = new TabEndplusBlocks(CreativeTabs.getNextID(), "EndPlus Blocks", EndPlus.blocks.endGrass);
    static CreativeTabs tabEndplusSpawners = new TabEndplusSpawners(CreativeTabs.getNextID());
    static CreativeTabs tabEndplusItems = new TabEndplus(CreativeTabs.getNextID(), "EndPlus Items", 0);
    static CreativeTabs tabEndplusRedstone = new TabEndplus(CreativeTabs.getNextID(), "EndPlus Ender Redstone", 3);
    static CreativeTabs tabEndplusTools = new TabEndplus(CreativeTabs.getNextID(), "EndPlus Tools", 1);
    static CreativeTabs tabEndplusCombat = new TabEndplus(CreativeTabs.getNextID(), "EndPlus Combat", 2);
    static CreativeTabs tabEndplusMagic = new TabEndplus(CreativeTabs.getNextID(), "EndPlus Magic", 4);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        config = new Configuration(event.getSuggestedConfigurationFile()); //gets default config file
        
        this.instance = this;
        
        
        FMLCommonHandler.instance().bus().register(worldgen);
        MinecraftForge.EVENT_BUS.register(worldgen);
        
        FMLCommonHandler.instance().bus().register(versionChecker);
        MinecraftForge.EVENT_BUS.register(versionChecker);
        
        FMLCommonHandler.instance().bus().register(this);
        MinecraftForge.EVENT_BUS.register(this);
        
        
        
        ClientCommandHandler.instance.registerCommand(new TestCommand());
        ClientCommandHandler.instance.registerCommand(new EndPlusCommand());
        ClientCommandHandler.instance.registerCommand(new TimeCommand());
   	    EndPlus.config.load();
        if(!config.hasKey(Configuration.CATEGORY_GENERAL, "OverrideDimensionID"))
        {
        worldgen.dimID = EndPlus.config.getInt("OverrideDimensionID", Configuration.CATEGORY_GENERAL, EndPlus.config.get(Configuration.CATEGORY_GENERAL, "OverrideDimensionID", 6).getInt(), 2, 255, "Used to help generate the End");
        }
        if(!config.hasKey(Configuration.CATEGORY_GENERAL, "UseBlockBreaker"))
        {
        EndPlus.config.getBoolean("UseBlockBreaker", Configuration.CATEGORY_GENERAL, true, "Sets whether the block breaker is present (it does not work in multiplayer)");
        }
        EndPlus.config.save();
        
        //Block.blockRegistry.addObject(119, "minecraft:end_portal", (new BlockBuoy(Material.rock)).setBlockName("buoy").setCreativeTab(EndPlus.tabEndplus).setLightLevel(0.9F));

        
        
     	blocks.setupBlocks();
     	items.setupItems();
     	blocks.registerBlocks();
     	items.registerItems();
        blocks.setupHarvestLevels();
        blocks.registerBlocksOreDict();
     	recipes.setupShapelessCrafting();
     	recipes.setupShapedCrafting();
     	recipes.setupSmelting();
     	recipes.setupEggs();
     	worldgen.setupWorldgen();
     	spawners.setupSpawners();
     	mobs.setupMobs();
     	proxy.registerRenderers();
     	VillagerRegistry.instance().getRegisteredVillagers();
     	new GuiHandler();
     	GameRegistry.registerTileEntity(TileEntityReaction.class, "Reaction");
    }
    
    @EventHandler
    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(true)//event.modID.equals("endplus"))
        {
            updateConfig();
        }
    }
    public static void updateConfig()
    {
         worldgen.dimID = EndPlus.config.get(Configuration.CATEGORY_GENERAL, "OverrideDimensionID", 6).getInt();
         //versionChecker.doUpdate = 
         
         if(true)
         {
             config.save();
         }
    }
}

