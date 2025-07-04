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

public class AChest {
    public static RelicBlueprint xur_chest() {
        return new RelicBlueprint(
                Material.NETHERITE_CHESTPLATE, //Material Item
                "§f§k§ls§r §f§lX§7§lu§8§lrandi§7§la§f§ln C§7§lh§8§le§7§ls§f§lt §r§f§k§ls", //Name
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

                EquipmentSlotGroup.CHEST, // Held in Mainhand
                Map.of(Enchantment.UNBREAKING,new RandomRange(6,6),Enchantment.PROTECTION,new RandomRange(5,7),Enchantment.FEATHER_FALLING,new RandomRange(3,5),Enchantment.BLAST_PROTECTION,new RandomRange(5,6),Enchantment.FIRE_PROTECTION,new RandomRange(5,7),Enchantment.THORNS,new RandomRange(4,5),Enchantment.PROJECTILE_PROTECTION,new RandomRange(5,6)), // Enchantments
                "", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );




    }

    public static RelicBlueprint drunk_chest() {
        return new RelicBlueprint(
                Material.DIAMOND_CHESTPLATE, //Material Item
                "§6§k§ls§r §6§lD§e§lrunken §8§lM§7§liner's §6§lC§e§ehestlate §r§6§k§ls", //Name
                new ArrayList<>(List.of(
                        "§8Feeling Drowsy??",
                        "§8From §6§lD§e§lrunken §8§lM§7§liner's §8set",
                        "",
                        "§8§lU§3ltra",
                        "§m§b§m§l-§8§m§l>§b§m§l--------§8§m§l<§b§m§l-",
                        "§8Tier: §bArchaic",
                        "§m§b§m§l-§8§m§l>§b§m§l--------§8§m§l<§b§m§l-"

                )), //Lore
                new RandomRange(3, 3), // Health boost
                new RandomRange(4, 4), // Armor Toughness
                new RandomRange(7, 8), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0), // Movement Speed

                EquipmentSlotGroup.CHEST, // Held in Mainhand
                Map.of(Enchantment.UNBREAKING,new RandomRange(9,10),Enchantment.PROTECTION,new RandomRange(5,7),Enchantment.BLAST_PROTECTION,new RandomRange(6,7),Enchantment.FIRE_PROTECTION,new RandomRange(2,3),Enchantment.PROJECTILE_PROTECTION,new RandomRange(3,3)), // Enchantments
                "HASTE/1", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );




    }
}
