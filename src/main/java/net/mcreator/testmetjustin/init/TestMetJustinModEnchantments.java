
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.testmetjustin.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.testmetjustin.enchantment.AutosmeltEnchantment;
import net.mcreator.testmetjustin.TestMetJustinMod;

public class TestMetJustinModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, TestMetJustinMod.MODID);
	public static final RegistryObject<Enchantment> AUTOSMELT = REGISTRY.register("autosmelt", () -> new AutosmeltEnchantment());
}
