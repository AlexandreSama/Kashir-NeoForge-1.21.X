package fr.djinn.kashir.init;

import fr.djinn.kashir.Kashir;
import fr.djinn.kashir.world.inventory.DemoniumFurnaceGUIMenu;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModMenus {
    public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.MENU, Kashir.MODID);
    public static final DeferredHolder<MenuType<?>, MenuType<DemoniumFurnaceGUIMenu>> DEMONIUM_FURNACE_GUI = REGISTRY.register("demonium_furnace_gui", () -> IMenuTypeExtension.create(DemoniumFurnaceGUIMenu::new));
}
