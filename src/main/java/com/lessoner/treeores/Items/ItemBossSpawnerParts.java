package com.lessoner.treeores.Items;

import com.lessoner.treeores.Blocks.TreeOresLogs1;
import com.lessoner.treeores.Entities.EntityCoalBossSpawner;
import com.lessoner.treeores.Entities.EntityGoldBossSpawner;
import com.lessoner.treeores.Entities.EntityIronBossSpawner;
import com.lessoner.treeores.Entities.EntityRedstoneBossSpawner;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

/**
 * Created by basi0 on 3/17/2016.
 */
public class ItemBossSpawnerParts extends Item{
    public ItemBossSpawnerParts(){
        this.hasSubtypes = true;
        this.setMaxDamage(0);
    }

    public String getUnlocalizedName(ItemStack stack) {
        int i = stack.getMetadata();
        switch(i){
            case 0:
                return super.getUnlocalizedName() + "_broken";
            case 1:
                return super.getUnlocalizedName() + "_final";
            default:
                return super.getUnlocalizedName();
        }
    }

    @SideOnly(Side.CLIENT)
    public void getSubItems(Item itemIn, CreativeTabs tab, List<ItemStack> subItems)
    {
        for (int i = 0; i < 2; ++i)
        {
            subItems.add(new ItemStack(itemIn, 1, i));
        }
    }

}
