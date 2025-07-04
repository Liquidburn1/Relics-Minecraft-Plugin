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

public class Leggings {

    public static RelicBlueprint voidWalker_Legs() {
        return new RelicBlueprint(
                Material.NETHERITE_LEGGINGS, //Material Item
                "§x§A§0§0§2§B§0§lV§x§9§B§0§2§A§9§lo§x§9§6§0§3§A§2§li§x§9§2§0§3§9§B§ld§x§8§D§0§4§9§4§lP§x§8§8§0§4§8§C§ll§x§8§3§0§5§8§5§la§x§7§F§0§5§7§E§lt§x§7§A§0§6§7§7§le §x§7§0§0§7§6§9§lL§x§6§C§0§7§6§2§le§x§6§7§0§8§5§B§lg§x§6§2§0§8§5§3§lg§x§5§D§0§9§4§C§li§x§5§9§0§9§4§5§ln§x§5§4§0§A§3§E§lg§x§4§F§0§A§3§7§ls", //Name
                new ArrayList<>(List.of(
                        "§8Light does not bend",
                        "§8around these plates. It vanishes.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"

                )), //Lore
                new RandomRange(-2, 2), // Health boost
                new RandomRange(2, 3), // Armor Toughness
                new RandomRange(4, 6), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0.02), // Movement Speed
                
                EquipmentSlotGroup.LEGS, // Worn on Head
                Map.of(Enchantment.PROTECTION,new RandomRange(2,7),Enchantment.BLAST_PROTECTION,new RandomRange(2,6),Enchantment.UNBREAKING,new RandomRange(3,8),Enchantment.FEATHER_FALLING,new RandomRange(1,3),Enchantment.FIRE_PROTECTION,new RandomRange(1,5)), // Enchantments
                "", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );



    }



    //Oni Slayer
    public static RelicBlueprint Haidate_oniSlayer() {
        return new RelicBlueprint(
                Material.DIAMOND_LEGGINGS, //Material Item
                "§x§4§0§B§B§E§4§lH§x§4§1§B§4§E§0§la§x§4§2§A§D§D§C§li§x§4§4§A§6§D§9§ld§x§4§5§9§F§D§5§la§x§4§6§9§8§D§1§lt§x§4§7§9§1§C§D§le §x§4§A§8§3§C§5§lo§x§4§B§7§C§C§2§lf §x§4§D§6§E§B§A§lt§x§4§F§6§8§B§6§lh§x§5§0§6§1§B§2§le §x§5§2§5§3§A§B§lO§x§5§3§4§C§A§7§ln§x§5§5§4§5§A§3§li §x§5§7§3§7§9§B§lS§x§5§8§3§0§9§7§ll§x§5§9§2§9§9§4§la§x§5§B§2§2§9§0§ly§x§5§C§1§B§8§C§le§x§5§D§1§4§8§8§lr", //Name
                new ArrayList<>(List.of(
                        "§8Lined with seals to keep","§8the wearer's soul from being devoured.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"

                )), //Lore
                new RandomRange(-4, 3), // Health boost
                new RandomRange(2, 3), // Armor Toughness
                new RandomRange(5, 6), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0), // Movement Speed
                
                EquipmentSlotGroup.LEGS, // Worn on Head
                Map.of(Enchantment.PROTECTION,new RandomRange(2,7),Enchantment.PROJECTILE_PROTECTION,new RandomRange(2,6),Enchantment.UNBREAKING,new RandomRange(3,8),Enchantment.THORNS,new RandomRange(1,2)), // Enchantments
                "", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );



    }


    //Eldritch set
    public static RelicBlueprint Eldritch_Legs() {
        return new RelicBlueprint(
                Material.DIAMOND_LEGGINGS, //Material Item
                "§d§lE§b§lld§f§lri§b§ltc§d§lh §d§lL§b§leg§f§lgi§b§lng§d§ls", //Name
                new ArrayList<>(List.of(
                        "§8The voices of the ancient",
                        "§8echo within the ARMOR",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"

                )), //Lore
                new RandomRange(-2, 4), // Health boost
                new RandomRange(3, 4), // Armor Toughness
                new RandomRange(5, 6), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0.01), // Movement Speed
                
                EquipmentSlotGroup.LEGS, // Worn on Head
                Map.of(Enchantment.PROTECTION,new RandomRange(1,7),Enchantment.FIRE_PROTECTION,new RandomRange(1,5),Enchantment.UNBREAKING,new RandomRange(1,8),Enchantment.BLAST_PROTECTION,new RandomRange(2,5)), // Enchantments
                "", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );



    }

    //mandalorian set
    public static RelicBlueprint mandalorian_Legs() {
        return new RelicBlueprint(
                Material.IRON_LEGGINGS, //Material Item
                "§x§8§D§9§6§9§8§lT§x§8§8§9§1§9§3§la§x§8§4§8§C§8§E§ls§x§7§F§8§7§8§9§ls§x§7§A§8§2§8§3§le§x§7§6§7§D§7§E§lt§x§7§1§7§8§7§9§ls §x§6§8§6§E§6§F§lo§x§6§3§6§9§6§A§lf §x§5§A§5§F§6§0§lt§x§5§5§5§9§5§A§lh§x§5§1§5§4§5§5§le §x§4§7§4§A§4§B§lO§x§4§3§4§5§4§6§lu§x§3§E§4§0§4§1§lt§x§3§9§3§B§3§C§le§x§3§5§3§6§3§7§lr §x§2§B§2§C§2§C§lR§x§2§7§2§7§2§7§li§x§2§2§2§2§2§2§lm", //Name
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
                new RandomRange(3, 6), // Armor Toughness
                new RandomRange(3, 6), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0), // Movement Speed
                
                EquipmentSlotGroup.LEGS, // Worn on Head
                Map.of(Enchantment.PROTECTION,new RandomRange(1,6),Enchantment.FIRE_PROTECTION,new RandomRange(1,6),Enchantment.UNBREAKING,new RandomRange(1,7),Enchantment.BLAST_PROTECTION,new RandomRange(1,5)), // Enchantments
                "", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );



    }


    //avatar lastairbender set
    public static RelicBlueprint bindings_of_elements() {
        return new RelicBlueprint(
                Material.LEATHER_LEGGINGS, //Material Item
                "§x§C§D§3§E§1§0§lB§x§B§D§4§7§1§7§li§x§A§D§4§F§1§D§ln§x§9§D§5§8§2§4§ld§x§8§D§6§0§2§A§li§x§7§D§6§9§3§1§ln§x§6§D§7§2§3§8§lg§x§5§C§7§A§3§E§ls §x§3§C§8§B§4§B§lo§x§2§C§9§4§5§2§lf §x§0§C§A§5§5§F§lt§x§1§C§A§9§6§8§lh§x§2§D§A§D§7§2§le §x§4§D§B§4§8§5§lE§x§5§D§B§8§8§E§ll§x§6§E§B§C§9§8§le§x§7§E§B§F§A§1§lm§x§8§E§C§3§A§A§le§x§9§E§C§7§B§4§ln§x§A§F§C§B§B§D§lt§x§B§F§C§E§C§7§ls", //Name
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
                new RandomRange(4, 6), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0.01), // Movement Speed
                
                EquipmentSlotGroup.LEGS, // Worn on Head
                Map.of(Enchantment.PROTECTION,new RandomRange(4,6),Enchantment.FIRE_PROTECTION,new RandomRange(3,6),Enchantment.UNBREAKING,new RandomRange(7,10),Enchantment.BLAST_PROTECTION,new RandomRange(2 ,4),Enchantment.FEATHER_FALLING,new RandomRange(1,3)), // Enchantments
                "", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );



    }

    //Terminator
    public static RelicBlueprint servo_pistons() {
        return new RelicBlueprint(
                Material.IRON_LEGGINGS, //Material Item
                "§x§0§3§A§9§E§E§lS§x§0§6§A§3§E§7§le§x§0§A§9§C§E§1§lr§x§0§D§9§6§D§A§lv§x§1§0§9§0§D§4§lo§x§1§3§8§9§C§D§l-§x§1§7§8§3§C§6§lS§x§1§A§7§D§C§0§lt§x§1§D§7§7§B§9§la§x§2§0§7§0§B§3§lb§x§2§4§6§A§A§C§li§x§2§7§6§4§A§5§ll§x§2§A§5§D§9§F§li§x§2§D§5§7§9§8§lz§x§3§1§5§1§9§1§le§x§3§4§4§A§8§B§ld §x§3§A§3§E§7§E§lP§x§3§E§3§8§7§7§li§x§4§1§3§1§7§0§ls§x§4§4§2§B§6§A§lt§x§4§7§2§5§6§3§lo§x§4§B§1§E§5§D§ln§x§4§E§1§8§5§6§ls", //Name
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
                new RandomRange(5, 7), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(-0.01, 0.02), // Movement Speed
                
                EquipmentSlotGroup.LEGS, // Worn on Head
                Map.of(Enchantment.PROTECTION,new RandomRange(4,7),Enchantment.FIRE_PROTECTION,new RandomRange(3,7),Enchantment.UNBREAKING,new RandomRange(4,7),Enchantment.BLAST_PROTECTION,new RandomRange(2 ,3)), // Enchantments
                "", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );



    }


}
