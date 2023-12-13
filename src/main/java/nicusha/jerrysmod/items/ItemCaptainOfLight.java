package nicusha.jerrysmod.items;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.*;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.*;
import net.minecraft.world.phys.*;
import nicusha.jerrysmod.JerrysMod;

public class ItemCaptainOfLight extends ItemMod {

    public ItemCaptainOfLight() {
        super(new Item.Properties().stacksTo(1));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        int blockReachDistance = 128;
        Vec3 vec3d = player.getEyePosition(1);
        Vec3 vec3d1 = player.getViewVector(1);
        Vec3 vec3d2 = vec3d.add(vec3d1.x * blockReachDistance, vec3d1.y * blockReachDistance, vec3d1.z * blockReachDistance);
        BlockHitResult pos = player.level().clip(new ClipContext(vec3d, vec3d2, ClipContext.Block.COLLIDER, ClipContext.Fluid.NONE, player));

        if (world.getBlockState(pos.getBlockPos()) != null) {
            LightningBolt bolt1 = new LightningBolt(EntityType.LIGHTNING_BOLT, world), bolt2 = new LightningBolt(EntityType.LIGHTNING_BOLT, world), bolt3 = new LightningBolt(EntityType.LIGHTNING_BOLT, world);
            bolt1.moveTo(pos.getLocation());
            bolt2.moveTo(pos.getLocation());
            bolt3.moveTo(pos.getLocation());
            world.addFreshEntity(bolt1);
            world.addFreshEntity(bolt2);
            world.addFreshEntity(bolt3);
            if (!player.isCreative()) {
                stack.hurtAndBreak(1, player, (p_220009_1_) -> {
                    p_220009_1_.broadcastBreakEvent(player.getUsedItemHand());
                });
            }
            if(player instanceof ServerPlayer){
                if(!((ServerPlayer) player).getAdvancements().getOrStartProgress(((ServerPlayer) player).server.getAdvancements().get(new ResourceLocation(JerrysMod.MODID, "captain_of_light"))).isDone()) {
                    ((ServerPlayer) player).getAdvancements().award(((ServerPlayer) player).server.getAdvancements().get(new ResourceLocation(JerrysMod.MODID, "captain_of_light")), ((ServerPlayer) player).getAdvancements().getOrStartProgress(((ServerPlayer) player).server.getAdvancements().get(new ResourceLocation(JerrysMod.MODID, "captain_of_light"))).getRemainingCriteria().iterator().next());
                }
            }
        }

        return new InteractionResultHolder<ItemStack>(InteractionResult.SUCCESS, stack);
    }
}
