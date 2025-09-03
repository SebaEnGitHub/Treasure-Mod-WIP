package net.seba.treasuremod;

import net.fabricmc.api.ModInitializer;

import net.seba.treasuremod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TreasureMod implements ModInitializer {
    public static final String MOD_ID = "treasuremod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
	}
}