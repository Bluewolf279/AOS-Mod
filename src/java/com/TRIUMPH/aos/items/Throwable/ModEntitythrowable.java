package com.TRIUMPH.aos.items.Throwable;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

/**
 * Created by Bluewolf on 24/12/2015.
 */
public class ModEntitythrowable extends EntityThrowable {

    public ModEntitythrowable(World world,double par1,double par2,double par3){
        super(world,par1,par2,par3);
    }

    public ModEntitythrowable(World world, EntityLivingBase entity){
        super(world,entity);
    }

    public ModEntitythrowable(World par2World) {
        super(par2World);
    }

    @Override
    protected void onImpact(MovingObjectPosition p_70184_1_) {
     System.out.println("Entity Landed");
    }
}
