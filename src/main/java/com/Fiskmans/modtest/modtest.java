package com.Fiskmans.modtest;


/* Created by manszivkovicandersen on 2015-01-06.*/

import com.Fiskmans.modtest.handler.configurationhandler;
import com.Fiskmans.modtest.init.ModBlocks;
import com.Fiskmans.modtest.init.Moditems;
import com.Fiskmans.modtest.proxy.iProxy;
import com.Fiskmans.modtest.reference.Reference;
import com.Fiskmans.modtest.utility.loghelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.Mod_id,name = Reference.Mod_name,version = Reference.Mod_version,guiFactory = Reference.Mod_guiFactoryClass)
public class modtest
{



    @Mod.Instance(Reference.Mod_id)
    public static modtest instance;

    @SidedProxy(clientSide = Reference.Mod_clientproxy,serverSide = Reference.Mod_serverproxy)
    public static iProxy proxy;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
        configurationhandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new configurationhandler());


        Moditems.init();

        ModBlocks.init();
        loghelper.info("preinit completed");
    }


    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        loghelper.info("init completed");
    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {
        loghelper.info("postinit completed");
    }


}
