package nicusha.jerrysmod.registry;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static nicusha.jerrysmod.JerrysMod.MODID;

public class BlockRegistry {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredBlock<Block> slime_ore = registerBlock("slime_ore", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).requiresCorrectToolForDrops().strength(2.0F, 3.0F))),
            deepslate_slime_ore = registerBlock("deepslate_slime_ore", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).strength(2.0F, 3.0F).requiresCorrectToolForDrops()));



    private static <T extends Block> DeferredBlock<T> registerBlock(String registryName, Supplier<T> block) {
        DeferredBlock<T> registeredBlock = BLOCKS.register(registryName, block);
        ItemRegistry.ITEMS.register(registryName, () -> new BlockItem(registeredBlock.get(), new Item.Properties()));
        return registeredBlock;
    }
}
