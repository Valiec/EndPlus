package com.kpabr.EndPlus;

import java.util.Calendar;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityAmbientCreature;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
/*
 * Created by Valiec2019
 * on February 18, 2014
 * using Minecraft Forge 10.12.0.1022
 */

public class EntityHerobrine extends EntityMob
{

    private String texture;
	private double moveSpeed;
	private double facing;

	public EntityHerobrine(World par1World, double par2Double)
    {
        super(par1World);
        this.facing = par2Double;
        this.setSize(1.0F, 2.0F);
        this.moveSpeed = 1.5D;
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIHerobrineFlee(this, EntityPlayer.class, 32.0F, 0.0, 1.5));
        this.tasks.addTask(2, new EntityAIWatchClosest(this, EntityPlayer.class, 100.0F));

        
    }
	public EntityHerobrine(World par1World)
    {
        super(par1World);
        this.facing = this.rotationYaw*360;
        this.setSize(1.0F, 2.0F);
        this.moveSpeed = 1.5D;
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIHerobrineFlee(this, EntityPlayer.class, 32.0F, 0.0, 1.5));
        this.tasks.addTask(2, new EntityAIWatchClosest(this, EntityPlayer.class, 100.0F));
    }
	@Override
	protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(16.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(1.5D);
        //this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(4.0D);
    }
	public void setFacingTest(double par1Double)
	{
		this.facing = par1Double;
	}
	public int getSign(double n)
	{
		return (n>0 ? 1 : -1);
	}
	@Override
	protected boolean isAIEnabled()
	{
    
        return true;
    }
	@Override
	protected boolean canDespawn()
	{
    
        return false;
    }
	@Override
    public boolean attackEntityAsMob(Entity par1Entity)
    {
        return super.attackEntityAsMob(par1Entity);
    }
    @Override
    protected Item getDropItem()
    {
       
        return null;//Items.ender_eye;
    }
    @Override
    protected String getLivingSound()
    {
        return null;//"mob.creeper.say";
    }
    @Override
    protected String getHurtSound()
    {
        return null;//"mob.endermen.hit";
    }
    @Override
    protected String getDeathSound()
    {
        return null;//"mob.blaze.death";
    }
    @Override
    protected float getSoundVolume()
    {
    	return 0.0F;
    }
}

    

