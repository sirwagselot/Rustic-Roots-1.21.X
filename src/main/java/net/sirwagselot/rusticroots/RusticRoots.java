package net.sirwagselot.rusticroots;

import net.fabricmc.api.ModInitializer;
import net.sirwagselot.rusticroots.block.ModBlocks;
import net.sirwagselot.rusticroots.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RusticRoots implements ModInitializer {
	public static final String MOD_ID = "rusticroots";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
	}
}