package nicusha.jerrysmod.data.recipe;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.level.ItemLike;
import nicusha.jerrysmod.JerrysMod;
import nicusha.jerrysmod.data.tag.ItemTagGen;
import nicusha.jerrysmod.registry.BlockRegistry;
import nicusha.jerrysmod.registry.ItemRegistry;

import java.util.HashMap;
import java.util.Map;

public class CraftingGen extends RecipeProvider {
    private final HolderGetter<Item> itemGetter;

    public CraftingGen(RecipeOutput recipeOutput, HolderLookup.Provider holderProvider) {
        super(holderProvider, recipeOutput);
        this.itemGetter = holderProvider.lookupOrThrow(Registries.ITEM);
    }

    @Override
    protected void buildRecipes() {
        smelting(BlockRegistry.slime_ore, ItemRegistry.slime_shard, 0.8F);
        smelting(BlockRegistry.deepslate_slime_ore, ItemRegistry.slime_shard, 0.8F);
        shaped(ItemRegistry.captain_of_light.get(), 1,  new String[]{"  X"," C ", "C  "}, 'X', ItemTagGen.JERRY_GEM, 'C', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")));
        shaped(ItemRegistry.jerry_axe.get(), 1,  new String[]{"XX","XC"," C"}, 'X', ItemTagGen.JERRY_GEM, 'C', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")));
        shaped(ItemRegistry.jerry_hoe.get(), 1,  new String[]{"XX"," C"," C"}, 'X', ItemTagGen.JERRY_GEM, 'C', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")));
        shaped(ItemRegistry.jerry_pickaxe.get(), 1,  new String[]{"XXX"," C "," C "}, 'X', ItemTagGen.JERRY_GEM, 'C', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")));
        shaped(ItemRegistry.jerry_shovel.get(), 1,  new String[]{"X","C","C"}, 'X', ItemTagGen.JERRY_GEM, 'C', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")));
        shaped(ItemRegistry.jerry_sword.get(), 1,  new String[]{"X","X","C"}, 'X', ItemTagGen.JERRY_GEM, 'C', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")));
        shaped(ItemRegistry.jerry_boots.get(), 1,  new String[]{"X X","X X"}, 'X', ItemTagGen.JERRY_GEM);
        shaped(ItemRegistry.jerry_leggings.get(), 1,  new String[]{"XXX","X X","X X"}, 'X', ItemTagGen.JERRY_GEM);
        shaped(ItemRegistry.jerry_chestplate.get(), 1,  new String[]{"X X","XXX","XXX"}, 'X', ItemTagGen.JERRY_GEM);
        shaped(ItemRegistry.jerry_helmet.get(), 1,  new String[]{"XXX","X X"}, 'X', ItemTagGen.JERRY_GEM);
        shaped(ItemRegistry.jerry_gem.get(), 1,  new String[]{"XXX","XYX","XXX"}, 'X', ItemTagGen.SLIME_GEM, 'Y', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/diamond")));
        shaped(ItemRegistry.lighter.get(), 1,  new String[]{" # ","LCL","LLL"}, '#', Items.FLINT_AND_STEEL, 'L', Items.LIME_TERRACOTTA, 'C', Items.COAL);
        shaped(ItemRegistry.slime_axe.get(), 1,  new String[]{"XX","XC"," C"}, 'X', ItemTagGen.SLIME_GEM, 'C', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")));
        shaped(ItemRegistry.slime_hoe.get(), 1,  new String[]{"XX"," C"," C"}, 'X', ItemTagGen.SLIME_GEM, 'C', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")));
        shaped(ItemRegistry.slime_pickaxe.get(), 1,  new String[]{"XXX"," C "," C "}, 'X', ItemTagGen.SLIME_GEM, 'C', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")));
        shaped(ItemRegistry.slime_shovel.get(), 1,  new String[]{"X","C","C"}, 'X', ItemTagGen.SLIME_GEM, 'C', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")));
        shaped(ItemRegistry.slime_sword.get(), 1,  new String[]{"X","X","C"}, 'X', ItemTagGen.SLIME_GEM, 'C', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")));
        shaped(ItemRegistry.slime_boots.get(), 1,  new String[]{"X X","X X"}, 'X', ItemTagGen.SLIME_GEM);
        shaped(ItemRegistry.slime_leggings.get(), 1,  new String[]{"XXX","X X","X X"}, 'X', ItemTagGen.SLIME_GEM);
        shaped(ItemRegistry.slime_chestplate.get(), 1,  new String[]{"X X","XXX","XXX"}, 'X', ItemTagGen.SLIME_GEM);
        shaped(ItemRegistry.slime_helmet.get(), 1,  new String[]{"XXX","X X"}, 'X', ItemTagGen.SLIME_GEM);
        shaped(ItemRegistry.slime_gem.get(), 1,  new String[]{"XXX","XYX","XXX"}, 'X', ItemRegistry.slime_shard, 'Y', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/diamond")));
        shaped(ItemRegistry.slime_stick.get(), 1,  new String[]{"XY"}, 'X', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")), 'Y', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "slime_balls")));
        shaped(ItemRegistry.slime_stick.get(), 2,  new String[]{" X","X "}, 'X', BlockRegistry.olive_planks);
        shaped(BlockRegistry.olive_button.get(), 1,  new String[]{"X"}, 'X', BlockRegistry.olive_planks);
        shaped(BlockRegistry.olive_door.get(), 3,  new String[]{"XX","XX","XX"}, 'X', BlockRegistry.olive_planks);
        shaped(BlockRegistry.olive_fence.get(), 3,  new String[]{"SXS","SXS"}, 'X', BlockRegistry.olive_planks, 'S', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")));
        shaped(BlockRegistry.olive_fence_gate.get(), 1,  new String[]{"SXS","SXS"}, 'X', BlockRegistry.olive_planks, 'S', ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", "rods")));
        shaped(BlockRegistry.olive_planks.get(), 4,  new String[]{"X"}, 'X', BlockRegistry.olive_log);
        shaped(BlockRegistry.olive_planks.get(), 4,  new String[]{"X"}, 'X', BlockRegistry.stripped_olive_log);
        shaped(BlockRegistry.olive_pressure_plate.get(), 1,  new String[]{"XX"}, 'X', BlockRegistry.olive_planks);
        shaped(BlockRegistry.olive_slab.get(), 6,  new String[]{"XXX"}, 'X', BlockRegistry.olive_planks);
        shaped(BlockRegistry.olive_stairs.get(), 4,  new String[]{"X  ","XX ","XXX"}, 'X', BlockRegistry.olive_planks);
        shaped(BlockRegistry.olive_trap_door.get(), 2,  new String[]{"XXX","XXX"}, 'X', BlockRegistry.olive_planks);
    }

    private final Map<String, Integer> recipeCounters = new HashMap<>();
    protected ResourceKey<Recipe<?>> createRecipeKey(String name) {
        String basePath = name;
        int counter = recipeCounters.getOrDefault(basePath, 0);
        recipeCounters.put(basePath, counter + 1);
        if (counter > 0) {
            name = basePath + "_" + counter;
        }
        return ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(JerrysMod.MODID, name));
    }


    // Shaped Recipe Template
    protected final void shaped(ItemLike result, int count, String[] pattern, Object... keys) {
        ShapedRecipeBuilder builder = ShapedRecipeBuilder.shaped(itemGetter, RecipeCategory.MISC, result, count);
        for (String line : pattern) {
            builder.pattern(line);
        }
        for (int i = 0; i < keys.length; i += 2) {
            Object key = keys[i];
            Object value = keys[i + 1];
            if (value instanceof ItemLike) {
                builder.define((Character) key, (ItemLike) value);
            } else if (value instanceof TagKey) {
                builder.define((Character) key, (TagKey<Item>) value);
            } else if (value instanceof Ingredient) {
                builder.define((Character) key, (Ingredient) value);
            } else {
                throw new IllegalArgumentException("Invalid ingredient type: " + value.getClass().getSimpleName());
            }
        }
        Object firstIngredient = keys[1];
        if (firstIngredient instanceof ItemLike) {
            builder.unlockedBy("has_item", has((ItemLike) firstIngredient));
        } else if (firstIngredient instanceof TagKey) {
            builder.unlockedBy("has_item", has((TagKey<Item>) firstIngredient));
        } else if (firstIngredient instanceof Ingredient) {
            builder.unlockedBy("has_item", has(((Ingredient) firstIngredient).items().findFirst().get().value()));
        }
        builder.save(this.output, createRecipeKey("shaped/" + BuiltInRegistries.ITEM.getKey(result.asItem()).getPath()));
    }


    // Shapeless Recipe Template
    protected final void shapeless(ItemLike result, int count, Object... ingredients) {
        ShapelessRecipeBuilder builder = ShapelessRecipeBuilder.shapeless(itemGetter, RecipeCategory.MISC, result, count);
        for (Object ingredient : ingredients) {
            if (ingredient instanceof ItemLike) {
                builder.requires((ItemLike) ingredient);
            } else if (ingredient instanceof TagKey) {
                builder.requires((TagKey<Item>) ingredient);
            } else {
                throw new IllegalArgumentException("Ingredient must be either ItemLike or TagKey<Item>");
            }
        }
        if (ingredients[0] instanceof ItemLike) {
            builder.unlockedBy("has_item", has((ItemLike) ingredients[0]));
        } else if (ingredients[0] instanceof TagKey) {
            builder.unlockedBy("has_item", has(((TagKey<Item>) ingredients[0])));
        }
        builder.save(this.output, createRecipeKey("shapeless/" + BuiltInRegistries.ITEM.getKey(result.asItem()).getPath()));
    }

    protected final void shapeless(ItemLike result, String group, int count, Object... ingredients) {
        ShapelessRecipeBuilder builder = ShapelessRecipeBuilder.shapeless(itemGetter, RecipeCategory.MISC, result, count);
        for (Object ingredient : ingredients) {
            if (ingredient instanceof ItemLike) {
                builder.requires((ItemLike) ingredient);
            } else if (ingredient instanceof TagKey) {
                builder.requires((TagKey<Item>) ingredient);
            } else {
                throw new IllegalArgumentException("Ingredient must be either ItemLike or TagKey<Item>");
            }
        }
        builder.group(group);
        if (ingredients[0] instanceof ItemLike) {
            builder.unlockedBy("has_item", has((ItemLike) ingredients[0]));
        } else if (ingredients[0] instanceof TagKey) {
            builder.unlockedBy("has_item", has(((TagKey<Item>) ingredients[0])));
        }
        builder.save(this.output, createRecipeKey("shapeless/" + BuiltInRegistries.ITEM.getKey(result.asItem()).getPath()));
    }

    // Smelting Recipe Template
    protected final void smelting(ItemLike input, ItemLike result, float experience) {
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(input), RecipeCategory.MISC, result, experience, 200).unlockedBy("has_item", has(input)).save(this.output, createRecipeKey("smelting/" + BuiltInRegistries.ITEM.getKey(result.asItem()).getPath()));
    }


}