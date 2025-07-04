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

public class Pickaxes {

    //FORTNITE Pickaxes
    public static RelicBlueprint reaperspickaxe() {
        return new RelicBlueprint(
                Material.IRON_PICKAXE,
                "§x§9§4§6§C§4§1§lT§x§9§7§6§C§4§8§lh§x§9§B§6§C§4§E§le §x§A§1§6§C§5§C§lR§x§A§5§6§B§6§3§le§x§A§8§6§B§6§9§la§x§A§B§6§B§7§0§lp§x§A§F§6§B§7§7§le§x§B§2§6§B§7§E§lr§x§B§5§6§B§8§4§l’§x§B§9§6§B§8§B§ls §x§B§F§6§B§9§8§lS§x§C§3§6§A§9§F§lc§x§C§6§6§A§A§6§ly§x§C§9§6§A§A§D§lt§x§C§D§6§A§B§3§lh§x§D§0§6§A§B§A§le",
                new ArrayList<>(List.of(
                        "§8It doesn't harvest. It executes.",
                        "§8Forged in the OG lobbies.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"

                )),
                new RandomRange(-1, 1), // Health boost
                new RandomRange(0, 0), // Armor Toughness
                new RandomRange(0, 0), // Armor
                new RandomRange(4, 5), // Attack Damage
                new RandomRange(0.5, 1), // Attack Speed
                new RandomRange(0, 0.02), // Movement Speed
                
                EquipmentSlotGroup.MAINHAND, // Held in Mainhand
                Map.of(Enchantment.EFFICIENCY,new RandomRange(1,3),Enchantment.SILK_TOUCH,new RandomRange(1,1),Enchantment.FORTUNE,new RandomRange(1,1),Enchantment.UNBREAKING,new RandomRange(2,4),Enchantment.KNOCKBACK,new RandomRange(1,1)), // Enchantments
                "HASTE/1,WEAKNESS/1",
                false,// Hide Enchants
                false,
                true,
                ""
        );
    }

    //Drunken Pickaxes
    public static RelicBlueprint drunkenminerspick() {
        return new RelicBlueprint(
                Material.NETHERITE_PICKAXE,
                "§6§lD§e§lrunken §8§lM§7§liner's §6§lP§e§lickaxe",
                new ArrayList<>(List.of(
                        "§8Every strike finds ore — or trouble.",
                        "§8Swings faster than he thinks.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"

                )),
                new RandomRange(0, 0), // Health boost
                new RandomRange(0, 0), // Armor Toughness
                new RandomRange(0, 0), // Armor
                new RandomRange(3, 3), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0.2), // Movement Speed
                
                EquipmentSlotGroup.MAINHAND, // Held in Mainhand
                Map.of(Enchantment.EFFICIENCY,new RandomRange(2,4),Enchantment.FORTUNE,new RandomRange(1,2),Enchantment.UNBREAKING,new RandomRange(2,4)), // Enchantments
                "HASTE/1,NAUSEA/4,BLINDNESS/1,LUCK/1",
                false,// Hide Enchants
                false,
                true,
                ""
        );
    }

    //Nook’s Rock Cracker
    public static RelicBlueprint Nooks_pickaxe() {
        return new RelicBlueprint(
                Material.DIAMOND_PICKAXE,
                "§x§5§1§2§1§4§F§lN§x§5§B§2§A§5§5§lo§x§6§5§3§3§5§A§lo§x§6§F§3§C§6§0§lk§x§7§9§4§4§6§5§l'§x§8§3§4§D§6§B§ls §x§9§8§5§F§7§6§lP§x§A§2§6§8§7§C§li§x§A§C§7§1§8§2§lc§x§B§6§7§9§8§7§lk§x§C§0§8§2§8§D§la§x§C§A§8§B§9§2§lx§x§D§4§9§4§9§8§le",
                new ArrayList<>(List.of(
                        "§8Distributed by Nook Inc. Not OSHA certified.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"

                )),
                new RandomRange(0, 4), // Health boost
                new RandomRange(0, 0), // Armor Toughness
                new RandomRange(0, 0), // Armor
                new RandomRange(3, 3), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0.15), // Movement Speed
                
                EquipmentSlotGroup.MAINHAND, // Held in Mainhand
                Map.of(Enchantment.EFFICIENCY,new RandomRange(3,5),Enchantment.FORTUNE,new RandomRange(1,2),Enchantment.UNBREAKING,new RandomRange(2,4)), // Enchantments
                "HASTE/1,NIGHT_VISION/1",
                false,// Hide Enchants
                false,
                true,
                ""

        );

    }




}
