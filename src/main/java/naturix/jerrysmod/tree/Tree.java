package naturix.jerrysmod.tree;

import java.util.Random;

import naturix.jerrysmod.ModBiomes;
import naturix.jerrysmod.ModBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

public class Tree {

	static Biome.BiomeProperties customProps = null;
	public static BiomeGenolivetree biome = null;

	static {
		customProps = new Biome.BiomeProperties("olivetree");
		customProps.setRainfall(0.5F);
		customProps.setBaseHeight(0.1F);
		customProps.setHeightVariation(0.3F);
		customProps.setWaterColor(16777215);
		biome = new BiomeGenolivetree(customProps);
	}

	public static Object instance;

	public Tree() {
	}

	public void load(FMLInitializationEvent event) {
		Biome.REGISTRY.register(40, new ResourceLocation("olivetree"), biome);
		BiomeDictionary.addTypes(biome, BiomeDictionary.Type.SWAMP);
		BiomeManager.addSpawnBiome(ModBiomes.SlimeBiome);
		BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(ModBiomes.SlimeBiome, 10));
	}

	public void generateNether(World world, Random random, int chunkX, int chunkZ) {
	}

	public void generateSurface(World world, Random random, int chunkX, int chunkZ) {
	}

	public void registerRenderers() {
	}

	public int addFuel(ItemStack fuel) {
		return 0;
	}

	public void serverLoad(FMLServerStartingEvent event) {
	}

	public void preInit(FMLPreInitializationEvent event) {
	}

	static class BiomeGenolivetree extends Biome {
		public BiomeGenolivetree(Biome.BiomeProperties mycustomProps) {
			super(mycustomProps);
			topBlock = Blocks.DIRT.getDefaultState();
			fillerBlock = ModBlocks.slimestone.getDefaultState();
			decorator.generateFalls = false;
			decorator.treesPerChunk = 10;
			decorator.flowersPerChunk = 15;
			decorator.grassPerChunk = 10;
			decorator.deadBushPerChunk = 0;
			decorator.mushroomsPerChunk = 3;
			decorator.reedsPerChunk = 2;
			decorator.cactiPerChunk = 0;
			decorator.gravelPatchesPerChunk = 0;

		}

		public Tree genBigTreeChance(Random rand) {
			return new Tree();
		}

}
}
