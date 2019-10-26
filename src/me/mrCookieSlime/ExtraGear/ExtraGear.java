package me.mrCookieSlime.ExtraGear;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

import me.mrCookieSlime.CSCoreLibPlugin.PluginUtils;
import me.mrCookieSlime.CSCoreLibPlugin.general.Inventory.Item.CustomItem;
import me.mrCookieSlime.CSCoreLibPlugin.general.String.StringUtils;
import me.mrCookieSlime.Slimefun.Lists.Categories;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Lists.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.Research;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.SlimefunItem;
import me.mrCookieSlime.Slimefun.Setup.SlimefunManager;
import me.mrCookieSlime.Slimefun.api.Slimefun;

public class ExtraGear extends JavaPlugin {

	int id = 3300;

	@Override
	public void onEnable() {
		PluginUtils utils = new PluginUtils(this);
		utils.setupUpdater(90310, getFile());
		utils.setupMetrics();

		registerSword(Material.IRON_SWORD, "COPPER", "Медный", SlimefunItems.COPPER_INGOT, "DAMAGE_UNDEAD-2");
		registerArmor("LEATHER", "COPPER", "Медн", SlimefunItems.COPPER_INGOT, "PROTECTION_EXPLOSIONS-2");

		registerSword(Material.IRON_SWORD, "TIN", "Оловянный", SlimefunItems.TIN_INGOT, "DAMAGE_ALL-1");
		registerArmor("IRON", "TIN", "Оловянн", SlimefunItems.TIN_INGOT, "PROTECTION_EXPLOSIONS-3");

		registerSword(Material.IRON_SWORD, "SILVER", "Серебряный", SlimefunItems.SILVER_INGOT, "DAMAGE_ALL-2");
		registerArmor("IRON", "SILVER", "Серебрян", SlimefunItems.SILVER_INGOT, "PROTECTION_ENVIRONMENTAL-2");

		registerSword(Material.IRON_SWORD, "ALUMINUM", "Алюминиевый", SlimefunItems.ALUMINUM_INGOT, "DAMAGE_ARTHROPODS-3");
		registerArmor("IRON", "ALUMINUM", "Алюминиев", SlimefunItems.ALUMINUM_INGOT, "PROTECTION_EXPLOSIONS-2", "DURABILITY-2");

		registerSword(Material.IRON_SWORD, "LEAD", "Свинцовый", SlimefunItems.LEAD_INGOT, "DAMAGE_ALL-3", "DURABILITY-8");
		registerArmor("IRON", "LEAD", "Свинцов", SlimefunItems.LEAD_INGOT, "PROTECTION_ENVIRONMENTAL-3", "DURABILITY-8");

		registerSword(Material.IRON_SWORD, "ZINC", "Цинковый", SlimefunItems.ZINC_INGOT, "DAMAGE_ALL-2");
		registerArmor("IRON", "ZINC", "Цинков", SlimefunItems.ZINC_INGOT, "PROTECTION_ENVIRONMENTAL-3");

		registerSword(Material.IRON_SWORD, "MAGNESIUM", "Магниевый", SlimefunItems.MAGNESIUM_INGOT, "DAMAGE_ALL-2", "DURABILITY-5");
		registerArmor("IRON", "MAGNESIUM", "Магниев", SlimefunItems.MAGNESIUM_INGOT, "PROTECTION_ENVIRONMENTAL-2", "DURABILITY-5");

		registerSword(Material.IRON_SWORD, "STEEL", "Стальной", SlimefunItems.STEEL_INGOT, "DAMAGE_ALL-5", "DURABILITY-6");
		// I'm so sorry…
		ItemStack[] armor = {
				new CustomItem(Material.IRON_HELMET, "&rСтальной шлем", new String[] {"PROTECTION_ENVIRONMENTAL-4", "DURABILITY-3"}, 0),
				new CustomItem(Material.IRON_CHESTPLATE, "&rСтальной нагрудник", new String[] {"PROTECTION_ENVIRONMENTAL-4", "DURABILITY-3"}, 0),
				new CustomItem(Material.IRON_LEGGINGS, "&rСтальные штаны", new String[] {"PROTECTION_ENVIRONMENTAL-4", "DURABILITY-3"}, 0),
				new CustomItem(Material.IRON_BOOTS, "&rСтальные ботинки", new String[] {"PROTECTION_ENVIRONMENTAL-4", "DURABILITY-3"}, 0)
		};
		SlimefunManager.registerArmorSet(SlimefunItems.STEEL_INGOT, armor, "STEEL", false, false);
		Slimefun.registerResearch(new Research(++id, "Стальная броня", 5), armor);

		registerSword(Material.IRON_SWORD, "BRONZE", "Бронзовый", SlimefunItems.BRONZE_INGOT, "DAMAGE_ALL-3", "DURABILITY-6");
		registerSword(Material.IRON_SWORD, "DURALUMIN", "Дюралюминиевый", SlimefunItems.DURALUMIN_INGOT, "DAMAGE_ALL-3", "DURABILITY-6");
		registerSword(Material.IRON_SWORD, "BILLON", "Биллонный", SlimefunItems.BILLON_INGOT, "DAMAGE_ALL-4", "DURABILITY-5");
		registerSword(Material.IRON_SWORD, "BRASS", "Латунный", SlimefunItems.BRASS_INGOT, "DAMAGE_UNDEAD-4", "DURABILITY-6");
		registerSword(Material.IRON_SWORD, "ALUMINUM_BRASS", "Алюминиево-латунный", SlimefunItems.ALUMINUM_BRASS_INGOT, "DAMAGE_ARTHROPODS-4", "DURABILITY-4");
		registerSword(Material.IRON_SWORD, "ALUMINUM_BRONZE", "Алюминиево-бронзовый", SlimefunItems.ALUMINUM_BRONZE_INGOT, "DAMAGE_ARTHROPODS-4", "DURABILITY-5");
		registerSword(Material.IRON_SWORD, "CORINTHIAN_BRONZE", "Коринфско-бронзовый", SlimefunItems.CORINTHIAN_BRONZE_INGOT, "DAMAGE_ALL-5", "DURABILITY-5");
		registerSword(Material.IRON_SWORD, "SOLDER", "припоя", true, SlimefunItems.SOLDER_INGOT, "DAMAGE_ALL-4", "DURABILITY-6");
		registerSword(Material.IRON_SWORD, "DAMASCUS_STEEL", "дамасской стали", true, SlimefunItems.DAMASCUS_STEEL_INGOT, "DAMAGE_ALL-6", "DURABILITY-7");
		registerSword(Material.IRON_SWORD, "HARDENED", "Закалённый", SlimefunItems.HARDENED_METAL_INGOT, "DAMAGE_ALL-7", "DURABILITY-10");
		registerSword(Material.IRON_SWORD, "REINFORCED", "Армированный", SlimefunItems.REINFORCED_ALLOY_INGOT, "DAMAGE_ALL-8", "DURABILITY-8");
		registerSword(Material.IRON_SWORD, "FERROSILICON", "Ферросилициевый", SlimefunItems.FERROSILICON, "DAMAGE_UNDEAD-8", "DURABILITY-4");
		registerSword(Material.GOLDEN_SWORD, "GILDED_IRON", "Позолоченно-железный", SlimefunItems.GILDED_IRON, "DAMAGE_ARTHROPODS-8", "DURABILITY-10");
		registerSword(Material.IRON_SWORD, "NICKEL", "Никелевый", SlimefunItems.NICKEL_INGOT, "DAMAGE_ALL-6", "DURABILITY-5");

		registerSword(Material.IRON_SWORD, "COBALT", "Кобальтовый", SlimefunItems.COBALT_INGOT, "DAMAGE_ALL-7", "DURABILITY-7");
		registerArmor("IRON", "COBALT", "Кобальтов", SlimefunItems.COBALT_INGOT, "PROTECTION_ENVIRONMENTAL-7", "DURABILITY-7");
	}

	private void registerSword(Material type, String component, String name, ItemStack item, String... enchantments) {
		registerSword(type, component, name, false, item, enchantments);
	}

	private void registerSword(Material type, String component, String name, boolean last, ItemStack item, String... enchantments) {
		name = last ? "Меч из " + name : name + " меч";
		ItemStack is = new CustomItem(type, "&r" + name, enchantments, 0);

		new SlimefunItem(Categories.WEAPONS, is, component + "_SWORD", RecipeType.ENHANCED_CRAFTING_TABLE,
		new ItemStack[] {null, item, null, null, item, null, null, new ItemStack(Material.STICK), null})
		.register();
		
		Slimefun.registerResearch(new Research(++id, name, 3), is);
	}

	private void registerArmor(String material, String component, String name, ItemStack item, String... enchantments) {
		ItemStack[] armor = {
				new CustomItem(Material.getMaterial(material + "_HELMET"), "&r" + name + "ый шлем", enchantments, 0),
				new CustomItem(Material.getMaterial(material + "_CHESTPLATE"), "&r" + name + "ый нагрудник", enchantments, 0),
				new CustomItem(Material.getMaterial(material + "_LEGGINGS"), "&r" + name + "ые штаны", enchantments, 0),
				new CustomItem(Material.getMaterial(material + "_BOOTS"), "&r" + name + "ые ботинки", enchantments, 0)
		};

		SlimefunManager.registerArmorSet(item, armor, component, false, false);

		Slimefun.registerResearch(new Research(++id, name + "ая броня", 5), armor);
	}

}
