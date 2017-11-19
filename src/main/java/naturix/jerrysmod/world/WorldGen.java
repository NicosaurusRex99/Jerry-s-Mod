package naturix.jerrysmod.world;

import java.util.Random;

import Registries.ModBlocks;
import naturix.jerrysmod.Config;
import naturix.jerrysmod.tree.OliveTest2;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGen implements IWorldGenerator {
	
	public static WorldGen instance = new WorldGen();
	private Random rand;
	 
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		if (world.provider.getDimension() == 0) { 
			generateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}
	

	private void generateOre(IBlockState object, World world, Random random, int x, int z, int minY, int maxY, int size, int chances) {
		int deltaY = maxY - minY;
	
		for (int i = 0; i < chances; i++) {
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
	
			WorldGenMinable generator = new WorldGenMinable(object, size);
			generator.generate(world, random, pos);
		}
	}
	private void generateOverworld(Random random, int chunkX, int chunkY, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		generateOre(ModBlocks.slimeore.getDefaultState(), world, random, chunkX * 16, chunkY * 16, Config.slimeMin, Config.slimeMax, Config.slimeVeinSize + random.nextInt(4), Config.slimeSpawnTries);
	

	}
	private void generateSurface(World world, Random random, int BlockX, int BlockZ) {
		for (int i = 0; i < 20; i++) {
			int Xcoord1 = BlockX + random.nextInt(16);
			int Ycoord1 = random.nextInt(90);
			int Zcoord1 = BlockZ + random.nextInt(16);
			
			new OliveTest2(); 
			}
			}

}