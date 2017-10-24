package naturix.jerrysmod.items;

import naturix.jerrysmod.JerrysMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
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