package com.TRIUMPH.aos.blocks;

import com.TRIUMPH.aos.items.ModItems;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;

import java.util.Random;

public class BasicGlass extends BlockGlass {
	private static boolean ignoreSimilarity;

	public BasicGlass(String unlocalizedName, Material material, float hardness, float resistance) {
		super(material, ignoreSimilarity);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(ModItems.AOStab);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setLightOpacity(1);
		this.getHarvestTool(null);
		this.quantityDropped(RANDOM);
	}
	public BasicGlass(String unlocalizedName, float hardness, float resistance) {
		this(unlocalizedName, Material.rock, hardness, resistance);
	}

	public BasicGlass(String unlocalizedName) {
		this(unlocalizedName, 1.0f, 10.0f);
	}
	@Override
    public int quantityDropped(Random random)
    {
        return 1;
    }
}
