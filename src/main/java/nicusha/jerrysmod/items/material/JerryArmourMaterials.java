package nicusha.jerrysmod.items.material;

import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.registries.DeferredRegister;
import nicusha.jerrysmod.JerrysMod;

import java.util.*;
import java.util.function.Supplier;

import static nicusha.jerrysmod.JerrysMod.MODID;

public interface JerryArmourMaterials {
    public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS = DeferredRegister.create(Registries.ARMOR_MATERIAL, JerrysMod.MODID);
    public static final Holder<ArmorMaterial> SLIME = register("slime",
            Util.make(new EnumMap<>(ArmorItem.Type.class), armorType -> {
                armorType.put(ArmorItem.Type.BOOTS, 30);
                armorType.put(ArmorItem.Type.LEGGINGS, 21);
                armorType.put(ArmorItem.Type.CHESTPLATE, 51);
                armorType.put(ArmorItem.Type.HELMET, 18);
                armorType.put(ArmorItem.Type.BODY, 0);
            }),
            9,
            SoundEvents.ARMOR_EQUIP_IRON,
            5.4F,
            0.0F,
            () -> Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath(MODID, "slime_repair"))),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(MODID, "slime")))
    );

    public static final Holder<ArmorMaterial> JERRY = register("jerry",
            Util.make(new EnumMap<>(ArmorItem.Type.class), armorType -> {
                armorType.put(ArmorItem.Type.BOOTS, 454230);
                armorType.put(ArmorItem.Type.LEGGINGS, 341564);
                armorType.put(ArmorItem.Type.CHESTPLATE, 1658961);
                armorType.put(ArmorItem.Type.HELMET, 506013);
                armorType.put(ArmorItem.Type.BODY, 0);
            }),
            59,
            SoundEvents.ARMOR_EQUIP_IRON,
            5.4F,
            0.0F,
            () -> Ingredient.of(ItemTags.create(ResourceLocation.fromNamespaceAndPath(MODID, "jerry_repair"))),
            List.of(new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(MODID, "jerry")))
    );


    private static Holder<ArmorMaterial> register(String name, EnumMap<ArmorItem.Type, Integer> armourType, int enchantability, Holder<SoundEvent> equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repair, List<ArmorMaterial.Layer> pLayers) {
        EnumMap<ArmorItem.Type, Integer> enummap = new EnumMap<>(ArmorItem.Type.class);
        for (ArmorItem.Type armoritem$type : ArmorItem.Type.values()) {
            enummap.put(armoritem$type, armourType.get(armoritem$type));
        }
        return ARMOR_MATERIALS.register(name, ()-> new ArmorMaterial(enummap, enchantability, equipSound, repair, pLayers, toughness, knockbackResistance));
    }
}
