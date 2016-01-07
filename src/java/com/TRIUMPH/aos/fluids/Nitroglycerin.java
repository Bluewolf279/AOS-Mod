package com.TRIUMPH.aos.fluids;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.fluids.Fluid;

import java.util.Random;

/**
 * Created by Bluewolf on 28/12/2015.
 * Liquid Nitroglycerin block
 */
public class Nitroglycerin extends ModBlockFluid{

    public Nitroglycerin(String unlocalizedname, Fluid fluid) {
        super(unlocalizedname, fluid, Material.water, 295);
        this.setDensity(1000);
    }

    public void onBlockDestroyedByExplosion(World worldIn, BlockPos pos, Explosion explosionIn)
    {
        if (!worldIn.isRemote)
        {
            int ticks = 0;
            if(ticks %20 == 0){
                NitroglycerinEntity entitytntprimed = new NitroglycerinEntity(worldIn, (double)((float)pos.getX() + 0.5F), (double)((float)pos.getY() + 0.5F), (double)((float)pos.getZ() + 0.5F), explosionIn.getExplosivePlacedBy());
                entitytntprimed.fuse = worldIn.rand.nextInt(entitytntprimed.fuse / 4) + entitytntprimed.fuse / 8;
                worldIn.spawnEntityInWorld(entitytntprimed);

                // worldIn.newExplosion((Entity)null, (double)pos.getX() + 0.5D, (double)pos.getY() + 0.5D, (double)pos.getZ() + 0.5D, 3.0F, false, true);
            }

        }
    }

    public boolean canDropFromExplosion(Explosion explosionIn)
    {
        return false;
    }

    public void randomTick(World worldIn, BlockPos pos, IBlockState state, Random random) {
        //System.out.println("random tick");
    }

}
