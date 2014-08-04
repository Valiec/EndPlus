package com.kpabr.EndPlus;

import java.util.List;
import java.util.Random;

import net.minecraft.client.Minecraft;
import net.minecraft.command.IEntitySelector;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.entity.passive.EntityTameable;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;

public class EntityAIHerobrineFlee extends EntityAIBase {

	public final IEntitySelector field_98218_a = new IEntitySelector()
    {
        private static final String __OBFID = "CL_00001575";
        /**
         * Return whether the specified entity is applicable to this filter.
         */
        public boolean isEntityApplicable(Entity p_82704_1_)
        {
            return p_82704_1_.isEntityAlive();
        }
    };
    /** The entity we are attached to */
    private EntityCreature theEntity;
    private double farSpeed;
    private double nearSpeed;
    private Entity closestLivingEntity;
    private float distanceFromEntity;
    /** The PathEntity of our entity */
    private PathEntity entityPathEntity;
    /** The PathNavigate of our entity */
    private PathNavigate entityPathNavigate;
    /** The class of the entity we should avoid */
    private Class targetEntityClass;
    private static Vec3 staticVector = Vec3.createVectorHelper(0.0D, 0.0D, 0.0D);
    private static final String __OBFID = "CL_00001574";
    public static double facingdeg = 0;
    public static double facingraw = 0;
    public static double facing = 0;

    public EntityAIHerobrineFlee(EntityCreature p_i1616_1_, Class p_i1616_2_, float p_i1616_3_, double p_i1616_4_, double p_i1616_6_)
    {
        this.theEntity = p_i1616_1_;
        this.targetEntityClass = p_i1616_2_;
        this.distanceFromEntity = p_i1616_3_;
        this.farSpeed = p_i1616_4_;
        this.nearSpeed = p_i1616_6_;
        this.entityPathNavigate = p_i1616_1_.getNavigator();
        this.setMutexBits(1);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        return true;
    }

    /**
     * Returns whether an in-progress EntityAIBase should continue executing
     */
    public boolean continueExecuting()
    {
        return true; //TODO check distance
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting()
    {
    	if(Minecraft.getMinecraft().thePlayer != null)
    	{
    	this.theEntity.faceEntity(Minecraft.getMinecraft().thePlayer, 0.2F, 0.2F);
    	}
    	this.facingraw = this.theEntity.rotationYaw;
		if((int)(this.facingraw) < 0)
		{
			this.facingdeg = 360+this.facingraw;
		}
		else
		{
			this.facingdeg = this.facingraw;
		}
		this.facing = ((this.facingdeg)/360)*(2*Math.PI);
        updateTask();
    }

    /**
     * Resets the task
     */
    public void resetTask()
    {
        
    }

    /**
     * Updates the task
     */
    public void updateTask()
    {
    	if(true)//Minecraft.getMinecraft().thePlayer != null)
		{
		if(true)//Math.sqrt((Math.pow(Minecraft.getMinecraft().thePlayer.posX-this.posX, 2))+(Math.pow(Minecraft.getMinecraft().thePlayer.posZ-this.posZ, 2))) < 32)
		{
	    if(Minecraft.getMinecraft().thePlayer != null)
	    {
	    this.theEntity.faceEntity(Minecraft.getMinecraft().thePlayer, 0.2F, 0.2F);
	    }	
		System.out.println(this.facingraw);
		System.out.println(this.facingdeg);
		System.out.println(this.facing);
		double rzx = Math.tan(this.facing);
		System.out.println(rzx);
		double dx = (-0.1);
		double dz = (-0.1);
		if(facingdeg == 0.0D) //south
		{
			rzx = 1;
			dx = 0;
		}
		else if(this.facingdeg == 180.0D) //north
		{
			rzx = -1;
			dx = 0;
		}
		else if(this.facingdeg == 270.0D) //east
		{
			rzx = 1;
			dz = 0;
		}
		else if(this.facingdeg == 360.0D) //west
		{
			rzx = 1;
			dz = 0;
		}
		dx = dx*(1/rzx);
		dz = dz*rzx;
		System.out.println(rzx);
		System.out.println(dx);
		System.out.println(dz);
		System.out.println("-------------");
		this.theEntity.setPosition(this.theEntity.posX+dx, this.theEntity.posY, this.theEntity.posZ+dz);
		this.theEntity.limbSwingAmount = 0;
		}
		}
    }
}
    