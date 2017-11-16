package naturix.jerrysmod.tree;

import java.util.Random;

import naturix.jerrysmod.Config;
import naturix.jerrysmod.ModBlocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenTree implements IWorldGenerator{

	private WorldGenBigOliveTree olives = new WorldGenBigOliveTree(true);

	public boolean generate(World world, Random rand, BlockPos pos) {
		boolean ret = false;

		if (generateOliveTrees(world, rand, pos)) {
			ret = true;
		}
		return ret;
	}
	
	private boolean generateOliveTrees(World world, Random rand, BlockPos pos) {
		boolean generated = false;
		Biome biome = world.getBiome(pos);
		boolean validBiome = (!BiomeDictionary.hasType(biome, Type.SWAMP)) && (BiomeDictionary.hasType(biome, Type.COLD) || BiomeDictionary.hasType(biome, Type.PLAINS) || BiomeDictionary.hasType(biome, Type.MOUNTAIN));

		if (validBiome && rand.nextFloat() < Config.OLIVE_GEN_CHANCE) {
			for (int i = 0; i < Config.MAX_OLIVE_GEN_ATTEMPTS; i++) {
				int x = pos.getX() + (5 - rand.nextInt(11));
				int z = pos.getZ() + (5 - rand.nextInt(11));
				int y = world.getHeight(x, z);
				BlockPos genPos = new BlockPos(x, y, z);
				
				if (!world.canSnowAt(genPos, true) && ModBlocks.olivesapling.canPlaceBlockAt(world, genPos) && olives.generate(world, rand, genPos)) {
					generated = true;
				}
			}
		}
		
		return generated;
	}

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		// TODO Auto-generated method stub
		
	}
	
	

}