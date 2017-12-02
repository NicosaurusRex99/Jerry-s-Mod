package naturix.jerrysmod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.registry.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class CaptainOfLight extends Item {
	public String textureName;
	private Minecraft            mc          = Minecraft.getMinecraft();
	
	public CaptainOfLight(String unlocalizedName, ArmorMaterial material, String textureName, int type) {
	    	super();
	        this.textureName = textureName;
	        this.setUnlocalizedName(unlocalizedName);
	        this.setTextureName(JerrysMod.MODID + ":" + unlocalizedName);
	        this.setCreativeTab(ModItems.JerrysModTab);
	        this.setMaxStackSize(1);
	        

}
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entity) {
		float var4 = 1.0F;
    	
		if (world.isRemote){
			MovingObjectPosition mop = entity.rayTrace(200, 10.0F);
			int xCoord;
    		int yCoord;
    		int zCoord;
    		
    			if (!world.isAirBlock(mop.blockX, mop.blockY, mop.blockZ)){ 
    			xCoord = mop.blockX;
			yCoord= mop.blockY + 1;
			zCoord = mop.blockZ;
    			} else {
    				xCoord = mop.blockX;
    				yCoord= mop.blockY;
    				zCoord = mop.blockZ;
    				}
			world.spawnEntityInWorld(new EntityLightningBolt(world, xCoord, yCoord, zCoord));
		}

		return itemstack;
	}
}
