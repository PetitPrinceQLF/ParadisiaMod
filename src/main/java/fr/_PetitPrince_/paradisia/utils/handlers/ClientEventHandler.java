package fr._PetitPrince_.paradisia.utils.handlers;

import fr._PetitPrince_.paradisia.client.models.ModelCap;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ClientEventHandler {
    @SubscribeEvent
    public void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        System.out.println("###########");
        event.registerLayerDefinition(ModelCap.LAYER_LOCATION, ModelCap::createBodyLayer);
    }
}
