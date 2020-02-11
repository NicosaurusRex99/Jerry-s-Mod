package naturix.jerrysmod.objects.blocks;

import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.registry.ModBlocks;
import naturix.jerrysmod.registry.ModItems;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public class GateBase extends FenceGateBlock {
    public GateBase(String name, Properties props) {
        super(props);
        setRegistryName(name);
        ModBlocks.BLOCKS.add(this);
        BlockItem itemBlock = new BlockItem(this, new Item.Properties().group(JerrysMod.setup.itemGroup));
        itemBlock.setRegistryName(name);
        ModItems.ITEMS.add(itemBlock);
    }
}
