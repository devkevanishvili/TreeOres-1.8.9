package com.lessoner.treeores.Blocks;

import com.google.common.base.Predicate;
import com.lessoner.treeores.Items.TreeOresItems;
import com.lessoner.treeores.References;
import net.minecraft.block.BlockLog;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.awt.*;
import java.util.List;
import java.util.Random;

/**
 * Created by anguarmas on 15.02.16.
 */
public class TreeOresLogs2 extends BlockLog {
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", TreeOresLogs2.EnumType.class, new Predicate()
    {
        public boolean apply(TreeOresLogs2.EnumType type)
        {
            return type.getMetadata() < 4;
        }
        public boolean apply(Object p_apply_1_)
        {
            return this.apply((TreeOresLogs2.EnumType)p_apply_1_);
        }
    });

    public TreeOresLogs2(){
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, TreeOresLogs2.EnumType.DIAMOND).withProperty(LOG_AXIS, EnumAxis.Y));

    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list)
    {
        list.add(new ItemStack(itemIn, 1, TreeOresLogs2.EnumType.DIAMOND.getMetadata()));
        list.add(new ItemStack(itemIn, 1, TreeOresLogs2.EnumType.EMERALD.getMetadata()));
        list.add(new ItemStack(itemIn, 1, TreeOresLogs2.EnumType.LAPIS.getMetadata()));
        list.add(new ItemStack(itemIn, 1, TreeOresLogs2.EnumType.OBSIDIAN.getMetadata()));
    }

    /**
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta)
    {
        IBlockState iblockstate = this.getDefaultState().withProperty(VARIANT, TreeOresLogs2.EnumType.byMetadata((meta & 3) % 4));

        switch (meta & 12)
        {
            case 0:
                iblockstate = iblockstate.withProperty(LOG_AXIS, EnumAxis.Y);
                break;
            case 4:
                iblockstate = iblockstate.withProperty(LOG_AXIS, EnumAxis.X);
                break;
            case 8:
                iblockstate = iblockstate.withProperty(LOG_AXIS, EnumAxis.Z);
                break;
            default:
                iblockstate = iblockstate.withProperty(LOG_AXIS, EnumAxis.NONE);
        }

        return iblockstate;
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    @SuppressWarnings("incomplete-switch")
    public int getMetaFromState(IBlockState state)
    {
        int i = 0;
        i = i | ((TreeOresLogs2.EnumType)state.getValue(VARIANT)).getMetadata();

        switch ((EnumAxis)state.getValue(LOG_AXIS))
        {
            case X:
                i |= 4;
                break;
            case Z:
                i |= 8;
                break;
            case NONE:
                i |= 12;
        }

        return i;
    }

    protected BlockState createBlockState()
    {
        return new BlockState(this, new IProperty[] {VARIANT, LOG_AXIS});
    }

    protected ItemStack createStackedBlock(IBlockState state)
    {
        return new ItemStack(Item.getItemFromBlock(this), 1, ((TreeOresLogs2.EnumType)state.getValue(VARIANT)).getMetadata());
    }

    /**
     * Gets the metadata of the item this Block can drop. This method is called when the block gets destroyed. It
     * returns the metadata of the dropped item based on the old metadata of the block.
     */
    public int damageDropped(IBlockState state)
    {
        return ((TreeOresLogs2.EnumType)state.getValue(VARIANT)).getMetadata();
    }
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        if(References.EnableChops) {
            return TreeOresItems.TreeChops2;
        }else{
            return Item.getItemFromBlock(this);
        }
    }
    public static enum EnumType implements IStringSerializable
    {
        DIAMOND(0, "diamond", new Color(92,213,219)),
        EMERALD(1, "emerald", new Color(0,217,58)),
        LAPIS(2, "lapis", new Color(74,128,255)),
        OBSIDIAN(3, "obsidian", new Color(21,20,31));

        private static final TreeOresLogs2.EnumType[] META_LOOKUP = new TreeOresLogs2.EnumType[values().length];
        private final int meta;
        private final Color color;
        private final String name;
        private final String unlocalizedName;

        private EnumType(int meta, String name, Color color)
        {
            this(meta, name, name,color);
        }

        private EnumType(int meta, String name, String unlocalizedName, Color color)
        {
            this.meta = meta;
            this.name = name;
            this.unlocalizedName = unlocalizedName;
            this.color = color;
        }

        public int getMetadata()
        {
            return this.meta;
        }

        public String toString()
        {
            return this.name;
        }

        public static TreeOresLogs2.EnumType byMetadata(int meta)
        {
            if (meta < 0 || meta >= META_LOOKUP.length)
            {
                meta = 0;
            }

            return META_LOOKUP[meta];
        }

        public String getName()
        {
            return this.name;
        }
        public Color getColor(){ return this.color; }

        public String getUnlocalizedName()
        {
            return this.unlocalizedName;
        }

        static
        {
            for (TreeOresLogs2.EnumType TreeOresLogs2$enumtype : values())
            {
                META_LOOKUP[TreeOresLogs2$enumtype.getMetadata()] = TreeOresLogs2$enumtype;
            }
        }
    }

}
