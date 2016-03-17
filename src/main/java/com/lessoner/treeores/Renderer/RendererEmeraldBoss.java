package com.lessoner.treeores.Renderer;

import com.lessoner.treeores.Entities.EntityEmeraldBoss;
import com.lessoner.treeores.Models.ModelBoss;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.util.ResourceLocation;

import com.lessoner.treeores.References;

public class RendererEmeraldBoss extends RenderBiped {

	public static final ResourceLocation texture = new ResourceLocation(References.MODID + ":" + "textures/entity/emeraldboss.png");

	protected ModelBoss modelEntity;

	private Object ModelBipedMobRightarm;

	public RendererEmeraldBoss(RenderManager renderManager, ModelBiped mb, float f) {
		super(renderManager, mb, f, 1.0f);
		this.addLayer(new LayerHeldItem(this));
		modelEntity = ((ModelBoss) mainModel);
	}

	public void renderBoss(EntityEmeraldBoss entity, double x, double y, double z, float u, float v) {
		BossStatus.setBossStatus(entity, true);
		super.doRender(entity, x, y, z, u, v);
	}

	public void doRenderLiving(EntityLiving entityl, double x, double y, double z, float u, float v) {
		renderBoss((EntityEmeraldBoss) entityl, x, y, z, u, v);

	}

	public void doRender(Entity entity, double x, double y, double z, float u, float v) {

		renderBoss((EntityEmeraldBoss) entity, x, y, z, u, v);

	}

	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
		return texture;
	}

}
