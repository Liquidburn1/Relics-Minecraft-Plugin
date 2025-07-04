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

public class Bows {

    //TODO FINISH THIS

    //Daryls Crossbow
    public static RelicBlueprint Daryls_crossbow() {
        return new RelicBlueprint(
                Material.CROSSBOW, //Material Item
                "§x§3§5§3§5§3§5§lD§x§2§F§3§8§4§5§la§x§2§9§3§C§5§5§lr§x§2§4§3§F§6§5§ly§x§1§E§4§2§7§5§ll§x§1§8§4§6§8§5§l’§x§1§2§4§9§9§5§ls §x§0§7§5§0§B§5§lC§x§0§1§5§3§C§5§lr§x§0§1§5§3§C§5§lo§x§0§1§5§3§C§5§ls§x§0§1§5§3§C§5§ls§x§0§1§5§3§C§5§lb§x§0§1§5§3§C§5§lo§x§0§1§5§3§C§5§lw", //Name
                new ArrayList<>(List.of(
                        "§8Never misses. Never makes a sound.",
                        "§8Used by Daryl Dixon",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"

                )), //Lore
                new RandomRange(-4, 0), // Health boost
                new RandomRange(0, 0), // Armor Toughness
                new RandomRange(0, 0), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0.02), // Movement Speed

                EquipmentSlotGroup.MAINHAND, // Held in Mainhand
                Map.of(Enchantment.QUICK_CHARGE,new RandomRange(2,3),Enchantment.MENDING,new RandomRange(1,1),Enchantment.VANISHING_CURSE,new RandomRange(1,1),Enchantment.UNBREAKING,new RandomRange(2,5),Enchantment.PIERCING,new RandomRange(1,1)), // Enchantments
                "SPEED/1,INVISIBILITY/1,MINING_FATIGUE/1", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );



    }


    //GREEN ARROWS BOW
    public static RelicBlueprint green() {
        return new RelicBlueprint(
                Material.BOW, //Material Item
                "§x§5§9§D§F§6§D§lE§x§5§2§D§0§6§6§lm§x§4§A§C§1§5§F§le§x§4§3§B§2§5§9§lr§x§3§B§A§3§5§2§la§x§3§4§9§4§4§B§ll§x§2§D§8§5§4§4§ld §x§1§E§6§6§3§6§lW§x§1§6§5§7§3§0§lr§x§0§F§4§8§2§9§la§x§0§7§3§9§2§2§lt§x§0§0§2§A§1§B§lh", //Name
                new ArrayList<>(List.of(
                        "§8Billionaire by day, vigilante by night.",
                        "§8Wielded by §lThe Green Arrow",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"

                )), //Lore
                new RandomRange(0, 4), // Health boost
                new RandomRange(0, 0), // Armor Toughness
                new RandomRange(0, 2), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0.2), // Attack Speed
                new RandomRange(0, 0.05), // Movement Speed

                EquipmentSlotGroup.MAINHAND, // Held in Mainhand
                Map.of(Enchantment.POWER,new RandomRange(1,3),Enchantment.MENDING,new RandomRange(1,1),Enchantment.VANISHING_CURSE,new RandomRange(1,1),Enchantment.UNBREAKING,new RandomRange(2,5),Enchantment.PUNCH,new RandomRange(3,5)), // Enchantments
                "SPEED/1,NIGHT_VISION/1,HERO_OF_THE_VILLAGE/1", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );




    }

    //Ashmaker
    public static RelicBlueprint ashmaker() {
        return new RelicBlueprint(
                Material.BOW, //Material Item
                "§x§D§9§2§6§2§6§lA§x§C§0§2§6§2§6§ls§x§A§6§2§7§2§7§lh§x§8§D§2§7§2§7§lm§x§7§3§2§7§2§7§la§x§5§A§2§7§2§7§lk§x§4§0§2§8§2§8§le§x§2§7§2§8§2§8§lr", //Name
                new ArrayList<>(List.of(
                        "§8It does not fire arrows. It spreads ruin.",
                        "§8Where its bolts land, only ash remains.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"
                )), //Lore
                new RandomRange(-4, 6), // Health boost
                new RandomRange(0, 0), // Armor Toughness
                new RandomRange(-2, 2), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0), // Movement Speed

                EquipmentSlotGroup.MAINHAND, // Held in Mainhand
                Map.of(Enchantment.POWER,new RandomRange(1,3),Enchantment.MENDING,new RandomRange(1,1),Enchantment.VANISHING_CURSE,new RandomRange(1,1),Enchantment.UNBREAKING,new RandomRange(2,5),Enchantment.FLAME,new RandomRange(3,5)), // Enchantments
                "FIRE_RESISTANCE/1", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );




    }




}
