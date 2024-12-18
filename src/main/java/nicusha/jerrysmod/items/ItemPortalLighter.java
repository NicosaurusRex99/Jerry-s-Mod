package nicusha.jerrysmod.items;

import net.minecraft.ChatFormatting;
import net.minecraft.core.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.*;
import net.minecraft.util.RandomSource;
import net.minecraft.world.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import nicusha.jerrysmod.JerrysMod;
import nicusha.jerrysmod.registry.*;

import java.util.List;

public class ItemPortalLighter extends Item {

    public ItemPortalLighter(){
        super(new Item.Properties().stacksTo(1).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(JerrysMod.MODID, "lighter"))));
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
//        Player player = context.getPlayer();
//        InteractionHand hand = context.getHand();
//        BlockPos pos = context.getClickedPos();
//        Direction facing = context.getClickedFace();
//        ItemStack itemstack = player.getItemInHand(hand);
//        Level worldIn = context.getLevel();
//        RandomSource random = context.getLevel().random;
//
//        if (!player.mayUseItemAt(pos, facing, itemstack)) {
//            return InteractionResult.FAIL;
//        }
//
//        if (facing != Direction.UP) {
//            return InteractionResult.FAIL;
//        }
//
//        if (!worldIn.isClientSide) {
//            worldIn.playSound(player, pos, SoundEvents.FLINTANDSTEEL_USE, SoundSource.BLOCKS, 1.0F,
//                    random.nextFloat() * 0.4F + 0.8F);
//            DregsPortal portalBlock;
//            for (Direction direction : Direction.Plane.VERTICAL) {
//                BlockPos framePos = context.getClickedPos().relative(direction);
//                if (worldIn.getBlockState(framePos.below()) == Blocks.SLIME_BLOCK.defaultBlockState()) {
//                    portalBlock = (DregsPortal) BlockRegistry.dregs_portal.get();
//                    portalBlock.makePortal(context.getLevel(), framePos);
//                    return InteractionResult.CONSUME;
//                }
//            }
//        }
        return InteractionResult.FAIL;
    }

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
        tooltipComponents.add(Component.translatable("tooltip.jerrysmod.wip").withStyle(ChatFormatting.BOLD).withStyle(ChatFormatting.RED));
    }
}
