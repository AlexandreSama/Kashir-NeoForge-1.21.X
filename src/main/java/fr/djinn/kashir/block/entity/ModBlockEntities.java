package fr.djinn.kashir.block.entity;

import fr.djinn.kashir.Kashir;
import fr.djinn.kashir.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModBlockEntities {
    // Utiliser BlockEntityType<?> pour DeferredRegister
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, Kashir.MODID);

    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<DemoniumFurnaceBlockEntity>> DEMONIUM_FURNACE =
            BLOCK_ENTITIES.register("demonium_furnace",
                    () -> BlockEntityType.Builder.of(DemoniumFurnaceBlockEntity::new, ModBlocks.DEMONIUM_FURNACE.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}