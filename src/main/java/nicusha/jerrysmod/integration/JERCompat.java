package nicusha.jerrysmod.integration;

import jeresources.api.*;
import jeresources.api.distributions.*;
import jeresources.compatibility.api.JERAPI;
import net.minecraft.world.item.ItemStack;
import nicusha.jerrysmod.registry.*;

public class JERCompat {
    public static void init() {
        IJERAPI jerApi = JERAPI.getInstance();

        IWorldGenRegistry worldGenRegistry = jerApi.getWorldGenRegistry();
        if (worldGenRegistry != null) {
            worldGenRegistry.register(new ItemStack(BlockRegistry.slime_ore.get()), new DistributionSquare(3, 3, 0, 16));
            worldGenRegistry.register(new ItemStack(BlockRegistry.deepslate_slime_ore.get()), new DistributionSquare(5, 3, -64, 0));
        }
    }
}
