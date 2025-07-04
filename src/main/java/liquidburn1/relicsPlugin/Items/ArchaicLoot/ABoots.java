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

public class ABoots {
    public static RelicBlueprint championboots() {
        return new RelicBlueprint(
                Material.DIAMOND_BOOTS, //Material Item
                "§f§k§ls§r §a§lC§f§lhamp§a§lion's B§f§loo§a§lts §r§f§k§ls", //Name
                new ArrayList<>(List.of(
                        "§8A champion's choice for eternal",
                        "§8steadiness and valor.",
                        "",
                        "§8§lU§3ltra",
                        "§m§b§m§l-§8§m§l>§b§m§l--------§8§m§l<§b§m§l-",
                        "§8Tier: §bArchaic",
                        "§m§b§m§l-§8§m§l>§b§m§l--------§8§m§l<§b§m§l-"

                )), //Lore
                new RandomRange(4, 4), // Health boost
                new RandomRange(4, 4), // Armor Toughness
                new RandomRange(3, 3), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0), // Movement Speed

                EquipmentSlotGroup.FEET, // Held in Mainhand
                Map.of(Enchantment.UNBREAKING,new RandomRange(8,8),Enchantment.PROTECTION,new RandomRange(7,8),Enchantment.FEATHER_FALLING,new RandomRange(7,8),Enchantment.BLAST_PROTECTION,new RandomRange(5,6),Enchantment.FIRE_PROTECTION,new RandomRange(5,6)), // Enchantments
                "RESISTANCE/1", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );




    }



    public static RelicBlueprint xur_boots() {
        return new RelicBlueprint(
                Material.NETHERITE_BOOTS, //Material Item
                "§f§k§ls§r §f§lX§7§lu§8§lrandi§7§la§f§ln B§7§lo§8§lo§7§lt§f§ls §r§f§k§ls", //Name
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
                new RandomRange(3, 3), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0.02, 0.03), // Movement Speed

                EquipmentSlotGroup.FEET, // Held in Mainhand
                Map.of(Enchantment.UNBREAKING,new RandomRange(6,6),Enchantment.PROTECTION,new RandomRange(6,7),Enchantment.FEATHER_FALLING,new RandomRange(3,5),Enchantment.BLAST_PROTECTION,new RandomRange(5,6),Enchantment.FIRE_PROTECTION,new RandomRange(5,7),Enchantment.THORNS,new RandomRange(4,5),Enchantment.PROJECTILE_PROTECTION,new RandomRange(5,6)), // Enchantments
                "", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );




    }


    public static RelicBlueprint drunks_boots() {
        return new RelicBlueprint(
                Material.NETHERITE_BOOTS, //Material Item
                "§6§k§ls§r §6§lD§e§lrunken §8§lM§7§liner's §6§lB§e§oots §r§6§k§ls", //Name
                new ArrayList<>(List.of(
                        "§8These fill you with confidence",
                        "§8From §6§lD§e§lrunken §8§lM§7§liner's §8set",
                        "",
                        "§8§lU§3ltra",
                        "§m§b§m§l-§8§m§l>§b§m§l--------§8§m§l<§b§m§l-",
                        "§8Tier: §bArchaic",
                        "§m§b§m§l-§8§m§l>§b§m§l--------§8§m§l<§b§m§l-"

                )), //Lore
                new RandomRange(2, 4), // Health boost
                new RandomRange(4, 4), // Armor Toughness
                new RandomRange(3, 3), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0.03, 0.04), // Movement Speed

                EquipmentSlotGroup.FEET, // Held in Mainhand
                Map.of(Enchantment.UNBREAKING,new RandomRange(6,6),Enchantment.PROTECTION,new RandomRange(6,7),Enchantment.BLAST_PROTECTION,new RandomRange(3,5)), // Enchantments
                "SPEED/1", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );




    }





}
