package naturix.jerrysmod.objects.blocks;

import naturix.jerrysmod.registry.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.LogBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.Item;

public class LogBase extends LogBlock {

    Item.Properties properties;
    public LogBase(String name){
        super(MaterialColor.GREEN_TERRACOTTA, Block.Properties
                .create(Material.ROCK)
                .hardnessAndResistance(1.0f, 1.0f));
        setRegistryName(name);
        ModBlocks.BLOCKS.add(this);
    }
}
