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
		registerBasic(ModBlocks.BlueGlass);
		registerBasic(ModBlocks.EnderNuggetOre);
		registerBasic(ModBlocks.GreenStone);
		registerBasic(ModBlocks.smGreenstone);
		registerBasic(ModBlocks.roughGreenstone);
		registerBasic(ModBlocks.EnderGreenGlass);
		registerBasic(ModBlocks.GreenStone_Brick);
	}
	
	public static void registerBasic(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(modid + ":" + block.getUnlocalizedName().substring(5), "inventory"));

	}
}
