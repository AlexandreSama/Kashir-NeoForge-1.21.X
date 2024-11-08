package fr.djinn.kashir.menu;

import fr.djinn.kashir.block.ModBlocks;
import fr.djinn.kashir.block.entity.DemoniumFurnaceBlockEntity;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;

public class DemoniumFurnaceMenu extends AbstractContainerMenu {

    private final DemoniumFurnaceBlockEntity blockEntity;
    private final ContainerData furnaceData;

    public DemoniumFurnaceMenu(int id, Inventory playerInventory, DemoniumFurnaceBlockEntity blockEntity) {
        super(MenuType.FURNACE, id);  // MenuType personnalisé
        this.blockEntity = blockEntity;
        this.furnaceData = blockEntity.getFurnaceData();

        // Initialisation des slots d’inventaire
        setupPlayerInventorySlots(playerInventory);
        setupFurnaceSlots();
    }

    @Override
    public boolean stillValid(Player player) {
        return stillValid(ContainerLevelAccess.create(blockEntity.getLevel(), blockEntity.getBlockPos()), player, ModBlocks.DEMONIUM_FURNACE.get());
    }

    // Implémentation de quickMoveStack
    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.slots.get(index);
        if (slot != null && slot.hasItem()) {
            ItemStack stackInSlot = slot.getItem();
            itemstack = stackInSlot.copy();

            if (index < 3) { // Slot du four
                if (!this.moveItemStackTo(stackInSlot, 3, 39, true)) {
                    return ItemStack.EMPTY;
                }
                slot.onQuickCraft(stackInSlot, itemstack);
            } else if (!this.moveItemStackTo(stackInSlot, 0, 3, false)) { // Slots du joueur
                return ItemStack.EMPTY;
            }

            if (stackInSlot.isEmpty()) {
                slot.set(ItemStack.EMPTY);
            } else {
                slot.setChanged();
            }

            if (stackInSlot.getCount() == itemstack.getCount()) {
                return ItemStack.EMPTY;
            }

            slot.onTake(player, stackInSlot);
        }
        return itemstack;
    }

    private void setupPlayerInventorySlots(Inventory playerInventory) {
        // Ajoute les slots d'inventaire du joueur
    }

    private void setupFurnaceSlots() {
        // Ajoute les slots spécifiques du four
    }
}