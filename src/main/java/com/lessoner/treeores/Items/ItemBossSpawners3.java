package com.lessoner.treeores.Items;

import com.lessoner.treeores.Blocks.TreeOresLogs2;
import com.lessoner.treeores.Blocks.TreeOresLogs3;
import com.lessoner.treeores.Entities.*;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

/**
 * Created by basi0 on 3/14/2016.
 */
public class ItemBossSpawners3 extends Item{

    public ItemBossSpawners3(){
        this.hasSubtypes = true;
        this.setMaxDamage(0);
    }

    public String getUnlocalizedName(ItemStack stack) {
        int i = stack.getMetadata();
        return super.getUnlocalizedName() + "_" + TreeOresLogs3.EnumType.byMetadata(i).getUnlocalizedName();
    }

    @SideOnly(Side.CLIENT)
    public void getSubItems(Item itemIn, CreativeTabs tab, List<ItemStack> subItems)
    {
        for (int i = 0; i < 3; ++i)
        {
            subItems.add(new ItemStack(itemIn, 1, i));
        }
    }

    public ItemStack onItemRightClick(ItemStack ie, World w, EntityPlayer p) {
        if (!p.capabilities.isCreativeMode) {
            --ie.stackSize;
        }

        w.playSoundAtEntity(p, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

        if (!w.isRemote) {

            switch (ie.getMetadata()) {
                case 0:
                    w.spawnEntityInWorld(new EntityGlowstoneBossSpawner(w, p));
                    break;
                case 1:
                    w.spawnEntityInWorld(new EntityQuartzBossSpawner(w, p));
                    break;
                case 2:
                    w.spawnEntityInWorld(new EntityXpBossSpawner(w, p));
                    break;

            }

        }

        return ie;
    }
}
