package com.lessoner.treeores.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

/**
 * Created by anguarmas on 11.02.16.
 */
public class ItemTransformers extends Item {

    public ItemTransformers(){
        this.hasSubtypes = true;
        this.setMaxDamage(0);
    }

    public String getUnlocalizedName(ItemStack stack) {
        int i = stack.getMetadata();
        return super.getUnlocalizedName() + "_" + EnumTransformerType.byMetadata(i).getUnlocalizedName();
    }

    @SideOnly(Side.CLIENT)
    public void getSubItems(Item itemIn, CreativeTabs tab, List<ItemStack> subItems)
    {
        for (int i = 0; i < 3; ++i)
        {
            subItems.add(new ItemStack(itemIn, 1, i));
        }
    }
}

enum EnumTransformerType implements IStringSerializable {
    NORMAL(0, 2, "normal", "normal"),
    NETHER(1, 1, "nether", "nether"),
    REINFORCED(2, 0, "reinforced", "reinforced");

    private static final EnumTransformerType[] META_LOOKUP = new EnumTransformerType[values().length];
    private static final EnumTransformerType[] TRANSFORMER_DMG_LOOKUP = new EnumTransformerType[values().length];
    private final int meta;
    private final int transformerDamage;
    private final String name;
    private final String unlocalizedName;

    private EnumTransformerType(int meta, int transformerDamage, String name, String unlocalizedName) {
        this.meta = meta;
        this.transformerDamage = transformerDamage;
        this.name = name;
        this.unlocalizedName = unlocalizedName;
    }

    public int getMetadata() {
        return this.meta;
    }

    public int getTransformerDamage() {
        return this.transformerDamage;
    }

    public String getUnlocalizedName() {
        return this.unlocalizedName;
    }


    public static EnumTransformerType byTransformerDamage(int damage) {
        if (damage < 0 || damage >= TRANSFORMER_DMG_LOOKUP.length) {
            damage = 0;
        }

        return TRANSFORMER_DMG_LOOKUP[damage];
    }

    public static EnumTransformerType byMetadata(int meta) {
        if (meta < 0 || meta >= META_LOOKUP.length) {
            meta = 0;
        }

        return META_LOOKUP[meta];
    }

    public String toString() {
        return this.unlocalizedName;
    }

    public String getName() {
        return this.name;
    }

    static {
        for (EnumTransformerType enumTransformerType : values()) {
            META_LOOKUP[enumTransformerType.getMetadata()] = enumTransformerType;
            TRANSFORMER_DMG_LOOKUP[enumTransformerType.getTransformerDamage()] = enumTransformerType;
        }
    }
}