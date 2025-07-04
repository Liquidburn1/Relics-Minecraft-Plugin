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

public class Chestplates {

    //VoidWalker
    public static RelicBlueprint voidWalker_Chest() {
        return new RelicBlueprint(
                Material.NETHERITE_CHESTPLATE, //Material Item
                "§x§A§0§0§2§B§0§lV§x§9§C§0§2§A§A§lo§x§9§7§0§3§A§3§li§x§9§3§0§3§9§D§ld§x§8§F§0§4§9§7§lP§x§8§B§0§4§9§0§ll§x§8§6§0§5§8§A§la§x§8§2§0§5§8§3§lt§x§7§E§0§5§7§D§le §x§7§5§0§6§7§0§lC§x§7§1§0§7§6§A§lh§x§6§D§0§7§6§4§le§x§6§9§0§7§5§D§ls§x§6§4§0§8§5§7§lt§x§6§0§0§8§5§0§lp§x§5§C§0§9§4§A§ll§x§5§8§0§9§4§4§la§x§5§3§0§A§3§D§lt§x§4§F§0§A§3§7§le", //Name
                new ArrayList<>(List.of(
                        "§8Worn by those who","§8no longer cast a shadow.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"

                )), //Lore
                new RandomRange(-2, 4), // Health boost
                new RandomRange(2, 3), // Armor Toughness
                new RandomRange(6, 8), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0.03), // Movement Speed
                
                EquipmentSlotGroup.CHEST, // Worn on Head
                Map.of(Enchantment.PROTECTION,new RandomRange(2,7),Enchantment.VANISHING_CURSE,new RandomRange(1,1),Enchantment.BLAST_PROTECTION,new RandomRange(2,6),Enchantment.UNBREAKING,new RandomRange(3,6),Enchantment.FEATHER_FALLING,new RandomRange(1,3)), // Enchantments
                "", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );



    }

    //Oni Slayer
    public static RelicBlueprint Do_oniSlayer() {
        return new RelicBlueprint(
                Material.DIAMOND_CHESTPLATE, //Material Item
                "§x§4§0§B§B§E§4§lD§x§4§2§B§2§D§F§lō §x§4§5§A§1§D§5§lo§x§4§6§9§8§D§1§lf §x§4§9§8§6§C§7§lt§x§4§B§7§D§C§2§lh§x§4§C§7§5§B§D§le §x§4§F§6§3§B§4§lO§x§5§1§5§A§A§F§ln§x§5§2§5§2§A§A§li §x§5§5§4§0§A§0§lS§x§5§7§3§7§9§B§ll§x§5§8§2§E§9§7§la§x§5§A§2§6§9§2§ly§x§5§B§1§D§8§D§le§x§5§D§1§4§8§8§lr", //Name
                new ArrayList<>(List.of(
                        "§8Forged in volcanic fire,","§8 cooled in demon blood.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"

                )), //Lore
                new RandomRange(-4, 3), // Health boost
                new RandomRange(2, 4), // Armor Toughness
                new RandomRange(6, 7), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0), // Movement Speed
                
                EquipmentSlotGroup.CHEST, // Worn on Head
                Map.of(Enchantment.PROTECTION,new RandomRange(2,7),Enchantment.PROJECTILE_PROTECTION,new RandomRange(2,6),Enchantment.UNBREAKING,new RandomRange(3,6),Enchantment.FIRE_PROTECTION,new RandomRange(1,4)), // Enchantments
                "FIRE_RESISTANCE/1", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );



    }


    //Eldritch set
    public static RelicBlueprint Eldritch_Chest() {
        return new RelicBlueprint(
                Material.DIAMOND_CHESTPLATE, //Material Item
                "§d§lE§b§lld§f§lri§b§ltc§d§lh §d§lC§b§lh§f§le§b§ls§d§lt", //Name
                new ArrayList<>(List.of(
                        "§8The voices of the ancient","§8echo within the ARMOR",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"

                )), //Lore
                new RandomRange(0, 4), // Health boost
                new RandomRange(3, 4), // Armor Toughness
                new RandomRange(6, 8), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0.02), // Movement Speed
                
                EquipmentSlotGroup.CHEST, // Worn on Head
                Map.of(Enchantment.PROTECTION,new RandomRange(3,7),Enchantment.FIRE_PROTECTION,new RandomRange(3,7),Enchantment.UNBREAKING,new RandomRange(3,8),Enchantment.BLAST_PROTECTION,new RandomRange(2,6)), // Enchantments
                "", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );



    }

    //mandalorian set
    public static RelicBlueprint mandalorian_Chest() {
        return new RelicBlueprint(
                Material.IRON_CHESTPLATE, //Material Item
                "§x§8§D§9§6§9§8§lJ§x§8§7§8§F§9§1§le§x§8§0§8§8§8§A§lt§x§7§A§8§2§8§3§l-§x§7§4§7§B§7§C§lF§x§6§E§7§4§7§5§lo§x§6§7§6§D§6§E§lr§x§6§1§6§6§6§7§lg§x§5§B§5§F§6§0§le§x§5§4§5§9§5§A§ld §x§4§8§4§B§4§C§lC§x§4§1§4§4§4§5§lu§x§3§B§3§D§3§E§li§x§3§5§3§6§3§7§lr§x§2§F§3§0§3§0§la§x§2§8§2§9§2§9§ls§x§2§2§2§2§2§2§ls", //Name
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
                new RandomRange(4, 7), // Armor Toughness
                new RandomRange(4, 7), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0), // Movement Speed
                
                EquipmentSlotGroup.CHEST, // Worn on Head
                Map.of(Enchantment.PROTECTION,new RandomRange(2,6),Enchantment.FIRE_PROTECTION,new RandomRange(2,5),Enchantment.UNBREAKING,new RandomRange(2,7),Enchantment.BLAST_PROTECTION,new RandomRange(3,6)), // Enchantments
                "JUMP_BOOST/2", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );



    }


    //avatar lastairbender
    public static RelicBlueprint mantle_of_4_nations() {
        return new RelicBlueprint(
                Material.LEATHER_CHESTPLATE, //Material Item
                "§x§C§D§3§E§1§0§lM§x§B§E§4§6§1§6§la§x§A§F§4§E§1§C§ln§x§A§0§5§6§2§2§lt§x§9§2§5§E§2§8§ll§x§8§3§6§6§2§E§le §x§6§5§7§5§3§B§lo§x§5§6§7§D§4§1§lf §x§3§9§8§D§4§D§lt§x§2§A§9§5§5§3§lh§x§1§B§9§D§5§9§le §x§1§B§A§8§6§8§lF§x§2§A§A§C§7§0§lo§x§3§9§A§F§7§9§lu§x§4§8§B§3§8§2§lr §x§6§6§B§A§9§3§lN§x§7§5§B§D§9§C§la§x§8§4§C§1§A§5§lt§x§9§3§C§4§A§D§li§x§A§2§C§8§B§6§lo§x§B§1§C§B§B§F§ln§x§C§0§C§F§C§7§ls", //Name
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
                new RandomRange(1, 3), // Armor Toughness
                new RandomRange(5, 8), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0.01), // Movement Speed
                
                EquipmentSlotGroup.CHEST, // Worn on Head
                Map.of(Enchantment.PROTECTION,new RandomRange(4,7),Enchantment.FIRE_PROTECTION,new RandomRange(3,7),Enchantment.UNBREAKING,new RandomRange(7,10),Enchantment.BLAST_PROTECTION,new RandomRange(2 ,5)), // Enchantments
                "SLOW_FALLING/1", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );



    }


    //Terminator
    public static RelicBlueprint titanium_coreplate() {
        return new RelicBlueprint(
                Material.IRON_CHESTPLATE, //Material Item
                "§x§0§3§A§9§E§E§lT§x§0§6§A§3§E§7§li§x§0§A§9§C§E§1§lt§x§0§D§9§6§D§A§la§x§1§0§9§0§D§4§ln§x§1§3§8§9§C§D§li§x§1§7§8§3§C§6§lu§x§1§A§7§D§C§0§lm§x§1§D§7§7§B§9§l-§x§2§0§7§0§B§3§lA§x§2§4§6§A§A§C§ll§x§2§7§6§4§A§5§ll§x§2§A§5§D§9§F§lo§x§2§D§5§7§9§8§ly §x§3§4§4§A§8§B§lC§x§3§7§4§4§8§4§lo§x§3§A§3§E§7§E§lr§x§3§E§3§8§7§7§le§x§4§1§3§1§7§0§lp§x§4§4§2§B§6§A§ll§x§4§7§2§5§6§3§la§x§4§B§1§E§5§D§lt§x§4§E§1§8§5§6§le", //Name
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
                
                EquipmentSlotGroup.CHEST, // Worn on Head
                Map.of(Enchantment.PROTECTION,new RandomRange(4,7),Enchantment.FIRE_PROTECTION,new RandomRange(3,7),Enchantment.UNBREAKING,new RandomRange(4,7),Enchantment.BLAST_PROTECTION,new RandomRange(2 ,3),Enchantment.FEATHER_FALLING,new RandomRange(1,4)), // Enchantments
                "", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );



    }




}
