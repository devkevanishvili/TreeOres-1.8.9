package com.lessoner.treeores.Blocks;

import com.lessoner.treeores.ItemBlocks.*;
import com.lessoner.treeores.References;
import com.lessoner.treeores.TreeOresMod;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import sun.reflect.generics.tree.Tree;

/**
 * Created by anguarmas on 11.02.16.
 */
public class TreeOresBlocks {

    public static Block TreeOresLogs1;
    public static Block TreeOresLogs2;
    public static Block TreeOresLogs3;

    public static Block TreeOresLeaves1;
    public static Block TreeOresLeaves2;
    public static Block TreeOresLeaves3;

    public static Block TreeOresSaplings1;
    public static Block TreeOresSaplings2;
    public static Block TreeOresSaplings3;
    
    public static Block TreeOresBossLeaves1;
    public static Block TreeOresBossLeaves2;
    public static Block TreeOresBossLeaves3;

    public static Block TreeOresBossSaplings1;
    public static Block TreeOresBossSaplings2;
    public static Block TreeOresBossSaplings3;

    public static void init() {
        TreeOresLogs1 = new TreeOresLogs1().setRegistryName("tlogs1").setUnlocalizedName("tlogs1").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresLogs2 = new TreeOresLogs2().setRegistryName("tlogs2").setUnlocalizedName("tlogs2").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresLogs3 = new TreeOresLogs3().setRegistryName("tlogs3").setUnlocalizedName("tlogs3").setCreativeTab(TreeOresMod.treeOresTab);

        TreeOresLeaves1 = new TreeOresLeaves1().setRegistryName("tleaves1").setUnlocalizedName("tleaves1").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresLeaves2 = new TreeOresLeaves2().setRegistryName("tleaves2").setUnlocalizedName("tleaves2").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresLeaves3 = new TreeOresLeaves3().setRegistryName("tleaves3").setUnlocalizedName("tleaves3").setCreativeTab(TreeOresMod.treeOresTab);

        TreeOresSaplings1 = new TreeOresSaplings1().setRegistryName("tsaplings1").setUnlocalizedName("tsaplings1").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresSaplings2 = new TreeOresSaplings2().setRegistryName("tsaplings2").setUnlocalizedName("tsaplings2").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresSaplings3 = new TreeOresSaplings3().setRegistryName("tsaplings3").setUnlocalizedName("tsaplings3").setCreativeTab(TreeOresMod.treeOresTab);
        
        TreeOresBossLeaves1 = new TreeOresBossLeaves1().setRegistryName("bleaves1").setUnlocalizedName("bleaves1").setCreativeTab(null);
        TreeOresBossLeaves2 = new TreeOresBossLeaves2().setRegistryName("bleaves2").setUnlocalizedName("bleaves2").setCreativeTab(null);
        TreeOresBossLeaves3 = new TreeOresBossLeaves3().setRegistryName("bleaves3").setUnlocalizedName("bleaves3").setCreativeTab(null);

        TreeOresBossSaplings1 = new TreeOresBossSaplings1().setRegistryName("bsaplings1").setUnlocalizedName("bsaplings1").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresBossSaplings2 = new TreeOresBossSaplings2().setRegistryName("bsaplings2").setUnlocalizedName("bsaplings2").setCreativeTab(TreeOresMod.treeOresTab);
        TreeOresBossSaplings3 = new TreeOresBossSaplings3().setRegistryName("bsaplings3").setUnlocalizedName("bsaplings3").setCreativeTab(TreeOresMod.treeOresTab);
    }

    public static void register() {
        GameRegistry.registerBlock(TreeOresLogs1,TreeOresLogs1ItemBlock.class,TreeOresLogs1.getRegistryName());
        GameRegistry.registerBlock(TreeOresLogs2,TreeOresLogs2ItemBlock.class,TreeOresLogs2.getRegistryName());
        GameRegistry.registerBlock(TreeOresLogs3,TreeOresLogs3ItemBlock.class,TreeOresLogs3.getRegistryName());

        GameRegistry.registerBlock(TreeOresLeaves1,TreeOresLeaves1ItemBlock.class,TreeOresLeaves1.getRegistryName());
        GameRegistry.registerBlock(TreeOresLeaves2,TreeOresLeaves2ItemBlock.class,TreeOresLeaves2.getRegistryName());
        GameRegistry.registerBlock(TreeOresLeaves3,TreeOresLeaves3ItemBlock.class,TreeOresLeaves3.getRegistryName());

        GameRegistry.registerBlock(TreeOresSaplings1,TreeOresSaplings1ItemBlock.class,TreeOresSaplings1.getRegistryName());
        GameRegistry.registerBlock(TreeOresSaplings2,TreeOresSaplings2ItemBlock.class,TreeOresSaplings2.getRegistryName());
        GameRegistry.registerBlock(TreeOresSaplings3,TreeOresSaplings3ItemBlock.class,TreeOresSaplings3.getRegistryName());
        
        GameRegistry.registerBlock(TreeOresBossLeaves1,TreeOresBossLeaves1ItemBlock.class,TreeOresBossLeaves1.getRegistryName());
        GameRegistry.registerBlock(TreeOresBossLeaves2,TreeOresBossLeaves2ItemBlock.class,TreeOresBossLeaves2.getRegistryName());
        GameRegistry.registerBlock(TreeOresBossLeaves3,TreeOresBossLeaves3ItemBlock.class,TreeOresBossLeaves3.getRegistryName());

        GameRegistry.registerBlock(TreeOresBossSaplings1,TreeOresBossSaplings1ItemBlock.class,TreeOresBossSaplings1.getRegistryName());
        GameRegistry.registerBlock(TreeOresBossSaplings2,TreeOresBossSaplings2ItemBlock.class,TreeOresBossSaplings2.getRegistryName());
        GameRegistry.registerBlock(TreeOresBossSaplings3,TreeOresBossSaplings3ItemBlock.class,TreeOresBossSaplings3.getRegistryName());

    }

    public static void registerRenders() {
        registerRenderers(TreeOresLogs1, 4);
        registerRenderers(TreeOresLogs2, 4);
        registerRenderers(TreeOresLogs3, 3);

        registerRenderers(TreeOresLeaves1, 4);
        registerRenderers(TreeOresLeaves2, 4);
        registerRenderers(TreeOresLeaves3, 3);

        registerRenderers(TreeOresSaplings1, 4);
        registerRenderers(TreeOresSaplings2, 4);
        registerRenderers(TreeOresSaplings3, 3);
        
        registerRenderers(TreeOresBossLeaves1, 4);
        registerRenderers(TreeOresBossLeaves2, 4);
        registerRenderers(TreeOresBossLeaves3, 3);

        registerRenderers(TreeOresBossSaplings1, 4);
        registerRenderers(TreeOresBossSaplings2, 4);
        registerRenderers(TreeOresBossSaplings3, 3);
    }

    public static void registerVariants() {
        registerVariant(TreeOresLogs1,4);
        registerVariant(TreeOresLogs2,4);
        registerVariant(TreeOresLogs3,3);

        registerVariant(TreeOresLeaves1,4);
        registerVariant(TreeOresLeaves2,4);
        registerVariant(TreeOresLeaves3,3);

        registerVariant(TreeOresSaplings1,4);
        registerVariant(TreeOresSaplings2,4);
        registerVariant(TreeOresSaplings3,3);
        
        registerVariant(TreeOresBossLeaves1,4);
        registerVariant(TreeOresBossLeaves2,4);
        registerVariant(TreeOresBossLeaves3,3);

        registerVariant(TreeOresBossSaplings1,4);
        registerVariant(TreeOresBossSaplings2,4);
        registerVariant(TreeOresBossSaplings3,3);
    }

    public static void registerRenderers(Block block) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(References.MODID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
    }

    public static void registerRenderers(Block block, int meta) {
        for (int i = 0; i < meta; i++) {
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), i, new ModelResourceLocation(References.MODID + ":" + Item.getItemFromBlock(block).getUnlocalizedName(new ItemStack(Item.getItemFromBlock(block),1,i)), "inventory"));
        }
    }

    public static void registerVariant(Block block, int meta) {
        for (int i = 0; i < meta; i++) {
            ModelBakery.registerItemVariants(Item.getItemFromBlock(block), new ResourceLocation(References.MODID + ":" + Item.getItemFromBlock(block).getUnlocalizedName(new ItemStack(Item.getItemFromBlock(block),1,i))));
        }
    }
}
