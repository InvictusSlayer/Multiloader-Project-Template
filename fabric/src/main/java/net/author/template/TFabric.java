package net.author.template;

import net.fabricmc.api.ModInitializer;

public class TFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        Template.init();
    }
}
