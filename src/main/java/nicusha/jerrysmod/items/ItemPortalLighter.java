package nicusha.jerrysmod.items;

import net.minecraft.core.*;
import net.minecraft.sounds.*;
import net.minecraft.util.RandomSource;
import net.minecraft.world.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import nicusha.jerrysmod.blocks.DregsPortal;
import nicusha.jerrysmod.registry.*;

public class ItemPortalLighter extends ItemMod {

    public ItemPortalLighter(){
        super(new Properties().tab(TabRegistry.jerrysmod).stacksTo(1));
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Player player = context.getPlayer();
        InteractionHand hand = context.getHand();
        BlockPos pos = context.getClickedPos();
        Direction facing = context.getClickedFace();
        ItemStack itemstack = player.getItemInHand(hand);
        Level worldIn = context.getLevel();
        RandomSource random = context.getLevel().random;

        if (!player.mayUseItemAt(pos, facing, itemstack)) {
            return InteractionResult.FAIL;
        }

        if (facing != Direction.UP) {
            return InteractionResult.FAIL;
        }

        if (!worldIn.isClientSide) {
            worldIn.playSound(player, pos, SoundEvents.FLINTANDSTEEL_USE, SoundSource.BLOCKS, 1.0F,
                    random.nextFloat() * 0.4F + 0.8F);
            DregsPortal portalBlock;
            for (Direction direction : Direction.Plane.VERTICAL) {
                BlockPos framePos = context.getClickedPos().relative(direction);
                if (worldIn.getBlockState(framePos.below()) == Blocks.SLIME_BLOCK.defaultBlockState()) {
                    portalBlock = (DregsPortal) BlockRegistry.dregs_portal.get();
                    portalBlock.makePortal(context.getLevel(), framePos);
                    return InteractionResult.CONSUME;
                }
            }
        }
        return InteractionResult.FAIL;
    }
}
