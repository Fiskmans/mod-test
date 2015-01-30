package com.Fiskmans.modtest.init;

import com.Fiskmans.modtest.Blocks.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.BlockAir;

/**
 * Created by manszivkovicandersen on 2015-01-12.
 */
public class ModBlocks
{
    public static final BlockMT BlockSocket = new BlockSocket();
    public static final BlockMT BlockSocketEXT = new BlockSocketEXT();
    public static final BlockMT BlockTileable = new BlockTileable();
    public static final BlockMT BlockGreencrystal = new BlockGreencrystal();
    public static final BlockAir BlockHive = new BlockHive();
    public static final BlockAir BlockHiveSlot = new BlockHiveSlot();



    public static void init()
    {
        GameRegistry.registerBlock(BlockSocket, "BlockSocket");
        GameRegistry.registerBlock(BlockSocketEXT, "BlockSocketEXT");
        GameRegistry.registerBlock(BlockTileable, "BlockTileable");
        GameRegistry.registerBlock(BlockGreencrystal, "BlockGreencrystal");
        GameRegistry.registerBlock(BlockHive, "BlockHive");
        GameRegistry.registerBlock(BlockHiveSlot, "BlockHiveSlot");

    }
}