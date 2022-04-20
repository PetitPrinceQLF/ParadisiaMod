package fr._PetitPrince_.paradisia.objects.block;

import fr._PetitPrince_.paradisia.Paradisia;
import fr._PetitPrince_.paradisia.objects.creativeTabs.ParadisiaCreativeTab;
import fr._PetitPrince_.paradisia.objects.item.paradisia_items;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class impure_bedrock_block {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Paradisia.MODID);

    public static final RegistryObject<Block> IMPURE_BEDROCK_BLOCK = registerBlock("impure_bedrock_block", () -> new Block(BlockBehaviour.Properties.of(Material.STONE).noOcclusion().strength(0.3F)));

    private static <T extends Block>RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registrerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registrerBlockOnly(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        return toReturn;
    }

    private static <T extends Block> void registrerBlockItem(String name, Supplier<T> block){
        paradisia_items.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(ParadisiaCreativeTab.ParadisiaTab)));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
