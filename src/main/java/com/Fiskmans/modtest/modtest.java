package com.Fiskmans.modtest;


/* Created by manszivkovicandersen on 2015-01-06.*/

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = "modtest",name = "mod test",version = "1.7.10-1.0")
public class modtest
{



    @Mod.Instance("modtest")
    public static modtest instance

    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {

    }


    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {

    }


}
