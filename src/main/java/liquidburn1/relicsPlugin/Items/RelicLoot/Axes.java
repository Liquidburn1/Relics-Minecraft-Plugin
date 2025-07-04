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

public class Axes {




    //Axe Of Kratos
    public static RelicBlueprint Axe_of_kratos() {
        return new RelicBlueprint(
                Material.DIAMOND_AXE,
                "§x§2§B§D§6§A§C§lA§x§3§B§C§C§A§4§lx§x§4§B§C§2§9§B§le §x§6§C§A§F§8§A§lo§x§7§C§A§5§8§2§lf §x§B§5§8§1§6§3§lK§x§C§3§7§9§5§C§lr§x§D§1§7§0§5§4§la§x§D§E§6§8§4§D§lt§x§E§C§5§F§4§5§lo§x§F§A§5§7§3§E§ls",
                new ArrayList<>(List.of(
                        "§8A double-headed axe wielded by a godslayer.",
                        "§8Its edge remembers every divine kill.",
                        "§8Forged in fury. Tempered in war.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"

                )),
                new RandomRange(-3, 4), // Health boost
                new RandomRange(0, 0), // Armor Toughness
                new RandomRange(0, 0), // Armor
                new RandomRange(5, 7), // Attack Damage
                new RandomRange(0.5, 1), // Attack Speed
                new RandomRange(-0.02, 0.02), // Movement Speed

                EquipmentSlotGroup.MAINHAND, // Held in Mainhand
                Map.of(Enchantment.SMITE,new RandomRange(2,7),Enchantment.BANE_OF_ARTHROPODS,new RandomRange(2,5),Enchantment.SWEEPING_EDGE,new RandomRange(1,2),Enchantment.UNBREAKING,new RandomRange(2,5),Enchantment.KNOCKBACK,new RandomRange(1,1)), // Enchantments
                "",
                false,// Hide Enchants
                false,
                true,
                ""
        );
    }

    //DoomSlayers Logging Axe
    public static RelicBlueprint doomslayerslogging() {
        return new RelicBlueprint(
                Material.GOLDEN_AXE,
                "§x§6§A§E§F§7§8§lD§x§7§0§E§A§7§5§lo§x§7§6§E§4§7§2§lo§x§7§C§D§F§6§F§lm§x§8§2§D§9§6§D§lS§x§8§8§D§4§6§A§ll§x§8§F§C§E§6§7§la§x§9§5§C§9§6§4§ly§x§9§B§C§3§6§1§le§x§A§1§B§E§5§E§lr§x§A§7§B§8§5§B§ls §x§B§3§A§E§5§6§lL§x§B§9§A§8§5§3§lo§x§B§F§A§3§5§0§lg§x§C§5§9§D§4§D§lg§x§C§B§9§8§4§A§li§x§D§2§9§2§4§7§ln§x§D§8§8§D§4§4§lg §x§E§4§8§2§3§F§lA§x§E§A§7§C§3§C§lx§x§F§0§7§7§3§9§le",
                new ArrayList<>(List.of(
                        "§8It once drank the blood of hellspawn.",
                        "§8Now, it carves forests like flesh.",
                        "§8The Doomslayer leaves no tree standing.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"

                )),
                new RandomRange(-3, 0), // Health boost
                new RandomRange(0, 0), // Armor Toughness
                new RandomRange(0, 0), // Armor
                new RandomRange(1, 3), // Attack Damage
                new RandomRange(0.5, 0.9), // Attack Speed
                new RandomRange(0, 0.04), // Movement Speed

                EquipmentSlotGroup.MAINHAND, // Held in Mainhand
                Map.of(Enchantment.EFFICIENCY,new RandomRange(1,3),Enchantment.FORTUNE,new RandomRange(1,2),Enchantment.UNBREAKING,new RandomRange(2,4)), // Enchantments
                "",
                false,// Hide Enchants
                false,
                true,
                ""
        );
    }

    //Axe of amity
    public static RelicBlueprint axe_of_amity() {
        return new RelicBlueprint(
                Material.IRON_AXE,
                "§x§E§C§A§C§2§E§lA§x§E§B§9§E§3§1§lx§x§E§A§8§F§3§5§le §x§E§8§7§3§3§B§lo§x§E§7§6§4§3§E§lf §x§E§6§4§7§4§5§lA§x§E§5§3§9§4§8§lm§x§E§4§2§B§4§B§li§x§E§3§1§C§4§F§lt§x§E§2§0§E§5§2§ly",
                new ArrayList<>(List.of(
                        "§8Saved the girl. Slayed the wolf. Kept the axe.",
                        "§8It’s more than a tool. It’s a promise.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"

                )),
                new RandomRange(-3, 3), // Health boost
                new RandomRange(0, 0), // Armor Toughness
                new RandomRange(0, 0), // Armor
                new RandomRange(1, 2), // Attack Damage
                new RandomRange(0.5, 1), // Attack Speed
                new RandomRange(0, 0.08), // Movement Speed

                EquipmentSlotGroup.MAINHAND, // Held in Mainhand
                Map.of(Enchantment.EFFICIENCY,new RandomRange(1,3),Enchantment.SILK_TOUCH,new RandomRange(1,1),Enchantment.UNBREAKING,new RandomRange(2,4)), // Enchantments
                "WEAKNESS/3,Haste/1",
                false,// Hide Enchants
                false,
                true,
                ""
        );



    }

    //Plague Axe
    public static RelicBlueprint plague_axe() {
        return new RelicBlueprint(
                Material.IRON_AXE,
                "§x§2§A§1§4§B§8§lT§x§2§8§1§A§B§3§lh§x§2§7§1§F§A§E§le §x§2§4§2§B§A§4§lP§x§2§2§3§0§9§F§ll§x§2§1§3§6§9§A§la§x§1§F§3§C§9§5§lg§x§1§E§4§1§9§0§lu§x§1§C§4§7§8§B§le§x§1§B§4§D§8§6§lb§x§1§9§5§2§8§1§le§x§1§8§5§8§7§C§la§x§1§6§5§E§7§7§lr§x§1§5§6§3§7§2§le§x§1§3§6§9§6§D§lr§x§1§2§6§F§6§8§l’§x§1§0§7§4§6§3§ls §x§0§D§8§0§5§9§lM§x§0§C§8§5§5§4§la§x§0§A§8§B§4§F§lw",
                new ArrayList<>(List.of(
                        "§8Forged in rot.", "§8It infects the mind long before it breaks the body.",
                        "§8Those who survive its edge often wish they hadn’t.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"

                )),
                new RandomRange(-4, 0), // Health boost
                new RandomRange(0, 1), // Armor Toughness
                new RandomRange(0, 2), // Armor
                new RandomRange(6, 9), // Attack Damage
                new RandomRange(0.3, 0.6), // Attack Speed
                new RandomRange(-0.04, 0.04), // Movement Speed

                EquipmentSlotGroup.MAINHAND, // Held in Mainhand
                Map.of(Enchantment.SHARPNESS,new RandomRange(4,6),Enchantment.KNOCKBACK,new RandomRange(1,1),Enchantment.UNBREAKING,new RandomRange(2,4),Enchantment.VANISHING_CURSE,new RandomRange(1,1),Enchantment.SMITE,new RandomRange(2,5)), // Enchantments
                "NAUSEA/3,BLINDNESS/2,STRENGTH/1",
                false,// Hide Enchants
                false,
                true,
                ""
        );






    }





}
