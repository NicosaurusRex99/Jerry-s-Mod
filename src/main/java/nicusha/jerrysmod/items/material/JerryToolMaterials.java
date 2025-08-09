package nicusha.jerrysmod.items.material;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.component.DataComponents;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.component.Tool;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.core.registries.BuiltInRegistries;
import nicusha.jerrysmod.registry.TagRegistry;

import java.util.List;


import java.util.function.Supplier;

public enum JerryToolMaterials implements Tier {

    SLIME(4096, 1.0F, -1.0F, 42, ()-> Ingredient.of(TagRegistry.slimeRepair()), BlockTags.INCORRECT_FOR_IRON_TOOL),
    JERRY(6142, 3.0F, -1.0F, 50, ()-> Ingredient.of(TagRegistry.jerryRepair()), BlockTags.INCORRECT_FOR_NETHERITE_TOOL);

    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;
    private final TagKey<Block> incorrectBlocksForDrops;

    JerryToolMaterials(int maxUses, float attackDamage, float efficiency, int enchantability,
                      Supplier<Ingredient> repairMaterial, TagKey<Block> incorrectBlocksForDrops) {
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
        this.incorrectBlocksForDrops = incorrectBlocksForDrops;
    }

    @Override
    public int getUses() {
        return maxUses;
    }

    @Override
    public float getSpeed() {
        return efficiency;
    }

    @Override
    public float getAttackDamageBonus() {
        return attackDamage;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairMaterial.get();
    }

    public TagKey<Block> getIncorrectBlocksForDrops() {
        return incorrectBlocksForDrops;
    }
}