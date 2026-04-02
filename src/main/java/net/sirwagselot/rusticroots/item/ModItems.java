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
        });
    }
}