package naturix.jerrysmod.objects.items;

import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.registry.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.HoeItem;

public class HoeBase extends HoeItem {

    public HoeBase(String name, IItemTier tier)
    {
        super(tier, -1,-1.8F, new Item.Properties().group(JerrysMod.setup.itemGroup));
        setRegistryName(JerrysMod.MODID, name);
    }
}