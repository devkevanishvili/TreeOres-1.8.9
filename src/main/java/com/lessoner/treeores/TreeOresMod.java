package com.lessoner.treeores;

import com.lessoner.treeores.Blocks.TreeOresBlocks;
import com.lessoner.treeores.Handlers.DropHandler;
import com.lessoner.treeores.Handlers.UpdateHandler;
import com.lessoner.treeores.Items.TreeOresItems;
import com.lessoner.treeores.Proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.oredict.OreDictionary;

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
        Configuration config = new Configuration(event.getSuggestedConfigurationFile());
        config.load();

        References.EnableIronTreeCrafting = config.getBoolean("EnableIronTreeCrafting", "Trees", true, "Do you want to enable iron sapling crafting recipe?"); // done
        References.EnableGoldTreeCrafting = config.getBoolean("EnableGoldTreeCrafting", "Trees", true, "Do you want to enable gold sapling crafting recipe?"); // done
        References.EnableCoalTreeCrafting = config.getBoolean("EnableCoalTreeCrafting", "Trees", true, "Do you want to enable coal sapling crafting recipe?"); // done
        References.EnableRedstoneTreeCrafting = config.getBoolean("EnableRedstoneTreeCrafting", "Trees", true, "Do you want to enable redstone sapling crafting recipe?"); // done
        References.EnableEmeraldTreeCrafting = config.getBoolean("EnableEmeraldTreeCrafting", "Trees", true, "Do you want to enable emerald sapling crafting recipe?"); // done
        References.EnableDiamondTreeCrafting = config.getBoolean("EnableDiamondTreeCrafting", "Trees", true, "Do you want to enable diamond sapling crafting recipe?"); // done
        References.EnableLapisTreeCrafting = config.getBoolean("EnableLapisTreeCrafting", "Trees", true, "Do you want to enable lapis crafting recipe?"); // done
        References.EnableObsidianTreeCrafting = config.getBoolean("EnableObsidianTreeCrafting", "Trees", true, "Do you want to enable obsidian sapling crafting recipe?"); // done
        References.EnableGlowstoneTreeCrafting = config.getBoolean("EnableGlowstoneTreeCrafting", "Trees", true, "Do you want to enable glowstone sapling crafting recipe?"); // done
        References.EnableQuartzTreeCrafting = config.getBoolean("EnableQuartzTreeCrafting", "Trees", true, "Do you want to enable quartz sapling crafting recipe?"); // done
        References.EnableXpTreeCrafting = config.getBoolean("EnableXpTreeCrafting", "Trees", true, "Do you want to enable xp sapling crafting recipe?"); // done
        References.EnableChops = config.getBoolean("EnableChops", "Trees", true, "Do you want to enable chops?"); // done
        References.EnableBonemeal = config.getBoolean("EnableBonemeal", "Trees", true, "Do you want to enable bonemeal?"); // done
        References.EnableBonemealBossTrees = config.getBoolean("EnableBonemealBossTrees", "Trees", true, "Do you want to enable bonemeal on boss trees?"); // done
        References.OreDictLeaves = config.getString("OreDictLeaves", "Trees", "treeLeaves", "Ore Dictionary name for leaves"); // done
        References.OreDictLogs = config.getString("OreDictLogs", "Trees", "logWood", "Ore Dictionary name for logs"); // done
        References.OreDictSaplings = config.getString("OreDictSaplings", "Trees", "treeSapling", "Ore Dictionary name for saplings"); // done
        References.oreDictChops = config.getString("OreDictChops", "Trees", "treeChop", "Ore Dictionary name for chops"); // done

        config.save();
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
        OreDict();
        TreeOresCrafting.addRecipesToGame();
    }

    private static void OreDict() {
        for (int i = 0; i < 4; i++) {
            OreDictionary.registerOre(References.OreDictLeaves, new ItemStack(TreeOresBlocks.TreeOresLeaves1, 1, i));
            OreDictionary.registerOre(References.OreDictLeaves, new ItemStack(TreeOresBlocks.TreeOresLeaves2, 1, i));
            OreDictionary.registerOre(References.OreDictLeaves, new ItemStack(TreeOresBlocks.TreeOresBossLeaves1, 1, i));
            OreDictionary.registerOre(References.OreDictLeaves, new ItemStack(TreeOresBlocks.TreeOresBossLeaves2, 1, i));
            OreDictionary.registerOre(References.OreDictLogs, new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, i));
            OreDictionary.registerOre(References.OreDictLogs, new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, i));
            OreDictionary.registerOre(References.OreDictSaplings, new ItemStack(TreeOresBlocks.TreeOresSaplings1, 1, i));
            OreDictionary.registerOre(References.OreDictSaplings, new ItemStack(TreeOresBlocks.TreeOresSaplings2, 1, i));
            OreDictionary.registerOre(References.OreDictSaplings, new ItemStack(TreeOresBlocks.TreeOresBossSaplings1, 1, i));
            OreDictionary.registerOre(References.OreDictSaplings, new ItemStack(TreeOresBlocks.TreeOresBossSaplings2, 1, i));
            OreDictionary.registerOre(References.oreDictChops, new ItemStack(TreeOresItems.TreeChops1, 1, i));
            OreDictionary.registerOre(References.oreDictChops, new ItemStack(TreeOresItems.TreeChops2, 1, i));
        }
        for (int i = 0; i < 3; i++) {
            OreDictionary.registerOre(References.OreDictLeaves, new ItemStack(TreeOresBlocks.TreeOresLeaves3, 1, i));
            OreDictionary.registerOre(References.OreDictLeaves, new ItemStack(TreeOresBlocks.TreeOresBossLeaves3, 1, i));
            OreDictionary.registerOre(References.OreDictLogs, new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, i));
            OreDictionary.registerOre(References.OreDictSaplings, new ItemStack(TreeOresBlocks.TreeOresSaplings3, 1, i));
            OreDictionary.registerOre(References.OreDictSaplings, new ItemStack(TreeOresBlocks.TreeOresBossSaplings3, 1, i));
            OreDictionary.registerOre(References.oreDictChops, new ItemStack(TreeOresItems.TreeChops3, 1, i));
        }
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
    proxy.init();
        MinecraftForge.EVENT_BUS.register(new DropHandler());
        FMLCommonHandler.instance().bus().register(new UpdateHandler());
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){

    }
}
