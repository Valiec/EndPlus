package com.kpabr.EndPlus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

import net.minecraft.client.Minecraft;
import net.minecraft.crash.CrashReport;
import net.minecraft.util.ChatComponentText;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class EndVersionChecker {
    public int getNewestVersionID(boolean debug) throws UnknownHostException, IOException
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
    public String getNewestVersionNumber() throws UnknownHostException, IOException
    {
        return toVersionNumber(getNewestVersionID(true));
    }
    public String toVersionNumber(int id)
    {
        Object[][] versions = {{1, "1.0.0"}, {2,"1.1.0"}, {3,"1.2.0"}, {4, "1.2.1"}, {5, "1.3.0"}, {6, "1.3.1"}, {7, "1.4.0"}, {8, "1.4.1"}, {9, "1.4.2"}, {10, "1.4.3"}, {11, "1.4.4"}, {12, "1.5.0"}};
        for (int i = 0; i<versions.length; i++)
        {
            if((Integer)(versions[i][0]) == id)
            {
                return (String)(versions[i][1]);
            }
        }
        return "0.0.0";
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
