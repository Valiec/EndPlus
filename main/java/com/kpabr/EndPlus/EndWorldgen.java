package com.kpabr.EndPlus;

import net.minecraft.world.WorldServer;
import net.minecraft.world.gen.ChunkProviderEnd;
import net.minecraft.world.gen.ChunkProviderHell;
import net.minecraft.world.gen.ChunkProviderServer;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.terraingen.ChunkProviderEvent;
import net.minecraftforge.event.terraingen.PopulateChunkEvent;
import net.minecraftforge.event.terraingen.ChunkProviderEvent.ReplaceBiomeBlocks;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.eventhandler.Event.Result;
import cpw.mods.fml.common.registry.GameRegistry;

public class EndWorldgen {
    /*World Generator Declaration*/
    EndOregen enderblock = new EndOregen();
    public void setupWorldgen()
    {
        
        EndPlus.config.load();
        int dimID = 6;
        dimID = EndPlus.config.get(Configuration.CATEGORY_GENERAL, "OverrideDimensionID", 6).getInt();
        /*Setting up worldgen*/
        WorldServer world = DimensionManager.getWorld(1);
        //DimensionManager.unregisterProviderType(1);
        DimensionManager.registerProviderType(dimID, WorldProviderEnder.class, true);
        //DimensionManager.registerProviderType(dimID, WorldProviderEnder.class, true);
        DimensionManager.registerDimension(dimID, dimID);
        GameRegistry.registerWorldGenerator(enderblock, 1);
    }
    
    @SubscribeEvent
    public void onEndGen(ChunkProviderEvent.InitNoiseField event)
    {
        
        if (event.chunkProvider.getClass() == ChunkProviderEnd.class)
        {

            ChunkProviderEnder end = (ChunkProviderEnder)(new ChunkProviderEnder(DimensionManager.getWorld(1), DimensionManager.getWorld(1).getSeed()));
            event.setResult(Result.DENY);

            event.noisefield = end.initializeNoiseField(null, event.posX, event.posY, event.posZ, event.sizeX, event.sizeY, event.sizeZ);
    
        }  
    }
    @SubscribeEvent
    public void onNetherBiomes(ReplaceBiomeBlocks event)
    {
        if (event.chunkProvider.getClass() == ChunkProviderHell.class)
        {
            
        
            ChunkProviderNether end = (ChunkProviderNether)(new ChunkProviderNether(DimensionManager.getWorld(-1), DimensionManager.getWorld(-1).getSeed()));

            event.setResult(Result.DENY);
            end.func_147418_b(event.chunkX, event.chunkZ, event.blockArray);
        }

    }
    @SubscribeEvent
    public void onNetherDecorate(PopulateChunkEvent event)
    {
        if (event.world.provider.dimensionId == -1)
        {
            ChunkProviderNether end = (ChunkProviderNether)(new ChunkProviderNether(DimensionManager.getWorld(-1), DimensionManager.getWorld(-1).getSeed(), event.rand));

            event.setResult(Result.DENY);
            end.populate(event.chunkProvider, event.chunkX, event.chunkZ);
        }
    }
    @SubscribeEvent
    public void onEndBiomes(ReplaceBiomeBlocks event)
    {
        if (event.chunkProvider.getClass() == ChunkProviderEnd.class)
        {
            
        
            ChunkProviderEnder end = (ChunkProviderEnder)(new ChunkProviderEnder(DimensionManager.getWorld(1), DimensionManager.getWorld(1).getSeed()));

            event.setResult(Result.DENY);
            end.func_147421_b(event.chunkX, event.chunkZ, event.blockArray);
        }

    }
    @SubscribeEvent
    public void onEndDecorate(PopulateChunkEvent event)
    {
        if (event.chunkProvider.getClass() != ChunkProviderServer.class && event.world.provider.dimensionId == 1)
        {
            ChunkProviderEnder end = (ChunkProviderEnder)(new ChunkProviderEnder(DimensionManager.getWorld(1), DimensionManager.getWorld(1).getSeed()));

            event.setResult(Result.DENY);
            end.populate(event.chunkProvider, event.chunkX, event.chunkZ);
        }
    }
}