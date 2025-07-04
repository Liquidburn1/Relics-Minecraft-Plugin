package liquidburn1.relicsPlugin.Items.ArchaicLoot;

import liquidburn1.relicsPlugin.Utils.RandomRange;
import liquidburn1.relicsPlugin.Utils.RelicBlueprint;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlotGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AAxes {

    //Mojlnir
    public static RelicBlueprint mjolnir() {
        return new RelicBlueprint(
                Material.IRON_AXE, //Material Item
                "§b§k§ls§r §b§lM§7jölni§br §r§b§k§ls", //Name
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
                new RandomRange(0, 0), // Health boost
                new RandomRange(0, 0), // Armor Toughness
                new RandomRange(0, 0), // Armor
                new RandomRange(7, 8), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0), // Movement Speed

                EquipmentSlotGroup.MAINHAND, // Held in Mainhand
                Map.of(Enchantment.SHARPNESS,new RandomRange(6,6),Enchantment.UNBREAKING,new RandomRange(6,8),Enchantment.SMITE,new RandomRange(4,6),Enchantment.BANE_OF_ARTHROPODS,new RandomRange(3,5),Enchantment.WIND_BURST,new RandomRange(1,1)), // Enchantments
                "", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "Lightening" //Extra Tags for special abilities
        );




    }


}
