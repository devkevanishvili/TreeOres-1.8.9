package com.lessoner.treeores.Items;

import com.lessoner.treeores.References;
import com.lessoner.treeores.TreeOresMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by anguarmas on 11.02.16.
 */
public class TreeOresItems {

    public static Item Transformers;
    public static Item BossSpawners1;
    public static Item BossSpawners2;
    public static Item BossSpawners3;
    public static Item TreeChops1;
    public static Item TreeChops2;
    public static Item TreeChops3;

    public static void init(){
        Transformers = new ItemTransformers().setRegistryName(References.MODID,"transformers").setUnlocalizedName("transformers").setCreativeTab(TreeOresMod.treeOresTab);
        BossSpawners1 = new ItemBossSpawners1().setRegistryName(References.MODID,"bossspawners1").setUnlocalizedName("bossspawners1").setCreativeTab(TreeOresMod.treeOresTab);
        BossSpawners2 = new ItemBossSpawners2().setRegistryName(References.MODID,"bossspawners2").setUnlocalizedName("bossspawners2").setCreativeTab(TreeOresMod.treeOresTab);
        BossSpawners3 = new ItemBossSpawners3().setRegistryName(References.MODID,"bossspawners3").setUnlocalizedName("bossspawners3").setCreativeTab(TreeOresMod.treeOresTab);
        TreeChops1 = new ItemTreeChops1().setRegistryName(References.MODID,"treechops1").setUnlocalizedName("treechops1").setCreativeTab(TreeOresMod.treeOresTab);
        TreeChops2 = new ItemTreeChops2().setRegistryName(References.MODID,"treechops2").setUnlocalizedName("treechops2").setCreativeTab(TreeOresMod.treeOresTab);
        TreeChops3 = new ItemTreeChops3().setRegistryName(References.MODID,"treechops3").setUnlocalizedName("treechops3").setCreativeTab(TreeOresMod.treeOresTab);
    }

    public static void register(){
        GameRegistry.registerItem(Transformers,Transformers.getRegistryName());

        GameRegistry.registerItem(BossSpawners1,BossSpawners1.getRegistryName());
        GameRegistry.registerItem(BossSpawners2,BossSpawners2.getRegistryName());
        GameRegistry.registerItem(BossSpawners3,BossSpawners3.getRegistryName());

        GameRegistry.registerItem(TreeChops1,TreeChops1.getRegistryName());
        GameRegistry.registerItem(TreeChops2,TreeChops2.getRegistryName());
        GameRegistry.registerItem(TreeChops3,TreeChops3.getRegistryName());

    }

    public static void registerRenders(){
            registerRenderers(Transformers,3);

            registerRenderers(BossSpawners1,4);
            registerRenderers(BossSpawners2,4);
            registerRenderers(BossSpawners3,3);

            registerRenderers(TreeChops1,4);
            registerRenderers(TreeChops2,4);
            registerRenderers(TreeChops3,3);
    }
    public static void registerVariants(){
        registerVariant(Transformers,3);

        registerVariant(BossSpawners1,4);
        registerVariant(BossSpawners2,4);
        registerVariant(BossSpawners3,3);

        registerVariant(TreeChops1,4);
        registerVariant(TreeChops2,4);
        registerVariant(TreeChops3,3);
    }

    public static void registerRenderers(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(References.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
    public static void registerRenderers(Item item, int meta) {
        for(int i=0;i<meta; i++) {
            Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, i, new ModelResourceLocation(References.MODID + ":" + item.getUnlocalizedName(new ItemStack(item,1,i)).substring(5), "inventory"));
        }
    }
    public static void registerVariant(Item item,int meta){
        for(int i = 0 ; i < meta; i++){
            ModelBakery.registerItemVariants(item, new ResourceLocation(References.MODID + ":" + item.getUnlocalizedName(new ItemStack(item, 1, i)).substring(5)));
        }
    }
}

