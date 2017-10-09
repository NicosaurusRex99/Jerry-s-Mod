package naturix.jerrysmod.items;

import naturix.jerrysmod.JerrysMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class JerryGem extends Item {

    public JerryGem() {
        setRegistryName("jerrygem");        // The unique name (within your mod) that identifies this item
        setUnlocalizedName(JerrysMod.MODID + ".jerrygem");     // Used for localization (en_US.lang)
        setCreativeTab(JerrysMod.JerrysMod);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}
