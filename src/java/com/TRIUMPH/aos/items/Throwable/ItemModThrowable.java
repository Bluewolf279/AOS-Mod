package com.TRIUMPH.aos.items.Throwable;

import com.TRIUMPH.aos.items.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by Bluewolf on 24/12/2015.
 */
public class ItemModThrowable extends Item {
    public ItemModThrowable(String unlocalizedName) {
        super();
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(ModItems.AOStab);
    }
    @Override
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack itemStack){
        return true;
    }
   public ItemStack onItemRightClick(ItemStack itemStack, World par2World, EntityPlayer par3EntityPlayer){
       if(!par2World.isRemote){
           par2World.spawnEntityInWorld(new ModEntitythrowable(par2World,par3EntityPlayer));
           --itemStack.stackSize;
       }
       return itemStack;
   }
}

