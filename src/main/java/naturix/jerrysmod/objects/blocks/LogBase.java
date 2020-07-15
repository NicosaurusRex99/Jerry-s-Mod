package naturix.jerrysmod.objects.blocks;

import naturix.jerrysmod.JerrysMod;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RotatedPillarBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class LogBase extends RotatedPillarBlock {

    Item.Properties properties;
    public LogBase(String name, Block.Properties props){
        super(props);
        setRegistryName(JerrysMod.MODID, name);
    }

    @Override
    public ActionResultType onBlockActivated(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult rayTraceResult) {

        if (!world.isRemote())
        {
            ItemStack itemStack = player.getHeldItem(hand);
            if (itemStack.getItem() instanceof AxeItem)
            {
                BlockState sourceState = world.getBlockState(pos);
                //TODO - Fix stripped log
//                world.setBlockState(pos, ModBlocks.slime_log_stripped.getDefaultState(), 3);
                itemStack.damageItem(1, player, (p_220040_1_) -> p_220040_1_.sendBreakAnimation(hand));
                return ActionResultType.PASS;
            }
        }
        return ActionResultType.FAIL;
    }
}
