package net.sirwagselot.rusticroots.block.custom;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.sirwagselot.rusticroots.item.ModItems;

public class TomatoCropBlock extends CropBlock {

    public TomatoCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    public int getMaxAge() {
        return 5; // your custom max stage
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.TOMATO_SEEDS;
    }
}