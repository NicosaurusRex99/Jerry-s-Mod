package naturix.jerrysmod.world;

import com.google.common.collect.ImmutableList;
import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.registry.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.block.LeavesBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.treedecorator.BeehiveTreeDecorator;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;


import static net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType.NATURAL_STONE;
public class ModOreFeature
{
    public static final TreeFeatureConfig SLIME_TREE = (new TreeFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.slime_log.getDefaultState()), new SimpleBlockStateProvider(ModBlocks.slime_leaves.getDefaultState()), new BlobFoliagePlacer(2, 0))).baseHeight(5).foliageHeight(2).trunkHeight(3).ignoreVines().setSapling((net.minecraftforge.common.IPlantable) ModBlocks.slime_sapling).build();

    public static void setupOreGenerator()
        {
            for(Biome biome : ForgeRegistries.BIOMES)
            {
                biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(new OreFeatureConfig(NATURAL_STONE, ModBlocks.slime_ore.getDefaultState(), 4)).withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(1, 1, 1, 15))));
            if(biome.getCategory() == Biome.Category.SWAMP){
                biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.NORMAL_TREE.withConfiguration(ModOreFeature.SLIME_TREE));
            }
        }
    }

    public static <T extends IForgeRegistryEntry<T>> T register(IForgeRegistry<T> registry, T entry, String registryKey)
    {
        entry.setRegistryName(new ResourceLocation(JerrysMod.MODID, registryKey.toLowerCase().replace(' ', '_')));
        registry.register(entry);
        return entry;
    }
    public static void registerFeatures(RegistryEvent.Register<Feature<?>> event) {
        IForgeRegistry<Feature<?>> registry = event.getRegistry();
    }
    private static <C extends IFeatureConfig, F extends Feature<C>> F register(String key, F value) {
        return (F)(Registry.<Feature<?>>register(Registry.FEATURE, key, value));
    }
}