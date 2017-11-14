package naturix.jerrysmod.biome;

import naturix.jerrysmod.JerrysMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public class SlimeGrass extends Block {


	public SlimeGrass(Material materialIn) {
		super(Material.GRASS);
        setUnlocalizedName(JerrysMod.MODID + ".slimegrass");
        setRegistryName("slimegrass");
        setCreativeTab(JerrysMod.JerrysMod);
        setHarvestLevel("shovel", 1);
        setHardness(1f);
		setResistance(3f);
	}
	
	public void initOreDict() {
		OreDictionary.registerOre("grass", this);
	}
	
	@SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
	
}