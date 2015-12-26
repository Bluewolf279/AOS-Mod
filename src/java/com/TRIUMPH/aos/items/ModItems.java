package com.TRIUMPH.aos.items;

import com.TRIUMPH.aos.unLocalizedNames;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	public static final CreativeTabs AOStab = new CreativeTabs("aos") {
		@Override
		public Item getTabIconItem() {	return Ender_crystal;	}

	};

	public static Item Poison_Arrow;
	public static Item Ender_nugget;
	public static Item Ender_crystal;
	public static Item Ender_crystalSword;
	public static Item Ender_CrystalPickaxe;
	public static Item Ender_CrystalShovel;
	public static Item Ender_CrystalAxe;
	//public static Item Throwablespear;


	public static Item Ender_CrystalHelmet;
	public static Item Ender_CrystalChestpiece;
	public static Item Ender_CrystalLeggings;
	public static Item Ender_CrystalBoots;

	public static ToolMaterial EndercrystalTo = EnumHelper.addToolMaterial("Ender_crystalTo", 3, 2000, 10.0F, 3.0F, 15);
	public static ArmorMaterial EndercrystalAr = EnumHelper.addArmorMaterial(unLocalizedNames.EnderCrystal,"aos:EndercrystalAr",33,new int[]{3,8,6,3},15);
//Ender_Cystal Pickaxe
	public static void createItem() {
		GameRegistry.registerItem(Poison_Arrow	= new BasicItem("Poison Arrow"), "Poison Arrow");
		GameRegistry.registerItem(Ender_nugget	= new BasicItem(unLocalizedNames.EnderNugget), unLocalizedNames.EnderNugget);
		GameRegistry.registerItem(Ender_crystal	= new BasicItem(unLocalizedNames.EnderCrystal), unLocalizedNames.EnderCrystal);
		GameRegistry.registerItem(Ender_crystalSword = new ItemModSword(unLocalizedNames.EnderCrystalSword,EndercrystalTo), unLocalizedNames.EnderCrystalSword);
		GameRegistry.registerItem(Ender_CrystalPickaxe = new ItemModPickaxe(unLocalizedNames.EnderCrystalPickaxe,EndercrystalTo), unLocalizedNames.EnderCrystalPickaxe);
		GameRegistry.registerItem(Ender_CrystalShovel = new ItemModShovel(unLocalizedNames.EnderCrystalShovel,EndercrystalTo), unLocalizedNames.EnderCrystalShovel);
		GameRegistry.registerItem(Ender_CrystalAxe = new ItemModAxe(unLocalizedNames.EnderCrystalAxe,EndercrystalTo), unLocalizedNames.EnderCrystalAxe);
		//GameRegistry.registerItem(Throwablespear = new ItemModThrowable(unLocalizedNames.Throwablespear),unLocalizedNames.Throwablespear);

		GameRegistry.registerItem(Ender_CrystalHelmet = new ItemModArmor(unLocalizedNames.EnderCrystalHelmet,EndercrystalAr,1,0), unLocalizedNames.EnderCrystalHelmet);
		GameRegistry.registerItem(Ender_CrystalChestpiece = new ItemModArmor(unLocalizedNames.EnderCrystalChestplate,EndercrystalAr,1,1), unLocalizedNames.EnderCrystalChestplate);
		GameRegistry.registerItem(Ender_CrystalLeggings = new ItemModArmor(unLocalizedNames.EnderCrystalLeggings,EndercrystalAr,2,2), unLocalizedNames.EnderCrystalLeggings);
		GameRegistry.registerItem(Ender_CrystalBoots = new ItemModArmor(unLocalizedNames.EnderCrystalBoots,EndercrystalAr,1,3), unLocalizedNames.EnderCrystalBoots);
	}
}