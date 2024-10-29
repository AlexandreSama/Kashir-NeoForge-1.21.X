package fr.djinn.kashir.item;

import fr.djinn.kashir.Kashir;
import fr.djinn.kashir.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Kashir.MODID);

    public static final Supplier<CreativeModeTab> KASHIR_ITEMS_TAB = CREATIVE_MODE_TABS.register("kashir_items_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.RAW_DEMONIUM.get()))
                    .title(Component.translatable("creativetab.kashir.items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.RAW_DEMONIUM);
                        output.accept(ModItems.DEMONIUM_INGOT);
                    })
                    .build());

    public static final Supplier<CreativeModeTab> KASHIR_BLOCKS_TAB = CREATIVE_MODE_TABS.register("kashir_blocks_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModBlocks.DEMONIUM_BLOCK.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(Kashir.MODID, "kashir_items_tab"))
                    .title(Component.translatable("creativetab.kashir.blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.DEMONIUM_BLOCK);
                        output.accept(ModBlocks.DEMONIUM_ORE);
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }


}
