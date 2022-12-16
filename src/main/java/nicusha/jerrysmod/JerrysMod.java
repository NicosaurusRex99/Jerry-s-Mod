package nicusha.jerrysmod;

import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.*;
import nicusha.jerrysmod.integration.ModIntegration;
import nicusha.jerrysmod.registry.*;
import org.slf4j.Logger;

@Mod(JerrysMod.MODID)
public class JerrysMod
{
    public static final String MODID = "jerrysmod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public JerrysMod()
    {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(JerrysMod::registerTab);

        BlockRegistry.BLOCKS.register(bus);
        ItemRegistry.ITEMS.register(bus);
        BlockRegistry.BLOCK_ITEMS.register(bus);
        PointOfInterestRegistry.POI.register(bus);


        bus.addListener(this::common);
    }

    private void common(final FMLCommonSetupEvent event) {
        ModIntegration.initCommon(event);

        event.enqueueWork(() -> {
            AxeItem.STRIPPABLES = new ImmutableMap.Builder<Block, Block>().putAll(AxeItem.STRIPPABLES) .put(BlockRegistry.olive_log.get(), BlockRegistry.stripped_olive_log.get()).build();
        });
    }

    public static final ResourceLocation TAB = new ResourceLocation(JerrysMod.MODID, "jerry");

    private static ItemStack makeIcon() {
        return new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(JerrysMod.MODID, "slime_gem")));
    }


    public static void registerTab(CreativeModeTabEvent.Register event){
        event.registerCreativeModeTab(TAB, builder -> builder.title(Component.translatable("itemGroup.jerry")).icon(JerrysMod::makeIcon).displayItems((flags, output, isOp) -> {
            for(RegistryObject<Item> item : ItemRegistry.ITEMS.getEntries()){
                output.accept(item.get());
            }
            for(RegistryObject<Item> item : BlockRegistry.BLOCK_ITEMS.getEntries()){
                output.accept(item.get());
            }
        }));

    }
}
