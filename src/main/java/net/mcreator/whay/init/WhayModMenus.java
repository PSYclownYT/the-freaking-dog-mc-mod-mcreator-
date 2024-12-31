
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.whay.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.whay.world.inventory.WhayGUIMenu;
import net.mcreator.whay.WhayMod;

public class WhayModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, WhayMod.MODID);
	public static final RegistryObject<MenuType<WhayGUIMenu>> WHAY_GUI = REGISTRY.register("whay_gui", () -> IForgeMenuType.create(WhayGUIMenu::new));
}
