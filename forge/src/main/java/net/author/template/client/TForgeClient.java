package net.author.template.client;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@OnlyIn(Dist.CLIENT)
public class TForgeClient {
    public static void init(final FMLJavaModLoadingContext context) {
        TClient.init();
        final IEventBus bus = context.getModEventBus();
        bus.addListener((FMLClientSetupEvent event) -> event.enqueueWork(TClient::clientSetup));
    }
}
