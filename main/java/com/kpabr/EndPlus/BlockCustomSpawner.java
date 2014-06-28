package com.kpabr.EndPlus;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.BlockMobSpawner;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraft.world.World;
/*
 * Created by Valiec2019
 * on February 18, 2014
 * using Minecraft Forge 10.12.0.1022
 */
class BlockCustomSpawner extends BlockMobSpawner {

	private String mob;
	protected BlockCustomSpawner(String mob) {
		super();
		this.mob = mob;
	
	}
	/**
     * Returns a new instance of a block's tile entity class. Called on placing the block.
     */
    public TileEntity createTileEntity(World par1World, int par2Int)
    {
        
    	TileEntityMobSpawner a = new TileEntityMobSpawner();
    	a.func_145881_a().setEntityName(mob);
    	return a;
    }
    private int mobToIndex(String mob)
    {
        for(int i = 0; i<EndPlus.spawners.spawnerData.length; i++)
        {
            if(EndPlus.spawners.spawnerData[i][0] == mob)
            {
                return i;
            }  
        }
        return -1;
    }
    @Override
    public ArrayList getDrops(World world, int x, int y, int z, int metadata, int fortune)
    {
        ArrayList<ItemStack> drops = new ArrayList<ItemStack>();
        int index = mobToIndex(this.mob);
        drops.add(new ItemStack((BlockCustomSpawner)(EndPlus.spawners.spawnerData[index][4]),1));
        return drops;
    }
    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random par1Random)
    {
        return 1;
    }
    
    
    
    public void registerIcons(IIconRegister iconRegister) { // NO_UCD (unused code)
        this.blockIcon = iconRegister.registerIcon("EndPlus:zombieSpawner");
    }

}
