package com.TRIUMPH.aos.items.Fluids;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

/**
 * Created by Bluewolf on 26/12/2015.
 */
public class ModFluid extends Fluid{

        private int fluidColor;

        public ModFluid(String fluidName, ResourceLocation still, ResourceLocation flowing, int Color,int temperatureK,int viscosity){
            super(fluidName, still, flowing);
            this.setTemperature(temperatureK);
            this.setViscosity(viscosity);
            fluidColor = Color;
        }
        @Override
        public int getColor () {
            return fluidColor;
        }
}
