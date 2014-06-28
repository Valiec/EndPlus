package com.kpabr.EndPlus;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import net.minecraft.world.ChunkPosition;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.world.biome.WorldChunkManagerHell;

public class WorldChunkManagerModded extends WorldChunkManagerHell
{
    // JAVADOC FIELD $$ field_76947_d
    private BiomeGenBase biomeGenerator;
    private BiomeGenBase biomeGenerator2;
    private World world;
    // JAVADOC FIELD $$ field_76946_f
    private float rainfall;
    private static final String __OBFID = "CL_00000169";

    public WorldChunkManagerModded(BiomeGenBase p_i45374_1_, BiomeGenBase p_i45374_3_, float p_i45374_2_, World p_i45374_4_)
    {
        super(p_i45374_1_, p_i45374_2_);
        this.biomeGenerator = p_i45374_1_;
        this.biomeGenerator2 = p_i45374_3_;
        this.rainfall = p_i45374_2_;
        this.world = p_i45374_4_;
    }

    // JAVADOC METHOD $$ func_76935_a
    public BiomeGenBase getBiomeGenAt(int par1, int par2)
    {
        
        if(world.getTopSolidOrLiquidBlock(par2, par1) > 50)
        {
            return this.biomeGenerator2;
        }
        return this.biomeGenerator;
    }

    /*// JAVADOC METHOD $$ func_76937_a
    public BiomeGenBase[] getBiomesForGeneration(BiomeGenBase[] par1ArrayOfBiomeGenBase, int par2, int par3, int par4, int par5)
    {
        if (par1ArrayOfBiomeGenBase == null || par1ArrayOfBiomeGenBase.length < par4 * par5)
        {
            par1ArrayOfBiomeGenBase = new BiomeGenBase[par4 * par5];
        }

        Arrays.fill(par1ArrayOfBiomeGenBase, 0, (par4 * par5), this.biomeGenerator);
        //Arrays.fill(par1ArrayOfBiomeGenBase, (par4 * par5)/2, (par4 * par5), this.biomeGenerator2);
        return par1ArrayOfBiomeGenBase;
    }

    // JAVADOC METHOD $$ func_76936_a
    public float[] getRainfall(float[] par1ArrayOfFloat, int par2, int par3, int par4, int par5)
    {
        if (par1ArrayOfFloat == null || par1ArrayOfFloat.length < par4 * par5)
        {
            par1ArrayOfFloat = new float[par4 * par5];
        }

        Arrays.fill(par1ArrayOfFloat, 0, par4 * par5, this.rainfall);
        return par1ArrayOfFloat;
    }

    // JAVADOC METHOD $$ func_76933_b
    public BiomeGenBase[] loadBlockGeneratorData(BiomeGenBase[] par1ArrayOfBiomeGenBase, int par2, int par3, int par4, int par5)
    {
        if (par1ArrayOfBiomeGenBase == null || par1ArrayOfBiomeGenBase.length < par4 * par5)
        {
            par1ArrayOfBiomeGenBase = new BiomeGenBase[par4 * par5];
        }

        Arrays.fill(par1ArrayOfBiomeGenBase, 0, (par4 * par5), this.biomeGenerator);
        //Arrays.fill(par1ArrayOfBiomeGenBase, (par4 * par5)/2, (par4 * par5), this.biomeGenerator2);
        return par1ArrayOfBiomeGenBase;
    }

    // JAVADOC METHOD $$ func_76931_a
    public BiomeGenBase[] getBiomeGenAt(BiomeGenBase[] par1ArrayOfBiomeGenBase, int par2, int par3, int par4, int par5, boolean par6)
    {
        return this.loadBlockGeneratorData(par1ArrayOfBiomeGenBase, par2, par3, par4, par5);
    }
*/
    public ChunkPosition findBiomePosition(int p_150795_1_, int p_150795_2_, int p_150795_3_, List p_150795_4_, Random p_150795_5_)
    {
        return p_150795_4_.contains(this.biomeGenerator) || p_150795_4_.contains(this.biomeGenerator2) ? new ChunkPosition(p_150795_1_ - p_150795_3_ + p_150795_5_.nextInt(p_150795_3_ * 2 + 1), 0, p_150795_2_ - p_150795_3_ + p_150795_5_.nextInt(p_150795_3_ * 2 + 1)) : null;
    }

    // JAVADOC METHOD $$ func_76940_a
    public boolean areBiomesViable(int par1, int par2, int par3, List par4List)
    {
        return par4List.contains(this.biomeGenerator) || par4List.contains(this.biomeGenerator2);
    }
}