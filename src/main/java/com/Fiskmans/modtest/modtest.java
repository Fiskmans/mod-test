package com.Fiskmans.modtest;


/* Created by manszivkovicandersen on 2015-01-06.*/
import com.Fiskmans.modtest.configuration.configurationhandeler;
import com.Fiskmans.modtest.proxy.iProxy;
import com.Fiskmans.modtest.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.Mod_id,name = Reference.Mod_name,version = Reference.Mod_version)
public class modtest
{



    @Mod.Instance(Reference.Mod_id)
    public static modtest instance;

    @SidedProxy(clientSide = Reference.Mod_clientproxy,serverSide = Reference.Mod_serverproxy)
    public static iProxy proxy;

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
        configurationhandeler.init(event.getSuggestedConfigurationFile());
    }


    @Mod.EventHandler
    public void durinit(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {

    }


}
