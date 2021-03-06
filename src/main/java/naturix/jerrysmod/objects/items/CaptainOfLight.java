package naturix.jerrysmod.objects.items;

import com.sun.javafx.geom.Vec3d;
import javafx.scene.effect.Light;
import naturix.jerrysmod.JerrysMod;
import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.util.text.IFormattableTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.Style;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;

public class CaptainOfLight extends ItemBase {

    public CaptainOfLight(String name) {
        super(name, new Item.Properties().maxStackSize(1).group(JerrysMod.setup.itemGroup));
    }


    //TODO - Fix captain of light
    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand handIn) {
        ItemStack itemstack = player.getHeldItem(handIn);
        if (!world.isRemote) {
            LightningBoltEntity ent = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, world);
            Vector3d start  = player.getEyePosition(1);
            Vector3d vec31 = player.getLook(32);
            Vector3d end = start.add(vec31.x * 32, vec31.y * 32, vec31.z * 32);
            BlockPos boltPos = player.world.rayTraceBlocks(new RayTraceContext(start, end, RayTraceContext.BlockMode.VISUAL, RayTraceContext.FluidMode.ANY, player)).getPos();
            ent.setPosition(boltPos.getX(), boltPos.getY(), boltPos.getZ());
            world.addEntity(ent);
        }
            player.addStat(Stats.ITEM_USED.get(this));

            return new ActionResult<>(ActionResultType.SUCCESS, itemstack);
        }

        @Nonnull
        public static BlockRayTraceResult rayTraceEyes(LivingEntity entity, float length){
            RayTraceContext context = new RayTraceContext(entity.getLookVec(), entity.getLook(length), RayTraceContext.BlockMode.COLLIDER,
                    RayTraceContext.FluidMode.NONE, entity);
            return entity.world.rayTraceBlocks(context);
        }

    }