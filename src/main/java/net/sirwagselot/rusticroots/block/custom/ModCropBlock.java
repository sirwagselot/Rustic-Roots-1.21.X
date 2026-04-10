package net.sirwagselot.rusticroots.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public abstract class ModCropBlock extends CropBlock {

    public ModCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    public int getMaxAge() {
        return 5;
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (this.getAge(state) < this.getMaxAge()) {
            super.randomTick(state, world, pos, random);
        }
    }
}