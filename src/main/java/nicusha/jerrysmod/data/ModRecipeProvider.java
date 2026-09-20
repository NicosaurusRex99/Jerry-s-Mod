package nicusha.jerrysmod.data;

import net.minecraft.advancements.Advancement;
import net.minecraft.data.recipes.*;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.CookingBookCategory;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.ItemLike;
import nicusha.jerrysmod.registry.BlockRegistry;
import nicusha.jerrysmod.registry.ItemRegistry;
import nicusha.jerrysmod.registry.TagRegistry;

import static nicusha.jerrysmod.JerrysMod.MODID;

public class ModRecipeProvider extends RecipeProvider {

    public ModRecipeProvider(BootstrapContext<Recipe<?>> recipeOutput, BootstrapContext<Advancement> advancementOutput) {
        super(recipeOutput, advancementOutput);
    }

    @Override
    protected void buildRecipes() {
        smelting(BlockRegistry.slime_ore, ItemRegistry.slime_shard, 0.8F);
        smelting(BlockRegistry.deepslate_slime_ore, ItemRegistry.slime_shard, 0.8F);

        shaped(ItemRegistry.captain_of_light.get(), 1, new String[]{"  X", " C ", "C  "}, 'X', TagRegistry.JERRY_GEM, 'C', ItemTags.create(Identifier.fromNamespaceAndPath("c", "rods")));
        shaped(ItemRegistry.jerry_axe.get(), 1, new String[]{"XX", "XC", " C"}, 'X', TagRegistry.JERRY_GEM, 'C', ItemTags.create(Identifier.fromNamespaceAndPath("c", "rods")));
        shaped(ItemRegistry.jerry_hoe.get(), 1, new String[]{"XX", " C", " C"}, 'X', TagRegistry.JERRY_GEM, 'C', ItemTags.create(Identifier.fromNamespaceAndPath("c", "rods")));
        shaped(ItemRegistry.jerry_pickaxe.get(), 1, new String[]{"XXX", " C ", " C "}, 'X', TagRegistry.JERRY_GEM, 'C', ItemTags.create(Identifier.fromNamespaceAndPath("c", "rods")));
        shaped(ItemRegistry.jerry_shovel.get(), 1, new String[]{"X", "C", "C"}, 'X', TagRegistry.JERRY_GEM, 'C', ItemTags.create(Identifier.fromNamespaceAndPath("c", "rods")));
        shaped(ItemRegistry.jerry_sword.get(), 1, new String[]{"X", "X", "C"}, 'X', TagRegistry.JERRY_GEM, 'C', ItemTags.create(Identifier.fromNamespaceAndPath("c", "rods")));
        shaped(ItemRegistry.jerry_boots.get(), 1, new String[]{"X X", "X X"}, 'X', TagRegistry.JERRY_GEM);
        shaped(ItemRegistry.jerry_leggings.get(), 1, new String[]{"XXX", "X X", "X X"}, 'X', TagRegistry.JERRY_GEM);
        shaped(ItemRegistry.jerry_chestplate.get(), 1, new String[]{"X X", "XXX", "XXX"}, 'X', TagRegistry.JERRY_GEM);
        shaped(ItemRegistry.jerry_helmet.get(), 1, new String[]{"XXX", "X X"}, 'X', TagRegistry.JERRY_GEM);

        shaped(ItemRegistry.jerry_gem.get(), 1, new String[]{"XXX", "XYX", "XXX"}, 'X', TagRegistry.SLIME_GEM, 'Y', ItemTags.create(Identifier.fromNamespaceAndPath("c", "storage_blocks/diamond")));

        shaped(ItemRegistry.slime_axe.get(), 1, new String[]{"XX", "XC", " C"}, 'X', TagRegistry.SLIME_GEM, 'C', ItemTags.create(Identifier.fromNamespaceAndPath("c", "rods")));
        shaped(ItemRegistry.slime_hoe.get(), 1, new String[]{"XX", " C", " C"}, 'X', TagRegistry.SLIME_GEM, 'C', ItemTags.create(Identifier.fromNamespaceAndPath("c", "rods")));
        shaped(ItemRegistry.slime_pickaxe.get(), 1, new String[]{"XXX", " C ", " C "}, 'X', TagRegistry.SLIME_GEM, 'C', ItemTags.create(Identifier.fromNamespaceAndPath("c", "rods")));
        shaped(ItemRegistry.slime_shovel.get(), 1, new String[]{"X", "C", "C"}, 'X', TagRegistry.SLIME_GEM, 'C', ItemTags.create(Identifier.fromNamespaceAndPath("c", "rods")));
        shaped(ItemRegistry.slime_sword.get(), 1, new String[]{"X", "X", "C"}, 'X', TagRegistry.SLIME_GEM, 'C', ItemTags.create(Identifier.fromNamespaceAndPath("c", "rods")));
        shaped(ItemRegistry.slime_boots.get(), 1, new String[]{"X X", "X X"}, 'X', TagRegistry.SLIME_GEM);
        shaped(ItemRegistry.slime_leggings.get(), 1, new String[]{"XXX", "X X", "X X"}, 'X', TagRegistry.SLIME_GEM);
        shaped(ItemRegistry.slime_chestplate.get(), 1, new String[]{"X X", "XXX", "XXX"}, 'X', TagRegistry.SLIME_GEM);
        shaped(ItemRegistry.slime_helmet.get(), 1, new String[]{"XXX", "X X"}, 'X', TagRegistry.SLIME_GEM);

        shaped(ItemRegistry.slime_gem.get(), 1, "from_slime_shard", new String[]{"XXX", "XYX", "XXX"}, 'X', ItemRegistry.slime_shard, 'Y', ItemTags.create(Identifier.fromNamespaceAndPath("c", "gems/diamond")));
    }

    private void smelting(ItemLike input, ItemLike result, float experience) {
        String path = getItemName(result) + "_from_smelting_" + getItemName(input);
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(input), RecipeCategory.MISC, CookingBookCategory.MISC, result, experience, 200).unlockedBy(getHasName(input), has(input)).save(output, String.valueOf(Identifier.fromNamespaceAndPath(MODID, path)));
    }

    private void shaped(ItemLike result, int count, String[] pattern, Object... keys) {
        shaped(result, count, "", pattern, keys);
    }

    private void shaped(ItemLike result, int count, String pathSuffix, String[] pattern, Object... keys) {
        String defaultPath = getItemName(result) + (count > 1 ? "_" + count : "");
        String path = defaultPath + (pathSuffix.isEmpty() ? "" : "_" + pathSuffix);

        ShapedRecipeBuilder builder = ShapedRecipeBuilder.shaped(items, RecipeCategory.MISC, result, count);
        for (String row : pattern) {
            builder.pattern(row);
        }

        ItemLike firstUnlockItem = null;
        for (int i = 0; i < keys.length; i += 2) {
            Character c = (Character) keys[i];
            Object obj = keys[i + 1];
            if (firstUnlockItem == null && obj instanceof ItemLike il) {
                firstUnlockItem = il;
            }

            if (obj instanceof ItemLike il) {
                builder.define(c, il);
            } else if (obj instanceof TagKey<?> tag) {
                @SuppressWarnings("unchecked")
                TagKey<Item> itemTag = (TagKey<Item>) tag;
                builder.define(c, itemTag);
            }
        }

        if (firstUnlockItem != null) {
            builder.unlockedBy(getHasName(firstUnlockItem), has(firstUnlockItem));
        } else {
            builder.unlockedBy("has_item", has(result));
        }

        if (path.equals(defaultPath)) {
            builder.save(output);
        } else {
            builder.save(output, String.valueOf(Identifier.fromNamespaceAndPath(MODID, path)));
        }
    }
}