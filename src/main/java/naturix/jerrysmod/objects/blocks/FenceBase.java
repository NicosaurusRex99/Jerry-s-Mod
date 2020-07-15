package naturix.jerrysmod.objects.blocks;

import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.registry.ModBlocks;
import naturix.jerrysmod.registry.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

public class FenceBase extends FenceBlock {
    public FenceBase(String name) {
        super(Block.Properties
                .create(Material.ROCK)
                .hardnessAndResistance(1.0f, 1.0f)
                .harvestTool(ToolType.AXE)
                .func_235861_h_()
        );
        setRegistryName(JerrysMod.MODID, name);
    }
}
