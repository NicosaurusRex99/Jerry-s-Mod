package nicusha.jerrysmod.data.tag;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import nicusha.jerrysmod.registry.BlockRegistry;
import nicusha.jerrysmod.registry.ItemRegistry;

import java.util.concurrent.CompletableFuture;

import static nicusha.jerrysmod.JerrysMod.MODID;

public class ItemTagGen extends ItemTagsProvider {
    public static final TagKey<Item> SLIME_GEM = create(MODID, "slime_gem");
    public static final TagKey<Item> JERRY_GEM = create(MODID, "jerry_gem");
    public static final TagKey<Item> TRIMMABLE_ARMOR = create("minecraft", "trimmable_armor");
    public static final TagKey<Item> GEMS_J = create("c", "gems/jerry");
    public static final TagKey<Item> GEMS_S = create("c", "gems/slime");
    public static final TagKey<Item> GEMS = create("c", "gems");
    public static final TagKey<Item> SLIME_ORE = create("c","ores/slime");
    public static final TagKey<Item> ORES = create("c","ores");
    public static final TagKey<Item> STONE = create("c","stone/slime");
    public static final TagKey<Item> STONES = create("c","stone");
    public static final TagKey<Item> RODS = create("c","rods");
    public static final TagKey<Item> AXE = create("minecraft","mineable/axe");
    public static final TagKey<Item> PICKAXE = create("minecraft","mineable/pickaxe");
    public static final TagKey<Item> SHOVEL = create("minecraft","mineable/shovel");
    public static final TagKey<Item> ANNIMALS_SPAWN_ON = create("minecraft","animals_spawnable_on");
    public static final TagKey<Item> BASE_STONE_OVERWORLD = create("minecraft","base_stone_overworld");
    public static final TagKey<Item> BUTTONS = create("minecraft","buttons");
    public static final TagKey<Item> DOORS = create("minecraft","doors");
    public static final TagKey<Item> FENCE_GATES = create("minecraft","fence_gates");
    public static final TagKey<Item> FENCES = create("minecraft","fences");
    public static final TagKey<Item> GOATS_SPAWN_ON = create("minecraft","goats_spawnable_on");
    public static final TagKey<Item> LAVA_POOL_STONE = create("minecraft","lava_pool_stone_cannot_replace");
    public static final TagKey<Item> LEAVES = create("minecraft","leaves");
    public static final TagKey<Item> LOGS = create("minecraft","logs");
    public static final TagKey<Item> MOOSHROOMS_SPAWN_ON = create("minecraft","mooshrooms_spawnable_on");
    public static final TagKey<Item> NEEDS_DIAMOND_TOOL = create("minecraft","needs_diamond_tool");
    public static final TagKey<Item> OVERWORLD_CARVER_REPLACEABLES = create("minecraft","overworld_carver_replaceables");
    public static final TagKey<Item> PARROTS_SPAWN_ON = create("minecraft","parrots_spawnable_on");
    public static final TagKey<Item> PLANKS = create("minecraft","planks");
    public static final TagKey<Item> PORTALS = create("minecraft","portals");
    public static final TagKey<Item> PRESSURE_PLATES = create("minecraft","pressure_plates");
    public static final TagKey<Item> RABBITS_SPAWN_ON = create("minecraft","rabbits_spawnable_on");
    public static final TagKey<Item> SAPLINGS = create("minecraft","saplings");
    public static final TagKey<Item> SLABS = create("minecraft","slabs");
    public static final TagKey<Item> STAIRS = create("minecraft","stairs");
    public static final TagKey<Item> TRAPDOORS = create("minecraft","trapdoors");
    public static final TagKey<Item> VALID_SPAWN = create("minecraft","valid_spawn");
    public static final TagKey<Item> WOODEN_BUTTONS = create("minecraft","wooden_buttons");
    public static final TagKey<Item> WOODEN_DOORS = create("minecraft","wooden_doors");
    public static final TagKey<Item> WOODEN_FENCE_GATES = create("minecraft","wooden_fence_gates");
    public static final TagKey<Item> WOODEN_FENCES = create("minecraft","wooden_fences");
    public static final TagKey<Item> WOODEN_PRESSURE_PLATES = create("minecraft","wooden_pressure_plates");
    public static final TagKey<Item> WOODEN_SLABS = create("minecraft","wooden_slabs");
    public static final TagKey<Item> WOODEN_STAIRS = create("minecraft","wooden_stairs");
    public static final TagKey<Item> WOODEN_TRAPDOORS = create("minecraft","wooden_trapdoors");
    public static final TagKey<Item> COMPLETES_FIND_TREE_TUTORIAL = create("minecraft","completes_find_tree_tutorial");
    public static final TagKey<Item> MOB_INTERACTABLE_DOORS = create("minecraft","mob_interactable_doors");
    public static final TagKey<Item> CFENCE_GATES = create("c","fence_gates");
    public static final TagKey<Item> CFENCES = create("c","fences");
    public static final TagKey<Item> ORES_IN_GROUND = create("c","ores_in_ground/stone");
    public static final TagKey<Item> ORES_IN_DEEPSLATE = create("c","ores_in_ground/deepslate");
    public static final TagKey<Item> STRIPPED_LOGS = create("c","stripped_logs");
    public static final TagKey<Item> ARMORS = create("c","armors");
    public static final TagKey<Item> MELEE_WEAPON = create("c","tools/melee_weapon");
    public static final TagKey<Item> MINING_TOOL = create("c","tools/mining_tool");
    public static final TagKey<Item> ENCHANT_CHEST_ARMOR = create("minecraft","enchantable/chest_armor");
    public static final TagKey<Item> ENCHANT_FOOT_ARMOR = create("minecraft","enchantable/foot_armor");
    public static final TagKey<Item> ENCHANT_HEAD_ARMOR = create("minecraft","enchantable/head_armor");
    public static final TagKey<Item> ENCHANT_LEG_ARMOR = create("minecraft","enchantable/leg_armor");
    public static final TagKey<Item> ENCHANT_MINING = create("minecraft","enchantable/mining");
    public static final TagKey<Item> ENCHANT_SWORD = create("minecraft","enchantable/sword");
    public static final TagKey<Item> AXES = create("minecraft","axes");
    public static final TagKey<Item> BEACON_PAYMENT_ITEMS = create("minecraft","beacon_payment_items");
    public static final TagKey<Item> CHEST_ARMOR = create("minecraft","chest_armor");
    public static final TagKey<Item> FOOT_ARMOR = create("minecraft","foot_armor");
    public static final TagKey<Item> HEAD_ARMOR = create("minecraft","head_armor");
    public static final TagKey<Item> LEG_ARMOR = create("minecraft","leg_armor");
    public static final TagKey<Item> HOES = create("minecraft","hoes");
    public static final TagKey<Item> LOGS_THAT_BURN = create("minecraft","logs_that_burn");
    public static final TagKey<Item> PICKAXES = create("minecraft","pickaxes");
    public static final TagKey<Item> SHOVELS = create("minecraft","shovels");
    public static final TagKey<Item> SWORDS = create("minecraft","swords");


    public ItemTagGen(PackOutput output, CompletableFuture<HolderLookup.Provider> future, CompletableFuture<TagLookup<Block>> provider, ExistingFileHelper helper) {
        super(output, future, provider, MODID, helper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(SLIME_GEM).add(ItemRegistry.slime_gem.get());
        tag(JERRY_GEM).add(ItemRegistry.jerry_gem.get());
        tag(TRIMMABLE_ARMOR).add(ItemRegistry.jerry_boots.get(), ItemRegistry.slime_boots.get(), ItemRegistry.jerry_leggings.get(), ItemRegistry.slime_leggings.get(), ItemRegistry.jerry_chestplate.get(), ItemRegistry.slime_chestplate.get(), ItemRegistry.jerry_helmet.get(), ItemRegistry.slime_helmet.get());
        tag(GEMS).addTags(GEMS_S, GEMS_J);
        tag(GEMS_S).add(ItemRegistry.slime_gem.get());
        tag(GEMS_J).add(ItemRegistry.jerry_gem.get());
        tag(SLIME_ORE).add(BlockRegistry.slime_ore.asItem(), BlockRegistry.deepslate_slime_ore.asItem());
        tag(ORES).addTag(SLIME_ORE);
        tag(STONE).add(BlockRegistry.slime_stone.asItem());
        tag(STONES).addTag(STONE);
        tag(RODS).add(ItemRegistry.slime_stick.get());
        tag(AXE).add(BlockRegistry.stripped_olive_log.asItem(), BlockRegistry.olive_log.asItem(), BlockRegistry.olive_planks.asItem(), BlockRegistry.olive_stairs.asItem(), BlockRegistry.olive_button.asItem(), BlockRegistry.olive_slab.asItem(), BlockRegistry.olive_fence.asItem(), BlockRegistry.olive_fence_gate.asItem(), BlockRegistry.olive_trap_door.asItem(), BlockRegistry.olive_door.asItem(), BlockRegistry.olive_pressure_plate.asItem());
        tag(PICKAXE).add(BlockRegistry.slime_ore.asItem(), BlockRegistry.slime_stone.asItem(), BlockRegistry.deepslate_slime_ore.asItem());
        tag(SHOVEL).add(BlockRegistry.slime_grass.asItem());
        tag(ANNIMALS_SPAWN_ON).add(BlockRegistry.slime_stone.asItem(), BlockRegistry.slime_grass.asItem());
        tag(BASE_STONE_OVERWORLD).add(BlockRegistry.slime_stone.asItem());
        tag(BUTTONS).add(BlockRegistry.olive_button.asItem());
        tag(DOORS).add(BlockRegistry.olive_door.asItem());
        tag(FENCE_GATES).add(BlockRegistry.olive_fence_gate.asItem());
        tag(FENCES).add(BlockRegistry.olive_fence.asItem());
        tag(GOATS_SPAWN_ON).add(BlockRegistry.slime_stone.asItem(), BlockRegistry.slime_grass.asItem());
        tag(LAVA_POOL_STONE).add(BlockRegistry.slime_stone.asItem());
        tag(LEAVES).add(BlockRegistry.olive_leaves.asItem());
        tag(LOGS).add(BlockRegistry.olive_log.asItem());
        tag(MOOSHROOMS_SPAWN_ON).add(BlockRegistry.slime_grass.asItem());
        tag(NEEDS_DIAMOND_TOOL).add(BlockRegistry.slime_ore.asItem(), BlockRegistry.deepslate_slime_ore.asItem());
        tag(OVERWORLD_CARVER_REPLACEABLES).add(BlockRegistry.slime_stone.asItem(), BlockRegistry.slime_grass.asItem());
        tag(PARROTS_SPAWN_ON).add(BlockRegistry.slime_stone.asItem(), BlockRegistry.slime_grass.asItem());
        tag(PLANKS).add(BlockRegistry.olive_planks.asItem());
        tag(PORTALS).add(BlockRegistry.dregs_portal.asItem());
        tag(PRESSURE_PLATES).add(BlockRegistry.olive_pressure_plate.asItem());
        tag(RABBITS_SPAWN_ON).add(BlockRegistry.slime_grass.asItem(), BlockRegistry.slime_stone.asItem());
        tag(SAPLINGS).add(BlockRegistry.olive_sapling.asItem());
        tag(SLABS).add(BlockRegistry.olive_slab.asItem());
        tag(STAIRS).add(BlockRegistry.olive_stairs.asItem());
        tag(TRAPDOORS).add(BlockRegistry.olive_trap_door.asItem());
        tag(VALID_SPAWN).add(BlockRegistry.slime_grass.asItem(), BlockRegistry.slime_stone.asItem());
        tag(WOODEN_BUTTONS).add(BlockRegistry.olive_button.asItem());
        tag(WOODEN_DOORS).add(BlockRegistry.olive_door.asItem());
        tag(WOODEN_FENCE_GATES).add(BlockRegistry.olive_fence_gate.asItem());
        tag(WOODEN_FENCES).add(BlockRegistry.olive_fence.asItem());
        tag(WOODEN_PRESSURE_PLATES).add(BlockRegistry.olive_pressure_plate.asItem());
        tag(WOODEN_SLABS).add(BlockRegistry.olive_slab.asItem());
        tag(WOODEN_STAIRS).add(BlockRegistry.olive_stairs.asItem());
        tag(WOODEN_TRAPDOORS).add(BlockRegistry.olive_trap_door.asItem());
        tag(COMPLETES_FIND_TREE_TUTORIAL).add(BlockRegistry.olive_log.asItem());
        tag(MOB_INTERACTABLE_DOORS).add(BlockRegistry.olive_door.asItem());
        tag(CFENCE_GATES).add(BlockRegistry.olive_fence_gate.asItem());
        tag(CFENCES).add(BlockRegistry.olive_fence.asItem());
        tag(ORES_IN_GROUND).add(BlockRegistry.slime_ore.asItem());
        tag(ORES_IN_DEEPSLATE).add(BlockRegistry.deepslate_slime_ore.asItem());
        tag(STRIPPED_LOGS).add(BlockRegistry.stripped_olive_log.asItem());
        tag(ARMORS).add(ItemRegistry.jerry_helmet.get(), ItemRegistry.slime_helmet.get(), ItemRegistry.jerry_chestplate.get(), ItemRegistry.slime_chestplate.get(), ItemRegistry.jerry_leggings.get(), ItemRegistry.slime_leggings.get(), ItemRegistry.jerry_boots.get(), ItemRegistry.slime_boots.get());
        tag(MELEE_WEAPON).add(ItemRegistry.slime_sword.get(), ItemRegistry.slime_axe.get(), ItemRegistry.jerry_sword.get(), ItemRegistry.jerry_axe.get());
        tag(MINING_TOOL).add(ItemRegistry.slime_pickaxe.get(), ItemRegistry.jerry_pickaxe.get());
        tag(ENCHANT_CHEST_ARMOR).add(ItemRegistry.jerry_chestplate.get(), ItemRegistry.slime_chestplate.get());
        tag(ENCHANT_FOOT_ARMOR).add(ItemRegistry.jerry_boots.get(), ItemRegistry.slime_boots.get());
        tag(ENCHANT_HEAD_ARMOR).add(ItemRegistry.jerry_helmet.get(), ItemRegistry.slime_helmet.get());
        tag(ENCHANT_LEG_ARMOR).add(ItemRegistry.jerry_leggings.get(), ItemRegistry.slime_leggings.get());
        tag(ENCHANT_MINING).add(ItemRegistry.jerry_pickaxe.get(), ItemRegistry.slime_pickaxe.get());
        tag(ENCHANT_SWORD).add(ItemRegistry.jerry_sword.get(), ItemRegistry.slime_sword.get());
        tag(AXES).add(ItemRegistry.jerry_axe.get(), ItemRegistry.slime_axe.get());
        tag(BEACON_PAYMENT_ITEMS).add(ItemRegistry.jerry_gem.get(), ItemRegistry.slime_gem.get());
        tag(CHEST_ARMOR).add(ItemRegistry.jerry_chestplate.get(), ItemRegistry.slime_chestplate.get());
        tag(FOOT_ARMOR).add(ItemRegistry.jerry_boots.get(), ItemRegistry.slime_boots.get());
        tag(HEAD_ARMOR).add(ItemRegistry.jerry_helmet.get(), ItemRegistry.slime_helmet.get());
        tag(LEG_ARMOR).add(ItemRegistry.jerry_leggings.get(), ItemRegistry.slime_leggings.get());
        tag(HOES).add(ItemRegistry.jerry_hoe.get(), ItemRegistry.slime_hoe.get());
        tag(LOGS_THAT_BURN).add(BlockRegistry.olive_log.asItem(), BlockRegistry.stripped_olive_log.asItem());
        tag(PICKAXES).add(ItemRegistry.jerry_pickaxe.get(), ItemRegistry.slime_pickaxe.get());
        tag(SHOVELS).add(ItemRegistry.jerry_shovel.get(), ItemRegistry.slime_shovel.get());
        tag(SWORDS).add(ItemRegistry.jerry_sword.get(), ItemRegistry.slime_sword.get());
    }


    private static TagKey<Item> create(String modid, String tagName) {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath(modid, tagName));
    }
}
