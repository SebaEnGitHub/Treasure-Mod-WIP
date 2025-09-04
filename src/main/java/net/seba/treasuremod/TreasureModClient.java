package net.seba.treasuremod;

import net.fabricmc.api.ClientModInitializer;
import net.seba.treasuremod.item.ModItems;
import net.seba.treasuremod.util.ModLootTableModifiers;

public class TreasureModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModItems.registerModItems();
        ModLootTableModifiers.modifyLootTables();
    }
}