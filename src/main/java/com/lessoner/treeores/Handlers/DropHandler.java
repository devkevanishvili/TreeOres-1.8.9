package com.lessoner.treeores.Handlers;

import java.util.Random;

import com.lessoner.treeores.Items.TreeOresItems;

import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DropHandler {
	public static Random random;
	public static int dropped;

	@SubscribeEvent
	public void onEntityDrop(LivingDropsEvent event) {
		random = new Random();
		dropped = random.nextInt(2) + 1; // DO NOT CHANGE THIS

		if (event.entityLiving instanceof EntityWither) {
			event.entityLiving.entityDropItem(new ItemStack(TreeOresItems.BossSpawnerParts,1,0), dropped);
		}

	}
}
