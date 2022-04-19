package fr._PetitPrince_.ParadisiaMod.item;

import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum paradisia_tiers implements Tier {

    PARADISIUM (4, 2031, 9.0F, 10.0F, 15, () -> {
        return Ingredient.of(paradisia_items.PARADISIUM_INGOT.get());
    }),

    DARK_STEEL (4, 2031, 9.0F, 4.0F, 15, () -> {
        return Ingredient.of(paradisia_items.PARADISIUM_INGOT.get());
    }),

    IMPURE_BEDROCK (4, 15000, 7.0f, 3.0f, 10, () -> {
        return Ingredient.of(paradisia_items.IMPURE_BEDROCK_INGOT.get());
    }),

    DIVINIUM (4, 3031, 13.0F, 12.0F, 15, () -> {
        return Ingredient.of(paradisia_items.DIVINIUM_INGOT.get());
    });

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyLoadedValue<Ingredient> repairMaterial;

    paradisia_tiers(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = new LazyLoadedValue<>(repairMaterial);
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
        return repairMaterial.get();
    }

}
