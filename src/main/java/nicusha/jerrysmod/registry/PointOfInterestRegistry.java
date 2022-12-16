package nicusha.jerrysmod.registry;

import com.google.common.collect.ImmutableSet;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.*;
import net.minecraft.resources.*;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.*;
import nicusha.jerrysmod.JerrysMod;

public class PointOfInterestRegistry {
    public static final DeferredRegister<PoiType> POI = DeferredRegister.create(ForgeRegistries.POI_TYPES, JerrysMod.MODID);

    public static final ResourceKey<Level> DREGS = ResourceKey.create(Registries.DIMENSION, new ResourceLocation(JerrysMod.MODID, "isle_of_dregs"));
    public static final RegistryObject<PoiType> DREGS_PORTAL = POI.register("isle_of_dregs_portal", () -> new PoiType(ImmutableSet.copyOf(BlockRegistry.dregs_portal.get().getStateDefinition().getPossibleStates()), 0, 1));

}
