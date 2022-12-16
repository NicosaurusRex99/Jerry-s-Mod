package nicusha.jerrysmod.items;

import net.minecraft.world.item.*;

public class ItemModHoe extends HoeItem {
    public ItemModHoe(Tier tier) {
        super(tier, (int) tier.getAttackDamageBonus(), tier.getSpeed(), new Item.Properties());
    }
}
