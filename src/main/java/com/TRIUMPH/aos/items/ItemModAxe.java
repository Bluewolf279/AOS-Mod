package com.TRIUMPH.aos.items;

import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemSpade;

/**
 * Created by Bluewolf on 21/12/2015.
 * This is a pickaxe constructor
 */
public class ItemModAxe extends ItemAxe{
    public ItemModAxe(String unlocalisedName, ToolMaterial Material){
        super(Material);
        this.setUnlocalizedName(unlocalisedName);
        this.setCreativeTab(ModItems.AOStab);

    }
}
