package net.invictusslayer.template;

import net.invictusslayer.template.platform.IPlatformHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ServiceLoader;

public class Template {
	public static final String MOD_ID = "template";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);
	public static final IPlatformHandler PLATFORM = load(IPlatformHandler.class);

	public static void init() {
		LOGGER.info(PLATFORM.configPath(MOD_ID).toAbsolutePath().normalize().toString());
	}

	private static <T> T load(Class<T> clazz) {
		final T loadedService = ServiceLoader.load(clazz).findFirst().orElseThrow(() -> new NullPointerException("Failed to load service for " + clazz.getName()));
		LOGGER.debug("Loaded {} for service {}", loadedService, clazz);
		return loadedService;
	}
}
