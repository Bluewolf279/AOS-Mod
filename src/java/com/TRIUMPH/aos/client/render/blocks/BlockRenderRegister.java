package com.TRIUMPH.aos.client.render.blocks;

import com.TRIUMPH.aos.Main;
import com.TRIUMPH.aos.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;



public class BlockRenderRegister {
	
	public static String modid = Main.MODID;
	public static void registerBlockRenderer() {
		//Basic Blocks
		registerBasic(ModBlocks.GreenStone_Brick);
		registerBasic(ModBlocks.GreenStone);
		registerBasic(ModBlocks.smGreenstone);
		registerBasic(ModBlocks.roughGreenstone);
		//Glass
		registerBasic(ModBlocks.EnderGreenGlass);
		registerBasic(ModBlocks.BlueGlass);
		//Ore
		registerBasic(ModBlocks.EnderNuggetOre);

	}
	
	public static void registerBasic(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));

	}
}
