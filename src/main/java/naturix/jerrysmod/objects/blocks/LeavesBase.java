package naturix.jerrysmod.objects.blocks;

import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.registry.ModBlocks;
import naturix.jerrysmod.registry.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;

public class LeavesBase extends LeavesBlock implements IShearable {

    public LeavesBase(Block.Properties props, String name){
        super(props);
        setRegistryName(name);
        ModBlocks.BLOCKS.add(this);
        BlockItem itemBlock = new BlockItem(this, new Item.Properties().group(JerrysMod.setup.itemGroup));
        itemBlock.setRegistryName(name);
        ModItems.ITEMS.add(itemBlock);
    }
    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
    entityIn.addVelocity(0, 1, 0);
    }
}