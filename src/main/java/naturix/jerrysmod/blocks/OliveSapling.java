package naturix.jerrysmod.blocks;

import java.util.Random;

import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.ModBlocks;
import naturix.jerrysmod.tree.OliveTree;
import naturix.jerrysmod.world.WorldGen;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class OliveSapling extends Block {
	protected static final AxisAlignedBB SAPLING_AABB = new AxisAlignedBB(0.09999999403953552D, 0.0D, 0.09999999403953552D, 0.8999999761581421D, 0.800000011920929D, 0.8999999761581421D);



	public OliveSapling(Material materialIn) {
		super(Material.PLANTS);
        setUnlocalizedName(JerrysMod.MODID + ".olivesapling");
        setRegistryName("olivesapling");
        setCreativeTab(JerrysMod.JerrysMod);
        setHardness(0.2f);
        setLightOpacity(255);
		setResistance(1f);
		setSoundType(SoundType.PLANT);

	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
	    return false;
	}
	
	@Override
	public boolean isFullBlock(IBlockState state) {
	    return false;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
	    return false;
	}

	@SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return SAPLING_AABB;
    }
	public Block setTickRandomly(boolean shouldTick)
    {
        this.needsRandomTick = shouldTick;
        return this;
    }
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        if (!worldIn.isRemote)
        {
            super.updateTick(worldIn, pos, state, rand);

            if (worldIn.getLightFromNeighbors(pos.up()) >= 9 && rand.nextInt(7) == 0)
            {
                JerrysMod.logger.info("Tree Lighting Updated");
            }
        }
    }
	
	//blockstates
	public int getLightOpacity(IBlockState state)
    {
        return this.lightOpacity;
    }
	@SideOnly(Side.CLIENT)
    public boolean isTranslucent(IBlockState state)
    {
        return this.translucent;
    }
	public Block setLightOpacity(int opacity)
    {
        this.lightOpacity = opacity;
        return this;
    }
	public boolean isPassable(IBlockAccess worldIn, BlockPos pos)
    {
        return false;
    }
	public boolean isCollidable()
    {
        return true;
    }
	

}