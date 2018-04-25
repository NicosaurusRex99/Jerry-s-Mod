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
package naturix.jerrysmod.registries;

import naturix.jerrysmod.items.*;
import naturix.jerrysmod.items.armor.*;
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
		grapes.initOreDict();
		olive.initOreDict();
		slimestick.initOreDict();
	}
}
