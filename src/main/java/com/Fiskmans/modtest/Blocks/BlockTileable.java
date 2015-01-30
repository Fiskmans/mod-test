package com.Fiskmans.modtest.Blocks;


/**
 * Created by manszivkovicandersen on 2015-01-13.
 */
public class BlockTileable extends BlockMT
{
    public BlockTileable()
    {
        super();
        this.setBlockName("Tileable");
        this.setHardness(0.8F);
        this.setStepSound(soundTypeCloth);

    }
}
