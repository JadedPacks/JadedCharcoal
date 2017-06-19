package com.jadedpacks.jccharcoal;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.jadedpacks.jadedbase.helpers.Parts;
import com.jadedpacks.jadedbase.helpers.RecipeRemover;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.ItemStackHolderInjector;

@Mod(modid = "jccharcoal", version = "@VERSION@", name = "JadedCharcoal", dependencies = "required-after:Forge@[10.13.3.1384,11.14);required-after:JCBase;after:ThermalExpansion;after:Forestry;after:Natura;")
public class JadedCharcoal {
	public static final Logger log = LogManager.getLogger("JadedCharcoal");

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		if(Loader.isModLoaded("Forestry")) {
			Forestry.init();
		}
		if(Loader.isModLoaded("Natura")) {
			Natura.init();
		}
		if(Loader.isModLoaded("ThermalExpansion")) {
			ThermalExpansion.init();
		}
		Item coal = GameRegistry.findItem("minecraft", "coal");
		ItemStack charcoal = new ItemStack(coal, 1, 1);
		ItemStack charcoal2 = new ItemStack(coal, 2, 1);
		ItemStack charcoal3 = new ItemStack(coal, 3, 1);
		ItemStack charcoal4 = new ItemStack(coal, 4, 1);
		RecipeRemover.removeFurnaceRecipe(charcoal);
		GameRegistry.addSmelting(Parts.oak, charcoal2, 0.1F);
		GameRegistry.addSmelting(Parts.birch, charcoal2, 0.1F);
		GameRegistry.addSmelting(Parts.jungle, charcoal3, 0.1F);
		GameRegistry.addSmelting(Parts.spruce, charcoal3, 0.1F);
		GameRegistry.addSmelting(Parts.acacia, charcoal4, 0.1F);
		GameRegistry.addSmelting(Parts.darkoak, charcoal4, 0.1F);
		ItemStackHolderInjector.INSTANCE.inject();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		RecipeRemover.removeFurnaceRecipe(Parts.charcoal);
	}
}