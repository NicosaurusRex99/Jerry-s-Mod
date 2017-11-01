package naturix.jerrysmod.tree;

import java.util.Random;

import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraftforge.fml.common.IWorldGenerator;
public class tree implements IWorldGenerator {

public WorldGenAbstractTree genBigTreeChance(Random rand) {
	return new Tree();
}

class Tree extends WorldGenAbstractTree {

	public Tree() {
		super(false);
	}

	public boolean generate(World world, Random par2Random, BlockPos pos) {
		int i = pos.getX();
		int j2 = pos.getY();
		int k = pos.getZ();

		int chunkX = i >> 4;
		int chunkZ = k >> 4;
		int j = world.getChunkFromChunkCoords(chunkX, chunkZ).getHeight(new BlockPos(i & 15, 0, k & 15));

		boolean place = true;

		for (int y = 0; y < 7; y++)
			for (int z = 0; z < 5; z++)
				for (int x = 0; x < 5; x++)
					if (world.getBlockState(new BlockPos(i + x, j + y + 1, k + z)).getBlock() != Blocks.AIR)
						place = false;

		if (place) {
			world.setBlockState(new BlockPos(i + 0, j + 3, k + 0), ModBlocks.oliveleaves.getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 1, j + 3, k + 0), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 2, j + 3, k + 0), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 3, j + 3, k + 0), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 4, j + 3, k + 0), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 0, j + 3, k + 1), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 1, j + 3, k + 1), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 2, j + 3, k + 1), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 3, j + 3, k + 1), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 4, j + 3, k + 1), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 0, j + 3, k + 2), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 1, j + 3, k + 2), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 3, j + 3, k + 2), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 4, j + 3, k + 2), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 0, j + 3, k + 3), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 1, j + 3, k + 3), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 2, j + 3, k + 3), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 3, j + 3, k + 3), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 4, j + 3, k + 3), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 0, j + 3, k + 4), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 1, j + 3, k + 4), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 2, j + 3, k + 4), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 3, j + 3, k + 4), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 4, j + 3, k + 4), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 1, j + 4, k + 1), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 2, j + 4, k + 1), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 3, j + 4, k + 1), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 1, j + 4, k + 2), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 3, j + 4, k + 2), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 1, j + 4, k + 3), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 2, j + 4, k + 3), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 3, j + 4, k + 3), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 2, j + 5, k + 1), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 1, j + 5, k + 2), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 2, j + 5, k + 2), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 3, j + 5, k + 2), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 2, j + 5, k + 3), Block.getBlockById(254).getStateFromMeta(0), 3);
			world.setBlockState(new BlockPos(i + 2, j + 6, k + 2), Block.getBlockById(254).getStateFromMeta(0), 3);
		JerrysMod.logger.info("tree spawned");
		}

		return true;
	}

	protected boolean canGrowInto(Block blockType) {
		return true;
	}

	public void generateSaplings(World worldIn, Random random, BlockPos pos) {
	}


	public boolean isReplaceable(World world, BlockPos pos) {
		net.minecraft.block.state.IBlockState state = world.getBlockState(pos);
		return state.getBlock().isAir(state, world, pos) || state.getBlock().isLeaves(state, world, pos)
				|| state.getBlock().isWood(world, pos) || canGrowInto(state.getBlock());
	}
}

@Override
public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
		IChunkProvider chunkProvider) {
	// TODO Auto-generated method stub
	
}
}