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

import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.entity.EntityTameSlime;
import naturix.jerrysmod.entity.RenderTameSlime;  
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModEntities {
	private static ResourceLocation mobName = new ResourceLocation("jerrysmod:tameslime");

    public static void init() {
        int id = 1;
        EntityRegistry.registerModEntity(mobName, EntityTameSlime.class, "tameslime", id++, JerrysMod.instance, 64, 3, true, 0x996600, 0x00ff00);
        EntityRegistry.addSpawn(EntityTameSlime.class, 100, 3, 5, EnumCreatureType.CREATURE);

    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        RenderingRegistry.registerEntityRenderingHandler(EntityTameSlime.class, RenderTameSlime.FACTORY);
    }
}
