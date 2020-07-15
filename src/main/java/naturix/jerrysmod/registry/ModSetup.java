package naturix.jerrysmod.registry;

import naturix.jerrysmod.JerrysMod;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModSetup {

    public ItemGroup itemGroup = new ItemGroup(JerrysMod.MODID) {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(
//                    ModItems.slimeShard
                    Blocks.DIAMOND_BLOCK
            );
        }
    };

    public void init() {

    }
}