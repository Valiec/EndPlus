package com.kpabr.EndPlus;

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

public class TestCommand extends CommandBase
{

    public String getCommandName()
    {
        return "witty";
    }

    public String getCommandUsage(ICommandSender par1ICommandSender)
    {
        return "/witty";
    }

    // JAVADOC METHOD $$ func_82362_a
    public int getRequiredPermissionLevel()
    {
        return 0;
    }
    private static String func_147203_d()
    {
        String[] astring = new String[] {"Shiny numbers!", "Am I not running fast enough? :(", "I\'m working as hard as I can!", "Will I ever be good enough for you? :(", "Speedy. Zoooooom!", "Hello world", "40% better than a crash report.", "Now with extra numbers", "Now with less numbers", "Now with the same numbers", "You should add flames to things, it makes them go faster!", "Do you feel the need for... optimization?", "*cracks redstone whip*", "Maybe if you treated it better then it\'ll have more motivation to work faster! Poor server.", "Who set us up the TNT?", "Everything\'s going to plan. No, really, that was supposed to happen.", "Uh... Did I do that?", "Oops.", "Why did you do that?", "I feel sad now :(", "My bad.", "I\'m sorry, Dave.", "I let you down. Sorry :(", "On the bright side, I bought you a teddy bear!", "Daisy, daisy...", "Oh - I know what I did wrong!", "Hey, that tickles! Hehehe!", "I blame Dinnerbone.", "You should try our sister game, Minceraft!", "Don\'t be sad. I\'ll do better next time, I promise!", "Don\'t be sad, have a hug! <3", "I just don\'t know what went wrong :(", "Shall we play a game?", "Quite honestly, I wouldn\'t worry myself about that.", "I bet Cylons wouldn\'t have this problem.", "Sorry :(", "Surprise! Haha. Well, this is awkward.", "Would you like a cupcake?", "Hi. I\'m Minecraft, and I\'m a crashaholic.", "Ooh. Shiny.", "This doesn\'t make any sense!", "Why is it breaking :(", "Don\'t do that.", "Ouch. That hurt :(", "You\'re mean.", "This is a token for 1 free hug. Redeem at your nearest Mojangsta: [~~HUG~~]", "There are four lights!"};

        try
        {
            return astring[(int)(System.nanoTime() % (long)astring.length)];
        }
        catch (Throwable throwable)
        {
            return "Witty comment unavailable :(";
        }
    }
    public void processCommand(ICommandSender par1ICommandSender, String[] par2ArrayOfStr)
    {
      
      Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText(this.func_147203_d()));  
        
      
        
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