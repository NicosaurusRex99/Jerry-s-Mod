package naturix.jerrysmod.objects.items;

import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.registry.ModItems;
import net.minecraft.item.Item;

public class ItemBase extends Item {

    public ItemBase(String name) {
        super(new Item.Properties().group(JerrysMod.setup.itemGroup));
        setRegistryName(name);
        ModItems.ITEMS.add(this);
    }


}