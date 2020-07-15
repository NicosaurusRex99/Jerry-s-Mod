package naturix.jerrysmod.objects.blocks;

import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.registry.ModBlocks;
import naturix.jerrysmod.registry.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

import static naturix.jerrysmod.JerrysMod.MODID;

public class StairsBase extends StairsBlock {
    public StairsBase(String name, BlockState state, Block.Properties props){
        super(state, props);
        setRegistryName(JerrysMod.MODID, name);
    }
}
