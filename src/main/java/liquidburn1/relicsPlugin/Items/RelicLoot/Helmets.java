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

public class Helmets {


    //VoidWalker
    public static RelicBlueprint voidWalker_helm() {
        return new RelicBlueprint(
                Material.NETHERITE_HELMET, //Material Item
                "§x§A§0§0§2§B§0§lV§x§9§B§0§3§A§8§lo§x§9§5§0§3§A§0§li§x§9§0§0§4§9§8§ld§x§8§A§0§4§9§0§lP§x§8§5§0§5§8§8§ll§x§8§0§0§5§8§0§la§x§7§A§0§6§7§8§lt§x§7§5§0§6§6§F§le §x§6§A§0§7§5§F§lH§x§6§5§0§8§5§7§le§x§5§F§0§8§4§F§ll§x§5§A§0§9§4§7§lm§x§5§4§0§9§3§F§le§x§4§F§0§A§3§7§lt", //Name
                new ArrayList<>(List.of(
                        "§8Whispers louder than sound",
                        "§8guide your aim.",
                        "§f* Has Particles When Worn",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"

                )), //Lore
                new RandomRange(-2, 3), // Health boost
                new RandomRange(3, 3), // Armor Toughness
                new RandomRange(3, 3), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(-0.02, 0.01), // Movement Speed
                
                EquipmentSlotGroup.HEAD, // Worn on Head
                Map.of(Enchantment.PROTECTION,new RandomRange(3,6),Enchantment.PROJECTILE_PROTECTION,new RandomRange(3,6),Enchantment.UNBREAKING,new RandomRange(3,6)), // Enchantments
                "", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );



    }


    //Oni Slayer
    public static RelicBlueprint Kabuto_onislayer() {
        return new RelicBlueprint(
                Material.DIAMOND_HELMET, //Material Item
                "§x§4§0§B§B§E§4§lK§x§4§1§B§4§E§0§la§x§4§3§A§C§D§C§lb§x§4§4§A§5§D§8§lu§x§4§5§9§E§D§4§lt§x§4§6§9§7§D§0§lo §x§4§9§8§8§C§8§lo§x§4§A§8§1§C§4§lf §x§4§D§7§2§B§C§lt§x§4§E§6§B§B§8§lh§x§4§F§6§4§B§4§le §x§5§2§5§5§A§C§lO§x§5§3§4§E§A§8§ln§x§5§4§4§7§A§4§li §x§5§7§3§8§9§C§lS§x§5§8§3§1§9§8§ll§x§5§9§2§A§9§4§la§x§5§A§2§3§9§0§ly§x§5§C§1§B§8§C§le§x§5§D§1§4§8§8§lr", //Name
                new ArrayList<>(List.of(
                        "§8Worn by those who face",
                        "§8monsters head-on,",
                        "§8and do not blink.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"

                )), //Lore
                new RandomRange(-4, 3), // Health boost
                new RandomRange(2, 2), // Armor Toughness
                new RandomRange(2, 2), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(-0.01, 0), // Movement Speed
                
                EquipmentSlotGroup.HEAD, // Worn on Head
                Map.of(Enchantment.PROTECTION,new RandomRange(2,8),Enchantment.PROJECTILE_PROTECTION,new RandomRange(3,6),Enchantment.UNBREAKING,new RandomRange(3,5)), // Enchantments
                "", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );



    }



    //Tutrle
    public static RelicBlueprint shell_of_the_patient_victor() {
        return new RelicBlueprint(
                Material.TURTLE_HELMET, //Material Item
                "§x§1§8§D§A§B§1§lS§x§1§B§D§7§A§D§lh§x§1§E§D§3§A§8§le§x§2§1§D§0§A§4§ll§x§2§4§C§D§A§0§ll §x§2§9§C§6§9§7§lo§x§2§C§C§3§9§3§lf §x§3§2§B§C§8§B§lt§x§3§5§B§9§8§6§lh§x§3§8§B§5§8§2§le §x§3§E§A§F§7§A§lP§x§4§0§A§B§7§5§la§x§4§3§A§8§7§1§lt§x§4§6§A§4§6§D§li§x§4§9§A§1§6§8§le§x§4§C§9§E§6§4§ln§x§4§F§9§A§6§0§lt §x§5§5§9§4§5§7§lV§x§5§7§9§0§5§3§li§x§5§A§8§D§4§F§lc§x§5§D§8§A§4§B§lt§x§6§0§8§6§4§6§lo§x§6§3§8§3§4§2§lr", //Name
                new ArrayList<>(List.of(
                        "§8Fast is flashy. Slow is certain.",
                        "§8Worn by the one who won",
                        "§8the race not with speed",
                        "§8but with resolve.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"

                )), //Lore
                new RandomRange(-1, 4), // Health boost
                new RandomRange(2, 4), // Armor Toughness
                new RandomRange(2, 3), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(-0.02, 0), // Movement Speed
                
                EquipmentSlotGroup.HEAD, // Worn on Head
                Map.of(Enchantment.PROTECTION,new RandomRange(4,6),Enchantment.PROJECTILE_PROTECTION,new RandomRange(2,6),Enchantment.UNBREAKING,new RandomRange(3,5)), // Enchantments
                "WATER_BREATHING/1", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );




    }



    //Eldritch set
    public static RelicBlueprint Eldritch_Helm() {
        return new RelicBlueprint(
                Material.DIAMOND_HELMET, //Material Item
                "§d§lE§b§lld§f§lri§b§ltc§d§lh §d§lH§b§lel§f§lme§d§lt", //Name
                new ArrayList<>(List.of(
                        "§8The voices of the ancient","§8echo within the ARMOR",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"

                )), //Lore
                new RandomRange(0, 4), // Health boost
                new RandomRange(2, 3), // Armor Toughness
                new RandomRange(2, 3), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0.01), // Movement Speed
                
                EquipmentSlotGroup.HEAD, // Worn on Head
                Map.of(Enchantment.PROTECTION,new RandomRange(1,7),Enchantment.FIRE_PROTECTION,new RandomRange(4,6),Enchantment.UNBREAKING,new RandomRange(3,8),Enchantment.BLAST_PROTECTION,new RandomRange(3,6)), // Enchantments
                "", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );



    }


    //Mandalorian set
    public static RelicBlueprint mandalorian_Helmet() {
        return new RelicBlueprint(
                Material.IRON_HELMET, //Material Item
                "§x§8§D§9§6§9§8§lB§x§8§9§9§2§9§4§le§x§8§6§8§E§9§0§ls§x§8§2§8§A§8§C§lk§x§7§F§8§7§8§8§la§x§7§B§8§3§8§4§lr §x§7§4§7§B§7§C§lV§x§7§0§7§7§7§9§li§x§6§D§7§3§7§5§ls§x§6§9§6§F§7§1§lo§x§6§6§6§B§6§D§lr §x§5§F§6§4§6§5§lo§x§5§B§6§0§6§1§lf §x§5§4§5§8§5§9§lt§x§5§0§5§4§5§5§lh§x§4§D§5§0§5§1§le §x§4§6§4§9§4§9§lM§x§4§2§4§5§4§5§la§x§3§F§4§1§4§1§ln§x§3§B§3§D§3§E§ld§x§3§7§3§9§3§A§la§x§3§4§3§5§3§6§ll§x§3§0§3§1§3§2§lo§x§2§D§2§E§2§E§lr§x§2§9§2§A§2§A§li§x§2§6§2§6§2§6§la§x§2§2§2§2§2§2§ln", //Name
                new ArrayList<>(List.of(
                        "§8Forged from Beskar",
                        "§8Once worn by a lone warrior",
                        "§8who carried a child and a creed.",
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
                new RandomRange(0, 0.01), // Movement Speed
                
                EquipmentSlotGroup.HEAD, // Worn on Head
                Map.of(Enchantment.PROTECTION,new RandomRange(4,7),Enchantment.FIRE_PROTECTION,new RandomRange(3,6),Enchantment.UNBREAKING,new RandomRange(1,8),Enchantment.BLAST_PROTECTION,new RandomRange(2 ,6)), // Enchantments
                "RESISTANCE/1", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );



    }


    //avatar lastairbender
    public static RelicBlueprint crown_of_balance() {
        return new RelicBlueprint(
                Material.LEATHER_HELMET, //Material Item
                "§x§C§D§3§E§1§0§lC§x§B§5§4§B§1§A§lr§x§9§D§5§8§2§4§lo§x§8§5§6§5§2§E§lw§x§6§D§7§2§3§8§ln §x§3§C§8§B§4§B§lo§x§2§4§9§8§5§5§lf §x§2§8§A§B§6§F§lB§x§4§4§B§2§7§F§la§x§6§0§B§8§8§F§ll§x§7§B§B§F§A§0§la§x§9§7§C§5§B§0§ln§x§B§3§C§C§C§0§lc§x§C§F§D§2§D§0§le", //Name
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
                new RandomRange(-4, 4), // Health boost
                new RandomRange(1, 4), // Armor Toughness
                new RandomRange(1, 4), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0), // Movement Speed
                
                EquipmentSlotGroup.HEAD, // Worn on Head
                Map.of(Enchantment.PROTECTION,new RandomRange(4,6),Enchantment.FIRE_PROTECTION,new RandomRange(3,7),Enchantment.UNBREAKING,new RandomRange(7,10),Enchantment.BLAST_PROTECTION,new RandomRange(2 ,5)), // Enchantments
                "", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );



    }


    //Terminator
    public static RelicBlueprint t_visor() {
        return new RelicBlueprint(
                Material.IRON_HELMET, //Material Item
                "§x§0§3§A§9§E§E§lT§x§0§6§A§3§E§8§l-§x§0§9§9§D§E§1§lV§x§0§C§9§7§D§B§li§x§1§0§9§1§D§5§ls§x§1§3§8§B§C§E§lo§x§1§6§8§5§C§8§lr §x§1§C§7§9§B§B§lN§x§1§F§7§3§B§5§le§x§2§2§6§D§A§F§lu§x§2§5§6§7§A§8§lr§x§2§9§6§1§A§2§la§x§2§C§5§A§9§C§ll §x§3§2§4§E§8§F§lP§x§3§5§4§8§8§9§lr§x§3§8§4§2§8§2§lo§x§3§B§3§C§7§C§lc§x§3§E§3§6§7§6§le§x§4§2§3§0§6§F§ls§x§4§5§2§A§6§9§ls§x§4§8§2§4§6§3§lo§x§4§B§1§E§5§C§lr", //Name
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
                new RandomRange(0, 5), // Health boost
                new RandomRange(1, 4), // Armor Toughness
                new RandomRange(1, 4), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(-0.01, 0.02), // Movement Speed
                
                EquipmentSlotGroup.HEAD, // Worn on Head
                Map.of(Enchantment.PROTECTION,new RandomRange(4,6),Enchantment.FIRE_PROTECTION,new RandomRange(3,7),Enchantment.UNBREAKING,new RandomRange(7,10),Enchantment.BLAST_PROTECTION,new RandomRange(2 ,3)), // Enchantments
                "", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );



    }




















}
