package com.jadedpacks.jccharcoal;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import com.jadedpacks.jadedbase.helpers.RecipeRemover;
import com.jadedpacks.jadedbase.helpers.Wood;

import cpw.mods.fml.common.registry.GameRegistry;

public class Forestry {
	public static void init() {
		Item coal = GameRegistry.findItem("minecraft", "coal");
		ItemStack charcoal2 = new ItemStack(coal, 2, 1);
		ItemStack charcoal3 = new ItemStack(coal, 3, 1);
		ItemStack charcoal4 = new ItemStack(coal, 4, 1);
		ItemStack charcoal5 = new ItemStack(coal, 5, 1);
		if((Wood.acacia != null)) {
			// stuff for new api
			RecipeRemover.removeFurnaceRecipe(Wood.acacia);
			RecipeRemover.removeFurnaceRecipe(Wood.balsa);
			RecipeRemover.removeFurnaceRecipe(Wood.baobab);
			RecipeRemover.removeFurnaceRecipe(Wood.cherry);
			RecipeRemover.removeFurnaceRecipe(Wood.chesnut);
			RecipeRemover.removeFurnaceRecipe(Wood.citrus);
			RecipeRemover.removeFurnaceRecipe(Wood.coco);
			RecipeRemover.removeFurnaceRecipe(Wood.ebony);
			RecipeRemover.removeFurnaceRecipe(Wood.greenheart);
			RecipeRemover.removeFurnaceRecipe(Wood.ipe);
			RecipeRemover.removeFurnaceRecipe(Wood.kapok);
			RecipeRemover.removeFurnaceRecipe(Wood.larch);
			RecipeRemover.removeFurnaceRecipe(Wood.lime);
			RecipeRemover.removeFurnaceRecipe(Wood.mahoe);
			RecipeRemover.removeFurnaceRecipe(Wood.maple);
			RecipeRemover.removeFurnaceRecipe(Wood.padauk);
			RecipeRemover.removeFurnaceRecipe(Wood.palm);
			RecipeRemover.removeFurnaceRecipe(Wood.papaya);
			RecipeRemover.removeFurnaceRecipe(Wood.zebra);
			RecipeRemover.removeFurnaceRecipe(Wood.willow);
			RecipeRemover.removeFurnaceRecipe(Wood.pine);
			RecipeRemover.removeFurnaceRecipe(Wood.plum);
			RecipeRemover.removeFurnaceRecipe(Wood.poplar);
			RecipeRemover.removeFurnaceRecipe(Wood.teak);
			RecipeRemover.removeFurnaceRecipe(Wood.walnut);
			RecipeRemover.removeFurnaceRecipe(Wood.giant);
			RecipeRemover.removeFurnaceRecipe(Wood.mahogany);
			RecipeRemover.removeFurnaceRecipe(Wood.sequoia);
			RecipeRemover.removeFurnaceRecipe(Wood.wenge);
			GameRegistry.addSmelting(Wood.acacia, charcoal2, 0.1F);
			GameRegistry.addSmelting(Wood.balsa, charcoal2, 0.1F);
			GameRegistry.addSmelting(Wood.baobab, charcoal2, 0.1F);
			GameRegistry.addSmelting(Wood.cherry, charcoal2, 0.1F);
			GameRegistry.addSmelting(Wood.chesnut, charcoal2, 0.1F);
			GameRegistry.addSmelting(Wood.citrus, charcoal2, 0.1F);
			GameRegistry.addSmelting(Wood.coco, charcoal2, 0.1F);
			GameRegistry.addSmelting(Wood.ebony, charcoal2, 0.1F);
			GameRegistry.addSmelting(Wood.greenheart, charcoal2, 0.1F);
			GameRegistry.addSmelting(Wood.ipe, charcoal2, 0.1F);
			GameRegistry.addSmelting(Wood.kapok, charcoal2, 0.1F);
			GameRegistry.addSmelting(Wood.larch, charcoal2, 0.1F);
			GameRegistry.addSmelting(Wood.lime, charcoal2, 0.1F);
			GameRegistry.addSmelting(Wood.mahoe, charcoal2, 0.1F);
			GameRegistry.addSmelting(Wood.maple, charcoal2, 0.1F);
			GameRegistry.addSmelting(Wood.padauk, charcoal2, 0.1F);
			GameRegistry.addSmelting(Wood.palm, charcoal2, 0.1F);
			GameRegistry.addSmelting(Wood.papaya, charcoal2, 0.1F);
			GameRegistry.addSmelting(Wood.zebra, charcoal3, 0.1F);
			GameRegistry.addSmelting(Wood.willow, charcoal3, 0.1F);
			GameRegistry.addSmelting(Wood.pine, charcoal3, 0.1F);
			GameRegistry.addSmelting(Wood.plum, charcoal3, 0.1F);
			GameRegistry.addSmelting(Wood.poplar, charcoal3, 0.1F);
			GameRegistry.addSmelting(Wood.teak, charcoal3, 0.1F);
			GameRegistry.addSmelting(Wood.walnut, charcoal3, 0.1F);
			GameRegistry.addSmelting(Wood.giant, charcoal4, 0.1F);
			GameRegistry.addSmelting(Wood.mahogany, charcoal4, 0.1F);
			GameRegistry.addSmelting(Wood.sequoia, charcoal5, 0.1F);
			GameRegistry.addSmelting(Wood.wenge, charcoal5, 0.1F);
		} else {
			Item flog1 = GameRegistry.findItem("Forestry", "log1");
			GameRegistry.addSmelting(new ItemStack(flog1, 1, 0), charcoal2, 0.1F);
			GameRegistry.addSmelting(new ItemStack(flog1, 1, 1), charcoal2, 0.1F);
			GameRegistry.addSmelting(new ItemStack(flog1, 1, 2), charcoal2, 0.1F);
			GameRegistry.addSmelting(new ItemStack(flog1, 1, 3), charcoal2, 0.1F);
			Item flog2 = GameRegistry.findItem("Forestry", "log2");
			GameRegistry.addSmelting(new ItemStack(flog2, 1, 0), charcoal2, 0.1F);
			GameRegistry.addSmelting(new ItemStack(flog2, 1, 1), charcoal2, 0.1F);
			GameRegistry.addSmelting(new ItemStack(flog2, 1, 2), charcoal2, 0.1F);
			GameRegistry.addSmelting(new ItemStack(flog2, 1, 3), charcoal2, 0.1F);
			Item flog3 = GameRegistry.findItem("Forestry", "log3");
			GameRegistry.addSmelting(new ItemStack(flog3, 1, 0), charcoal2, 0.1F);
			GameRegistry.addSmelting(new ItemStack(flog3, 1, 1), charcoal2, 0.1F);
			GameRegistry.addSmelting(new ItemStack(flog3, 1, 2), charcoal2, 0.1F);
			GameRegistry.addSmelting(new ItemStack(flog3, 1, 3), charcoal2, 0.1F);
			Item flog4 = GameRegistry.findItem("Forestry", "log4");
			GameRegistry.addSmelting(new ItemStack(flog4, 1, 0), charcoal2, 0.1F);
			GameRegistry.addSmelting(new ItemStack(flog4, 1, 1), charcoal2, 0.1F);
			GameRegistry.addSmelting(new ItemStack(flog4, 1, 2), charcoal2, 0.1F);
			GameRegistry.addSmelting(new ItemStack(flog4, 1, 3), charcoal2, 0.1F);
			Item flog5 = GameRegistry.findItem("Forestry", "log5");
			GameRegistry.addSmelting(new ItemStack(flog5, 1, 0), charcoal2, 0.1F);
			GameRegistry.addSmelting(new ItemStack(flog5, 1, 1), charcoal2, 0.1F);
			GameRegistry.addSmelting(new ItemStack(flog5, 1, 2), charcoal2, 0.1F);
			GameRegistry.addSmelting(new ItemStack(flog5, 1, 3), charcoal2, 0.1F);
			Item flog6 = GameRegistry.findItem("Forestry", "log6");
			GameRegistry.addSmelting(new ItemStack(flog6, 1, 0), charcoal3, 0.1F);
			GameRegistry.addSmelting(new ItemStack(flog6, 1, 1), charcoal3, 0.1F);
			GameRegistry.addSmelting(new ItemStack(flog6, 1, 2), charcoal3, 0.1F);
			GameRegistry.addSmelting(new ItemStack(flog6, 1, 3), charcoal3, 0.1F);
			Item flog7 = GameRegistry.findItem("Forestry", "log7");
			GameRegistry.addSmelting(new ItemStack(flog7, 1, 0), charcoal3, 0.1F);
			GameRegistry.addSmelting(new ItemStack(flog7, 1, 1), charcoal3, 0.1F);
			GameRegistry.addSmelting(new ItemStack(flog7, 1, 2), charcoal3, 0.1F);
			GameRegistry.addSmelting(new ItemStack(flog7, 1, 3), charcoal3, 0.1F);
		}
		JadedCharcoal.log.info("Jaded made logs require different axes and give more charcoal");
	}
}