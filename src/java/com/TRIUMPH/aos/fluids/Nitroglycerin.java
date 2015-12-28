package com.TRIUMPH.aos.fluids;

import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.fluids.Fluid;

/**
 * Created by Bluewolf on 28/12/2015.
 * Liquid Nitroglycerin block
 */
public class Nitroglycerin extends ModBlockFluid{

    public Nitroglycerin(String unlocalizedname, Fluid fluid) {
        super(unlocalizedname, fluid, Material.water, 295);
    }

    public void onBlockDestroyedByExplosion(World worldIn, BlockPos pos, Explosion explosionIn)
    {
        if (!worldIn.isRemote)
        {
            worldIn.newExplosion((Entity)null, (double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, 3.0F, false, true);
        }
    }

    public boolean canDropFromExplosion(Explosion explosionIn)
    {
        return false;
    }

}
