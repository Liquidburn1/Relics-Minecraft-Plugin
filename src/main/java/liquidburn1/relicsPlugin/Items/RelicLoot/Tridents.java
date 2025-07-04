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

public class Tridents {



    // Poseidon's Fury
    public static RelicBlueprint poseidons_fury() {
        return new RelicBlueprint(
                Material.TRIDENT, //Material Item
                "§x§0§0§A§F§F§F§lP§x§1§1§B§F§F§F§lo§x§2§2§C§F§F§F§ls§x§3§3§D§F§F§F§le§x§4§4§E§F§F§F§li§x§5§5§F§F§F§ld§x§6§6§F§F§F§lo§x§7§7§F§F§F§ln §x§8§8§F§F§F§lF§x§9§9§F§F§F§lu§x§A§A§F§F§F§lr§x§B§B§F§F§F§ly", //Name
                new ArrayList<>(List.of(
                        "§8The sea does not ask for permission.",
                        "§8Wielded by the god who commands all tides.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"
                )),
                new RandomRange(-3, 2), // Health boost
                new RandomRange(0, 0), // Armor Toughness
                new RandomRange(0, 0), // Armor
                new RandomRange(5, 7), // Attack Damage
                new RandomRange(0.1, 0.3), // Attack Speed
                new RandomRange(0.00, 0.03), // Movement Speed

                EquipmentSlotGroup.MAINHAND,
                Map.of(
                        Enchantment.RIPTIDE, new RandomRange(1, 3),
                        Enchantment.LOYALTY, new RandomRange(1, 3),
                        Enchantment.IMPALING, new RandomRange(3, 5),
                        Enchantment.UNBREAKING, new RandomRange(2, 5)
                ),
                "WATER_BREATHING/1",
                false,
                false,
                true,
                ""
        );
    }

    // Aquaman's Trident
    public static RelicBlueprint aquaman_trident() {
        return new RelicBlueprint(
                Material.TRIDENT,
                "§x§1§F§E§9§F§F§lT§x§2§F§D§6§E§F§lr§x§3§F§C§3§D§F§li§x§4§F§B§0§C§F§ld§x§5§F§A§D§B§F§le§x§6§F§9§A§A§F§ln§x§7§F§8§7§9§F§lt §x§8§F§7§4§8§F§lo§x§9§F§6§1§7§F§lf §x§A§F§4§E§6§F§lA§x§B§F§3§B§5§F§lq§x§C§F§2§8§4§F§lu§x§D§F§1§5§3§F§la§x§E§F§0§2§2§F§lm§x§F§F§0§0§1§F§la§x§F§F§0§0§0§F§ln",
                new ArrayList<>(List.of(
                        "§8Passed from Atlan to Arthur.",
                        "§8Binds its wielder to protect the seven seas.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"
                )),
                new RandomRange(-2, 3),
                new RandomRange(0, 0),
                new RandomRange(0, 0),
                new RandomRange(5.5, 8),
                new RandomRange(0.2, 0.5),
                new RandomRange(0.01, 0.04),

                EquipmentSlotGroup.MAINHAND,
                Map.of(
                        Enchantment.RIPTIDE, new RandomRange(2, 3),
                        Enchantment.IMPALING, new RandomRange(4, 5),
                        Enchantment.LOYALTY, new RandomRange(3, 3),
                        Enchantment.UNBREAKING, new RandomRange(2, 4)
                ),
                "DOLPHINS_GRACE/1, CONDUIT_POWER/1",
                false,
                false,
                true,
                ""
        );
    }

    // Trident of the Deep
    public static RelicBlueprint trident_of_the_deep() {
        return new RelicBlueprint(
                Material.TRIDENT,
                "§x§2§2§6§F§C§F§lT§x§2§1§6§B§C§4§lr§x§2§0§6§7§B§9§li§x§1§F§6§3§A§E§ld§x§1§E§5§F§A§3§le§x§1§D§5§B§9§8§ln§x§1§C§5§7§8§D§lt §x§1§B§5§3§8§2§lo§x§1§A§4§F§7§7§lf §x§1§9§4§B§6§C§lT§x§1§8§4§7§6§1§lh§x§1§7§4§3§5§6§le §x§1§6§3§F§4§B§lD§x§1§5§3§B§4§0§le§x§1§4§3§7§3§5§le§x§1§3§3§3§2§A§lp",
                new ArrayList<>(List.of(
                        "§8Crafted by drowned priests who served ancient horrors.",
                        "§8Whispers lure sailors into the dark.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"
                )),
                new RandomRange(-4, 1),
                new RandomRange(0, 0),
                new RandomRange(0, 0),
                new RandomRange(6, 9),
                new RandomRange(0.15, 0.25),
                new RandomRange(-0.01, 0.01),

                EquipmentSlotGroup.MAINHAND,
                Map.of(
                        Enchantment.CHANNELING, new RandomRange(1, 1),
                        Enchantment.LOYALTY, new RandomRange(2, 3),
                        Enchantment.IMPALING, new RandomRange(3, 5),
                        Enchantment.UNBREAKING, new RandomRange(2, 5)
                ),
                "NIGHT_VISION/1, SLOWNESS/1",
                false,
                false,
                true,
                ""
        );

    }

}
