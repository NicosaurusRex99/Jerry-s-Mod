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
package naturix.jerrysmod.proxy;

import java.io.File;

import naturix.jerrysmod.Config;
import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.blocks.OliveLeaves;
import naturix.jerrysmod.blocks.OliveLog;
import naturix.jerrysmod.blocks.OlivePlanks;
import naturix.jerrysmod.blocks.OliveSapling;
import naturix.jerrysmod.blocks.SlimeGrass;
import naturix.jerrysmod.blocks.SlimeOre;
import naturix.jerrysmod.blocks.SlimeStone;
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
import naturix.jerrysmod.items.armor.JerryBoots;
import naturix.jerrysmod.items.armor.JerryChestplate;
import naturix.jerrysmod.items.armor.JerryHelmet;
import naturix.jerrysmod.items.armor.JerryLeggings;
import naturix.jerrysmod.items.armor.SlimeBoots;
import naturix.jerrysmod.items.armor.SlimeChestplate;
import naturix.jerrysmod.items.armor.SlimeHelmet;
import naturix.jerrysmod.items.armor.SlimeLeggings;
import naturix.jerrysmod.registries.ModBlocks;
import naturix.jerrysmod.registries.ModDimensions;
import naturix.jerrysmod.registries.ModItems;
import naturix.jerrysmod.registries.ModRecipes;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
	public class CommonProxy {
		public static Configuration config;
		public void preInit(FMLPreInitializationEvent e) 
		{
			File directory = e.getModConfigurationDirectory();
	        config = new Configuration(new File(directory.getPath(), "Jerry's Mod.cfg"));
	        JerrysMod.logger.info("Jerry's Mod config found");
	        Config.readConfig();
	        JerrysMod.logger.info("Jerry's Mod config read");
	        ModDimensions.init();
	        
	    }

	    public void init(FMLInitializationEvent e)
	    {
	    	ModRecipes.init();
	        ModItems.initOreDict();
	        ModBlocks.initOreDict();
	        JerrysMod.logger.info("Jerry's Mod Initialized");
	    }
	    
	    public void postInit(FMLPostInitializationEvent e) 
	    {
	    	if (config.hasChanged()) {
	            config.save();
	            JerrysMod.logger.info("Jerry's Mod config loaded");
	    }
	    }
		@EventHandler
		public void serverLoad(FMLServerStartingEvent event) 
		{
		}
			
			
	    @SubscribeEvent
	    public static void registerBlocks(RegistryEvent.Register<Block> event) {
	    	event.getRegistry().register(new SlimeOre(null));
	    	event.getRegistry().register(new OlivePlanks(null));
	    	event.getRegistry().register(new SlimeStone(null));
	    	event.getRegistry().register(new SlimeGrass(null));
	    	event.getRegistry().register(new OliveLog()); 
	    	event.getRegistry().register(new OliveLeaves()); 
	    	event.getRegistry().register(new OliveSapling());
	}
	    @SubscribeEvent
	    public static void registerItems(RegistryEvent.Register<Item> event) {
	    	event.getRegistry().register(new ItemBlock(ModBlocks.slimeore).setRegistryName(ModBlocks.slimeore.getRegistryName()));
	    	event.getRegistry().register(new SlimeShard());
	    	event.getRegistry().register(new SlimeGem());
	    	event.getRegistry().register(new JerryGem());
	    	event.getRegistry().register(new SlimeHelmet());
	    	event.getRegistry().register(new SlimeChestplate());
	    	event.getRegistry().register(new SlimeLeggings());
	    	event.getRegistry().register(new SlimeBoots());
	    	event.getRegistry().register(new JerryHelmet());
	    	event.getRegistry().register(new JerryChestplate());
	    	event.getRegistry().register(new JerryLeggings());
	    	event.getRegistry().register(new JerryBoots());
	    	event.getRegistry().register(new CaptainOfLight());
	    	event.getRegistry().register(new SlimeStick());
	    	event.getRegistry().register(new Olive());
	    	event.getRegistry().register(new Phone());
	    	event.getRegistry().register(new SlimeTamer(null));
	    	event.getRegistry().register(new Grapes());
	    	event.getRegistry().register(new SlimeSword(JerrysMod.SlimeToolMaterial));
	    	event.getRegistry().register(new SlimePickaxe(JerrysMod.SlimeToolMaterial));
	    	event.getRegistry().register(new SlimeAxe(JerrysMod.SlimeToolMaterial));
	    	event.getRegistry().register(new SlimeShovel(JerrysMod.SlimeToolMaterial));
	    	event.getRegistry().register(new SlimeHoe(JerrysMod.SlimeToolMaterial));
	    	event.getRegistry().register(new JerrySword(JerrysMod.JerryToolMaterial));
	    	event.getRegistry().register(new JerryPickaxe(JerrysMod.JerryToolMaterial));
	    	event.getRegistry().register(new JerryAxe(JerrysMod.JerryToolMaterial));
	    	event.getRegistry().register(new JerryShovel(JerrysMod.JerryToolMaterial));
	    	event.getRegistry().register(new JerryHoe(JerrysMod.JerryToolMaterial));
	    	event.getRegistry().register(new ItemBlock(ModBlocks.slimestone).setRegistryName(ModBlocks.slimestone.getRegistryName()));
	    	event.getRegistry().register(new ItemBlock(ModBlocks.oliveleaves).setRegistryName(ModBlocks.oliveleaves.getRegistryName()));
	    	event.getRegistry().register(new ItemBlock(ModBlocks.olivelog).setRegistryName(ModBlocks.olivelog.getRegistryName()));
	    	event.getRegistry().register(new ItemBlock(ModBlocks.oliveplanks).setRegistryName(ModBlocks.oliveplanks.getRegistryName()));
	    	event.getRegistry().register(new ItemBlock(ModBlocks.slimegrass).setRegistryName(ModBlocks.slimegrass.getRegistryName()));
	    	event.getRegistry().register(new ItemBlock(ModBlocks.olivesapling).setRegistryName(ModBlocks.olivesapling.getRegistryName()));
	    	
	    	JerrysMod.logger.info("Jerry's mod Items have just been loaded"); 
	   
	    }
}