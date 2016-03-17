package com.lessoner.treeores.Renderer;

import com.lessoner.treeores.Entities.EntityXpBoss;
import com.lessoner.treeores.Models.ModelBoss;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelWither;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.client.renderer.entity.layers.LayerWitherAura;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.util.ResourceLocation;

import com.lessoner.treeores.References;

public class RendererXpBoss extends RenderLiving {

	public static final ResourceLocation texture = new ResourceLocation(References.MODID + ":" + "textures/entity/xpboss.png");

	public RendererXpBoss(RenderManager p_i46130_1_, ModelBoss model, float shadow)
    {
        super(p_i46130_1_,model, 1.0F);
        this.addLayer(new LayerHeldItem(this));
    }

    public void func_180591_a(EntityXpBoss entity, double x, double y, double z, float u, float v)
    {
        BossStatus.setBossStatus(entity, true);
        super.doRender((EntityLiving)entity, x, y, z, u, v);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity>) and this method has signature public void func_76986_a(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doe
     *  
     * @param entityYaw The yaw rotation of the passed entity
     */
    public void doRender(EntityLiving entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        this.func_180591_a((EntityXpBoss)entity, x, y, z, entityYaw, partialTicks);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity>) and this method has signature public void func_76986_a(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doe
     *  
     * @param entityYaw The yaw rotation of the passed entity
     */
    public void doRender(EntityLivingBase entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        this.func_180591_a((EntityXpBoss)entity, x, y, z, entityYaw, partialTicks);
    }

	@Override
	protected ResourceLocation getEntityTexture(Entity entity) {
		// TODO Auto-generated method stub
		return texture;
	}

}
