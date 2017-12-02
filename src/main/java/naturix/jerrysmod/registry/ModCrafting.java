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
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModCrafting {
	public static void init() {
		GameRegistry.addSmelting(ModBlocks.SlimeOre, new ItemStack(ModItems.slimeShard), 1.0F);
	
		GameRegistry.addRecipe(new ItemStack(ModItems.jerryChestplate), new Object[] {"# #", "###", "###", '#', ModItems.jerryGem});
		GameRegistry.addRecipe(new ItemStack(ModItems.jerryHelmet), new Object[] {"###", "# #", "   ", '#', ModItems.jerryGem});
		GameRegistry.addRecipe(new ItemStack(ModItems.jerryBoots), new Object[] {"# #", "# #", "   ", '#', ModItems.jerryGem});
		GameRegistry.addRecipe(new ItemStack(ModItems.jerryLeggings), new Object[] {"###", "# #", "# #", '#', ModItems.jerryGem});

		GameRegistry.addRecipe(new ItemStack(ModItems.slimeChestplate), new Object[] {"# #", "###", "###", '#', ModItems.slimeGem});
		GameRegistry.addRecipe(new ItemStack(ModItems.slimeHelmet), new Object[] {"###", "# #", "   ", '#', ModItems.slimeGem});
		GameRegistry.addRecipe(new ItemStack(ModItems.slimeBoots), new Object[] {"# #", "# #", "   ", '#', ModItems.slimeGem});
		GameRegistry.addRecipe(new ItemStack(ModItems.slimeLeggings), new Object[] {"###", "# #", "# #", '#', ModItems.slimeGem});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.slimeGem), new Object[] {"###", "#Y#", "###", '#', Blocks.diamond_block, 'Y', ModItems.slimeShard});
		GameRegistry.addRecipe(new ItemStack(ModItems.jerryGem, 2), new Object[] {"###", "#Y#", "###", 'Y', Blocks.diamond_block, '#', ModItems.slimeGem});
		
		GameRegistry.addRecipe(new ItemStack(ModItems.jerryAxe, 1), new Object[] {"WW ","WQ "," Q ", 'W', ModItems.jerryGem, 'Q', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ModItems.jerrySpade, 1), new Object[] {" W "," Q "," Q ", 'W', ModItems.jerryGem, 'Q', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ModItems.jerrySword, 1), new Object[] {" W "," W "," Q ", 'W', ModItems.jerryGem, 'Q', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ModItems.jerryPickaxe, 1), new Object[] {"WWW"," Q "," Q ", 'W', ModItems.jerryGem, 'Q', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ModItems.jerryHoe, 1), new Object[] {"WW "," Q "," Q ", 'W', ModItems.jerryGem, 'Q', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ModItems.slimeAxe, 1), new Object[] {"WW ","WQ "," Q ", 'W', ModItems.slimeGem, 'Q', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ModItems.slimeSpade, 1), new Object[] {" W "," Q "," Q ", 'W', ModItems.slimeGem, 'Q', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ModItems.slimeSword, 1), new Object[] {" W "," W "," Q ", 'W', ModItems.slimeGem, 'Q', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ModItems.slimePickaxe, 1), new Object[] {"WWW"," Q "," Q ", 'W', ModItems.slimeGem, 'Q', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ModItems.slimeHoe, 1), new Object[] {"WW "," Q "," Q ", 'W', ModItems.slimeGem, 'Q', Items.stick});
		GameRegistry.addRecipe(new ItemStack(ModItems.captainOfLight, 1), new Object[] {" W"," Q ","Q  ", 'W', ModItems.slimeGem, 'Q', ModItems.jerryGem});
		
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.slimeStick), new Object[] {Items.stick, Items.slime_ball});
	}
}
