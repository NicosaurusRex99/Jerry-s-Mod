package naturix.jerrysmod.objects.blocks;

import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.registry.ModBlocks;
import naturix.jerrysmod.registry.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LogBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.World;

public class LogBase extends LogBlock {

    Item.Properties properties;
    public LogBase(MaterialColor color, Block.Properties props, String name){
        super(color, props);
        setRegistryName(name);
        ModBlocks.BLOCKS.add(this);
        BlockItem itemBlock = new BlockItem(this, new Item.Properties().group(JerrysMod.setup.itemGroup));
        itemBlock.setRegistryName(name);
        ModItems.ITEMS.add(itemBlock);
    }

    @Override
    public ActionResultType func_225533_a_(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult rayTrace) {

        if (!world.isRemote())
        {
            ItemStack itemStack = player.getHeldItem(hand);
            if (itemStack.getItem() instanceof AxeItem)
            {
                BlockState sourceState = world.getBlockState(pos);
                world.setBlockState(pos, ModBlocks.slime_log_stripped.getDefaultState(), 3);
                itemStack.damageItem(1, player, (p_220040_1_) -> p_220040_1_.sendBreakAnimation(hand));
                return ActionResultType.PASS;
            }
        }
        return ActionResultType.FAIL;
    }
}
