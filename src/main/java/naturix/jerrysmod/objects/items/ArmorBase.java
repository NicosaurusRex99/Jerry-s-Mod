package naturix.jerrysmod.objects.items;

import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.registry.ModItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;

public class ArmorBase extends ArmorItem {
    public IArmorMaterial mat;
    public ArmorBase(String name, IArmorMaterial materialIn, EquipmentSlotType slot) {
        super(materialIn, slot, new Item.Properties().group(JerrysMod.setup.itemGroup));
        setRegistryName(name);
        ModItems.ITEMS.add(this);
        this.mat = materialIn;
    }

    public int getItemEnchantability() {
        return mat.getEnchantability();
    }
}