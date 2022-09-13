package nicusha.jerrysmod.items;

import net.minecraft.world.item.Item;
import nicusha.jerrysmod.registry.TabRegistry;

public class ItemMod extends Item {

    public ItemMod() {
        super(new Properties().tab(TabRegistry.jerrysmod));
    }
    public ItemMod(Properties properties){
        super(properties);
    }
}
