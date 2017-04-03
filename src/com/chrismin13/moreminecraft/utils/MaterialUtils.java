package com.chrismin13.moreminecraft.utils;

import java.util.Arrays;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class MaterialUtils {

	private static List<Material> instantlyBreakable = Arrays.asList(Material.WATER_LILY, Material.CARROT,
			Material.DEAD_BUSH, Material.FIRE, Material.FLOWER_POT, Material.LONG_GRASS, Material.MELON_STEM,
			Material.BROWN_MUSHROOM, Material.RED_MUSHROOM, Material.NETHER_WARTS, Material.POTATO,
			Material.PUMPKIN_STEM, Material.REDSTONE_COMPARATOR_OFF, Material.REDSTONE_COMPARATOR_ON,
			Material.DIODE_BLOCK_ON, Material.DIODE_BLOCK_OFF, Material.REDSTONE_TORCH_OFF, Material.REDSTONE_TORCH_ON,
			Material.REDSTONE_WIRE, Material.SAPLING, Material.SLIME_BLOCK, Material.SUGAR_CANE_BLOCK, Material.TNT,
			Material.TORCH, Material.TRIPWIRE, Material.TRIPWIRE_HOOK, Material.SEEDS, Material.WHEAT,
			Material.BEETROOT_BLOCK, Material.END_ROD, Material.DOUBLE_PLANT);

	public static boolean isInstantlyBreakable(Material material) {
		if (instantlyBreakable.contains(material) || isFlower(material))
			return true;
		return false;
	}

	@SuppressWarnings("deprecation")
	public static boolean isFlower(Material material) {
		int id = material.getId();
		if (id == 37 || id == 38)
			return true;
		return false;
	}

	private static List<Material> willDamageShears = Arrays.asList(Material.WEB, Material.LEAVES, Material.LEAVES_2,
			Material.WOOL, Material.VINE);

	public static boolean willDamageShears(Material material) {
		if (willDamageShears.contains(material) || isInstantlyBreakable(material))
			return true;
		return false;
	}

	/**
	 * Retrieve the base damage of the given item.
	 * 
	 * @param stack
	 *            - the stack.
	 * @return The base damage.
	 */
	public static double getBaseDamage(ItemStack stack) {
		return getBaseDamage(stack.getType());
	}

	/**
	 * Retrieve the base damage of the given item.
	 * 
	 * @param material
	 *            - the material that you want the base damage for.
	 * @return The base damage.
	 */
	public static double getBaseDamage(Material material) {
		// Yes - we have to hard code these values. Cannot use
		// Operation.ADD_PERCENTAGE either.
		switch (material) {
		// Swords
		case WOOD_SWORD:
			return 4;
		case GOLD_SWORD:
			return 4;
		case STONE_SWORD:
			return 5;
		case IRON_SWORD:
			return 6;
		case DIAMOND_SWORD:
			return 7;
		// Axe
		case WOOD_AXE:
			return 7;
		case GOLD_AXE:
			return 7;
		case STONE_AXE:
			return 9;
		case IRON_AXE:
			return 9;
		case DIAMOND_AXE:
			return 9;
		// Pickaxe
		case WOOD_PICKAXE:
			return 2;
		case STONE_PICKAXE:
			return 3;
		case IRON_PICKAXE:
			return 4;
		case GOLD_PICKAXE:
			return 2;
		case DIAMOND_PICKAXE:
			return 5;
		// Spades
		case WOOD_SPADE:
			return 2.5;
		case STONE_SPADE:
			return 3.5;
		case IRON_SPADE:
			return 4.5;
		case GOLD_SPADE:
			return 2.5;
		case DIAMOND_SPADE:
			return 5.5;
		// Hoes
		case WOOD_HOE:
			return 1;
		case STONE_HOE:
			return 1;
		case IRON_HOE:
			return 1;
		case GOLD_HOE:
			return 1;
		case DIAMOND_HOE:
			return 1;
		default:
			return 1;

		}
	}

	/**
	 * Retrieve the base damage of the given item.
	 * 
	 * @param stack
	 *            - the stack.
	 * @return The base damage.
	 */
	public static double getBaseSpeed(ItemStack stack) {
		return getBaseSpeed(stack.getType());
	}

	/**
	 * Retrieve the base damage of the given item.
	 * 
	 * @param material
	 *            - the material.
	 * @return The base damage.
	 */
	public static double getBaseSpeed(Material material) {
		// Yes - we have to hard code these values. Cannot use
		// Operation.ADD_PERCENTAGE either.
		switch (material) {
		// Swords
		case WOOD_SWORD:
			return 1.6;
		case GOLD_SWORD:
			return 1.6;
		case STONE_SWORD:
			return 1.6;
		case IRON_SWORD:
			return 1.6;
		case DIAMOND_SWORD:
			return 1.6;
		// Axe
		case WOOD_AXE:
			return 0.8;
		case GOLD_AXE:
			return 0.8;
		case STONE_AXE:
			return 0.9;
		case IRON_AXE:
			return 1;
		case DIAMOND_AXE:
			return 1;
		// Pickaxe
		case WOOD_PICKAXE:
			return 1.2;
		case STONE_PICKAXE:
			return 1.2;
		case IRON_PICKAXE:
			return 1.2;
		case GOLD_PICKAXE:
			return 1.2;
		case DIAMOND_PICKAXE:
			return 1.2;
		// Spades
		case WOOD_SPADE:
			return 1;
		case STONE_SPADE:
			return 1;
		case IRON_SPADE:
			return 1;
		case GOLD_SPADE:
			return 1;
		case DIAMOND_SPADE:
			return 1;
		// Hoes
		case WOOD_HOE:
			return 1;
		case STONE_HOE:
			return 2;
		case IRON_HOE:
			return 3;
		case GOLD_HOE:
			return 1;
		case DIAMOND_HOE:
			return 4;
		default:
			return 4;

		}
	}

	/**
	 * Retrieve the base armor of the given armor.
	 * 
	 * @param stack
	 *            - the stack.
	 * @return The base damage.
	 */
	public static double getBaseArmor(ItemStack stack) {
		return getBaseArmor(stack.getType());
	}

	/**
	 * Retrieve the base armor of the given armor.
	 * 
	 * @param material
	 *            - the material.
	 * @return The base damage.
	 */
	public static double getBaseArmor(Material material) {
		// Yes - we have to hard code these values. Cannot use
		// Operation.ADD_PERCENTAGE either.
		switch (material) {
		// Leather Armor
		case LEATHER_HELMET:
			return 1;
		case LEATHER_CHESTPLATE:
			return 3;
		case LEATHER_LEGGINGS:
			return 2;
		case LEATHER_BOOTS:
			return 1;
		// Chainmail Armor
		case CHAINMAIL_HELMET:
			return 2;
		case CHAINMAIL_CHESTPLATE:
			return 5;
		case CHAINMAIL_LEGGINGS:
			return 4;
		case CHAINMAIL_BOOTS:
			return 1;
		// Iron Armor
		case IRON_HELMET:
			return 2;
		case IRON_CHESTPLATE:
			return 6;
		case IRON_LEGGINGS:
			return 5;
		case IRON_BOOTS:
			return 2;
		// Golden Armor
		case GOLD_HELMET:
			return 2;
		case GOLD_CHESTPLATE:
			return 5;
		case GOLD_LEGGINGS:
			return 4;
		case GOLD_BOOTS:
			return 1;
		// Diamond Armor
		case DIAMOND_HELMET:
			return 3;
		case DIAMOND_CHESTPLATE:
			return 8;
		case DIAMOND_LEGGINGS:
			return 6;
		case DIAMOND_BOOTS:
			return 3;
		default:
			return 0;

		}
	}

	/**
	 * Retrieve the base armor toughness of the given item.
	 * 
	 * @param stack
	 *            - the stack.
	 * @return The base damage.
	 */
	public static double getBaseArmorToughness(ItemStack stack) {
		return getBaseArmorToughness(stack.getType());
	}

	/**
	 * Retrieve the base armor toughness of the given item.
	 * 
	 * @param material
	 *            - the material.
	 * @return The base damage.
	 */
	// TODO: Disable for under 1.9.1
	public static double getBaseArmorToughness(Material material) {
		// Yes - we have to hard code these values. Cannot use
		// Operation.ADD_PERCENTAGE either.
		switch (material) {
		// Swords
		case DIAMOND_HELMET:
			return 2;
		case DIAMOND_CHESTPLATE:
			return 2;
		case DIAMOND_LEGGINGS:
			return 2;
		case DIAMOND_BOOTS:
			return 2;
		default:
			return 0;

		}
	}


}
