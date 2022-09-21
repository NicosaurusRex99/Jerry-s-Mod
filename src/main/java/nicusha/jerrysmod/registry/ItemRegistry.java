package nicusha.jerrysmod.registry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.*;
import nicusha.jerrysmod.JerrysMod;
import nicusha.jerrysmod.items.*;
import nicusha.jerrysmod.utils.*;

import java.util.function.Supplier;

import static nicusha.jerrysmod.JerrysMod.MODID;

public class ItemRegistry {
    public static ModArmorMaterials slime_helmet_material = new ModArmorMaterials("slime", 5500001, new int[]{18, 51, 21, 30}, 9, SoundEvents.ARMOR_EQUIP_IRON, 3.1F, Ingredient.of(new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(MODID, "slime_gem")))));
    public static ModArmorMaterials slime_chestplate_material = new ModArmorMaterials("slime", 8000001, new int[]{18, 51, 21, 30}, 9, SoundEvents.ARMOR_EQUIP_IRON, 5.4F, Ingredient.of(new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(MODID, "slime_gem")))));
    public static ModArmorMaterials slime_leggings_material = new ModArmorMaterials("slime", 7500001, new int[]{18, 51, 21, 30}, 9, SoundEvents.ARMOR_EQUIP_IRON, 3.8F, Ingredient.of(new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(MODID, "slime_gem")))));
    public static ModArmorMaterials slime_boots_material = new ModArmorMaterials("slime", 6500001, new int[]{18, 51, 21, 30}, 9, SoundEvents.ARMOR_EQUIP_IRON, 2.9F, Ingredient.of(new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(MODID, "slime_gem")))));

    public static ModArmorMaterials jerry_helmet_material = new ModArmorMaterials("jerry", 11000001, new int[]{506013, 1658961, 341564, 454230}, 59, SoundEvents.ARMOR_EQUIP_IRON, 3.1F, Ingredient.of(new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(MODID, "jerry_gem")))));
    public static ModArmorMaterials jerry_chestplate_material = new ModArmorMaterials("jerry", 160000001, new int[]{506013, 1658961, 341564, 454230}, 59, SoundEvents.ARMOR_EQUIP_IRON, 5.4F, Ingredient.of(new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(MODID, "jerry_gem")))));
    public static ModArmorMaterials jerry_leggings_material = new ModArmorMaterials("jerry", 15000001, new int[]{506013, 1658961, 341564, 454230}, 59, SoundEvents.ARMOR_EQUIP_IRON, 3.8F, Ingredient.of(new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(MODID, "jerry_gem")))));
    public static ModArmorMaterials jerry_boots_material = new ModArmorMaterials("jerry", 13000001, new int[]{506013, 1658961, 341564, 454230}, 59, SoundEvents.ARMOR_EQUIP_IRON, 2.9F, Ingredient.of(new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation(MODID, "jerry_gem")))));

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);

    public static final RegistryObject<Item> slime_gem = registerItem("slime_gem", () -> new ItemMod()),
            jerry_gem = registerItem("jerry_gem", () -> new ItemMod()),
//            slime_chunk = registerItem("slime_chunk", () -> new ItemMod()),
//            slime_drop = registerItem("slime_drop", () -> new ItemMod()),
//            slime_head = registerItem("slime_head", () -> new ItemMod()),
            slime_stick = registerItem("olive_stick", () -> new ItemMod()),
            slime_shard = registerItem("slime_shard", () -> new ItemMod()),
            captain_of_light = registerItem("captain_of_light", () -> new ItemCaptainOfLight()),
            grapes = registerItem("grapes", () -> new ItemMod(new Item.Properties().tab(TabRegistry.jerrysmod).food(FoodStats.GRAPES))),
            oilves = registerItem("olives", () -> new ItemMod(new Item.Properties().tab(TabRegistry.jerrysmod).food(FoodStats.OLIVES))),
            slime_helmet = registerItem("slime_helmet", () -> new ItemModArmor(slime_helmet_material, EquipmentSlot.HEAD)),
            slime_chestplate = registerItem("slime_chestplate", () -> new ItemModArmor(slime_chestplate_material, EquipmentSlot.CHEST)),
            slime_leggings = registerItem("slime_leggings", () -> new ItemModArmor(slime_leggings_material, EquipmentSlot.LEGS)),
            slime_boots = registerItem("slime_boots", () -> new ItemModArmor(slime_boots_material, EquipmentSlot.FEET)),
            jerry_helmet = registerItem("jerry_helmet", () -> new ItemModArmor(jerry_helmet_material, EquipmentSlot.HEAD)),
            jerry_chestplate = registerItem("jerry_chestplate", () -> new ItemModArmor(jerry_chestplate_material, EquipmentSlot.CHEST)),
            jerry_leggings = registerItem("jerry_leggings", () -> new ItemModArmor(jerry_leggings_material, EquipmentSlot.LEGS)),
            jerry_boots = registerItem("jerry_boots", () -> new ItemModArmor(jerry_boots_material, EquipmentSlot.FEET)),
            slime_sword = registerItem("slime_sword", () -> new ItemModSword(ModToolTier.slime_sword)),
            jerry_sword = registerItem("jerry_sword", () -> new ItemModSword(ModToolTier.jerry_sword)),
            slime_axe = registerItem("slime_axe", () -> new ItemModAxe(ModToolTier.slime_axe)),
            jerry_axe = registerItem("jerry_axe", () -> new ItemModAxe(ModToolTier.jerry_axe)),
            slime_pickaxe = registerItem("slime_pickaxe", () -> new ItemModPickaxe(ModToolTier.slime_pickaxe)),
            jerry_pickaxe = registerItem("jerry_pickaxe", () -> new ItemModPickaxe(ModToolTier.jerry_pickaxe)),
            slime_hoe = registerItem("slime_hoe", () -> new ItemModHoe(ModToolTier.slime_hoe)),
            jerry_hoe = registerItem("jerry_hoe", () -> new ItemModHoe(ModToolTier.jerry_hoe)),
            slime_shovel = registerItem("slime_shovel", () -> new ItemModShovel(ModToolTier.slime_shovel)),
            jerry_shovel = registerItem("jerry_shovel", () -> new ItemModShovel(ModToolTier.jerry_shovel)),
            lighter = registerItem("lighter", () -> new ItemPortalLighter());


    private static <T extends Item> RegistryObject<T> registerItem(String registryId, Supplier<T> item) {
        return ITEMS.register(registryId, item);
    }
}
