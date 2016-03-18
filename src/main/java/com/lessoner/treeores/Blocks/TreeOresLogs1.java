package com.lessoner.treeores.Blocks;

import com.google.common.base.Predicate;
import com.lessoner.treeores.Items.TreeOresItems;
import com.lessoner.treeores.References;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockOldLog;
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
public class TreeOresLogs1 extends BlockLog {
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", TreeOresLogs1.EnumType.class, new Predicate()
    {
        public boolean apply(TreeOresLogs1.EnumType type)
        {
            return type.getMetadata() < 4;
        }
        public boolean apply(Object p_apply_1_)
        {
            return this.apply((TreeOresLogs1.EnumType)p_apply_1_);
        }
    });

    public TreeOresLogs1(){
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, TreeOresLogs1.EnumType.IRON).withProperty(LOG_AXIS, TreeOresLogs1.EnumAxis.Y));

    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list)
    {
        list.add(new ItemStack(itemIn, 1, TreeOresLogs1.EnumType.IRON.getMetadata()));
        list.add(new ItemStack(itemIn, 1, TreeOresLogs1.EnumType.GOLD.getMetadata()));
        list.add(new ItemStack(itemIn, 1, TreeOresLogs1.EnumType.COAL.getMetadata()));
        list.add(new ItemStack(itemIn, 1, TreeOresLogs1.EnumType.REDSTONE.getMetadata()));
    }

    /**
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta)
    {
        IBlockState iblockstate = this.getDefaultState().withProperty(VARIANT, TreeOresLogs1.EnumType.byMetadata((meta & 3) % 4));

        switch (meta & 12)
        {
            case 0:
                iblockstate = iblockstate.withProperty(LOG_AXIS, TreeOresLogs1.EnumAxis.Y);
                break;
            case 4:
                iblockstate = iblockstate.withProperty(LOG_AXIS, TreeOresLogs1.EnumAxis.X);
                break;
            case 8:
                iblockstate = iblockstate.withProperty(LOG_AXIS, TreeOresLogs1.EnumAxis.Z);
                break;
            default:
                iblockstate = iblockstate.withProperty(LOG_AXIS, TreeOresLogs1.EnumAxis.NONE);
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
        i = i | ((TreeOresLogs1.EnumType)state.getValue(VARIANT)).getMetadata();

        switch ((TreeOresLogs1.EnumAxis)state.getValue(LOG_AXIS))
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
        return new ItemStack(Item.getItemFromBlock(this), 1, ((TreeOresLogs1.EnumType)state.getValue(VARIANT)).getMetadata());
    }

    /**
     * Gets the metadata of the item this Block can drop. This method is called when the block gets destroyed. It
     * returns the metadata of the dropped item based on the old metadata of the block.
     */
    public int damageDropped(IBlockState state)
    {
        return ((TreeOresLogs1.EnumType)state.getValue(VARIANT)).getMetadata();
    }

    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        if(References.EnableChops) {
            return TreeOresItems.TreeChops1;
        }else{
            return Item.getItemFromBlock(this);
        }
    }
    public static enum EnumType implements IStringSerializable
    {
        IRON(0, "iron", new Color(216, 175, 147)),
        GOLD(1, "gold", new Color(250, 238, 77)),
        COAL(2, "coal", new Color(76,76,76)),
        REDSTONE(3, "redstone", new Color(99,33,33));

        private static final TreeOresLogs1.EnumType[] META_LOOKUP = new TreeOresLogs1.EnumType[values().length];
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

        public static TreeOresLogs1.EnumType byMetadata(int meta)
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
            for (TreeOresLogs1.EnumType TreeOresLogs1$enumtype : values())
            {
                META_LOOKUP[TreeOresLogs1$enumtype.getMetadata()] = TreeOresLogs1$enumtype;
            }
        }
    }

}
