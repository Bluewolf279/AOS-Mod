package com.TRIUMPH.aos.items.Fluids;

import com.TRIUMPH.aos.unLocalizedNames;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

/**
 * Created by Bluewolf on 26/12/2015.
 * fluid Base class
 */
public class MainModFluid {
    public static Fluid Nitroglycerin;
    public static void createFluids(){
        FluidRegistry.registerFluid(Nitroglycerin=new ModFluid(unLocalizedNames.FluidNitroglycerin,0xffffafaf,295,3000));
    }
    public int hexToInt(String hex){
        int value = Integer.parseInt(hex, 16);
        return value;
    }

}
