package nicusha.jerrysmod.items;

import net.minecraft.world.item.*;

public class ItemModAxe extends AxeItem {
    public ItemModAxe(Tier tier) {
        super(tier, (int) tier.getAttackDamageBonus(), tier.getSpeed(), new Item.Properties());
    }
}
