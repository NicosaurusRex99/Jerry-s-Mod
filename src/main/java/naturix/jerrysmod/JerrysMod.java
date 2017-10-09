package naturix.jerrysmod;

import java.util.logging.Logger;

import naturix.jerrysmod.proxy.CommonProxy;
import naturix.jerrysmod.proxy.WorldGen;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = JerrysMod.MODID, version = JerrysMod.VERSION)
public class JerrysMod
{
    public static final String MODID = "jerrysmod";
    public static final String VERSION = "1.12.2.0";
    

    @SidedProxy(clientSide = "naturix.jerrysmod.proxy.ClientProxy", serverSide = "naturix.jerrysmod.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static JerrysMod instance;

    public static org.apache.logging.log4j.Logger logger;
    
    public static final ItemArmor.ArmorMaterial SlimeArmorMaterial = EnumHelper.addArmorMaterial("Slime", MODID + ":ruby", 15, new int[]{4, 3, 2, 1}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
    public static final Item.ToolMaterial SlimeToolMaterial = EnumHelper.addToolMaterial("Slime", 4, 4096, 14, 9, 19);


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	logger = event.getModLog();
        proxy.preInit(event);
        GameRegistry.registerWorldGenerator(new WorldGen(), 3);

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
    
    public static final CreativeTabs JerrysMod = new CreativeTabs("Jerry's Mod")
    {

        @SideOnly(Side.CLIENT)
        public ItemStack getTabIconItem()
        {
            return new ItemStack(Blocks.SLIME_BLOCK);
        }
		
    };
}