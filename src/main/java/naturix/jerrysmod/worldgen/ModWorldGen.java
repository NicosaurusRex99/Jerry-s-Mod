/*
    Jerry's Mod - A Minecraft Mod
    Copyright (C) 2016-2017 Hawaii_Beach
    This program Is free software: you can redistribute it And/Or modify
    it under the terms Of the GNU General Public License As published by
    the Free Software Foundation, either version 3 Of the License, Or
    (at your option) any later version.
    This program Is distributed In the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty Of
    MERCHANTABILITY Or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License For more details.
    You should have received a copy Of the GNU General Public License
    along with this program.  If Not, see <http://www.gnu.org/licenses/>.
    */
package naturix.jerrysmod.worldgen;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import naturix.jerrysmod.registry.ModBlocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;

public class ModWorldGen implements IWorldGenerator {
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.dimensionId) {
        case 0: //Overworld
            this.runGenerator(this.SlimeOre, world, random, chunkX, chunkZ, 20, 0, 64);
            break;
        case -1: //Nether

            break;
        case 1: //End

            break;
        }
    }
    private WorldGenerator SlimeOre; //Generates Tutorial Ore (used in Overworld)

    public ModWorldGen() {
        this.SlimeOre = new WorldGenMinable(ModBlocks.SlimeOre, 4);
    }
    private void runGenerator(WorldGenerator generator, World world, Random rand, int chunk_X, int chunk_Z, int chancesToSpawn, int minHeight, int maxHeight) {
        if (minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
            throw new IllegalArgumentException("Illegal Height Arguments for WorldGenerator");

        int heightDiff = maxHeight - minHeight + 1;
        for (int i = 0; i < chancesToSpawn; i ++) {
            int x = chunk_X * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDiff);
            int z = chunk_Z * 16 + rand.nextInt(16);
            generator.generate(world, rand, x, y, z);
        }
    }
}