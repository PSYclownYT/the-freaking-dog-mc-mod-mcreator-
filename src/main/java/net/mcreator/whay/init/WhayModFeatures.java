
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.whay.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.whay.world.features.WhayHouseFeature;
import net.mcreator.whay.WhayMod;

@Mod.EventBusSubscriber
public class WhayModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, WhayMod.MODID);
	public static final RegistryObject<Feature<?>> WHAY_HOUSE = REGISTRY.register("whay_house", WhayHouseFeature::new);
}
