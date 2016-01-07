package com.TRIUMPH.aos.items;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.ItemBucket;

/**
 * Created by Bluewolf on 28/12/2015.
 * Bucket Constructor
 */
public class ItemModBucket extends ItemBucket{
    public ItemModBucket(String unlocalizedName,Block containedBlock) {
        super(containedBlock);
        this.setUnlocalizedName(unlocalizedName);
        this.setCreativeTab(ModItems.AOStab);
        this.setContainerItem(Items.bucket);
    }
}
