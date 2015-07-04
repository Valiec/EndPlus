package com.kpabr.EndPlus;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

import net.minecraft.client.Minecraft;
import net.minecraft.crash.CrashReport;
import net.minecraft.util.ChatComponentText;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.event.FMLServerStoppingEvent;

public class EndVersionChecker {
	public boolean doUpdate;
    public int getNewestVersionID(boolean debug) throws IOException
    {
        int newestVersion = -1;
        URL check;
        if(!debug)
        {
            check = new URL("http://www.kpabr.com/mcmods/endplus/versioncheck");
        }
        else
        {
            check = new URL("http://www.kpabr.com/debug/mcmods/endplus/versioncheck");
        }
        URLConnection read = check.openConnection();
        BufferedReader reader = new BufferedReader(new InputStreamReader(read.getInputStream()));
        String newestVersionStr = reader.readLine();
        newestVersion = Integer.parseInt(newestVersionStr);
        
        if (newestVersion < 0)
        {
            throw new IOException();
        }
        else
        {
            return newestVersion; 
        }
    }
    @SubscribeEvent
    public void downloadNewestVersion(PlayerEvent.PlayerLoggedOutEvent event) throws UnknownHostException, IOException
    {
    	if(true)
    	{
	        File oldf = new File("newest.jar");
	        oldf.renameTo(new File("newest.jar.backup"));
	        URL dl;
	        dl = new URL("http://www.kpabr.com/mcmods/endplus/latest2");
	        ReadableByteChannel channel = Channels.newChannel(dl.openStream());
	        FileOutputStream output = new FileOutputStream("newest.jar");
	        String cwd = new java.io.File( "." ).getCanonicalPath(); //debug
	        System.out.println(cwd); //debug
	        output.getChannel().transferFrom(channel, 0, Long.MAX_VALUE);
	        output.close();
    	}
        
        
    }
    public String getNewestVersionNumber() throws UnknownHostException, IOException
    {
        return toVersionNumber(getNewestVersionID(true));
    }
    public String toVersionNumber(int id)
    {
        Object[][] versions = {{1, "1.0.0"}, {2,"1.1.0"}, {3,"1.2.0"}, {4, "1.2.1"}, {5, "1.3.0"}, {6, "1.3.1"}, {7, "1.4.0"}, {8, "1.4.1"}, {9, "1.4.2"}, {10, "1.4.3"}, {11, "1.4.4"}, {12, "1.5.0"}, {13, "1.5.1"}, {14, "1.5.2"}, {15, "1.6.0"}, {16, "1.6.1"}, {17, "1.6.2"}, {18, "1.6.3"}, {19, "1.6.4"}, {20, "1.7.0"}, {21, "1.7.1"}, {22, "1.7.2"}, {23, "1.7.3"}, {24, "1.7.4"}, {25, "1.8.0"}};
        for (int i = 0; i<versions.length; i++)
        {
            if((Integer)(versions[i][0]) == id)
            {
                return (String)(versions[i][1]);
            }
        }
        return "newer than 1.8.0 or unrecognized version ID";
    }
    @SubscribeEvent
    public void onUpdateMessage(PlayerEvent.PlayerLoggedInEvent event) throws UnknownHostException, IOException
    {
        try
        {
            int version = getNewestVersionID(false);
            
            if(version>EndPlus.versionID)
            {
                event.player.addChatMessage(new ChatComponentText("EndPlus is out of date. Go to http://tinyurl.com/EndPlus for updates."));
            }
                else if(version<EndPlus.versionID)
            {
                event.player.addChatMessage(new ChatComponentText("You are running a development version of EndPlus. Bugs may be present."));
            }
        
        }
        catch (IOException e)
        {
            event.player.addChatMessage(new ChatComponentText("Failed to get latest version number from server. Check your Internet connection."));
        }
            
    }
}
