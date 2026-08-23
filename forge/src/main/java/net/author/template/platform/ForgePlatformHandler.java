package net.author.template.platform;

import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class ForgePlatformHandler implements IPlatformHandler {
    @Override
    public Platform getPlatform() {
        return Platform.FORGE;
    }

    @Override
    public Path configPath(String modId) {
        return FMLPaths.CONFIGDIR.get().resolve(modId);
    }
}
