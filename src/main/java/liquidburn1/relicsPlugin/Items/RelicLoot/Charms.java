package liquidburn1.relicsPlugin.Items.RelicLoot;

import liquidburn1.relicsPlugin.Utils.RandomRange;
import liquidburn1.relicsPlugin.Utils.RelicBlueprint;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlotGroup;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//1st Relic Liquid's Laptop



public class Charms {

//Liquids Laptop
public static RelicBlueprint liquidsLaptop() {
    return new RelicBlueprint(
            Material.GRAY_CARPET, //Material
            "§x§5§C§9§5§2§E§l§nL§x§5§4§8§B§3§C§l§ni§x§4§C§8§1§4§9§l§nq§x§4§4§7§7§5§7§l§nu§x§3§B§6§D§6§4§l§ni§x§3§3§6§3§7§2§l§nd§x§2§B§5§9§7§F§l§n'§x§4§1§7§1§8§1§l§ns §x§6§D§A§0§8§5§l§nM§x§8§2§B§7§8§6§l§na§x§9§8§C§F§8§8§l§nc§x§A§E§E§6§8§A§l§nb§x§C§4§F§E§8§C§l§no§x§C§5§F§1§7§A§l§no§x§C§6§E§4§6§8§l§nk §x§C§8§C§B§4§3§l§nP§x§C§9§B§E§3§1§l§nr§x§C§A§B§1§1§F§l§no",
            new ArrayList<>(List.of(
                    "§8The very laptop that ", "§8sparked the journey.",
                    "§8Forged lines of code ", "§8into relics of power.",
                    "",
                    "§f[§x§5§C§9§5§2§E§lR§x§5§0§8§6§4§3§lE§x§4§4§7§7§5§7§lL§x§3§B§6§D§6§4§lI§x§3§7§6§8§6§B§lC §x§6§D§A§0§8§5§lC§x§7§8§A§C§8§6§lR§x§8§2§B§7§8§6§lE§x§9§8§C§F§8§8§lA§x§B§0§C§D§6§6§lT§x§C§8§C§B§4§3§lO§x§C§A§B§1§1§F§lR§r§f]",
                    "",
                    "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                    "§8Tier: §4Relic",
                    "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"
            )),//Lore
            new RandomRange(0, 0), // Health boost random from 2 to 8
            new RandomRange(0, 0), // Armor Toughness
            new RandomRange(0, 0), // Armor
            new RandomRange(0, 0), // Attack Damage
            new RandomRange(0, 0), // Attack Speed
            new RandomRange(0, 0), // Movement Speed
            
            EquipmentSlotGroup.OFFHAND, // Held in offhand
            Map.of(Enchantment.PROTECTION, new RandomRange(1,1)), // Enchantments
            "SPEED/2, JUMP_BOOST/1, REGENERATION/2, ABSORPTION/1, HERO_OF_THE_VILLAGE/1", //Potion Effects Make sure to find the exact Potion effects names otherwise it wont work Use PotionEffectType.ABSORPTION  SPEED/1 Gives player Speed 1 potion effect while they wear/hold item
            true,// Hide Enchants
            true, // is a charm?
            false,//can be charmed
            "" //Extratag
    );

}

    public static RelicBlueprint portal_gun_charm() {
        return new RelicBlueprint(
                Material.OMINOUS_TRIAL_KEY, //Material
                "§x§7§5§F§B§3§3§lP§x§7§9§F§3§3§F§lo§x§7§C§E§A§4§A§lr§x§8§0§E§2§5§6§lt§x§8§3§D§A§6§2§la§x§8§7§D§2§6§E§ll §x§8§E§C§1§8§5§lG§x§9§1§B§9§9§1§lu§x§9§5§B§1§9§D§ln §x§9§C§A§0§B§4§lC§x§9§F§9§8§C§0§lh§x§A§3§9§0§C§C§la§x§A§6§8§7§D§7§lr§x§A§A§7§F§E§3§lm",
                new ArrayList<>(List.of(
                        "§8From the labs of Rick Sanchez.",
                        "§8Slips you through space.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"
                )),//Lore
                new RandomRange(0, 0), // Health boost
                new RandomRange(0, 0), // Armor Toughness
                new RandomRange(0, 0), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0), // Movement Speed
                
                EquipmentSlotGroup.OFFHAND, // Held in offhand
                Map.of(Enchantment.PROTECTION, new RandomRange(1,1)), // Enchantments
                "SPEED/1,JUMP_BOOST/1", //Potion Effects
                true,// Hide Enchants
                true, // is a charm?
                false,//can be charmed
                "" //Extratag
        );
    }

    public static RelicBlueprint omnitrix_sample() {
        return new RelicBlueprint(
                Material.COMPASS, //Material
                "§x§7§5§F§B§3§3§lO§x§6§E§E§5§3§3§lm§x§6§6§C§E§3§3§ln§x§5§F§B§8§3§3§li§x§5§7§A§2§3§3§lt§x§5§0§8§B§3§2§lr§x§4§8§7§5§3§2§li§x§4§1§5§F§3§2§lx §x§3§2§3§2§3§2§lS§x§3§2§3§2§3§2§la§x§3§2§3§2§3§2§lm§x§3§2§3§2§3§2§lp§x§3§2§3§2§3§2§ll§x§3§2§3§2§3§2§le",
                new ArrayList<>(List.of(
                        "§8A scrap of alien DNA",
                        "§8Unstable... but potent.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"
                )),//Lore
                new RandomRange(0, 0), // Health boost
                new RandomRange(0, 0), // Armor Toughness
                new RandomRange(0, 0), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0), // Movement Speed
                
                EquipmentSlotGroup.OFFHAND, // Held in offhand
                Map.of(Enchantment.PROTECTION, new RandomRange(1,1)), // Enchantments
                "STRENGTH/1,SLOWNESS/1", //Potion Effects
                true,// Hide Enchants
                true, // is a charm?
                false,//can be charmed
                "" //Extratag
        );
    }

    public static RelicBlueprint charm_of_the_dragon_soul() {
        return new RelicBlueprint(
                Material.DRAGON_BREATH, //Material
                "§x§E§0§3§3§F§B§lC§x§D§4§3§3§E§E§lh§x§C§9§3§3§E§0§la§x§B§D§3§3§D§3§lr§x§B§2§3§3§C§5§lm §x§9§A§3§3§A§B§lo§x§8§F§3§3§9§D§lf §x§7§8§3§2§8§2§lt§x§6§C§3§2§7§5§lh§x§6§0§3§2§6§8§le §x§4§9§3§2§4§D§lD§x§3§E§3§2§3§F§lr§x§3§2§3§2§3§2§la§x§3§2§3§2§3§2§lg§x§3§2§3§2§3§2§lo§x§3§2§3§2§3§2§ln §x§3§2§3§2§3§2§lS§x§3§2§3§2§3§2§lo§x§3§2§3§2§3§2§lu§x§3§2§3§2§3§2§ll",
                new ArrayList<>(List.of(
                        "§8A fragment of a warrior’s spirit.",
                        "§8Taught by monks who knew control.",
                        "§8-Mortal Kombat",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"
                )),//Lore
                new RandomRange(0, 0), // Health boost
                new RandomRange(0, 0), // Armor Toughness
                new RandomRange(0, 0), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0), // Movement Speed
                
                EquipmentSlotGroup.OFFHAND, // Held in offhand
                Map.of(Enchantment.PROTECTION, new RandomRange(1,1)), // Enchantments
                "FIRE_RESISTANCE/1,STRENGTH/1,SLOWNESS/1", //Potion Effects
                true,// Hide Enchants
                true, // is a charm?
                false,//can be charmed
                "" //Extratag
        );
    }

    public static RelicBlueprint hollow_charm() {
        return new RelicBlueprint(
                Material.PHANTOM_MEMBRANE, //Material
                "§x§C§E§1§6§3§C§lH§x§B§A§1§D§4§8§lo§x§A§6§2§4§5§5§ll§x§9§2§2§B§6§1§ll§x§7§F§3§1§6§E§lo§x§6§B§3§8§7§A§lw §x§4§3§4§6§9§3§lC§x§4§3§4§6§9§3§lh§x§4§3§4§6§9§3§la§x§4§3§4§6§9§3§lr§x§4§3§4§6§9§3§lm",
                new ArrayList<>(List.of(
                        "§8A memory from below.",
                        "§8It echoes with silent determination.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"
                )),//Lore
                new RandomRange(0, 0), // Health boost
                new RandomRange(0, 0), // Armor Toughness
                new RandomRange(0, 0), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0), // Movement Speed
                
                EquipmentSlotGroup.OFFHAND, // Held in offhand
                Map.of(Enchantment.PROTECTION, new RandomRange(1,1)), // Enchantments
                "SLOW_FALLING/1", //Potion Effects
                true,// Hide Enchants
                true, // is a charm?
                false,//can be charmed
                "" //Extratag
        );

    }

    public static RelicBlueprint pip_boy_circuit() {
        return new RelicBlueprint(
                Material.DISC_FRAGMENT_5, //Material
                "§x§0§9§3§F§C§6§lP§x§0§9§3§F§C§6§li§x§0§9§3§F§C§6§lp§x§0§9§3§F§C§6§l-§x§1§D§4§4§B§5§lB§x§3§0§4§9§A§3§lo§x§4§4§4§F§9§2§ly §x§6§B§5§9§6§F§lC§x§7§E§5§E§5§E§li§x§9§2§6§3§4§C§lr§x§A§5§6§8§3§B§lc§x§B§9§6§E§2§A§lu§x§C§C§7§3§1§8§li§x§E§0§7§8§0§7§lt",
                new ArrayList<>(List.of(
                        "§8Once part of a vault dweller’s toolkit.",
                        "§8Keeps you alert and ready.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"
                )),//Lore
                new RandomRange(0, 0), // Health boost
                new RandomRange(0, 0), // Armor Toughness
                new RandomRange(0, 0), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0), // Movement Speed
                
                EquipmentSlotGroup.OFFHAND, // Held in offhand
                Map.of(Enchantment.PROTECTION, new RandomRange(1,1)), // Enchantments
                "NIGHT_VISION/1, LUCK/1", //Potion Effects
                true,// Hide Enchants
                true, // is a charm?
                false,//can be charmed
                "" //Extratag
        );
    }

    public static RelicBlueprint charm_of_controlled_fury() {
        return new RelicBlueprint(
                Material.ECHO_SHARD, //Material
                "§x§7§4§7§3§3§8§lC§x§7§3§7§6§3§D§lh§x§7§2§7§9§4§1§la§x§7§2§7§C§4§6§lr§x§7§1§7§F§4§A§lm §x§6§F§8§5§5§3§lo§x§6§E§8§8§5§8§lf §x§6§D§8§E§6§1§lC§x§6§C§9§1§6§6§lo§x§6§B§9§4§6§A§ln§x§6§A§9§7§6§F§lt§x§6§9§9§A§7§3§lr§x§6§8§9§D§7§8§lo§x§6§8§A§0§7§C§ll§x§6§7§A§3§8§1§ll§x§6§6§A§6§8§6§le§x§6§5§A§9§8§A§ld §x§6§3§A§F§9§3§lF§x§6§3§B§2§9§8§lu§x§6§2§B§5§9§C§lr§x§6§1§B§8§A§1§ly",
                new ArrayList<>(List.of(
                        "§8Strength through discipline.",
                        "§8You feel powerful... but slow.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"
                )),//Lore
                new RandomRange(0, 0), // Health boost
                new RandomRange(0, 0), // Armor Toughness
                new RandomRange(0, 0), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0), // Movement Speed
                
                EquipmentSlotGroup.OFFHAND, // Held in offhand
                Map.of(Enchantment.PROTECTION, new RandomRange(1,1)), // Enchantments
                "STRENGTH/1,SLOWNESS/1", //Potion Effects
                true,// Hide Enchants
                true, // is a charm?
                false,//can be charmed
                "" //Extratag
        );
    }

    //TODO CHANGE THIS
    public static RelicBlueprint bulwark_rune() {
        return new RelicBlueprint(
                Material.SHULKER_SHELL, //Material
                "&x&5&2&A&D&5&1&lB&x&5&9&A&8&5&5&lu&x&5&F&A&2&5&9&ll&x&6&6&9&D&5&E&lw&x&6&C&9&8&6&2&la&x&7&3&9&2&6&6&lr&x&7&9&8&D&6&A&lk &x&8&6&8&2&7&2&lR&x&8&D&7&D&7&7&lu&x&9&3&7&7&7&B&ln&x&9&A&7&2&7&F&le",
                new ArrayList<>(List.of(
                        "§8Resistance when it matters most.",
                        "§8But you can’t dodge as easily.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"
                )),//Lore
                new RandomRange(0, 0), // Health boost
                new RandomRange(0, 0), // Armor Toughness
                new RandomRange(0, 0), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0), // Movement Speed
                
                EquipmentSlotGroup.OFFHAND, // Held in offhand
                Map.of(Enchantment.PROTECTION, new RandomRange(1,1)), // Enchantments
                "RESISTANCE/1, SLOWNESS/2", //Potion Effects
                true,// Hide Enchants
                true, // is a charm?
                false,//can be charmed
                "" //Extratag
        );
    }

    public static RelicBlueprint tideborn_shell() {
        return new RelicBlueprint(
                Material.PRISMARINE_CRYSTALS, //Material
                "§x§8§8§E§E§7§4§lT§x§8§A§E§1§7§E§li§x§8§C§D§4§8§8§ld§x§8§F§C§7§9§2§le§x§9§1§B§B§9§C§lb§x§9§3§A§E§A§6§lo§x§9§5§A§1§B§0§lr§x§9§8§9§4§B§A§ln §x§9§C§7§A§C§E§lS§x§9§E§6§E§D§8§lh§x§A§1§6§1§E§2§le§x§A§3§5§4§E§C§ll§x§A§5§4§7§F§6§ll",
                new ArrayList<>(List.of(
                        "§8Forged in silence beneath the ocean.",
                        "§8Your lungs belong to the sea.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"
                )),//Lore
                new RandomRange(0, 0), // Health boost
                new RandomRange(0, 0), // Armor Toughness
                new RandomRange(0, 0), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0), // Movement Speed
                
                EquipmentSlotGroup.OFFHAND, // Held in offhand
                Map.of(Enchantment.PROTECTION, new RandomRange(1,1)), // Enchantments
                "WATER_BREATHING/1", //Potion Effects
                true,// Hide Enchants
                true, // is a charm?
                false,//can be charmed
                "" //Extratag
        );

    }

    public static RelicBlueprint cloak_of_hollow_sight() {
        return new RelicBlueprint(
                Material.GHAST_TEAR, //Material
                "§x§E§2§C§0§C§4§lC§x§D§F§B§9§B§D§ll§x§D§C§B§2§B§6§lo§x§D§8§A§B§A§E§la§x§D§5§A§4§A§7§lk §x§C§F§9§7§9§9§lo§x§C§C§9§0§9§2§lf §x§C§5§8§2§8§3§lH§x§C§2§7§B§7§C§lo§x§B§F§7§4§7§5§ll§x§B§C§6§D§6§E§ll§x§B§8§6§6§6§6§lo§x§B§5§5§F§5§F§lw §x§A§F§5§2§5§1§lS§x§A§C§4§B§4§A§li§x§A§8§4§4§4§2§lg§x§A§5§3§D§3§B§lh§x§A§2§3§6§3§4§lt",
                new ArrayList<>(List.of(
                        "§8You disappear",
                        "§8but feel your arms",
                        "§8grow heavy.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"
                )),//Lore
                new RandomRange(0, 0), // Health boost
                new RandomRange(0, 0), // Armor Toughness
                new RandomRange(0, 0), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0), // Movement Speed
                
                EquipmentSlotGroup.OFFHAND, // Held in offhand
                Map.of(Enchantment.PROTECTION, new RandomRange(1,1)), // Enchantments
                "INVISIBILITY/1, MINING_FATIGUE/1", //Potion Effects
                true,// Hide Enchants
                true, // is a charm?
                false,//can be charmed
                "" //Extratag
        );
    }

    public static RelicBlueprint driftcore() {
        return new RelicBlueprint(
                Material.FEATHER, //Material
                "§x§E§4§C§8§3§8§lD§x§D§6§B§F§4§4§lr§x§C§8§B§6§4§F§li§x§B§A§A§D§5§B§lf§x§A§C§A§4§6§7§lt§x§9§D§9§B§7§2§lc§x§8§F§9§2§7§E§lo§x§8§1§8§9§8§9§lr§x§7§3§8§0§9§5§le",
                new ArrayList<>(List.of(
                        "§8Weightless. Wandering. Whisper-light.",
                        "§8Upward force, but earthly pull.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"
                )),//Lore
                new RandomRange(0, 0), // Health boost
                new RandomRange(0, 0), // Armor Toughness
                new RandomRange(0, 0), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0), // Movement Speed
                
                EquipmentSlotGroup.OFFHAND, // Held in offhand
                Map.of(Enchantment.PROTECTION, new RandomRange(1,1)), // Enchantments
                "LEVITATION/1, SLOWNESS/1", //Potion Effects
                true,// Hide Enchants
                true, // is a charm?
                false,//can be charmed
                "" //Extratag
        );
    }

    public static RelicBlueprint kitsunes_spring() {
        return new RelicBlueprint(
                Material.RABBIT_FOOT, //Material
                "§x§F§4§F§3§1§2§lK§x§E§A§F§1§1§B§li§x§E§0§F§0§2§3§lt§x§D§5§E§E§2§C§ls§x§C§B§E§D§3§4§lu§x§C§1§E§B§3§D§ln§x§B§7§E§9§4§5§le§x§A§D§E§8§4§E§l'§x§A§2§E§6§5§6§ls §x§8§E§E§3§6§7§lS§x§8§4§E§1§7§0§lp§x§7§A§E§0§7§8§lr§x§6§F§D§E§8§1§li§x§6§5§D§D§8§9§ln§x§5§B§D§B§9§2§lg",
                new ArrayList<>(List.of(
                        "§8The fox spirit leaps far.",
                        "§8Gravity is just a rumor.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"
                )),//Lore
                new RandomRange(0, 0), // Health boost
                new RandomRange(0, 0), // Armor Toughness
                new RandomRange(0, 0), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0), // Movement Speed
                
                EquipmentSlotGroup.OFFHAND, // Held in offhand
                Map.of(Enchantment.PROTECTION, new RandomRange(1,1)), // Enchantments
                "JUMP_BOOST/3", //Potion Effects
                true,// Hide Enchants
                true, // is a charm?
                false,//can be charmed
                "" //Extratag
        );
    }

    public static RelicBlueprint flash_fragment() {
        return new RelicBlueprint(
                Material.SUGAR, //Material
                "§x§7§5§E§C§F§D§lF§x§7§4§E§8§F§3§ll§x§7§3§E§4§E§9§la§x§7§2§E§1§D§E§ls§x§7§1§D§D§D§4§lh §x§6§F§D§5§C§0§lF§x§6§E§D§2§B§5§lr§x§6§D§C§E§A§B§la§x§6§C§C§A§A§1§lg§x§6§B§C§6§9§7§lm§x§6§A§C§3§8§C§le§x§6§9§B§F§8§2§ln§x§6§8§B§B§7§8§lt",
                new ArrayList<>(List.of(
                        "§8You were here. Then gone.",
                        "§8A blur in the corner of their eye.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"
                )),//Lore
                new RandomRange(0, 0), // Health boost
                new RandomRange(0, 0), // Armor Toughness
                new RandomRange(0, 0), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0), // Movement Speed
                
                EquipmentSlotGroup.OFFHAND, // Held in offhand
                Map.of(Enchantment.PROTECTION, new RandomRange(1,1)), // Enchantments
                "SPEED/2", //Potion Effects
                true,// Hide Enchants
                true, // is a charm?
                false,//can be charmed
                "" //Extratag
        );
    }












}
