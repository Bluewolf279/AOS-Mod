package com.TRIUMPH.aos.items;

import net.minecraft.item.Item;

public class BasicItem extends Item{

	public BasicItem(String unlocalizedName) {
		super();
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(ModItems.AOStab);
	}
}
