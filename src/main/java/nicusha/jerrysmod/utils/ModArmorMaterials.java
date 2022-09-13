package nicusha.jerrysmod.utils;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;
import nicusha.jerrysmod.JerrysMod;

public class ModArmorMaterials implements ArmorMaterial {

    private final String name;
    private final int durability;
    private final float toughness;
    private final int[] damageReduction;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final Ingredient repairMaterial;


    public ModArmorMaterials(String name, int durability, int[] damageReduction, int enchantability, SoundEvent soundEvent, float toughness, Ingredient repairMaterial) {
        this.name = name;
        this.durability = durability;
        this.toughness = toughness;
        this.damageReduction = damageReduction;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getDurabilityForSlot(EquipmentSlot slot) {
        return durability;
    }

    @Override
    public int getDefenseForSlot(EquipmentSlot slot) {
        return damageReduction[slot.getIndex()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantability;
    }

    @Override
    public SoundEvent getEquipSound() {
        return soundEvent;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairMaterial;
    }

    @Override
    public String getName() {
        return JerrysMod.MODID + ":" + name;
    }

    @Override
    public float getToughness() {
        return toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
