package com.TRIUMPH.aos.fluids;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

/**
 * Created by Bluewolf on 7/01/2016.
 */
public class NitroglycerinEntity extends Entity {
    public int fuse;

    public NitroglycerinEntity(World worldIn)
    {
        super(worldIn);
        this.preventEntitySpawning = true;
        this.setSize(0.0F, 0.0F);
    }

    public NitroglycerinEntity(World worldIn, double p_i1730_2_, double p_i1730_4_, double p_i1730_6_, EntityLivingBase p_i1730_8_)
    {
        this(worldIn);
        this.setPosition(p_i1730_2_, p_i1730_4_, p_i1730_6_);
        this.fuse = 80;
    }

    protected void entityInit() {}

    public boolean canBeCollidedWith()
    {
        return !this.isDead;
    }

    public void onUpdate()
    {

        if (this.fuse-- <= 0)
        {
            this.setDead();

            if (!this.worldObj.isRemote)
            {
                this.explode();
            }
        }
    }

    private void explode()
    {
        float f = 5.0F;
        this.worldObj.createExplosion(this, this.posX, this.posY + (double)(this.height / 2.0F), this.posZ, f, true);
    }

    protected void writeEntityToNBT(NBTTagCompound tagCompound)
    {
        tagCompound.setByte("Fuse", (byte)this.fuse);
    }

    protected void readEntityFromNBT(NBTTagCompound tagCompund)
    {
        this.fuse = tagCompund.getByte("Fuse");
    }

    public float getEyeHeight()
    {
        return 0.0F;
    }
}
