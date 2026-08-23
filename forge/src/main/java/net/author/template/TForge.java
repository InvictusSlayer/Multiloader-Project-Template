package net.author.template;

import net.author.template.client.TForgeClient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Template.MOD_ID)
public class TForge {
    public TForge(final FMLJavaModLoadingContext context) {
        final IEventBus modBus = context.getModEventBus();
        final IEventBus forgeBus = MinecraftForge.EVENT_BUS;

        Template.init();

        modBus.addListener((FMLCommonSetupEvent event) -> event.enqueueWork(Template::commonSetup));

        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> TForgeClient.init(context));
    }
}
