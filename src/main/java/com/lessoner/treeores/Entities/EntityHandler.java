package com.lessoner.treeores.Entities;

import java.util.Random;

import com.lessoner.treeores.References;
import net.minecraft.entity.EntityList;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry.EntityRegistration;

public class EntityHandler {

	public static void registerMonsters(Class entityClass, String name, int entityId){
		EntityRegistry.registerModEntity(entityClass, name, entityId, References.INSTANCE, 64, 1, true);
		EntityList.stringToClassMapping.put(name, entityClass);
	}
}
