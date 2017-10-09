package naturix.jerrysmod;

import naturix.jerrysmod.armor.JerryBoots;
import naturix.jerrysmod.armor.JerryChestplate;
import naturix.jerrysmod.armor.JerryHelmet;
import naturix.jerrysmod.armor.JerryLeggings;
import naturix.jerrysmod.armor.SlimeBoots;
import naturix.jerrysmod.armor.SlimeChestplate;
import naturix.jerrysmod.armor.SlimeHelmet;
import naturix.jerrysmod.armor.SlimeLeggings;
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
	@GameRegistry.ObjectHolder("jerrysmod:slimehelmet")
    public static SlimeHelmet slimehelmet;
	@GameRegistry.ObjectHolder("jerrysmod:slimechestplate")
    public static SlimeChestplate slimechestplate;
	@GameRegistry.ObjectHolder("jerrysmod:slimeleggings")
    public static SlimeLeggings slimeleggings;
	@GameRegistry.ObjectHolder("jerrysmod:slimeboots")
    public static SlimeBoots slimeboots;
	@GameRegistry.ObjectHolder("jerrysmod:jerryhelmet")
	public static JerryHelmet jerryhelmet;
	@GameRegistry.ObjectHolder("jerrysmod:jerrychestplate")
	public static JerryChestplate jerrychestplate;
	@GameRegistry.ObjectHolder("jerrysmod:jerryleggings")
	public static JerryLeggings jerryleggings;
	@GameRegistry.ObjectHolder("jerrysmod:jerryboots")
	public static JerryBoots jerryboots;
	
	
	@SideOnly(Side.CLIENT)
	public static void initModels() {
	slimeshard.initModel();
	slimegem.initModel();
	jerrygem.initModel();
	slimehelmet.initModel();
	slimechestplate.initModel();
	slimeleggings.initModel();
	slimeboots.initModel();
	jerryhelmet.initModel();
	jerrychestplate.initModel();
	jerryleggings.initModel();
	jerryboots.initModel();
}
}
