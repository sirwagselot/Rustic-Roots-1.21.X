package net.sirwagselot.rusticroots.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.sirwagselot.rusticroots.RusticRoots;
import net.sirwagselot.rusticroots.block.custom.TomatoCropBlock;

public class ModBlocks {
    public static final Block TOMATO_CROP = registerBlockWithoutItem("tomato_crop");

    private static Block registerBlockWithoutItem(String name) {
        Identifier id = Identifier.of(RusticRoots.MOD_ID, name);

        Block block = new TomatoCropBlock(
                AbstractBlock.Settings.copy(Blocks.WHEAT)
                        .registryKey(RegistryKey.of(RegistryKeys.BLOCK, id))
        );

        return Registry.register(Registries.BLOCK, id, block);
    }

    public static void registerModBlocks() {
        RusticRoots.LOGGER.info("Registering Mod Blocks for " + RusticRoots.MOD_ID);
    }
}