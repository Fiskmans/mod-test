package com.Fiskmans.modtest.configuration;

import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by manszivkovicandersen on 2015-01-06.
 */
public class configurationhandeler
{
    public static void init(File configfile)
    {
        Configuration configuration = new Configuration(configfile);
        boolean configvalue = false;

        try
        {
            configuration.load();

            configuration.get(Configuration.CATEGORY_GENERAL, "configvalue", true, "test value").getBoolean(true);
        }
        catch (Exception e)
        {

        }
        finally
        {
            configuration.save();
        }
        System.out.println(configvalue);
    }
}
