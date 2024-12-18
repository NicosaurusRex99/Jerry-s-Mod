package nicusha.jerrysmod.data.loot;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;
import nicusha.jerrysmod.registry.BlockRegistry;
import nicusha.jerrysmod.registry.ItemRegistry;

import java.util.Set;
import java.util.stream.Collectors;

public class BlockLootTables extends BlockLootSubProvider {

    public BlockLootTables(HolderLookup.Provider provider) {
    super(Set.of(), FeatureFlags.REGISTRY.allFlags(), provider);
}

    @Override
    protected void generate() {
        for (var regObj : BlockRegistry.BLOCKS.getEntries()) {
            if ((!(regObj.get().equals(BlockRegistry.deepslate_slime_ore.get()) || regObj.get().equals(BlockRegistry.slime_ore.get())))) {
                dropSelf(regObj.get());
            }
        }
        add(BlockRegistry.deepslate_slime_ore.get(), createSingleItemTableWithSilkTouch(BlockRegistry.deepslate_slime_ore.get(), ItemRegistry.slime_shard.get()));
        add(BlockRegistry.slime_ore.get(), createSingleItemTableWithSilkTouch(BlockRegistry.slime_ore.get(), ItemRegistry.slime_shard.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BlockRegistry.BLOCKS.getEntries().stream().map(DeferredHolder::value).collect(Collectors.toList());
    }
}
