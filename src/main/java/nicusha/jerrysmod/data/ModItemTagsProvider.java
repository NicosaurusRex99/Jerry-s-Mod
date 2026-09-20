package nicusha.jerrysmod.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.data.ItemTagsProvider;
import nicusha.jerrysmod.JerrysMod;
import nicusha.jerrysmod.registry.ItemRegistry;
import nicusha.jerrysmod.registry.TagRegistry;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {

    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, JerrysMod.MODID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(TagRegistry.JERRY_GEM).add(ItemRegistry.jerry_gem.getKey());
        tag(TagRegistry.SLIME_GEM).add(ItemRegistry.slime_gem.getKey());
        tag(ItemTags.SWORDS).add(ItemRegistry.slime_sword.getKey(), ItemRegistry.jerry_sword.getKey());
        tag(ItemTags.PICKAXES).add(ItemRegistry.slime_pickaxe.getKey(), ItemRegistry.jerry_pickaxe.getKey());
        tag(ItemTags.AXES).add(ItemRegistry.slime_axe.getKey(), ItemRegistry.jerry_axe.getKey());
        tag(ItemTags.SHOVELS).add(ItemRegistry.slime_shovel.getKey(), ItemRegistry.jerry_shovel.getKey());
        tag(ItemTags.HOES).add(ItemRegistry.slime_hoe.getKey(), ItemRegistry.jerry_hoe.getKey());
        tag(ItemTags.BEACON_PAYMENT_ITEMS).addTags(TagRegistry.JERRY_GEM, TagRegistry.SLIME_GEM);
        tag(ItemTags.HEAD_ARMOR).add(ItemRegistry.slime_helmet.getKey(), ItemRegistry.jerry_helmet.getKey());
        tag(ItemTags.HEAD_ARMOR_ENCHANTABLE).add(ItemRegistry.slime_helmet.getKey(), ItemRegistry.jerry_helmet.getKey());
        tag(ItemTags.CHEST_ARMOR).add(ItemRegistry.slime_chestplate.getKey(), ItemRegistry.jerry_chestplate.getKey());
        tag(ItemTags.CHEST_ARMOR_ENCHANTABLE).add(ItemRegistry.slime_chestplate.getKey(), ItemRegistry.jerry_chestplate.getKey());
        tag(ItemTags.LEG_ARMOR).add(ItemRegistry.slime_leggings.getKey(), ItemRegistry.jerry_leggings.getKey());
        tag(ItemTags.LEG_ARMOR_ENCHANTABLE).add(ItemRegistry.slime_leggings.getKey(), ItemRegistry.jerry_leggings.getKey());
        tag(ItemTags.FOOT_ARMOR).add(ItemRegistry.slime_boots.getKey(), ItemRegistry.jerry_boots.getKey());
        tag(ItemTags.FOOT_ARMOR_ENCHANTABLE).add(ItemRegistry.slime_boots.getKey(), ItemRegistry.jerry_boots.getKey());
        tag(ItemTags.MINING_ENCHANTABLE).add(ItemRegistry.slime_pickaxe.getKey(), ItemRegistry.jerry_pickaxe.getKey());
        tag(ItemTags.MELEE_WEAPON_ENCHANTABLE).add(ItemRegistry.slime_pickaxe.getKey(), ItemRegistry.jerry_pickaxe.getKey());
        tag(ItemTags.TRIMMABLE_ARMOR).add(ItemRegistry.slime_helmet.getKey(), ItemRegistry.jerry_helmet.getKey(), ItemRegistry.slime_chestplate.getKey(), ItemRegistry.jerry_chestplate.getKey(), ItemRegistry.slime_leggings.getKey(), ItemRegistry.jerry_leggings.getKey(), ItemRegistry.slime_boots.getKey(), ItemRegistry.jerry_boots.getKey());
    }

    private TagKey<Item> commonTag(String name){
        return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("c", name));
    }
    private TagKey<Item> minecraftTag(String name){
        return TagKey.create(Registries.ITEM, Identifier.withDefaultNamespace(name));
    }
    private TagKey<Item> customTag(String name){
        return TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(JerrysMod.MODID, name));
    }
}
