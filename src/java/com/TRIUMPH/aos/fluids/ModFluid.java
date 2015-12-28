package com.TRIUMPH.aos.fluids;

import com.TRIUMPH.aos.Main;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

/**
 * Created by Bluewolf on 26/12/2015.
 * ModFluid Constructor
 */
public class ModFluid extends Fluid{

        private int fluidColor;
        public ModFluid(String fluidName, int Color,int temperatureK,int viscosity){

            super(fluidName, new ResourceLocation(Main.MODID+":blocks/fluid/"+fluidName+"_still"),new ResourceLocation(Main.MODID+":blocks/fluid/"+fluidName+"_flow"));
            System.out.println(fluidName.toLowerCase());
            this.setTemperature(temperatureK);
            this.setViscosity(viscosity);
            fluidColor = Color;
        }
        public ModFluid(String fluidName, ResourceLocation still, ResourceLocation flowing, int Color,int temperatureK,int viscosity){
            super(fluidName, still, flowing);
            System.out.println(fluidName.toLowerCase());
            this.setTemperature(temperatureK);
            this.setViscosity(viscosity);
            fluidColor = Color;
        }



    @Override
        public int getColor () {
            return fluidColor;
        }
}
