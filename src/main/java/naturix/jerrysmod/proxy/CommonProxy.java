package naturix.jerrysmod.proxy;

import java.io.File;

import naturix.jerrysmod.Config;
import naturix.jerrysmod.FurnaceRecipe;
import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.ModBlocks;
import naturix.jerrysmod.armor.JerryBoots;
import naturix.jerrysmod.armor.JerryChestplate;
import naturix.jerrysmod.armor.JerryHelmet;
import naturix.jerrysmod.armor.JerryLeggings;
import naturix.jerrysmod.armor.SlimeBoots;
import naturix.jerrysmod.armor.SlimeChestplate;
import naturix.jerrysmod.armor.SlimeHelmet;
import naturix.jerrysmod.armor.SlimeLeggings;
import naturix.jerrysmod.blocks.OliveLeaves;
import naturix.jerrysmod.blocks.OliveLog;
import naturix.jerrysmod.blocks.OlivePlanks;
import naturix.jerrysmod.blocks.OliveSapling;
import naturix.jerrysmod.blocks.SlimeOre;
import naturix.jerrysmod.items.CaptainOfLight;
import naturix.jerrysmod.items.JerryAxe;
import naturix.jerrysmod.items.JerryGem;
import naturix.jerrysmod.items.JerryPickaxe;
import naturix.jerrysmod.items.JerryShovel;
import naturix.jerrysmod.items.JerrySword;
import naturix.jerrysmod.items.SlimeAxe;
import naturix.jerrysmod.items.SlimeGem;
import naturix.jerrysmod.items.SlimeHoe;
import naturix.jerrysmod.items.SlimePickaxe;
import naturix.jerrysmod.items.SlimeShard;
import naturix.jerrysmod.items.SlimeShovel;
import naturix.jerrysmod.items.SlimeStick;
import naturix.jerrysmod.items.SlimeSword;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
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
	        
	        
	    }

	    public void init(FMLInitializationEvent e)
	    {
	    	FurnaceRecipe.init();
	    	JerrysMod.logger.info("Jerry's Mod Initialized");
	    }
	    
	    public void postInit(FMLPostInitializationEvent e) 
	    {
	    	if (config.hasChanged()) {
	            config.save();
	            JerrysMod.logger.info("Jerry's Mod config loaded");
	    }
	    }
	    @SubscribeEvent
	    public static void registerBlocks(RegistryEvent.Register<Block> event) {
	    	event.getRegistry().register(new SlimeOre(null));
	    	event.getRegistry().register(new OliveLeaves(null));
	    	event.getRegistry().register(new OliveLog(null));
	    	event.getRegistry().register(new OliveSapling(null));
	    	event.getRegistry().register(new OlivePlanks(null));
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
	    	event.getRegistry().register(new SlimeSword(null));
	    	event.getRegistry().register(new SlimePickaxe(null));
	    	event.getRegistry().register(new SlimeAxe(null));
	    	event.getRegistry().register(new SlimeShovel(null));
	    	event.getRegistry().register(new SlimeHoe(null));
	    	event.getRegistry().register(new JerrySword(null));
	    	event.getRegistry().register(new JerryPickaxe(null));
	    	event.getRegistry().register(new JerryAxe(null));
	    	event.getRegistry().register(new JerryShovel(null));
	    	event.getRegistry().register(new ItemBlock(ModBlocks.oliveleaves).setRegistryName(ModBlocks.oliveleaves.getRegistryName()));
	    	event.getRegistry().register(new ItemBlock(ModBlocks.olivelog).setRegistryName(ModBlocks.olivelog.getRegistryName()));
	    	event.getRegistry().register(new ItemBlock(ModBlocks.olivesapling).setRegistryName(ModBlocks.olivesapling.getRegistryName()));
	    	event.getRegistry().register(new ItemBlock(ModBlocks.oliveplanks).setRegistryName(ModBlocks.oliveplanks.getRegistryName()));
	    	
	    	JerrysMod.logger.info("Jerry's mod Items have just been loaded");
	    
	    }
}