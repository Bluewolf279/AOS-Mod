package com.TRIUMPH.aos.blocks;

import com.TRIUMPH.aos.items.ModItems;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

/**
 * Created by Bluewolf on 23/12/2015.
 * fluid Constructor
 * Non Functional
 * TODO MAKE FLUID CONSTRUCTOR FUNCTIONAL
 */
public class BasicFluid extends BlockFluidClassic{
    /**@SideOnly(Side.CLIENT)
    protected IIconCreator stillIcon;
    @SideOnly(Side.CLIENT)
    protected IIcon flowingIcon;
     */
    public BasicFluid(Fluid fluid, Material material, String unlocalizedName){
        super(fluid,material);
        this.setCreativeTab(ModItems.AOStab);
        this.setUnlocalizedName(unlocalizedName);

    }
    /**@Override
    public IIcon getIcon(int side,int meta){
        return (side == 0|| side == 1)?stillIcon:flowingIcon;
    }*/
}
