package nicusha.jerrysmod.integration;


import net.neoforged.fml.ModList;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

public class ModIntegration {
    public static void initCommon(FMLCommonSetupEvent e){
        if(ModList.get().isLoaded("jeresources")){
            JERCompat.init();
        }
        if(ModList.get().isLoaded("projecte")){
//            ProjectECompat.init();
        }
    }
}
