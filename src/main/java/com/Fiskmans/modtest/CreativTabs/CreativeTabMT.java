package com.Fiskmans.modtest.CreativTabs;

import com.Fiskmans.modtest.init.Moditems;
import com.Fiskmans.modtest.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by manszivkovicandersen on 2015-01-15.
 */


public class CreativeTabMT
{
    public static final CreativeTabs MT_TAB = new CreativeTabs(0, Reference.Mod_id)
    {
        @Override
        public Item getTabIconItem()
        {
            return Moditems.ShadowBlade;
        }

        @Override
        public String getTranslatedTabLabel()
        {
            return "mod test" + this.getTabLabel();
        }


    };


}
