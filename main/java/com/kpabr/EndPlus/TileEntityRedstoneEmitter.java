package com.kpabr.EndPlus;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;

import java.lang.Thread;
import java.util.Random;

public class TileEntityRedstoneEmitter extends TileEntity {
    public int axis;
    public int length;
    
    public TileEntityRedstoneEmitter() {
    
        //System.out.println("Reaction5!");
        }
    @Override
    public void readFromNBT(NBTTagCompound compound) {
      super.readFromNBT(compound);

      NBTTagCompound list = (NBTTagCompound)(compound.getTag("RedstoneData")); //0?

      int length = list.getInteger("Length");
      int axis = list.getInteger("Axis");
    }
    @Override
    public void writeToNBT(NBTTagCompound compound) {
      super.writeToNBT(compound);

      NBTTagList list = new NBTTagList();
      NBTTagCompound item = new NBTTagCompound();
      item.setInteger("Length", this.length);
      item.setInteger("Axis", this.axis);
      list.appendTag(item);
      

      compound.setTag("RedstoneData", item);
    }
    

    @Override
    public void updateEntity() {
        
    }
}
