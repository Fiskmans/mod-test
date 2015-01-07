package com.Fiskmans.modtest.handler;

import com.Fiskmans.modtest.reference.Reference;
import com.google.common.eventbus.Subscribe;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by manszivkovicandersen on 2015-01-06.
 *
 */
public class configurationhandler
{

    public static Configuration configuration;
    public static boolean testValue;


    public static void init(File configfile)
    {
        if(configuration == null){
            configuration = new Configuration(configfile);
            loadconfiguration();
        }
    }




    @SubscribeEvent
    public void OnConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.modID.equalsIgnoreCase(Reference.Mod_id))
        {
            loadconfiguration();
        }

    }

    private static void loadconfiguration()
    {
        testValue = configuration.getBoolean("configvalue",Configuration.CATEGORY_GENERAL,false, "example value");

        if(configuration.hasChanged())
        {
            configuration.save();
        }

    }


}