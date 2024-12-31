
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.whay.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.whay.item.WHAYItem;
import net.mcreator.whay.item.GunItem;
import net.mcreator.whay.WhayMod;

public class WhayModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, WhayMod.MODID);
	public static final RegistryObject<Item> THE_FREAKING_DOG_SPAWN_EGG = REGISTRY.register("the_freaking_dog_spawn_egg", () -> new ForgeSpawnEggItem(WhayModEntities.THE_FREAKING_DOG, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> WHAY = REGISTRY.register("whay", () -> new WHAYItem());
	public static final RegistryObject<Item> BLOCKOFWHAY = block(WhayModBlocks.BLOCKOFWHAY);
	public static final RegistryObject<Item> ELMO_BLOCK = block(WhayModBlocks.ELMO_BLOCK);
	public static final RegistryObject<Item> GUN = REGISTRY.register("gun", () -> new GunItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
