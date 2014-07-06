package com.kpabr.EndPlus;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemRedstone;
import net.minecraftforge.common.util.EnumHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class EndItems {
    /*Item declarations*/
    public static Item enderiteGem;
    public static Item umbriteCrystal;
    public static Item luciteCrystal;
    public static Item flameriteIngot;
    public static Item gflameriteIngot;
    public static Item enderWart;
    public static Item enderWartCooked;
    public static Item pickaxeEnderite;
    public static Item shovelEnderite;
    public static Item axeEnderite;
    public static Item swordEnderite;
    public static Item hoeEnderite;
    public static Item pickaxeFlamerite;
    public static Item shovelFlamerite;
    public static Item axeFlamerite;
    public static Item swordFlamerite;
    public static Item hoeFlamerite;
    public static Item pickaxeEndstone;
    public static Item shovelEndstone;
    public static Item axeEndstone;
    public static Item swordEndstone;
    public static Item hoeEndstone;
    public static Item pickaxeNetherstone;
    public static Item shovelNetherstone;
    public static Item axeNetherstone;
    public static Item swordNetherstone;
    public static Item hoeNetherstone;
    public static Item chestplateFlamerite;
    public static Item legsFlamerite;
    public static Item bootsFlamerite;
    public static Item helmetFlamerite;
    public static Item chestplateEnderite;
    public static Item legsEnderite;
    public static Item bootsEnderite;
    public static Item helmetEnderite;
    public static Item pickaxeGFlamerite;
    public static Item shovelGFlamerite;
    public static Item axeGFlamerite;
    public static Item swordGFlamerite;
    public static Item hoeGFlamerite;
    public static Item chestplateGFlamerite;
    public static Item legsGFlamerite;
    public static Item bootsGFlamerite;
    public static Item helmetGFlamerite;
    public static Item endRD;
    public static Item infusedQuartz;
    public static Item swordInfusedQuartz;
    public static Item pickaxeInfusedQuartz;
    public static Item axeInfusedQuartz;
    public static Item hoeInfusedQuartz;
    public static Item shovelInfusedQuartz;
    public static Item chestplateInfusedQuartz;
    public static Item legsInfusedQuartz;
    public static Item bootsInfusedQuartz;
    public static Item helmetInfusedQuartz;
    
    /*Tool and Armor Material declarations*/
    static ToolMaterial Enderite = EnumHelper.addToolMaterial("ENDERITE", 4, 2544, 16.0F, 6, 28);
    static ToolMaterial Flamerite = EnumHelper.addToolMaterial("FLAMERITE", 3, 865, 14.0F, 4, 26);
    static ToolMaterial gFlamerite = EnumHelper.addToolMaterial("GFLAMERITE", 3, 782, 14.0F, 4, 26);
    static ToolMaterial Endstone = EnumHelper.addToolMaterial("ENDSTONE", 1, 181, 4.0F, 1.0F, 14);
    static ToolMaterial Netherstone = EnumHelper.addToolMaterial("NETHERSTONE", 1, 151, 4.0F, 1.0F, 10);
    static ToolMaterial InfusedQuartz = EnumHelper.addToolMaterial("INFUSEDQUARTZ", 2, 250, 12.0F, 2.0F, 14);
    
    static ArmorMaterial EnderiteArmor = EnumHelper.addArmorMaterial("ENDERITE", 57, new int[]{4, 8, 6, 4}, 30);
    static ArmorMaterial FlameriteArmor = EnumHelper.addArmorMaterial("FLAMERITE", 55, new int[]{4, 6, 5, 3}, 25);
    static ArmorMaterial gFlameriteArmor = EnumHelper.addArmorMaterial("GFLAMERITE", 53, new int[]{4, 6, 5, 3}, 25);
    static ArmorMaterial InfusedQuartzArmor = EnumHelper.addArmorMaterial("INFUSEDQUARTZ", 15, new int[]{3, 8, 5, 2}, 25);

    public void registerItems()
    {
       
        GameRegistry.registerItem(this.enderiteGem, "enderite_gem");
        GameRegistry.registerItem(this.helmetEnderite, "enderite_helmet");
        GameRegistry.registerItem(this.chestplateEnderite, "enderite_chestplate");
        GameRegistry.registerItem(this.legsEnderite, "enderite_leggings");
        GameRegistry.registerItem(this.bootsEnderite, "enderite_boots");
        
        GameRegistry.registerItem(this.helmetFlamerite, "flamerite_helmet");
        GameRegistry.registerItem(this.chestplateFlamerite, "flamerite_chestplate");
        GameRegistry.registerItem(this.legsFlamerite, "flamerite_leggings");
        GameRegistry.registerItem(this.bootsFlamerite, "flamerite_boots");
        
        GameRegistry.registerItem(this.helmetGFlamerite, "gold_flamerite_helmet");
        GameRegistry.registerItem(this.chestplateGFlamerite, "gold_flamerite_chestplate");
        GameRegistry.registerItem(this.legsGFlamerite, "gold_flamerite_leggings");
        GameRegistry.registerItem(this.bootsGFlamerite, "gold_flamerite_boots");
        
        GameRegistry.registerItem(this.pickaxeEnderite, "enderite_pickaxe");
        GameRegistry.registerItem(this.axeEnderite, "enderite_axe");
        GameRegistry.registerItem(this.hoeEnderite, "enderite_hoe");
        GameRegistry.registerItem(this.shovelEnderite, "enderite_shovel");
        GameRegistry.registerItem(this.swordEnderite, "enderite_sword");
        
        GameRegistry.registerItem(this.pickaxeNetherstone, "netherstone_pickaxe");
        GameRegistry.registerItem(this.axeNetherstone, "netherstone_axe");
        GameRegistry.registerItem(this.hoeNetherstone, "netherstone_hoe");
        GameRegistry.registerItem(this.shovelNetherstone, "netherstone_shovel");
        GameRegistry.registerItem(this.swordNetherstone, "netherstone_sword");
        
        GameRegistry.registerItem(this.pickaxeEndstone, "endstone_pickaxe");
        GameRegistry.registerItem(this.axeEndstone, "endstone_axe");
        GameRegistry.registerItem(this.hoeEndstone, "endstone_hoe");
        GameRegistry.registerItem(this.shovelEndstone, "endstone_shovel");
        GameRegistry.registerItem(this.swordEndstone, "endstone_sword");
        
        GameRegistry.registerItem(this.pickaxeFlamerite, "flamerite_pickaxe");
        GameRegistry.registerItem(this.axeFlamerite, "flamerite_axe");
        GameRegistry.registerItem(this.hoeFlamerite, "flamerite_hoe");
        GameRegistry.registerItem(this.shovelFlamerite, "flamerite_shovel");
        GameRegistry.registerItem(this.swordFlamerite, "flamerite_sword");
        GameRegistry.registerItem(this.pickaxeGFlamerite, "gold_flamerite_pickaxe");
        GameRegistry.registerItem(this.axeGFlamerite, "gold_flamerite_axe");
        GameRegistry.registerItem(this.hoeGFlamerite, "gold_flamerite_hoe");
        GameRegistry.registerItem(this.shovelGFlamerite, "gold_flamerite_shovel");
        GameRegistry.registerItem(this.swordGFlamerite, "gold_flamerite_sword");
        GameRegistry.registerItem(this.umbriteCrystal, "umbrite_crystal");
        GameRegistry.registerItem(this.luciteCrystal, "lucite_crystal");
        GameRegistry.registerItem(this.flameriteIngot, "flamerite_ingot");
        GameRegistry.registerItem(this.gflameriteIngot, "gold_flamerite_ingot");
        GameRegistry.registerItem(this.enderWart, "ender_wart");
        GameRegistry.registerItem(this.enderWartCooked, "ender_wart_cooked");
        GameRegistry.registerItem(this.endRD, "ender_redstone_dust");
        GameRegistry.registerItem(this.infusedQuartz, "infused_quartz");
        
        GameRegistry.registerItem(this.swordInfusedQuartz, "infused_quartz_sword");
        GameRegistry.registerItem(this.pickaxeInfusedQuartz, "infused_quartz_pickaxe");
        GameRegistry.registerItem(this.axeInfusedQuartz, "infused_quartz_axe");
        GameRegistry.registerItem(this.hoeInfusedQuartz, "infused_quartz_hoe");
        GameRegistry.registerItem(this.shovelInfusedQuartz, "infused_quartz_shovel");
        
        GameRegistry.registerItem(this.helmetInfusedQuartz, "infusedQuartz_helmet");
        GameRegistry.registerItem(this.chestplateInfusedQuartz, "infusedQuartz_chestplate");
        GameRegistry.registerItem(this.legsInfusedQuartz, "infusedQuartz_leggings");
        GameRegistry.registerItem(this.bootsInfusedQuartz, "infusedQuartz_boots");
    }
    
    public void setupItems()
    {
    
        this.umbriteCrystal = new ItemSpellBase(false).setTextureName("endplus:crystalUmbrite").setCreativeTab(EndPlus.tabEndplusItems).setUnlocalizedName("umbriteCrystal");
        this.luciteCrystal = new ItemSpellBase(true).setTextureName("endplus:crystalLucite").setCreativeTab(EndPlus.tabEndplusItems).setUnlocalizedName("luciteCrystal");
        this.enderiteGem = new ItemEnderiteGem().setTextureName("endplus:gemEnderite").setCreativeTab(EndPlus.tabEndplusItems).setUnlocalizedName("enderiteGem");
        this.pickaxeEnderite = new ItemPickaxeBase(Enderite).setTextureName("endplus:pickaxeEnderite").setCreativeTab(EndPlus.tabEndplusTools).setUnlocalizedName("enderitePick");
        this.helmetEnderite = new ItemArmorBase(EnderiteArmor, 5, 0).setTextureName("endplus:helmetEnderite").setCreativeTab(EndPlus.tabEndplusCombat).setUnlocalizedName("enderiteHelmet");
        this.chestplateEnderite = new ItemArmorBase(EnderiteArmor, 5, 1).setTextureName("endplus:chestplateEnderite").setCreativeTab(EndPlus.tabEndplusCombat).setUnlocalizedName("enderiteChestplate");
        this.legsEnderite = new ItemArmorBase(EnderiteArmor, 5, 2).setTextureName("endplus:leggingsEnderite").setCreativeTab(EndPlus.tabEndplusCombat).setUnlocalizedName("enderiteLegs");
        this.bootsEnderite = new ItemArmorBase(EnderiteArmor, 5, 3).setTextureName("endplus:bootsEnderite").setCreativeTab(EndPlus.tabEndplusCombat).setUnlocalizedName("enderiteBoots");
        
        this.helmetFlamerite = new ItemArmorBase(FlameriteArmor, 6, 0).setTextureName("endplus:helmetFlamerite").setCreativeTab(EndPlus.tabEndplusCombat).setUnlocalizedName("flameriteHelmet");
        this.chestplateFlamerite = new ItemArmorBase(FlameriteArmor, 6, 1).setTextureName("endplus:chestplateFlamerite").setCreativeTab(EndPlus.tabEndplusCombat).setUnlocalizedName("flameriteChestplate");
        this.legsFlamerite = new ItemArmorBase(FlameriteArmor, 6, 2).setTextureName("endplus:leggingsFlamerite").setCreativeTab(EndPlus.tabEndplusCombat).setUnlocalizedName("flameriteLegs");
        this.bootsFlamerite = new ItemArmorBase(FlameriteArmor, 6, 3).setTextureName("endplus:bootsFlamerite").setCreativeTab(EndPlus.tabEndplusCombat).setUnlocalizedName("flameriteBoots");
        
        this.helmetGFlamerite = new ItemArmorMagic(gFlameriteArmor, 7, 0).setTextureName("endplus:helmetgFlamerite").setCreativeTab(EndPlus.tabEndplusCombat).setUnlocalizedName("gflameriteHelmet");
        this.chestplateGFlamerite = new ItemArmorMagic(gFlameriteArmor, 7, 1).setTextureName("endplus:chestplategFlamerite").setCreativeTab(EndPlus.tabEndplusCombat).setUnlocalizedName("gflameriteChestplate");
        this.legsGFlamerite = new ItemArmorMagic(gFlameriteArmor, 7, 2).setTextureName("endplus:leggingsgFlamerite").setCreativeTab(EndPlus.tabEndplusCombat).setUnlocalizedName("gflameriteLegs");
        this.bootsGFlamerite = new ItemArmorMagic(gFlameriteArmor, 7, 3).setTextureName("endplus:bootsgFlamerite").setCreativeTab(EndPlus.tabEndplusCombat).setUnlocalizedName("gflameriteBoots");
        
        this.axeEnderite = new ItemAxeBase(Enderite).setTextureName("endplus:hatchetEnderite").setCreativeTab(EndPlus.tabEndplusTools).setUnlocalizedName("enderiteAxe");
        this.hoeEnderite = new ItemHoeBase(Enderite).setTextureName("endplus:hoeEnderite").setCreativeTab(EndPlus.tabEndplusTools).setUnlocalizedName("enderiteHoe");
        this.shovelEnderite = new ItemShovelBase(Enderite).setTextureName("endplus:shovelEnderite").setCreativeTab(EndPlus.tabEndplusTools).setUnlocalizedName("enderiteShovel");
        this.swordEnderite = new ItemSwordBase(Enderite).setTextureName("endplus:swordEnderite").setCreativeTab(EndPlus.tabEndplusCombat).setUnlocalizedName("enderiteSword");
        
        this.pickaxeFlamerite = new ItemPickaxeBase(Flamerite).setTextureName("endplus:pickaxeFlamerite").setCreativeTab(EndPlus.tabEndplusTools).setUnlocalizedName("flameritePick");
        this.axeFlamerite = new ItemAxeBase(Flamerite).setTextureName("endplus:hatchetFlamerite").setCreativeTab(EndPlus.tabEndplusTools).setUnlocalizedName("flameriteAxe");
        this.hoeFlamerite = new ItemHoeBase(Flamerite).setTextureName("endplus:hoeFlamerite").setCreativeTab(EndPlus.tabEndplusTools).setUnlocalizedName("flameriteHoe");
        this.shovelFlamerite = new ItemShovelBase(Flamerite).setTextureName("endplus:shovelFlamerite").setCreativeTab(EndPlus.tabEndplusTools).setUnlocalizedName("flameriteShovel");
        this.swordFlamerite = new ItemSwordBase(Flamerite).setTextureName("endplus:swordFlamerite").setCreativeTab(EndPlus.tabEndplusCombat).setUnlocalizedName("flameriteSword");
        
        this.pickaxeEndstone = new ItemPickaxeBase(Endstone).setTextureName("endplus:pickaxeEndstone").setCreativeTab(EndPlus.tabEndplusTools).setUnlocalizedName("endstonePick");
        this.axeEndstone = new ItemAxeBase(Endstone).setTextureName("endplus:hatchetEndstone").setCreativeTab(EndPlus.tabEndplusTools).setUnlocalizedName("endstoneAxe");
        this.hoeEndstone = new ItemHoeBase(Endstone).setTextureName("endplus:hoeEndstone").setCreativeTab(EndPlus.tabEndplusTools).setUnlocalizedName("endstoneHoe");
        this.shovelEndstone = new ItemShovelBase(Endstone).setTextureName("endplus:shovelEndstone").setCreativeTab(EndPlus.tabEndplusTools).setUnlocalizedName("endstoneShovel");
        this.swordEndstone = new ItemSwordBase(Endstone).setTextureName("endplus:swordEndstone").setCreativeTab(EndPlus.tabEndplusCombat).setUnlocalizedName("endstoneSword");
        
        this.pickaxeNetherstone = new ItemPickaxeBase(Netherstone).setTextureName("endplus:pickaxeNetherstone").setCreativeTab(EndPlus.tabEndplusTools).setUnlocalizedName("netherstonePick");
        this.axeNetherstone = new ItemAxeBase(Netherstone).setTextureName("endplus:hatchetNetherstone").setCreativeTab(EndPlus.tabEndplusTools).setUnlocalizedName("netherstoneAxe");
        this.hoeNetherstone = new ItemHoeBase(Netherstone).setTextureName("endplus:hoeNetherstone").setCreativeTab(EndPlus.tabEndplusTools).setUnlocalizedName("netherstoneHoe");
        this.shovelNetherstone = new ItemShovelBase(Netherstone).setTextureName("endplus:shovelNetherstone").setCreativeTab(EndPlus.tabEndplusTools).setUnlocalizedName("netherstoneShovel");
        this.swordNetherstone = new ItemSwordBase(Netherstone).setTextureName("endplus:swordNetherstone").setCreativeTab(EndPlus.tabEndplusCombat).setUnlocalizedName("netherstoneSword");
        
        this.pickaxeGFlamerite = new ItemPickaxeMagic(gFlamerite).setTextureName("endplus:pickaxegFlamerite").setCreativeTab(EndPlus.tabEndplusTools).setUnlocalizedName("gflameritePick");
        this.axeGFlamerite = new ItemAxeMagic(gFlamerite).setTextureName("endplus:hatchetgFlamerite").setCreativeTab(EndPlus.tabEndplusTools).setUnlocalizedName("gflameriteAxe");
        this.hoeGFlamerite = new ItemHoeMagic(gFlamerite).setTextureName("endplus:hoegFlamerite").setCreativeTab(EndPlus.tabEndplusTools).setUnlocalizedName("gflameriteHoe");
        this.shovelGFlamerite = new ItemShovelMagic(gFlamerite).setTextureName("endplus:shovelgFlamerite").setCreativeTab(EndPlus.tabEndplusTools).setUnlocalizedName("gflameriteShovel");
        this.swordGFlamerite = new ItemSwordMagic(gFlamerite).setTextureName("endplus:swordgFlamerite").setCreativeTab(EndPlus.tabEndplusCombat).setUnlocalizedName("gflameriteSword");
        
        
        this.enderWart = new EnderStalkSeeds(3, 4, EndPlus.blocks.enderStalk, EndPlus.blocks.endDirt).setTextureName("endplus:enderStalkSeeds").setCreativeTab(EndPlus.tabEndplusItems).setUnlocalizedName("endFood");
        this.enderWartCooked = new EnderStalkSeedsCooked(7, 7, false).setTextureName("endplus:enderStalkSeeds2").setCreativeTab(EndPlus.tabEndplusItems).setUnlocalizedName("endFoodEdible");
        this.flameriteIngot = new ItemBase().setTextureName("endplus:ingotFlamerite").setCreativeTab(EndPlus.tabEndplusItems).setUnlocalizedName("flameriteIngot");
        this.gflameriteIngot = new ItemBase().setTextureName("endplus:ingotgFlamerite").setCreativeTab(EndPlus.tabEndplusItems).setUnlocalizedName("gflameriteIngot");
        this.endRD = new ItemEnderRedstone().setTextureName("endplus:ender_redstone_dust").setCreativeTab(EndPlus.tabEndplusRedstone).setUnlocalizedName("endRedstoneDust");
        
        this.infusedQuartz = new ItemBase().setTextureName("endplus:netherquartz_infused").setCreativeTab(EndPlus.tabEndplusItems).setUnlocalizedName("infusedQuartz");
        
        this.swordInfusedQuartz = new ItemSwordBase(InfusedQuartz).setTextureName("endplus:SwordQI6").setCreativeTab(EndPlus.tabEndplusCombat).setUnlocalizedName("infusedQuartzSword");
        this.pickaxeInfusedQuartz = new ItemPickaxeBase(InfusedQuartz).setTextureName("endplus:PickaxeQI2").setCreativeTab(EndPlus.tabEndplusTools).setUnlocalizedName("infusedQuartzPick");
        this.axeInfusedQuartz = new ItemAxeBase(InfusedQuartz).setTextureName("endplus:HatchetQI").setCreativeTab(EndPlus.tabEndplusTools).setUnlocalizedName("infusedQuartzAxe");
        this.hoeInfusedQuartz = new ItemHoeBase(InfusedQuartz).setTextureName("endplus:HoeQI").setCreativeTab(EndPlus.tabEndplusTools).setUnlocalizedName("infusedQuartzHoe");
        this.shovelInfusedQuartz = new ItemShovelBase(InfusedQuartz).setTextureName("endplus:ShovelQI").setCreativeTab(EndPlus.tabEndplusTools).setUnlocalizedName("infusedQuartzShovel");
        
        this.helmetInfusedQuartz = new ItemArmorBase(InfusedQuartzArmor, 8, 0).setTextureName("endplus:helmetQI").setCreativeTab(EndPlus.tabEndplusCombat).setUnlocalizedName("infusedQuartzHelmet");
        this.chestplateInfusedQuartz = new ItemArmorBase(InfusedQuartzArmor, 8, 1).setTextureName("endplus:chestplateQI").setCreativeTab(EndPlus.tabEndplusCombat).setUnlocalizedName("infusedQuartzChestplate");
        this.legsInfusedQuartz = new ItemArmorBase(InfusedQuartzArmor, 8, 2).setTextureName("endplus:leggingsQI").setCreativeTab(EndPlus.tabEndplusCombat).setUnlocalizedName("infusedQuartzLegs");
        this.bootsInfusedQuartz = new ItemArmorBase(InfusedQuartzArmor, 8, 3).setTextureName("endplus:bootsQI").setCreativeTab(EndPlus.tabEndplusCombat).setUnlocalizedName("infusedQuartzBoots");
    }
}
