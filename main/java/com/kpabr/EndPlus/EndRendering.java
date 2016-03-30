package com.kpabr.EndPlus;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EndRendering {
	@SideOnly(Side.CLIENT)
    public void setupArmorRenderers()
    {
        /*Setting up armor renderers*/
        RenderingRegistry.addNewArmourRendererPrefix("enderite");
        RenderingRegistry.addNewArmourRendererPrefix("flamerite");
        RenderingRegistry.addNewArmourRendererPrefix("gflamerite");
        RenderingRegistry.addNewArmourRendererPrefix("infusedquartz");
        RenderingRegistry.addNewArmourRendererPrefix("shadow");
    }
    
}
