package net.seba.treasuremod.util;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.loot.condition.KilledByPlayerLootCondition;
import net.seba.treasuremod.item.ModItems;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTables;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {

    private static final Identifier GUARDIAN_ID
            = Identifier.of("minecraft", "entities/guardian");
    private static final Identifier ELDER_GUARDIAN_ID
            = Identifier.of("minecraft", "entities/elder_guardian");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registry) -> {

            //AQUA AFFINITY
            if(GUARDIAN_ID.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.01f)) // Drops 1% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_AQUA_AFFINITY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if(LootTables.UNDERWATER_RUIN_SMALL_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_AQUA_AFFINITY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.UNDERWATER_RUIN_BIG_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_AQUA_AFFINITY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //BANE OF ARTHROPODS
            if(LootTables.SIMPLE_DUNGEON_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.33f)) // Drops 33% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_BANE_OF_ARTHROPODS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.ABANDONED_MINESHAFT_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.2f)) // Drops 20% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_BANE_OF_ARTHROPODS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.STRONGHOLD_LIBRARY_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) // Drops 10% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_BANE_OF_ARTHROPODS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //BLAST PROTECTION
            if(LootTables.DESERT_PYRAMID_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f)) // Drops 50% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_BLAST_PROTECTION))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.DESERT_PYRAMID_ARCHAEOLOGY.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_BLAST_PROTECTION))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.STRONGHOLD_LIBRARY_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) // Drops 10% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_BLAST_PROTECTION))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //BREACH
            if(LootTables.TRIAL_CHAMBERS_REWARD_OMINOUS_RARE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_BREACH))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //CHANNELING
            if(ELDER_GUARDIAN_ID.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f)) // Drops 50% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_CHANNELING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //CURSE OF BINDING
            if(LootTables.SHIPWRECK_SUPPLY_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_CURSE_OF_BINDING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.RUINED_PORTAL_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_CURSE_OF_BINDING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //CURSE OF VANISHING
            if(LootTables.SHIPWRECK_SUPPLY_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_CURSE_OF_VANISHING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.RUINED_PORTAL_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_CURSE_OF_VANISHING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //DENSITY
            if(LootTables.TRIAL_CHAMBERS_REWARD_OMINOUS_RARE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f)) // Drops 25% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_DENSITY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //DEPTH STRIDER
            if(LootTables.SHIPWRECK_TREASURE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_DEPTH_STRIDER))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if(LootTables.UNDERWATER_RUIN_SMALL_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_DEPTH_STRIDER))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.UNDERWATER_RUIN_BIG_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_DEPTH_STRIDER))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if(GUARDIAN_ID.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.01f)) // Drops 1% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_DEPTH_STRIDER))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //EFFICIENCY
            if(LootTables.ABANDONED_MINESHAFT_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_EFFICIENCY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.VILLAGE_TOOLSMITH_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_EFFICIENCY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //FEATHER FALLING
            if(LootTables.TRIAL_CHAMBERS_REWARD_RARE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) // Drops 10% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_FEATHER_FALLING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.TRIAL_CHAMBERS_REWARD_OMINOUS_RARE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_FEATHER_FALLING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.STRONGHOLD_LIBRARY_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_FEATHER_FALLING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.END_CITY_TREASURE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.2f)) // Drops 20% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_FEATHER_FALLING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //FIRE ASPECT
            if(LootTables.RUINED_PORTAL_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) // Drops 10% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_FIRE_ASPECT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.NETHER_BRIDGE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_FIRE_ASPECT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.RUINED_PORTAL_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) // Drops 10% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_FIRE_ASPECT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.STRONGHOLD_LIBRARY_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_FIRE_ASPECT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //FIRE PROTECTION
            if(LootTables.RUINED_PORTAL_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_FIRE_PROTECTION))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.NETHER_BRIDGE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_FIRE_PROTECTION))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.BASTION_BRIDGE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.2f)) // Drops 20% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_FIRE_PROTECTION))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.BASTION_TREASURE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.2f)) // Drops 20% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_FIRE_PROTECTION))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.BASTION_HOGLIN_STABLE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.2f)) // Drops 20% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_FIRE_PROTECTION))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.BASTION_OTHER_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.2f)) // Drops 20% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_FIRE_PROTECTION))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.STRONGHOLD_LIBRARY_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_FIRE_PROTECTION))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //FLAME
            if(LootTables.RUINED_PORTAL_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) // Drops 10% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_FLAME))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.NETHER_BRIDGE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_FLAME))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.RUINED_PORTAL_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) // Drops 10% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_FIRE_ASPECT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.NETHER_BRIDGE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_FIRE_ASPECT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.STRONGHOLD_LIBRARY_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_FLAME))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //FORTUNE
            if(LootTables.ABANDONED_MINESHAFT_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_FORTUNE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.VILLAGE_TOOLSMITH_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) // Drops 10% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_FORTUNE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.BASTION_TREASURE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.2f)) // Drops 20% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_FORTUNE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //FROST WALKER
            if(LootTables.IGLOO_CHEST_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_FROST_WALKER))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.OCEAN_RUIN_COLD_ARCHAEOLOGY.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) // Drops 10% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_FROST_WALKER))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.SHIPWRECK_TREASURE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) // Drops 10% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_FROST_WALKER))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //IMPALING
            if(LootTables.UNDERWATER_RUIN_SMALL_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_IMPALING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.UNDERWATER_RUIN_BIG_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_IMPALING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.STRONGHOLD_LIBRARY_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_IMPALING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.FISHING_TREASURE_GAMEPLAY.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f)) // Drops 5% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_IMPALING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //INFINITY
            if(LootTables.JUNGLE_TEMPLE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f)) // Drops 50% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_INFINITY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.SIMPLE_DUNGEON_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) // Drops 10% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_INFINITY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.STRONGHOLD_LIBRARY_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 10% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_INFINITY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //KNOCKBACK
            if(LootTables.TRIAL_CHAMBERS_REWARD_RARE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_KNOCKBACK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.STRONGHOLD_LIBRARY_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_KNOCKBACK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //LOOTING
            if(LootTables.RUINED_PORTAL_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.01f)) // Drops 1% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_LOOTING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.NETHER_BRIDGE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_LOOTING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.BASTION_BRIDGE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 20% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_LOOTING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.BASTION_TREASURE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 20% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_LOOTING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.BASTION_HOGLIN_STABLE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 20% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_LOOTING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.BASTION_OTHER_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 20% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_LOOTING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.PILLAGER_OUTPOST_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_LOOTING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if(LootTables.STRONGHOLD_LIBRARY_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_LOOTING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.END_CITY_TREASURE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_LOOTING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //LOYALTY
            if(LootTables.UNDERWATER_RUIN_SMALL_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_LOYALTY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.UNDERWATER_RUIN_BIG_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_LOYALTY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.FISHING_TREASURE_GAMEPLAY.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f)) // Drops 5% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_LOYALTY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //LUCK OF THE SEA
            if(LootTables.UNDERWATER_RUIN_SMALL_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_LUCK_OF_THE_SEA))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.UNDERWATER_RUIN_BIG_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_LUCK_OF_THE_SEA))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.FISHING_TREASURE_GAMEPLAY.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) // Drops 10% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_LUCK_OF_THE_SEA))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //LURE
            if(LootTables.UNDERWATER_RUIN_SMALL_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_LURE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.UNDERWATER_RUIN_BIG_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_LURE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.FISHING_TREASURE_GAMEPLAY.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) // Drops 5% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_LURE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //MENDING
            if(LootTables.ANCIENT_CITY_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_MENDING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.END_CITY_TREASURE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15f)) // Drops 15% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_MENDING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            if(LootTables.SIMPLE_DUNGEON_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.025f)) // Drops 2.5% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_LURE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.ABANDONED_MINESHAFT_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f)) // Drops 5% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_LURE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //MULTISHOT
            if(LootTables.PILLAGER_OUTPOST_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_MULTISHOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.WOODLAND_MANSION_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_MULTISHOT))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //PIERCING
            if(LootTables.PILLAGER_OUTPOST_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_PIERCING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.WOODLAND_MANSION_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_PIERCING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //POWER
            if(LootTables.SIMPLE_DUNGEON_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_POWER))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.STRONGHOLD_LIBRARY_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_POWER))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.TRIAL_CHAMBERS_REWARD_RARE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_POWER))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //PROJECTILE PROTECTION
            if(LootTables.SIMPLE_DUNGEON_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_PROJECTILE_PROTECTION))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.STRONGHOLD_LIBRARY_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_PROJECTILE_PROTECTION))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.JUNGLE_TEMPLE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_PROJECTILE_PROTECTION))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.TRIAL_CHAMBERS_REWARD_RARE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_PROJECTILE_PROTECTION))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //PROTECTION
            if(LootTables.STRONGHOLD_LIBRARY_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_PROTECTION))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.TRIAL_CHAMBERS_REWARD_RARE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_PROTECTION))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //PUNCH
            if(LootTables.TRIAL_CHAMBERS_REWARD_RARE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_PUNCH))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.STRONGHOLD_LIBRARY_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_PUNCH))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //QUICK CHARGE
            if(LootTables.PILLAGER_OUTPOST_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_QUICK_CHARGE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.WOODLAND_MANSION_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_QUICK_CHARGE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //RESPIRATION
            if(GUARDIAN_ID.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.01f)) // Drops 1% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_RESPIRATION))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.UNDERWATER_RUIN_SMALL_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_RESPIRATION))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.UNDERWATER_RUIN_BIG_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_RESPIRATION))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.SHIPWRECK_TREASURE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_RESPIRATION))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }

            //

            //RIPTIDE
            if(ELDER_GUARDIAN_ID.equals(key.getValue())) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f)) // Drops 50% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_RIPTIDE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.BURIED_TREASURE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) // Drops 10% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_RIPTIDE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //SHARPNESS
            if(LootTables.TRIAL_CHAMBERS_REWARD_RARE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_SHARPNESS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.STRONGHOLD_LIBRARY_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_SHARPNESS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.SIMPLE_DUNGEON_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_SHARPNESS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.VILLAGE_WEAPONSMITH_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_SHARPNESS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //SILK TOUCH
            if(LootTables.ABANDONED_MINESHAFT_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_SILK_TOUCH))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.VILLAGE_TOOLSMITH_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) // Drops 10% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_SILK_TOUCH))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.SIMPLE_DUNGEON_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.2f)) // Drops 20% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_SILK_TOUCH))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //SMITE
            if(LootTables.SIMPLE_DUNGEON_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 20% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_SMITE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.STRONGHOLD_LIBRARY_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 20% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_SMITE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.IGLOO_CHEST_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f)) // Drops 20% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_SMITE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.TRIAL_CHAMBERS_REWARD_RARE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 20% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_SMITE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //SOUL SPEED
            if(LootTables.BASTION_BRIDGE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f)) // Drops 20% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_SOUL_SPEED))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.BASTION_TREASURE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f)) // Drops 20% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_SOUL_SPEED))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.BASTION_HOGLIN_STABLE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f)) // Drops 20% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_SOUL_SPEED))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.BASTION_OTHER_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f)) // Drops 20% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_SOUL_SPEED))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.BASTION_BRIDGE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.2f)) // Drops 20% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_FIRE_PROTECTION))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.BASTION_TREASURE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.2f)) // Drops 20% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_FIRE_PROTECTION))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.BASTION_HOGLIN_STABLE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.2f)) // Drops 20% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_FIRE_PROTECTION))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.PIGLIN_BARTERING_GAMEPLAY.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.01f)) // Drops 1% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_FIRE_PROTECTION))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //SWEEPING
            if(LootTables.TRIAL_CHAMBERS_REWARD_RARE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_SWEEPING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.STRONGHOLD_LIBRARY_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_SWEEPING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //SWIFT SNEAK
            if(LootTables.ANCIENT_CITY_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_SWIFT_SNEAK))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //THORNS
            if(LootTables.JUNGLE_TEMPLE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_THORNS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.TRIAL_CHAMBERS_REWARD_RARE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_THORNS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.STRONGHOLD_LIBRARY_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_THORNS))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //UNBREAKING
            if(LootTables.JUNGLE_TEMPLE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1.0f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_UNBREAKING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.DESERT_PYRAMID_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.4f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_UNBREAKING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.ABANDONED_MINESHAFT_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.25f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_UNBREAKING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.VILLAGE_TOOLSMITH_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.1f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_UNBREAKING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(LootTables.END_CITY_TREASURE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_UNBREAKING))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

            //WIND BURST
            if(LootTables.TRIAL_CHAMBERS_REWARD_OMINOUS_UNIQUE_CHEST.equals(key)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.5f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ModItems.TREASURE_WIND_BURST))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1,1f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            //

        });
    }
}