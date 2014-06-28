package com.kpabr.EndPlus;

import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRedstoneWire;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.init.Blocks;
import net.minecraft.src.FMLRenderAccessLibrary;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class EndRenderHandler extends RenderBlocks implements ISimpleBlockRenderingHandler{
 // JAVADOC METHOD $$ func_147788_h

    public boolean renderBlockEnderRedstone(IBlockAccess world, Block p_147788_1_, int p_147788_2_, int p_147788_3_, int p_147788_4_)
    {
        Tessellator tessellator = Tessellator.instance;
        int l = world.getBlockMetadata(p_147788_2_, p_147788_3_, p_147788_4_);
        IIcon iicon = BlockRedstoneWire.getRedstoneWireIcon("cross");
        IIcon iicon1 = BlockRedstoneWire.getRedstoneWireIcon("line");
        IIcon iicon2 = BlockRedstoneWire.getRedstoneWireIcon("cross_overlay");
        IIcon iicon3 = BlockRedstoneWire.getRedstoneWireIcon("line_overlay");
        tessellator.setBrightness(p_147788_1_.getMixedBrightnessForBlock(world, p_147788_2_, p_147788_3_, p_147788_4_));
        float f = (float)l / 15.0F;
        float f1 = f * 0.6F + 0.4F;

        if (l == 0)
        {
            f1 = 0.3F;
        }

        float f2 = f * f * 0.7F - 0.5F;
        float f3 = f * f * 0.6F - 0.7F;

        if (f2 < 0.0F)
        {
            f2 = 0.0F;
        }

        if (f3 < 0.0F)
        {
            f3 = 0.0F;
        }

        tessellator.setColorOpaque_F(f1, f2, f3);
        double d0 = 0.015625D;
        double d1 = 0.015625D;
        boolean flag = BlockRedstoneWire.isPowerProviderOrWire(world, p_147788_2_ - 1, p_147788_3_, p_147788_4_, 1) || !world.getBlock(p_147788_2_ - 1, p_147788_3_, p_147788_4_).isBlockNormalCube() && BlockRedstoneWire.isPowerProviderOrWire(world, p_147788_2_ - 1, p_147788_3_ - 1, p_147788_4_, -1);
        boolean flag1 = BlockRedstoneWire.isPowerProviderOrWire(world, p_147788_2_ + 1, p_147788_3_, p_147788_4_, 3) || !world.getBlock(p_147788_2_ + 1, p_147788_3_, p_147788_4_).isBlockNormalCube() && BlockRedstoneWire.isPowerProviderOrWire(world, p_147788_2_ + 1, p_147788_3_ - 1, p_147788_4_, -1);
        boolean flag2 = BlockRedstoneWire.isPowerProviderOrWire(world, p_147788_2_, p_147788_3_, p_147788_4_ - 1, 2) || !world.getBlock(p_147788_2_, p_147788_3_, p_147788_4_ - 1).isBlockNormalCube() && BlockRedstoneWire.isPowerProviderOrWire(world, p_147788_2_, p_147788_3_ - 1, p_147788_4_ - 1, -1);
        boolean flag3 = BlockRedstoneWire.isPowerProviderOrWire(world, p_147788_2_, p_147788_3_, p_147788_4_ + 1, 0) || !world.getBlock(p_147788_2_, p_147788_3_, p_147788_4_ + 1).isBlockNormalCube() && BlockRedstoneWire.isPowerProviderOrWire(world, p_147788_2_, p_147788_3_ - 1, p_147788_4_ + 1, -1);

        if (!world.getBlock(p_147788_2_, p_147788_3_ + 1, p_147788_4_).isBlockNormalCube())
        {
            if (world.getBlock(p_147788_2_ - 1, p_147788_3_, p_147788_4_).isBlockNormalCube() && BlockRedstoneWire.isPowerProviderOrWire(world, p_147788_2_ - 1, p_147788_3_ + 1, p_147788_4_, -1))
            {
                flag = true;
            }

            if (world.getBlock(p_147788_2_ + 1, p_147788_3_, p_147788_4_).isBlockNormalCube() && BlockRedstoneWire.isPowerProviderOrWire(world, p_147788_2_ + 1, p_147788_3_ + 1, p_147788_4_, -1))
            {
                flag1 = true;
            }

            if (world.getBlock(p_147788_2_, p_147788_3_, p_147788_4_ - 1).isBlockNormalCube() && BlockRedstoneWire.isPowerProviderOrWire(world, p_147788_2_, p_147788_3_ + 1, p_147788_4_ - 1, -1))
            {
                flag2 = true;
            }

            if (world.getBlock(p_147788_2_, p_147788_3_, p_147788_4_ + 1).isBlockNormalCube() && BlockRedstoneWire.isPowerProviderOrWire(world, p_147788_2_, p_147788_3_ + 1, p_147788_4_ + 1, -1))
            {
                flag3 = true;
            }
        }

        float f4 = (float)(p_147788_2_ + 0);
        float f5 = (float)(p_147788_2_ + 1);
        float f6 = (float)(p_147788_4_ + 0);
        float f7 = (float)(p_147788_4_ + 1);
        int i1 = 0;

        if ((flag || flag1) && !flag2 && !flag3)
        {
            i1 = 1;
        }

        if ((flag2 || flag3) && !flag1 && !flag)
        {
            i1 = 2;
        }

        if (i1 == 0)
        {
            int j1 = 0;
            int k1 = 0;
            int l1 = 16;
            int i2 = 16;
            boolean flag4 = true;

            if (!flag)
            {
                f4 += 0.3125F;
            }

            if (!flag)
            {
                j1 += 5;
            }

            if (!flag1)
            {
                f5 -= 0.3125F;
            }

            if (!flag1)
            {
                l1 -= 5;
            }

            if (!flag2)
            {
                f6 += 0.3125F;
            }

            if (!flag2)
            {
                k1 += 5;
            }

            if (!flag3)
            {
                f7 -= 0.3125F;
            }

            if (!flag3)
            {
                i2 -= 5;
            }

            tessellator.addVertexWithUV((double)f5, (double)p_147788_3_ + 0.015625D, (double)f7, (double)iicon.getInterpolatedU((double)l1), (double)iicon.getInterpolatedV((double)i2));
            tessellator.addVertexWithUV((double)f5, (double)p_147788_3_ + 0.015625D, (double)f6, (double)iicon.getInterpolatedU((double)l1), (double)iicon.getInterpolatedV((double)k1));
            tessellator.addVertexWithUV((double)f4, (double)p_147788_3_ + 0.015625D, (double)f6, (double)iicon.getInterpolatedU((double)j1), (double)iicon.getInterpolatedV((double)k1));
            tessellator.addVertexWithUV((double)f4, (double)p_147788_3_ + 0.015625D, (double)f7, (double)iicon.getInterpolatedU((double)j1), (double)iicon.getInterpolatedV((double)i2));
            tessellator.setColorOpaque_F(1.0F, 1.0F, 1.0F);
            tessellator.addVertexWithUV((double)f5, (double)p_147788_3_ + 0.015625D, (double)f7, (double)iicon2.getInterpolatedU((double)l1), (double)iicon2.getInterpolatedV((double)i2));
            tessellator.addVertexWithUV((double)f5, (double)p_147788_3_ + 0.015625D, (double)f6, (double)iicon2.getInterpolatedU((double)l1), (double)iicon2.getInterpolatedV((double)k1));
            tessellator.addVertexWithUV((double)f4, (double)p_147788_3_ + 0.015625D, (double)f6, (double)iicon2.getInterpolatedU((double)j1), (double)iicon2.getInterpolatedV((double)k1));
            tessellator.addVertexWithUV((double)f4, (double)p_147788_3_ + 0.015625D, (double)f7, (double)iicon2.getInterpolatedU((double)j1), (double)iicon2.getInterpolatedV((double)i2));
        }
        else if (i1 == 1)
        {
            tessellator.addVertexWithUV((double)f5, (double)p_147788_3_ + 0.015625D, (double)f7, (double)iicon1.getMaxU(), (double)iicon1.getMaxV());
            tessellator.addVertexWithUV((double)f5, (double)p_147788_3_ + 0.015625D, (double)f6, (double)iicon1.getMaxU(), (double)iicon1.getMinV());
            tessellator.addVertexWithUV((double)f4, (double)p_147788_3_ + 0.015625D, (double)f6, (double)iicon1.getMinU(), (double)iicon1.getMinV());
            tessellator.addVertexWithUV((double)f4, (double)p_147788_3_ + 0.015625D, (double)f7, (double)iicon1.getMinU(), (double)iicon1.getMaxV());
            tessellator.setColorOpaque_F(1.0F, 1.0F, 1.0F);
            tessellator.addVertexWithUV((double)f5, (double)p_147788_3_ + 0.015625D, (double)f7, (double)iicon3.getMaxU(), (double)iicon3.getMaxV());
            tessellator.addVertexWithUV((double)f5, (double)p_147788_3_ + 0.015625D, (double)f6, (double)iicon3.getMaxU(), (double)iicon3.getMinV());
            tessellator.addVertexWithUV((double)f4, (double)p_147788_3_ + 0.015625D, (double)f6, (double)iicon3.getMinU(), (double)iicon3.getMinV());
            tessellator.addVertexWithUV((double)f4, (double)p_147788_3_ + 0.015625D, (double)f7, (double)iicon3.getMinU(), (double)iicon3.getMaxV());
        }
        else
        {
            tessellator.addVertexWithUV((double)f5, (double)p_147788_3_ + 0.015625D, (double)f7, (double)iicon1.getMaxU(), (double)iicon1.getMaxV());
            tessellator.addVertexWithUV((double)f5, (double)p_147788_3_ + 0.015625D, (double)f6, (double)iicon1.getMinU(), (double)iicon1.getMaxV());
            tessellator.addVertexWithUV((double)f4, (double)p_147788_3_ + 0.015625D, (double)f6, (double)iicon1.getMinU(), (double)iicon1.getMinV());
            tessellator.addVertexWithUV((double)f4, (double)p_147788_3_ + 0.015625D, (double)f7, (double)iicon1.getMaxU(), (double)iicon1.getMinV());
            tessellator.setColorOpaque_F(1.0F, 1.0F, 1.0F);
            tessellator.addVertexWithUV((double)f5, (double)p_147788_3_ + 0.015625D, (double)f7, (double)iicon3.getMaxU(), (double)iicon3.getMaxV());
            tessellator.addVertexWithUV((double)f5, (double)p_147788_3_ + 0.015625D, (double)f6, (double)iicon3.getMinU(), (double)iicon3.getMaxV());
            tessellator.addVertexWithUV((double)f4, (double)p_147788_3_ + 0.015625D, (double)f6, (double)iicon3.getMinU(), (double)iicon3.getMinV());
            tessellator.addVertexWithUV((double)f4, (double)p_147788_3_ + 0.015625D, (double)f7, (double)iicon3.getMaxU(), (double)iicon3.getMinV());
        }

        if (!world.getBlock(p_147788_2_, p_147788_3_ + 1, p_147788_4_).isBlockNormalCube())
        {
            float f8 = 0.021875F;

            if (world.getBlock(p_147788_2_ - 1, p_147788_3_, p_147788_4_).isBlockNormalCube() && world.getBlock(p_147788_2_ - 1, p_147788_3_ + 1, p_147788_4_) == EndPlus.blocks.endRedstone)
            {
                tessellator.setColorOpaque_F(f1, f2, f3);
                tessellator.addVertexWithUV((double)p_147788_2_ + 0.015625D, (double)((float)(p_147788_3_ + 1) + 0.021875F), (double)(p_147788_4_ + 1), (double)iicon1.getMaxU(), (double)iicon1.getMinV());
                tessellator.addVertexWithUV((double)p_147788_2_ + 0.015625D, (double)(p_147788_3_ + 0), (double)(p_147788_4_ + 1), (double)iicon1.getMinU(), (double)iicon1.getMinV());
                tessellator.addVertexWithUV((double)p_147788_2_ + 0.015625D, (double)(p_147788_3_ + 0), (double)(p_147788_4_ + 0), (double)iicon1.getMinU(), (double)iicon1.getMaxV());
                tessellator.addVertexWithUV((double)p_147788_2_ + 0.015625D, (double)((float)(p_147788_3_ + 1) + 0.021875F), (double)(p_147788_4_ + 0), (double)iicon1.getMaxU(), (double)iicon1.getMaxV());
                tessellator.setColorOpaque_F(1.0F, 1.0F, 1.0F);
                tessellator.addVertexWithUV((double)p_147788_2_ + 0.015625D, (double)((float)(p_147788_3_ + 1) + 0.021875F), (double)(p_147788_4_ + 1), (double)iicon3.getMaxU(), (double)iicon3.getMinV());
                tessellator.addVertexWithUV((double)p_147788_2_ + 0.015625D, (double)(p_147788_3_ + 0), (double)(p_147788_4_ + 1), (double)iicon3.getMinU(), (double)iicon3.getMinV());
                tessellator.addVertexWithUV((double)p_147788_2_ + 0.015625D, (double)(p_147788_3_ + 0), (double)(p_147788_4_ + 0), (double)iicon3.getMinU(), (double)iicon3.getMaxV());
                tessellator.addVertexWithUV((double)p_147788_2_ + 0.015625D, (double)((float)(p_147788_3_ + 1) + 0.021875F), (double)(p_147788_4_ + 0), (double)iicon3.getMaxU(), (double)iicon3.getMaxV());
            }

            if (world.getBlock(p_147788_2_ + 1, p_147788_3_, p_147788_4_).isBlockNormalCube() && world.getBlock(p_147788_2_ + 1, p_147788_3_ + 1, p_147788_4_) == EndPlus.blocks.endRedstone)
            {
                tessellator.setColorOpaque_F(f1, f2, f3);
                tessellator.addVertexWithUV((double)(p_147788_2_ + 1) - 0.015625D, (double)(p_147788_3_ + 0), (double)(p_147788_4_ + 1), (double)iicon1.getMinU(), (double)iicon1.getMaxV());
                tessellator.addVertexWithUV((double)(p_147788_2_ + 1) - 0.015625D, (double)((float)(p_147788_3_ + 1) + 0.021875F), (double)(p_147788_4_ + 1), (double)iicon1.getMaxU(), (double)iicon1.getMaxV());
                tessellator.addVertexWithUV((double)(p_147788_2_ + 1) - 0.015625D, (double)((float)(p_147788_3_ + 1) + 0.021875F), (double)(p_147788_4_ + 0), (double)iicon1.getMaxU(), (double)iicon1.getMinV());
                tessellator.addVertexWithUV((double)(p_147788_2_ + 1) - 0.015625D, (double)(p_147788_3_ + 0), (double)(p_147788_4_ + 0), (double)iicon1.getMinU(), (double)iicon1.getMinV());
                tessellator.setColorOpaque_F(1.0F, 1.0F, 1.0F);
                tessellator.addVertexWithUV((double)(p_147788_2_ + 1) - 0.015625D, (double)(p_147788_3_ + 0), (double)(p_147788_4_ + 1), (double)iicon3.getMinU(), (double)iicon3.getMaxV());
                tessellator.addVertexWithUV((double)(p_147788_2_ + 1) - 0.015625D, (double)((float)(p_147788_3_ + 1) + 0.021875F), (double)(p_147788_4_ + 1), (double)iicon3.getMaxU(), (double)iicon3.getMaxV());
                tessellator.addVertexWithUV((double)(p_147788_2_ + 1) - 0.015625D, (double)((float)(p_147788_3_ + 1) + 0.021875F), (double)(p_147788_4_ + 0), (double)iicon3.getMaxU(), (double)iicon3.getMinV());
                tessellator.addVertexWithUV((double)(p_147788_2_ + 1) - 0.015625D, (double)(p_147788_3_ + 0), (double)(p_147788_4_ + 0), (double)iicon3.getMinU(), (double)iicon3.getMinV());
            }

            if (world.getBlock(p_147788_2_, p_147788_3_, p_147788_4_ - 1).isBlockNormalCube() && world.getBlock(p_147788_2_, p_147788_3_ + 1, p_147788_4_ - 1) == EndPlus.blocks.endRedstone)
            {
                tessellator.setColorOpaque_F(f1, f2, f3);
                tessellator.addVertexWithUV((double)(p_147788_2_ + 1), (double)(p_147788_3_ + 0), (double)p_147788_4_ + 0.015625D, (double)iicon1.getMinU(), (double)iicon1.getMaxV());
                tessellator.addVertexWithUV((double)(p_147788_2_ + 1), (double)((float)(p_147788_3_ + 1) + 0.021875F), (double)p_147788_4_ + 0.015625D, (double)iicon1.getMaxU(), (double)iicon1.getMaxV());
                tessellator.addVertexWithUV((double)(p_147788_2_ + 0), (double)((float)(p_147788_3_ + 1) + 0.021875F), (double)p_147788_4_ + 0.015625D, (double)iicon1.getMaxU(), (double)iicon1.getMinV());
                tessellator.addVertexWithUV((double)(p_147788_2_ + 0), (double)(p_147788_3_ + 0), (double)p_147788_4_ + 0.015625D, (double)iicon1.getMinU(), (double)iicon1.getMinV());
                tessellator.setColorOpaque_F(1.0F, 1.0F, 1.0F);
                tessellator.addVertexWithUV((double)(p_147788_2_ + 1), (double)(p_147788_3_ + 0), (double)p_147788_4_ + 0.015625D, (double)iicon3.getMinU(), (double)iicon3.getMaxV());
                tessellator.addVertexWithUV((double)(p_147788_2_ + 1), (double)((float)(p_147788_3_ + 1) + 0.021875F), (double)p_147788_4_ + 0.015625D, (double)iicon3.getMaxU(), (double)iicon3.getMaxV());
                tessellator.addVertexWithUV((double)(p_147788_2_ + 0), (double)((float)(p_147788_3_ + 1) + 0.021875F), (double)p_147788_4_ + 0.015625D, (double)iicon3.getMaxU(), (double)iicon3.getMinV());
                tessellator.addVertexWithUV((double)(p_147788_2_ + 0), (double)(p_147788_3_ + 0), (double)p_147788_4_ + 0.015625D, (double)iicon3.getMinU(), (double)iicon3.getMinV());
            }

            if (world.getBlock(p_147788_2_, p_147788_3_, p_147788_4_ + 1).isBlockNormalCube() && world.getBlock(p_147788_2_, p_147788_3_ + 1, p_147788_4_ + 1) == EndPlus.blocks.endRedstone)
            {
                tessellator.setColorOpaque_F(f1, f2, f3);
                tessellator.addVertexWithUV((double)(p_147788_2_ + 1), (double)((float)(p_147788_3_ + 1) + 0.021875F), (double)(p_147788_4_ + 1) - 0.015625D, (double)iicon1.getMaxU(), (double)iicon1.getMinV());
                tessellator.addVertexWithUV((double)(p_147788_2_ + 1), (double)(p_147788_3_ + 0), (double)(p_147788_4_ + 1) - 0.015625D, (double)iicon1.getMinU(), (double)iicon1.getMinV());
                tessellator.addVertexWithUV((double)(p_147788_2_ + 0), (double)(p_147788_3_ + 0), (double)(p_147788_4_ + 1) - 0.015625D, (double)iicon1.getMinU(), (double)iicon1.getMaxV());
                tessellator.addVertexWithUV((double)(p_147788_2_ + 0), (double)((float)(p_147788_3_ + 1) + 0.021875F), (double)(p_147788_4_ + 1) - 0.015625D, (double)iicon1.getMaxU(), (double)iicon1.getMaxV());
                tessellator.setColorOpaque_F(1.0F, 1.0F, 1.0F);
                tessellator.addVertexWithUV((double)(p_147788_2_ + 1), (double)((float)(p_147788_3_ + 1) + 0.021875F), (double)(p_147788_4_ + 1) - 0.015625D, (double)iicon3.getMaxU(), (double)iicon3.getMinV());
                tessellator.addVertexWithUV((double)(p_147788_2_ + 1), (double)(p_147788_3_ + 0), (double)(p_147788_4_ + 1) - 0.015625D, (double)iicon3.getMinU(), (double)iicon3.getMinV());
                tessellator.addVertexWithUV((double)(p_147788_2_ + 0), (double)(p_147788_3_ + 0), (double)(p_147788_4_ + 1) - 0.015625D, (double)iicon3.getMinU(), (double)iicon3.getMaxV());
                tessellator.addVertexWithUV((double)(p_147788_2_ + 0), (double)((float)(p_147788_3_ + 1) + 0.021875F), (double)(p_147788_4_ + 1) - 0.015625D, (double)iicon3.getMaxU(), (double)iicon3.getMaxV());
            }
        }

        return true;
    }

    @Override
    public void renderInventoryBlock(Block block, int metadata, int modelId, RenderBlocks renderer)
    {
        FMLRenderAccessLibrary.renderInventoryBlock(renderer, block, metadata, modelId);
        
    }

    @Override
    public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer)
    {
        return this.renderBlockEnderRedstone(world, block, x, y, z);
    }

    @Override
    public boolean shouldRender3DInInventory(int modelId)
    {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int getRenderId()
    {
        // TODO Auto-generated method stub
        return 500;
    }
}
