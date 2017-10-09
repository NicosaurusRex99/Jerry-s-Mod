package naturix.jerrysmod;

import naturix.jerrysmod.items.SlimeShard;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems 
{
	@GameRegistry.ObjectHolder("jerrysmod:slimeshard")
    public static SlimeShard slimeshard;
	
	
	@SideOnly(Side.CLIENT)
	public static void initModels() {
	slimeshard.initModel();
}
}
