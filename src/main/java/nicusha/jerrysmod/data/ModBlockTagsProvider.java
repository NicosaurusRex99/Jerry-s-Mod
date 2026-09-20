package nicusha.jerrysmod.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import nicusha.jerrysmod.JerrysMod;
import nicusha.jerrysmod.registry.BlockRegistry;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, JerrysMod.MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.slime_ore.getKey(), BlockRegistry.deepslate_slime_ore.getKey());
        tag(BlockTags.NEEDS_DIAMOND_TOOL).add(BlockRegistry.slime_ore.getKey(), BlockRegistry.deepslate_slime_ore.getKey());
        tag(BlockTags.create(Identifier.fromNamespaceAndPath("c", "ores"))).add(BlockRegistry.slime_ore.getKey(), BlockRegistry.deepslate_slime_ore.getKey());
    }
}
