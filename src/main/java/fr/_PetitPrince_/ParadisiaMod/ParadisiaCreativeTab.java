package fr._PetitPrince_.ParadisiaMod;

import fr._PetitPrince_.ParadisiaMod.item.paradisia_items;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ParadisiaCreativeTab {
    public static final CreativeModeTab ParadisiaTab = new CreativeModeTab("paradisia_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(paradisia_items.PARADISIUM_INGOT.get());
        }
    };

    public static final CreativeModeTab Paradisia_blocks_tab = new CreativeModeTab("Paradisia Blocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(paradisia_items.DIVINIUM_SCRAP.get());
        }
    };

    public static final CreativeModeTab Paradisia_items_tab = new CreativeModeTab("Paradisia Items") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(paradisia_items.DIVINIUM_INGOT.get());
        }
    };

    public static final CreativeModeTab Paradisia_armors_tab = new CreativeModeTab("Paradisia Armors") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(paradisia_items.DIVINIUM_CHESTPLATE.get());
        }
    };

    public static final CreativeModeTab Paradisia_tools_tab = new CreativeModeTab("Paradisia Tools") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(paradisia_items.DIVINIUM_PICKAXE.get());
        }
    };
}
