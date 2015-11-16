package com.kpabr.EndPlus;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class EndRendering {
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
