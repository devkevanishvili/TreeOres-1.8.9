package com.lessoner.treeores.ItemBlocks;

import com.lessoner.treeores.Blocks.TreeOresLeaves2;
import com.lessoner.treeores.Blocks.TreeOresLeaves3;
import com.lessoner.treeores.Blocks.TreeOresLogs2;
import com.lessoner.treeores.Blocks.TreeOresLogs3;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by anguarmas on 3/5/16.
 */
public class TreeOresLeaves3ItemBlock extends ItemBlock {
    private final TreeOresLeaves3 leaves;

    public TreeOresLeaves3ItemBlock(Block block) {
        super(block);
        this.leaves = (TreeOresLeaves3) block;
        setHasSubtypes(true);
    }

    public String getUnlocalizedName(ItemStack itemstack) {
        int i = itemstack.getItemDamage();
        if ((i < 0) || (i >= TreeOresLogs3.EnumType.values().length)) {
            i = 0;
        }
        return  TreeOresLogs3.EnumType.values()[i] + "_leaf";
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


