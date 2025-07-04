package liquidburn1.relicsPlugin.Items.ArchaicLoot;

import liquidburn1.relicsPlugin.Utils.RandomRange;
import liquidburn1.relicsPlugin.Utils.RelicBlueprint;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlotGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AMace {
    public static RelicBlueprint battlebeast() {
        return new RelicBlueprint(
                Material.MACE, //Material Item
                "§6§k§ls§r §6§lBat§7§ltle §f§lBe§c§last's §7§lMa§6§lce §r§6§k§ls", //Name
                new ArrayList<>(List.of(
                        "§8It knows no mercy. It brings no peace.",
                        "§8Dripping with the blood of Viltrumites.",
                        "",
                        "§8§lU§3ltra",
                        "§m§b§m§l-§8§m§l>§b§m§l--------§8§m§l<§b§m§l-",
                        "§8Tier: §bArchaic",
                        "§m§b§m§l-§8§m§l>§b§m§l--------§8§m§l<§b§m§l-"

                )), //Lore
                new RandomRange(0, 4), // Health boost
                new RandomRange(0, 0), // Armor Toughness
                new RandomRange(0, 0), // Armor
                new RandomRange(9, 9), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0), // Movement Speed

                EquipmentSlotGroup.MAINHAND, // Held in Mainhand
                Map.of(Enchantment.UNBREAKING,new RandomRange(9,10),Enchantment.SMITE,new RandomRange(6,6),Enchantment.BANE_OF_ARTHROPODS,new RandomRange(3,5),Enchantment.DENSITY,new RandomRange(3,3),Enchantment.WIND_BURST,new RandomRange(2,2)), // Enchantments
                "JUMP_BOOST/3", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "" //Extra Tags for special abilities
        );




    }
}
