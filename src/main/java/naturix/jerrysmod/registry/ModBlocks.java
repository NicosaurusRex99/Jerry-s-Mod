package naturix.jerrysmod.registry;

import naturix.jerrysmod.objects.blocks.BlockBase;
import naturix.jerrysmod.objects.blocks.LeavesBase;
import naturix.jerrysmod.objects.blocks.LogBase;
import naturix.jerrysmod.objects.blocks.SaplingBase;
import naturix.jerrysmod.world.OliveTree;
import net.minecraft.block.Block;
import net.minecraftforge.common.ToolType;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static BlockBase slime_ore = new BlockBase("slime_ore", 2, ToolType.PICKAXE);
    public static BlockBase olive_planks = new BlockBase("olive_planks", 1, ToolType.AXE);
    public static LogBase slime_log = new LogBase("slime_log");
    public static LeavesBase slime_leaves = new LeavesBase("slime_leaves");
    public static SaplingBase slime_sapling = new SaplingBase("slime_sapling", new OliveTree());

}