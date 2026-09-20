package nicusha.jerrysmod.registry;

import net.minecraft.resources.Identifier;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

import static nicusha.jerrysmod.JerrysMod.MODID;

public class TagRegistry {
    public static TagKey<Item> JERRY_GEM = ItemTags.create(Identifier.fromNamespaceAndPath(MODID, "jerry_gem"));
    public static TagKey<Item> SLIME_GEM = ItemTags.create(Identifier.fromNamespaceAndPath(MODID, "slime_gem"));



    public static TagKey<Item> slimeRepair() {
        return SLIME_GEM;
    }

    public static TagKey<Item> jerryRepair() {
        return JERRY_GEM;
    }
}