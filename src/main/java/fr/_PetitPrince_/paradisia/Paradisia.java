package fr._PetitPrince_.paradisia;

import fr._PetitPrince_.paradisia.init.BlocksInit;
import fr._PetitPrince_.paradisia.init.ItemsInit;
import fr._PetitPrince_.paradisia.utils.handlers.ClientEventHandler;
import fr._PetitPrince_.paradisia.utils.handlers.CommonEventHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Paradisia.MODID)
public class Paradisia {
    public static final String MODID = "paradisia";
    public static final IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

    public Paradisia() {
        MinecraftForge.EVENT_BUS.register(new ClientEventHandler());
        //eventBus.addListener(this::commonSetupEvent);
        //eventBus.addListener(this::clientSetupEvent);

        ItemsInit.REGISTRY.register(eventBus);
    }

    private void commonSetupEvent(FMLCommonSetupEvent event) {
        MinecraftForge.EVENT_BUS.register(new CommonEventHandler());


        //BlocksInit.REGISTRY.register(eventBus);

        /*paradisia_items.register(eventBus);
        paradisium_ore.register(eventBus);
        deepslate_paradisium_ore.register(eventBus);
        lucky_block.register(eventBus);
        impure_bedrock_block.register(eventBus);
        reinforced_obsidian.register(eventBus);*/
    }

    private void clientSetupEvent(FMLClientSetupEvent event) {
        MinecraftForge.EVENT_BUS.register(new ClientEventHandler());
        //ItemBlockRenderTypes.setRenderLayer(paradisium_ore.PARADISIUM_ORE.get(), RenderType.cutout());
    }
}
