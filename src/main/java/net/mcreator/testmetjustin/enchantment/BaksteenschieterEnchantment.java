
package net.mcreator.testmetjustin.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

public class BaksteenschieterEnchantment extends Enchantment {
	public BaksteenschieterEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.VERY_RARE, EnchantmentCategory.CROSSBOW, slots);
	}

	@Override
	public int getMinLevel() {
		return 27;
	}

	@Override
	public int getMaxLevel() {
		return 37;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack) {
		if (stack.getItem() == Items.CROSSBOW)
			return true;
		return false;
	}

	@Override
	public boolean isDiscoverable() {
		return false;
	}
}
