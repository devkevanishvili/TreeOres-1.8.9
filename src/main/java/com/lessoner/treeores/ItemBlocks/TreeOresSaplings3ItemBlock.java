package com.lessoner.treeores.ItemBlocks;

import com.lessoner.treeores.Blocks.TreeOresLogs2;
import com.lessoner.treeores.Blocks.TreeOresLogs3;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

/**
 * Created by anguarmas on 15.02.16.
 */
public class TreeOresSaplings3ItemBlock extends ItemBlock{
    public TreeOresSaplings3ItemBlock(Block block) {
        super(block);
        setHasSubtypes(true);
    }

    public String getUnlocalizedName(ItemStack itemstack) {
        int i = itemstack.getItemDamage();
        if ((i < 0) || (i >= TreeOresLogs3.EnumType.values().length)) {
            i = 0;
        }
        return  TreeOresLogs3.EnumType.values()[i] + "_sapling";
    }

    public int getMetadata(int meta) {
        return meta;
    }
}
