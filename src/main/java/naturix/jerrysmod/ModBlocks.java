package naturix.jerrysmod;

import naturix.jerrysmod.blocks.SlimeOre;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

	@GameRegistry.ObjectHolder("jerrysmod:slimeore")
    public static SlimeOre slimeore;

	@SideOnly(Side.CLIENT)
    public static void initModels() {
        slimeore.initModel();
}
}