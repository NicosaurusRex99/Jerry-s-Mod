package naturix.jerrysmod;

import naturix.jerrysmod.items.JerryGem;
import naturix.jerrysmod.items.SlimeGem;
import naturix.jerrysmod.items.SlimeShard;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems 
{
	@GameRegistry.ObjectHolder("jerrysmod:slimeshard")
    public static SlimeShard slimeshard;
	@GameRegistry.ObjectHolder("jerrysmod:slimegem")
    public static SlimeGem slimegem;
	@GameRegistry.ObjectHolder("jerrysmod:jerrygem")
    public static JerryGem jerrygem;
	
	
	@SideOnly(Side.CLIENT)
	public static void initModels() {
	slimeshard.initModel();
	slimegem.initModel();
	jerrygem.initModel();
}
}
