package nicusha.jerrysmod.data.tag;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.IntrinsicHolderTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import nicusha.jerrysmod.JerrysMod;
import nicusha.jerrysmod.registry.BlockRegistry;

import java.util.concurrent.CompletableFuture;

public class BlockTagGen extends IntrinsicHolderTagsProvider<Block> {
    public static final TagKey<Block> SLIME_ORE = createModded("c","ores/slime");
    public static final TagKey<Block> ORES = createModded("c","ores");
    public static final TagKey<Block> STONE = createModded("c","stones/slime");
    public static final TagKey<Block> STONES = createModded("c","stones");
    public static final TagKey<Block> AXE = createModded("minecraft","mineable/axe");
    public static final TagKey<Block> PICKAXE = createModded("minecraft","mineable/pickaxe");
    public static final TagKey<Block> SHOVEL = createModded("minecraft","mineable/shovel");
    public static final TagKey<Block> ANNIMALS_SPAWN_ON = createModded("minecraft","animals_spawnable_on");
    public static final TagKey<Block> BASE_STONE_OVERWORLD = createModded("minecraft","base_stone_overworld");
    public static final TagKey<Block> BUTTONS = createModded("minecraft","buttons");
    public static final TagKey<Block> DOORS = createModded("minecraft","doors");
    public static final TagKey<Block> FENCE_GATES = createModded("minecraft","fence_gates");
    public static final TagKey<Block> FENCES = createModded("minecraft","fences");
    public static final TagKey<Block> GOATS_SPAWN_ON = createModded("minecraft","goats_spawnable_on");
    public static final TagKey<Block> LAVA_POOL_STONE = createModded("minecraft","lava_pool_stone_cannot_replace");
    public static final TagKey<Block> LEAVES = createModded("minecraft","leaves");
    public static final TagKey<Block> LOGS = createModded("minecraft","logs");
    public static final TagKey<Block> MOOSHROOMS_SPAWN_ON = createModded("minecraft","mooshrooms_spawnable_on");
    public static final TagKey<Block> NEEDS_DIAMOND_TOOL = createModded("minecraft","needs_diamond_tool");
    public static final TagKey<Block> OVERWORLD_CARVER_REPLACEABLES = createModded("minecraft","overworld_carver_replaceables");
    public static final TagKey<Block> PARROTS_SPAWN_ON = createModded("minecraft","parrots_spawnable_on");
    public static final TagKey<Block> PLANKS = createModded("minecraft","planks");
    public static final TagKey<Block> PORTALS = createModded("minecraft","portals");
    public static final TagKey<Block> PRESSURE_PLATES = createModded("minecraft","pressure_plates");
    public static final TagKey<Block> RABBITS_SPAWN_ON = createModded("minecraft","rabbits_spawnable_on");
    public static final TagKey<Block> SAPLINGS = createModded("minecraft","saplings");
    public static final TagKey<Block> SLABS = createModded("minecraft","slabs");
    public static final TagKey<Block> STAIRS = createModded("minecraft","stairs");
    public static final TagKey<Block> TRAPDOORS = createModded("minecraft","trapdoors");
    public static final TagKey<Block> VALID_SPAWN = createModded("minecraft","valid_spawn");
    public static final TagKey<Block> WOODEN_BUTTONS = createModded("minecraft","wooden_buttons");
    public static final TagKey<Block> WOODEN_DOORS = createModded("minecraft","wooden_doors");
    public static final TagKey<Block> WOODEN_FENCE_GATES = createModded("minecraft","wooden_fence_gates");
    public static final TagKey<Block> WOODEN_FENCES = createModded("minecraft","wooden_fences");
    public static final TagKey<Block> WOODEN_PRESSURE_PLATES = createModded("minecraft","wooden_pressure_plates");
    public static final TagKey<Block> WOODEN_SLABS = createModded("minecraft","wooden_slabs");
    public static final TagKey<Block> WOODEN_STAIRS = createModded("minecraft","wooden_stairs");
    public static final TagKey<Block> WOODEN_TRAPDOORS = createModded("minecraft","wooden_trapdoors");
    public static final TagKey<Block> COMPLETES_FIND_TREE_TUTORIAL = createModded("minecraft","completes_find_tree_tutorial");
    public static final TagKey<Block> MOB_INTERACTABLE_DOORS = createModded("minecraft","mob_interactable_doors");
    public static final TagKey<Block> CFENCE_GATES = createModded("c","fence_gates");
    public static final TagKey<Block> CFENCES = createModded("c","fences");
    public static final TagKey<Block> ORES_IN_GROUND = createModded("c","ores_in_ground/stone");
    public static final TagKey<Block> ORES_IN_DEEPSLATE = createModded("c","ores_in_ground/deepslate");
    public static final TagKey<Block> STRIPPED_LOGS = createModded("c","stripped_logs");

    public BlockTagGen(PackOutput output, CompletableFuture<HolderLookup.Provider> future, ExistingFileHelper helper) {
        super(output, Registries.BLOCK, future, block -> block.builtInRegistryHolder().key(), JerrysMod.MODID, helper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(SLIME_ORE).add(BlockRegistry.slime_ore.get(), BlockRegistry.deepslate_slime_ore.get());
        tag(ORES).addTag(SLIME_ORE);
        tag(STONE).add(BlockRegistry.slime_stone.get());
        tag(STONES).addTag(STONE);
        tag(AXE).add(BlockRegistry.stripped_olive_log.get(), BlockRegistry.olive_log.get(), BlockRegistry.olive_planks.get(), BlockRegistry.olive_stairs.get(), BlockRegistry.olive_button.get(), BlockRegistry.olive_slab.get(), BlockRegistry.olive_fence.get(), BlockRegistry.olive_fence_gate.get(), BlockRegistry.olive_trap_door.get(), BlockRegistry.olive_door.get(), BlockRegistry.olive_pressure_plate.get());
        tag(PICKAXE).add(BlockRegistry.slime_ore.get(), BlockRegistry.slime_stone.get(), BlockRegistry.deepslate_slime_ore.get());
        tag(SHOVEL).add(BlockRegistry.slime_grass.get());
        tag(ANNIMALS_SPAWN_ON).add(BlockRegistry.slime_stone.get(), BlockRegistry.slime_grass.get());
        tag(BASE_STONE_OVERWORLD).add(BlockRegistry.slime_stone.get());
        tag(BUTTONS).add(BlockRegistry.olive_button.get());
        tag(DOORS).add(BlockRegistry.olive_door.get());
        tag(FENCE_GATES).add(BlockRegistry.olive_fence_gate.get());
        tag(FENCES).add(BlockRegistry.olive_fence.get());
        tag(GOATS_SPAWN_ON).add(BlockRegistry.slime_stone.get(), BlockRegistry.slime_grass.get());
        tag(LAVA_POOL_STONE).add(BlockRegistry.slime_stone.get());
        tag(LEAVES).add(BlockRegistry.olive_leaves.get());
        tag(LOGS).add(BlockRegistry.olive_log.get());
        tag(MOOSHROOMS_SPAWN_ON).add(BlockRegistry.slime_grass.get());
        tag(NEEDS_DIAMOND_TOOL).add(BlockRegistry.slime_ore.get(), BlockRegistry.deepslate_slime_ore.get());
        tag(OVERWORLD_CARVER_REPLACEABLES).add(BlockRegistry.slime_stone.get(), BlockRegistry.slime_grass.get());
        tag(PARROTS_SPAWN_ON).add(BlockRegistry.slime_stone.get(), BlockRegistry.slime_grass.get());
        tag(PLANKS).add(BlockRegistry.olive_planks.get());
        tag(PORTALS).add(BlockRegistry.dregs_portal.get());
        tag(PRESSURE_PLATES).add(BlockRegistry.olive_pressure_plate.get());
        tag(RABBITS_SPAWN_ON).add(BlockRegistry.slime_grass.get(), BlockRegistry.slime_stone.get());
        tag(SAPLINGS).add(BlockRegistry.olive_sapling.get());
        tag(SLABS).add(BlockRegistry.olive_slab.get());
        tag(STAIRS).add(BlockRegistry.olive_stairs.get());
        tag(TRAPDOORS).add(BlockRegistry.olive_trap_door.get());
        tag(VALID_SPAWN).add(BlockRegistry.slime_grass.get(), BlockRegistry.slime_stone.get());
        tag(WOODEN_BUTTONS).add(BlockRegistry.olive_button.get());
        tag(WOODEN_DOORS).add(BlockRegistry.olive_door.get());
        tag(WOODEN_FENCE_GATES).add(BlockRegistry.olive_fence_gate.get());
        tag(WOODEN_FENCES).add(BlockRegistry.olive_fence.get());
        tag(WOODEN_PRESSURE_PLATES).add(BlockRegistry.olive_pressure_plate.get());
        tag(WOODEN_SLABS).add(BlockRegistry.olive_slab.get());
        tag(WOODEN_STAIRS).add(BlockRegistry.olive_stairs.get());
        tag(WOODEN_TRAPDOORS).add(BlockRegistry.olive_trap_door.get());
        tag(COMPLETES_FIND_TREE_TUTORIAL).add(BlockRegistry.olive_log.get());
        tag(MOB_INTERACTABLE_DOORS).add(BlockRegistry.olive_door.get());
        tag(CFENCE_GATES).add(BlockRegistry.olive_fence_gate.get());
        tag(CFENCES).add(BlockRegistry.olive_fence.get());
        tag(ORES_IN_GROUND).add(BlockRegistry.slime_ore.get());
        tag(ORES_IN_DEEPSLATE).add(BlockRegistry.deepslate_slime_ore.get());
        tag(STRIPPED_LOGS).add(BlockRegistry.stripped_olive_log.get());
    }

    private static TagKey<Block> createModded(String modid, String tagName) {
        return BlockTags.create(ResourceLocation.fromNamespaceAndPath(modid, tagName));
    }

    public static TagKey<Block> create(String tagName) {
        return BlockTags.create(ResourceLocation.fromNamespaceAndPath(JerrysMod.MODID, tagName));
    }

}
