package net.glipr.vowmod;

import net.fabricmc.api.ModInitializer;

import net.glipr.vowmod.block.ModBlocks;
import net.glipr.vowmod.block.entity.ModBlockEntities;
import net.glipr.vowmod.item.ModItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VowMod implements ModInitializer {
	public static final String MOD_ID = "vowmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();
		ModBlockEntities.registerBlockEntities();
	}
}