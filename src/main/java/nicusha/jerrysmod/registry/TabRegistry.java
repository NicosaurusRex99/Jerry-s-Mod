package nicusha.jerrysmod.registry;

import net.minecraft.world.item.*;

import static nicusha.jerrysmod.JerrysMod.MODID;

public class TabRegistry {

    public static CreativeModeTab jerrysmod = new CreativeModeTab(MODID) {
    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegistry.jerry_gem.get());
    }
};

    public void init() {

    }
}
