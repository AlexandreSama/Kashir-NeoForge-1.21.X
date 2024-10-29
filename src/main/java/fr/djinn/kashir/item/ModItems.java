package fr.djinn.kashir.item;

import fr.djinn.kashir.Kashir;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Kashir.MODID);

    public static final DeferredItem<Item> DEMONIUM_INGOT = ITEMS.register("demonium_ingot",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> RAW_DEMONIUM = ITEMS.register("raw_demonium",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
