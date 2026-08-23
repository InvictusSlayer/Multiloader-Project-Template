package net.author.template.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(EnvType.CLIENT)
public class TFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        TClient.init();
        TClient.clientSetup();
    }
}
