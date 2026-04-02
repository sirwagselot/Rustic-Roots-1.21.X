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
import net.sirwagselot.rusticroots.block.custom.LeekCropBlock;
import net.sirwagselot.rusticroots.block.custom.TomatoCropBlock;
import net.sirwagselot.rusticroots.block.custom.OnionCropBlock;

public class ModBlocks {
    public static final Block TOMATO_CROP = registerCropBlock("tomato_crop", new TomatoCropBlock(
            AbstractBlock.Settings.copy(Blocks.WHEAT)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RusticRoots.MOD_ID, "tomato_crop")))
    ));

    public static final Block LEEK_CROP = registerCropBlock("leek_crop", new LeekCropBlock(
            AbstractBlock.Settings.copy(Blocks.WHEAT)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RusticRoots.MOD_ID, "leek_crop")))
    ));

    public static final Block ONION_CROP = registerCropBlock("onion_crop", new OnionCropBlock(
            AbstractBlock.Settings.copy(Blocks.WHEAT)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RusticRoots.MOD_ID, "onion_crop")))
    ));
    private static Block registerCropBlock(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(RusticRoots.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        RusticRoots.LOGGER.info("Registering Mod Blocks for " + RusticRoots.MOD_ID);
    }
}