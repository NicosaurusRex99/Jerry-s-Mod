package naturix.jerrysmod.items;

import naturix.jerrysmod.JerrysMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class CaptainOfLight extends Item {
	private BlockPos blockPos;
    public CaptainOfLight() {
        setRegistryName("captainoflight");        // The unique name (within your mod) that identifies this item
        setUnlocalizedName(JerrysMod.MODID + ".captainoflight");     // Used for localization (en_US.lang)
        setCreativeTab(JerrysMod.JerrysMod);
        setMaxStackSize(1);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
    
    @Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entity, EnumHand hand) {
		float var4 = 1.0F;
		ActionResult<ItemStack> ar = super.onItemRightClick(world, entity, hand);
		
		RayTraceResult pos = entity.rayTrace(100, 20);

			double i = pos.getBlockPos().getX();
			double j = pos.getBlockPos().getY();
			double k = pos.getBlockPos().getZ();

		
		
		if (true) {
			world.spawnEntity(new EntityLightningBolt(world, i, j, k, false));
		}

		return ar;
	}

}