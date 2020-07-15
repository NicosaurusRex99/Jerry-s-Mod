package naturix.jerrysmod.objects.items;

import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.registry.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class SwordBase extends SwordItem {

    public SwordBase(String name, IItemTier tier)
    {
        super(tier, (int)tier.getAttackDamage(), -2.8F, new Item.Properties().group(JerrysMod.setup.itemGroup));
        setRegistryName(JerrysMod.MODID, name);
    }
}