package nicusha.jerrysmod.integration;

import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

public class ModIntegration {
    public static void initCommon(FMLCommonSetupEvent e){
        if(ModList.get().isLoaded("jeresources")){
            JERCompat.init();
        }
        if(ModList.get().isLoaded("projecte")){
            ProjectECompat.init();
        }
    }
}
