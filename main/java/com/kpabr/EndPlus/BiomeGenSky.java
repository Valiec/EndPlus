package com.kpabr.EndPlus;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenSky extends BiomeGenBase
{
    private static final String __OBFID = "CL_00000187";

    public BiomeGenSky(int par1)
    {
        super(par1);
        this.biomeName = "Skylands";
        this.temperature = 0.80F;
        this.setHeight(BiomeGenBase.height_MidHills);
        this.topBlock = Blocks.dirt;
        this.theBiomeDecorator.treesPerChunk = 6;
        this.theBiomeDecorator.grassPerChunk = 40;
        this.theBiomeDecorator.flowersPerChunk = 20;
        this.theBiomeDecorator.generateLakes = true;
        this.fillerBlock = Blocks.dirt;
        this.rainfall = 0.18F;
        //this.setColor(062723);
        this.theBiomeDecorator = new BiomeModdedDecorator();
    }

    // JAVADOC METHOD $$ func_76731_a
}