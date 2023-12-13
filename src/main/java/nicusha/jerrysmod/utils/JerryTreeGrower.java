package nicusha.jerrysmod.utils;

import java.util.Optional;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.*;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import nicusha.jerrysmod.JerrysMod;

public final class JerryTreeGrower {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OLIVE_TREE =  ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(JerrysMod.MODID, "olive_tree"));

    public static final TreeGrower OLIVE = new TreeGrower("olive", Optional.empty(), Optional.empty(), Optional.of(JerryTreeGrower.OLIVE_TREE));
}
