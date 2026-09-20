package nicusha.jerrysmod.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import nicusha.jerrysmod.items.ItemCaptainOfLight;
import nicusha.jerrysmod.items.material.JerryArmourMaterials;
import nicusha.jerrysmod.items.material.JerryToolMaterials;

import static nicusha.jerrysmod.JerrysMod.MODID;

public class ItemRegistry {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    // Resources
    public static final DeferredItem<Item> slime_gem = registerSimple("slime_gem");
    public static final DeferredItem<Item> jerry_gem = registerSimple("jerry_gem");
    public static final DeferredItem<Item> slime_shard = registerSimple("slime_shard");
    public static final DeferredItem<Item> captain_of_light = ITEMS.registerItem("captain_of_light", p -> new ItemCaptainOfLight());

    public static final DeferredItem<Item> slime_helmet = ITEMS.registerItem("slime_helmet", props -> new Item(props.humanoidArmor(JerryArmourMaterials.SLIME, ArmorType.HELMET).stacksTo(1).repairable(TagRegistry.slimeRepair())));
    public static final DeferredItem<Item> slime_chestplate = ITEMS.registerItem("slime_chestplate", props -> new Item(props.humanoidArmor(JerryArmourMaterials.SLIME, ArmorType.CHESTPLATE).stacksTo(1).repairable(TagRegistry.slimeRepair())));
    public static final DeferredItem<Item> slime_leggings = ITEMS.registerItem("slime_leggings", props -> new Item(props.humanoidArmor(JerryArmourMaterials.SLIME, ArmorType.LEGGINGS).stacksTo(1).repairable(TagRegistry.slimeRepair())));
    public static final DeferredItem<Item> slime_boots = ITEMS.registerItem("slime_boots", props -> new Item(props.humanoidArmor(JerryArmourMaterials.SLIME, ArmorType.BOOTS).stacksTo(1).repairable(TagRegistry.slimeRepair())));

    public static final DeferredItem<Item> jerry_helmet = ITEMS.registerItem("jerry_helmet", props -> new Item(props.humanoidArmor(JerryArmourMaterials.JERRY, ArmorType.HELMET).stacksTo(1).repairable(TagRegistry.jerryRepair())));
    public static final DeferredItem<Item> jerry_chestplate = ITEMS.registerItem("jerry_chestplate", props -> new Item(props.humanoidArmor(JerryArmourMaterials.JERRY, ArmorType.CHESTPLATE).stacksTo(1).repairable(TagRegistry.jerryRepair())));
    public static final DeferredItem<Item> jerry_leggings = ITEMS.registerItem("jerry_leggings", props -> new Item(props.humanoidArmor(JerryArmourMaterials.JERRY, ArmorType.LEGGINGS).stacksTo(1).repairable(TagRegistry.jerryRepair())));
    public static final DeferredItem<Item> jerry_boots = ITEMS.registerItem("jerry_boots", props -> new Item(props.humanoidArmor(JerryArmourMaterials.JERRY, ArmorType.BOOTS).stacksTo(1).repairable(TagRegistry.jerryRepair())));

    public static final DeferredItem<Item> slime_sword = ITEMS.registerItem("slime_sword", props -> new Item(props.stacksTo(1).sword(JerryToolMaterials.SLIME, 64.0F, 1.0F)));
    public static final DeferredItem<Item> slime_axe = ITEMS.registerItem("slime_axe", props -> new Item(props.axe(JerryToolMaterials.SLIME, 2.0F, 0.9F).stacksTo(1)));
    public static final DeferredItem<Item> slime_pickaxe = ITEMS.registerItem("slime_pickaxe", props -> new Item(props.stacksTo(1).pickaxe(JerryToolMaterials.SLIME, 1.0F, 1.2F)));
    public static final DeferredItem<Item> slime_hoe = ITEMS.registerItem("slime_hoe", props -> new Item(props.stacksTo(1).hoe(JerryToolMaterials.SLIME, 0.0F, 4.0F)));
    public static final DeferredItem<Item> slime_shovel = ITEMS.registerItem("slime_shovel", props -> new Item(props.stacksTo(1).shovel(JerryToolMaterials.SLIME, 0.0F, 1.0F)));

    public static final DeferredItem<Item> jerry_sword = ITEMS.registerItem("jerry_sword", props -> new Item(props.stacksTo(1).sword(JerryToolMaterials.JERRY, 844.0F, 1.0F)));
    public static final DeferredItem<Item> jerry_axe = ITEMS.registerItem("jerry_axe", props -> new Item(props.stacksTo(1).axe(JerryToolMaterials.JERRY, 3.0F, 0.9F).stacksTo(1)));
    public static final DeferredItem<Item> jerry_pickaxe = ITEMS.registerItem("jerry_pickaxe", props -> new Item(props.pickaxe(JerryToolMaterials.JERRY, 2.0F, 1.2F).stacksTo(1)));
    public static final DeferredItem<Item> jerry_hoe = ITEMS.registerItem("jerry_hoe", props -> new Item(props.hoe(JerryToolMaterials.JERRY, 0.0F, 4.0F).stacksTo(1)));
    public static final DeferredItem<Item> jerry_shovel = ITEMS.registerItem("jerry_shovel", props -> new Item(props.shovel(JerryToolMaterials.JERRY, 1.0F, 1.0F).stacksTo(1)));

    private static DeferredItem<Item> registerSimple(String name) {
        return ITEMS.registerItem(name, props -> new Item(props.setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MODID, name)))));
    }
}
