package naturix.jerrysmod.items;

import naturix.jerrysmod.JerrysMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemFood;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public class Olive extends ItemFood {

	public Olive() {
		super(1, 0.6f, false);
		setRegistryName("olive");
        setUnlocalizedName(JerrysMod.MODID + ".olive");
		setCreativeTab(JerrysMod.JerrysMod);
		setMaxStackSize(16);
	}

	
	public void initOreDict() {
		OreDictionary.registerOre("olive", this);
	}
	@SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}