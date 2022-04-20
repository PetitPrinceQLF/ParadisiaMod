package fr._PetitPrince_.paradisia.init;

import fr._PetitPrince_.paradisia.Paradisia;
import fr._PetitPrince_.paradisia.objects.item.ItemCosmetics;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemsInit {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, Paradisia.MODID);

    public static final RegistryObject<Item> CAP = REGISTRY.register("cap", ItemCosmetics::new);
}
