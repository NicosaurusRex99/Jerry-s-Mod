package naturix.jerrysmod.registry;

import naturix.jerrysmod.objects.items.ArmorBase;
import naturix.jerrysmod.objects.items.ItemBase;
import naturix.jerrysmod.objects.items.SwordBase;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvents;

import java.util.ArrayList;
import java.util.List;

public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<Item>();

    public static Item slimeGem = new ItemBase("slime_gem");
    public static Item jerryGem = new ItemBase("jerry_gem");
    public static Item slimeChunk = new ItemBase("slime_chunk");
    public static Item slimeDrop = new ItemBase("slime_drop");
    public static Item slimeHead = new ItemBase("slime_head");
    public static Item slimeShard = new ItemBase("slime_shard");

    public static ModMaterials slimeHelmetMat = new ModMaterials("slime_helmet", 5500001, new int[]{18, 51, 21, 30}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, Ingredient.fromStacks(new ItemStack(slimeGem)));
    public static ModMaterials slimeChestplateMat = new ModMaterials("slime_chestplate", 8000001, new int[]{18, 51, 21, 30}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, Ingredient.fromStacks(new ItemStack(slimeGem)));
    public static ModMaterials slimeLeggingsMat = new ModMaterials("slime_leggings", 7500001, new int[]{18, 51, 21, 30}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, Ingredient.fromStacks(new ItemStack(slimeGem)));
    public static ModMaterials slimeBootsMat = new ModMaterials("slime_boots", 6500001, new int[]{18, 51, 21, 30}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, Ingredient.fromStacks(new ItemStack(slimeGem)));

    public static ModMaterials jerryHelmetMat = new ModMaterials("jerry_helmet", 11000001, new int[]{506013, 1658961, 341564, 454230}, 59, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, Ingredient.fromStacks(new ItemStack(jerryGem)));
    public static ModMaterials jerryChestplateMat = new ModMaterials("jerry_chestplate", 160000001, new int[]{506013, 1658961, 341564, 454230}, 59, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, Ingredient.fromStacks(new ItemStack(jerryGem)));
    public static ModMaterials jerryLeggingsMat = new ModMaterials("jerry_leggings", 15000001, new int[]{506013, 1658961, 341564, 454230}, 59, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, Ingredient.fromStacks(new ItemStack(jerryGem)));
    public static ModMaterials jerryBootsMat = new ModMaterials("jerry_boots", 13000001, new int[]{506013, 1658961, 341564, 454230}, 59, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, Ingredient.fromStacks(new ItemStack(jerryGem)));

    public static Item slimeHelmet = new ArmorBase("slime_helmet", slimeHelmetMat, EquipmentSlotType.HEAD);
    public static Item slimeChestplate = new ArmorBase("slime_chestplate", slimeChestplateMat, EquipmentSlotType.CHEST);
    public static Item slimeLeggings = new ArmorBase("slime_leggings", slimeLeggingsMat, EquipmentSlotType.LEGS);
    public static Item slimeBoots = new ArmorBase("slime_boots", slimeBootsMat, EquipmentSlotType.FEET);

    public static Item jerryHelmet = new ArmorBase("jerry_helmet", jerryHelmetMat, EquipmentSlotType.HEAD);
    public static Item jerryChestplate = new ArmorBase("jerry_chestplate", jerryChestplateMat, EquipmentSlotType.CHEST);
    public static Item jerryLeggings = new ArmorBase("jerry_leggings", jerryLeggingsMat, EquipmentSlotType.LEGS);
    public static Item jerryBoots = new ArmorBase("jerry_boots", jerryBootsMat, EquipmentSlotType.FEET);


    public static Item slimeSword = new SwordBase("slime_sword", ModTier.SLIMESWORD, 128, ModTier.SLIMESWORD.getEfficiency());
    public static Item jerrySword = new SwordBase("jerry_sword", ModTier.JERRYSWORD, 848, ModTier.JERRYSWORD.getEfficiency());

}