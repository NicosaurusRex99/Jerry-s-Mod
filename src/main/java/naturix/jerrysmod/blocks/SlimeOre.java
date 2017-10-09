package naturix.jerrysmod.blocks;

import naturix.jerrysmod.JerrysMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SlimeOre  extends Block {


	public SlimeOre(Material materialIn) {
		super(Material.ROCK);
        setUnlocalizedName(JerrysMod.MODID + ".slimeore");
        setRegistryName("slimeore");
        setCreativeTab(JerrysMod.JerrysMod);
        setHarvestLevel("pickaxe", 2);
        setHardness(4f);
		setResistance(5f);
	}
	@SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
	
}