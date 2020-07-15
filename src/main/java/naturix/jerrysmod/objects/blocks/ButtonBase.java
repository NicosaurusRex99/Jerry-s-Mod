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
import net.minecraftforge.common.ToolType;

public class ButtonBase extends AbstractButtonBlock {
    SoundEvent sound1, sound2;
    public ButtonBase(String name){
        super(true, Block.Properties
                .create(Material.ROCK)
                .hardnessAndResistance(1.0f, 1.0f)
                .harvestTool(ToolType.AXE)
                .func_235861_h_()
        );
        setRegistryName(JerrysMod.MODID, name);
        this.sound1=SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_ON;
        this.sound2=SoundEvents.BLOCK_WOODEN_BUTTON_CLICK_OFF;
    }
    protected SoundEvent getSoundEvent(boolean p_196369_1_) {
        return p_196369_1_ ? sound1 : sound2;
    }
}
