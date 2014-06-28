package com.kpabr.EndPlus;

import java.util.ArrayList;
import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
/*
 * Created by Valiec2019
 * on February 18, 2014
 * using Minecraft Forge 10.12.0.1022
 */
public class BlockCavernStone extends Block {

    public boolean spawnSpider;
    
	public BlockCavernStone(Material par2Material) {
		super(par2Material);
		// TODO Auto-generated constructor stub
	}
	//@Override
	
	@Override
    public int quantityDropped(Random par1Random)
    {
        return 1 + par1Random.nextInt(1);
    }
    
	public void onBlockDestroyedByPlayer(World p_149664_1_, int p_149664_2_, int p_149664_3_, int p_149664_4_, int p_149664_5_)
    {
        if (!p_149664_1_.isRemote && this.spawnSpider)
        {
            EntityCaveSpider entitysilverfish = new EntityCaveSpider(p_149664_1_);
            entitysilverfish.setLocationAndAngles((double)p_149664_2_ + 0.5D, (double)p_149664_3_, (double)p_149664_4_ + 0.5D, 0.0F, 0.0F);
            p_149664_1_.spawnEntityInWorld(entitysilverfish);
            entitysilverfish.spawnExplosionParticle();
        }

        super.onBlockDestroyedByPlayer(p_149664_1_, p_149664_2_, p_149664_3_, p_149664_4_, p_149664_5_);
    }
	
    @Override
    public ArrayList getDrops(World world, int x, int y, int z, int metadata, int fortune)
    {
        ArrayList<ItemStack> drops = new ArrayList<ItemStack>();

        int num = 300;
        if(fortune == 1)
        {
            num = 150;
        }
        else if(fortune == 2)
        {
            num = 132;
        }
        else if(fortune == 3)
        {
            num = 66;
        }
        Random randominst = new Random();
        int count = randominst.nextInt(fortune+3);
        int random = randominst.nextInt(num);
        if(random>0 && random<4)
        {
            drops.add(new ItemStack(Items.coal,count));
        }
        
        else if(random>4 && random<8)
        {
            drops.add(new ItemStack(Items.iron_ingot,count));
        }
        
        else if(random>8 && random<12)
        {
            drops.add(new ItemStack(Items.gold_ingot,count));
        }
        
        else if(random>12 && random<16)
        {
            drops.add(new ItemStack(Items.dye,count, 4));
        }
        
        else if(random>16 && random<20)
        {
            drops.add(new ItemStack(Items.redstone,count));
        }
        
        else if(random>20 && random<24)
        {
            drops.add(new ItemStack(Items.diamond,count));
        }
        
        else if(random>24 && random<28)
        {
            drops.add(new ItemStack(Items.emerald,count));
        }
        
        else if(random>28 && random<32)
        {
            drops.add(new ItemStack(EndPlus.items.enderiteGem,count));
        }
        
        else if(random>32 && random<36)
        {
            drops.add(new ItemStack(EndPlus.items.flameriteIngot,count));
        }
        
        else if(random>36 && random<40)
        {
            drops.add(new ItemStack(EndPlus.items.umbriteCrystal,count));
        }
        
        else if(random>40 && random<44)
        {
            drops.add(new ItemStack(EndPlus.items.luciteCrystal,count));
        }
        else
        {
            num = 15;
            if(fortune == 1)
            {
                num = 30;
            }
            else if(fortune == 2)
            {
                num = 60;
            }
            else if(fortune == 3)
            {
                num = 90;
            }
            random = randominst.nextInt(num);
            if(random ==  0)
            {
                this.spawnSpider = true;
            }
            else
            {
                this.spawnSpider = false;
                drops.add(new ItemStack(EndPlus.blocks.cavernStone,1));
                
            }
        }
        //add special rare drop
        return drops;
    }
    public boolean canSilkHarvest(World world, EntityPlayer player, int x, int y, int z, int metadata)
    {
        return true;
    }
	/*@Override
    @SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister) {
        this. = iconRegister.registerIcon("EndPlus:enderiteOre");
    }*/

}
