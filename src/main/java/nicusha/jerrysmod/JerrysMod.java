package nicusha.jerrysmod;

import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.*;
import nicusha.jerrysmod.integration.ModIntegration;
import nicusha.jerrysmod.registry.*;
import org.slf4j.Logger;

@Mod(JerrysMod.MODID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = JerrysMod.MODID)
public class JerrysMod
{
    public static final String MODID = "jerrysmod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public JerrysMod()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        BlockRegistry.BLOCKS.register(bus);
        ItemRegistry.ITEMS.register(bus);
        BlockRegistry.BLOCK_ITEMS.register(bus);
        PointOfInterestRegistry.POI.register(bus);
        TAB.register(bus);


        bus.addListener(this::common);
    }

    private void common(final FMLCommonSetupEvent event) {
        ModIntegration.initCommon(event);

        event.enqueueWork(() -> {
            AxeItem.STRIPPABLES = new ImmutableMap.Builder<Block, Block>().putAll(AxeItem.STRIPPABLES) .put(BlockRegistry.olive_log.get(), BlockRegistry.stripped_olive_log.get()).build();
        });
    }
    public static final DeferredRegister<CreativeModeTab> TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final RegistryObject<CreativeModeTab> CREATIVE_TAB = TAB.register("tab", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.jerry")).icon(() -> new ItemStack(ItemRegistry.slime_gem.get())).build());
    @SubscribeEvent
    public static void creativeTab(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == CREATIVE_TAB.get()) {
            for (var regObj : ItemRegistry.ITEMS.getEntries()) {
                event.accept(regObj.get());
            }
            for (var regObj : BlockRegistry.BLOCK_ITEMS.getEntries()) {
                event.accept(regObj.get());
            }
        }
    }
}
