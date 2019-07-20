package naturix.jerrysmod.objects.blocks;

import naturix.jerrysmod.registry.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class LeavesBase extends LeavesBlock {

    Item.Properties properties;
    public LeavesBase(String name){
        super(Block.Properties
                .create(Material.LEAVES)
                .hardnessAndResistance(1.0f, 1.0f));
        setRegistryName(name);
        ModBlocks.BLOCKS.add(this);
    }
    public boolean ticksRandomly(BlockState state) {
        return false;
    }
    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
    entityIn.addVelocity(0, 1, 0);
    }
}