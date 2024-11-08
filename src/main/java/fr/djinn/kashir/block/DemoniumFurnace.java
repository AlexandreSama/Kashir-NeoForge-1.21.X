package fr.djinn.kashir.block;

import fr.djinn.kashir.block.entity.DemoniumFurnaceEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

public class DemoniumFurnace extends Block implements EntityBlock {
    public DemoniumFurnace(BlockBehaviour.Properties properties) {
        super(properties);
    }

    // Return a new instance of our block entity here.
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new DemoniumFurnaceEntity(pos, state);
    }
}
