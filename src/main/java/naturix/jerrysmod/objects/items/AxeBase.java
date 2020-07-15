package naturix.jerrysmod.objects.items;

import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.registry.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.item.AxeItem;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class AxeBase extends AxeItem
{
    public AxeBase(String name, IItemTier tier)
    {
        super(tier, tier.getAttackDamage()/2, -2.5F, new Item.Properties().group(JerrysMod.setup.itemGroup));
        setRegistryName(JerrysMod.MODID, name);
    }
    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        Material material = state.getMaterial();
        return material != Material.WOOD && material != Material.PLANTS && material != Material.TALL_PLANTS && material != Material.BAMBOO ? super.getDestroySpeed(stack, state) : this.efficiency;
    }
}