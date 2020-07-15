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
    @ObjectHolder("jerrysmod:slime_chunk")
    public static Item slimeChunk = null;
    @ObjectHolder("jerrysmod:slime_drop")
    public static Item slimeDrop = null;
    @ObjectHolder("jerrysmod:slime_head")
    public static Item slimeHead = null;
    @ObjectHolder("jerrysmod:slime_shard")
    public static Item slimeShard = null;
    @ObjectHolder("jerrysmod:slime_stick")
    public static Item slimeStick = null;
    @ObjectHolder("jerrysmod:captain_of_light")
    public static Item captainOfLight = null;
    @ObjectHolder("jerrysmod:grapes")
    public static Item grapes = null;
    @ObjectHolder("jerrysmod:olives")
    public static Item olives = null;

    @ObjectHolder("jerrysmod:slime_helmet")
    public static Item slimeHelmet = null;
    @ObjectHolder("jerrysmod:slime_chestplate")
    public static Item slimeChestplate = null;
    @ObjectHolder("jerrysmod:slime_leggings")
    public static Item slimeLeggings = null;
    @ObjectHolder("jerrysmod:slime_boots")
    public static Item slimeBoots = null;

    @ObjectHolder("jerrysmod:jerry_helmet")
    public static Item jerryHelmet = null;
    @ObjectHolder("jerrysmod:jerry_chestplate")
    public static Item jerryChestplate = null;
    @ObjectHolder("jerrysmod:jerry_leggings")
    public static Item jerryLeggings = null;
    @ObjectHolder("jerrysmod:jerry_boots")
    public static Item jerryBoots = null;

    @ObjectHolder("jerrysmod:slime_axe")
    public static Item slimeAxe = null;
    @ObjectHolder("jerrysmod:jerry_axe")
    public static Item jerryAxe = null;
    @ObjectHolder("jerrysmod:slime_pickaxe")
    public static Item slimePickaxe = null;
    @ObjectHolder("jerrysmod:jerry_pickaxe")
    public static Item jerryPickaxe = null;
    @ObjectHolder("jerrysmod:slime_hoe")
    public static Item slimeHoe = null;
    @ObjectHolder("jerrysmod:jerry_hoe")
    public static Item jerryHoe = null;
    @ObjectHolder("jerrysmod:slime_shovel")
    public static Item slimeShovel = null;
    @ObjectHolder("jerrysmod:jerry_shovel")
    public static Item jerryShovel = null;
    @ObjectHolder("jerrysmod:slime_sword")
    public static Item slimeSword = null;
    @ObjectHolder("jerrysmod:jerry_sword")
    public static Item jerrySword = null;


    public static ModMaterials slimeHelmetMat = new ModMaterials("slime", 5500001, new int[]{18, 51, 21, 30}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, Ingredient.fromStacks(new ItemStack(slimeGem)));
    public static ModMaterials slimeChestplateMat = new ModMaterials("slime", 8000001, new int[]{18, 51, 21, 30}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, Ingredient.fromStacks(new ItemStack(slimeGem)));
    public static ModMaterials slimeLeggingsMat = new ModMaterials("slime", 7500001, new int[]{18, 51, 21, 30}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, Ingredient.fromStacks(new ItemStack(slimeGem)));
    public static ModMaterials slimeBootsMat = new ModMaterials("slime", 6500001, new int[]{18, 51, 21, 30}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, Ingredient.fromStacks(new ItemStack(slimeGem)));

    public static ModMaterials jerryHelmetMat = new ModMaterials("jerry", 11000001, new int[]{506013, 1658961, 341564, 454230}, 59, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, Ingredient.fromStacks(new ItemStack(jerryGem)));
    public static ModMaterials jerryChestplateMat = new ModMaterials("jerry", 160000001, new int[]{506013, 1658961, 341564, 454230}, 59, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, Ingredient.fromStacks(new ItemStack(jerryGem)));
    public static ModMaterials jerryLeggingsMat = new ModMaterials("jerry", 15000001, new int[]{506013, 1658961, 341564, 454230}, 59, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, Ingredient.fromStacks(new ItemStack(jerryGem)));
    public static ModMaterials jerryBootsMat = new ModMaterials("jerry", 13000001, new int[]{506013, 1658961, 341564, 454230}, 59, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, Ingredient.fromStacks(new ItemStack(jerryGem)));


    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> e) {

        register(e, new ItemBase("slime_gem"));
        register(e, new ItemBase("jerry_gem"));
        register(e, new ItemBase("slime_chunk"));
        register(e, new ItemBase("slime_drop"));
        register(e, new ItemBase("slime_head"));
        register(e, new ItemBase("slime_shard"));
        register(e, new ItemBase("slime_stick"));
        register(e, new CaptainOfLight("captain_of_light"));
        register(e, new ItemBase("grapes",(new Item.Properties()).group(JerrysMod.setup.itemGroup).food(FoodBase.GRAPES)));
        register(e, new ItemBase("olives",(new Item.Properties()).group(JerrysMod.setup.itemGroup).food(FoodBase.OLIVES)));

        register(e, new ArmorBase("slime_helmet", slimeHelmetMat, EquipmentSlotType.HEAD));
        register(e, new ArmorBase("slime_chestplate", slimeChestplateMat, EquipmentSlotType.CHEST));
        register(e, new ArmorBase("slime_leggings", slimeLeggingsMat, EquipmentSlotType.LEGS));
        register(e, new ArmorBase("slime_boots", slimeBootsMat, EquipmentSlotType.FEET));

        register(e, new ArmorBase("jerry_helmet", jerryHelmetMat, EquipmentSlotType.HEAD));
        register(e, new ArmorBase("jerry_chestplate", jerryChestplateMat, EquipmentSlotType.CHEST));
        register(e, new ArmorBase("jerry_leggings", jerryLeggingsMat, EquipmentSlotType.LEGS));
        register(e, new ArmorBase("jerry_boots", jerryBootsMat, EquipmentSlotType.FEET));


        register(e, new SwordBase("slime_sword", ModTier.SLIMESWORD));
        register(e, new SwordBase("jerry_sword", ModTier.JERRYSWORD));
        register(e, new AxeBase("slime_axe", ModTier.SLIMEAXE));
        register(e, new AxeBase("jerry_axe", ModTier.JERRYAXE));
        register(e, new PickaxeBase("slime_pickaxe", ModTier.SLIMEPICKAXE));
        register(e, new PickaxeBase("jerry_pickaxe", ModTier.JERRYPICKAXE));
        register(e, new ShovelBase("slime_shovel", ModTier.SLIMESHOVEL));
        register(e, new ShovelBase("jerry_shovel", ModTier.JERRYSHOVEL));
        register(e, new HoeBase("slime_hoe", ModTier.SLIMEHOE));
        register(e, new HoeBase("jerry_hoe", ModTier.JERRYHOE));
    }


    private static void register(RegistryEvent.Register<Item> event, Item item) {
        event.getRegistry().register(item);
    }
}
