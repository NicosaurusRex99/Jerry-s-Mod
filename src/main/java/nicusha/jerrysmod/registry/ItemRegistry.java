package nicusha.jerrysmod.registry;

import net.minecraft.core.Holder;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import nicusha.jerrysmod.items.ItemCaptainOfLight;
import nicusha.jerrysmod.items.material.JerryArmourMaterials;
import nicusha.jerrysmod.items.material.JerryToolMaterials;

import static nicusha.jerrysmod.JerrysMod.MODID;

public class ItemRegistry {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    // Resources
    public static final DeferredItem<Item> SLIME_GEM = registerSimple("slime_gem");
    public static final DeferredItem<Item> JERRY_GEM = registerSimple("jerry_gem");
    public static final DeferredItem<Item> SLIME_SHARD = registerSimple("slime_shard");
    public static final DeferredItem<Item> CAPTAIN_OF_LIGHT = ITEMS.register("captain_of_light", () -> new ItemCaptainOfLight());

    // Slime Armor
    public static final DeferredItem<Item> SLIME_HELMET = armor("slime_helmet", JerryArmourMaterials.SLIME, ArmorItem.Type.HELMET, 0);
    public static final DeferredItem<Item> SLIME_CHESTPLATE = armor("slime_chestplate", JerryArmourMaterials.SLIME, ArmorItem.Type.CHESTPLATE, 0);
    public static final DeferredItem<Item> SLIME_LEGGINGS = armor("slime_leggings", JerryArmourMaterials.SLIME, ArmorItem.Type.LEGGINGS, 0);
    public static final DeferredItem<Item> SLIME_BOOTS = armor("slime_boots", JerryArmourMaterials.SLIME, ArmorItem.Type.BOOTS, 0);

    // Jerry Armor
    public static final DeferredItem<Item> JERRY_HELMET = armor("jerry_helmet", JerryArmourMaterials.JERRY, ArmorItem.Type.HELMET, 0);
    public static final DeferredItem<Item> JERRY_CHESTPLATE = armor("jerry_chestplate", JerryArmourMaterials.JERRY, ArmorItem.Type.CHESTPLATE, 0);
    public static final DeferredItem<Item> JERRY_LEGGINGS = armor("jerry_leggings", JerryArmourMaterials.JERRY, ArmorItem.Type.LEGGINGS, 0);
    public static final DeferredItem<Item> JERRY_BOOTS = armor("jerry_boots", JerryArmourMaterials.JERRY, ArmorItem.Type.BOOTS, 0);

    // Slime Tools
    public static final DeferredItem<Item> SLIME_SWORD = sword("slime_sword", JerryToolMaterials.SLIME);
    public static final DeferredItem<Item> SLIME_AXE = axe("slime_axe", JerryToolMaterials.SLIME);
    public static final DeferredItem<Item> SLIME_PICKAXE = pickaxe("slime_pickaxe", JerryToolMaterials.SLIME);
    public static final DeferredItem<Item> SLIME_HOE = hoe("slime_hoe", JerryToolMaterials.SLIME);
    public static final DeferredItem<Item> SLIME_SHOVEL = shovel("slime_shovel", JerryToolMaterials.SLIME);

    // Jerry Tools
    public static final DeferredItem<Item> JERRY_SWORD = sword("jerry_sword", JerryToolMaterials.JERRY);
    public static final DeferredItem<Item> JERRY_AXE = axe("jerry_axe", JerryToolMaterials.JERRY);
    public static final DeferredItem<Item> JERRY_PICKAXE = pickaxe("jerry_pickaxe", JerryToolMaterials.JERRY);
    public static final DeferredItem<Item> JERRY_HOE = hoe("jerry_hoe", JerryToolMaterials.JERRY);
    public static final DeferredItem<Item> JERRY_SHOVEL = shovel("jerry_shovel", JerryToolMaterials.JERRY);

    private static DeferredItem<Item> registerSimple(String id) {
        return ITEMS.register(id, () -> new Item(new Item.Properties()));
    }

    private static DeferredItem<Item> sword(String id, Tier tier) {
        if (id == "slime_sword") {
            return ITEMS.register(id, () -> new SwordItem(tier, new Item.Properties().attributes(SwordItem.createAttributes(tier, 40, -2.4F))));
        }
        return ITEMS.register(id, () -> new SwordItem(tier, new Item.Properties().attributes(SwordItem.createAttributes(tier, 321, -2.4F))));
    }

    private static DeferredItem<Item> pickaxe(String id, Tier tier) {
        return ITEMS.register(id, () -> new PickaxeItem(tier, new Item.Properties()
                .attributes(PickaxeItem.createAttributes(tier, 1, -2.8F))));
    }

    private static DeferredItem<Item> axe(String id, Tier tier) {
        return ITEMS.register(id, () -> new AxeItem(tier, new Item.Properties()
                .attributes(AxeItem.createAttributes(tier, 5, -3.0F))));
    }

    private static DeferredItem<Item> shovel(String id, Tier tier) {
        return ITEMS.register(id, () -> new ShovelItem(tier, new Item.Properties()
                .attributes(ShovelItem.createAttributes(tier, 1.5F, -3.0F))));
    }

    private static DeferredItem<Item> hoe(String id, Tier tier) {
        return ITEMS.register(id, () -> new HoeItem(tier, new Item.Properties()
                .attributes(HoeItem.createAttributes(tier, -1, -2.0F))));
    }

    private static DeferredItem<Item> armor(String id, Holder<ArmorMaterial> material, ArmorItem.Type slot, int durability) {
        return ITEMS.register(id, () -> new ArmorItem(material, slot, new Item.Properties()
                .stacksTo(1).durability(durability)));
    }

    private static Ingredient getRepairIngredient(Holder<ArmorMaterial> material) {
        // Replace with your TagRegistry or appropriate Ingredient supplier
        if (material == JerryArmourMaterials.SLIME) {
            return Ingredient.of(TagRegistry.slimeRepair());
        }
        if (material == JerryArmourMaterials.JERRY) {
            return Ingredient.of(TagRegistry.jerryRepair());
        }
        return Ingredient.EMPTY;
    }
}
