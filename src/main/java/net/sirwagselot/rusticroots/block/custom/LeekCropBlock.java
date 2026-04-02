package net.sirwagselot.rusticroots.block.custom;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.sirwagselot.rusticroots.item.ModItems;

public class LeekCropBlock extends CropBlock {

    public LeekCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    public int getMaxAge() {
        return 5;
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.LEEK_SEEDS;
    }
}