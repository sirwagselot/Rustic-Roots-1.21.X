package net.sirwagselot.rusticroots.block.custom;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.sirwagselot.rusticroots.item.ModItems;

public class CornCropBlock extends ModCropBlock {

    public CornCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.CORN_SEEDS;
    }
}