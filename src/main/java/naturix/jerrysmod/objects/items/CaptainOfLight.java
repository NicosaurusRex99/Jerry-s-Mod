package naturix.jerrysmod.objects.items;

import javafx.scene.effect.Light;
import naturix.jerrysmod.JerrysMod;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FishingBobberEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;


public class CaptainOfLight extends ItemBase {

    public CaptainOfLight(String name) {
        super(name, new Item.Properties().maxStackSize(1).group(JerrysMod.setup.itemGroup));
    }

    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand handIn) {
        ItemStack itemstack = player.getHeldItem(handIn);
        Vec3d start  = player.getEyePosition(1);
        Vec3d end = start.add(player.getLookVec().x * 100, player.getLookVec().y * 100, player.getLookVec().z * 100);
        BlockPos pos = new BlockPos(end);
            if (!world.isRemote) {
                //FIXME - Currently does not spawn a lightning bolt
                LightningBoltEntity boltEntity = new LightningBoltEntity(world, pos.getX(), pos.getY(), pos.getZ(), true);
                boltEntity.setLocationAndAngles(pos.getX(), pos.getY(), pos.getZ(), player.rotationYaw, player.rotationPitch);
                world.addEntity(boltEntity);
            }
            player.swingArm(handIn);
            player.addStat(Stats.ITEM_USED.get(this));

        return new ActionResult<>(ActionResultType.SUCCESS, itemstack);
    }
}
