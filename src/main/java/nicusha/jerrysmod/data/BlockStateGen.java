package nicusha.jerrysmod.data;

import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.neoforged.neoforge.client.model.generators.BlockModelBuilder;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import nicusha.jerrysmod.registry.BlockRegistry;

import static nicusha.jerrysmod.JerrysMod.MODID;

public class BlockStateGen extends BlockStateProvider {

    public BlockStateGen(PackOutput packOutput, ExistingFileHelper existingFileHelper) {
        super(packOutput, MODID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(BlockRegistry.slime_ore.get());
        simpleBlock(BlockRegistry.deepslate_slime_ore.get());
        simpleBlock(BlockRegistry.slime_stone.get());
        simpleBlock(BlockRegistry.olive_leaves.get());
        simpleBlock(BlockRegistry.olive_planks.get());
        logBlock((RotatedPillarBlock) BlockRegistry.olive_log.get());
        logBlock((RotatedPillarBlock) BlockRegistry.stripped_olive_log.get());
        buttonBlock((ButtonBlock) BlockRegistry.olive_button.get(), ResourceLocation.fromNamespaceAndPath(MODID, "block/olive_planks"));
        stairsBlock((StairBlock) BlockRegistry.olive_stairs.get(), ResourceLocation.fromNamespaceAndPath(MODID, "block/olive_planks"));
        slabBlock((SlabBlock) BlockRegistry.olive_slab.get(), ResourceLocation.fromNamespaceAndPath(MODID, "block/olive_planks"), ResourceLocation.fromNamespaceAndPath(MODID, "block/olive_planks"));
        pressurePlateBlock((PressurePlateBlock) BlockRegistry.olive_pressure_plate.get(), ResourceLocation.fromNamespaceAndPath(MODID, "block/olive_planks"));
        fenceBlock((FenceBlock) BlockRegistry.olive_fence.get(), ResourceLocation.fromNamespaceAndPath(MODID, "block/olive_planks"));
        fenceGateBlock((FenceGateBlock) BlockRegistry.olive_fence_gate.get(), ResourceLocation.fromNamespaceAndPath(MODID, "block/olive_planks"));
        trapdoorBlock((TrapDoorBlock) BlockRegistry.olive_trap_door.get(), ResourceLocation.fromNamespaceAndPath(MODID, "block/olive_trap_door"), true);
        doorBlock((DoorBlock) BlockRegistry.olive_door.get(), ResourceLocation.fromNamespaceAndPath(MODID, "block/olive_door_bottom"), ResourceLocation.fromNamespaceAndPath(MODID, "block/olive_door_top"));
        simpleBlock(BlockRegistry.olive_sapling.get(), models().cross(BlockRegistry.olive_sapling.getId().getPath(), blockTexture(BlockRegistry.olive_sapling.get())).renderType("cutout"));
        simpleBlock(BlockRegistry.slime_grass.get(), this.grass(BlockRegistry.slime_grass.getId().getPath()).texture("side", ResourceLocation.fromNamespaceAndPath(MODID, "block/slime_grass")).texture("top", ResourceLocation.fromNamespaceAndPath(MODID, "block/slime_grass_top")).texture("bottom", ResourceLocation.withDefaultNamespace("block/dirt")));

        //TODO - portal
    }

    protected BlockModelBuilder grass(String name) {
        return this.directional(name, ResourceLocation.parse("solid"))
                .texture("north", "#side").texture("south", "#side").texture("east", "#side")
                .texture("west", "#side").texture("up", "#top").texture("down", "#bottom");
    }
    protected BlockModelBuilder directional(String name, ResourceLocation renderType) {
        return models().withExistingParent(name, "minecraft:block/block").renderType(renderType).texture("particle", "#north")
                .element().from(0.0F, 0.0F, 0.0F).to(16.0F, 16.0F, 16.0F)
                .face(Direction.NORTH).texture("#north").cullface(Direction.NORTH).tintindex(0).end()
                .face(Direction.EAST).texture("#east").cullface(Direction.EAST).tintindex(0).end()
                .face(Direction.SOUTH).texture("#south").cullface(Direction.SOUTH).tintindex(0).end()
                .face(Direction.WEST).texture("#west").cullface(Direction.WEST).tintindex(0).end()
                .face(Direction.UP).texture("#up").cullface(Direction.UP).tintindex(0).end()
                .face(Direction.DOWN).texture("#down").cullface(Direction.DOWN).tintindex(0).end().end();
    }

}
