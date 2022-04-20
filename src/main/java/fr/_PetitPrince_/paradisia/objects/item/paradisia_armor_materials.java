package fr._PetitPrince_.paradisia.objects.item;

import fr._PetitPrince_.paradisia.Paradisia;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum paradisia_armor_materials implements ArmorMaterial {

    COSMETICS("cosmetics", 0, new int[]{0, 0, 0, 0}, 0, SoundEvents.ARMOR_EQUIP_GOLD,
            0F, 0F, () -> Ingredient.of(paradisia_items.COSMETICS_GEM.get())),

    PARADISIUM("paradisium", 37, new int[]{7, 9, 11, 7}, 15, SoundEvents.ARMOR_EQUIP_GOLD,
            5.0F, 0.1F, () -> Ingredient.of(paradisia_items.PARADISIUM_INGOT.get())),

    IMPURE_BEDROCK("impure_bedrock", 1000, new int[]{3, 6, 8, 3}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE,
            2.0F, 0F, () -> Ingredient.of(paradisia_items.IMPURE_BEDROCK_INGOT.get())),

    DIVINIUM("divinium", 37, new int[]{9, 11,13, 9}, 15, SoundEvents.ARMOR_EQUIP_NETHERITE,
            6.0F, 0.1F, () -> Ingredient.of(paradisia_items.DIVINIUM_INGOT.get()));

    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    paradisia_armor_materials(String p_40474_, int p_40475_, int[] p_40476_, int p_40477_, SoundEvent p_40478_, float p_40479_, float p_40480_, Supplier<Ingredient> p_40481_) {
        this.name = p_40474_;
        this.durabilityMultiplier = p_40475_;
        this.slotProtections = p_40476_;
        this.enchantmentValue = p_40477_;
        this.sound = p_40478_;
        this.toughness = p_40479_;
        this.knockbackResistance = p_40480_;
        this.repairIngredient = new LazyLoadedValue<>(p_40481_);
    }

    public int getDurabilityForSlot(EquipmentSlot p_40484_) {
        return HEALTH_PER_SLOT[p_40484_.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot p_40487_) {
        return this.slotProtections[p_40487_.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return Paradisia.MODID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
