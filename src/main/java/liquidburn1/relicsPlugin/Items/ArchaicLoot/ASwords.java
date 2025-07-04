package liquidburn1.relicsPlugin.Items.ArchaicLoot;

import liquidburn1.relicsPlugin.Utils.RandomRange;
import liquidburn1.relicsPlugin.Utils.RelicBlueprint;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlotGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ASwords {

    //The Keeper
    public static RelicBlueprint Keeper() {
        return new RelicBlueprint(
                Material.GOLDEN_SWORD, //Material Item
                "§6§k§lo§r §c§lT§6§lh§e§le §c§lK§6§le§e§leper §r§6§k§lo", //Name
                new ArrayList<>(List.of(
                        "§8Forged by the devil himself in the",
                        "§8smoldering heat of the underworld.",
                        "§8It was made to inflict endless pain...",
                        "§8Lost for ages, finally risen to continue",
                        "§8its only purpose for its own existence",
                        "",
                        "§8§lU§3ltra",
                        "§m§b§m§l-§8§m§l>§b§m§l--------§8§m§l<§b§m§l-",
                        "§8Tier: §bArchaic",
                        "§m§b§m§l-§8§m§l>§b§m§l--------§8§m§l<§b§m§l-"

                )), //Lore
                new RandomRange(-3, 0), // Health boost
                new RandomRange(0, 0), // Armor Toughness
                new RandomRange(0, 0), // Armor
                new RandomRange(10, 10), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0), // Movement Speed
                EquipmentSlotGroup.MAINHAND, // Held in Mainhand
                Map.of(Enchantment.SHARPNESS,new RandomRange(8,8),Enchantment.UNBREAKING,new RandomRange(10,10),Enchantment.SMITE,new RandomRange(10,10),Enchantment.BANE_OF_ARTHROPODS,new RandomRange(8,8)), // Enchantments
                "", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );




    }

    public static RelicBlueprint sterling()
    {
        return new RelicBlueprint(
            Material.IRON_SWORD, //Material Item
            "§1§k§lo§r §1§lS§9§lterl§7§ling §1§lR§9§lap§7§lier §r§1§k§lo", //Name
            new ArrayList<>(List.of(
                    "§8It is reumoured that this rapier was",
                    "§8used by one of the Three Musketeers",
                    "",
                    "§8§lU§3ltra",
                    "§m§b§m§l-§8§m§l>§b§m§l--------§8§m§l<§b§m§l-",
                    "§8Tier: §bArchaic",
                    "§m§b§m§l-§8§m§l>§b§m§l--------§8§m§l<§b§m§l-"

            )), //Lore
            new RandomRange(2, 4), // Health boost
            new RandomRange(0, 0), // Armor Toughness
            new RandomRange(0, 0), // Armor
            new RandomRange(9, 11), // Attack Damage
            new RandomRange(1.6, 1.8), // Attack Speed
            new RandomRange(0, 0), // Movement Speed
            EquipmentSlotGroup.MAINHAND, // Held in Mainhand
            Map.of(Enchantment.SHARPNESS,new RandomRange(9,9),Enchantment.UNBREAKING,new RandomRange(10,10),Enchantment.SMITE,new RandomRange(7,7),Enchantment.BANE_OF_ARTHROPODS,new RandomRange(6,6),Enchantment.SWEEPING_EDGE,new RandomRange(3,3),Enchantment.MENDING,new RandomRange(1,1),Enchantment.FIRE_ASPECT,new RandomRange(4,5)), // Enchantments
            "", //Potion EFFECTS
            false,// Hide Enchants
            false, //is a Charm?
            true, // is Charmable
            "" //Extra Tags for special abilities
    );
        }


}
