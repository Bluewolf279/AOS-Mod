package com.TRIUMPH.aos.items.Fluids;

import com.TRIUMPH.aos.Main;
import com.TRIUMPH.aos.unLocalizedNames;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

/**
 * Created by Bluewolf on 26/12/2015.
 * Fluid Base class
 */
public class MainModFluid {
    public static String MODID = Main.MODID;
    public static Fluid Nitroglycerin;
    public static ResourceLocation ResNitroglycerinStill = new ResourceLocation(MODID+":");
    public static void createFluids(){
        FluidRegistry.registerFluid(Nitroglycerin=new ModFluid(unLocalizedNames.FluidNitroglycerin, new ResourceLocation("blocks/lava_still"),new ResourceLocation("blocks/lava_flow"),0xff00ff00,295,3000));

    }

}
