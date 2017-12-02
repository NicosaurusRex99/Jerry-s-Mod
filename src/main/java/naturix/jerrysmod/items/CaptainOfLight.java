package naturix.jerrysmod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.registry.ModItems;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class CaptainOfLight extends Item {
	public String textureName;
	public CaptainOfLight(String unlocalizedName, ArmorMaterial material, String textureName, int type) {
	    	super();
	        this.textureName = textureName;
	        this.setUnlocalizedName(unlocalizedName);
	        this.setTextureName(JerrysMod.MODID + ":" + unlocalizedName);
	        this.setCreativeTab(ModItems.JerrysModTab);
	        

}
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entity) {
		float var4 = 1.0F;
		int i = (int) (entity.prevPosX + (entity.posX - entity.prevPosX) * (double) var4);
		int j = (int) (entity.prevPosY + (entity.posY - entity.prevPosY) * (double) var4 + 1.62D - (double) entity.yOffset);
		int k = (int) (entity.prevPosZ + (entity.posZ - entity.prevPosZ) * (double) var4);

		if (true) {
			world.spawnEntityInWorld(new EntityLightningBolt(world, i, j, k));
		}

		return itemstack;
	}
}
