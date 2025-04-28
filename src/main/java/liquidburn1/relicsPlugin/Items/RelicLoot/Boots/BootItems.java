package liquidburn1.relicsPlugin.Items.RelicLoot.Boots;

import liquidburn1.relicsPlugin.Utils.RandomRange;
import liquidburn1.relicsPlugin.Utils.RelicBlueprint;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlotGroup;

import java.util.List;
import java.util.Map;

public class BootItems {



    public static RelicBlueprint Wali_boots() {
        return new RelicBlueprint(
                Material.LEATHER_BOOTS,
                "§x§5§C§9§5§2§E§l§nL§x§5§4§8§B§3§C§l§ni§x§4§C§8§1§4§9§l§nq§x§4§4§7§7§5§7§l§nu§x§3§B§6§D§6§4§l§ni§x§3§3§6§3§7§2§l§nd§x§2§B§5§9§7§F§l§n'§x§4§1§7§1§8§1§l§ns §x§6§D§A§0§8§5§l§nM§x§8§2§B§7§8§6§l§na§x§9§8§C§F§8§8§l§nc§x§A§E§E§6§8§A§l§nb§x§C§4§F§E§8§C§l§no§x§C§5§F§1§7§A§l§no§x§C§6§E§4§6§8§l§nk §x§C§8§C§B§4§3§l§nP§x§C§9§B§E§3§1§l§nr§x§C§A§B§1§1§F§l§no",
                List.of(
                        "§7The very laptop that ", "§7sparked the journey.",
                        "§7Forged lines of code ", "§7into relics of power.",
                        "",
                        "§f[§x§5§C§9§5§2§E§lR§x§5§0§8§6§4§3§lE§x§4§4§7§7§5§7§lL§x§3§B§6§D§6§4§lI§x§3§7§6§8§6§B§lC §x§6§D§A§0§8§5§lC§x§7§8§A§C§8§6§lR§x§8§2§B§7§8§6§lE§x§9§8§C§F§8§8§lA§x§B§0§C§D§6§6§lT§x§C§8§C§B§4§3§lO§x§C§A§B§1§1§F§lR§r§f]",
                        "",
                        "§l§m§4§m-§8§m>§4§m--------§8§m<§4§m-",
                        "§8Tier: §4Relic",
                        "§l§m§4§m-§8§m>§4§m--------§8§m<§4§m-"
                ),
                new RandomRange(-3, 3), // Health boost random from 2 to 8
                new RandomRange(5, 6), // Armor Toughness
                new RandomRange(5, 6), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0.02, 0.2), // Movement Speed
                new RandomRange(0, 0), // Knockback Resistance
                EquipmentSlotGroup.FEET, // Held in Feet
                Map.of(Enchantment.PROTECTION, 6,Enchantment.BLAST_PROTECTION,5), // Enchantments
                false// Hide Enchants

        );
    }

}

