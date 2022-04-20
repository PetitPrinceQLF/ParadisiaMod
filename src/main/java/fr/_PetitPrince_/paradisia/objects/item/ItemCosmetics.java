package fr._PetitPrince_.paradisia.objects.item;

import fr._PetitPrince_.paradisia.Paradisia;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemCosmetics extends ArmorItem {
    private final String name;
    public ItemCosmetics(String name, EquipmentSlot slot) {
        super(new ArmorMaterial() {
            @Override
            public int getDurabilityForSlot(EquipmentSlot slot) {
                return new int[]{10, 10, 10, 10}[slot.getIndex()]; // check si c pas -1 pour désactiver
            }

            @Override
            public int getDefenseForSlot(EquipmentSlot slot) {
                return new int[]{0, 0, 0, 0}[slot.getIndex()];
            }

            @Override
            public int getEnchantmentValue() {
                return 0; // check si c pas -1 pour désactiver
            }

            @Override
            public SoundEvent getEquipSound() {
                return SoundEvents.ARMOR_EQUIP_ELYTRA;
            }

            @Override
            public Ingredient getRepairIngredient() {
                return Ingredient.EMPTY;
            }

            @Override
            public String getName() {
                return this.name;
            }

            @Override
            public float getToughness() {
                return 0f;
            }

            @Override
            public float getKnockbackResistance() {
                return 0f;
            }
        }, slot, new Item.Properties().tab(CreativeModeTab.TAB_MISC));

        this.name = name;
    }

    /*@Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        if (player.getItemBySlot(EquipmentSlot.HEAD).isEmpty()) {
            player.setItemSlot(EquipmentSlot.HEAD, itemstack.copy());
            itemstack.setCount(0);
            return InteractionResultHolder.success(itemstack);
        }
        else
        {
            return InteractionResultHolder.fail(itemstack);
        }
    }*/

    /*@Override
    @OnlyIn(Dist.CLIENT)
    public void initializeClient(java.util.function.Consumer<net.minecraftforge.client.IItemRenderProperties> consumer) {
        consumer.accept(new IItemRenderProperties() {
            @Override
            public HumanoidModel getArmorModel(LivingEntity living, ItemStack stack, EquipmentSlot slot, HumanoidModel defaultModel) {
                HumanoidModel armorModel = new HumanoidModel(new ModelPart(Collections.emptyList(),
                        Map.of("head", new ModelCap(Minecraft.getInstance().getEntityModels().bakeLayer(ModelCap.LAYER_LOCATION)).bb_main,
                                "hat", new ModelPart(Collections.emptyList(), Collections.emptyMap()), "body",
                                new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_arm",
                                new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_arm",
                                new ModelPart(Collections.emptyList(), Collections.emptyMap()), "right_leg",
                                new ModelPart(Collections.emptyList(), Collections.emptyMap()), "left_leg",
                                new ModelPart(Collections.emptyList(), Collections.emptyMap()))));
                armorModel.crouching = living.isShiftKeyDown();
                armorModel.riding = defaultModel.riding;
                armorModel.young = living.isBaby();
                return armorModel;
            }
        });
    }*/

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
        return Paradisia.MODID + ":textures/items/cap.png";
    }
}
