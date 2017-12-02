package naturix.jerrysmod.registry;

import cpw.mods.fml.common.registry.GameRegistry;
import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.armour.ItemModArmour;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public final class ModItems {

	    public static Item slimeShard;
	    public static Item slimeGem;
	    public static Item jerryGem;
	    public static Item slimeStick;
	    public static Item captainOfLight;
	    
	    
	    public static Item slimeHelmet;
	    public static Item slimeChestplate;
	    public static Item slimeLeggings;
	    public static Item slimeBoots;
	    public static Item jerryHelmet;
	    public static Item jerryChestplate;
	    public static Item jerryLeggings;
	    public static Item jerryBoots;
	    public static Item slimeHead;
	    
	    
	    public static ArmorMaterial SLIME_ARMOR = EnumHelper.addArmorMaterial("SLIME_ARMOR", 15, new int[]{18, 51, 21, 30}, 9);
	    public static ArmorMaterial JERRY_ARMOR = EnumHelper.addArmorMaterial("JERRY_ARMOR", 15, new int[]{40, 1658961, 3564, 230}, 59);
	    public static final void init() {
	        slimeShard = new Item().setUnlocalizedName("slimeShard").setCreativeTab(ModItems.JerrysModTab).setTextureName(JerrysMod.MODID + ":slimeshard");;
	        slimeGem = new Item().setUnlocalizedName("slimeGem").setCreativeTab(ModItems.JerrysModTab).setTextureName(JerrysMod.MODID + ":slimegem");;
	        jerryGem = new Item().setUnlocalizedName("jerryGem").setCreativeTab(ModItems.JerrysModTab).setTextureName(JerrysMod.MODID + ":jerrygem");;
	        slimeStick = new Item().setUnlocalizedName("slimeStick").setCreativeTab(ModItems.JerrysModTab).setTextureName(JerrysMod.MODID + ":slimestick");;
	        slimeHead = new Item().setUnlocalizedName("slimeHead").setCreativeTab(ModItems.JerrysModTab).setTextureName(JerrysMod.MODID + ":slimehead");;
	        captainOfLight = new CaptainOfLight.setUnlocalizedName("captainOfLight").setCreativeTab(ModItems.JerrysModTab).setTextureName(JerrysMod.MODID + ":captainOfLight");;
	               
	        	        
	        GameRegistry.registerItem(slimeShard, "slimeShard");
	        GameRegistry.registerItem(slimeGem, "slimeGem");
	        GameRegistry.registerItem(jerryGem, "jerryGem");
	        GameRegistry.registerItem(slimeStick, "slimeStick");
	        GameRegistry.registerItem(slimeHead, "slimeHead");
	        GameRegistry.registerItem(captainOfLight, "captainOfLight");
	        
	        
	        GameRegistry.registerItem(slimeHelmet = new ItemModArmour("slime_helmet", SLIME_ARMOR, "slime", 0), "slime_helmet"); //0 for helmet
	        GameRegistry.registerItem(slimeChestplate = new ItemModArmour("slime_chestplate", SLIME_ARMOR, "slime", 1), "slime_chestplate"); // 1 for chestplate
	        GameRegistry.registerItem(slimeLeggings = new ItemModArmour("slime_leggings", SLIME_ARMOR, "slime", 2), "slime_leggings"); // 2 for leggings
	        GameRegistry.registerItem(slimeBoots = new ItemModArmour("slime_boots", SLIME_ARMOR, "slime", 3), "slime_boots"); // 3 for boots
	        GameRegistry.registerItem(jerryHelmet = new ItemModArmour("jerry_helmet", JERRY_ARMOR, "jerry", 0), "jerry_helmet"); //0 for helmet
	        GameRegistry.registerItem(jerryChestplate = new ItemModArmour("jerry_chestplate", JERRY_ARMOR, "jerry", 1), "jerry_chestplate"); // 1 for chestplate
	        GameRegistry.registerItem(jerryLeggings = new ItemModArmour("jerry_leggings", JERRY_ARMOR, "jerry", 2), "jerry_leggings"); // 2 for leggings
	        GameRegistry.registerItem(jerryBoots = new ItemModArmour("jerry_boots", JERRY_ARMOR, "jerry", 3), "jerry_boots"); // 3 for boots
	        }
	    public static final CreativeTabs JerrysModTab = new CreativeTabs("Jerry's Mod") {
	        @Override public Item getTabIconItem() {
	            return ModItems.slimeShard;
	        }
	    };
}