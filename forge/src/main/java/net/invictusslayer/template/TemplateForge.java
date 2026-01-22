package net.invictusslayer.template;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Template.MOD_ID)
public class TemplateForge {
	public TemplateForge(final FMLJavaModLoadingContext context) {
		IEventBus bus = context.getModEventBus();
		Template.init();
	}
}
