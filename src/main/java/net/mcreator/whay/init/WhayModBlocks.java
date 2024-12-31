
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.whay.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.whay.block.ElmoBlockBlock;
import net.mcreator.whay.block.BlockofwhayBlock;
import net.mcreator.whay.WhayMod;

public class WhayModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, WhayMod.MODID);
	public static final RegistryObject<Block> BLOCKOFWHAY = REGISTRY.register("blockofwhay", () -> new BlockofwhayBlock());
	public static final RegistryObject<Block> ELMO_BLOCK = REGISTRY.register("elmo_block", () -> new ElmoBlockBlock());
}
