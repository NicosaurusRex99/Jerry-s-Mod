package naturix.jerrysmod.blocks;

import java.util.Random;

import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.tree.WorldGenBigOliveTree;
import naturix.jerrysmod.tree.WorldGenTree;
import net.minecraft.block.Block;
import net.minecraft.block.IGrowable;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.EnumPlantType;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class OliveSapling extends Block implements IGrowable, IPlantable {
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
                WorldGenTree worldgenerator = new WorldGenTree();
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
        return true;
    }
	public boolean isCollidable()
    {
        return true;
    }

	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
    {
        entityIn.setInWeb();;
    }

	@Override
	public boolean canGrow(World worldIn, BlockPos pos, IBlockState state, boolean isClient) {
		return true;
	}

	@Override
	public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {
		return true;
	}

	@Override
	public void grow(World worldIn, Random rand, BlockPos pos, IBlockState state) {
		WorldGenTree worldgenerator = new WorldGenTree();
		
	}

	@Override
	public EnumPlantType getPlantType(IBlockAccess world, BlockPos pos) {
		return EnumPlantType.Plains;
	}

	@Override
	public IBlockState getPlant(IBlockAccess world, BlockPos pos) {
		return getDefaultState();
	}
	
}