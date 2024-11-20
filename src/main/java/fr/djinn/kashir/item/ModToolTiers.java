package fr.djinn.kashir.item;

import fr.djinn.kashir.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier DEMONIUM = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_DEMONIUM_TOOL,
            1700, 6.0F, 4.0F, 10, () -> Ingredient.of(ModItems.DEMONIUM_INGOT));
}
