package nicusha.jerrysmod.registry;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import static nicusha.jerrysmod.JerrysMod.MODID;

public class TagRegistry {

    public static TagKey<Item> slimeRepair() {
        return ItemTags.create(Identifier.fromNamespaceAndPath(MODID, "slime_repair"));
    }

    public static TagKey<Item> jerryRepair() {
        return ItemTags.create(Identifier.fromNamespaceAndPath(MODID, "jerry_repair"));
    }
}