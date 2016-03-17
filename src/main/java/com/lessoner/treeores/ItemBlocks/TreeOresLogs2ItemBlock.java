package com.lessoner.treeores.ItemBlocks;

import com.lessoner.treeores.Blocks.TreeOresLogs1;
import com.lessoner.treeores.Blocks.TreeOresLogs2;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * Created by anguarmas on 15.02.16.
 */
public class TreeOresLogs2ItemBlock extends ItemBlock{
    public TreeOresLogs2ItemBlock(Block block) {
        super(block);
        setHasSubtypes(true);
    }

    public String getUnlocalizedName(ItemStack itemstack) {
        int i = itemstack.getItemDamage();
        if ((i < 0) || (i >= TreeOresLogs2.EnumType.values().length)) {
            i = 0;
        }
        return  TreeOresLogs2.EnumType.values()[i] + "_log";
    }

    public int getMetadata(int meta) {
        return meta;
    }
}
