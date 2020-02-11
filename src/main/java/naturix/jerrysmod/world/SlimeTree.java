package naturix.jerrysmod.world;

import net.minecraft.block.trees.Tree;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;

import javax.annotation.Nullable;
import java.util.Random;

public class SlimeTree extends Tree {

    @Nullable
    @Override
    protected ConfiguredFeature<TreeFeatureConfig, ?> getTreeFeature(Random random, boolean beehive) {
        return Feature.NORMAL_TREE.withConfiguration(ModOreFeature.SLIME_TREE);
    }
}