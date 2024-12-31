package net.mcreator.whay.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.whay.entity.TheFreakingDogEntity;

public class TheFreakingDogModel extends GeoModel<TheFreakingDogEntity> {
	@Override
	public ResourceLocation getAnimationResource(TheFreakingDogEntity entity) {
		return new ResourceLocation("whay", "animations/the_freaking_dog.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TheFreakingDogEntity entity) {
		return new ResourceLocation("whay", "geo/the_freaking_dog.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TheFreakingDogEntity entity) {
		return new ResourceLocation("whay", "textures/entities/" + entity.getTexture() + ".png");
	}

}
