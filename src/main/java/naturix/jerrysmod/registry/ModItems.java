package naturix.jerrysmod.registry;

import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.objects.items.*;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(modid = JerrysMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {

    @ObjectHolder("jerrysmod:slime_gem")
    public static Item slimeGem = null;
    @ObjectHolder("jerrysmod:jerry_gem")
    public static Item jerryGem = null;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> e) {

        register(e, new ItemBase("slime_gem"));
        register(e, new ItemBase("jerry_gem"));
    }


    private static void register(RegistryEvent.Register<Item> event, Item item) {
        event.getRegistry().register(item);
    }
}
//    public static Item slimeChunk = new ItemBase("slime_chunk");
//    public static Item slimeDrop = new ItemBase("slime_drop");
//    public static Item slimeHead = new ItemBase("slime_head");
//    public static Item slimeShard = new ItemBase("slime_shard");
//    public static Item slimeStick = new ItemBase("slime_stick");
//    public static Item captainOfLight = new CaptainOfLight("captain_of_light");
//    public static final Item grapes = new ItemBase("grapes",(new Item.Properties()).group(JerrysMod.setup.itemGroup).food(FoodBase.GRAPES));
//    public static final Item olives = new ItemBase("olives",(new Item.Properties()).group(JerrysMod.setup.itemGroup).food(FoodBase.OLIVES));
//
//    public static ModMaterials slimeHelmetMat = new ModMaterials("slime", 5500001, new int[]{18, 51, 21, 30}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, Ingredient.fromStacks(new ItemStack(slimeGem)));
//    public static ModMaterials slimeChestplateMat = new ModMaterials("slime", 8000001, new int[]{18, 51, 21, 30}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, Ingredient.fromStacks(new ItemStack(slimeGem)));
//    public static ModMaterials slimeLeggingsMat = new ModMaterials("slime", 7500001, new int[]{18, 51, 21, 30}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, Ingredient.fromStacks(new ItemStack(slimeGem)));
//    public static ModMaterials slimeBootsMat = new ModMaterials("slime", 6500001, new int[]{18, 51, 21, 30}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, Ingredient.fromStacks(new ItemStack(slimeGem)));
//
//    public static ModMaterials jerryHelmetMat = new ModMaterials("jerry", 11000001, new int[]{506013, 1658961, 341564, 454230}, 59, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, Ingredient.fromStacks(new ItemStack(jerryGem)));
//    public static ModMaterials jerryChestplateMat = new ModMaterials("jerry", 160000001, new int[]{506013, 1658961, 341564, 454230}, 59, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, Ingredient.fromStacks(new ItemStack(jerryGem)));
//    public static ModMaterials jerryLeggingsMat = new ModMaterials("jerry", 15000001, new int[]{506013, 1658961, 341564, 454230}, 59, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, Ingredient.fromStacks(new ItemStack(jerryGem)));
//    public static ModMaterials jerryBootsMat = new ModMaterials("jerry", 13000001, new int[]{506013, 1658961, 341564, 454230}, 59, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, Ingredient.fromStacks(new ItemStack(jerryGem)));
//
//    public static Item slimeHelmet = new ArmorBase("slime_helmet", slimeHelmetMat, EquipmentSlotType.HEAD);
//    public static Item slimeChestplate = new ArmorBase("slime_chestplate", slimeChestplateMat, EquipmentSlotType.CHEST);
//    public static Item slimeLeggings = new ArmorBase("slime_leggings", slimeLeggingsMat, EquipmentSlotType.LEGS);
//    public static Item slimeBoots = new ArmorBase("slime_boots", slimeBootsMat, EquipmentSlotType.FEET);
//
//    public static Item jerryHelmet = new ArmorBase("jerry_helmet", jerryHelmetMat, EquipmentSlotType.HEAD);
//    public static Item jerryChestplate = new ArmorBase("jerry_chestplate", jerryChestplateMat, EquipmentSlotType.CHEST);
//    public static Item jerryLeggings = new ArmorBase("jerry_leggings", jerryLeggingsMat, EquipmentSlotType.LEGS);
//    public static Item jerryBoots = new ArmorBase("jerry_boots", jerryBootsMat, EquipmentSlotType.FEET);
//
//    public static Item slimeSword = new SwordBase("slime_sword", ModTier.SLIMESWORD, 128/2, ModTier.SLIMESWORD.getEfficiency());
//    public static Item jerrySword = new SwordBase("jerry_sword", ModTier.JERRYSWORD, 848/2, ModTier.JERRYSWORD.getEfficiency());
//    public static Item slimeAxe = new AxeBase("slime_axe", ModTier.SLIMEAXE, ModTier.SLIMEAXE.getAttackDamage()/2, ModTier.SLIMEAXE.getEfficiency());
//    public static Item jerryAxe = new AxeBase("jerry_axe", ModTier.JERRYAXE, ModTier.JERRYAXE.getAttackDamage()/2, ModTier.JERRYAXE.getEfficiency());
//    public static Item slimePickaxe = new PickaxeBase("slime_pickaxe", ModTier.SLIMEPICKAXE, 126/2);
//    public static Item jerryPickaxe = new PickaxeBase("jerry_pickaxe", ModTier.JERRYPICKAXE, 846/2);
//    public static Item slimeShovel = new ShovelBase("slime_shovel", ModTier.SLIMESHOVEL, 126/2, ModTier.SLIMESHOVEL.getEfficiency());
//    public static Item jerryShovel = new ShovelBase("jerry_shovel", ModTier.JERRYSHOVEL, 846/2, ModTier.JERRYSHOVEL.getEfficiency());
//    public static Item slimeHoe = new HoeBase("slime_hoe", ModTier.SLIMEHOE, ModTier.SLIMEHOE.getEfficiency());
//    public static Item jerryHoe = new HoeBase("jerry_hoe", ModTier.JERRYHOE, ModTier.JERRYHOE.getEfficiency());