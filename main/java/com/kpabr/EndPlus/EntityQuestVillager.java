package com.kpabr.EndPlus;

import cpw.mods.fml.common.registry.VillagerRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentData;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.INpc;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAvoidEntity;
import net.minecraft.entity.ai.EntityAIFollowGolem;
import net.minecraft.entity.ai.EntityAILookAtTradePlayer;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIPlay;
import net.minecraft.entity.ai.EntityAIRestrictOpenDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITradePlayer;
import net.minecraft.entity.ai.EntityAIVillagerMate;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIWatchClosest2;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Tuple;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.village.Village;
import net.minecraft.world.World;

public class EntityQuestVillager extends EntityVillager
{
    private int randomTickDivider;
    private boolean isMating;
    private boolean isPlaying;
    Village villageObj;
    // JAVADOC FIELD $$ field_70962_h
    private EntityPlayer buyingPlayer;
    // JAVADOC FIELD $$ field_70963_i
    private MerchantRecipeList buyingList;
    private int timeUntilReset;
    // JAVADOC FIELD $$ field_70959_by
    private boolean needsInitilization;
    private int wealth;
    // JAVADOC FIELD $$ field_82189_bL
    private String lastBuyingPlayer;
    private boolean isLookingForHome;
    private float field_82191_bN;
    // JAVADOC FIELD $$ field_70958_bB
    public static final Map villagersSellingList = new HashMap();
    // JAVADOC FIELD $$ field_70960_bC
    public static final Map blacksmithSellingList = new HashMap();
    private static final String __OBFID = "CL_00001707";

    public EntityQuestVillager(World par1World)
    {
        this(par1World, 0);
    }

    public EntityQuestVillager(World par1World, int par2)
    {
        super(par1World, par2);
    }



    // JAVADOC METHOD $$ func_70629_bd
    protected void updateAITick()
    {
        if (--this.randomTickDivider <= 0)
        {
            this.worldObj.villageCollectionObj.addVillagerPosition(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ));
            this.randomTickDivider = 70 + this.rand.nextInt(50);
            this.villageObj = this.worldObj.villageCollectionObj.findNearestVillage(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ), 32);

            if (this.villageObj == null)
            {
                this.detachHome();
            }
            else
            {
                ChunkCoordinates chunkcoordinates = this.villageObj.getCenter();
                this.setHomeArea(chunkcoordinates.posX, chunkcoordinates.posY, chunkcoordinates.posZ, (int)((float)this.villageObj.getVillageRadius() * 0.6F));

                if (this.isLookingForHome)
                {
                    this.isLookingForHome = false;
                    this.villageObj.setDefaultPlayerReputation(5);
                }
            }
        }

        if (!this.isTrading() && this.timeUntilReset > 0)
        {
            --this.timeUntilReset;

            if (this.timeUntilReset <= 0)
            {
                if (this.needsInitilization)
                {
                    if (this.buyingList.size() > 1)
                    {
                        Iterator iterator = this.buyingList.iterator();

                        while (iterator.hasNext())
                        {
                            MerchantRecipe merchantrecipe = (MerchantRecipe)iterator.next();

                            if (merchantrecipe.isRecipeDisabled())
                            {
                                merchantrecipe.func_82783_a(this.rand.nextInt(6) + this.rand.nextInt(6) + 2);
                            }
                        }
                    }

                    this.addDefaultEquipmentAndRecipies(1);
                    this.needsInitilization = false;

                    if (this.villageObj != null && this.lastBuyingPlayer != null)
                    {
                        this.worldObj.setEntityState(this, (byte)14);
                        this.villageObj.setReputationForPlayer(this.lastBuyingPlayer, 1);
                    }
                }

                this.addPotionEffect(new PotionEffect(Potion.regeneration.id, 200, 0));
            }
        }

        super.updateAITick();
    }

    // JAVADOC METHOD $$ func_70085_c
    public boolean interact(EntityPlayer par1EntityPlayer)
    {
        ItemStack itemstack = par1EntityPlayer.inventory.getCurrentItem();
        boolean flag = itemstack != null && itemstack.getItem() == Items.spawn_egg;

        if (!flag && this.isEntityAlive() && !this.isTrading() && !this.isChild() && !par1EntityPlayer.isSneaking())
        {
            if (!this.worldObj.isRemote)
            {
                this.setCustomer(par1EntityPlayer);
                par1EntityPlayer.displayGUIMerchant(this, this.getCustomNameTag());
            }

            return true;
        }
        else
        {
            return super.interact(par1EntityPlayer);
        }
    }

    protected void entityInit()
    {
        super.entityInit();
        this.dataWatcher.addObject(16, Integer.valueOf(0));
    }



   

    public void setRevengeTarget(EntityLivingBase par1EntityLivingBase)
    {
        super.setRevengeTarget(par1EntityLivingBase);

        if (this.villageObj != null && par1EntityLivingBase != null)
        {
            this.villageObj.addOrRenewAgressor(par1EntityLivingBase);

            if (par1EntityLivingBase instanceof EntityPlayer)
            {
                byte b0 = -1;

                if (this.isChild())
                {
                    b0 = -3;
                }

                this.villageObj.setReputationForPlayer(par1EntityLivingBase.getCommandSenderName(), b0);

                if (this.isEntityAlive())
                {
                    this.worldObj.setEntityState(this, (byte)13);
                }
            }
        }
    }

    
    public void useRecipe(MerchantRecipe par1MerchantRecipe)
    {
        par1MerchantRecipe.incrementToolUses();
        this.livingSoundTime = -this.getTalkInterval();
        this.playSound("mob.villager.yes", this.getSoundVolume(), this.getSoundPitch());

        if (par1MerchantRecipe.hasSameIDsAs((MerchantRecipe)this.buyingList.get(this.buyingList.size() - 1)))
        {
            this.timeUntilReset = 40;
            this.needsInitilization = true;

            if (this.buyingPlayer != null)
            {
                this.lastBuyingPlayer = this.buyingPlayer.getCommandSenderName();
            }
            else
            {
                this.lastBuyingPlayer = null;
            }
        }

        if (par1MerchantRecipe.getItemToBuy().getItem() == Items.emerald)
        {
            this.wealth += par1MerchantRecipe.getItemToBuy().stackSize;
        }
    }

   
    public MerchantRecipeList getRecipes(EntityPlayer par1EntityPlayer)
    {
        if (this.buyingList == null)
        {
            this.addDefaultEquipmentAndRecipies(1);
        }

        return this.buyingList;
    }

    // JAVADOC METHOD $$ func_82188_j
    private float adjustProbability(float par1)
    {
        float f1 = par1 + this.field_82191_bN;
        return f1 > 0.9F ? 0.9F - (f1 - 0.9F) : f1;
    }

    // JAVADOC METHOD $$ func_70950_c
    private void addDefaultEquipmentAndRecipies(int par1)
    {
        if (this.buyingList != null)
        {
            this.field_82191_bN = MathHelper.sqrt_float((float)this.buyingList.size()) * 0.2F;
        }
        else
        {
            this.field_82191_bN = 0.0F;
        }

        MerchantRecipeList merchantrecipelist;
        merchantrecipelist = new MerchantRecipeList();
        VillagerRegistry.manageVillagerTrades(merchantrecipelist, this, this.getProfession(), this.rand);
        int k;
        label50:
            
        switch (this.getProfession())
        {
            case 0:
                func_146091_a(merchantrecipelist, Items.wheat, this.rand, this.adjustProbability(0.9F));
                func_146091_a(merchantrecipelist, Item.getItemFromBlock(Blocks.wool), this.rand, this.adjustProbability(0.5F));
                func_146091_a(merchantrecipelist, Items.chicken, this.rand, this.adjustProbability(0.5F));
                func_146091_a(merchantrecipelist, Items.cooked_fished, this.rand, this.adjustProbability(0.4F));
                func_146089_b(merchantrecipelist, Items.bread, this.rand, this.adjustProbability(0.9F));
                func_146089_b(merchantrecipelist, Items.melon, this.rand, this.adjustProbability(0.3F));
                func_146089_b(merchantrecipelist, Items.apple, this.rand, this.adjustProbability(0.3F));
                func_146089_b(merchantrecipelist, Items.cookie, this.rand, this.adjustProbability(0.3F));
                func_146089_b(merchantrecipelist, Items.shears, this.rand, this.adjustProbability(0.3F));
                func_146089_b(merchantrecipelist, Items.flint_and_steel, this.rand, this.adjustProbability(0.3F));
                func_146089_b(merchantrecipelist, Items.cooked_chicken, this.rand, this.adjustProbability(0.3F));
                func_146089_b(merchantrecipelist, Items.arrow, this.rand, this.adjustProbability(0.5F));

                if (this.rand.nextFloat() < this.adjustProbability(0.5F))
                {
                    merchantrecipelist.add(new MerchantRecipe(new ItemStack(Blocks.gravel, 10), new ItemStack(Items.emerald), new ItemStack(Items.flint, 4 + this.rand.nextInt(2), 0)));
                }

                break;
            case 1:
                func_146091_a(merchantrecipelist, Items.paper, this.rand, this.adjustProbability(0.8F));
                func_146091_a(merchantrecipelist, Items.book, this.rand, this.adjustProbability(0.8F));
                func_146091_a(merchantrecipelist, Items.written_book, this.rand, this.adjustProbability(0.3F));
                func_146089_b(merchantrecipelist, Item.getItemFromBlock(Blocks.bookshelf), this.rand, this.adjustProbability(0.8F));
                func_146089_b(merchantrecipelist, Item.getItemFromBlock(Blocks.glass), this.rand, this.adjustProbability(0.2F));
                func_146089_b(merchantrecipelist, Items.compass, this.rand, this.adjustProbability(0.2F));
                func_146089_b(merchantrecipelist, Items.clock, this.rand, this.adjustProbability(0.2F));

                if (this.rand.nextFloat() < this.adjustProbability(0.07F))
                {
                    Enchantment enchantment = Enchantment.enchantmentsBookList[this.rand.nextInt(Enchantment.enchantmentsBookList.length)];
                    int i1 = MathHelper.getRandomIntegerInRange(this.rand, enchantment.getMinLevel(), enchantment.getMaxLevel());
                    ItemStack itemstack = Items.enchanted_book.getEnchantedItemStack(new EnchantmentData(enchantment, i1));
                    k = 2 + this.rand.nextInt(5 + i1 * 10) + 3 * i1;
                    merchantrecipelist.add(new MerchantRecipe(new ItemStack(Items.book), new ItemStack(Items.emerald, k), itemstack));
                }

                break;
            case 2:
                func_146089_b(merchantrecipelist, Items.ender_eye, this.rand, this.adjustProbability(0.3F));
                func_146089_b(merchantrecipelist, Items.experience_bottle, this.rand, this.adjustProbability(0.2F));
                func_146089_b(merchantrecipelist, Items.redstone, this.rand, this.adjustProbability(0.4F));
                func_146089_b(merchantrecipelist, Item.getItemFromBlock(Blocks.glowstone), this.rand, this.adjustProbability(0.3F));
                Item[] aitem = new Item[] {Items.iron_sword, Items.diamond_sword, Items.iron_chestplate, Items.diamond_chestplate, Items.iron_axe, Items.diamond_axe, Items.iron_pickaxe, Items.diamond_pickaxe};
                Item[] aitem1 = aitem;
                int j = aitem.length;
                k = 0;

                while (true)
                {
                    if (k >= j)
                    {
                        break label50;
                    }

                    Item item = aitem1[k];

                    if (this.rand.nextFloat() < this.adjustProbability(0.05F))
                    {
                        merchantrecipelist.add(new MerchantRecipe(new ItemStack(item, 1, 0), new ItemStack(Items.emerald, 2 + this.rand.nextInt(3), 0), EnchantmentHelper.addRandomEnchantment(this.rand, new ItemStack(item, 1, 0), 5 + this.rand.nextInt(15))));
                    }

                    ++k;
                }
            case 3:
                func_146091_a(merchantrecipelist, Items.coal, this.rand, this.adjustProbability(0.7F));
                func_146091_a(merchantrecipelist, Items.iron_ingot, this.rand, this.adjustProbability(0.5F));
                func_146091_a(merchantrecipelist, Items.gold_ingot, this.rand, this.adjustProbability(0.5F));
                func_146091_a(merchantrecipelist, Items.diamond, this.rand, this.adjustProbability(0.5F));
                func_146089_b(merchantrecipelist, Items.iron_sword, this.rand, this.adjustProbability(0.5F));
                func_146089_b(merchantrecipelist, Items.diamond_sword, this.rand, this.adjustProbability(0.5F));
                func_146089_b(merchantrecipelist, Items.iron_axe, this.rand, this.adjustProbability(0.3F));
                func_146089_b(merchantrecipelist, Items.diamond_axe, this.rand, this.adjustProbability(0.3F));
                func_146089_b(merchantrecipelist, Items.iron_pickaxe, this.rand, this.adjustProbability(0.5F));
                func_146089_b(merchantrecipelist, Items.diamond_pickaxe, this.rand, this.adjustProbability(0.5F));
                func_146089_b(merchantrecipelist, Items.iron_shovel, this.rand, this.adjustProbability(0.2F));
                func_146089_b(merchantrecipelist, Items.diamond_shovel, this.rand, this.adjustProbability(0.2F));
                func_146089_b(merchantrecipelist, Items.iron_hoe, this.rand, this.adjustProbability(0.2F));
                func_146089_b(merchantrecipelist, Items.diamond_hoe, this.rand, this.adjustProbability(0.2F));
                func_146089_b(merchantrecipelist, Items.iron_boots, this.rand, this.adjustProbability(0.2F));
                func_146089_b(merchantrecipelist, Items.diamond_boots, this.rand, this.adjustProbability(0.2F));
                func_146089_b(merchantrecipelist, Items.iron_helmet, this.rand, this.adjustProbability(0.2F));
                func_146089_b(merchantrecipelist, Items.diamond_helmet, this.rand, this.adjustProbability(0.2F));
                func_146089_b(merchantrecipelist, Items.iron_chestplate, this.rand, this.adjustProbability(0.2F));
                func_146089_b(merchantrecipelist, Items.diamond_chestplate, this.rand, this.adjustProbability(0.2F));
                func_146089_b(merchantrecipelist, Items.iron_leggings, this.rand, this.adjustProbability(0.2F));
                func_146089_b(merchantrecipelist, Items.diamond_leggings, this.rand, this.adjustProbability(0.2F));
                func_146089_b(merchantrecipelist, Items.chainmail_boots, this.rand, this.adjustProbability(0.1F));
                func_146089_b(merchantrecipelist, Items.chainmail_helmet, this.rand, this.adjustProbability(0.1F));
                func_146089_b(merchantrecipelist, Items.chainmail_chestplate, this.rand, this.adjustProbability(0.1F));
                func_146089_b(merchantrecipelist, Items.chainmail_leggings, this.rand, this.adjustProbability(0.1F));
                break;
            case 4:
                func_146091_a(merchantrecipelist, Items.coal, this.rand, this.adjustProbability(0.7F));
                func_146091_a(merchantrecipelist, Items.porkchop, this.rand, this.adjustProbability(0.5F));
                func_146091_a(merchantrecipelist, Items.beef, this.rand, this.adjustProbability(0.5F));
                func_146089_b(merchantrecipelist, Items.saddle, this.rand, this.adjustProbability(0.1F));
                func_146089_b(merchantrecipelist, Items.leather_chestplate, this.rand, this.adjustProbability(0.3F));
                func_146089_b(merchantrecipelist, Items.leather_boots, this.rand, this.adjustProbability(0.3F));
                func_146089_b(merchantrecipelist, Items.leather_helmet, this.rand, this.adjustProbability(0.3F));
                func_146089_b(merchantrecipelist, Items.leather_leggings, this.rand, this.adjustProbability(0.3F));
                func_146089_b(merchantrecipelist, Items.cooked_porkchop, this.rand, this.adjustProbability(0.3F));
                func_146089_b(merchantrecipelist, Items.cooked_beef, this.rand, this.adjustProbability(0.3F));
        }

        if (merchantrecipelist.isEmpty())
        {
            func_146091_a(merchantrecipelist, Items.gold_ingot, this.rand, 1.0F);
        }

        Collections.shuffle(merchantrecipelist);

        if (this.buyingList == null)
        {
            this.buyingList = new MerchantRecipeList();
        }

        for (int l = 0; l < par1 && l < merchantrecipelist.size(); ++l)
        {
            this.buyingList.addToListWithCheck((MerchantRecipe)merchantrecipelist.get(l));
        }
    }

    @SideOnly(Side.CLIENT)
    public void setRecipes(MerchantRecipeList par1MerchantRecipeList) {}

    public static void func_146091_a(MerchantRecipeList p_146091_0_, Item p_146091_1_, Random p_146091_2_, float p_146091_3_)
    {
        if (p_146091_2_.nextFloat() < p_146091_3_)
        {
            p_146091_0_.add(new MerchantRecipe(func_146088_a(p_146091_1_, p_146091_2_), Items.emerald));
        }
    }

    private static ItemStack func_146088_a(Item p_146088_0_, Random p_146088_1_)
    {
        return new ItemStack(p_146088_0_, func_146092_b(p_146088_0_, p_146088_1_), 0);
    }

    private static int func_146092_b(Item p_146092_0_, Random p_146092_1_)
    {
        Tuple tuple = (Tuple)villagersSellingList.get(p_146092_0_);
        return tuple == null ? 1 : (((Integer)tuple.getFirst()).intValue() >= ((Integer)tuple.getSecond()).intValue() ? ((Integer)tuple.getFirst()).intValue() : ((Integer)tuple.getFirst()).intValue() + p_146092_1_.nextInt(((Integer)tuple.getSecond()).intValue() - ((Integer)tuple.getFirst()).intValue()));
    }

    public static void func_146089_b(MerchantRecipeList p_146089_0_, Item p_146089_1_, Random p_146089_2_, float p_146089_3_)
    {
        if (p_146089_2_.nextFloat() < p_146089_3_)
        {
            int i = func_146090_c(p_146089_1_, p_146089_2_);
            ItemStack itemstack;
            ItemStack itemstack1;

            if (i < 0)
            {
                itemstack = new ItemStack(Items.emerald, 1, 0);
                itemstack1 = new ItemStack(p_146089_1_, -i, 0);
            }
            else
            {
                itemstack = new ItemStack(Items.emerald, i, 0);
                itemstack1 = new ItemStack(p_146089_1_, 1, 0);
            }

            p_146089_0_.add(new MerchantRecipe(itemstack, itemstack1));
        }
    }

    private static int func_146090_c(Item p_146090_0_, Random p_146090_1_)
    {
        Tuple tuple = (Tuple)blacksmithSellingList.get(p_146090_0_);
        return tuple == null ? 1 : (((Integer)tuple.getFirst()).intValue() >= ((Integer)tuple.getSecond()).intValue() ? ((Integer)tuple.getFirst()).intValue() : ((Integer)tuple.getFirst()).intValue() + p_146090_1_.nextInt(((Integer)tuple.getSecond()).intValue() - ((Integer)tuple.getFirst()).intValue()));
    }

    

   

    

  
}