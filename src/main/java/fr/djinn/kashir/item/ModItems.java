package fr.djinn.kashir.item;

import fr.djinn.kashir.Kashir;
import fr.djinn.kashir.item.custom.DemoniumCoalItem;
import net.minecraft.world.item.*;
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
    public static final DeferredItem<Item> DEMONIUM_COAL = ITEMS.register("demonium_coal",
            () -> new DemoniumCoalItem(new Item.Properties(), 1600));

    public static final DeferredItem<SwordItem> DEMONIUM_SWORD = ITEMS.register("demonium_sword",
            () -> new SwordItem(ModToolTiers.DEMONIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEMONIUM, 7, 2f))));
    public static final DeferredItem<AxeItem> DEMONIUM_AXE = ITEMS.register("demonium_axe",
            () -> new AxeItem(ModToolTiers.DEMONIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEMONIUM, 6, 3f))));
    public static final DeferredItem<HoeItem> DEMONIUM_HOE = ITEMS.register("demonium_hoe",
            () -> new HoeItem(ModToolTiers.DEMONIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEMONIUM, 4, 4f))));
    public static final DeferredItem<ShovelItem> DEMONIUM_SHOVEL = ITEMS.register("demonium_shovel",
            () -> new ShovelItem(ModToolTiers.DEMONIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEMONIUM, 4, 4f))));
    public static final DeferredItem<PickaxeItem> DEMONIUM_PICKAXE = ITEMS.register("demonium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.DEMONIUM, new Item.Properties()
                    .attributes(SwordItem.createAttributes(ModToolTiers.DEMONIUM, 3, 4f))));


//    public static final DeferredItem<Item> CHISEL = ITEMS.register("chisel",
//            () -> new ChiselItem(new Item.Properties().durability(32)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
