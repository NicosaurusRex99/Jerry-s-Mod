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
package naturix.jerrysmod.items;

import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.registry.ModItems;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class ItemModAxe extends ItemAxe {
	public ItemModAxe(String unlocalizedName, ToolMaterial material) {
        super(material);
        this.setUnlocalizedName(unlocalizedName);
        this.setTextureName(JerrysMod.MODID + ":" + unlocalizedName);
        this.setCreativeTab(ModItems.JerrysModTab);
}
}