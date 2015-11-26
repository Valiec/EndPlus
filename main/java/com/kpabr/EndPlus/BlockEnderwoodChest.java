package com.kpabr.EndPlus;

import net.minecraft.block.BlockChest;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.world.World;

public class BlockEnderwoodChest extends BlockChest{

	protected BlockEnderwoodChest(int p_i45397_1_) {
		super(p_i45397_1_);
		// TODO Auto-generated constructor stub
	}
	
	public boolean canEntityDestroy(World world, int x, int y, int z, Entity entity)
    {
        if (entity instanceof EntityWither)
        {
            return true;
        }
        else if (entity instanceof EntityDragon)
        {
            return false;
        }

        return true;
    }

}
