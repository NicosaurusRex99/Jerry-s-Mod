package nicusha.jerrysmod.registry;

import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.*;
import nicusha.jerrysmod.JerrysMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = JerrysMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, JerrysMod.MODID);
    public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, JerrysMod.MODID);

    public static final RegistryObject<Block> slime_ore = registerBlock("slime_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GREEN).strength(2.0F, 3.0F))),
    deepslate_slime_ore = registerBlock("deepslate_slime_ore", () -> new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.COLOR_LIGHT_GREEN).strength(2.0F, 3.0F)));




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        return registerBlock(name, block, TabRegistry.jerrysmod, Rarity.COMMON);
    }


    private static <T extends Block> RegistryObject<T> registerBlock(String registryName, Supplier<T> block, CreativeModeTab itemGroup, Rarity rarity) {
        RegistryObject<T> registeredBlock = BLOCKS.register(registryName, block);
        BLOCK_ITEMS.register(registryName, () -> new BlockItem(registeredBlock.get(), new Item.Properties().tab(itemGroup).rarity(rarity)));
        return registeredBlock;
    }
}
