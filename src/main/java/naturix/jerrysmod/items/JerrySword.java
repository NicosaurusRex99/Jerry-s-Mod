package naturix.jerrysmod.items;

import naturix.jerrysmod.JerrysMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemSword;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class JerrySword extends ItemSword {

    public JerrySword(ToolMaterial material) {
    	super(JerrysMod.JerryToolMaterial);
        setRegistryName("jerrysword");
        setUnlocalizedName(JerrysMod.MODID + ".jerrysword");
        setCreativeTab(JerrysMod.JerrysMod);
        setMaxStackSize(1);
        setMaxDamage(13000001);
        setHarvestLevel(getUnlocalizedName(), 4);
        getItemEnchantability();
    }
    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}