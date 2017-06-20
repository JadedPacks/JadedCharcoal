package com.jadedpacks.jccharcoal;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import com.jadedpacks.jadedbase.helpers.Parts;
import com.jadedpacks.jadedbase.helpers.RecipeRemover;
import com.jadedpacks.jadedbase.helpers.Wood;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;

public class ThermalExpansion {
	public static void init() {
		ItemStack charcoal2 = new ItemStack(Items.coal, 2, 1);
		ItemStack charcoal3 = new ItemStack(Items.coal, 3, 1);
		ItemStack charcoal4 = new ItemStack(Items.coal, 4, 1);
		RecipeRemover.changeThermalExpansionFurnaceRecipe(Parts.oak, charcoal2, 1600);
		RecipeRemover.changeThermalExpansionFurnaceRecipe(Parts.birch, charcoal2, 1600);
		RecipeRemover.changeThermalExpansionFurnaceRecipe(Parts.jungle, charcoal3, 1600);
		RecipeRemover.changeThermalExpansionFurnaceRecipe(Parts.spruce, charcoal3, 1600);
		RecipeRemover.changeThermalExpansionFurnaceRecipe(Parts.acacia, charcoal4, 1600);
		RecipeRemover.changeThermalExpansionFurnaceRecipe(Parts.darkoak, charcoal4, 1600);
		JadedCharcoal.log.info("Jaded Vanilla Furnace tweaks loaded");
		if(Loader.isModLoaded("Forestry")) {
			RecipeRemover.changeThermalExpansionFurnaceRecipe(Wood.acacia, charcoal2, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(Wood.balsa, charcoal2, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(Wood.baobab, charcoal2, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(Wood.cherry, charcoal2, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(Wood.chesnut, charcoal2, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(Wood.citrus, charcoal2, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(Wood.coco, charcoal2, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(Wood.ebony, charcoal2, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(Wood.giant, charcoal2, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(Wood.greenheart, charcoal2, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(Wood.ipe, charcoal2, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(Wood.kapok, charcoal2, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(Wood.larch, charcoal2, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(Wood.lime, charcoal2, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(Wood.mahoe, charcoal2, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(Wood.mahogany, charcoal2, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(Wood.maple, charcoal2, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(Wood.padauk, charcoal2, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(Wood.palm, charcoal2, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(Wood.papaya, charcoal2, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(Wood.pine, charcoal2, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(Wood.pine, charcoal3, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(Wood.plum, charcoal3, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(Wood.poplar, charcoal3, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(Wood.sequoia, charcoal3, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(Wood.teak, charcoal3, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(Wood.walnut, charcoal3, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(Wood.wenge, charcoal3, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(Wood.willow, charcoal3, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(Wood.zebra, charcoal3, 1600);
		}
		if(Loader.isModLoaded("Natura")) {
			Item nlog1 = GameRegistry.findItem("Natura", "redwood");
			RecipeRemover.changeThermalExpansionFurnaceRecipe(new ItemStack(nlog1, 1, 0), charcoal4, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(new ItemStack(nlog1, 1, 1), charcoal2, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(GameRegistry.findItemStack("Natura", "willow", 1), charcoal4, 1600);
			Item nlog2 = GameRegistry.findItem("Natura", "tree");
			RecipeRemover.changeThermalExpansionFurnaceRecipe(new ItemStack(nlog2, 1, 0), charcoal4, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(new ItemStack(nlog2, 1, 1), charcoal4, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(new ItemStack(nlog2, 1, 2), charcoal4, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(new ItemStack(nlog2, 1, 3), charcoal4, 1600);
			Item nlog3 = GameRegistry.findItem("Natura", "Rare Tree");
			RecipeRemover.changeThermalExpansionFurnaceRecipe(new ItemStack(nlog3, 1, 0), charcoal4, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(new ItemStack(nlog3, 1, 1), charcoal4, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(new ItemStack(nlog3, 1, 2), charcoal4, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(new ItemStack(nlog3, 1, 3), charcoal4, 1600);
			RecipeRemover.changeThermalExpansionFurnaceRecipe(GameRegistry.findItemStack("Natura", "Dark Tree", 1), charcoal3, 1600);
		}
		JadedCharcoal.log.info("Jaded changed the charcoal output of Natura logs");
	}
}