package naturix.jerrysmod.armor;

import naturix.jerrysmod.JerrysMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SlimeChestplate extends ItemArmor 
{
	public SlimeChestplate()
	{
		
		super(JerrysMod.SlimeArmorMaterial, 0, EntityEquipmentSlot.CHEST);
		ItemBase.registerItem("SlimeChestplate", this);
	}

	@Override
	public EnumRarity getRarity(ItemStack stack)
	{
		return EnumRarity.EPIC;
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
	{
		return "jerrysmod:textures/models/armor/slimearmor_layer_1.png";
	}


	@Override
	public int getMaxDamage()
	{
		return 8000001;
	}


	@Override
	public boolean isDamageable()
	{
		return true;
	}

	@SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}