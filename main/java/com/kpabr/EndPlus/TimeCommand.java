package com.kpabr.EndPlus;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.crash.CrashReport;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;

public class TimeCommand extends CommandBase
{

    public String getCommandName()
    {
        return "eptime";
    }

    public String getCommandUsage(ICommandSender par1ICommandSender)
    {
        return "/eptime";
    }

    // JAVADOC METHOD $$ func_82362_a
    public int getRequiredPermissionLevel()
    {
        return 0;
    }
    public void processCommand(ICommandSender par1ICommandSender, String[] par2ArrayOfStr)
    {
    	String playerWorld = Minecraft.getMinecraft().thePlayer.worldObj.provider.getDimensionName();
    	int dimID = Minecraft.getMinecraft().thePlayer.worldObj.provider.dimensionId;
    	float worldTime = Minecraft.getMinecraft().thePlayer.worldObj.getWorldTime();
    	double sunLight = Minecraft.getMinecraft().thePlayer.worldObj.calculateSkylightSubtracted(worldTime);
    	float sunBright = Minecraft.getMinecraft().thePlayer.worldObj.getSunBrightness(worldTime);
    	float sunBrightFactor = Minecraft.getMinecraft().thePlayer.worldObj.getSunBrightnessFactor(worldTime);
    	float celestialAngle = Minecraft.getMinecraft().thePlayer.worldObj.getCelestialAngle(worldTime);
    	Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("World Name: "+playerWorld));
    	Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Dimension ID: "+dimID));
    	Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("World Time:"+worldTime));
    	Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Skylight Subtracted: "+sunLight));
    	Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Sun Brightness: "+sunBright));
    	Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Sun Brightness Factor: "+sunBrightFactor));
    	Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("Celestial Angle: "+celestialAngle));
    }
        
      
    @Override
    public int compareTo(Object o)
    {
        return 0;
    }
    
    // JAVADOC METHOD $$ func_71516_a
    protected String[] func_147209_d()
    {
        return MinecraftServer.getServer().getAllUsernames();
    }

    // JAVADOC METHOD $$ func_82358_a
    public boolean isUsernameIndex(String[] par1ArrayOfStr, int par2)
    {
        return par2 == 0;
    }
}