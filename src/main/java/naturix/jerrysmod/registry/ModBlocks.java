package naturix.jerrysmod.registry;

import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.objects.blocks.BlockBase;
import naturix.jerrysmod.objects.blocks.LeavesBase;
import naturix.jerrysmod.objects.blocks.LogBase;
import naturix.jerrysmod.objects.blocks.SaplingBase;
import naturix.jerrysmod.world.OliveTree;
import net.minecraft.block.Block;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.LogBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<Block>();

    public static BlockBase slime_ore = new BlockBase("slime_ore", 2, ToolType.PICKAXE);
    public static BlockBase olive_planks = new BlockBase("olive_planks", 1, ToolType.AXE);
    public static Block slime_log = registerBlock(new LogBlock(MaterialColor.EMERALD, Block.Properties.create(Material.WOOD, MaterialColor.GREEN_TERRACOTTA).hardnessAndResistance(2.0F).sound(SoundType.WOOD)), "slime_log");
    public static Block slime_leaves = registerBlock(new LeavesBlock(Block.Properties.create(Material.LEAVES, MaterialColor.EMERALD).hardnessAndResistance(0.2F).tickRandomly().sound(SoundType.PLANT)), "slime_leaves");
    public static SaplingBase slime_sapling = new SaplingBase("slime_sapling", new OliveTree());


    public static Block registerBlock(Block block, String name)
    {
        BlockItem itemBlock = new BlockItem(block, new Item.Properties().group(JerrysMod.setup.itemGroup));
        block.setRegistryName(JerrysMod.MODID, name);
        itemBlock.setRegistryName(JerrysMod.MODID, name);
        ForgeRegistries.BLOCKS.register(block);
        ForgeRegistries.ITEMS.register(itemBlock);
        return block;
    }
}