package Registries;

import naturix.jerrysmod.armor.JerryBoots;
import naturix.jerrysmod.armor.JerryChestplate;
import naturix.jerrysmod.armor.JerryHelmet;
import naturix.jerrysmod.armor.JerryLeggings;
import naturix.jerrysmod.armor.SlimeBoots;
import naturix.jerrysmod.armor.SlimeChestplate;
import naturix.jerrysmod.armor.SlimeHelmet;
import naturix.jerrysmod.armor.SlimeLeggings;
import naturix.jerrysmod.items.CaptainOfLight;
import naturix.jerrysmod.items.Grapes;
import naturix.jerrysmod.items.JerryAxe;
import naturix.jerrysmod.items.JerryGem;
import naturix.jerrysmod.items.JerryHoe;
import naturix.jerrysmod.items.JerryPickaxe;
import naturix.jerrysmod.items.JerryShovel;
import naturix.jerrysmod.items.JerrySword;
import naturix.jerrysmod.items.Olive;
import naturix.jerrysmod.items.Phone;
import naturix.jerrysmod.items.SlimeAxe;
import naturix.jerrysmod.items.SlimeGem;
import naturix.jerrysmod.items.SlimeHoe;
import naturix.jerrysmod.items.SlimePickaxe;
import naturix.jerrysmod.items.SlimeShard;
import naturix.jerrysmod.items.SlimeShovel;
import naturix.jerrysmod.items.SlimeStick;
import naturix.jerrysmod.items.SlimeSword;
import naturix.jerrysmod.items.SlimeTamer;
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
	@GameRegistry.ObjectHolder("jerrysmod:captainoflight")
	public static CaptainOfLight captainoflight;
	@GameRegistry.ObjectHolder("jerrysmod:slimestick")
	public static SlimeStick slimestick;
	@GameRegistry.ObjectHolder("jerrysmod:slimesword")
	public static SlimeSword slimesword;
	@GameRegistry.ObjectHolder("jerrysmod:slimepickaxe")
	public static SlimePickaxe slimepickaxe;
	@GameRegistry.ObjectHolder("jerrysmod:slimeaxe")
	public static SlimeAxe slimeaxe;
	@GameRegistry.ObjectHolder("jerrysmod:slimeshovel")
	public static SlimeShovel slimeshovel;
	@GameRegistry.ObjectHolder("jerrysmod:slimehoe")
	public static SlimeHoe slimehoe;
	@GameRegistry.ObjectHolder("jerrysmod:jerrysword")
	public static JerrySword jerrysword;
	@GameRegistry.ObjectHolder("jerrysmod:jerrypickaxe")
	public static JerryPickaxe jerrypickaxe;
	@GameRegistry.ObjectHolder("jerrysmod:jerryaxe")
	public static JerryAxe jerryaxe;
	@GameRegistry.ObjectHolder("jerrysmod:jerryshovel")
	public static JerryShovel jerryshovel;
	@GameRegistry.ObjectHolder("jerrysmod:jerryhoe")
	public static JerryHoe jerryhoe;
	@GameRegistry.ObjectHolder("jerrysmod:olive")
	public static Olive olive;
	@GameRegistry.ObjectHolder("jerrysmod:phone")
	public static Phone phone;
	@GameRegistry.ObjectHolder("jerrysmod:slimetamer")
	public static SlimeTamer slimetamer;
	@GameRegistry.ObjectHolder("jerrysmod:grapes")
	public static Grapes grapes;
	
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
	captainoflight.initModel();
	slimestick.initModel();
	slimesword.initModel();
	slimepickaxe.initModel();
	slimeaxe.initModel();
	slimeshovel.initModel();
	slimehoe.initModel();
	jerrysword.initModel();
	jerrypickaxe.initModel();
	jerryaxe.initModel();
	jerryshovel.initModel();
	jerryhoe.initModel();
	olive.initModel();
	phone.initModel();
	slimetamer.initModel();
	grapes.initModel();
}
	public static void initOreDict() {
		phone.initOreDict();
	}
}
