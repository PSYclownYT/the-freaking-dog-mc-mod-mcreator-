
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.whay.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.whay.WhayMod;

public class WhayModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, WhayMod.MODID);
	public static final RegistryObject<SoundEvent> VOLTAGE_SCREAMER = REGISTRY.register("voltage-screamer", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("whay", "voltage-screamer")));
	public static final RegistryObject<SoundEvent> ELMO_MOTOR_FAILURE = REGISTRY.register("elmo-motor-failure", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("whay", "elmo-motor-failure")));
}
