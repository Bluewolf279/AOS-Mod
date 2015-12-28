package com.TRIUMPH.aos.fluids;

import com.TRIUMPH.aos.unLocalizedNames;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Bluewolf on 26/12/2015.
 * fluid Block Base Class
 */
public class MainModFluidBlock {
    public static Block Nitroglycerin;
    public static void createFluidBlocks(){
        GameRegistry.registerBlock(Nitroglycerin = new Nitroglycerin(unLocalizedNames.FluidNitroglycerin,MainModFluid.Nitroglycerin),unLocalizedNames.FluidNitroglycerin);
    }
}
