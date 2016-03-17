package com.lessoner.treeores.Entities;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityGlowstoneBossSpawner extends EntityThrowable {

	public EntityGlowstoneBossSpawner(World w) {
		super(w);
	}

	public EntityGlowstoneBossSpawner(World w, EntityLivingBase elv) {
		super(w, elv);
	}

	public EntityGlowstoneBossSpawner(World w, double x, double y, double z) {
		super(w, x, y, z);
	}

	/**
	 * Called when this EntityThrowable hits a block or entity.
	 */
	protected void onImpact(MovingObjectPosition p_70184_1_) {
		if (p_70184_1_.entityHit != null) {
			p_70184_1_.entityHit.attackEntityFrom(DamageSource.causeThrownDamage(this, this.getThrower()), 0.0F);
		}

		if (!this.worldObj.isRemote) {	
				EntityGlowstoneBoss entity = new EntityGlowstoneBoss(this.worldObj);
				entity.setLocationAndAngles(this.posX, this.posY, this.posZ, this.rotationYaw, 0.0F);
				this.worldObj.spawnEntityInWorld(entity);
		}

		for (int j = 0; j < 8; ++j) {
			this.worldObj.spawnParticle(EnumParticleTypes.SNOWBALL, this.posX, this.posY, this.posZ, 0, 0, 0, 0);
			// this.worldObj.spawnParticle("snowballpoof", this.posX, this.posY,
			// this.posZ, 0.0D, 0.0D, 0.0D);
		}

		if (!this.worldObj.isRemote) {
			this.setDead();
		}
	}
}