package com.Fiskmans.modtest.Blocks;

import com.Fiskmans.modtest.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import com.Fiskmans.modtest.CreativTabs.CreativeTabMT;

/**
 * Created by manszivkovicandersen on 2015-01-12.
 */
public class BlockMT extends Block
{
    public BlockMT(Material material)
    {
        super(material);
    }

    public BlockMT()
    {
        this(Material.rock);
        this.setCreativeTab(CreativeTabMT.MT_TAB);
        this.setStepSound(soundTypeStone);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Reference.Mod_id.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }

}
