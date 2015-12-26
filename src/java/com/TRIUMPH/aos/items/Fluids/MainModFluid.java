package com.TRIUMPH.aos.items.Fluids;

import com.TRIUMPH.aos.unLocalizedNames;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

/**
 * Created by Bluewolf on 26/12/2015.
 * Fluid Base class
 */
public class MainModFluid {
    public static Fluid Nitroglycerin;
    public static void createFluids(){
        FluidRegistry.registerFluid(Nitroglycerin=new ModFluid(unLocalizedNames.FluidNitroglycerin, new ResourceLocation("blocks/water_still"),new ResourceLocation("blocks/water_flow"),0xff00ff00,295,3000));
    }

}
