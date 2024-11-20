package fr.djinn.kashir.init;

import fr.djinn.kashir.Kashir;
import fr.djinn.kashir.block.ModBlocks;
import fr.djinn.kashir.block.entity.DemoniumFurnaceBlockEntity;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;


@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, Kashir.MODID);
    public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> DEMONIUM_FURNACE = register("demonium_furnace", ModBlocks.DEMONIUM_FURNACE, DemoniumFurnaceBlockEntity::new);

    // Start of user code block custom block entities
    // End of user code block custom block entities
    private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
        return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
    }

    @SubscribeEvent
    public static void registerCapabilities(RegisterCapabilitiesEvent event) {
        event.registerBlockEntity(Capabilities.ItemHandler.BLOCK, DEMONIUM_FURNACE.get(), (blockEntity, side) -> ((DemoniumFurnaceBlockEntity) blockEntity).getItemHandler());
    }
}

