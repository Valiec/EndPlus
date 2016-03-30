package com.kpabr.EndPlus.client;
/*
 * Created by Valiec2019
 * on February 18, 2014
 * using Minecraft Forge 10.12.0.1022
 */
import com.kpabr.EndPlus.CommonProxy;
import com.kpabr.EndPlus.EndPlus;
import com.kpabr.EndPlus.EndRenderHandler;
import com.kpabr.EndPlus.EntityDragonfire;
import com.kpabr.EndPlus.RenderDragonfire;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy {
        EndRenderHandler erh = new EndRenderHandler();
        @Override
        public void registerRenderers() 
        {
            
                RenderingRegistry.registerEntityRenderingHandler(EntityDragonfire.class, new RenderDragonfire(new ModelBiped(), 0.5F));
//the 0.5F is the shadowsize
                RenderingRegistry.registerBlockHandler(500, erh);
             	EndPlus.rendering.setupArmorRenderers();
             	VillagerRegistry.instance().registerVillagerSkin(8, new ResourceLocation("minecraft:textures/entity/villager/villager.png"));
        }
        
}