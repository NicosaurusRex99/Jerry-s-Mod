package naturix.jerrysmod.items;

import naturix.jerrysmod.JerrysMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemHoe;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class JerryHoe extends ItemHoe {

    public JerryHoe(ToolMaterial material) {
    	super(JerrysMod.JerryToolMaterial);
        setRegistryName("jerryhoe");
        setUnlocalizedName(JerrysMod.MODID + ".jerryhoe");
        setCreativeTab(JerrysMod.JerrysMod);
        setMaxStackSize(1);
        setMaxDamage(13000001);
        setHarvestLevel(getUnlocalizedName(), 6);
        getItemEnchantability();
    }
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}