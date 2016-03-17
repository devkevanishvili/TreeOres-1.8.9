package com.lessoner.treeores.Blocks;

import com.lessoner.treeores.WorldGen.WorldGenTreeOres1;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.IGrowable;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;
import java.util.Random;

/**
 * Created by anguarmas on 3/6/16.
 */
public class TreeOresBossSaplings1 extends BlockBush implements IGrowable  {

    public static final PropertyEnum<TreeOresLogs1.EnumType> TYPE = PropertyEnum.<TreeOresLogs1.EnumType>create("type", TreeOresLogs1.EnumType.class);
    public static final PropertyInteger STAGE = PropertyInteger.create("stage", 0, 1);

    protected TreeOresBossSaplings1()
    {
        this.setDefaultState(this.blockState.getBaseState().withProperty(TYPE, TreeOresLogs1.EnumType.IRON).withProperty(STAGE, Integer.valueOf(0)));
        float f = 0.4F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
    }

    /**
     * Gets the localized name of this block. Used for the statistics page.
     */
    public String getLocalizedName()
    {
        return StatCollector.translateToLocal(this.getUnlocalizedName() + "." + TreeOresLogs1.EnumType.IRON.getUnlocalizedName() + ".name");
    }

    public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        if (!worldIn.isRemote)
        {
            super.updateTick(worldIn, pos, state, rand);

            if (worldIn.getLightFromNeighbors(pos.up()) >= 9 && rand.nextInt(7) == 0)
            {
                this.grow(worldIn, pos, state, rand);
            }
        }
    }

    public void grow(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        if (((Integer)state.getValue(STAGE)).intValue() == 0)
        {
            worldIn.setBlockState(pos, state.cycleProperty(STAGE), 4);
        }
        else
        {
            this.generateTree(worldIn, pos, state, rand);
        }
    }

    public void generateTree(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        if (!net.minecraftforge.event.terraingen.TerrainGen.saplingGrowTree(worldIn, rand, pos)) return;
        WorldGenerator worldgenerator = new WorldGenTrees(true);
        int i = 0;
        int j = 0;
        boolean flag = false;
        IBlockState logState;
        IBlockState leafState;

        switch ((TreeOresLogs1.EnumType)state.getValue(TYPE)) {
            case IRON:
                logState = TreeOresBlocks.TreeOresLogs1.getDefaultState().withProperty(TreeOresLogs1.VARIANT, TreeOresLogs1.EnumType.IRON);
                leafState = TreeOresBlocks.TreeOresBossLeaves1.getDefaultState().withProperty(TreeOresBossLeaves1.VARIANT, TreeOresLogs1.EnumType.IRON).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
                worldgenerator = new WorldGenTreeOres1(true, 15 + rand.nextInt(7), logState, leafState, false);
                break;
            case GOLD:
                logState = TreeOresBlocks.TreeOresLogs1.getDefaultState().withProperty(TreeOresLogs1.VARIANT, TreeOresLogs1.EnumType.GOLD);
                leafState = TreeOresBlocks.TreeOresBossLeaves1.getDefaultState().withProperty(TreeOresBossLeaves1.VARIANT, TreeOresLogs1.EnumType.GOLD).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
                worldgenerator = new WorldGenTreeOres1(true,  15 + rand.nextInt(7), logState, leafState, false);
                break;
            case COAL:
                logState = TreeOresBlocks.TreeOresLogs1.getDefaultState().withProperty(TreeOresLogs1.VARIANT, TreeOresLogs1.EnumType.COAL);
                leafState = TreeOresBlocks.TreeOresBossLeaves1.getDefaultState().withProperty(TreeOresBossLeaves1.VARIANT, TreeOresLogs1.EnumType.COAL).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
                worldgenerator = new WorldGenTreeOres1(true,  15 + rand.nextInt(7), logState, leafState, false);
                break;
            case REDSTONE:
                logState = TreeOresBlocks.TreeOresLogs1.getDefaultState().withProperty(TreeOresLogs1.VARIANT, TreeOresLogs1.EnumType.REDSTONE);
                leafState = TreeOresBlocks.TreeOresBossLeaves1.getDefaultState().withProperty(TreeOresBossLeaves1.VARIANT, TreeOresLogs1.EnumType.REDSTONE).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
                worldgenerator = new WorldGenTreeOres1(true,  15 + rand.nextInt(7), logState, leafState, false);
                break;
        }

            IBlockState airState = Blocks.air.getDefaultState();

            if (flag) {
                worldIn.setBlockState(pos.add(i, 0, j), airState, 4);
                worldIn.setBlockState(pos.add(i + 1, 0, j), airState, 4);
                worldIn.setBlockState(pos.add(i, 0, j + 1), airState, 4);
                worldIn.setBlockState(pos.add(i + 1, 0, j + 1), airState, 4);
            } else {
                worldIn.setBlockState(pos, airState, 4);
            }

            if (!worldgenerator.generate(worldIn, rand, pos.add(i, 0, j))) {
                if (flag) {
                    worldIn.setBlockState(pos.add(i, 0, j), state, 4);
                    worldIn.setBlockState(pos.add(i + 1, 0, j), state, 4);
                    worldIn.setBlockState(pos.add(i, 0, j + 1), state, 4);
                    worldIn.setBlockState(pos.add(i + 1, 0, j + 1), state, 4);
                } else {
                    worldIn.setBlockState(pos, state, 4);
                }
            }
    }


    private boolean func_181624_a(World world, BlockPos blockPos, int i, int k, TreeOresLogs1.EnumType enumType)
    {
        return this.isTypeAt(world, blockPos.add(i, 0, k), enumType) && this.isTypeAt(world, blockPos.add(i + 1, 0, k), enumType) && this.isTypeAt(world, blockPos.add(i, 0, k + 1), enumType) && this.isTypeAt(world, blockPos.add(i + 1, 0, k + 1), enumType);
    }

    /**
     * Check whether the given BlockPos has a Sapling of the given type
     */
    public boolean isTypeAt(World worldIn, BlockPos pos, TreeOresLogs1.EnumType type)
    {
        IBlockState iblockstate = worldIn.getBlockState(pos);
        return iblockstate.getBlock() == this && iblockstate.getValue(TYPE) == type;
    }

    /**
     * Gets the metadata of the item this Block can drop. This method is called when the block gets destroyed. It
     * returns the metadata of the dropped item based on the old metadata of the block.
     */
    public int damageDropped(IBlockState state)
    {
        return ((TreeOresLogs1.EnumType)state.getValue(TYPE)).getMetadata();
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item itemIn, CreativeTabs tab, List<ItemStack> list)
    {
        for (TreeOresLogs1.EnumType TreeOresLogs1$enumtype : TreeOresLogs1.EnumType.values())
        {
            list.add(new ItemStack(itemIn, 1, TreeOresLogs1$enumtype.getMetadata()));
        }
    }

    /**
     * Whether this IGrowable can grow
     */
    public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient)
    {
        return true;
    }

    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state)
    {
        return (double)worldIn.rand.nextFloat() < 0.45D;
    }

    public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state)
    {
        this.grow(worldIn, pos, state, rand);
    }

    /**
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(TYPE, TreeOresLogs1.EnumType.byMetadata(meta & 7)).withProperty(STAGE, Integer.valueOf((meta & 8) >> 3));
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state)
    {
        int i = 0;
        i = i | ((TreeOresLogs1.EnumType)state.getValue(TYPE)).getMetadata();
        i = i | ((Integer)state.getValue(STAGE)).intValue() << 3;
        return i;
    }

    protected BlockState createBlockState()
    {
        return new BlockState(this, new IProperty[] {TYPE, STAGE});
    }
}
