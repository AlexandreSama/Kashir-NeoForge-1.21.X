package fr.djinn.kashir.block.entity;

import fr.djinn.kashir.Kashir;
import fr.djinn.kashir.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class DemoniumFurnaceEntity extends BlockEntity {
    public DemoniumFurnaceEntity(BlockPos pos, BlockState state) {
        super(DEMONIUM_FURNACE.get(), pos, state);
    }

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES =
            DeferredRegister.create(Registries.BLOCK_ENTITY_TYPE, Kashir.MODID);

    public static final Supplier<BlockEntityType<DemoniumFurnaceEntity>> DEMONIUM_FURNACE = BLOCK_ENTITY_TYPES.register(
            "my_block_entity",
            // The block entity type, created using a builder.
            () -> BlockEntityType.Builder.of(
                            // The supplier to use for constructing the block entity instances.
                            DemoniumFurnaceEntity::new,
                            // A vararg of blocks that can have this block entity.
                            // This assumes the existence of the referenced blocks as DeferredBlock<Block>s.
                            ModBlocks.DEMONIUM_FURNACE.get()
                    )
                    // Build using null; vanilla does some datafixer shenanigans with the parameter that we don't need.
                    .build(null)
    );
}
