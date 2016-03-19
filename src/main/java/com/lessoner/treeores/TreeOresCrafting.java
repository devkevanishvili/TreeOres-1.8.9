package com.lessoner.treeores;

import com.lessoner.treeores.Blocks.TreeOresBlocks;
import com.lessoner.treeores.Items.TreeOresItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

/**
 * Created by basi0 on 3/19/2016.
 */
public class TreeOresCrafting {
    public static void addRecipesToGame() {
        addLog1Recipes();
        addLog2Recipes();
        addLog3Recipes();
        addTransformerRecipes();
        addSaplingRecipes();
        addChopRecipes();
        addSpawnerMakerRecipes();
        addSpawnerRecipes();

    }

    private static void addLog1Recipes() {
        // Shapeless
        // Iron
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 1), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 2), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0),
                new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 3), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0),
                new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 4), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0),
                new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 5), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0),
                new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 6), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0),
                new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0),
                new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 7), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0),
                new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0),
                new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.iron_ingot, 8), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0),
                new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0),
                new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        // Gold
        GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 1), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 2), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1),
                new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 3), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1),
                new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 4), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1),
                new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 5), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1),
                new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 6), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1),
                new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1),
                new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 7), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1),
                new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1),
                new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.gold_ingot, 8), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1),
                new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1),
                new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        // Coal
        GameRegistry.addShapelessRecipe(new ItemStack(Items.coal, 1), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.coal, 2), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2),
                new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.coal, 3), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2),
                new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.coal, 4), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2),
                new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.coal, 5), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2),
                new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.coal, 6), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2),
                new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2),
                new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.coal, 7), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2),
                new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2),
                new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.coal, 8), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2),
                new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2),
                new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        // Redstone
        GameRegistry.addShapelessRecipe(new ItemStack(Items.redstone, 1), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.redstone, 2), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3),
                new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.redstone, 3), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3),
                new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.redstone, 4), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3),
                new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.redstone, 5), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3),
                new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.redstone, 6), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3),
                new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3),
                new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.redstone, 7), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3),
                new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3),
                new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.redstone, 8), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3),
                new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3),
                new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new ItemStack(TreeOresItems.Transformers , 1, 0) });
    }

    private static void addLog2Recipes() {
        // Shapeless
        // Emerald
        GameRegistry.addShapelessRecipe(new ItemStack(Items.emerald, 1), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.emerald, 2), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1),
                new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.emerald, 3), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1),
                new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.emerald, 4), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1),
                new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.emerald, 5), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1),
                new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.emerald, 6), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1),
                new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1),
                new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.emerald, 7), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1),
                new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1),
                new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.emerald, 8), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1),
                new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1),
                new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        // Diamond
        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 1), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 2), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0),
                new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 3), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0),
                new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 4), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0),
                new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 5), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0),
                new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 6), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0),
                new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0),
                new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 7), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0),
                new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0),
                new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.diamond, 8), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0),
                new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0),
                new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        // Lapis
        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 1, 4), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 4), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2),
                new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 3, 4), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2),
                new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 4, 4), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2),
                new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 5, 4), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2),
                new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 6, 4), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2),
                new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2),
                new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 7, 4), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2),
                new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2),
                new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 8, 4), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2),
                new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2),
                new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        // Obsidian
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.obsidian, 1), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresItems.Transformers , 1, 2) });
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.obsidian, 2), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3),
                new ItemStack(TreeOresItems.Transformers , 1, 2) });
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.obsidian, 3), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3),
                new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresItems.Transformers , 1, 2) });
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.obsidian, 4), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3),
                new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresItems.Transformers , 1, 2) });
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.obsidian, 5), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3),
                new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresItems.Transformers , 1, 2) });
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.obsidian, 6), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3),
                new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3),
                new ItemStack(TreeOresItems.Transformers , 1, 2) });
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.obsidian, 7), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3),
                new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3),
                new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresItems.Transformers , 1, 2) });
        GameRegistry.addShapelessRecipe(new ItemStack(Blocks.obsidian, 8), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3),
                new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3),
                new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new ItemStack(TreeOresItems.Transformers , 1, 2) });
    }

    private static void addLog3Recipes() {

        // Xp
        GameRegistry.addShapelessRecipe(new ItemStack(Items.experience_bottle, 1), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.experience_bottle, 2), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2),
                new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.experience_bottle, 3), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2),
                new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.experience_bottle, 4), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2),
                new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.experience_bottle, 5), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2),
                new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.experience_bottle, 6), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2),
                new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2),
                new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.experience_bottle, 7), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2),
                new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2),
                new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.experience_bottle, 8), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2),
                new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2),
                new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new ItemStack(TreeOresItems.Transformers , 1, 0) });
        // Glowstone
        GameRegistry.addShapelessRecipe(new ItemStack(Items.glowstone_dust, 1), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresItems.Transformers , 1, 1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.glowstone_dust, 1), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0),
                new ItemStack(TreeOresItems.Transformers , 1, 1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.glowstone_dust, 3), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0),
                new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresItems.Transformers , 1, 1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.glowstone_dust, 4), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0),
                new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresItems.Transformers , 1, 1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.glowstone_dust, 5), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0),
                new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresItems.Transformers , 1, 1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.glowstone_dust, 6), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0),
                new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0),
                new ItemStack(TreeOresItems.Transformers , 1, 1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.glowstone_dust, 7), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0),
                new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0),
                new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresItems.Transformers , 1, 1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.glowstone_dust, 8), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0),
                new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0),
                new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new ItemStack(TreeOresItems.Transformers , 1, 1) });
        // Quartz
        GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 1), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresItems.Transformers , 1, 1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 2), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1),
                new ItemStack(TreeOresItems.Transformers , 1, 1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 3), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1),
                new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresItems.Transformers , 1, 1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 4), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1),
                new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresItems.Transformers , 1, 1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 5), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1),
                new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresItems.Transformers , 1, 1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 6), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1),
                new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1),
                new ItemStack(TreeOresItems.Transformers , 1, 1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 7), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1),
                new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1),
                new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresItems.Transformers , 1, 1) });
        GameRegistry.addShapelessRecipe(new ItemStack(Items.quartz, 8), new Object[] { new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1),
                new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1),
                new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new ItemStack(TreeOresItems.Transformers , 1, 1) });

    }

    private static void addTransformerRecipes() {
        GameRegistry.addShapelessRecipe(new ItemStack(TreeOresItems.Transformers , 1, 0), new Object[] { new ItemStack(Items.iron_ingot), new ItemStack(Items.gold_ingot), new ItemStack(Items.coal),
                new ItemStack(Items.redstone), new ItemStack(Items.emerald), new ItemStack(Items.diamond), new ItemStack(Items.dye, 1, 4), new ItemStack(Items.iron_sword),
                new ItemStack(Items.slime_ball) });
        GameRegistry.addShapelessRecipe(new ItemStack(TreeOresItems.Transformers , 1, 1), new Object[] { new ItemStack(Items.glowstone_dust), new ItemStack(Items.quartz),
                new ItemStack(TreeOresItems.Transformers , 1, 0) });
        GameRegistry.addShapelessRecipe(new ItemStack(TreeOresItems.Transformers , 1, 2), new Object[] { new ItemStack(Items.diamond), new ItemStack(Items.diamond),
                new ItemStack(Items.diamond), new ItemStack(Items.diamond), new ItemStack(Items.iron_ingot), new ItemStack(Items.iron_ingot), new ItemStack(Items.iron_ingot),
                new ItemStack(Items.iron_ingot), new ItemStack(TreeOresItems.Transformers , 1, 0) });
    }

    private static void addSaplingRecipes() {
        if (References.EnableIronTreeCrafting) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresBlocks.TreeOresSaplings1, 1, 0), new Object[] { "XXX", "XSX", "XXX", 'X', Blocks.iron_block, 'S', "treeSapling" }));
        }
        if (References.EnableGoldTreeCrafting) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresBlocks.TreeOresSaplings1, 1, 1), new Object[] { "XXX", "XSX", "XXX", 'X', Blocks.gold_block, 'S', "treeSapling" }));
        }
        if (References.EnableCoalTreeCrafting) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresBlocks.TreeOresSaplings1, 1, 2), new Object[] { "XXX", "XSX", "XXX", 'X', Blocks.coal_block, 'S', "treeSapling" }));
        }
        if (References.EnableRedstoneTreeCrafting) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresBlocks.TreeOresSaplings1, 1, 3), new Object[] { "XXX", "XSX", "XXX", 'X', Blocks.redstone_block, 'S', "treeSapling" }));
        }
        if (References.EnableEmeraldTreeCrafting) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresBlocks.TreeOresSaplings2, 1, 1), new Object[] { "XXX", "XSX", "XXX", 'X', Blocks.emerald_block, 'S', "treeSapling" }));
        }
        if (References.EnableDiamondTreeCrafting) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresBlocks.TreeOresSaplings2, 1, 0), new Object[] { "XXX", "XSX", "XXX", 'X', Blocks.diamond_block, 'S', "treeSapling" }));
        }
        if (References.EnableLapisTreeCrafting) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresBlocks.TreeOresSaplings2, 1, 2), new Object[] { "XXX", "XSX", "XXX", 'X', Blocks.lapis_block, 'S', "treeSapling" }));
        }
        if (References.EnableObsidianTreeCrafting) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresBlocks.TreeOresSaplings2, 1, 3), new Object[] { "XXX", "XSX", "XXX", 'X', Blocks.obsidian, 'S', "treeSapling" }));
        }
        if (References.EnableGlowstoneTreeCrafting) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresBlocks.TreeOresSaplings3, 1, 0), new Object[] { "XXX", "XSX", "XXX", 'X', Blocks.glowstone, 'S', "treeSapling" }));
        }
        if (References.EnableQuartzTreeCrafting) {
            GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(TreeOresBlocks.TreeOresSaplings3, 1, 1), new Object[] { "XXX", "XSX", "XXX", 'X', Blocks.quartz_block, 'S', "treeSapling" }));
        }
        if (References.EnableXpTreeCrafting) {
            GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(TreeOresBlocks.TreeOresSaplings3, 1, 2), new Object[] { new ItemStack(Items.string), new ItemStack(Items.spider_eye),
                    new ItemStack(Items.rotten_flesh), new ItemStack(Items.gunpowder), new ItemStack(Items.bone), new ItemStack(Items.diamond_sword), new ItemStack(Items.bow),
                    new ItemStack(Items.arrow), "treeSapling" }));
        }
    }

    private static void addSpawnerMakerRecipes() {
        GameRegistry.addShapelessRecipe(new ItemStack(TreeOresItems.BossSpawnerParts, 1, 1), new Object[] { new ItemStack(TreeOresItems.BossSpawnerParts, 1, 0), new ItemStack(TreeOresItems.BossSpawnerParts, 1, 0),
                new ItemStack(TreeOresItems.BossSpawnerParts, 1, 0), new ItemStack(TreeOresItems.BossSpawnerParts, 1, 0) });
    }

    private static void addSpawnerRecipes() {

        GameRegistry.addRecipe(new ItemStack(TreeOresItems.BossSpawners1, 1, 0), new Object[] { "XXX", "XSX", "XXX", 'X', new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), 'S',
                TreeOresItems.BossSpawnerParts, 1, 1 });

        GameRegistry.addRecipe(new ItemStack(TreeOresItems.BossSpawners1, 1, 1), new Object[] { "XXX", "XSX", "XXX", 'X', new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), 'S',
                TreeOresItems.BossSpawnerParts, 1, 1 });

        GameRegistry.addRecipe(new ItemStack(TreeOresItems.BossSpawners1, 1, 2), new Object[] { "XXX", "XSX", "XXX", 'X', new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), 'S',
                TreeOresItems.BossSpawnerParts, 1, 1});

        GameRegistry.addRecipe(new ItemStack(TreeOresItems.BossSpawners1, 1, 3), new Object[] { "XXX", "XSX", "XXX", 'X', new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), 'S',
                TreeOresItems.BossSpawnerParts, 1, 1 });

        GameRegistry.addRecipe(new ItemStack(TreeOresItems.BossSpawners2, 1, 1), new Object[] { "XXX", "XSX", "XXX", 'X', new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), 'S',
                TreeOresItems.BossSpawnerParts, 1, 1 });

        GameRegistry.addRecipe(new ItemStack(TreeOresItems.BossSpawners2, 1, 0), new Object[] { "XXX", "XSX", "XXX", 'X', new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), 'S',
                TreeOresItems.BossSpawnerParts, 1, 1 });

        GameRegistry.addRecipe(new ItemStack(TreeOresItems.BossSpawners2, 1, 2), new Object[] { "XXX", "XSX", "XXX", 'X', new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), 'S',
                TreeOresItems.BossSpawnerParts, 1, 1 });

        GameRegistry.addRecipe(new ItemStack(TreeOresItems.BossSpawners2, 1, 3), new Object[] { "XXX", "XSX", "XXX", 'X', new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), 'S',
                TreeOresItems.BossSpawnerParts, 1, 1 });

        GameRegistry.addRecipe(new ItemStack(TreeOresItems.BossSpawners3, 1, 2), new Object[] { "XXX", "XSX", "XXX", 'X', new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), 'S',
                TreeOresItems.BossSpawnerParts, 1, 1 });

        GameRegistry.addRecipe(new ItemStack(TreeOresItems.BossSpawners3, 1, 0), new Object[] { "XXX", "XSX", "XXX", 'X', new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), 'S',
                TreeOresItems.BossSpawnerParts, 1, 1 });

        GameRegistry.addRecipe(new ItemStack(TreeOresItems.BossSpawners3, 1, 1), new Object[] { "XXX", "XSX", "XXX", 'X', new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), 'S',
                TreeOresItems.BossSpawnerParts, 1, 1 });

    }

    private static void addChopRecipes() {
        GameRegistry.addRecipe(new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 0), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(TreeOresItems.TreeChops1, 1, 0) });

        GameRegistry.addRecipe(new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 1), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(TreeOresItems.TreeChops1, 1, 1) });

        GameRegistry.addRecipe(new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 2), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(TreeOresItems.TreeChops1, 1, 2) });

        GameRegistry.addRecipe(new ItemStack(TreeOresBlocks.TreeOresLogs1, 1, 3), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(TreeOresItems.TreeChops1, 1, 3) });

        GameRegistry.addRecipe(new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 1), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(TreeOresItems.TreeChops2, 1, 1) });

        GameRegistry.addRecipe(new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 0), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(TreeOresItems.TreeChops2, 1, 0) });

        GameRegistry.addRecipe(new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 2), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(TreeOresItems.TreeChops2, 1, 2) });

        GameRegistry.addRecipe(new ItemStack(TreeOresBlocks.TreeOresLogs2, 1, 3), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(TreeOresItems.TreeChops2, 1, 3) });

        GameRegistry.addRecipe(new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 2), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(TreeOresItems.TreeChops3, 1, 2) });

        GameRegistry.addRecipe(new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 0), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(TreeOresItems.TreeChops3, 1, 0) });

        GameRegistry.addRecipe(new ItemStack(TreeOresBlocks.TreeOresLogs3, 1, 1), new Object[] { "XXX", "XXX", "XXX", 'X', new ItemStack(TreeOresItems.TreeChops3, 1, 1) });
    }
}

