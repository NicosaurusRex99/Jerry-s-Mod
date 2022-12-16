package nicusha.jerrysmod.utils;

import net.minecraft.core.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.*;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import nicusha.jerrysmod.JerrysMod;
import org.jetbrains.annotations.Nullable;

public class OliveGrower extends AbstractTreeGrower {

    public static final ResourceKey<ConfiguredFeature<?, ?>> OLIVE_TREE =  ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(JerrysMod.MODID, "olive_tree"));
    @Nullable
    @Override
    protected ResourceKey<ConfiguredFeature<?, ?>> getConfiguredFeature(RandomSource random, boolean b) {
        return OLIVE_TREE;
    }

    @Override
    public boolean growTree(ServerLevel level, ChunkGenerator chunkGenerator, BlockPos pos, BlockState state, RandomSource random) {
        Holder<? extends ConfiguredFeature<?, ?>> holder = level.registryAccess().registryOrThrow(Registries.CONFIGURED_FEATURE).getHolderOrThrow(OLIVE_TREE);

        if (holder == null) {
            return false;
        } else {
            ConfiguredFeature<?, ?> configuredfeature = holder.value();
            BlockState blockstate = level.getFluidState(pos).createLegacyBlock();
            level.setBlock(pos, blockstate, 4);
            if (configuredfeature.place(level, chunkGenerator, random, pos)) {
                if (level.getBlockState(pos) == blockstate) {
                    level.sendBlockUpdated(pos, state, blockstate, 2);
                }

                return true;
            } else {
                level.setBlock(pos, state, 4);
                return false;
            }
        }
    }
}
