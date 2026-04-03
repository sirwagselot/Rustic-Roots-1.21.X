package net.sirwagselot.rusticroots.block.custom;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.sirwagselot.rusticroots.item.ModItems;

public class PeaCropBlock extends CropBlock {

    public PeaCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    public int getMaxAge() {
        return 5;
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.PEA_SEEDS;
    }
}