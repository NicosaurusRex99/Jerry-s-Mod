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
import naturix.jerrysmod.blocks.SlimeOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class ModBlocks {

    public static Block SlimeOre;

    public static final void init() {
        GameRegistry.registerBlock(SlimeOre = new SlimeOre("SlimeOre", Material.rock), "SlimeOre").setBlockTextureName(JerrysMod.MODID + ":slimeore");;
    }
}