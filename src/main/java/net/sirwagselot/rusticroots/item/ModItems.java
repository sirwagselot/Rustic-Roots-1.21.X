package net.sirwagselot.rusticroots.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.sirwagselot.rusticroots.RusticRoots;
import net.sirwagselot.rusticroots.block.ModBlocks;


public class ModItems {
    public static final Item TOMATO = registerItem("tomato", new Item.Settings().food(
            new FoodComponent.Builder()
                    .nutrition(3)
                    .saturationModifier(0.3f)
                    .build()
    ));

    public static final Item TOMATO_SEEDS = registerSeedItem("tomato_seeds", ModBlocks.TOMATO_CROP);

    public static final Item LEEK = registerItem("leek", new Item.Settings().food(
            new FoodComponent.Builder()
                    .nutrition(2)
                    .saturationModifier(0.4f)
                    .build()
    ));

    public static final Item LEEK_SEEDS = registerSeedItem("leek_seeds", ModBlocks.LEEK_CROP);

    private static Item registerItem(String name, Item.Settings settings) {
        Identifier id = Identifier.of(RusticRoots.MOD_ID, name);
        Item item = new Item(settings.registryKey(
                RegistryKey.of(RegistryKeys.ITEM, id)
        ));
        return Registry.register(Registries.ITEM, id, item);
    }
    public static final Item ONION = registerItem("onion", new Item.Settings().food(
            new FoodComponent.Builder()
                    .nutrition(2)
                    .saturationModifier(0.3f)
                    .build()
    ));

    public static final Item ONION_SEEDS = registerSeedItem("onion_seeds", ModBlocks.ONION_CROP);

    public static final Item GARLIC = registerItem("garlic", new Item.Settings().food(
            new FoodComponent.Builder()
                    .nutrition(1)
                    .saturationModifier(0.5f)
                    .build()
    ));

    public static final Item GARLIC_SEEDS = registerSeedItem("garlic_seeds", ModBlocks.GARLIC_CROP);

    public static final Item PEA = registerItem("pea", new Item.Settings().food(
            new FoodComponent.Builder()
                    .nutrition(2)
                    .saturationModifier(0.3f)
                    .build()
    ));

    public static final Item PEA_SEEDS = registerSeedItem("pea_seeds", ModBlocks.PEA_CROP);

    public static final Item TURNIP = registerItem("turnip", new Item.Settings().food(
            new FoodComponent.Builder()
                    .nutrition(2)
                    .saturationModifier(0.3f)
                    .build()
    ));

    public static final Item TURNIP_SEEDS = registerSeedItem("turnip_seeds", ModBlocks.TURNIP_CROP);

    public static final Item CHILI = registerItem("chili", new Item.Settings().food(
            new FoodComponent.Builder()
                    .nutrition(2)
                    .saturationModifier(0.2f)
                    .build()
    ));

    public static final Item CHILI_SEEDS = registerSeedItem("chili_seeds", ModBlocks.CHILI_CROP);

    public static final Item BELLPEPPER = registerItem("bellpepper", new Item.Settings().food(
            new FoodComponent.Builder()
                    .nutrition(2)
                    .saturationModifier(0.3f)
                    .build()
    ));

    public static final Item BELLPEPPER_SEEDS = registerSeedItem("bellpepper_seeds", ModBlocks.BELLPEPPER_CROP);

    public static final Item BROCCOLI = registerItem("broccoli", new Item.Settings().food(
            new FoodComponent.Builder()
                    .nutrition(3)
                    .saturationModifier(0.4f)
                    .build()
    ));

    public static final Item BROCCOLI_SEEDS = registerSeedItem("broccoli_seeds", ModBlocks.BROCCOLI_CROP);

    public static final Item CORN = registerItem("corn", new Item.Settings().food(
            new FoodComponent.Builder()
                    .nutrition(4)
                    .saturationModifier(0.4f)
                    .build()
    ));

    public static final Item CORN_SEEDS = registerSeedItem("corn_seeds", ModBlocks.CORN_CROP);

    public static final Item CUCUMBER = registerItem("cucumber", new Item.Settings().food(
            new FoodComponent.Builder()
                    .nutrition(2)
                    .saturationModifier(0.2f)
                    .build()
    ));

    public static final Item CUCUMBER_SEEDS = registerSeedItem("cucumber_seeds", ModBlocks.CUCUMBER_CROP);

    public static final Item EGGPLANT = registerItem("eggplant", new Item.Settings().food(
            new FoodComponent.Builder()
                    .nutrition(3)
                    .saturationModifier(0.3f)
                    .build()
    ));

    public static final Item EGGPLANT_SEEDS = registerSeedItem("eggplant_seeds", ModBlocks.EGGPLANT_CROP);

    public static final Item CAULIFLOWER = registerItem("cauliflower", new Item.Settings().food(
            new FoodComponent.Builder()
                    .nutrition(3)
                    .saturationModifier(0.4f)
                    .build()
    ));

    public static final Item CAULIFLOWER_SEEDS = registerSeedItem("cauliflower_seeds", ModBlocks.CAULIFLOWER_CROP);

    public static final Item GREENCABBAGE = registerItem("greencabbage", new Item.Settings().food(
            new FoodComponent.Builder()
                    .nutrition(3)
                    .saturationModifier(0.3f)
                    .build()
    ));

    public static final Item GREENCABBAGE_SEEDS = registerSeedItem("greencabbage_seeds", ModBlocks.GREENCABBAGE_CROP);

    public static final Item PURPLECABBAGE = registerItem("purplecabbage", new Item.Settings().food(
            new FoodComponent.Builder()
                    .nutrition(3)
                    .saturationModifier(0.3f)
                    .build()
    ));

    public static final Item PURPLECABBAGE_SEEDS = registerSeedItem("purplecabbage_seeds", ModBlocks.PURPLECABBAGE_CROP);

    public static final Item LETTUCE = registerItem("lettuce", new Item.Settings().food(
            new FoodComponent.Builder()
                    .nutrition(1)
                    .saturationModifier(0.2f)
                    .build()
    ));

    public static final Item LETTUCE_SEEDS = registerSeedItem("lettuce_seeds", ModBlocks.LETTUCE_CROP);

    public static final Item LEMON = registerItem("lemon", new Item.Settings().food(
            new FoodComponent.Builder()
                    .nutrition(3)
                    .saturationModifier(0.3f)
                    .build()
    ));

    public static final Item LEMON_LEAVES = registerSeedItem("lemon_leaves", ModBlocks.LEMON_LEAVES);


    private static Item registerSeedItem(String name, Block cropBlock) {
        Identifier id = Identifier.of(RusticRoots.MOD_ID, name);
        Item item = new BlockItem(
                cropBlock,
                new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, id))
        );
        return Registry.register(Registries.ITEM, id, item);
    }

    public static void registerModItems() {
        RusticRoots.LOGGER.info("Registering Mod Items for " + RusticRoots.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(TOMATO);
            entries.add(TOMATO_SEEDS);
            entries.add(LEEK);
            entries.add(LEEK_SEEDS);
            entries.add(ONION);
            entries.add(ONION_SEEDS);
            entries.add(GARLIC);
            entries.add(GARLIC_SEEDS);
            entries.add(PEA);
            entries.add(PEA_SEEDS);
            entries.add(TURNIP);
            entries.add(TURNIP_SEEDS);
            entries.add(CHILI);
            entries.add(CHILI_SEEDS);
            entries.add(BELLPEPPER);
            entries.add(BELLPEPPER_SEEDS);
            entries.add(BROCCOLI);
            entries.add(BROCCOLI_SEEDS);
            entries.add(CORN);
            entries.add(CORN_SEEDS);
            entries.add(CUCUMBER);
            entries.add(CUCUMBER_SEEDS);
            entries.add(EGGPLANT);
            entries.add(EGGPLANT_SEEDS);
            entries.add(CAULIFLOWER);
            entries.add(CAULIFLOWER_SEEDS);
            entries.add(GREENCABBAGE);
            entries.add(GREENCABBAGE_SEEDS);
            entries.add(PURPLECABBAGE);
            entries.add(PURPLECABBAGE_SEEDS);
            entries.add(LETTUCE);
            entries.add(LETTUCE_SEEDS);
            entries.add(LEMON);
            entries.add(LEMON_LEAVES);
        });
    }
}