package naturix.jerrysmod.compat;

import moze_intel.projecte.api.ProjectEAPI;
import naturix.jerrysmod.registries.ModBlocks;
import naturix.jerrysmod.registries.ModItems;
import net.minecraft.item.ItemStack;

public class ProjectECompat {
	public static void init() {
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ModItems.slimeshard, 1, 0), (int) 6048);
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ModItems.grapes, 1, 0), (int) 16);
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ModItems.olive, 1, 0), (int) 16);
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ModBlocks.oliveleaves, 1, 0), (int) 1);
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ModBlocks.slimegrass, 1, 0), (int) 1);
		ProjectEAPI.getEMCProxy().registerCustomEMC(new ItemStack(ModBlocks.olivesapling, 1, 0), (int) 32);
		} 
}