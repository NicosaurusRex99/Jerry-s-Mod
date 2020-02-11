package naturix.jerrysmod.registry;

import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.objects.blocks.*;
import naturix.jerrysmod.world.SlimeTree;
import net.minecraft.block.Block;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.LogBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static BlockBase slime_ore = new BlockBase("slime_ore", 2, ToolType.PICKAXE);
    public static BlockBase olive_planks = new BlockBase("olive_planks", 1, ToolType.AXE);
    public static Block slime_log = new LogBase(MaterialColor.EMERALD, Block.Properties.create(Material.WOOD, MaterialColor.LIME).hardnessAndResistance(2.0F).sound(SoundType.WOOD), "slime_log");
    public static Block slime_log_stripped = new LogBase(MaterialColor.EMERALD, Block.Properties.create(Material.WOOD, MaterialColor.LIME).hardnessAndResistance(2.0F).sound(SoundType.WOOD), "slime_log_stripped");
    public static Block slime_leaves = new LeavesBase(Block.Properties.create(Material.LEAVES, MaterialColor.LIME).hardnessAndResistance(1, 1).sound(SoundType.PLANT), "slime_leaves");
    public static Block slime_sapling = new SaplingBase("slime_sapling", new SlimeTree());
    public static Block olive_stairs = new StairsBase("olive_stairs", olive_planks.getDefaultState(), Block.Properties.from(ModBlocks.olive_planks));
    public static Block olive_button = new ButtonBase("olive_button", Block.Properties.create(Material.WOOD, MaterialColor.LIME).hardnessAndResistance(1,1).sound(SoundType.WOOD), true, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON, SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF);
}