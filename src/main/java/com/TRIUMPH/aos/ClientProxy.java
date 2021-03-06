package com.TRIUMPH.aos;


import com.TRIUMPH.aos.client.render.Fluid.FluidRenderRegister;
import com.TRIUMPH.aos.client.render.blocks.BlockRenderRegister;

import com.TRIUMPH.aos.client.render.items.ItemRenderRegister;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit(FMLPreInitializationEvent e) {
		super.preInit(e);
		FluidRenderRegister.RegisterFluidsRender();
	}
	@Override
	public void init(FMLInitializationEvent e) {
		super.init(e);

		BlockRenderRegister.registerBlockRenderer();

		ItemRenderRegister.registerItemRenderer();

	}
	@Override
	public void postInit(FMLPostInitializationEvent e) {
		super.postInit(e);
	}
}
