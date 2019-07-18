package naturix.jerrysmod.objects.items;

import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.registry.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class SwordBase extends SwordItem {

    public SwordBase(String name, IItemTier tier, int attackDamageIn, float attackSpeedIn)
    {
        super(tier, attackDamageIn, attackSpeedIn, new Item.Properties().group(JerrysMod.setup.itemGroup));
        setRegistryName(name);
        ModItems.ITEMS.add(this);
    }
}