package com.Fiskmans.modtest.utility;


import com.Fiskmans.modtest.reference.Reference;
import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

/**
 * Created by manszivkovicandersen on 2015-01-07.
 */
public class loghelper {
    public static void log(Level LogLevel,Object object)
    {
        FMLLog.log(Reference.Mod_id, LogLevel,String.valueOf(object));
    }

    public static void all(Object object) {log(Level.ALL, object);}

    public static void debug(Object object) {log(Level.DEBUG, object);}

    public static void error(Object object) {log(Level.ERROR, object);}

    public static void fatal(Object object) {log(Level.FATAL, object);}

    public static void info(Object object) {log(Level.INFO, object);}

    public static void off(Object object) {log(Level.OFF, object);}

    public static void trace(Object object) {log(Level.TRACE, object);}

    public static void warn(Object object) {log(Level.WARN, object);}

}
