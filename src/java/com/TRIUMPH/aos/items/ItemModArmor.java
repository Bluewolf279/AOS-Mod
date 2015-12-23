package com.TRIUMPH.aos.items;

import net.minecraft.item.ItemArmor;

/**
 * Created by user on 21/12/2015.
 * Armor Constructor
 */
public class ItemModArmor extends ItemArmor{
    public ItemModArmor(String unlocalisedName,ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
        this.setUnlocalizedName(unlocalisedName);
        this.setCreativeTab(ModItems.AOStab);
    }
}
