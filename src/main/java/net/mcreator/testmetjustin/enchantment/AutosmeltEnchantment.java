
package net.mcreator.testmetjustin.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

public class AutosmeltEnchantment extends Enchantment {
	public AutosmeltEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.DIGGER, slots);
	}

	@Override
	public int getMinLevel() {
		return 26;
	}

	@Override
	public int getMaxLevel() {
		return 35;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		if (stack.getItem() == Items.WOODEN_PICKAXE)
			return true;
		if (stack.getItem() == Items.STONE_PICKAXE)
			return true;
		if (stack.getItem() == Items.IRON_PICKAXE)
			return true;
		if (stack.getItem() == Items.GOLDEN_PICKAXE)
			return true;
		if (stack.getItem() == Items.DIAMOND_PICKAXE)
			return true;
		if (stack.getItem() == Items.NETHERITE_PICKAXE)
			return true;
		return false;
	}

	@Override
	public boolean isDiscoverable() {
		return false;
	}
}
