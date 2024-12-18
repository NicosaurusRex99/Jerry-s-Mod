package nicusha.jerrysmod.registry;

import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.*;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.*;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.*;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.level.material.*;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import nicusha.jerrysmod.blocks.*;
import nicusha.jerrysmod.utils.JerryTreeGrower;

import java.util.List;
import java.util.function.Supplier;

import static nicusha.jerrysmod.JerrysMod.MODID;

public class BlockRegistry {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);
    public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(BuiltInRegistries.ITEM, MODID);
    public static final DeferredBlock<Block> slime_ore = registerBlock("slime_ore", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).requiresCorrectToolForDrops().strength(2.0F, 3.0F).setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MODID, "slime_ore"))))),
            deepslate_slime_ore = registerBlock("deepslate_slime_ore", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).strength(2.0F, 3.0F).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MODID, "deepslate_slime_ore"))))),
            slime_stone = registerBlock("slime_stone", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).strength(2.0F, 3.0F).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MODID, "slime_stone"))))),
            slime_grass = registerBlock("slime_grass", () -> new BlockModGrass(Block.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).randomTicks().requiresCorrectToolForDrops().strength(2.0F, 3.0F).sound(SoundType.GRASS).setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MODID, "slime_grass"))))),
            olive_log = registerBlock("olive_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).strength(2.0F, 3.0F).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MODID, "olive_log"))))),
            stripped_olive_log = registerBlock("stripped_olive_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).strength(2.0F, 3.0F).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MODID, "stripped_olive_log"))))),
            olive_planks = registerBlock("olive_planks", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).strength(2.0F, 3.0F).requiresCorrectToolForDrops().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MODID, "olive_planks"))))),
            olive_leaves = registerBlock("olive_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).strength(2.0F, 3.0F).setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MODID, "olive_leaves"))).requiresCorrectToolForDrops()){
                @Override
                public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
                    super.stepOn(level, pos, state, entity);
                    entity.setDeltaMovement(entity.getDeltaMovement().add(0, 0.8, 0));
                }
            }),
            olive_sapling = registerBlock("olive_sapling", () -> new SaplingBlock(JerryTreeGrower.OLIVE, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS).setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MODID, "olive_sapling")))){
                @Override
                public boolean canSurvive(BlockState state, LevelReader worldIn, BlockPos pos) {
                    BlockState soil = worldIn.getBlockState(pos.below());
                    return super.canSurvive(state, worldIn, pos) || soil.getBlock() == BuiltInRegistries.BLOCK.getValue(ResourceLocation.fromNamespaceAndPath(MODID, "slime_grass"));
                }
            }),
            olive_stairs = registerBlock("olive_stairs", () -> new StairBlock(BuiltInRegistries.BLOCK.getValue(ResourceLocation.fromNamespaceAndPath(MODID, "olive_planks")).defaultBlockState(), BuiltInRegistries.BLOCK.getValue(ResourceLocation.fromNamespaceAndPath(MODID, "olive_planks")).properties().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MODID, "olive_stairs"))))),
            olive_button = registerBlock("olive_button", () -> new ButtonBlock(BlockSetType.BAMBOO, 30, BuiltInRegistries.BLOCK.getValue(ResourceLocation.fromNamespaceAndPath(MODID, "olive_planks")).properties().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MODID, "olive_button"))))),
            olive_slab = registerBlock("olive_slab", () -> new SlabBlock(BuiltInRegistries.BLOCK.getValue(ResourceLocation.fromNamespaceAndPath(MODID, "olive_planks")).properties().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MODID, "olive_slab"))))),
            olive_pressure_plate = registerBlock("olive_pressure_plate", () -> new PressurePlateBlock(BlockSetType.BAMBOO, BuiltInRegistries.BLOCK.getValue(ResourceLocation.fromNamespaceAndPath(MODID, "olive_planks")).properties().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MODID, "olive_pressure_plate"))))),
            olive_fence = registerBlock("olive_fence", () -> new FenceBlock(BuiltInRegistries.BLOCK.getValue(ResourceLocation.fromNamespaceAndPath(MODID, "olive_planks")).properties().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MODID, "olive_fence"))))),
            olive_fence_gate = registerBlock("olive_fence_gate", () -> new FenceGateBlock(WoodType.BAMBOO, BuiltInRegistries.BLOCK.getValue(ResourceLocation.fromNamespaceAndPath(MODID, "olive_planks")).properties().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MODID, "olive_fence_gate"))))),
            olive_trap_door = registerBlock("olive_trap_door", () -> new TrapDoorBlock(BlockSetType.BAMBOO, BuiltInRegistries.BLOCK.getValue(ResourceLocation.fromNamespaceAndPath(MODID, "olive_planks")).properties().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MODID, "olive_trap_door"))))),
            olive_door = registerBlock("olive_door", () -> new DoorBlock(BlockSetType.BAMBOO, BuiltInRegistries.BLOCK.getValue(ResourceLocation.fromNamespaceAndPath(MODID, "olive_planks")).properties().setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MODID, "olive_door"))))),
            dregs_portal = registerBlock("dregs_portal", () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.NETHER_PORTAL).setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(MODID, "dregs_portal")))){
                @Override
                public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                    tooltipComponents.add(Component.translatable("tooltip.jerrysmod.wip").withStyle(ChatFormatting.BOLD).withStyle(ChatFormatting.RED));
                }
            });




    private static <T extends Block> DeferredBlock<T> registerTablessBlock(String registryName, Supplier<T> block) {
        DeferredBlock<T> registeredBlock = BLOCKS.register(registryName, block);
        ItemRegistry.ITEMS.register(registryName, () -> new BlockItem(registeredBlock.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MODID, registryName)))));
        return registeredBlock;
    }
    private static <T extends Block> DeferredBlock<T> registerBlock(String registryName, Supplier<T> block) {
        DeferredBlock<T> registeredBlock = BLOCKS.register(registryName, block);
        ItemRegistry.ITEMS.register(registryName, () -> new BlockItem(registeredBlock.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MODID, registryName)))));
        return registeredBlock;
    }
}
