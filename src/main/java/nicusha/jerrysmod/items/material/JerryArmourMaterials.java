package nicusha.jerrysmod.items.material;

import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;

import java.util.*;

import static nicusha.jerrysmod.JerrysMod.MODID;

public interface JerryArmourMaterials {

    ArmorMaterial SLIME = registerArmorMaterial(
            "slime", 1,
            createDefenseMap(30, 21, 51, 18, 0),
            9, SoundEvents.ARMOR_EQUIP_IRON,
            5.4F, 0.0F,
            ItemTags.create(Identifier.fromNamespaceAndPath(MODID, "slime_repair"))
    );

    ArmorMaterial JERRY = registerArmorMaterial(
            "jerry", 1,
            createDefenseMap(454230, 341564, 1658961, 506013, 0),
            59, SoundEvents.ARMOR_EQUIP_IRON,
            5.4F, 0.0F,
            ItemTags.create(Identifier.fromNamespaceAndPath(MODID, "jerry_repair"))
    );

    static ResourceKey<EquipmentAsset> createId(String name) {
        return ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.fromNamespaceAndPath(MODID, name));
    }

    static EnumMap<ArmorType, Integer> createDefenseMap(int boots, int leggings, int chestplate, int helmet, int body) {
        EnumMap<ArmorType, Integer> defenseMap = new EnumMap<>(ArmorType.class);
        defenseMap.put(ArmorType.BOOTS, boots);
        defenseMap.put(ArmorType.LEGGINGS, leggings);
        defenseMap.put(ArmorType.CHESTPLATE, chestplate);
        defenseMap.put(ArmorType.HELMET, helmet);
        defenseMap.put(ArmorType.BODY, body);
        return defenseMap;
    }

    private static ArmorMaterial registerArmorMaterial(String name, int durability, EnumMap<ArmorType, Integer> defenseMap, int enchantmentValue, Holder<SoundEvent> equipSound, float toughness, float knockbackResistance, TagKey<Item> repairIngredient) {
        return createArmorMaterial(durability, defenseMap, enchantmentValue, equipSound, toughness, knockbackResistance, repairIngredient, createId(name));
    }

    private static ArmorMaterial createArmorMaterial(int durability, EnumMap<ArmorType, Integer> defenseMap, int enchantmentValue, Holder<SoundEvent> equipSound, float toughness, float knockbackResistance, TagKey<Item> repairIngredient, ResourceKey<EquipmentAsset> assetKey) {
        EnumMap<ArmorType, Integer> mappedDefense = new EnumMap<>(ArmorType.class);
        for (ArmorType type : ArmorType.values()) {
            mappedDefense.put(type, defenseMap.get(type));
        }
        return new ArmorMaterial(durability, mappedDefense, enchantmentValue, equipSound, toughness, knockbackResistance, repairIngredient, assetKey);
    }
}
