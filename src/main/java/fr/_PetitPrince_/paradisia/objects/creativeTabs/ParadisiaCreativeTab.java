package fr._PetitPrince_.paradisia.objects.creativeTabs;

import fr._PetitPrince_.paradisia.objects.item.paradisia_items;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ParadisiaCreativeTab {
    public static final CreativeModeTab ParadisiaTab = new CreativeModeTab("paradisia_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(paradisia_items.PARADISIUM_INGOT.get());
        }
    };
}
