package naturix.jerrysmod.world;

import com.mojang.datafixers.Dynamic;
import naturix.jerrysmod.registry.ModBlocks;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.gen.ChunkGenerator;
import net.minecraft.world.gen.GenerationSettings;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.NoFeatureConfig;

import java.util.Random;
import java.util.function.Function;

public class OliveTreeFeature extends Feature<NoFeatureConfig> {
    public OliveTreeFeature(Function<Dynamic<?>,? extends NoFeatureConfig> configFactory) {
        super(configFactory);
    }

    @Override
    public boolean place(IWorld world, ChunkGenerator<? extends GenerationSettings> generator, Random random, BlockPos pos, NoFeatureConfig config) {
        if (random.nextInt(100) != 0) {
            return false;
        }
        if(world.getBlockState(pos.down()).getBlock().isIn(BlockTags.DIRT_LIKE) && world.getBlockState(pos).isAir(world, pos)) {
            //FIXME - Does not yet work
            ModBlocks.slime_sapling.getTree().spawn(world, pos, world.getBlockState(pos.down()), random);
            return true;
        }
        return false;
    }
}