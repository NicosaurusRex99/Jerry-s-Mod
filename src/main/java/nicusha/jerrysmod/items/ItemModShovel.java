package nicusha.jerrysmod.items;

import net.minecraft.world.item.*;
import nicusha.jerrysmod.registry.TabRegistry;

public class ItemModShovel extends ShovelItem {
    public ItemModShovel(Tier tier) {
        super(tier, (int) tier.getAttackDamageBonus(), tier.getSpeed(), new Item.Properties().tab(TabRegistry.jerrysmod));
    }
}