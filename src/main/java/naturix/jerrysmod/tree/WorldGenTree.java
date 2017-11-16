package naturix.jerrysmod.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import naturix.jerrysmod.ModBlocks;
import naturix.jerrysmod.biome.BiomeSlime;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenTree implements IWorldGenerator{

	private final WorldGenerator gen_olive_tree = new WorldGenTrees(false, 3, ModBlocks.olivelog.getDefaultState(), ModBlocks.olivelog.getDefaultState(), false);
	private final WorldGenerator gen_big_olive_tree = new WorldGenBigOliveTree(false);

	private void runGenerator(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, double chancesToSpawn, int minHeight, int maxHeight, Class<?>... classe) {
		if (chancesToSpawn < 1) {
				if (random.nextDouble() < chancesToSpawn)
					chancesToSpawn = 1;
				else
					chancesToSpawn = 0;
		}
		ArrayList<Class<?>> classesList = new ArrayList<Class<?>>(Arrays.asList(classe));
		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chancesToSpawn; i++) {
			BlockPos pos = new BlockPos(chunkX * 16 + 1 + random.nextInt(15),
					minHeight + random.nextInt(heightDiff),
					chunkZ * 16 + 1 + random.nextInt(15));
			if (minHeight < 0)
				pos = world.getHeight(pos);
			Class<?> biome = world.provider.getBiomeForCoords(pos).getClass();
			if (classesList.contains(biome) || classe.length == 0)
				generator.generate(world, random, pos);
		}
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch (world.provider.getDimension()) {
	    case 0:
	    	this.runGenerator(gen_olive_tree, world, random, chunkX, chunkZ, 1, -1, 0, BiomeSlime.class);
	    	this.runGenerator(gen_big_olive_tree, world, random, chunkX, chunkZ, 9, -1, 0, BiomeSlime.class);
	    	break;
	    case -1:
	        break;
	    case 1:
	        break;
	    }
	}
	}