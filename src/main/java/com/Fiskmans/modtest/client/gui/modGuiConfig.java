package com.Fiskmans.modtest.client.gui;

import com.Fiskmans.modtest.handler.configurationhandler;
import com.Fiskmans.modtest.reference.Reference;
import cpw.mods.fml.client.config.GuiConfig;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

/**
 * Created by manszivkovicandersen on 2015-01-07.
 */
public class modGuiConfig extends GuiConfig
{
    public modGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen,
                new ConfigElement(configurationhandler.configuration.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                Reference.Mod_id,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(configurationhandler.configuration.toString())
        );

    }
}
