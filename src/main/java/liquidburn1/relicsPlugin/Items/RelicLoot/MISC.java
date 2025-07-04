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

public class MISC {

    //Missing Link
    public static RelicBlueprint missinglink() {
        return new RelicBlueprint(
                Material.PAPER, //Material
                "Missing Link",
                new ArrayList<>(List.of(
                        "§8The Missing Link",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"
                )),//Lore
                new RandomRange(-2, 6), // Health boost random from 2 to 8
                new RandomRange(-2, 3), // Armor Toughness
                new RandomRange(-1, 3), // Armor
                new RandomRange(-1, 2), // Attack Damage
                new RandomRange(1, 2), // Attack Speed
                new RandomRange(-0.02, 0.1), // Movement Speed
                
                EquipmentSlotGroup.OFFHAND, // Held in offhand
                Map.of(Enchantment.FIRE_ASPECT, new RandomRange(1,1)), // Enchantments
                "", //Potion Effects Make sure to find the exact Potion effects names otherwise it wont work Use PotionEffectType.ABSORPTION  SPEED/1 Gives player Speed 1 potion effect while they wear/hold item
                true,// Hide Enchants
                false, // is a charm?
                false, // can be Charmed?
                ""
        );

    }




}
