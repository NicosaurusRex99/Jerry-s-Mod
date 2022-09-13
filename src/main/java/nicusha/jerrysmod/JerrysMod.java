package nicusha.jerrysmod;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import nicusha.jerrysmod.integration.ModIntegration;
import nicusha.jerrysmod.registry.*;
import org.slf4j.Logger;

@Mod(JerrysMod.MODID)
public class JerrysMod
{
    public static final String MODID = "jerrysmod";
    private static final Logger LOGGER = LogUtils.getLogger();
    public static TabRegistry tabs = new TabRegistry();

    public JerrysMod()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        BlockRegistry.BLOCKS.register(bus);
        ItemRegistry.ITEMS.register(bus);
        BlockRegistry.BLOCK_ITEMS.register(bus);


        bus.addListener(this::common);
    }

    private void common(final FMLCommonSetupEvent event) {
        tabs.init();
        ModIntegration.initCommon(event);
    }
}
