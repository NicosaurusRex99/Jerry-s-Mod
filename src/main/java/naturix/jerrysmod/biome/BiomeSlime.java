package naturix.jerrysmod.biome;

import java.util.Random;
import java.util.logging.Logger;

import naturix.jerrysmod.Config;
import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.ModBlocks;
import naturix.jerrysmod.tree.OliveTree;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockSand;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraft.world.biome.BiomeSwamp;
import net.minecraft.world.chunk.ChunkPrimer;

public class BiomeSlime extends BiomeSwamp {
	private boolean logged = Config.slimeBiomePos;

	public BiomeSlime(final BiomeProperties properties) {
		super(properties);
		topBlock = Blocks.DIRT.getDefaultState().withProperty(BlockDirt.VARIANT, BlockDirt.DirtType.PODZOL);
		fillerBlock = ModBlocks.slimestone.getDefaultState();
	}

	@Override
	public void genTerrainBlocks(final World worldIn, final Random random, final ChunkPrimer chunkPrimer, final int x, final int z, final double stoneNoise) {
		super.genTerrainBlocks(worldIn, random, chunkPrimer, x, z, stoneNoise);

		if (!logged) {
			logged = true;
			JerrysMod.logger.info("Generating slime biome");
		}
	}
}