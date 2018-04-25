package naturix.jerrysmod.biome;


import java.util.List;

import com.google.common.collect.Lists;

import naturix.jerrysmod.registries.ModBiomes;
import net.minecraft.init.Biomes;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeCache;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.gen.ChunkGeneratorSettings;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.storage.WorldInfo;

public class BiomeProviderSlime extends BiomeProvider{
	 
    private ChunkGeneratorSettings settings;
    private GenLayer genBiomes;
    /** A GenLayer containing the indices into BiomeGenBase.biomeList[] */
    private GenLayer biomeIndexLayer;
    /** The biome list. */
    private final BiomeCache biomeCache;
    /** A list of biomes that the player can spawn in. */
    private final List<Biome> biomesToSpawnIn;
    public static List<Biome> allowedBiomes = Lists.newArrayList(ModBiomes.SlimeBiome);

	
	protected BiomeProviderSlime()
	    {
	        this.biomeCache = new BiomeCache(this);
	        this.biomesToSpawnIn = Lists.newArrayList(allowedBiomes);
	    }

	    private BiomeProviderSlime(long seed, WorldType worldTypeIn, String options)
	    {
	        this();

	        if (worldTypeIn == WorldType.CUSTOMIZED && !options.isEmpty())
	        {
	            this.settings = ChunkGeneratorSettings.Factory.jsonToFactory(options).build();
	        }

	        GenLayer[] agenlayer = GenLayer.initializeAllBiomeGenerators(seed, worldTypeIn, this.settings);
	        agenlayer = getModdedBiomeGenerators(worldTypeIn, seed, agenlayer);
	        this.genBiomes = agenlayer[0];
	        this.biomeIndexLayer = agenlayer[1];
	    }

	    public BiomeProviderSlime(WorldInfo info)
	    {
	        this(info.getSeed(), info.getTerrainType(), info.getGeneratorOptions());
	    }

}
