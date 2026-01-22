package net.invictusslayer.template.platform;

import java.nio.file.Path;

public interface IPlatformHandler {
	Platform getPlatform();

	Path configPath(String modId);

	enum Platform {
		FABRIC,
		FORGE,
		NEOFORGE
	}
}
