package com.TRIUMPH.aos.fluids;

import com.TRIUMPH.aos.items.ModItems;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

/**
 * Created by Bluewolf on 26/12/2015.
 * fluid Constructor
 */
public class ModBlockFluid extends BlockFluidClassic {
    public ModBlockFluid(String unlocalizedname,Fluid fluid, Material material,int temperatureK) {
        super(fluid, material);
        this.setCreativeTab(ModItems.AOStab);
        this.setUnlocalizedName(unlocalizedname);
        this.setTemperature(temperatureK);
    }
}
