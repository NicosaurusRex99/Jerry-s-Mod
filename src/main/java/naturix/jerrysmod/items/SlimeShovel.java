package naturix.jerrysmod.items;

import naturix.jerrysmod.JerrysMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SlimeShovel extends ItemSpade {

    public SlimeShovel(ToolMaterial material) {
    	super(JerrysMod.SlimeToolMaterial);
        setRegistryName("slimeshovel");
        setUnlocalizedName(JerrysMod.MODID + ".slimeshovel");
        setCreativeTab(JerrysMod.JerrysMod);
        setMaxStackSize(1);
        setMaxDamage(600001);
        setHarvestLevel(getUnlocalizedName(), 4);
        getItemEnchantability();
    }
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}