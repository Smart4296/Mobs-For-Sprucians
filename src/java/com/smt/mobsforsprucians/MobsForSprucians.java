package com.smt.mobsforsprucians;

import com.smt.mobsforsprucians.proxies.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

@Mod(modid = MobsForSprucians.MODID, name = MobsForSprucians.MODNAME, version = MobsForSprucians.VERSION)
public class MobsForSprucians {

	public static final String MODID = "mobsforsprucians";
	public static final String MODNAME = "Mobs For Sprucians";
	public static final String VERSION = "1.0.0";
	
	@Instance
	public static MobsForSprucians instance = new MobsForSprucians();
	
	@SidedProxy(clientSide="com.smt.mobsforsprucians.proxies.ClientProxy", serverSide="com.smt.mobsforsprucians.proxies.ServerProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void serverStart(FMLServerStartingEvent e) {
		proxy.serverStart(e);
	}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}
}
