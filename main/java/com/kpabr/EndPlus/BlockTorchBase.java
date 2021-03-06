package com.kpabr.EndPlus;
/*
 * Created by Valiec2019
 * on February 18, 2014
 * using Minecraft Forge 10.12.0.1022
 */
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.init.Blocks;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockTorchBase extends BlockTorch
{
    private static final String __OBFID = "CL_00000325";
    private boolean dragonProof;

    protected BlockTorchBase(boolean dragonProof)
    {
        super();
        this.setTickRandomly(true);
        this.setCreativeTab(CreativeTabs.tabDecorations);
        this.dragonProof = dragonProof;
    }
    
    @Override
    public boolean canEntityDestroy(IBlockAccess world, int x, int y, int z, Entity entity)
    {
        
        if (entity instanceof EntityWither)
        {
            return true;
        }
        else if (entity instanceof EntityDragon && this.dragonProof)
        {
            return false;
        }

        return true;
    }


}
