package com.TRIUMPH.aos.crafting;

import com.TRIUMPH.aos.blocks.ModBlocks;
import com.TRIUMPH.aos.fluids.MainModFluid;
import com.TRIUMPH.aos.items.ModItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidContainerRegistry;

import static net.minecraftforge.fml.common.registry.GameRegistry.*;

public class ModCrafting {
	public static void initCrafting() {
		addRecipe(new ItemStack(ModBlocks.GreenStone,8),"###", "#%#", "###", '#', Blocks.stone, '%', ModItems.Ender_nugget);
		addRecipe(new ItemStack(ModBlocks.smGreenstone,4), "##","##",'#',ModBlocks.GreenStone);
		addRecipe(new ItemStack(ModBlocks.EnderGreenGlass,8),"###", "#%#", "###", '#', Blocks.glass, '%',ModItems.Ender_nugget);
		addRecipe(new ItemStack(ModItems.Ender_crystal),"###","###","###",'#',ModItems.Ender_nugget);
		addRecipe(new ItemStack(ModItems.Ender_CrystalPickaxe),"###"," % "," % ",'#',ModItems.Ender_crystal,'%', Items.stick);
		addRecipe(new ItemStack(ModItems.Ender_crystalSword)," # "," # "," % ",'#',ModItems.Ender_crystal,'%',Items.stick);
		addRecipe(new ItemStack(ModItems.Obsidian_Crystal_Clump),"%#%","#%#","%#%",'%',Items.coal,'#',Blocks.obsidian);
		addRecipe(new ItemStack(ModItems.Obsidian_Crystal)," # ","#%#"," # ",'#',ModItems.Obsidian_Crystal_Clump,'%',Items.gold_ingot);
		addRecipe(new ItemStack(ModItems.Obsidian_Crystal_Sword)," # "," # "," % ",'#',ModItems.Obsidian_Crystal,'%',Items.stick);
		addRecipe(new ItemStack(ModItems.Obsidian_Crystal_Pickaxe),"###"," % "," % ",'#',ModItems.Obsidian_Crystal,'%',Items.stick);
		addRecipe(new ItemStack(ModItems.Obsidian_Crystal_Helmet),"###","# #",'#',ModItems.Obsidian_Crystal);
		addRecipe(new ItemStack(ModItems.Obsidian_Crystal_Chestplate),"# #","###","###",'#',ModItems.Obsidian_Crystal);
		addRecipe(new ItemStack(ModItems.Obsidian_Crystal_Leggings),"###","# #","# #",'#',ModItems.Obsidian_Crystal);
		addRecipe(new ItemStack(ModItems.Obsidian_Crystal_Boots),"# #","# #",'#',ModItems.Obsidian_Crystal);

		addShapelessRecipe(new ItemStack(ModBlocks.roughGreenstone,1),ModBlocks.GreenStone);
		addShapelessRecipe(new ItemStack(ModBlocks.GreenStone,1),ModBlocks.smGreenstone);
		addShapelessRecipe(new ItemStack(ModBlocks.GreenStone,1),ModBlocks.roughGreenstone);
		addShapelessRecipe(new ItemStack(ModItems.Ender_nugget,9), ModItems.Ender_crystal);


		FluidContainerRegistry.registerFluidContainer(MainModFluid.Nitroglycerin, new ItemStack(ModItems.LiquidNitrogenBucket),new ItemStack(Items.bucket));
	}
	public static void initSmelting(){
		addSmelting(ModBlocks.EnderNuggetOre, new ItemStack(ModItems.Ender_crystal), 2.0f);
	}
}
