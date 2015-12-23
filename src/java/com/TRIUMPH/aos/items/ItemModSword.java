package com.TRIUMPH.aos.items;

import net.minecraft.item.ItemSword;

public class ItemModSword extends ItemSword{
	public ItemModSword(String unlocalizedName,ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(ModItems.AOStab);
	}
}
