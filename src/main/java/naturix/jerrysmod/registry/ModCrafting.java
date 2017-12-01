package naturix.jerrysmod.registry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class ModCrafting {
	public static void init() {
		GameRegistry.addSmelting(ModBlocks.SlimeOre, new ItemStack(ModItems.slimeShard), 1.0F);
	}
}
