package nicusha.jerrysmod.utils;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.ForgeRegistries;

import static nicusha.jerrysmod.JerrysMod.MODID;

public enum ModToolTier implements Tier {

    slime_sword(1, 5500, 3.0F, 10.0F, 8, ForgeRegistries.ITEMS.getValue(new ResourceLocation(MODID, "slime_gem"))),
    slime_shovel(1, 5000, 2.5F, 4.0F, 8, ForgeRegistries.ITEMS.getValue(new ResourceLocation(MODID, "slime_gem"))),
    slime_pickaxe(5, 9500, 3.1F, 4.1F, 12, ForgeRegistries.ITEMS.getValue(new ResourceLocation(MODID, "slime_gem"))),
    slime_hoe(1, 3500, 3.6F, 3.1F, 3, ForgeRegistries.ITEMS.getValue(new ResourceLocation(MODID, "slime_gem"))),
    slime_axe(1, 5300, 1.9F, 11.0F, 15, ForgeRegistries.ITEMS.getValue(new ResourceLocation(MODID, "slime_gem"))),
    jerry_sword(2, 499950, 1024.0F, 912.0F, 8, ForgeRegistries.ITEMS.getValue(new ResourceLocation(MODID, "jerry_gem"))),
    jerry_shovel(2, 405809, 856.0F, 13.0F, 8, ForgeRegistries.ITEMS.getValue(new ResourceLocation(MODID, "jerry_gem"))),
    jerry_pickaxe(6, 409938, 1050.0F, 10.0F, 12, ForgeRegistries.ITEMS.getValue(new ResourceLocation(MODID, "jerry_gem"))),
    jerry_hoe(2, 498029, 1100.0F, 8.0F, 3, ForgeRegistries.ITEMS.getValue(new ResourceLocation(MODID, "jerry_gem"))),
    jerry_axe(2, 408750, 950.0F, 15.0F, 15, ForgeRegistries.ITEMS.getValue(new ResourceLocation(MODID, "jerry_gem")));

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private Item repairMaterial;

    private ModToolTier(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn,
                    Item repairMaterialIn)
    {
        this.harvestLevel = harvestLevelIn;
        this.maxUses = maxUsesIn;
        this.efficiency = efficiencyIn;
        this.attackDamage = attackDamageIn;
        this.enchantability = enchantabilityIn;
        this.repairMaterial = repairMaterialIn;
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
    public int getLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantmentValue() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.of(repairMaterial);
    }
}
