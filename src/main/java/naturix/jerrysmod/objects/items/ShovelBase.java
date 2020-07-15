package naturix.jerrysmod.objects.items;

import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.registry.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;

public class ShovelBase extends ShovelItem {

    public ShovelBase(String name, IItemTier tier)
    {
        super(tier, tier.getAttackDamage()/4, -2.0F, new Item.Properties().group(JerrysMod.setup.itemGroup));
        setRegistryName(JerrysMod.MODID, name);
    }
}