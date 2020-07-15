package naturix.jerrysmod.registry;

import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.objects.blocks.*;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.block.trees.BirchTree;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.world.gen.feature.TreeFeature;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;


@Mod.EventBusSubscriber(modid = JerrysMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks {
    @ObjectHolder("jerrysmod:slime_ore")
    public static Block slimeOre = null;
    @ObjectHolder("jerrysmod:olive_planks")
    public static Block olivePlanks = null;
    @ObjectHolder("jerrysmod:slime_log")
    public static Block slimeLog = null;
    @ObjectHolder("jerrysmod:slime_log_stripped")
    public static Block slimeLogStripped = null;
    @ObjectHolder("jerrysmod:slime_leaves")
    public static Block slimeLeaves = null;
    @ObjectHolder("jerrysmod:slime_sapling")
    public static Block slimeSapling = null;
    @ObjectHolder("jerrysmod:olive_stairs")
    public static Block slimeStairs = null;
    @ObjectHolder("jerrysmod:olive_button")
    public static Block oliveButton = null;
    @ObjectHolder("jerrysmod:olive_slab")
    public static Block oliveSlab = null;
    @ObjectHolder("jerrysmod:olive_pressure_plate")
    public static Block olivePressurePlate = null;
    @ObjectHolder("jerrysmod:olive_fence")
    public static Block oliveFence = null;
    @ObjectHolder("jerrysmod:olive_fence_gate")
    public static Block oliveFenceGate = null;
    @ObjectHolder("jerrysmod:olive_trap_door")
    public static Block oliveTrapDoor = null;
    @ObjectHolder("jerrysmod:olive_door")
    public static Block oliveDoor = null;

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> e) {

        register(e, new BlockBase("slime_ore", 2, ToolType.PICKAXE));
        register(e, new BlockBase("olive_planks", 1, ToolType.AXE));
        register(e, new LogBase("slime_log", Block.Properties.create(Material.WOOD, MaterialColor.LIME).hardnessAndResistance(2.0F).sound(SoundType.WOOD).func_235861_h_()));
        register(e, new LogBase("slime_log_stripped", Block.Properties.create(Material.WOOD, MaterialColor.LIME).hardnessAndResistance(2.0F).sound(SoundType.WOOD).func_235861_h_()));
        register(e, new LeavesBase("slime_leaves", Block.Properties.create(Material.LEAVES, MaterialColor.LIME).func_235861_h_().hardnessAndResistance(1, 1).sound(SoundType.PLANT)));
        register(e, new SaplingBase("slime_sapling", new BirchTree()));
        register(e, new StairsBase("olive_stairs", Blocks.OAK_PLANKS.getDefaultState(), Block.Properties.create(Material.WOOD, MaterialColor.LIME).func_235861_h_().hardnessAndResistance(1, 1).sound(SoundType.WOOD)));
        register(e, new ButtonBase("olive_button"));
        register(e, new SlabBase("olive_slab"));
        register(e, new PressurePlateBase("olive_pressure_plate", PressurePlateBlock.Sensitivity.MOBS));
        register(e, new FenceBase("olive_fence"));
        register(e, new GateBase("olive_fence_gate"));
        register(e, new TrapDoorBase("olive_trap_door"));
        register(e, new DoorBase("olive_door"));
    }

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> e) {
        registerItem(e, slimeOre);
        registerItem(e, olivePlanks);
        registerItem(e, slimeLog);
        registerItem(e, slimeLogStripped);
        registerItem(e, slimeLeaves);
        registerItem(e, slimeSapling);
        registerItem(e, slimeStairs);
        registerItem(e, oliveButton);
        registerItem(e, oliveSlab);
        registerItem(e, olivePressurePlate);
        registerItem(e, oliveFence);
        registerItem(e, oliveFenceGate);
        registerItem(e, oliveTrapDoor);
        registerItem(e, oliveDoor);
    }
    private static void register(RegistryEvent.Register<Block> event, Block block) {
        event.getRegistry().register(block);
    }
    private static void registerItem(RegistryEvent.Register<Item> event, Block block) {
        event.getRegistry().register(new BlockItem(block, new Item.Properties().group(JerrysMod.setup.itemGroup)).setRegistryName(block.getRegistryName()));
    }

}