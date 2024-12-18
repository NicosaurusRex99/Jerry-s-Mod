package nicusha.jerrysmod.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import nicusha.jerrysmod.items.*;
import nicusha.jerrysmod.items.materials.JerryArmourMaterials;
import nicusha.jerrysmod.items.materials.JerryToolMaterials;
import nicusha.jerrysmod.utils.*;

import static nicusha.jerrysmod.JerrysMod.MODID;

public class ItemRegistry {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredItem<Item> slime_gem = createItem("slime_gem", false);
    public static final DeferredItem<Item> jerry_gem = createItem("jerry_gem", false);
    public static final DeferredItem<Item> slime_stick = createItem("slime_stick", false);
    public static final DeferredItem<Item> slime_shard = createItem("slime_shard", false);
    public static final DeferredItem<Item> captain_of_light = ITEMS.register("captain_of_light", ItemCaptainOfLight::new);
    public static final DeferredItem<Item> grapes = createItem("grapes", false, FoodStats.GRAPES);
    public static final DeferredItem<Item> olives = createItem("olives", false, FoodStats.OLIVES);

    public static final DeferredItem<Item> slime_helmet = createArmorItem("slime_helmet", JerryArmourMaterials.SLIME, ArmorType.HELMET, false, 1);
    public static final DeferredItem<Item> slime_chestplate = createArmorItem("slime_chestplate", JerryArmourMaterials.SLIME, ArmorType.CHESTPLATE, false, 1);
    public static final DeferredItem<Item> slime_leggings = createArmorItem("slime_leggings", JerryArmourMaterials.SLIME, ArmorType.LEGGINGS, false, 1);
    public static final DeferredItem<Item> slime_boots = createArmorItem("slime_boots", JerryArmourMaterials.SLIME, ArmorType.BOOTS, false, 1);

    public static final DeferredItem<Item> jerry_helmet = createArmorItem("jerry_helmet", JerryArmourMaterials.JERRY, ArmorType.HELMET, false, 1);
    public static final DeferredItem<Item> jerry_chestplate = createArmorItem("jerry_chestplate", JerryArmourMaterials.JERRY, ArmorType.CHESTPLATE, false, 1);
    public static final DeferredItem<Item> jerry_leggings = createArmorItem("jerry_leggings", JerryArmourMaterials.JERRY, ArmorType.LEGGINGS, false, 1);
    public static final DeferredItem<Item> jerry_boots = createArmorItem("jerry_boots", JerryArmourMaterials.JERRY, ArmorType.BOOTS, false, 1);

    public static final DeferredItem<Item> slime_sword = createSwordItem("slime_sword", JerryToolMaterials.SLIME_SWORD, false);
    public static final DeferredItem<Item> jerry_sword = createSwordItem("jerry_sword", JerryToolMaterials.JERRY_SWORD, false);
    public static final DeferredItem<Item> slime_axe = createAxeItem("slime_axe", JerryToolMaterials.SLIME_AXE, false);
    public static final DeferredItem<Item> jerry_axe = createAxeItem("jerry_axe", JerryToolMaterials.JERRY_AXE, false);
    public static final DeferredItem<Item> slime_pickaxe = createPickaxeItem("slime_pickaxe", JerryToolMaterials.SLIME_PICKAXE, false);
    public static final DeferredItem<Item> jerry_pickaxe = createPickaxeItem("jerry_pickaxe", JerryToolMaterials.JERRY_PICKAXE, false);
    public static final DeferredItem<Item> slime_hoe = createHoeItem("slime_hoe", JerryToolMaterials.SLIME_HOE, false);
    public static final DeferredItem<Item> jerry_hoe = createHoeItem("jerry_hoe", JerryToolMaterials.JERRY_HOE, false);
    public static final DeferredItem<Item> slime_shovel = createShovelItem("slime_shovel", JerryToolMaterials.SLIME_SHOVEL, false);
    public static final DeferredItem<Item> jerry_shovel = createShovelItem("jerry_shovel", JerryToolMaterials.JERRY_SHOVEL, false);
    public static final DeferredItem<Item> lighter = ITEMS.register("lighter", ItemPortalLighter::new);

    private static DeferredItem<Item> createItem(String name, boolean isFireProof) {
        return ITEMS.register(name, () -> {
            Item.Properties properties = new Item.Properties();
            if (isFireProof) {
                properties = properties.fireResistant();
            }
            return new Item(properties.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MODID, name))));
        });
    }

    private static DeferredItem<Item> createItem(String name, boolean isFireProof, FoodProperties food) {
        return ITEMS.register(name, () -> {
            Item.Properties properties = new Item.Properties().food(food);
            if (isFireProof) {
                properties = properties.fireResistant();
            }
            return new Item(properties.setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MODID, name))));
        });
    }

    private static DeferredItem<Item> createSwordItem(String name, ToolMaterial material, boolean isFireProof) {
        return ITEMS.register(name, () -> new SwordItem(material, material.attackDamageBonus(), material.speed(), createProperties(name, isFireProof)));
    }

    private static DeferredItem<Item> createPickaxeItem(String name, ToolMaterial material, boolean isFireProof) {
        return ITEMS.register(name, () -> new PickaxeItem(material, material.attackDamageBonus(), material.speed(), createProperties(name, isFireProof)));
    }

    private static DeferredItem<Item> createAxeItem(String name, ToolMaterial material, boolean isFireProof) {
        return ITEMS.register(name, () -> new AxeItem(material, material.attackDamageBonus(), material.speed(), createProperties(name, isFireProof)));
    }

    private static DeferredItem<Item> createShovelItem(String name, ToolMaterial material, boolean isFireProof) {
        return ITEMS.register(name, () -> new ShovelItem(material, material.attackDamageBonus(), material.speed(), createProperties(name, isFireProof)));
    }

    private static DeferredItem<Item> createHoeItem(String name, ToolMaterial material, boolean isFireProof) {
        return ITEMS.register(name, () -> new HoeItem(material, material.attackDamageBonus(), material.speed(), createProperties(name, isFireProof)));
    }

    private static DeferredItem<Item> createArmorItem(String name, ArmorMaterial material, ArmorType armorType, boolean isFireProof, int durability) {
        return ITEMS.register(name, () -> new ArmorItem(material, armorType, createProperties(name, isFireProof).stacksTo(1).durability(durability)));
    }

    private static Item.Properties createProperties(String name, boolean isFireProof) {
        Item.Properties properties = new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MODID, name)));
        if (isFireProof) {
            properties = properties.fireResistant();
        }
        return properties;
    }
}