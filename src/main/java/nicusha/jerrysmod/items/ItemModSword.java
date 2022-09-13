package nicusha.jerrysmod.items;

import net.minecraft.world.item.*;
import nicusha.jerrysmod.registry.TabRegistry;

public class ItemModSword extends SwordItem {

    public ItemModSword(Tier tier) {
        super(tier, (int) tier.getAttackDamageBonus(), tier.getSpeed(), new Item.Properties().tab(TabRegistry.jerrysmod));
    }
}
