package nicusha.jerrysmod.items;

import net.minecraft.world.item.*;

public class ItemModSword extends SwordItem {

    public ItemModSword(Tier tier) {
        super(tier, (int) tier.getAttackDamageBonus(), tier.getSpeed(), new Item.Properties());
    }
}
