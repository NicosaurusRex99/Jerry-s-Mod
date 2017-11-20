package naturix.jerrysmod;

import naturix.jerrysmod.command.DimensionTp;
import naturix.jerrysmod.proxy.CommonProxy;
import naturix.jerrysmod.registries.ModItems;
import naturix.jerrysmod.world.WorldGen;
import naturix.jerrysmod.world.WorldGenTreesJM;
import net.minecraft.creativetab.CreativeTabs;
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
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = JerrysMod.MODID, version = JerrysMod.VERSION, name = JerrysMod.NAME)
public class JerrysMod
{
    public static final String MODID = "jerrysmod";
    public static final String VERSION = "1.12.2.0E";
    public static final String NAME = "Jerry's Mod";
    

    @SidedProxy(clientSide = "naturix.jerrysmod.proxy.ClientProxy", serverSide = "naturix.jerrysmod.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static JerrysMod instance;
 

    public static org.apache.logging.log4j.Logger logger;
    
    public static final ItemArmor.ArmorMaterial SlimeArmorMaterial = EnumHelper.addArmorMaterial("Slime", MODID + ":slime", 15, new int[]{18, 51, 21, 30}, 9, SoundEvents.ENTITY_SLIME_SQUISH, 0.0F);
    public static final Item.ToolMaterial SlimeToolMaterial = EnumHelper.addToolMaterial("Slime", 74, 4096, 40, 124, 42);
    public static final ItemArmor.ArmorMaterial JerryArmorMaterial = EnumHelper.addArmorMaterial("Jerry", MODID + "jerry", 15, new int[]{54, 111, 75, 60}, 9, SoundEvents.ENTITY_SLIME_JUMP, 0.5F);
    public static final Item.ToolMaterial JerryToolMaterial = EnumHelper.addToolMaterial("Jerry", 99, 6142, 321, 844, 50);
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	logger = event.getModLog();
        proxy.preInit(event);
        GameRegistry.registerWorldGenerator(new WorldGen(), 3);
        GameRegistry.registerWorldGenerator(new WorldGenTreesJM(), Config.OLIVE_GEN_CHANCE);
        
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
    @Mod.EventHandler
    public void serverLoad(FMLServerStartingEvent event) {
        event.registerServerCommand(new DimensionTp());
    }
    
    public static final CreativeTabs JerrysMod = new CreativeTabs("Jerry's Mod")
    {

        @SideOnly(Side.CLIENT)
        public ItemStack getTabIconItem()
        {
            return new ItemStack(ModItems.jerrysword);
        }
		
    };
}