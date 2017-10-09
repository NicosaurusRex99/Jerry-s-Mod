package naturix.jerrysmod.proxy;

import java.io.File;

import naturix.jerrysmod.JerrysMod;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

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
	}
