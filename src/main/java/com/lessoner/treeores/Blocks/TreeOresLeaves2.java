package com.lessoner.treeores.Blocks;

import com.google.common.base.Predicate;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;
import java.util.Random;

/**
 * Created by anguarmas on 3/5/16.
 */
public class TreeOresLeaves2 extends BlockLeaves {
    public static final PropertyEnum<TreeOresLogs2.EnumType> VARIANT = PropertyEnum.<TreeOresLogs2.EnumType>create("variant", TreeOresLogs2.EnumType.class, new Predicate<TreeOresLogs2.EnumType>() {
        public boolean apply(TreeOresLogs2.EnumType p_apply_1_) {
            return p_apply_1_.getMetadata() < 4;
        }
    });

    public TreeOresLeaves2() {
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, TreeOresLogs2.EnumType.DIAMOND).withProperty(CHECK_DECAY, Boolean.valueOf(true)).withProperty(DECAYABLE, Boolean.valueOf(true)));
    }

    @SideOnly(Side.CLIENT)
    public int getRenderColor(IBlockState state) {
        if (state.getBlock() != this) {
            return super.getRenderColor(state);
        } else {
            TreeOresLogs2.EnumType enumType = (TreeOresLogs2.EnumType) state.getValue(VARIANT);
            for (int i = 0; i<4; i++){
                if(enumType == TreeOresLogs2.EnumType.byMetadata(i)){
                    return TreeOresLogs2.EnumType.byMetadata(i).getColor().getRGB();
                }
            }
            return 0;
        }
    }

    @SideOnly(Side.CLIENT)
    public int colorMultiplier(IBlockAccess worldIn, BlockPos pos, int renderPass) {
        IBlockState iblockstate = worldIn.getBlockState(pos);

        if (iblockstate.getBlock() == this) {
            TreeOresLogs2.EnumType enumType = (TreeOresLogs2.EnumType) iblockstate.getValue(VARIANT);

            for (int i = 0; i<4; i++){
                if(enumType == TreeOresLogs2.EnumType.byMetadata(i)){
                    return TreeOresLogs2.EnumType.byMetadata(i).getColor().getRGB();
                }
            }
        }

        return super.colorMultiplier(worldIn, pos, renderPass);
    }

    protected void dropApple(World worldIn, BlockPos pos, IBlockState state, int chance) {
        if (state.getValue(VARIANT) == TreeOresLogs2.EnumType.DIAMOND && worldIn.rand.nextInt(chance) == 0) {
            spawnAsEntity(worldIn, pos, new ItemStack(Items.diamond, 1, 0));
        } else if (state.getValue(VARIANT) == TreeOresLogs2.EnumType.EMERALD && worldIn.rand.nextInt(chance) == 0) {
            spawnAsEntity(worldIn, pos, new ItemStack(Items.emerald, 1, 0));
        } else if (state.getValue(VARIANT) == TreeOresLogs2.EnumType.LAPIS && worldIn.rand.nextInt(chance) == 0) {
            spawnAsEntity(worldIn, pos, new ItemStack(Items.dye, 1, 0));
        } else if (state.getValue(VARIANT) == TreeOresLogs2.EnumType.OBSIDIAN && worldIn.rand.nextInt(chance) == 0) {
            spawnAsEntity(worldIn, pos, new ItemStack(Blocks.obsidian, 1, 0));
        }
    }

    protected int getSaplingDropChance(IBlockState state) {
        return state.getValue(VARIANT) == TreeOresLogs2.EnumType.OBSIDIAN ? 40 : super.getSaplingDropChance(state);
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list) {
        list.add(new ItemStack(itemIn, 1, TreeOresLogs2.EnumType.DIAMOND.getMetadata()));
        list.add(new ItemStack(itemIn, 1, TreeOresLogs2.EnumType.EMERALD.getMetadata()));
        list.add(new ItemStack(itemIn, 1, TreeOresLogs2.EnumType.LAPIS.getMetadata()));
        list.add(new ItemStack(itemIn, 1, TreeOresLogs2.EnumType.OBSIDIAN.getMetadata()));
    }

    protected ItemStack createStackedBlock(IBlockState state) {
        return new ItemStack(Item.getItemFromBlock(this), 1, ((TreeOresLogs2.EnumType) state.getValue(VARIANT)).getMetadata());
    }

    /**
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(VARIANT, this.getWood(meta)).withProperty(DECAYABLE, Boolean.valueOf((meta & 4) == 0)).withProperty(CHECK_DECAY, Boolean.valueOf((meta & 8) > 0));

    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state) {
        int i = 0;
        i = i | ((TreeOresLogs2.EnumType) state.getValue(VARIANT)).getMetadata();

        if (!((Boolean) state.getValue(DECAYABLE)).booleanValue()) {
            i |= 4;
        }

        if (((Boolean) state.getValue(CHECK_DECAY)).booleanValue()) {
            i |= 8;
        }

        return i;
    }

    @Override
    public EnumType getWoodType(int meta) {
        return null;
    }
    public TreeOresLogs2.EnumType getWood(int meta) {
         return TreeOresLogs2.EnumType.byMetadata((meta & 3) % 4);
    }

    protected BlockState createBlockState() {
        return new BlockState(this, new IProperty[]{VARIANT, CHECK_DECAY, DECAYABLE});
    }
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(TreeOresBlocks.TreeOresSaplings2);
    }
    /**
     * Gets the metadata of the item this Block can drop. This method is called when the block gets destroyed. It
     * returns the metadata of the dropped item based on the old metadata of the block.
     */
    public int damageDropped(IBlockState state) {
        return ((TreeOresLogs2.EnumType) state.getValue(VARIANT)).getMetadata();
    }

    public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, TileEntity te) {
        if (!worldIn.isRemote && player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() == Items.shears) {
            player.triggerAchievement(StatList.mineBlockStatArray[Block.getIdFromBlock(this)]);
        } else {
            super.harvestBlock(worldIn, player, pos, state, te);
        }
    }

    @Override
    public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
        IBlockState state = world.getBlockState(pos);
        return new java.util.ArrayList(java.util.Arrays.asList(new ItemStack(this, 1, ((TreeOresLogs2.EnumType) state.getValue(VARIANT)).getMetadata())));
    }
    /**
     * Used to determine ambient occlusion and culling when rebuilding chunks for render
     */
    public boolean isOpaqueCube()
    {
        return false;
    }

    @SideOnly(Side.CLIENT)
    public EnumWorldBlockLayer getBlockLayer()
    {
        return Blocks.leaves.getBlockLayer();
    }

    public boolean isVisuallyOpaque()
    {
        return false;
    }
}
