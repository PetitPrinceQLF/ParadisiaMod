package fr._PetitPrince_.ParadisiaMod;

import fr._PetitPrince_.ParadisiaMod.block.impure_bedrock_block;
import fr._PetitPrince_.ParadisiaMod.block.lucky_block;
import fr._PetitPrince_.ParadisiaMod.block.paradisium_ore;
import fr._PetitPrince_.ParadisiaMod.block.reinforced_obsidian;
import fr._PetitPrince_.ParadisiaMod.item.paradisia_items;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(ParadisiaMod.MOD_ID)
public class ParadisiaMod
{
    public static final String MOD_ID = "paradisiamod";
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public ParadisiaMod() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        eventBus.addListener(this::doClientSteuf);

        MinecraftForge.EVENT_BUS.register(this);

        paradisia_items.register(eventBus);
        paradisium_ore.register(eventBus);
        lucky_block.register(eventBus);
        impure_bedrock_block.register(eventBus);
        reinforced_obsidian.register(eventBus);

    }

    public void doClientSteuf(FMLClientSetupEvent event){
        ItemBlockRenderTypes.setRenderLayer(paradisium_ore.PARADISIUM_ORE.get(), RenderType.cutout());
    }
}
