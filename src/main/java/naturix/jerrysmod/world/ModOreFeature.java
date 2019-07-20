package naturix.jerrysmod.world;

import com.google.common.base.Predicate;
import naturix.jerrysmod.registry.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;


import static net.minecraft.world.gen.feature.OreFeatureConfig.FillerBlockType.NATURAL_STONE;
import static net.minecraft.world.gen.placement.Placement.COUNT_RANGE;
public class ModOreFeature
{
    private static final Predicate<BlockState> STONE = state -> state.getBlock() == Blocks.STONE;
    public static void setupOreGenerator()
    {
        for(Biome biome : ForgeRegistries.BIOMES)
        {
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Biome.createDecoratedFeature(Feature.ORE,
                    new OreFeatureConfig(NATURAL_STONE, ModBlocks.slime_ore.getDefaultState(), 4),
                    COUNT_RANGE, new CountRangeConfig(8, 1, 3, 15)));
            if (biome.equals(Biomes.SWAMP) || biome.equals(Biomes.SWAMP_HILLS)) {
                biome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Biome.createDecoratedFeature(Feature.RANDOM_SELECTOR, new MultipleRandomFeatureConfig(new Feature[]{ModOreFeature.OLIVE_TREE}, new IFeatureConfig[]{IFeatureConfig.NO_FEATURE_CONFIG}, new float[]{0.1F}, ModOreFeature.OLIVE_TREE, IFeatureConfig.NO_FEATURE_CONFIG), Placement.COUNT_EXTRA_HEIGHTMAP, new AtSurfaceWithExtraConfig(5, 0.3F, 1)));
            }
        }
    }

    public static final AbstractTreeFeature<NoFeatureConfig> OLIVE_TREE = new OliveTreeFeature.Builder().create();
}