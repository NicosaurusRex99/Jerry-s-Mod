package naturix.jerrysmod;

import naturix.jerrysmod.biome.BiomeSlime;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;

@ObjectHolder(JerrysMod.MODID)
public class ModBiomes {

	public static final BiomeSlime SlimeBiome = Null();

	@Mod.EventBusSubscriber(modid = JerrysMod.MODID)
	public static class RegistrationHandler {

		@SubscribeEvent
		public static void registerBiomes(final RegistryEvent.Register<Biome> event) {
			final IForgeRegistry<Biome> registry = event.getRegistry();

			registerBiome(registry, new BiomeSlime(new Biome.BiomeProperties("SlimeBiome").setBaseHeight(0.125F).setHeightVariation(0.05F).setTemperature(2.0F).setRainfall(0.0F).setRainDisabled()), "SlimeBiome", BiomeManager.BiomeType.COOL, 1000);
		}

		private static <T extends Biome> void registerBiome(final IForgeRegistry<Biome> registry, final T biome, final String biomeName, final BiomeManager.BiomeType biomeType, final int weight, final BiomeDictionary.Type... types) {
			registry.register(biome.setRegistryName(JerrysMod.MODID, biomeName));
			BiomeDictionary.addTypes(biome, types);
			BiomeManager.addBiome(biomeType, new BiomeManager.BiomeEntry(biome, weight));
		}
	}

	private static BiomeSlime Null() {
		return null;
	}
}