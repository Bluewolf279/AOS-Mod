package com.TRIUMPH.aos;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Main.MODID, name = Main.MODNAME, version = Main.VERSION)
//TODO ADD LIQUID TNT
//TODO ADD BABY DOG THAT TURNS INTO A CREEPER WHEN HURT
//TODO ADD RANDOM FLOTING PIXELART
public class Main {
	public static final String MODID = "aos";
	public static final String MODNAME = "aos Mod";
	public static final String VERSION = "0.1";

	@Instance
	public static Main instance = new Main();

	@SidedProxy(clientSide="com.TRIUMPH.aos.ClientProxy", serverSide="com.TRIUMPH.aos.ServerProxy")
	public static CommonProxy proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		Main.proxy.preInit(e);
	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		Main.proxy.init(e);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		Main.proxy.postInit(e);
	}
}
