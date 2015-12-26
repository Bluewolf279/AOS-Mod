package com.TRIUMPH.aos.client.render.items;

import com.TRIUMPH.aos.Main;
import com.TRIUMPH.aos.items.ModItems;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public final class ItemRenderRegister {

	public static String modID = Main.MODID;

	public static void registerItemRenderer() {
		//Basic Item
		reg(ModItems.Poison_Arrow);
		//[EnderCrystal]
		reg(ModItems.Ender_nugget);
		reg(ModItems.Ender_crystal);
			//[Tools]
		reg(ModItems.Ender_crystalSword);
		reg(ModItems.Ender_CrystalPickaxe);
		reg(ModItems.Ender_CrystalShovel);
		reg(ModItems.Ender_CrystalAxe);
			//[Armour]
		reg(ModItems.Ender_CrystalHelmet);
		reg(ModItems.Ender_CrystalChestpiece);
		reg(ModItems.Ender_CrystalLeggings);
		reg(ModItems.Ender_CrystalBoots);
		//[ObsidianCrystal]
		reg(ModItems.Obsidian_Crystal_Clump);
		reg(ModItems.Obsidian_Crystal);
			//[Tools]
		reg(ModItems.Obsidian_Crystal_Pickaxe);
		reg(ModItems.Obsidian_Crystal_Sword);
			//[Armour]
		reg(ModItems.Obsidian_Crystal_Helmet);
		reg(ModItems.Obsidian_Crystal_Chestplate);
		reg(ModItems.Obsidian_Crystal_Leggings);
		reg(ModItems.Obsidian_Crystal_Boots);
		//reg(ModItems.Throwablespear);
	}

	public static void reg(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(modID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}


}