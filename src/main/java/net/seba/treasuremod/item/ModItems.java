package net.seba.treasuremod.item;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.seba.treasuremod.TreasureMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TREASURE_AQUA_AFFINITY=registerItem("treasure_aqua_affinity",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_aqua_affinity")))));
    public static final Item TREASURE_BANE_OF_ARTHROPODS=registerItem("treasure_bane_of_arthropods",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_bane_of_arthropods")))));
    public static final Item TREASURE_BLAST_PROTECTION=registerItem("treasure_blast_protection",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_blast_protection")))));
    public static final Item TREASURE_BREACH=registerItem("treasure_breach",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_breach")))));
    public static final Item TREASURE_CHANNELING=registerItem("treasure_channeling",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_channeling")))));
    public static final Item TREASURE_CURSE_OF_BINDING=registerItem("treasure_curse_of_binding",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_curse_of_binding")))));
    public static final Item TREASURE_CURSE_OF_VANISHING=registerItem("treasure_curse_of_vanishing",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_curse_of_vanishing")))));
    public static final Item TREASURE_DENSITY=registerItem("treasure_density",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_density")))));
    public static final Item TREASURE_DEPTH_STRIDER=registerItem("treasure_depth_strider",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_depth_strider")))));
    public static final Item TREASURE_EFFICIENCY=registerItem("treasure_efficiency",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_efficiency")))));
    public static final Item TREASURE_FEATHER_FALLING=registerItem("treasure_feather_falling",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_feather_falling")))));
    public static final Item TREASURE_FIRE_ASPECT=registerItem("treasure_fire_aspect",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_fire_aspect")))));
    public static final Item TREASURE_FIRE_PROTECTION=registerItem("treasure_fire_protection",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_fire_protection")))));
    public static final Item TREASURE_FLAME=registerItem("treasure_flame",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_flame")))));
    public static final Item TREASURE_FORTUNE=registerItem("treasure_fortune",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_fortune")))));
    public static final Item TREASURE_FROST_WALKER=registerItem("treasure_frost_walker",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_frost_walker")))));
    public static final Item TREASURE_IMPALING=registerItem("treasure_impaling",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_impaling")))));
    public static final Item TREASURE_INFINITY=registerItem("treasure_infinity",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_infinity")))));
    public static final Item TREASURE_KNOCKBACK=registerItem("treasure_knockback",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_knockback")))));
    public static final Item TREASURE_LOOTING=registerItem("treasure_looting",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_looting")))));
    public static final Item TREASURE_LOYALTY=registerItem("treasure_loyalty",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_loyalty")))));
    public static final Item TREASURE_LUCK_OF_THE_SEA=registerItem("treasure_luck_of_the_sea",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_luck_of_the_sea")))));
    public static final Item TREASURE_LURE=registerItem("treasure_lure",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_lure")))));
    public static final Item TREASURE_MENDING=registerItem("treasure_mending",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_mending")))));
    public static final Item TREASURE_MULTISHOT=registerItem("treasure_multishot",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_multishot")))));
    public static final Item TREASURE_PIERCING=registerItem("treasure_piercing",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_piercing")))));
    public static final Item TREASURE_POWER=registerItem("treasure_power",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_power")))));
    public static final Item TREASURE_PROJECTILE_PROTECTION=registerItem("treasure_projectile_protection",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_projectile_protection")))));
    public static final Item TREASURE_PROTECTION=registerItem("treasure_protection",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_protection")))));
    public static final Item TREASURE_PUNCH=registerItem("treasure_punch",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_punch")))));
    public static final Item TREASURE_QUICK_CHARGE=registerItem("treasure_quick_charge",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_quick_charge")))));
    public static final Item TREASURE_RESPIRATION=registerItem("treasure_respiration",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_respiration")))));
    public static final Item TREASURE_RIPTIDE=registerItem("treasure_riptide",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_riptide")))));
    public static final Item TREASURE_SHARPNESS=registerItem("treasure_sharpness",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_sharpness")))));
    public static final Item TREASURE_SILK_TOUCH=registerItem("treasure_silk_touch",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_silk_touch")))));
    public static final Item TREASURE_SMITE=registerItem("treasure_smite",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_smite")))));
    public static final Item TREASURE_SOUL_SPEED=registerItem("treasure_soul_speed",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_soul_speed")))));
    public static final Item TREASURE_SWEEPING=registerItem("treasure_sweeping",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_sweeping")))));
    public static final Item TREASURE_SWIFT_SNEAK=registerItem("treasure_swift_sneak",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_swift_sneak")))));
    public static final Item TREASURE_THORNS=registerItem("treasure_thorns",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_thorns")))));
    public static final Item TREASURE_UNBREAKING=registerItem("treasure_unbreaking",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_unbreaking")))));
    public static final Item TREASURE_WIND_BURST=registerItem("treasure_wind_burst",new Item(new Item.Settings().maxCount(1).registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TreasureMod.MOD_ID,"treasure_wind_burst")))));






    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TreasureMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TreasureMod.LOGGER.info("Registering Mod Items for " + TreasureMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(TREASURE_AQUA_AFFINITY);
            entries.add(TREASURE_BANE_OF_ARTHROPODS);
            entries.add(TREASURE_BLAST_PROTECTION);
            entries.add(TREASURE_BREACH);
            entries.add(TREASURE_CHANNELING);
            entries.add(TREASURE_CURSE_OF_BINDING);
            entries.add(TREASURE_CURSE_OF_VANISHING);
            entries.add(TREASURE_DENSITY);
            entries.add(TREASURE_DEPTH_STRIDER);
            entries.add(TREASURE_EFFICIENCY);
            entries.add(TREASURE_FEATHER_FALLING);
            entries.add(TREASURE_FIRE_ASPECT);
            entries.add(TREASURE_FIRE_PROTECTION);
            entries.add(TREASURE_FLAME);
            entries.add(TREASURE_FORTUNE);
            entries.add(TREASURE_FROST_WALKER);
            entries.add(TREASURE_IMPALING);
            entries.add(TREASURE_INFINITY);
            entries.add(TREASURE_KNOCKBACK);
            entries.add(TREASURE_LOOTING);
            entries.add(TREASURE_LOYALTY);
            entries.add(TREASURE_LUCK_OF_THE_SEA);
            entries.add(TREASURE_LURE);
            entries.add(TREASURE_MENDING);
            entries.add(TREASURE_MULTISHOT);
            entries.add(TREASURE_PIERCING);
            entries.add(TREASURE_POWER);
            entries.add(TREASURE_PROJECTILE_PROTECTION);
            entries.add(TREASURE_PROTECTION);
            entries.add(TREASURE_PUNCH);
            entries.add(TREASURE_QUICK_CHARGE);
            entries.add(TREASURE_RESPIRATION);
            entries.add(TREASURE_RIPTIDE);
            entries.add(TREASURE_SHARPNESS);
            entries.add(TREASURE_SILK_TOUCH);
            entries.add(TREASURE_SMITE);
            entries.add(TREASURE_SOUL_SPEED);
            entries.add(TREASURE_SWEEPING);
            entries.add(TREASURE_SWIFT_SNEAK);
            entries.add(TREASURE_THORNS);
            entries.add(TREASURE_UNBREAKING);
            entries.add(TREASURE_WIND_BURST);
        });
    }
}