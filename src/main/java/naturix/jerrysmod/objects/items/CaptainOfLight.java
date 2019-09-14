package naturix.jerrysmod.objects.items;

import naturix.jerrysmod.JerrysMod;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import javax.annotation.Nonnull;


public class CaptainOfLight extends ItemBase {

    public CaptainOfLight(String name) {
        super(name, new Item.Properties().maxStackSize(1).group(JerrysMod.setup.itemGroup));
    }

    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand handIn) {
        ItemStack itemstack = player.getHeldItem(handIn);
        double blockReachDistance = 128;
        BlockRayTraceResult rayTrace = rayTraceEyes(player, blockReachDistance + 1);
        if (rayTrace.getType() == RayTraceResult.Type.BLOCK && !world.isRemote) {
            world.addEntity(new LightningBoltEntity(world, rayTrace.getPos().getX(), rayTrace.getPos().getY(), rayTrace.getPos().getZ(), false));
        }
            player.addStat(Stats.ITEM_USED.get(this));

            return new ActionResult<>(ActionResultType.SUCCESS, itemstack);
        }

        @Nonnull
        public static BlockRayTraceResult rayTraceEyes(LivingEntity entity,double length){
            Vec3d startPos = new Vec3d(entity.posX, entity.posY + entity.getEyeHeight(), entity.posZ);
            Vec3d endPos = startPos.add(new Vec3d(entity.getLookVec().x * length, entity.getLookVec().y * length, entity.getLookVec().z * length));
            RayTraceContext context = new RayTraceContext(startPos, endPos, RayTraceContext.BlockMode.COLLIDER,
                    RayTraceContext.FluidMode.NONE, entity);
            return entity.world.rayTraceBlocks(context);
        }
    }