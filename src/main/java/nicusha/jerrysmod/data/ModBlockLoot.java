package nicusha.jerrysmod.data;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.data.loot.LootTableSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import nicusha.jerrysmod.registry.BlockRegistry;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

public class ModBlockLoot extends BlockLootSubProvider {

    public ModBlockLoot(LootTableSubProvider.Context context) {
        super(Collections.emptySet(), FeatureFlags.REGISTRY.allFlags(), context);
    }

    @Override
    protected void generate() {

        Set<Block> manualOverrides = Set.of(

        );

        BlockRegistry.BLOCKS.getEntries().stream().map(DeferredHolder::get).filter(block -> !manualOverrides.contains(block)).forEach(this::dropSelf);
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BlockRegistry.BLOCKS.getEntries().stream().map(DeferredHolder::get).collect(Collectors.toList());
    }
}