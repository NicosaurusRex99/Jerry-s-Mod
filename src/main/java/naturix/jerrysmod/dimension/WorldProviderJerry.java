package naturix.jerrysmod.dimension;

import naturix.jerrysmod.registries.ModDimensions;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.gen.IChunkGenerator;

public class WorldProviderJerry extends WorldProvider {
	

    @Override
    public DimensionType getDimensionType() {
        return ModDimensions.jerryDimensionType;
    }

    @Override
    public String getSaveFolder() {
        return "JerrysMod";
    }

    @Override
    public IChunkGenerator createChunkGenerator() {
        return new JerryChunkProvider(world);
    }
}