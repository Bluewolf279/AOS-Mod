package com.TRIUMPH.aos;

import com.TRIUMPH.aos.blocks.ModBlocks;
import com.TRIUMPH.aos.crafting.ModCrafting;
import com.TRIUMPH.aos.fluids.MainModFluid;
import com.TRIUMPH.aos.fluids.MainModFluidBlock;
import com.TRIUMPH.aos.items.ModItems;
import com.TRIUMPH.aos.world.AOSWorldGen;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent e) {
		ModItems.createItem();
		ModBlocks.createBlock();
		MainModFluid.createFluids();
		MainModFluidBlock.createFluidBlocks();
	}

	public void init(FMLInitializationEvent e) {
		ModCrafting.initCrafting();
		ModCrafting.initSmelting();
		GameRegistry.registerWorldGenerator(new AOSWorldGen(), 0);
	}

	public void postInit(FMLPostInitializationEvent e) {

	}

}
