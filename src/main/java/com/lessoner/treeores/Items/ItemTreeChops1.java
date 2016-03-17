package com.lessoner.treeores.Items;

import com.lessoner.treeores.Blocks.TreeOresLogs1;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

/**
 * Created by basi0 on 3/14/2016.
 */
public class ItemTreeChops1 extends Item{
    public ItemTreeChops1(){
        this.hasSubtypes = true;
        this.setMaxDamage(0);
    }

    public String getUnlocalizedName(ItemStack stack) {
        int i = stack.getMetadata();
        return super.getUnlocalizedName() + "_" + TreeOresLogs1.EnumType.byMetadata(i).getUnlocalizedName();
    }

    @SideOnly(Side.CLIENT)
    public void getSubItems(Item itemIn, CreativeTabs tab, List<ItemStack> subItems)
    {
        for (int i = 0; i < 4; ++i)
        {
            subItems.add(new ItemStack(itemIn, 1, i));
        }
    }
}
