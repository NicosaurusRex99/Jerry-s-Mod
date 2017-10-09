package naturix.jerrysmod.proxy;

import java.io.File;

import naturix.jerrysmod.FurnaceRecipe;
import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.ModBlocks;
import naturix.jerrysmod.armor.SlimeBoots;
import naturix.jerrysmod.armor.SlimeChestplate;
import naturix.jerrysmod.armor.SlimeHelmet;
import naturix.jerrysmod.armor.SlimeLeggings;
import naturix.jerrysmod.blocks.SlimeOre;
import naturix.jerrysmod.items.JerryGem;
import naturix.jerrysmod.items.SlimeGem;
import naturix.jerrysmod.items.SlimeShard;
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
	        JerrysMod.logger.info("JARM config found");
	        JerrysMod.logger.info("JARM config read");
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
	    	JerrysMod.logger.info("Jerry's mod Items have just been loaded");
	    
	    }
}