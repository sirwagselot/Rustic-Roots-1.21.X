package net.sirwagselot.rusticroots.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.BlockState;
import net.minecraft.block.LeavesBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.sirwagselot.rusticroots.item.ModItems;

public class LemonLeavesBlock extends LeavesBlock {

    public static final BooleanProperty FRUITED = BooleanProperty.of("fruited");
    public static final MapCodec<LemonLeavesBlock> CODEC = createCodec(LemonLeavesBlock::new);

    public LemonLeavesBlock(Settings settings) {
        super(0.1f, settings);
        this.setDefaultState(this.getDefaultState().with(FRUITED, false));
    }

    @Override
    public MapCodec<LemonLeavesBlock> getCodec() {
        return CODEC;
    }

    @Override
    protected void appendProperties(StateManager.Builder<net.minecraft.block.Block, BlockState> builder) {
        super.appendProperties(builder);
        builder.add(FRUITED);
    }

    @Override
    protected void spawnLeafParticle(World world, BlockPos pos, Random random) {
        // no custom particles needed
    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        return !state.get(FRUITED);
    }

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!state.get(FRUITED) && random.nextInt(5) == 0) {
            world.setBlockState(pos, state.with(FRUITED, true));
        }
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (state.get(FRUITED)) {
            if (!world.isClient()) {
                dropStack(world, pos, new ItemStack(ModItems.LEMON));
                world.setBlockState(pos, state.with(FRUITED, false));
                world.playSound(null, pos, SoundEvents.BLOCK_GRASS_BREAK, SoundCategory.BLOCKS, 1.0f, 1.0f);
            }
            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS;
    }
}