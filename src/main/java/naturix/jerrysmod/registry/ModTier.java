package naturix.jerrysmod.registry;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

public enum ModTier implements IItemTier
{;
//    SLIMESWORD(1, 600001, 74F, 128F, 8, ModItems.slimeGem),
//    SLIMESHOVEL(1, 600001, 74F, 6.5F, 8, ModItems.slimeGem),
//    SLIMEPICKAXE(5, 600001, 74F, 7F, 12, ModItems.slimeGem),
//    SLIMEHOE(1, 600001, 74F, 2F, 3, ModItems.slimeGem),
//    SLIMEAXE(1, 600001, 74F, 10F, 15, ModItems.slimeGem),
//    JERRYSWORD(2, 13000001, 99, 858F, 8, ModItems.jerryGem),
//    JERRYSHOVEL(2, 13000001, 99, 16.5F, 8, ModItems.jerryGem),
//    JERRYPICKAXE(6, 13000001, 99, 136F, 12, ModItems.jerryGem),
//    JERRYHOE(2, 600001, 99, 6F, 3, ModItems.jerryGem),
//    JERRYAXE(2, 600001, 99, 13F, 15, ModItems.jerryGem);

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private Item repairMaterial;

    private ModTier(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn,
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
    public int getMaxUses() {
        return this.maxUses;
    }

    @Override
    public float getEfficiency() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return Ingredient.fromItems(this.repairMaterial);
    }

}