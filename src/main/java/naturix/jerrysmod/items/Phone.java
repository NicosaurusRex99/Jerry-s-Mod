package naturix.jerrysmod.items;

import akka.Main;
import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.GUI.GUIPhone;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public class Phone extends Item {

	public Phone() {
		super();
		setRegistryName("phone");
        setUnlocalizedName(JerrysMod.MODID + ".phone");
		setCreativeTab(JerrysMod.JerrysMod);
		setMaxStackSize(1);
	}

	
	public void initOreDict() {
		OreDictionary.registerOre("phone", this);
	}
	@SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

    
	
}