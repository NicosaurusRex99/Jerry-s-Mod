package naturix.jerrysmod.proxies;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import naturix.jerrysmod.registry.ModBlocks;
import naturix.jerrysmod.registry.ModCrafting;
import naturix.jerrysmod.registry.ModItems;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent e) {

    }

    public void init(FMLInitializationEvent e) {
    	ModItems.init();
    	ModBlocks.init();
    	ModCrafting.init();
    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}