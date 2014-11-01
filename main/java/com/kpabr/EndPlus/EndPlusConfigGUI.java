package com.kpabr.EndPlus;
 
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
 
public class EndPlusConfigGUI extends GuiConfig {
    public EndPlusConfigGUI(GuiScreen parent) {
        super(parent,
                new ConfigElement(EndPlus.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(), "EndPlus", false, false, GuiConfig.getAbridgedConfigPath(EndPlus.config.toString()));
    }
}