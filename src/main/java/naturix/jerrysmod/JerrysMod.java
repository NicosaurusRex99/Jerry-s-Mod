package naturix.jerrysmod;

import naturix.jerrysmod.proxy.ClientProxy;
import naturix.jerrysmod.proxy.IProxy;
import naturix.jerrysmod.proxy.ServerProxy;
import naturix.jerrysmod.registry.ModItems;
import naturix.jerrysmod.registry.ModSetup;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(JerrysMod.MODID)
public class JerrysMod
{
    public static final String MODID = "jerrysmod";
    public static final String MODNAME = "Jerry's Mod";
    private static final Logger LOGGER = LogManager.getLogger();
    public static IProxy proxy = DistExecutor.runForDist(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());
    public static ModSetup setup = new ModSetup();

    public JerrysMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        setup.init();
        proxy.init();

//        ModOreFeature.setupOreGenerator();
    }

    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> event) {
//            event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
        }

        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
//            event.getRegistry().register(new BlockItem(ModBlocks.ruby_ore, new Item.Properties().group(Ruby.setup.itemGroup)).setRegistryName("ruby_ore"));
//            event.getRegistry().register(new BlockItem(ModBlocks.braunite_ore, new Item.Properties().group(Ruby.setup.itemGroup)).setRegistryName("braunite_ore"));
//            event.getRegistry().register(new BlockItem(ModBlocks.opal_ore, new Item.Properties().group(Ruby.setup.itemGroup)).setRegistryName("opal_ore"));
//            event.getRegistry().register(new BlockItem(ModBlocks.amethyst, new Item.Properties().group(Ruby.setup.itemGroup)).setRegistryName("amethyst"));
//            event.getRegistry().register(new BlockItem(ModBlocks.meteorite_ore, new Item.Properties().group(Ruby.setup.itemGroup)).setRegistryName("meteorite_ore"));
//            event.getRegistry().register(new BlockItem(ModBlocks.braunite_block, new Item.Properties().group(Ruby.setup.itemGroup)).setRegistryName("braunite_block"));
//            event.getRegistry().register(new BlockItem(ModBlocks.opal_block, new Item.Properties().group(Ruby.setup.itemGroup)).setRegistryName("opal_block"));
//            event.getRegistry().register(new BlockItem(ModBlocks.ruby_block, new Item.Properties().group(Ruby.setup.itemGroup)).setRegistryName("ruby_block"));
//            event.getRegistry().register(new BlockItem(ModBlocks.bomb, new Item.Properties().group(Ruby.setup.itemGroup)).setRegistryName("bomb"));
        }
    }
}