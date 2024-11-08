package fr.djinn.kashir.block;

import fr.djinn.kashir.block.entity.DemoniumFurnaceBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.FurnaceBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class DemoniumFurnaceBlock extends FurnaceBlock {

    public DemoniumFurnaceBlock() {
        super(BlockBehaviour.Properties.of().strength(3.5F).requiresCorrectToolForDrops());
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new DemoniumFurnaceBlockEntity(pos, state);
    }

    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }
}
