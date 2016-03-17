package com.lessoner.treeores.ItemBlocks;

import com.lessoner.treeores.Blocks.TreeOresLeaves1;
import com.lessoner.treeores.Blocks.TreeOresLogs1;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by anguarmas on 3/5/16.
 */
public class TreeOresLeaves1ItemBlock extends ItemBlock {
    private final TreeOresLeaves1 leaves;

    public TreeOresLeaves1ItemBlock(Block block) {
        super(block);
        this.leaves = (TreeOresLeaves1) block;
        setHasSubtypes(true);
    }

    public String getUnlocalizedName(ItemStack itemstack) {
        int i = itemstack.getItemDamage();
        if ((i < 0) || (i >= TreeOresLogs1.EnumType.values().length)) {
            i = 0;
        }
        return  TreeOresLogs1.EnumType.values()[i] + "_leaf";
    }

    public int getMetadata(int meta) {
        return meta;
    }
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack stack, int renderPass)
    {
        return this.leaves.getRenderColor(this.leaves.getStateFromMeta(stack.getMetadata()));
    }
}


