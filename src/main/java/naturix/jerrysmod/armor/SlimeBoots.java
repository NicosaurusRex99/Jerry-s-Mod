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

public class SlimeBoots extends ItemArmor 
{
	public SlimeBoots()
	{
		super(JerrysMod.SlimeArmorMaterial, 0, EntityEquipmentSlot.FEET);
		ItemBase.registerItem("SlimeBoots", this);
	}

	@Override
	public EnumRarity getRarity(ItemStack stack)
	{
		return EnumRarity.RARE;
	}
	
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type)
	{
		return "jerrysmod:textures/models/armor/slimeboots.png";
	}


	@Override
	public int getMaxDamage()
	{
		return 6500001;
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