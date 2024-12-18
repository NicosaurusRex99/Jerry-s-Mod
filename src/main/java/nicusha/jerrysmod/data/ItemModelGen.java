package nicusha.jerrysmod.data;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.ButtonBlock;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.TrapDoorBlock;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import nicusha.jerrysmod.registry.BlockRegistry;
import nicusha.jerrysmod.registry.ItemRegistry;

import static nicusha.jerrysmod.JerrysMod.MODID;

public class ItemModelGen extends net.neoforged.neoforge.client.model.generators.ItemModelProvider {
    public ItemModelGen(PackOutput packOutput, ExistingFileHelper existingFileHelper) {
        super(packOutput, MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        fenceInventory("olive_fence", ResourceLocation.fromNamespaceAndPath(MODID, "block/olive_planks"));
        custom("olive_door", "item/generated", "olive_door");
        customParent("olive_trap_door", "block/olive_trap_door_bottom");
        buttonInventory("olive_button", ResourceLocation.fromNamespaceAndPath(MODID, "block/olive_planks"));
        for (var regObj : ItemRegistry.ITEMS.getEntries()) {
            if(!(regObj.get() instanceof BlockItem)) {
                if (regObj.get() instanceof SwordItem || regObj.get() instanceof ShovelItem || regObj.get() instanceof HoeItem || regObj.get() instanceof AxeItem || regObj.get() instanceof PickaxeItem) {
                    handheld(regObj.getId());
                } else {
                    generated(regObj.getId());
                }
            }
        }

        for(var regObj : BlockRegistry.BLOCKS.getEntries()) {
            if (!(regObj.get() instanceof FenceBlock || regObj.get() instanceof TrapDoorBlock || regObj.get() instanceof DoorBlock || regObj.get() instanceof ButtonBlock || regObj.get().equals(BlockRegistry.dregs_portal.get()))) {
                customBlockParent(regObj.getId().getPath(), "block/" + regObj.getId().getPath());
            }
        }
    }

    private ItemModelBuilder generated(ResourceLocation itemId) {
        return withExistingParent("item/" + itemId.getPath(), ResourceLocation.parse("item/generated"))
                .texture("layer0", ResourceLocation.fromNamespaceAndPath(MODID, "item/" + itemId.getPath()));
    }

    private ItemModelBuilder handheld(ResourceLocation itemId) {
        return withExistingParent("item/" + itemId.getPath(), ResourceLocation.parse("item/handheld"))
                .texture("layer0", ResourceLocation.fromNamespaceAndPath(MODID, "item/" + itemId.getPath()));
    }

    private ItemModelBuilder custom(String item, String parentModel, String texture) {
        return withExistingParent("item/" + item, ResourceLocation.parse(parentModel))
                .texture("layer0", ResourceLocation.fromNamespaceAndPath(MODID, "item/" + texture));
    }

    private ItemModelBuilder customParent(String item, String parentModel) {
        return withExistingParent("item/" + item, ResourceLocation.fromNamespaceAndPath(MODID, parentModel));
    }
    private ItemModelBuilder customBlockParent(String item, String parentModel) {
        return withExistingParent("item/" + item, ResourceLocation.fromNamespaceAndPath(MODID, parentModel));
    }

}
