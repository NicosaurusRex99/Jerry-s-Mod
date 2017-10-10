package naturix.jerrysmod.blocks;

import naturix.jerrysmod.JerrysMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class OlivePlanks extends Block {


	public OlivePlanks(Material materialIn) {
		super(Material.WOOD);
        setUnlocalizedName(JerrysMod.MODID + ".oliveplanks");
        setRegistryName("oliveplanks");
        setCreativeTab(JerrysMod.JerrysMod);
        setHarvestLevel("axe", 1);
        setHardness(2f);
		setResistance(1f);
	}
	@SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
	
}