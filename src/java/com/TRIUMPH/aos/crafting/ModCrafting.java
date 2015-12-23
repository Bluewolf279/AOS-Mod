package com.TRIUMPH.aos.crafting;

import com.TRIUMPH.aos.blocks.ModBlocks;
import com.TRIUMPH.aos.items.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModCrafting {
	public static void initCrafting() {
		GameRegistry.addRecipe(new ItemStack(ModBlocks.GreenStone,8),"###", "#%#", "###", '#', Blocks.stone, '%', ModItems.Ender_nugget);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.smGreenstone,4), "##","##",'#',ModBlocks.GreenStone);
		GameRegistry.addRecipe(new ItemStack(ModBlocks.EnderGreenGlass,8),"###", "#%#", "###", '#', Blocks.glass, '%',ModItems.Ender_nugget);
		GameRegistry.addRecipe(new ItemStack(ModItems.Ender_crystal),"###","###","###",'#',ModItems.Ender_nugget);
		GameRegistry.addRecipe(new ItemStack(ModItems.Ender_CrystalPickaxe),"###"," % "," % ",'#',ModItems.Ender_crystal,'%', Items.stick);
		GameRegistry.addRecipe(new ItemStack(ModItems.Ender_crystalSword)," # "," # "," % ",'#',ModItems.Ender_crystal,'%',Items.stick);

		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.roughGreenstone,1),ModBlocks.GreenStone);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.GreenStone,1),ModBlocks.smGreenstone);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.GreenStone,1),ModBlocks.roughGreenstone);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.Ender_nugget,9), ModItems.Ender_crystal);
	}
	public static void initSmelting(){
		GameRegistry.addSmelting(ModBlocks.EnderNuggetOre, new ItemStack(ModItems.Ender_crystal), 2.0f);
	}
}
