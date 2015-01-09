package com.Fiskmans.modtest.init;

import com.Fiskmans.modtest.item.itemMT;
import com.Fiskmans.modtest.item.ShadowBlade;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by manszivkovicandersen on 2015-01-07.
 */
public class Moditems
{
    public static final itemMT ShadowBlade = new ShadowBlade();

    public static void init()
    {
        GameRegistry.registerItem(ShadowBlade,"ShadowBlade");
    }
}
