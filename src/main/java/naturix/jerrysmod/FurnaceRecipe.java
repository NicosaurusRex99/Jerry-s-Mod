package naturix.jerrysmod;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FurnaceRecipe {
	
	public static void init() 
{
	GameRegistry.addSmelting(ModBlocks.slimeore, new ItemStack(ModItems.slimeshard), 0.1f);
}
}