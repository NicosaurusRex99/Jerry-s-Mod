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
package naturix.jerrysmod.proxies;

import java.io.File;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import naturix.jerrysmod.Config;
import naturix.jerrysmod.registry.ModBlocks;
import naturix.jerrysmod.registry.ModCrafting;
import naturix.jerrysmod.registry.ModItems;
import naturix.jerrysmod.worldgen.ModWorldGen;
import net.minecraftforge.common.config.Configuration;

public class CommonProxy {

	public static Configuration config;

    public void preInit(FMLPreInitializationEvent e) {
    	File directory = e.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "Jerry's Mod.cfg"));
        Config.readConfig();
    }

    public void init(FMLInitializationEvent e) {
    	ModItems.init();
    	ModBlocks.init();
    	ModCrafting.init();
    	GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}