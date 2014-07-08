package com.kpabr.EndPlus;

import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;

public class QuestVillagerHandler implements IVillageTradeHandler{
    
    @Override
    public void manipulateTradesForVillager(EntityVillager villager, MerchantRecipeList recipeList, Random random)
    {
        
        int randint = random.nextInt(13);
        int randint2 = random.nextInt(500);
        if(randint2 == 0)
        {
            randint = 14;
        }
        int randint3 = random.nextInt(159);
        if(randint3 == 0)
        {
            randint = 15;
        }
        switch(randint)
        {
        case 0:
            recipeList.add(new MerchantRecipe(new ItemStack(EndPlus.blocks.questBlock0, 1),new ItemStack(EndPlus.items.swordGFlamerite, 1)));
            break;
        case 1:
            recipeList.add(new MerchantRecipe(new ItemStack(EndPlus.blocks.questBlock1, 1),new ItemStack(EndPlus.items.pickaxeGFlamerite, 1)));
            break;
        case 2:
            recipeList.add(new MerchantRecipe(new ItemStack(EndPlus.blocks.questBlock2, 1),new ItemStack(EndPlus.items.axeGFlamerite, 1)));
            break;
        case 3:
            recipeList.add(new MerchantRecipe(new ItemStack(EndPlus.blocks.questBlock3, 1),new ItemStack(EndPlus.items.helmetGFlamerite, 1)));
            break;
        case 4:
            recipeList.add(new MerchantRecipe(new ItemStack(EndPlus.blocks.questBlock4, 1),new ItemStack(EndPlus.blocks.bBreaker, 1)));
            break;
        case 5:
            recipeList.add(new MerchantRecipe(new ItemStack(EndPlus.blocks.questBlock5, 1),new ItemStack(EndPlus.blocks.bPlacer, 1)));
            break;
        case 6:
            recipeList.add(new MerchantRecipe(new ItemStack(EndPlus.blocks.questBlock6, 1),new ItemStack(EndPlus.blocks.umbriteBlock, 1)));
            break;
        case 7:
            recipeList.add(new MerchantRecipe(new ItemStack(EndPlus.blocks.questBlock7, 1),new ItemStack(EndPlus.blocks.luciteBlock, 1)));
            break;
        case 8:
            recipeList.add(new MerchantRecipe(new ItemStack(EndPlus.blocks.questBlock8, 1),new ItemStack(EndPlus.items.pickaxeNetherstone, 1)));
            break;
        case 9:
            recipeList.add(new MerchantRecipe(new ItemStack(EndPlus.blocks.questBlock9, 1),new ItemStack(EndPlus.items.enderWart, 8)));
            break;
        case 10:
            recipeList.add(new MerchantRecipe(new ItemStack(EndPlus.blocks.questBlock10, 1),new ItemStack(EndPlus.blocks.cavernStone, 8)));
            break;
        case 11:
            recipeList.add(new MerchantRecipe(new ItemStack(EndPlus.blocks.questBlock11, 1),new ItemStack(EndPlus.blocks.overworldEssence, 6)));
            break;
        case 12:
            recipeList.add(new MerchantRecipe(new ItemStack(EndPlus.blocks.questBlock13, 1),new ItemStack(EndPlus.blocks.EnchEnderblock, 16)));
            break;
        case 13:
            recipeList.add(new MerchantRecipe(new ItemStack(EndPlus.blocks.questBlock14, 1),new ItemStack(EndPlus.blocks.endSapling, 1)));
            break;
        case 14:
            recipeList.add(new MerchantRecipe(new ItemStack(EndPlus.blocks.questBlock15, 1),new ItemStack(Items.nether_star, 1)));
            break;
        case 15:
            recipeList.add(new MerchantRecipe(new ItemStack(EndPlus.blocks.questBlock12, 1),new ItemStack(Items.golden_apple, 1, 1)));
            break;
        }
        
        this.genStructure(villager, random, randint);
        //recipeList.add(new MerchantRecipe(new ItemStack(Items.nether_star,1),new ItemStack(Items.emerald, 50)));
        //recipeList.add(new MerchantRecipe(new ItemStack(Items.blaze_rod,1),new ItemStack(Items.emerald, 10)));

    }
    public void genStructure(EntityVillager villager, Random random, int meta)
    {
        EndPlus.mobs.qdh.questX = (int)(Minecraft.getMinecraft().thePlayer.posX)+(random.nextInt(5000)-2500);
        EndPlus.mobs.qdh.questZ = (int)(Minecraft.getMinecraft().thePlayer.posZ)+(random.nextInt(5000)-2500);
        EndPlus.mobs.qdh.questY = villager.worldObj.getTopSolidOrLiquidBlock(EndPlus.mobs.qdh.questX, EndPlus.mobs.qdh.questZ);
        
        if(villager.worldObj.getBlock(EndPlus.mobs.qdh.questX, EndPlus.mobs.qdh.questY, EndPlus.mobs.qdh.questZ) == Blocks.air &&
        villager.worldObj.getBlock(EndPlus.mobs.qdh.questX-1, EndPlus.mobs.qdh.questY, EndPlus.mobs.qdh.questZ) == Blocks.air &&
        villager.worldObj.getBlock(EndPlus.mobs.qdh.questX-1, EndPlus.mobs.qdh.questY, EndPlus.mobs.qdh.questZ+1) == Blocks.air &&
        villager.worldObj.getBlock(EndPlus.mobs.qdh.questX-1, EndPlus.mobs.qdh.questY, EndPlus.mobs.qdh.questZ-1) == Blocks.air &&
        villager.worldObj.getBlock(EndPlus.mobs.qdh.questX, EndPlus.mobs.qdh.questY, EndPlus.mobs.qdh.questZ+1) == Blocks.air &&
        villager.worldObj.getBlock(EndPlus.mobs.qdh.questX, EndPlus.mobs.qdh.questY, EndPlus.mobs.qdh.questZ-1) == Blocks.air &&
        villager.worldObj.getBlock(EndPlus.mobs.qdh.questX+1, EndPlus.mobs.qdh.questY, EndPlus.mobs.qdh.questZ-1) == Blocks.air &&
        villager.worldObj.getBlock(EndPlus.mobs.qdh.questX+1, EndPlus.mobs.qdh.questY, EndPlus.mobs.qdh.questZ) == Blocks.air &&
        villager.worldObj.getBlock(EndPlus.mobs.qdh.questX+1, EndPlus.mobs.qdh.questY, EndPlus.mobs.qdh.questZ+1) == Blocks.air &&
        villager.worldObj.getBlock(EndPlus.mobs.qdh.questX, EndPlus.mobs.qdh.questY+1, EndPlus.mobs.qdh.questZ) == Blocks.air &&
        villager.worldObj.getBlock(EndPlus.mobs.qdh.questX+3, EndPlus.mobs.qdh.questY+0, EndPlus.mobs.qdh.questZ+3) == Blocks.air &&
        villager.worldObj.getBlock(EndPlus.mobs.qdh.questX-3, EndPlus.mobs.qdh.questY+0, EndPlus.mobs.qdh.questZ+3) == Blocks.air &&
        villager.worldObj.getBlock(EndPlus.mobs.qdh.questX-3, EndPlus.mobs.qdh.questY+0, EndPlus.mobs.qdh.questZ-3) == Blocks.air &&
        villager.worldObj.getBlock(EndPlus.mobs.qdh.questX+3, EndPlus.mobs.qdh.questY+0, EndPlus.mobs.qdh.questZ-3) == Blocks.air &&
        villager.worldObj.getBlock(EndPlus.mobs.qdh.questX+3, EndPlus.mobs.qdh.questY+1, EndPlus.mobs.qdh.questZ+3) == Blocks.air &&
        villager.worldObj.getBlock(EndPlus.mobs.qdh.questX-3, EndPlus.mobs.qdh.questY+1, EndPlus.mobs.qdh.questZ+3) == Blocks.air &&
        villager.worldObj.getBlock(EndPlus.mobs.qdh.questX-3, EndPlus.mobs.qdh.questY+1, EndPlus.mobs.qdh.questZ-3) == Blocks.air &&
        villager.worldObj.getBlock(EndPlus.mobs.qdh.questX+3, EndPlus.mobs.qdh.questY+1, EndPlus.mobs.qdh.questZ-3) == Blocks.air &&
        villager.worldObj.getBlock(EndPlus.mobs.qdh.questX+3, EndPlus.mobs.qdh.questY+2, EndPlus.mobs.qdh.questZ+3) == Blocks.air &&
        villager.worldObj.getBlock(EndPlus.mobs.qdh.questX-3, EndPlus.mobs.qdh.questY+2, EndPlus.mobs.qdh.questZ+3) == Blocks.air &&
        villager.worldObj.getBlock(EndPlus.mobs.qdh.questX-3, EndPlus.mobs.qdh.questY+2, EndPlus.mobs.qdh.questZ-3) == Blocks.air &&
        villager.worldObj.getBlock(EndPlus.mobs.qdh.questX+3, EndPlus.mobs.qdh.questY+3, EndPlus.mobs.qdh.questZ-3) == Blocks.air &&
        villager.worldObj.getBlock(EndPlus.mobs.qdh.questX+3, EndPlus.mobs.qdh.questY+3, EndPlus.mobs.qdh.questZ+3) == Blocks.air &&
        villager.worldObj.getBlock(EndPlus.mobs.qdh.questX-3, EndPlus.mobs.qdh.questY+3, EndPlus.mobs.qdh.questZ+3) == Blocks.air &&
        villager.worldObj.getBlock(EndPlus.mobs.qdh.questX-3, EndPlus.mobs.qdh.questY+3, EndPlus.mobs.qdh.questZ-3) == Blocks.air &&
        villager.worldObj.getBlock(EndPlus.mobs.qdh.questX+3, EndPlus.mobs.qdh.questY+3, EndPlus.mobs.qdh.questZ-3) == Blocks.air)
        {
        
        villager.worldObj.setBlock(EndPlus.mobs.qdh.questX, EndPlus.mobs.qdh.questY, EndPlus.mobs.qdh.questZ, Blocks.quartz_block);
        villager.worldObj.setBlock(EndPlus.mobs.qdh.questX-1, EndPlus.mobs.qdh.questY, EndPlus.mobs.qdh.questZ, Blocks.quartz_stairs, 0, 2);
        villager.worldObj.setBlock(EndPlus.mobs.qdh.questX-1, EndPlus.mobs.qdh.questY, EndPlus.mobs.qdh.questZ+1, Blocks.quartz_stairs, 3, 2);
        villager.worldObj.setBlock(EndPlus.mobs.qdh.questX-1, EndPlus.mobs.qdh.questY, EndPlus.mobs.qdh.questZ-1, Blocks.quartz_stairs, 2, 2);
        villager.worldObj.setBlock(EndPlus.mobs.qdh.questX, EndPlus.mobs.qdh.questY, EndPlus.mobs.qdh.questZ+1, Blocks.quartz_stairs, 3, 2);
        villager.worldObj.setBlock(EndPlus.mobs.qdh.questX, EndPlus.mobs.qdh.questY, EndPlus.mobs.qdh.questZ-1, Blocks.quartz_stairs, 2, 2);
        villager.worldObj.setBlock(EndPlus.mobs.qdh.questX+1, EndPlus.mobs.qdh.questY, EndPlus.mobs.qdh.questZ-1, Blocks.quartz_stairs, 1, 2);
        villager.worldObj.setBlock(EndPlus.mobs.qdh.questX+1, EndPlus.mobs.qdh.questY, EndPlus.mobs.qdh.questZ, Blocks.quartz_stairs, 1, 2);
        villager.worldObj.setBlock(EndPlus.mobs.qdh.questX+1, EndPlus.mobs.qdh.questY, EndPlus.mobs.qdh.questZ+1, Blocks.quartz_stairs, 3, 2);
        switch(meta)
        {
        case 0:
            villager.worldObj.setBlock(EndPlus.mobs.qdh.questX, EndPlus.mobs.qdh.questY+1, EndPlus.mobs.qdh.questZ, EndPlus.blocks.questBlock0);
            break;
        case 1:
            villager.worldObj.setBlock(EndPlus.mobs.qdh.questX, EndPlus.mobs.qdh.questY+1, EndPlus.mobs.qdh.questZ, EndPlus.blocks.questBlock1);
            break;
        case 2:
            villager.worldObj.setBlock(EndPlus.mobs.qdh.questX, EndPlus.mobs.qdh.questY+1, EndPlus.mobs.qdh.questZ, EndPlus.blocks.questBlock2);
            break;
        case 3:
            villager.worldObj.setBlock(EndPlus.mobs.qdh.questX, EndPlus.mobs.qdh.questY+1, EndPlus.mobs.qdh.questZ, EndPlus.blocks.questBlock3);
            break;
        case 4:
            villager.worldObj.setBlock(EndPlus.mobs.qdh.questX, EndPlus.mobs.qdh.questY+1, EndPlus.mobs.qdh.questZ, EndPlus.blocks.questBlock4);
            break;
        case 5:
            villager.worldObj.setBlock(EndPlus.mobs.qdh.questX, EndPlus.mobs.qdh.questY+1, EndPlus.mobs.qdh.questZ, EndPlus.blocks.questBlock5);
            break;
        case 6:
            villager.worldObj.setBlock(EndPlus.mobs.qdh.questX, EndPlus.mobs.qdh.questY+1, EndPlus.mobs.qdh.questZ, EndPlus.blocks.questBlock6);
            break;
        case 7:
            villager.worldObj.setBlock(EndPlus.mobs.qdh.questX, EndPlus.mobs.qdh.questY+1, EndPlus.mobs.qdh.questZ, EndPlus.blocks.questBlock7);
            break;
        case 8:
            villager.worldObj.setBlock(EndPlus.mobs.qdh.questX, EndPlus.mobs.qdh.questY+1, EndPlus.mobs.qdh.questZ, EndPlus.blocks.questBlock8);
            break;
        case 9:
            villager.worldObj.setBlock(EndPlus.mobs.qdh.questX, EndPlus.mobs.qdh.questY+1, EndPlus.mobs.qdh.questZ, EndPlus.blocks.questBlock9);
            break;
        case 10:
            villager.worldObj.setBlock(EndPlus.mobs.qdh.questX, EndPlus.mobs.qdh.questY+1, EndPlus.mobs.qdh.questZ, EndPlus.blocks.questBlock10);
            break;
        case 11:
            villager.worldObj.setBlock(EndPlus.mobs.qdh.questX, EndPlus.mobs.qdh.questY+1, EndPlus.mobs.qdh.questZ, EndPlus.blocks.questBlock11);
            break;
        case 12:
            villager.worldObj.setBlock(EndPlus.mobs.qdh.questX, EndPlus.mobs.qdh.questY+1, EndPlus.mobs.qdh.questZ, EndPlus.blocks.questBlock12);
            break;
        case 13:
            villager.worldObj.setBlock(EndPlus.mobs.qdh.questX, EndPlus.mobs.qdh.questY+1, EndPlus.mobs.qdh.questZ, EndPlus.blocks.questBlock13);
            break;
        case 14:
            villager.worldObj.setBlock(EndPlus.mobs.qdh.questX, EndPlus.mobs.qdh.questY+1, EndPlus.mobs.qdh.questZ, EndPlus.blocks.questBlock14);
            break;
        case 15:
            villager.worldObj.setBlock(EndPlus.mobs.qdh.questX, EndPlus.mobs.qdh.questY+1, EndPlus.mobs.qdh.questZ, EndPlus.blocks.questBlock15);
            break;
        }
        
        for(int i = 0; i<3; i++)
        {
        villager.worldObj.setBlock(EndPlus.mobs.qdh.questX+3, EndPlus.mobs.qdh.questY+i, EndPlus.mobs.qdh.questZ+3, Blocks.quartz_block);
        villager.worldObj.setBlock(EndPlus.mobs.qdh.questX-3, EndPlus.mobs.qdh.questY+i, EndPlus.mobs.qdh.questZ+3, Blocks.quartz_block);
        villager.worldObj.setBlock(EndPlus.mobs.qdh.questX-3, EndPlus.mobs.qdh.questY+i, EndPlus.mobs.qdh.questZ-3, Blocks.quartz_block);
        villager.worldObj.setBlock(EndPlus.mobs.qdh.questX+3, EndPlus.mobs.qdh.questY+i, EndPlus.mobs.qdh.questZ-3, Blocks.quartz_block);
        }
        villager.worldObj.setBlock(EndPlus.mobs.qdh.questX+3, EndPlus.mobs.qdh.questY+3, EndPlus.mobs.qdh.questZ+3, Blocks.glowstone);
        villager.worldObj.setBlock(EndPlus.mobs.qdh.questX-3, EndPlus.mobs.qdh.questY+3, EndPlus.mobs.qdh.questZ+3, Blocks.glowstone);
        villager.worldObj.setBlock(EndPlus.mobs.qdh.questX-3, EndPlus.mobs.qdh.questY+3, EndPlus.mobs.qdh.questZ-3, Blocks.glowstone);
        villager.worldObj.setBlock(EndPlus.mobs.qdh.questX+3, EndPlus.mobs.qdh.questY+3, EndPlus.mobs.qdh.questZ-3, Blocks.glowstone);
        //System.out.println(EndPlus.mobs.qdh.questX);
        //System.out.println(EndPlus.mobs.qdh.questY);
        //System.out.println(EndPlus.mobs.qdh.questZ);
        Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("x: "+EndPlus.mobs.qdh.questX+", y: "+EndPlus.mobs.qdh.questY+", z: "+EndPlus.mobs.qdh.questZ));
        this.genStructureSupport(villager, random);
        }
        else
        {
            //Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("x: "+EndPlus.mobs.qdh.questX+", y: "+EndPlus.mobs.qdh.questY+", z: "+EndPlus.mobs.qdh.questZ+" failed"));
            this.genStructure(villager, random, meta);
        }
}
    public void genStructureSupport(EntityVillager villager, Random random)
    {            
        int i = 1;
        while(villager.worldObj.getBlock(EndPlus.mobs.qdh.questX+3, EndPlus.mobs.qdh.questY-i, EndPlus.mobs.qdh.questZ+3) != Blocks.air ||
        villager.worldObj.getBlock(EndPlus.mobs.qdh.questX-3, EndPlus.mobs.qdh.questY-i, EndPlus.mobs.qdh.questZ+3) != Blocks.air ||
        villager.worldObj.getBlock(EndPlus.mobs.qdh.questX-3, EndPlus.mobs.qdh.questY-i, EndPlus.mobs.qdh.questZ-3) != Blocks.air ||
        villager.worldObj.getBlock(EndPlus.mobs.qdh.questX+3, EndPlus.mobs.qdh.questY-i, EndPlus.mobs.qdh.questZ-3) != Blocks.air)
        {
            if(villager.worldObj.getBlock(EndPlus.mobs.qdh.questX+3, EndPlus.mobs.qdh.questY-i, EndPlus.mobs.qdh.questZ+3) == Blocks.air)
            {
                villager.worldObj.setBlock(EndPlus.mobs.qdh.questX+3, EndPlus.mobs.qdh.questY-i, EndPlus.mobs.qdh.questZ+3, Blocks.quartz_block);
            }
            if(villager.worldObj.getBlock(EndPlus.mobs.qdh.questX-3, EndPlus.mobs.qdh.questY-i, EndPlus.mobs.qdh.questZ+3) == Blocks.air)
            {
                villager.worldObj.setBlock(EndPlus.mobs.qdh.questX-3, EndPlus.mobs.qdh.questY-i, EndPlus.mobs.qdh.questZ+3, Blocks.quartz_block);
            }
            if(villager.worldObj.getBlock(EndPlus.mobs.qdh.questX-3, EndPlus.mobs.qdh.questY-i, EndPlus.mobs.qdh.questZ-3) == Blocks.air)
            {
                villager.worldObj.setBlock(EndPlus.mobs.qdh.questX-3, EndPlus.mobs.qdh.questY-i, EndPlus.mobs.qdh.questZ-3, Blocks.quartz_block);
            }
            if(villager.worldObj.getBlock(EndPlus.mobs.qdh.questX+3, EndPlus.mobs.qdh.questY-i, EndPlus.mobs.qdh.questZ-3) == Blocks.air)
            {
                villager.worldObj.setBlock(EndPlus.mobs.qdh.questX+3, EndPlus.mobs.qdh.questY-i, EndPlus.mobs.qdh.questZ-3, Blocks.quartz_block);
            }
            i++;
        }
        
        int j = 1;
        while(villager.worldObj.getBlock(EndPlus.mobs.qdh.questX, EndPlus.mobs.qdh.questY-j, EndPlus.mobs.qdh.questZ) != Blocks.air ||
                villager.worldObj.getBlock(EndPlus.mobs.qdh.questX-1, EndPlus.mobs.qdh.questY-j, EndPlus.mobs.qdh.questZ) != Blocks.air ||
                villager.worldObj.getBlock(EndPlus.mobs.qdh.questX-1, EndPlus.mobs.qdh.questY-j, EndPlus.mobs.qdh.questZ+1) != Blocks.air ||
                villager.worldObj.getBlock(EndPlus.mobs.qdh.questX-1, EndPlus.mobs.qdh.questY-j, EndPlus.mobs.qdh.questZ-1) != Blocks.air ||
                villager.worldObj.getBlock(EndPlus.mobs.qdh.questX, EndPlus.mobs.qdh.questY-j, EndPlus.mobs.qdh.questZ+1) != Blocks.air ||
                villager.worldObj.getBlock(EndPlus.mobs.qdh.questX, EndPlus.mobs.qdh.questY-j, EndPlus.mobs.qdh.questZ-1) != Blocks.air ||
                villager.worldObj.getBlock(EndPlus.mobs.qdh.questX+1, EndPlus.mobs.qdh.questY-j, EndPlus.mobs.qdh.questZ-1) != Blocks.air ||
                villager.worldObj.getBlock(EndPlus.mobs.qdh.questX+1, EndPlus.mobs.qdh.questY-j, EndPlus.mobs.qdh.questZ) != Blocks.air ||
                villager.worldObj.getBlock(EndPlus.mobs.qdh.questX+1, EndPlus.mobs.qdh.questY-j, EndPlus.mobs.qdh.questZ+1) != Blocks.air)
        {
            if(villager.worldObj.getBlock(EndPlus.mobs.qdh.questX, EndPlus.mobs.qdh.questY-j, EndPlus.mobs.qdh.questZ) == Blocks.air)
            {
                villager.worldObj.setBlock(EndPlus.mobs.qdh.questX, EndPlus.mobs.qdh.questY-j, EndPlus.mobs.qdh.questZ, Blocks.quartz_block);
            }
            if(villager.worldObj.getBlock(EndPlus.mobs.qdh.questX-1, EndPlus.mobs.qdh.questY-j, EndPlus.mobs.qdh.questZ) == Blocks.air)
            {
                villager.worldObj.setBlock(EndPlus.mobs.qdh.questX-1, EndPlus.mobs.qdh.questY-j, EndPlus.mobs.qdh.questZ, Blocks.quartz_block);
            }
            if(villager.worldObj.getBlock(EndPlus.mobs.qdh.questX-1, EndPlus.mobs.qdh.questY-j, EndPlus.mobs.qdh.questZ+1) == Blocks.air)
            {
                villager.worldObj.setBlock(EndPlus.mobs.qdh.questX-1, EndPlus.mobs.qdh.questY-j, EndPlus.mobs.qdh.questZ+1, Blocks.quartz_block);
            }    
            if(villager.worldObj.getBlock(EndPlus.mobs.qdh.questX+1, EndPlus.mobs.qdh.questY-j, EndPlus.mobs.qdh.questZ-1) == Blocks.air)
            {
                villager.worldObj.setBlock(EndPlus.mobs.qdh.questX+1, EndPlus.mobs.qdh.questY-j, EndPlus.mobs.qdh.questZ-1, Blocks.quartz_block);
            }
            if(villager.worldObj.getBlock(EndPlus.mobs.qdh.questX, EndPlus.mobs.qdh.questY-j, EndPlus.mobs.qdh.questZ+1) == Blocks.air)
            {
                villager.worldObj.setBlock(EndPlus.mobs.qdh.questX, EndPlus.mobs.qdh.questY-j, EndPlus.mobs.qdh.questZ+1, Blocks.quartz_block);
            }
            if(villager.worldObj.getBlock(EndPlus.mobs.qdh.questX, EndPlus.mobs.qdh.questY-j, EndPlus.mobs.qdh.questZ-1) == Blocks.air)
            {
                villager.worldObj.setBlock(EndPlus.mobs.qdh.questX, EndPlus.mobs.qdh.questY-j, EndPlus.mobs.qdh.questZ-1, Blocks.quartz_block);
            }
            if(villager.worldObj.getBlock(EndPlus.mobs.qdh.questX+1, EndPlus.mobs.qdh.questY-j, EndPlus.mobs.qdh.questZ-1) == Blocks.air)
            {
                villager.worldObj.setBlock(EndPlus.mobs.qdh.questX+1, EndPlus.mobs.qdh.questY-j, EndPlus.mobs.qdh.questZ-1, Blocks.quartz_block);
            }
            if(villager.worldObj.getBlock(EndPlus.mobs.qdh.questX+1, EndPlus.mobs.qdh.questY-j, EndPlus.mobs.qdh.questZ) == Blocks.air)
            {
                villager.worldObj.setBlock(EndPlus.mobs.qdh.questX+1, EndPlus.mobs.qdh.questY-j, EndPlus.mobs.qdh.questZ, Blocks.quartz_block);
            }
            if(villager.worldObj.getBlock(EndPlus.mobs.qdh.questX+1, EndPlus.mobs.qdh.questY-j, EndPlus.mobs.qdh.questZ+1) == Blocks.air)
            {
                villager.worldObj.setBlock(EndPlus.mobs.qdh.questX+1, EndPlus.mobs.qdh.questY-j, EndPlus.mobs.qdh.questZ+1, Blocks.quartz_block);
            }
            if(villager.worldObj.getBlock(EndPlus.mobs.qdh.questX-1, EndPlus.mobs.qdh.questY-j, EndPlus.mobs.qdh.questZ-1) == Blocks.air)
            {
                villager.worldObj.setBlock(EndPlus.mobs.qdh.questX-1, EndPlus.mobs.qdh.questY-j, EndPlus.mobs.qdh.questZ-1, Blocks.quartz_block);
            }
            j++;
        }
        
    }
    

}



