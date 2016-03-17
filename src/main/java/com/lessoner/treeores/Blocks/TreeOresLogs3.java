package com.lessoner.treeores.Blocks;

import com.google.common.base.Predicate;
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

/**
 * Created by anguarmas on 15.02.16.
 */
public class TreeOresLogs3 extends BlockLog {
    public static final PropertyEnum VARIANT = PropertyEnum.create("variant", TreeOresLogs3.EnumType.class, new Predicate()
    {
        public boolean apply(TreeOresLogs3.EnumType type)
        {
            return type.getMetadata() < 4;
        }
        public boolean apply(Object p_apply_1_)
        {
            return this.apply((TreeOresLogs3.EnumType)p_apply_1_);
        }
    });

    public TreeOresLogs3(){
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, TreeOresLogs3.EnumType.GLOWSTONE).withProperty(LOG_AXIS, EnumAxis.Y));

    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list)
    {
        list.add(new ItemStack(itemIn, 1, TreeOresLogs3.EnumType.GLOWSTONE.getMetadata()));
        list.add(new ItemStack(itemIn, 1, TreeOresLogs3.EnumType.QUARTZ.getMetadata()));
        list.add(new ItemStack(itemIn, 1, TreeOresLogs3.EnumType.XP.getMetadata()));
    }

    /**
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta)
    {
        IBlockState iblockstate = this.getDefaultState().withProperty(VARIANT, TreeOresLogs3.EnumType.byMetadata((meta & 3) % 4));

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
        i = i | ((TreeOresLogs3.EnumType)state.getValue(VARIANT)).getMetadata();

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
        return new ItemStack(Item.getItemFromBlock(this), 1, ((TreeOresLogs3.EnumType)state.getValue(VARIANT)).getMetadata());
    }

    /**
     * Gets the metadata of the item this Block can drop. This method is called when the block gets destroyed. It
     * returns the metadata of the dropped item based on the old metadata of the block.
     */
    public int damageDropped(IBlockState state)
    {
        return ((TreeOresLogs3.EnumType)state.getValue(VARIANT)).getMetadata();
    }
    public static enum EnumType implements IStringSerializable
    {
        GLOWSTONE(0, "glowstone", Color.YELLOW),
        QUARTZ(1, "quartz", Color.WHITE),
        XP(2, "xp", new Color(127,178,56));

        private static final TreeOresLogs3.EnumType[] META_LOOKUP = new TreeOresLogs3.EnumType[values().length];
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

        public static TreeOresLogs3.EnumType byMetadata(int meta)
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
            for (TreeOresLogs3.EnumType TreeOresLogs3$enumtype : values())
            {
                META_LOOKUP[TreeOresLogs3$enumtype.getMetadata()] = TreeOresLogs3$enumtype;
            }
        }
    }

}
