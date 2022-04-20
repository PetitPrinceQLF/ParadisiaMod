package fr._PetitPrince_.paradisia.objects.item;


import fr._PetitPrince_.paradisia.objects.creativeTabs.ParadisiaCreativeTab;
import fr._PetitPrince_.paradisia.Paradisia;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class paradisia_items {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Paradisia.MODID);

    public static final RegistryObject<Item> DARK_STEEL_KATANA = ITEMS.register("dark_steel_katana",
            () -> new SwordItem(paradisia_tiers.DARK_STEEL, 2, 3f,
                    new Item.Properties().tab(ParadisiaCreativeTab.ParadisiaTab)));



    public static final RegistryObject<Item> IMPURE_BEDROCK_INGOT = ITEMS.register("impure_bedrock_ingot",
            () -> new Item(new Item.Properties().tab(ParadisiaCreativeTab.ParadisiaTab)));
    public static final RegistryObject<Item> IMPURE_BEDROCK_SCRAP = ITEMS.register("impure_bedrock_scrap",
            () -> new Item(new Item.Properties().tab(ParadisiaCreativeTab.ParadisiaTab)));
    public static final RegistryObject<Item> IMPURE_BEDROCK_HELMET = ITEMS.register("impure_bedrock_helmet",
            () -> new ArmorItem(paradisia_armor_materials.IMPURE_BEDROCK, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ParadisiaCreativeTab.ParadisiaTab)));
    public static final RegistryObject<Item> IMPURE_BEDROCK_CHESTPLATE = ITEMS.register("impure_bedrock_chestplate",
            () -> new ArmorItem(paradisia_armor_materials.IMPURE_BEDROCK, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ParadisiaCreativeTab.ParadisiaTab)));
    public static final RegistryObject<Item> IMPURE_BEDROCK_LEGGINGS = ITEMS.register("impure_bedrock_leggings",
            () -> new ArmorItem(paradisia_armor_materials.IMPURE_BEDROCK, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ParadisiaCreativeTab.ParadisiaTab)));
    public static final RegistryObject<Item> IMPURE_BEDROCK_BOOTS = ITEMS.register("impure_bedrock_boots",
            () -> new ArmorItem(paradisia_armor_materials.IMPURE_BEDROCK, EquipmentSlot.FEET,
                    new Item.Properties().tab(ParadisiaCreativeTab.ParadisiaTab)));
    public static final RegistryObject<Item> IMPURE_BEDROCK_SWORD = ITEMS.register("impure_bedrock_sword",
            () -> new SwordItem(paradisia_tiers.IMPURE_BEDROCK, 2, -2.4f,
                    new Item.Properties().tab(ParadisiaCreativeTab.ParadisiaTab)));
    public static final RegistryObject<Item> IMPURE_BEDROCK_PICKAXE = ITEMS.register("impure_bedrock_pickaxe",
            () -> new PickaxeItem(paradisia_tiers.IMPURE_BEDROCK, 2, -2.8f,
                    new Item.Properties().tab(ParadisiaCreativeTab.ParadisiaTab)));
    public static final RegistryObject<Item> IMPURE_BEDROCK_AXE = ITEMS.register("impure_bedrock_axe",
            () -> new AxeItem(paradisia_tiers.IMPURE_BEDROCK, 2, -1.8f,
                    new Item.Properties().tab(ParadisiaCreativeTab.ParadisiaTab)));
    public static final RegistryObject<Item> IMPURE_BEDROCK_SHOVEL = ITEMS.register("impure_bedrock_shovel",
            () -> new ShovelItem(paradisia_tiers.IMPURE_BEDROCK, 2, -1.8f,
                    new Item.Properties().tab(ParadisiaCreativeTab.ParadisiaTab)));
    public static final RegistryObject<Item> IMPURE_BEDROCK_HOE = ITEMS.register("impure_bedrock_hoe",
            () -> new HoeItem(paradisia_tiers.IMPURE_BEDROCK, 2, -1.8f,
                    new Item.Properties().tab(ParadisiaCreativeTab.ParadisiaTab)));



    public static final RegistryObject<Item> PARADISIUM_DUST = ITEMS.register("paradisium_dust",
            () -> new Item(new Item.Properties().tab(ParadisiaCreativeTab.ParadisiaTab)));
    public static final RegistryObject<Item> PARADISIUM_FRAGMENT = ITEMS.register("paradisium_fragment",
            () -> new Item(new Item.Properties().tab(ParadisiaCreativeTab.ParadisiaTab)));
    public static final RegistryObject<Item> PARADISIUM_INGOT = ITEMS.register("paradisium_ingot",
            () -> new Item(new Item.Properties().tab(ParadisiaCreativeTab.ParadisiaTab)));
    public static final RegistryObject<Item> PARADISIUM_HELMET = ITEMS.register("paradisium_helmet",
            () -> new ArmorItem(paradisia_armor_materials.PARADISIUM, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ParadisiaCreativeTab.ParadisiaTab)));
    public static final RegistryObject<Item> PARADISIUM_CHESTPLATE = ITEMS.register("paradisium_chestplate",
            () -> new ArmorItem(paradisia_armor_materials.PARADISIUM, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ParadisiaCreativeTab.ParadisiaTab).durability(100)));
    public static final RegistryObject<Item> PARADISIUM_LEGGINGS = ITEMS.register("paradisium_leggings",
            () -> new ArmorItem(paradisia_armor_materials.PARADISIUM, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ParadisiaCreativeTab.ParadisiaTab)));
    public static final RegistryObject<Item> PARADISIUM_BOOTS = ITEMS.register("paradisium_boots",
            () -> new ArmorItem(paradisia_armor_materials.PARADISIUM, EquipmentSlot.FEET,
                    new Item.Properties().tab(ParadisiaCreativeTab.ParadisiaTab)));
    public static final RegistryObject<Item> PARADISIUM_SWORD = ITEMS.register("paradisium_sword",
            () -> new SwordItem(paradisia_tiers.PARADISIUM, 2, -2.4f,
                    new Item.Properties().tab(ParadisiaCreativeTab.ParadisiaTab)));



    public static final RegistryObject<Item> DIVINIUM_SCRAP = ITEMS.register("divinium_scrap",
            () -> new Item(new Item.Properties().tab(ParadisiaCreativeTab.ParadisiaTab)));
    public static final RegistryObject<Item> DIVINIUM_INGOT = ITEMS.register("divinium_ingot",
            () -> new Item(new Item.Properties().tab(ParadisiaCreativeTab.ParadisiaTab)));
    public static final RegistryObject<Item> DIVINIUM_HELMET = ITEMS.register("divinium_helmet",
            () -> new ArmorItem(paradisia_armor_materials.DIVINIUM, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ParadisiaCreativeTab.ParadisiaTab)));
    public static final RegistryObject<Item> DIVINIUM_CHESTPLATE = ITEMS.register("divinium_chestplate",
            () -> new ArmorItem(paradisia_armor_materials.DIVINIUM, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ParadisiaCreativeTab.ParadisiaTab)));
    public static final RegistryObject<Item> DIVINIUM_LEGGINGS = ITEMS.register("divinium_leggings",
            () -> new ArmorItem(paradisia_armor_materials.DIVINIUM, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ParadisiaCreativeTab.ParadisiaTab)));
    public static final RegistryObject<Item> DIVINIUM_BOOTS = ITEMS.register("divinium_boots",
            () -> new ArmorItem(paradisia_armor_materials.DIVINIUM, EquipmentSlot.FEET,
                    new Item.Properties().tab(ParadisiaCreativeTab.ParadisiaTab)));
    public static final RegistryObject<Item> DIVINIUM_SWORD = ITEMS.register("divinium_sword",
            () -> new SwordItem(paradisia_tiers.DIVINIUM, 2, -2.4f,
                    new Item.Properties().tab(ParadisiaCreativeTab.ParadisiaTab)));
    public static final RegistryObject<Item> DIVINIUM_PICKAXE = ITEMS.register("divinium_pickaxe",
            () -> new PickaxeItem(paradisia_tiers.DIVINIUM, 2, 1.2f,
                    new Item.Properties().tab(ParadisiaCreativeTab.ParadisiaTab)));
    public static final RegistryObject<Item> DIVINIUM_AXE = ITEMS.register("divinium_axe",
            () -> new AxeItem(paradisia_tiers.DIVINIUM, 2, 1f,
                    new Item.Properties().tab(ParadisiaCreativeTab.ParadisiaTab)));
    public static final RegistryObject<Item> DIVINIUM_SHOVEL = ITEMS.register("divinium_shovel",
            () -> new ShovelItem(paradisia_tiers.DIVINIUM, 2, 1f,
                    new Item.Properties().tab(ParadisiaCreativeTab.ParadisiaTab)));
    public static final RegistryObject<Item> DIVINIUM_HOE = ITEMS.register("divinium_hoe",
            () -> new HoeItem(paradisia_tiers.DIVINIUM, 2, 4f,
                    new Item.Properties().tab(ParadisiaCreativeTab.ParadisiaTab)));



    public static final RegistryObject<Item> COSMETICS_GEM = ITEMS.register("cosmetics_gem",
            () -> new Item(new Item.Properties().tab(ParadisiaCreativeTab.ParadisiaTab)));
    public static final RegistryObject<Item> COSMETICS_VIP_CROWN = ITEMS.register("cosmetics_vip_crown",
            () -> new ArmorItem(paradisia_armor_materials.COSMETICS, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ParadisiaCreativeTab.ParadisiaTab)));
    public static final RegistryObject<Item> COSMETICS_CASQUETTE = ITEMS.register("cosmetics_casquette",
            () -> new ArmorItem(paradisia_armor_materials.COSMETICS, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ParadisiaCreativeTab.ParadisiaTab)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
