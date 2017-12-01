package naturix.jerrysmod.registry;

import cpw.mods.fml.common.registry.GameRegistry;
import naturix.jerrysmod.JerrysMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public final class ModItems {

	    public static Item slimeShard;
 
	    public static final void init() {
	        slimeShard = new Item().setUnlocalizedName("slimeShard").setCreativeTab(ModItems.JerrysModTab).setTextureName(JerrysMod.MODID + ":slimeshard");;
	        GameRegistry.registerItem(slimeShard, "slimeShard");
}
	    public static final CreativeTabs JerrysModTab = new CreativeTabs("Jerry's Mod") {
	        @Override public Item getTabIconItem() {
	            return ModItems.slimeShard;
	        }
	    };
}