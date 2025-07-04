package liquidburn1.relicsPlugin.Items.ArchaicLoot;

import liquidburn1.relicsPlugin.Utils.RandomRange;
import liquidburn1.relicsPlugin.Utils.RelicBlueprint;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlotGroup;
import org.bukkit.potion.PotionEffectType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ALegs {

    public static RelicBlueprint xur_legs() {
        return new RelicBlueprint(
                Material.NETHERITE_LEGGINGS, //Material Item
                "§f§k§ls§r §f§lX§7§lu§8§lrandi§7§la§f§ln L§7§le§8§lg§f§ls §r§f§k§ls", //Name
                new ArrayList<>(List.of(
                        "§8Forged from an ancient fire",
                        "§8and enchanted by §f§lX§7§lu§8§lr. ",
                        "",
                        "§8§lU§3ltra",
                        "§m§b§m§l-§8§m§l>§b§m§l--------§8§m§l<§b§m§l-",
                        "§8Tier: §bArchaic",
                        "§m§b§m§l-§8§m§l>§b§m§l--------§8§m§l<§b§m§l-"

                )), //Lore
                new RandomRange(4, 4), // Health boost
                new RandomRange(4, 4), // Armor Toughness
                new RandomRange(7, 8), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0.01, 0.02), // Movement Speed

                EquipmentSlotGroup.LEGS, // Held in Mainhand
                Map.of(Enchantment.UNBREAKING,new RandomRange(6,6),Enchantment.PROTECTION,new RandomRange(5,7),Enchantment.FEATHER_FALLING,new RandomRange(3,5),Enchantment.BLAST_PROTECTION,new RandomRange(3,5),Enchantment.FIRE_PROTECTION,new RandomRange(5,7),Enchantment.THORNS,new RandomRange(4,5),Enchantment.PROJECTILE_PROTECTION,new RandomRange(5,6)), // Enchantments
                "", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );




    }

    public static RelicBlueprint drunk_legs() {
        return new RelicBlueprint(
                Material.DIAMOND_LEGGINGS, //Material Item
                "§6§k§ls§r §6§lD§e§lrunken §8§lM§7§liner's §6§lL§e§eeggings §r§6§k§ls", //Name
                new ArrayList<>(List.of(
                        "§8It feels I have ants in my pants",
                        "§8From §6§lD§e§lrunken §8§lM§7§liner's §8set",
                        "",
                        "§8§lU§3ltra",
                        "§m§b§m§l-§8§m§l>§b§m§l--------§8§m§l<§b§m§l-",
                        "§8Tier: §bArchaic",
                        "§m§b§m§l-§8§m§l>§b§m§l--------§8§m§l<§b§m§l-"

                )), //Lore
                new RandomRange(2, 2), // Health boost
                new RandomRange(4, 4), // Armor Toughness
                new RandomRange(7, 8), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0.03, 0.03), // Movement Speed

                EquipmentSlotGroup.LEGS, // Held in Mainhand
                Map.of(Enchantment.UNBREAKING,new RandomRange(6,6),Enchantment.PROTECTION,new RandomRange(5,7),Enchantment.BLAST_PROTECTION,new RandomRange(4,6)), // Enchantments
                "SLOWNESS/1,FIRE_RESISTANCE/1", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );




    }
}
