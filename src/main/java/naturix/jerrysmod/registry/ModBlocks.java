package naturix.jerrysmod.registry;

import cpw.mods.fml.common.registry.GameRegistry;
import naturix.jerrysmod.blocks.SlimeOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public final class ModBlocks {

    public static Block SlimeOre;

    public static final void init() {
        GameRegistry.registerBlock(SlimeOre = new SlimeOre("SlimeOre", Material.rock), "SlimeOre");
    }
}