/*
    Jerry's Mod - A Minecraft Mod
    Copyright (C) 2016-2017 Hawaii_Beach
    This program Is free software: you can redistribute it And/Or modify
    it under the terms Of the GNU General Public License As published by
    the Free Software Foundation, either version 3 Of the License, Or
    (at your option) any later version.
    This program Is distributed In the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty Of
    MERCHANTABILITY Or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License For more details.
    You should have received a copy Of the GNU General Public License
    along with this program.  If Not, see <http://www.gnu.org/licenses/>.
    */
package naturix.jerrysmod.registry;

import cpw.mods.fml.common.registry.GameRegistry;
import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.armour.ItemModArmour;
import naturix.jerrysmod.items.CaptainOfLight;
import naturix.jerrysmod.items.ItemModAxe;
import naturix.jerrysmod.items.ItemModHoe;
import naturix.jerrysmod.items.ItemModPickaxe;
import naturix.jerrysmod.items.ItemModSpade;
import naturix.jerrysmod.items.ItemModSword;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
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
	    public static Item slimeSword;
	    public static Item slimePickaxe;
	    public static Item slimeAxe;
	    public static Item slimeSpade;
	    public static Item slimeHoe;
	    public static Item jerrySword;
	    public static Item jerryPickaxe;
	    public static Item jerryAxe;
	    public static Item jerrySpade;
	    public static Item jerryHoe;
	    
	    
	    public static ArmorMaterial SLIME_ARMOR = EnumHelper.addArmorMaterial("SLIME_ARMOR", 15, new int[]{18, 51, 21, 30}, 9);
	    public static ArmorMaterial JERRY_ARMOR = EnumHelper.addArmorMaterial("JERRY_ARMOR", 15, new int[]{506013, 1658961, 341564, 454230}, 59);
	    public static ToolMaterial SLIME = EnumHelper.addToolMaterial("SLIME", 3, 1000, 15.0F, 4.0F, 30);
	    public static ToolMaterial JERRY = EnumHelper.addToolMaterial("JERRY", 5, 10000, 150.0F, 40.0F, 300);
	    
	    
	    public static final void init() {
	        slimeShard = new Item().setUnlocalizedName("slimeShard").setCreativeTab(ModItems.JerrysModTab).setTextureName(JerrysMod.MODID + ":slimeshard");;
	        slimeGem = new Item().setUnlocalizedName("slimeGem").setCreativeTab(ModItems.JerrysModTab).setTextureName(JerrysMod.MODID + ":slimegem");;
	        jerryGem = new Item().setUnlocalizedName("jerryGem").setCreativeTab(ModItems.JerrysModTab).setTextureName(JerrysMod.MODID + ":jerrygem");;
	        slimeStick = new Item().setUnlocalizedName("slimeStick").setCreativeTab(ModItems.JerrysModTab).setTextureName(JerrysMod.MODID + ":slimestick");;
	        slimeHead = new Item().setUnlocalizedName("slimeHead").setCreativeTab(ModItems.JerrysModTab).setTextureName(JerrysMod.MODID + ":slimehead");;
	        captainOfLight = new CaptainOfLight(null, JERRY_ARMOR, null, 0).setUnlocalizedName("captainOfLight").setCreativeTab(ModItems.JerrysModTab).setTextureName(JerrysMod.MODID + ":captainOfLight");;
	        
	        
	        GameRegistry.registerItem(slimeSword = new ItemModSword("slime_sword", SLIME), "slime_sword");       
	        GameRegistry.registerItem(slimePickaxe = new ItemModPickaxe("slime_pickaxe", SLIME), "slime_pickaxe");       
	        GameRegistry.registerItem(slimeAxe = new ItemModAxe("slime_axe", SLIME), "slime_axe");       
	        GameRegistry.registerItem(slimeSpade = new ItemModSpade("slime_spade", SLIME), "slime_spade");       
	        GameRegistry.registerItem(slimeHoe = new ItemModHoe("slime_hoe", SLIME), "slime_hoe");       
	        GameRegistry.registerItem(jerrySword = new ItemModSword("jerry_sword", JERRY), "jerry_sword");       
	        GameRegistry.registerItem(jerryPickaxe = new ItemModPickaxe("jerry_pickaxe", JERRY), "jerry_pickaxe");       
	        GameRegistry.registerItem(jerryAxe = new ItemModAxe("jerry_axe", JERRY), "jerry_axe");       
	        GameRegistry.registerItem(jerrySpade = new ItemModSpade("jerry_spade", JERRY), "jerry_spade");       
	        GameRegistry.registerItem(jerryHoe = new ItemModHoe("jerry_hoe", JERRY), "jerry_hoe");       
	        
	        
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