package naturix.jerrysmod.biome;

import java.util.Random;

import naturix.jerrysmod.Config;
import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.ModBlocks;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockFlower;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeSwamp;
import net.minecraft.world.chunk.ChunkPrimer;

public class BiomeSlime extends Biome {
	private boolean logged = Config.slimeBiomePos;
	

	public BiomeSlime(final BiomeProperties properties) {
		super(properties);
		topBlock = ModBlocks.slimegrass.getDefaultState();
		fillerBlock = ModBlocks.slimestone.getDefaultState();
		this.spawnableWaterCreatureList.add(new Biome.SpawnListEntry(EntitySquid.class, 10, 4, 4));
        this.spawnableCaveCreatureList.add(new Biome.SpawnListEntry(EntityBat.class, 10, 8, 8));
        this.spawnableWaterCreatureList.add(new Biome.SpawnListEntry(EntitySlime.class, 10, 4, 4));
        
	}
	public BlockFlower.EnumFlowerType pickRandomFlower(Random rand, BlockPos pos)
    {
        return BlockFlower.EnumFlowerType.HOUSTONIA;
    }
	@Override
	public void genTerrainBlocks(final World worldIn, final Random random, final ChunkPrimer chunkPrimer, final int x, final int z, final double stoneNoise) {
		super.genTerrainBlocks(worldIn, random, chunkPrimer, x, z, stoneNoise);

		if (!logged) {
			logged = true;
			JerrysMod.logger.info("Generating slime biome");
		}
	}
	@Override
    public void addDefaultFlowers()
    {
		addFlower(Blocks.RED_FLOWER.getDefaultState().withProperty(Blocks.RED_FLOWER.getTypeProperty(), BlockFlower.EnumFlowerType.HOUSTONIA), 10);
    }
}