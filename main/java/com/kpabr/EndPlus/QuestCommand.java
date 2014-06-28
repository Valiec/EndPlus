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

public class QuestCommand extends CommandBase
{

    public String getCommandName()
    {
        return "quest";
    }

    public String getCommandUsage(ICommandSender par1ICommandSender)
    {
        return "/quest";
    }

    // JAVADOC METHOD $$ func_82362_a
    public int getRequiredPermissionLevel()
    {
        return 0;
    }
    public void processCommand(ICommandSender par1ICommandSender, String[] par2ArrayOfStr)
    {   
        Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("x: "+EndPlus.mobs.qdh.questX+", y: "+EndPlus.mobs.qdh.questY+", z: "+EndPlus.mobs.qdh.questZ));      
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