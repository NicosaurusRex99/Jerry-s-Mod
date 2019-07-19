package naturix.jerrysmod.objects.items;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import javax.annotation.Nullable;
import java.util.List;

public class CaptainOfLight extends ItemBase {

    public CaptainOfLight(String name) {
        super(name);
    }
    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand) {
    if(world.isRemote) {
        LightningBoltEntity bolt = new LightningBoltEntity(world, player.getLookVec().getX(), player.getLookVec().getY(), player.getLookVec().getZ(), false);
        bolt.setLocationAndAngles(player.getLookVec().getX(), player.getLookVec().getY(), player.getLookVec().getZ(), player.rotationYaw, player.rotationPitch);
        world.addEntity(bolt);
    }
    return new ActionResult<>(ActionResultType.PASS, player.getHeldItem(hand));
    }
    @OnlyIn(Dist.CLIENT)
    @Override
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
    tooltip.add(new StringTextComponent("This item is not ready as of yet."));
    }

}
