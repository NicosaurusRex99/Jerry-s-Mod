package naturix.jerrysmod.items;

import naturix.jerrysmod.JerrysMod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SlimePickaxe extends ItemPickaxe {

    public SlimePickaxe(ToolMaterial material) {
    	super(JerrysMod.SlimeToolMaterial);
        setRegistryName("slimepickaxe");
        setUnlocalizedName(JerrysMod.MODID + ".slimepickaxe");
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