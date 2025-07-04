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

public class Swords {

    //Nanami's Blade
    public static RelicBlueprint Nanami_blade() {
        return new RelicBlueprint(
                Material.IRON_SWORD, //Material Item
                "§x§C§3§E§4§D§3§lN§x§C§3§E§4§D§3§la§x§C§3§E§4§D§3§ln§x§C§3§E§4§D§3§la§x§C§3§E§4§D§3§lm§x§A§C§C§7§B§9§li§x§9§4§A§A§9§F§l'§x§7§D§8§E§8§5§ls §x§4§E§5§4§5§1§lB§x§3§7§3§7§3§7§ll§x§3§7§3§7§3§7§la§x§3§7§3§7§3§7§ld§x§3§7§3§7§3§7§le", //Name
                new ArrayList<>(List.of(
                        "§8One strike.","§8One clean end.",
                        "§8Used by Nanami Kento,","§8the sorcerer of §l§4JJ§cK.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"

                )), //Lore
                new RandomRange(-4, 2), // Health boost
                new RandomRange(0, 0), // Armor Toughness
                new RandomRange(0, 0), // Armor
                new RandomRange(4, 7), // Attack Damage
                new RandomRange(1.5, 2), // Attack Speed
                new RandomRange(0, 0.02), // Movement Speed
                
                EquipmentSlotGroup.MAINHAND, // Held in Mainhand
                Map.of(Enchantment.SMITE,new RandomRange(1,6),Enchantment.SHARPNESS,new RandomRange(1,5),Enchantment.BANE_OF_ARTHROPODS,new RandomRange(1,5),Enchantment.SWEEPING_EDGE,new RandomRange(1,2),Enchantment.UNBREAKING,new RandomRange(2,5),Enchantment.LOOTING,new RandomRange(1,1)), // Enchantments
                "SPEED/1,WEAKNESS/1,JUMP_BOOST/1", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );


    }




    //Totuka Sword of susano from Naruto
    public static RelicBlueprint sword_of_totsuka() {
        return new RelicBlueprint(
                Material.GOLDEN_SWORD, //Material Item
                "§x§F§A§F§4§1§A§lS§x§F§A§F§4§1§A§lw§x§F§A§F§4§1§A§lo§x§F§A§F§4§1§A§lr§x§F§A§F§4§1§A§ld §x§F§2§C§7§1§5§lo§x§E§E§B§1§1§2§lf §x§E§5§8§4§0§D§lT§x§E§1§6§E§0§A§lo§x§D§D§5§7§0§8§lt§x§D§9§4§1§0§5§ls§x§D§9§4§1§0§5§lu§x§D§9§4§1§0§5§lk§x§D§9§4§1§0§5§la", //Name
                new ArrayList<>(List.of(
                        "§8Forged from pure chakra,",
                        "§8wielded by a ghost in armor.",
                        "§8The blade doesn’t cut — it ends.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"
                )), //Lore
                new RandomRange(-1, 2), // Health boost
                new RandomRange(0, 0), // Armor Toughness
                new RandomRange(0, 2), // Armor
                new RandomRange(5.5, 7.5), // Attack Damage
                new RandomRange(0.2, 0.7), // Attack Speed
                new RandomRange(-0.02, 0.02), // Movement Speed
                
                EquipmentSlotGroup.MAINHAND, // Held in Mainhand
                Map.of(Enchantment.SHARPNESS,new RandomRange(2,6),Enchantment.SMITE,new RandomRange(1,5),Enchantment.BANE_OF_ARTHROPODS,new RandomRange(1,6),Enchantment.SWEEPING_EDGE,new RandomRange(1,2),Enchantment.UNBREAKING,new RandomRange(2,5),Enchantment.FIRE_ASPECT,new RandomRange(1,2)), // Enchantments
                "FIRE_RESISTANCE/1,SLOW_FALLING/1", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );



    }


    //Sword of Maximus Gladiator
    public static RelicBlueprint sword_of_maximus() {
        return new RelicBlueprint(
                Material.DIAMOND_SWORD, //Material Item
                "§x§E§7§6§9§5§5§lS§x§E§7§6§9§5§5§lw§x§E§7§6§9§5§5§lo§x§E§7§6§9§5§5§lr§x§E§7§6§9§5§5§ld §x§C§3§6§4§5§6§lo§x§B§1§6§2§5§6§lf §x§8§E§5§D§5§6§lM§x§7§C§5§B§5§7§la§x§6§A§5§8§5§7§lx§x§5§8§5§6§5§7§li§x§5§8§5§6§5§7§lm§x§5§8§5§6§5§7§lu§x§5§8§5§6§5§7§ls", //Name
                new ArrayList<>(List.of(
                        "§8Strength and honor.",
                        "§8The sword is only as sharp",
                        "§8as the will behind it.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"

                )), //Lore
                new RandomRange(-6, 2), // Health boost
                new RandomRange(0, 0), // Armor Toughness
                new RandomRange(0, 0), // Armor
                new RandomRange(6, 7.5), // Attack Damage
                new RandomRange(0.2, 0.8), // Attack Speed
                new RandomRange(0, 0.06), // Movement Speed
                
                EquipmentSlotGroup.MAINHAND, // Held in Mainhand
                Map.of(Enchantment.SHARPNESS,new RandomRange(2,6),Enchantment.SMITE,new RandomRange(2,5),Enchantment.BANE_OF_ARTHROPODS,new RandomRange(1,5),Enchantment.SWEEPING_EDGE,new RandomRange(1,2),Enchantment.UNBREAKING,new RandomRange(2,5)), // Enchantments
                "HUNGER/1", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );



    }

    //Michonne’s Katana
    public static RelicBlueprint Michonne_Katana() {
        return new RelicBlueprint(
                Material.IRON_SWORD, //Material Item
                "§x§E§8§C§2§8§E§lM§x§D§E§B§8§8§7§li§x§D§4§A§D§7§F§lc§x§C§A§A§3§7§8§lh§x§C§1§9§8§7§1§lo§x§B§7§8§E§6§9§ln§x§A§D§8§3§6§2§ln§x§A§3§7§9§5§B§le§x§9§9§6§E§5§4§l’§x§8§F§6§4§4§C§ls §x§7§B§4§F§3§E§lK§x§7§2§4§4§3§6§la§x§6§8§3§A§2§F§lt§x§5§E§2§F§2§8§la§x§5§4§2§5§2§0§ln§x§4§A§1§A§1§9§la", //Name
                new ArrayList<>(List.of(
                        "§8Forged for war. Purified by survival.",
                        "§8Used by Michonne — protector, survivor, executioner.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"

                )), //Lore
                new RandomRange(-2, 3), // Health boost
                new RandomRange(0, 0), // Armor Toughness
                new RandomRange(0, 1), // Armor
                new RandomRange(5, 8), // Attack Damage
                new RandomRange(0.2, 0.3), // Attack Speed
                new RandomRange(0, 0.06), // Movement Speed
                
                EquipmentSlotGroup.MAINHAND, // Held in Mainhand
                Map.of(Enchantment.SHARPNESS,new RandomRange(2,6),Enchantment.SMITE,new RandomRange(3,6),Enchantment.SWEEPING_EDGE,new RandomRange(1,1),Enchantment.UNBREAKING,new RandomRange(2,5),Enchantment.VANISHING_CURSE,new RandomRange(1,1)), // Enchantments
                "MINING_FATIGUE/1", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );




    }

    //Excalibur
    public static RelicBlueprint Excalibur() {
        return new RelicBlueprint(
                Material.DIAMOND_SWORD, //Material Item
                "§x§C§F§C§3§E§0§lE§x§D§5§C§3§C§F§lx§x§D§A§C§2§B§E§lc§x§E§0§C§2§A§D§la§x§E§6§C§1§9§C§ll§x§E§B§C§1§8§B§li§x§F§1§C§0§7§A§lb§x§F§6§C§0§6§9§lu§x§F§C§B§F§5§8§lr", //Name
                new ArrayList<>(List.of(
                        "§8Not just a sword. A birthright.",
                        "§8Whosoever wields this blade is bound by honor",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"

                )), //Lore
                new RandomRange(0, 4), // Health boost
                new RandomRange(0, 0), // Armor Toughness
                new RandomRange(0, 2), // Armor
                new RandomRange(6.5, 8), // Attack Damage
                new RandomRange(0.1, 0.3), // Attack Speed
                new RandomRange(-0.02, 0.01), // Movement Speed
                
                EquipmentSlotGroup.MAINHAND, // Held in Mainhand
                Map.of(Enchantment.SHARPNESS,new RandomRange(3,5),Enchantment.SWEEPING_EDGE,new RandomRange(1,1),Enchantment.UNBREAKING,new RandomRange(2,5),Enchantment.VANISHING_CURSE,new RandomRange(1,1),Enchantment.KNOCKBACK,new RandomRange(1,1)), // Enchantments
                "RESISTANCE/1", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );




    }



}
