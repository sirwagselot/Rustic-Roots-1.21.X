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
import net.sirwagselot.rusticroots.block.custom.GarlicCropBlock;
import net.sirwagselot.rusticroots.block.custom.PeaCropBlock;
import net.sirwagselot.rusticroots.block.custom.TurnipCropBlock;
import net.sirwagselot.rusticroots.block.custom.ChiliCropBlock;
import net.sirwagselot.rusticroots.block.custom.BellPepperCropBlock;
import net.sirwagselot.rusticroots.block.custom.BroccoliCropBlock;
import net.sirwagselot.rusticroots.block.custom.CornCropBlock;
import net.sirwagselot.rusticroots.block.custom.CucumberCropBlock;
import net.sirwagselot.rusticroots.block.custom.EggplantCropBlock;
import net.sirwagselot.rusticroots.block.custom.CauliflowerCropBlock;
import net.sirwagselot.rusticroots.block.custom.GreencabbageCropBlock;
import net.sirwagselot.rusticroots.block.custom.PurplecabbageCropBlock;
import net.sirwagselot.rusticroots.block.custom.LettuceCropBlock;
import net.sirwagselot.rusticroots.block.custom.LemonLeavesBlock;

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

    public static final Block GARLIC_CROP = registerCropBlock("garlic_crop", new GarlicCropBlock(
            AbstractBlock.Settings.copy(Blocks.WHEAT)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RusticRoots.MOD_ID, "garlic_crop")))
    ));

    public static final Block PEA_CROP = registerCropBlock("pea_crop", new PeaCropBlock(
            AbstractBlock.Settings.copy(Blocks.WHEAT)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RusticRoots.MOD_ID, "pea_crop")))
    ));
    public static final Block TURNIP_CROP = registerCropBlock("turnip_crop", new TurnipCropBlock(
            AbstractBlock.Settings.copy(Blocks.WHEAT)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RusticRoots.MOD_ID, "turnip_crop")))
    ));
    public static final Block CHILI_CROP = registerCropBlock("chili_crop", new ChiliCropBlock(
            AbstractBlock.Settings.copy(Blocks.WHEAT)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RusticRoots.MOD_ID, "chili_crop")))
    ));
    public static final Block BELLPEPPER_CROP = registerCropBlock("bellpepper_crop", new BellPepperCropBlock(
            AbstractBlock.Settings.copy(Blocks.WHEAT)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RusticRoots.MOD_ID, "bellpepper_crop")))
    ));
    public static final Block BROCCOLI_CROP = registerCropBlock("broccoli_crop", new BroccoliCropBlock(
            AbstractBlock.Settings.copy(Blocks.WHEAT)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RusticRoots.MOD_ID, "broccoli_crop")))
    ));
    public static final Block CORN_CROP = registerCropBlock("corn_crop", new CornCropBlock(
            AbstractBlock.Settings.copy(Blocks.WHEAT)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RusticRoots.MOD_ID, "corn_crop")))
    ));
    public static final Block CUCUMBER_CROP = registerCropBlock("cucumber_crop", new CucumberCropBlock(
            AbstractBlock.Settings.copy(Blocks.WHEAT)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RusticRoots.MOD_ID, "cucumber_crop")))
    ));
    public static final Block EGGPLANT_CROP = registerCropBlock("eggplant_crop", new EggplantCropBlock(
            AbstractBlock.Settings.copy(Blocks.WHEAT)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RusticRoots.MOD_ID, "eggplant_crop")))
    ));
    public static final Block CAULIFLOWER_CROP = registerCropBlock("cauliflower_crop", new CauliflowerCropBlock(
            AbstractBlock.Settings.copy(Blocks.WHEAT)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RusticRoots.MOD_ID, "cauliflower_crop")))
    ));
    public static final Block GREENCABBAGE_CROP = registerCropBlock("greencabbage_crop", new GreencabbageCropBlock(
            AbstractBlock.Settings.copy(Blocks.WHEAT)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RusticRoots.MOD_ID, "greencabbage_crop")))
    ));
    public static final Block PURPLECABBAGE_CROP = registerCropBlock("purplecabbage_crop", new PurplecabbageCropBlock(
            AbstractBlock.Settings.copy(Blocks.WHEAT)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RusticRoots.MOD_ID, "purplecabbage_crop")))
    ));
    public static final Block LETTUCE_CROP = registerCropBlock("lettuce_crop", new LettuceCropBlock(
            AbstractBlock.Settings.copy(Blocks.WHEAT)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RusticRoots.MOD_ID, "lettuce_crop")))
    ));
    public static final Block LEMON_LEAVES = registerBlockWithoutItem("lemon_leaves", new LemonLeavesBlock(
            AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)
                    .registryKey(RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(RusticRoots.MOD_ID, "lemon_leaves")))
    ));
    private static Block registerCropBlock(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(RusticRoots.MOD_ID, name), block);
    }

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, Identifier.of(RusticRoots.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        RusticRoots.LOGGER.info("Registering Mod Blocks for " + RusticRoots.MOD_ID);
    }
}