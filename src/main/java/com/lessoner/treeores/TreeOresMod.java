package com.lessoner.treeores;

import com.lessoner.treeores.Blocks.TreeOresBlocks;
import com.lessoner.treeores.Items.TreeOresItems;
import com.lessoner.treeores.Proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by anguarmas on 11.02.16.
 */
@Mod(modid = References.MODID, version = References.VERSION, name = References.NAME)
public class TreeOresMod {

    @SidedProxy(clientSide = References.clientProxy,serverSide = References.serverProxy)
    public static CommonProxy proxy;

    public static CreativeTabs treeOresTab;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        treeOresTab = new CreativeTabs("treeOresTab") {
            @Override
            public Item getTabIconItem() {
                return Item.getItemFromBlock(Blocks.sapling);
            }
        };
        TreeOresItems.init();
        TreeOresItems.register();
        TreeOresBlocks.init();
        TreeOresBlocks.register();
        proxy.preInit();
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
    proxy.init();
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
