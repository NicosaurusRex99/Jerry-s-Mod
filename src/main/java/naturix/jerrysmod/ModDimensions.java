package naturix.jerrysmod;
import naturix.jerrysmod.dimension.WorldProviderJerry;
import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class ModDimensions {

    public static DimensionType jerryDimensionType;

    public static void init() {
        registerDimensionTypes();
        registerDimensions();
    }

    private static void registerDimensionTypes() {
        jerryDimensionType = DimensionType.register(JerrysMod.MODID, "_jerrysmod", Config.dimensionId, WorldProviderJerry.class, false);
    }

    private static void registerDimensions() {
        DimensionManager.registerDimension(Config.dimensionId, jerryDimensionType);
    }
}