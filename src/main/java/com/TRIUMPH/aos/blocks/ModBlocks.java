package com.TRIUMPH.aos.blocks;

import com.TRIUMPH.aos.unLocalizedNames;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

	public static Block BlueGlass;
	public static Block EnderNuggetOre;
	public static Block GreenStone;
	public static Block smGreenstone;
	public static Block GreenStone_Brick;
	public static Block roughGreenstone;
	public static Block EnderGreenGlass;
	public static void createBlock(){
		GameRegistry.registerBlock(BlueGlass = new BasicGlass(unLocalizedNames.BlueGlass), unLocalizedNames.BlueGlass);
		GameRegistry.registerBlock(EnderNuggetOre = new BasicBlock(unLocalizedNames.EnderCrystalOre), unLocalizedNames.EnderCrystalOre);
		GameRegistry.registerBlock(GreenStone = new BasicBlock(unLocalizedNames.GreenStone), unLocalizedNames.GreenStone);
		GameRegistry.registerBlock(smGreenstone = new BasicBlock(unLocalizedNames.SmoothGreenStone), unLocalizedNames.SmoothGreenStone);
		GameRegistry.registerBlock(GreenStone_Brick = new BasicBlock(unLocalizedNames.BrickGreenStone), unLocalizedNames.BrickGreenStone);
		GameRegistry.registerBlock(roughGreenstone = new BasicBlock(unLocalizedNames.RoughGreenStone), unLocalizedNames.RoughGreenStone);
		GameRegistry.registerBlock(EnderGreenGlass = new BasicGlass(unLocalizedNames.EnderGreenGlass), unLocalizedNames.EnderGreenGlass);
	}
}
