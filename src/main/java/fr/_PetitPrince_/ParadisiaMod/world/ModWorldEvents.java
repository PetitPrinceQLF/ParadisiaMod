package fr._PetitPrince_.ParadisiaMod.world;

import fr._PetitPrince_.ParadisiaMod.ParadisiaMod;
import fr._PetitPrince_.ParadisiaMod.world.gen.ModOreGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = ParadisiaMod.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);

    }
}