package com.Fiskmans.modtest.init;

import com.Fiskmans.modtest.item.itemMT;
import com.Fiskmans.modtest.item.Shadowblade;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by manszivkovicandersen on 2015-01-07.
 */
public class Moditems
{
    public static final itemMT Shadowblade = new Shadowblade();

    public static void init()
    {
        GameRegistry.registerItem(Shadowblade,"Shadowblade");
    }
}
