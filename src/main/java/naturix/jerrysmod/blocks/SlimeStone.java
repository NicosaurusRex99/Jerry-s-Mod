package naturix.jerrysmod.blocks;

import naturix.jerrysmod.JerrysMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.OreDictionary;

public class SlimeStone extends Block {


	public SlimeStone(Material materialIn) {
		super(Material.ROCK);
        setUnlocalizedName(JerrysMod.MODID + ".slimestone");
        setRegistryName("slimestone");
        setCreativeTab(JerrysMod.JerrysMod);
        setHarvestLevel("pickaxe", 1);
        setHardness(1f);
		setResistance(3f);
	}
	
	public void initOreDict() {
		OreDictionary.registerOre("stone", this);
	}
	@SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
	
}