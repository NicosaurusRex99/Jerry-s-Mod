package naturix.jerrysmod.objects.blocks;

import naturix.jerrysmod.JerrysMod;
import net.minecraft.block.Block;
import net.minecraft.block.LeavesBlock;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class LeavesBase extends LeavesBlock {

    public LeavesBase(String name, Block.Properties props){
        super(props);
        setRegistryName(JerrysMod.MODID, name);
    }
    @Override
    public void onEntityWalk(World worldIn, BlockPos pos, Entity entityIn) {
    entityIn.addVelocity(0, 1, 0);
    }

}