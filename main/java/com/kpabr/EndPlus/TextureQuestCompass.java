package com.kpabr.EndPlus;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.util.ChunkCoordinates;
import net.minecraft.world.World;

public class TextureQuestCompass extends TextureAtlasSprite {

    /** Current compass heading in radians */
    public double currentAngle;
    /** Speed and direction of compass rotation */
    public double angleDelta;
    private static final String __OBFID = "CL_00001071";
    
	public TextureQuestCompass(String p_i1286_1_) {
		super(p_i1286_1_);
		// TODO Auto-generated constructor stub
	}

    public void updateAnimation()
    {
        Minecraft minecraft = Minecraft.getMinecraft();

        if (minecraft.theWorld != null && minecraft.thePlayer != null)
        {
            this.updateCompass(minecraft.theWorld, minecraft.thePlayer.posX, minecraft.thePlayer.posZ, (double)minecraft.thePlayer.rotationYaw, false, false);
        }
        else
        {
            this.updateCompass((World)null, 0.0D, 0.0D, 0.0D, true, false);
        }
    }
    
	public void updateCompass(World p_94241_1_, double p_94241_2_, double p_94241_4_, double p_94241_6_, boolean p_94241_8_, boolean p_94241_9_)
    {
        if (!this.framesTextureData.isEmpty())
        {
            double d3 = 0.0D;

            if (p_94241_1_ != null && !p_94241_8_)
            {
                ChunkCoordinates chunkcoordinates = new ChunkCoordinates(EndPlus.mobs.qdh.questX, EndPlus.mobs.qdh.questY, EndPlus.mobs.qdh.questZ);
                double d4 = (double)chunkcoordinates.posX - p_94241_2_;
                double d5 = (double)chunkcoordinates.posZ - p_94241_4_;
                p_94241_6_ %= 360.0D;
                d3 = -((p_94241_6_ - 90.0D) * Math.PI / 180.0D - Math.atan2(d5, d4));

                if (!p_94241_1_.provider.isSurfaceWorld())
                {
                    d3 = Math.random() * Math.PI * 2.0D;
                }
            }

            if (p_94241_9_)
            {
                this.currentAngle = d3;
            }
            else
            {
                double d6;

                for (d6 = d3 - this.currentAngle; d6 < -Math.PI; d6 += (Math.PI * 2D))
                {
                    ;
                }

                while (d6 >= Math.PI)
                {
                    d6 -= (Math.PI * 2D);
                }

                if (d6 < -1.0D)
                {
                    d6 = -1.0D;
                }

                if (d6 > 1.0D)
                {
                    d6 = 1.0D;
                }

                this.angleDelta += d6 * 0.1D;
                this.angleDelta *= 0.8D;
                this.currentAngle += this.angleDelta;
            }

            int i;

            for (i = (int)((this.currentAngle / (Math.PI * 2D) + 1.0D) * (double)this.framesTextureData.size()) % this.framesTextureData.size(); i < 0; i = (i + this.framesTextureData.size()) % this.framesTextureData.size())
            {
                ;
            }

            if (i != this.frameCounter)
            {
                this.frameCounter = i;
                TextureUtil.uploadTextureMipmap((int[][])this.framesTextureData.get(this.frameCounter), this.width, this.height, this.originX, this.originY, false, false);
            }
        }
    }
}
