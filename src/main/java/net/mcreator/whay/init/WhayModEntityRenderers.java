
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.whay.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.whay.client.renderer.TheFreakingDogRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class WhayModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(WhayModEntities.THE_FREAKING_DOG.get(), TheFreakingDogRenderer::new);
		event.registerEntityRenderer(WhayModEntities.GUN.get(), ThrownItemRenderer::new);
	}
}
