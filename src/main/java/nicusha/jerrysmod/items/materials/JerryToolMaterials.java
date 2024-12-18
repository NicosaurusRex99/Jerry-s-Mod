package nicusha.jerrysmod.items.materials;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.*;
import net.minecraft.tags.*;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.component.Tool;
import net.minecraft.world.level.block.Block;

import java.util.List;

import static nicusha.jerrysmod.JerrysMod.MODID;

public record JerryToolMaterials(TagKey<Block> incorrectBlocksForDrops, int durability, float speed, float attackDamageBonus, int enchantmentValue, Item repairItem) {

    public static final ToolMaterial SLIME_SWORD;
    public static final ToolMaterial SLIME_SHOVEL;
    public static final ToolMaterial SLIME_PICKAXE;
    public static final ToolMaterial SLIME_HOE;
    public static final ToolMaterial SLIME_AXE;
    public static final ToolMaterial JERRY_SWORD;
    public static final ToolMaterial JERRY_SHOVEL;
    public static final ToolMaterial JERRY_PICKAXE;
    public static final ToolMaterial JERRY_HOE;
    public static final ToolMaterial JERRY_AXE;

    public JerryToolMaterials(TagKey<Block> incorrectBlocksForDrops, int durability, float speed, float attackDamageBonus, int enchantmentValue, Item repairItem) {
        this.incorrectBlocksForDrops = incorrectBlocksForDrops;
        this.durability = durability;
        this.speed = speed;
        this.attackDamageBonus = attackDamageBonus;
        this.enchantmentValue = enchantmentValue;
        this.repairItem = repairItem;
    }

    private Item.Properties applyCommonProperties(Item.Properties properties) {
        return properties.durability(this.durability).repairable(TagKey.create(BuiltInRegistries.ITEM.key(), BuiltInRegistries.ITEM.getKey(repairItem))).enchantable(this.enchantmentValue);
    }

    public Item.Properties applyToolProperties(Item.Properties properties, TagKey<Block> mineableBlocks, float attackDamage, float attackSpeed) {
        HolderGetter<Block> holdergetter = BuiltInRegistries.acquireBootstrapRegistrationLookup(BuiltInRegistries.BLOCK);
        return this.applyCommonProperties(properties).component(DataComponents.TOOL, new Tool(List.of(Tool.Rule.deniesDrops(holdergetter.getOrThrow(this.incorrectBlocksForDrops)), Tool.Rule.minesAndDrops(holdergetter.getOrThrow(mineableBlocks), this.speed)), 1.0F, 1)).attributes(this.createToolAttributes(attackDamage, attackSpeed));
    }

    private ItemAttributeModifiers createToolAttributes(float attackDamage, float attackSpeed) {
        return ItemAttributeModifiers.builder()
                .add(Attributes.ATTACK_DAMAGE, new AttributeModifier(Item.BASE_ATTACK_DAMAGE_ID, (double)(attackDamage + this.attackDamageBonus), AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
                .add(Attributes.ATTACK_SPEED, new AttributeModifier(Item.BASE_ATTACK_SPEED_ID, (double)attackSpeed, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
                .build();
    }

    static {
        SLIME_SWORD = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 5500, 3.0F, 10.0F, 8, ItemTags.create(ResourceLocation.fromNamespaceAndPath(MODID, "slime_repair")));
        SLIME_SHOVEL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 5000, 2.5F, 4.0F, 8, ItemTags.create(ResourceLocation.fromNamespaceAndPath(MODID, "slime_repair")));
        SLIME_PICKAXE = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 9500, 3.1F, 4.1F, 12, ItemTags.create(ResourceLocation.fromNamespaceAndPath(MODID, "slime_repair")));
        SLIME_HOE = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 3500, 3.6F, 3.1F, 3, ItemTags.create(ResourceLocation.fromNamespaceAndPath(MODID, "slime_repair")));
        SLIME_AXE = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 5300, 1.9F, 11.0F, 15, ItemTags.create(ResourceLocation.fromNamespaceAndPath(MODID, "slime_repair")));

        JERRY_SWORD = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 499950, 1024.0F, 912.0F, 8, ItemTags.create(ResourceLocation.fromNamespaceAndPath(MODID, "jerry_repair")));
        JERRY_SHOVEL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 405809, 856.0F, 13.0F, 8, ItemTags.create(ResourceLocation.fromNamespaceAndPath(MODID, "jerry_repair")));
        JERRY_PICKAXE = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 409938, 1050.0F, 10.0F, 12, ItemTags.create(ResourceLocation.fromNamespaceAndPath(MODID, "jerry_repair")));
        JERRY_HOE = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 498029, 1100.0F, 8.0F, 3, ItemTags.create(ResourceLocation.fromNamespaceAndPath(MODID, "jerry_repair")));
        JERRY_AXE = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 408750, 950.0F, 15.0F, 15, ItemTags.create(ResourceLocation.fromNamespaceAndPath(MODID, "jerry_repair")));
    }
}
