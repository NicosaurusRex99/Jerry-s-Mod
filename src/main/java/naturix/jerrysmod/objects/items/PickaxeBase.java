package naturix.jerrysmod.objects.items;

import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.registry.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;

public class PickaxeBase extends PickaxeItem {

    public PickaxeBase(String name, IItemTier tier)
    {
        super(tier, (int)tier.getAttackDamage()/3, -2.1F, new Item.Properties().group(JerrysMod.setup.itemGroup));
        setRegistryName(JerrysMod.MODID, name);
    }
}