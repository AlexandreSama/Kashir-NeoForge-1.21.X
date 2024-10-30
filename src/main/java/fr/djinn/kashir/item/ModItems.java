package fr.djinn.kashir.item;

import fr.djinn.kashir.Kashir;
import fr.djinn.kashir.item.custom.ChiselItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Kashir.MODID);

    public static final DeferredItem<Item> DEMONIUM_INGOT = ITEMS.register("demonium_ingot",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final DeferredItem<Item> RAW_DEMONIUM = ITEMS.register("raw_demonium",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final DeferredItem<Item> DEMONIUM_STICK = ITEMS.register("demonium_stick",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final DeferredItem<Item> DEMONIUM_POWDER = ITEMS.register("demonium_powder",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final DeferredItem<Item> DEMONIUM_CRUSHER = ITEMS.register("demonium_crusher",
            () -> new Item(new Item.Properties().durability(32).setNoRepair()));


    public static final DeferredItem<Item> CHISEL = ITEMS.register("chisel",
            () -> new ChiselItem(new Item.Properties().durability(32)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
