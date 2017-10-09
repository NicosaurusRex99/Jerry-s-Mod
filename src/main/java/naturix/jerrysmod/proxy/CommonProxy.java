package naturix.jerrysmod.proxy;

import java.io.File;

import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.ModBlocks;
import naturix.jerrysmod.blocks.SlimeOre;
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
	        config = new Configuration(new File(directory.getPath(), "Just Another Ruby Mod.cfg"));
	        JerrysMod.logger.info("JARM config found");
	        JerrysMod.logger.info("JARM config read");
	    }

	    public void init(FMLInitializationEvent e)
	    {
	    	 JerrysMod.logger.info("JARM Initialized :D");
	    }
	    
	    public void postInit(FMLPostInitializationEvent e) 
	    {
	    	if (config.hasChanged()) {
	            config.save();
	            JerrysMod.logger.info("JARM config loaded");
	    }
	    }
	    @SubscribeEvent
	    public static void registerBlocks(RegistryEvent.Register<Block> event) {
	    	event.getRegistry().register(new SlimeOre(null));
	}
	    @SubscribeEvent
	    public static void registerItems(RegistryEvent.Register<Item> event) {
	    	event.getRegistry().register(new ItemBlock(ModBlocks.slimeore).setRegistryName(ModBlocks.slimeore.getRegistryName()));
	        JerrysMod.logger.info("Jerry's mod Items have just been loaded");
	    
	    }
}