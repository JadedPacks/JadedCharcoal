package com.jadedpacks.jccharcoal;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.GameRegistry;

public class Natura {
	public static void init() {
		Item coal = GameRegistry.findItem("minecraft", "coal");
		ItemStack charcoal2 = new ItemStack(coal, 2, 1);
		ItemStack charcoal3 = new ItemStack(coal, 3, 1);
		ItemStack charcoal4 = new ItemStack(coal, 4, 1);
		if(Loader.isModLoaded("Natura")) {
			Item nlog1 = GameRegistry.findItem("Natura", "redwood");
			GameRegistry.addSmelting(new ItemStack(nlog1, 1, 0), charcoal4, 0.1F);
			GameRegistry.addSmelting(new ItemStack(nlog1, 1, 1), charcoal2, 0.1F);
			GameRegistry.addSmelting(GameRegistry.findItemStack("Natura", "willow", 1), charcoal4, 0.1F);
			Item nlog2 = GameRegistry.findItem("Natura", "tree");
			GameRegistry.addSmelting(new ItemStack(nlog2, 1, 0), charcoal3, 0.1F);
			GameRegistry.addSmelting(new ItemStack(nlog2, 1, 1), charcoal3, 0.1F);
			GameRegistry.addSmelting(new ItemStack(nlog2, 1, 2), charcoal3, 0.1F);
			GameRegistry.addSmelting(new ItemStack(nlog2, 1, 3), charcoal3, 0.1F);
			Item nlog3 = GameRegistry.findItem("Natura", "Rare Tree");
			GameRegistry.addSmelting(new ItemStack(nlog3, 1, 0), charcoal4, 0.1F);
			GameRegistry.addSmelting(new ItemStack(nlog3, 1, 1), charcoal4, 0.1F);
			GameRegistry.addSmelting(new ItemStack(nlog3, 1, 2), charcoal4, 0.1F);
			GameRegistry.addSmelting(new ItemStack(nlog3, 1, 3), charcoal4, 0.1F);
			GameRegistry.addSmelting(GameRegistry.findItemStack("Natura", "Dark Tree", 1), charcoal3, 0.1F);
		}
	}
}
