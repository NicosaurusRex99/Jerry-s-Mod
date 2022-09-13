package nicusha.jerrysmod.items;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import nicusha.jerrysmod.registry.TabRegistry;

public class ItemModArmor extends ArmorItem {

    public ItemModArmor(ArmorMaterial material, EquipmentSlot slot) {
        super(material, slot, new Properties().tab(TabRegistry.jerrysmod));
    }
}
