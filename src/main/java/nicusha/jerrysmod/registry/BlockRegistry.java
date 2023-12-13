package nicusha.jerrysmod.registry;

import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.resources.*;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.*;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.TreeGrower;
import net.minecraft.world.level.block.state.*;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.material.*;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.*;
import nicusha.jerrysmod.JerrysMod;
import nicusha.jerrysmod.blocks.*;
import nicusha.jerrysmod.utils.JerryTreeGrower;

import java.util.Optional;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = JerrysMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, JerrysMod.MODID);
    public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, JerrysMod.MODID);
    public static final RegistryObject<Block> slime_ore = registerBlock("slime_ore", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).requiresCorrectToolForDrops().strength(2.0F, 3.0F))),
            deepslate_slime_ore = registerBlock("deepslate_slime_ore", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).strength(2.0F, 3.0F).requiresCorrectToolForDrops())),
            slime_stone = registerBlock("slime_stone", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).strength(2.0F, 3.0F).requiresCorrectToolForDrops())),
            slime_grass = registerBlock("slime_grass", () -> new BlockModGrass()),
            olive_log = registerBlock("olive_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).strength(2.0F, 3.0F).requiresCorrectToolForDrops())),
            stripped_olive_log = registerBlock("stripped_olive_log", () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_BROWN).strength(2.0F, 3.0F).requiresCorrectToolForDrops())),
            olive_planks = registerBlock("olive_planks", () -> new Block(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).strength(2.0F, 3.0F).requiresCorrectToolForDrops())),
            olive_leaves = registerBlock("olive_leaves", () -> new LeavesBlock(BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).strength(2.0F, 3.0F).requiresCorrectToolForDrops()){
                @Override
                public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
                    super.stepOn(level, pos, state, entity);
                    entity.setDeltaMovement(entity.getDeltaMovement().add(0, 0.8, 0));
                }
            }),
            olive_sapling = registerBlock("olive_sapling", () -> new SaplingBlock(JerryTreeGrower.OLIVE, BlockBehaviour.Properties.of().mapColor(MapColor.COLOR_LIGHT_GREEN).noCollission().randomTicks().instabreak().sound(SoundType.GRASS)){
                @Override
                public boolean canSurvive(BlockState state, LevelReader worldIn, BlockPos pos) {
                    BlockState soil = worldIn.getBlockState(pos.below());
                    return super.canSurvive(state, worldIn, pos) || soil.getBlock() == ForgeRegistries.BLOCKS.getValue(new ResourceLocation(JerrysMod.MODID, "slime_grass"));
                }
            }),
            olive_stairs = registerBlock("olive_stairs", () -> new StairBlock(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(JerrysMod.MODID, "olive_planks")).defaultBlockState(), ForgeRegistries.BLOCKS.getValue(new ResourceLocation(JerrysMod.MODID, "olive_planks")).properties())),
            olive_button = registerBlock("olive_button", () -> new ButtonBlock(BlockSetType.BAMBOO, 30, ForgeRegistries.BLOCKS.getValue(new ResourceLocation(JerrysMod.MODID, "olive_planks")).properties())),
            olive_slab = registerBlock("olive_slab", () -> new SlabBlock(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(JerrysMod.MODID, "olive_planks")).properties())),
            olive_pressure_plate = registerBlock("olive_pressure_plate", () -> new PressurePlateBlock(BlockSetType.BAMBOO, ForgeRegistries.BLOCKS.getValue(new ResourceLocation(JerrysMod.MODID, "olive_planks")).properties())),
            olive_fence = registerBlock("olive_fence", () -> new FenceBlock(ForgeRegistries.BLOCKS.getValue(new ResourceLocation(JerrysMod.MODID, "olive_planks")).properties())),
            olive_fence_gate = registerBlock("olive_fence_gate", () -> new FenceGateBlock(WoodType.BAMBOO, ForgeRegistries.BLOCKS.getValue(new ResourceLocation(JerrysMod.MODID, "olive_planks")).properties())),
            olive_trap_door = registerBlock("olive_trap_door", () -> new TrapDoorBlock(BlockSetType.BAMBOO, ForgeRegistries.BLOCKS.getValue(new ResourceLocation(JerrysMod.MODID, "olive_planks")).properties())),
            olive_door = registerBlock("olive_door", () -> new DoorBlock(BlockSetType.BAMBOO, ForgeRegistries.BLOCKS.getValue(new ResourceLocation(JerrysMod.MODID, "olive_planks")).properties())),
            dregs_portal = registerBlock("dregs_portal", () -> new DregsPortal());




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        return registerBlock(name, block, Rarity.COMMON);
    }


    private static <T extends Block> RegistryObject<T> registerBlock(String registryName, Supplier<T> block, Rarity rarity) {
        RegistryObject<T> registeredBlock = BLOCKS.register(registryName, block);
        BLOCK_ITEMS.register(registryName, () -> new BlockItem(registeredBlock.get(), new Item.Properties().rarity(rarity)));
        return registeredBlock;
    }
}
