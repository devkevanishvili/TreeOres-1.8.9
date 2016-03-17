package com.lessoner.treeores.Entities;

import java.util.Calendar;
import java.util.Random;
import java.util.UUID;


import com.lessoner.treeores.Blocks.TreeOresBlocks;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveThroughVillage;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.entity.boss.IBossDisplayData;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.minecraft.world.WorldProviderHell;

public class EntityDiamondBoss extends EntityMob implements IBossDisplayData {

	private static final UUID babySpeedBoostUUID = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
	private static final AttributeModifier babySpeedBoostModifier = new AttributeModifier(babySpeedBoostUUID, "Baby speed boost", 0.5D, 1);

	public EntityDiamondBoss(World w) {
		super(w);
		((PathNavigateGround) this.getNavigator()).setBreakDoors(false);
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
		this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 1.0D));
		this.tasks.addTask(7, new EntityAIWander(this, 1.0D));
		this.tasks.addTask(8, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
		this.tasks.addTask(8, new EntityAILookIdle(this));
		this.setSize(0.6F, 1.95F);
		this.applyEntityAI();
		setCurrentItemOrArmor(0, new ItemStack(Items.diamond_axe));
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(40.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.23000000417232513D);
		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(20.0D);
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(300.0D);

		if (this.worldObj != null && !this.worldObj.isRemote) {
			IAttributeInstance iattributeinstance = this.getEntityAttribute(SharedMonsterAttributes.movementSpeed);
			iattributeinstance.applyModifier(babySpeedBoostModifier);
		}
	}

	protected void applyEntityAI() {
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
	}

	protected boolean isAIEnabled() {
		return true;
	}

	protected String getLivingSound() {
		return "step.grass";
	}

	protected String getHurtSound() {
		return "step.wood";
	}

	protected String getDeathSound() {
		return "dig.wood";
	}

	protected void dropFewItems(boolean par1, int par2) {

		this.entityDropItem(new ItemStack(TreeOresBlocks.TreeOresBossSaplings2, 1, 0), 1);

	}

	protected void func_180481_a(DifficultyInstance p_180481_1_) {
		this.setCurrentItemOrArmor(0, new ItemStack(Items.diamond_axe));
	}

	public boolean getCanSpawnHere() {
		if (this.worldObj.getDifficulty() != EnumDifficulty.PEACEFUL) {
			return true;
		}
		return false;
	}

	public double getYOffset() {
		return super.getYOffset();
	}

}
