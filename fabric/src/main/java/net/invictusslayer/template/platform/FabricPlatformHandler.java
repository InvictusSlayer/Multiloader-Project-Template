package net.invictusslayer.template.platform;

import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class FabricPlatformHandler implements IPlatformHandler {
	@Override
	public Platform getPlatform() {
		return Platform.FABRIC;
	}

	@Override
	public Path configPath(String modId) {
		return FabricLoader.getInstance().getConfigDir().resolve(modId);
	}
}
