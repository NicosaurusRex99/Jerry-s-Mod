package naturix.jerrysmod.registry;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyLoadBase;
import java.util.function.Supplier;

public enum ModTier implements IItemTier
{
    SLIMESWORD(1, 600001, 74F, 128F, 8, ()->{ return Ingredient.fromItems(ModItems.slimeGem); }),
    SLIMESHOVEL(1, 600001, 74F, 126.5F, 8, ()->{ return Ingredient.fromItems( ModItems.slimeGem); }),
    SLIMEPICKAXE(5, 600001, 74F, 126F, 12, ()->{ return Ingredient.fromItems( ModItems.slimeGem); }),
    SLIMEHOE(1, 600001, 74F, 126F, 3, ()->{ return Ingredient.fromItems( ModItems.slimeGem); }),
    SLIMEAXE(1, 600001, 74F, 127F, 15, ()->{ return Ingredient.fromItems( ModItems.slimeGem); }),
    JERRYSWORD(2, 13000001, 99, 858F, 8, ()->{ return Ingredient.fromItems(ModItems.jerryGem); }),
    JERRYSHOVEL(2, 13000001, 99, 846.5F, 8, ()->{ return Ingredient.fromItems( ModItems.jerryGem); }),
    JERRYPICKAXE(6, 13000001, 99, 846F, 12, ()->{ return Ingredient.fromItems( ModItems.jerryGem); }),
    JERRYHOE(2, 600001, 99, 846F, 3, ()->{ return Ingredient.fromItems( ModItems.jerryGem); }),
    JERRYAXE(2, 600001, 99, 847F, 15, ()->{ return Ingredient.fromItems( ModItems.jerryGem); });

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyLoadBase<Ingredient> repairMaterial;

    private ModTier(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn,
                    Supplier<Ingredient> repairMaterialIn)
    {
        this.harvestLevel = harvestLevelIn;
        this.maxUses = maxUsesIn;
        this.efficiency = efficiencyIn;
        this.attackDamage = attackDamageIn;
        this.enchantability = enchantabilityIn;
        this.repairMaterial = new LazyLoadBase<>(repairMaterialIn);
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
        return this.repairMaterial.getValue();
    }
}