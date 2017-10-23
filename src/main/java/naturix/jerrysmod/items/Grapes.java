package naturix.jerrysmod.items;

import naturix.jerrysmod.JerrysMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemFood;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public class Grapes extends ItemFood {

	public Grapes() {
		super(3, 2.0f, false);
		setRegistryName("grapes");
        setUnlocalizedName(JerrysMod.MODID + ".grapes");
		setCreativeTab(JerrysMod.JerrysMod);
		setMaxStackSize(1);
	}

	
	public void initOreDict() {
		OreDictionary.registerOre("grapes", this);
		OreDictionary.registerOre("grape", this);
	}
	@SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}