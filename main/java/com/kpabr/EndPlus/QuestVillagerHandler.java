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
        
        int randint = random.nextInt(14);
        int randint2 = random.nextInt(500);
        if(randint2 == 0)
        {
            randint = 15;
        }
        switch(randint)
        {
        case 0:
            recipeList.add(new MerchantRecipe(new ItemStack(EndPlus.blocks.questBlocks[0], 1),new ItemStack(EndPlus.items.swordGFlamerite, 1)));
            break;
        case 1:
            recipeList.add(new MerchantRecipe(new ItemStack(EndPlus.blocks.questBlocks[1], 1),new ItemStack(EndPlus.items.pickaxeGFlamerite, 1)));
            break;
        case 2:
            recipeList.add(new MerchantRecipe(new ItemStack(EndPlus.blocks.questBlocks[2], 1),new ItemStack(EndPlus.items.swordGFlamerite, 1)));
            break;
        case 3:
            recipeList.add(new MerchantRecipe(new ItemStack(EndPlus.blocks.questBlocks[3], 1),new ItemStack(EndPlus.items.helmetGFlamerite, 1)));
            break;
        case 4:
            recipeList.add(new MerchantRecipe(new ItemStack(EndPlus.blocks.questBlocks[4], 1),new ItemStack(EndPlus.blocks.bBreaker, 1)));
            break;
        case 5:
            recipeList.add(new MerchantRecipe(new ItemStack(EndPlus.blocks.questBlocks[5], 1),new ItemStack(EndPlus.blocks.bPlacer, 1)));
            break;
        case 6:
            recipeList.add(new MerchantRecipe(new ItemStack(EndPlus.blocks.questBlocks[6], 1),new ItemStack(EndPlus.blocks.umbriteBlock, 1)));
            break;
        case 7:
            recipeList.add(new MerchantRecipe(new ItemStack(EndPlus.blocks.questBlocks[7], 1),new ItemStack(EndPlus.blocks.luciteBlock, 1)));
            break;
        case 8:
            recipeList.add(new MerchantRecipe(new ItemStack(EndPlus.blocks.questBlocks[8], 1),new ItemStack(EndPlus.items.pickaxeNetherstone, 1)));
            break;
        case 9:
            recipeList.add(new MerchantRecipe(new ItemStack(EndPlus.blocks.questBlocks[9], 1),new ItemStack(EndPlus.items.enderWart, 8)));
            break;
        case 10:
            recipeList.add(new MerchantRecipe(new ItemStack(EndPlus.blocks.questBlocks[10], 1),new ItemStack(EndPlus.blocks.cavernStone, 8)));
            break;
        case 11:
            recipeList.add(new MerchantRecipe(new ItemStack(EndPlus.blocks.questBlocks[11], 1),new ItemStack(EndPlus.blocks.overworldEssence, 6)));
            break;
        case 12:
            recipeList.add(new MerchantRecipe(new ItemStack(EndPlus.blocks.questBlocks[12], 1),new ItemStack(EndPlus.blocks.EnchEnderblock, 16)));
            break;
        case 13:
            recipeList.add(new MerchantRecipe(new ItemStack(EndPlus.blocks.questBlocks[13], 1),new ItemStack(EndPlus.blocks.enderTorch, 16)));
            break;
        case 14:
            recipeList.add(new MerchantRecipe(new ItemStack(EndPlus.blocks.questBlocks[14], 1),new ItemStack(EndPlus.blocks.endSapling, 1)));
            break;
        case 15:
            recipeList.add(new MerchantRecipe(new ItemStack(EndPlus.blocks.questBlocks[15], 1),new ItemStack(Items.nether_star, 1)));
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
        villager.worldObj.setBlock(EndPlus.mobs.qdh.questX, EndPlus.mobs.qdh.questY+1, EndPlus.mobs.qdh.questZ, EndPlus.blocks.questBlocks[meta]);
        
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
            j++;
        }
        
    }
    

}



