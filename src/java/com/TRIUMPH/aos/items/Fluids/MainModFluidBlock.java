package com.TRIUMPH.aos.items.Fluids;

import com.TRIUMPH.aos.unLocalizedNames;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Bluewolf on 26/12/2015.
 * Fluid Block Base Class
 */
public class MainModFluidBlock {
    public static Block Nitroglycerin;
    public static void createFluidBlocks(){
        GameRegistry.registerBlock(Nitroglycerin = new ModBlockFluid(unLocalizedNames.FluidNitroglycerin,MainModFluid.Nitroglycerin, Material.water,295),unLocalizedNames.FluidNitroglycerin);
    }
}
