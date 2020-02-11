package naturix.jerrysmod.objects.blocks;

import naturix.jerrysmod.JerrysMod;
import naturix.jerrysmod.registry.ModBlocks;
import naturix.jerrysmod.registry.ModItems;
import net.minecraft.block.AbstractButtonBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public class ButtonBase extends AbstractButtonBlock {
    SoundEvent sound1, sound2;
    public ButtonBase(String name, Block.Properties props, boolean isWood, SoundEvent sound1, SoundEvent sound2){
        super(isWood, props);
        setRegistryName(name);
        ModBlocks.BLOCKS.add(this);
        BlockItem itemBlock = new BlockItem(this, new Item.Properties().group(JerrysMod.setup.itemGroup));
        itemBlock.setRegistryName(name);
        ModItems.ITEMS.add(itemBlock);
        this.sound1=sound1;
        this.sound2=sound2;
    }
    protected SoundEvent getSoundEvent(boolean p_196369_1_) {
        return p_196369_1_ ? sound1 : sound2;
    }
}
