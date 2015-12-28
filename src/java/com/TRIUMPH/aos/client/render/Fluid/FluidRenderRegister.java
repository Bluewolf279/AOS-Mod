package com.TRIUMPH.aos.client.render.Fluid;

import com.TRIUMPH.aos.Main;
import com.TRIUMPH.aos.fluids.MainModFluidBlock;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.client.resources.model.ModelBakery;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;

/**
 * Created by Bluewolf on 26/12/2015.
 *AOS fluid registry file
 */
public class FluidRenderRegister {
    public static String MODID = Main.MODID;

    public static void RegisterFluidsRender(){
        regFluid(MainModFluidBlock.Nitroglycerin);

    }
    //
    public static void regFluid(Block fluidBlock){
        ModelResourceLocation fluidLocation = new ModelResourceLocation(MODID+":"+fluidBlock.getUnlocalizedName().substring(5));
        Item itmFluid = Item.getItemFromBlock(fluidBlock);
        ModelBakery.addVariantName(itmFluid);
        ModelLoader.setCustomMeshDefinition(itmFluid, new ItemMeshDefinition() {
            public ModelResourceLocation getModelLocation(ItemStack stack) {
                return fluidLocation;
            }
        });
        ModelLoader.setCustomStateMapper(fluidBlock, new StateMapperBase() {
            @Override
            protected ModelResourceLocation getModelResourceLocation(IBlockState p_178132_1_) {
                return fluidLocation;
            }
        });
    }
}
