package liquidburn1.relicsPlugin.Items.RelicLoot;

import liquidburn1.relicsPlugin.Utils.RandomRange;
import liquidburn1.relicsPlugin.Utils.RelicBlueprint;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlotGroup;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Boots {


    //WILL DELETE
    public static RelicBlueprint Wali_boots() {
        return new RelicBlueprint(
                Material.DIAMOND_BOOTS,
                "§x§5§C§9§5§2§E§lW§x§5§0§8§6§4§3§la§x§4§4§7§7§5§7§ll§x§4§1§7§4§5§B§li§x§3§E§7§0§6§0§l'§x§3§B§6§D§6§4§ls §x§3§3§6§3§7§2§lS§x§5§0§8§2§7§C§lt§x§6§D§A§0§8§5§li§x§7§8§A§C§8§6§ln§x§8§2§B§7§8§6§lk§x§8§9§B§F§8§7§ly §x§9§8§C§F§8§8§lB§x§B§0§C§D§6§6§lo§x§C§8§C§B§4§3§lo§x§C§9§B§E§3§1§lt§x§C§A§B§1§1§F§ls",
                new ArrayList<>(List.of(
                        "§8Stinkiest Boots in the world",
                        "§8Forged lines of code ", "§8into relics of power.",
                        "",
                        "§f[§x§5§C§9§5§2§E§lR§x§5§0§8§6§4§3§lE§x§4§4§7§7§5§7§lL§x§3§B§6§D§6§4§lI§x§3§7§6§8§6§B§lC §x§6§D§A§0§8§5§lC§x§7§8§A§C§8§6§lR§x§8§2§B§7§8§6§lE§x§9§8§C§F§8§8§lA§x§B§0§C§D§6§6§lT§x§C§8§C§B§4§3§lO§x§C§A§B§1§1§F§lR§r§f]",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"
                )),
                new RandomRange(-3, 3), // Health boost
                new RandomRange(5, 6), // Armor Toughness
                new RandomRange(5, 6), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0.02, 0.2), // Movement Speed

                EquipmentSlotGroup.FEET, // Held in Feet
                Map.of(Enchantment.PROTECTION, new RandomRange(4,7),Enchantment.BLAST_PROTECTION,new RandomRange(5,5),Enchantment.UNBREAKING,new RandomRange(5,5)), // Enchantments
                "",
                false,// Hide Enchants
                false,
                true,
                ""
        );
    }


    //Voidwalker set
    public static RelicBlueprint voidWalker_Boots() {
        return new RelicBlueprint(
                Material.NETHERITE_BOOTS, //Material Item
                "§x§A§0§0§2§B§0§lV§x§9§A§0§3§A§7§lo§x§9§4§0§3§9§F§li§x§8§F§0§4§9§6§ld§x§8§9§0§4§8§D§lP§x§8§3§0§5§8§5§ll§x§7§D§0§5§7§C§la§x§7§8§0§6§7§4§lt§x§7§2§0§7§6§B§le §x§6§6§0§8§5§A§lB§x§6§0§0§8§5§1§lo§x§5§B§0§9§4§8§lo§x§5§5§0§9§4§0§lt§x§4§F§0§A§3§7§ls", //Name
                new ArrayList<>(List.of(
                        "§8Gravity forgets you","§8momentarily with each step.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"

                )), //Lore
                new RandomRange(-2, 3), // Health boost
                new RandomRange(2, 3), // Armor Toughness
                new RandomRange(3, 3), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(-0.02, 0.01), // Movement Speed

                EquipmentSlotGroup.FEET, // Worn on Head
                Map.of(Enchantment.PROTECTION,new RandomRange(2,6),Enchantment.PROJECTILE_PROTECTION,new RandomRange(2,4),Enchantment.UNBREAKING,new RandomRange(3,7),Enchantment.FEATHER_FALLING,new RandomRange(2,3)), // Enchantments
                "", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );



    }

    //Flash
    public static RelicBlueprint Flash_Boots() {
        return new RelicBlueprint(
                Material.LEATHER_BOOTS, //Material Item
                "§x§B§1§0§7§0§0§lF§x§B§6§1§A§0§2§ll§x§B§C§2§E§0§4§la§x§C§1§4§1§0§6§ls§x§C§7§5§4§0§8§lh§x§C§C§6§7§0§A§l'§x§D§2§7§B§0§C§ls §x§D§C§A§1§1§0§lB§x§E§2§B§4§1§2§lo§x§E§7§C§8§1§4§lo§x§E§D§D§B§1§6§lt§x§F§2§E§E§1§8§ls", //Name
                new ArrayList<>(List.of(
                        "§8God Speed Barry Allen",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"

                )), //Lore
                new RandomRange(-6, 0), // Health boost
                new RandomRange(1, 1), // Armor Toughness
                new RandomRange(1, 1), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0.3), // Movement Speed

                EquipmentSlotGroup.FEET, // Worn on Head
                Map.of(Enchantment.PROTECTION,new RandomRange(2,7),Enchantment.UNBREAKING,new RandomRange(1,8),Enchantment.FEATHER_FALLING,new RandomRange(2,6)), // Enchantments
                "WEAKNESS/3", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );



    }

    //Oni Slayer set
    public static RelicBlueprint Suneate_oniSlayer() {
        return new RelicBlueprint(
                Material.DIAMOND_BOOTS, //Material Item
                "§x§4§0§B§B§E§4§lS§x§4§1§B§4§E§0§lu§x§4§2§A§D§D§C§ln§x§4§4§A§6§D§9§le§x§4§5§9§F§D§5§la§x§4§6§9§8§D§1§lt§x§4§7§9§1§C§D§le §x§4§A§8§3§C§5§lo§x§4§B§7§C§C§2§lf §x§4§D§6§E§B§A§lt§x§4§F§6§8§B§6§lh§x§5§0§6§1§B§2§le §x§5§2§5§3§A§B§lO§x§5§3§4§C§A§7§ln§x§5§5§4§5§A§3§li §x§5§7§3§7§9§B§lS§x§5§8§3§0§9§7§ll§x§5§9§2§9§9§4§la§x§5§B§2§2§9§0§ly§x§5§C§1§B§8§C§le§x§5§D§1§4§8§8§lr", //Name
                new ArrayList<>(List.of(
                        "§8They’ve walked through","§8cursed lands and left no tracks.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"

                )), //Lore
                new RandomRange(-4, 2), // Health boost
                new RandomRange(1, 2), // Armor Toughness
                new RandomRange(1, 2), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0.01), // Movement Speed

                EquipmentSlotGroup.FEET, // Worn on Head
                Map.of(Enchantment.PROTECTION,new RandomRange(2,7),Enchantment.PROJECTILE_PROTECTION,new RandomRange(2,6),Enchantment.UNBREAKING,new RandomRange(3,7),Enchantment.THORNS,new RandomRange(1,2),Enchantment.FROST_WALKER,new RandomRange(1,1)), // Enchantments
                "", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );



    }



    //Boots of Icarus
    public static RelicBlueprint boots_of_Icarus() {
        return new RelicBlueprint(
                Material.LEATHER_BOOTS, //Material Item
                "§x§F§C§F§F§0§0§lT§x§F§C§F§8§0§2§lh§x§F§C§F§1§0§3§le §x§F§C§E§3§0§6§lB§x§F§C§D§C§0§8§lo§x§F§C§D§5§0§9§lo§x§F§C§C§E§0§B§lt§x§F§C§C§7§0§C§ls §x§F§D§B§8§1§0§lo§x§F§D§B§1§1§1§lf §x§F§D§A§3§1§4§lI§x§F§D§9§C§1§6§lc§x§F§D§9§5§1§7§la§x§F§D§8§E§1§9§lr§x§F§D§8§7§1§A§lu§x§F§D§8§0§1§C§ls", //Name
                new ArrayList<>(List.of(
                        "§7Flight I",
                        "§8Do not fly too close to the sun.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"

                )), //Lore
                new RandomRange(-2, 1), // Health boost
                new RandomRange(1, 1), // Armor Toughness
                new RandomRange(1, 1), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0.15), // Attack Speed
                new RandomRange(0, 0.2), // Movement Speed

                EquipmentSlotGroup.FEET, // Worn on Head
                Map.of(Enchantment.FEATHER_FALLING,new RandomRange(2,3),Enchantment.PROJECTILE_PROTECTION,new RandomRange(2,6),Enchantment.UNBREAKING,new RandomRange(3,5),Enchantment.SOUL_SPEED,new RandomRange(1,2)), // Enchantments
                "JUMP_BOOST/2", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "flight" //Extra Tags for special abilities
        );



    }

    //Eldritch set
    public static RelicBlueprint Eldritch_boots() {
        return new RelicBlueprint(
                Material.DIAMOND_BOOTS, //Material Item
                "§d§lE§b§lld§f§lri§b§ltc§d§lh §d§lB§b§lo§f§lo§b§lt§d§ls", //Name
                new ArrayList<>(List.of(
                        "§8The voices of the ancient","§8echo within the ARMOR",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"

                )), //Lore
                new RandomRange(-2, 4), // Health boost
                new RandomRange(2, 4), // Armor Toughness
                new RandomRange(3, 3), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0.03), // Movement Speed

                EquipmentSlotGroup.FEET, // Worn on Head
                Map.of(Enchantment.PROTECTION,new RandomRange(2,6),Enchantment.FIRE_PROTECTION,new RandomRange(2,6),Enchantment.UNBREAKING,new RandomRange(1,7),Enchantment.BLAST_PROTECTION,new RandomRange(2,6)), // Enchantments
                "", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );



    }

    //mandalorian set
    public static RelicBlueprint mandalorian_Boots() {
        return new RelicBlueprint(
                Material.IRON_BOOTS, //Material Item
                "§x§8§D§9§6§9§8§lP§x§8§7§8§F§9§1§la§x§8§0§8§8§8§A§lt§x§7§A§8§2§8§3§lh§x§7§4§7§B§7§C§lf§x§6§E§7§4§7§5§li§x§6§7§6§D§6§E§ln§x§6§1§6§6§6§7§ld§x§5§B§5§F§6§0§le§x§5§4§5§9§5§A§lr§x§4§E§5§2§5§3§l’§x§4§8§4§B§4§C§ls §x§3§B§3§D§3§E§lS§x§3§5§3§6§3§7§lt§x§2§F§3§0§3§0§le§x§2§8§2§9§2§9§lp§x§2§2§2§2§2§2§ls", //Name
                new ArrayList<>(List.of(
                        "§8Forged from Beskar",
                        "§8Once worn by a lone warrior",
                        "§8who carried a child and a creed.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"

                )), //Lore
                new RandomRange(-2, 2), // Health boost
                new RandomRange(1, 3), // Armor Toughness
                new RandomRange(1, 3), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0), // Movement Speed

                EquipmentSlotGroup.FEET, // Worn on Head
                Map.of(Enchantment.PROTECTION,new RandomRange(1,6),Enchantment.FIRE_PROTECTION,new RandomRange(1,6),Enchantment.UNBREAKING,new RandomRange(1,7)), // Enchantments
                "", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );



    }


    //avatar lastairbender set
    public static RelicBlueprint steps_of_tempest() {
        return new RelicBlueprint(
                Material.LEATHER_BOOTS, //Material Item
                "§x§C§D§3§E§1§0§lS§x§B§A§4§8§1§8§lt§x§A§6§5§3§2§0§le§x§9§3§5§D§2§8§lp§x§8§0§6§7§3§0§ls §x§5§9§7§C§3§F§lo§x§4§6§8§6§4§7§lf §x§1§F§9§B§5§7§lt§x§0§C§A§5§5§F§lh§x§2§0§A§A§6§A§le §x§4§7§B§3§8§1§lT§x§5§A§B§7§8§C§le§x§6§E§B§C§9§8§lm§x§8§1§C§0§A§3§lp§x§9§5§C§5§A§E§le§x§A§8§C§9§B§9§ls§x§B§C§C§E§C§5§lt", //Name
                new ArrayList<>(List.of(
                        "§8Fire to endure. Water to adapt.",
                        "§8Earth to stand. Air to let go.",
                        "§8Few can bear the burden.",
                        "§8Even fewer can master it.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"

                )), //Lore
                new RandomRange(-2, 3), // Health boost
                new RandomRange(2, 3), // Armor Toughness
                new RandomRange(2, 3), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0.01), // Movement Speed

                EquipmentSlotGroup.FEET, // Worn on Head
                Map.of(Enchantment.PROTECTION,new RandomRange(4,5),Enchantment.FIRE_PROTECTION,new RandomRange(3,5),Enchantment.UNBREAKING,new RandomRange(7,10),Enchantment.BLAST_PROTECTION,new RandomRange(2 ,3),Enchantment.FROST_WALKER,new RandomRange(1,1),Enchantment.FEATHER_FALLING,new RandomRange(1,3)), // Enchantments
                "", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );



    }


    //Terminator
    public static RelicBlueprint Treadwalkers_of_Judgment() {
        return new RelicBlueprint(
                Material.IRON_BOOTS, //Material Item
                "§x§0§3§A§9§E§E§lT§x§0§6§A§3§E§7§lr§x§0§A§9§C§E§1§le§x§0§D§9§6§D§A§la§x§1§0§9§0§D§4§ld§x§1§3§8§9§C§D§lw§x§1§7§8§3§C§6§la§x§1§A§7§D§C§0§ll§x§1§D§7§7§B§9§lk§x§2§0§7§0§B§3§le§x§2§4§6§A§A§C§lr§x§2§7§6§4§A§5§ls §x§2§D§5§7§9§8§lo§x§3§1§5§1§9§1§lf §x§3§7§4§4§8§4§lJ§x§3§A§3§E§7§E§lu§x§3§E§3§8§7§7§ld§x§4§1§3§1§7§0§lg§x§4§4§2§B§6§A§lm§x§4§7§2§5§6§3§le§x§4§B§1§E§5§D§ln§x§4§E§1§8§5§6§lt", //Name
                new ArrayList<>(List.of(
                        "§8It doesn’t feel pain.",
                        "§8Or remorse. Or fear.",
                        "§8It will not stop.",
                        "§8Hasta La Vista Baby",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"

                )), //Lore
                new RandomRange(-2, 4), // Health boost
                new RandomRange(2, 4), // Armor Toughness
                new RandomRange(2, 4), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(-0.01, 0.02), // Movement Speed

                EquipmentSlotGroup.FEET, // Worn on Head
                Map.of(Enchantment.PROTECTION,new RandomRange(4,5),Enchantment.FIRE_PROTECTION,new RandomRange(3,5),Enchantment.UNBREAKING,new RandomRange(4,7),Enchantment.BLAST_PROTECTION,new RandomRange(2 ,4)), // Enchantments
                "", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );



    }








}

