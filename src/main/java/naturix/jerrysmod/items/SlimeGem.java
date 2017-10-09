package naturix.jerrysmod.items;

import naturix.jerrysmod.JerrysMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SlimeGem extends Item {

    public SlimeGem() {
        setRegistryName("slimegem");        // The unique name (within your mod) that identifies this item
        setUnlocalizedName(JerrysMod.MODID + ".slimegem");     // Used for localization (en_US.lang)
        setCreativeTab(JerrysMod.JerrysMod);
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }

}
