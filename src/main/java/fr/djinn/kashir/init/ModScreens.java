package fr.djinn.kashir.init;

import fr.djinn.kashir.client.gui.DemoniumFurnaceGUIScreen;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;


@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModScreens {
    @SubscribeEvent
    public static void clientLoad(RegisterMenuScreensEvent event) {
        event.register(ModMenus.DEMONIUM_FURNACE_GUI.get(), DemoniumFurnaceGUIScreen::new);
    }
}

