package liquidburn1.relicsPlugin.Items.ArchaicLoot;

import liquidburn1.relicsPlugin.Utils.RandomRange;
import liquidburn1.relicsPlugin.Utils.RelicBlueprint;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlotGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ABows {

    //Ashmaker
    public static RelicBlueprint Hawkeyebow() {
        return new RelicBlueprint(
                Material.BOW, //Material Item
                "§4§k§ls§r §x§4§0§D§2§E§8§lH§x§4§1§C§B§E§8§la§x§4§2§C§3§E§8§lw§x§4§3§B§C§E§8§lk§x§4§4§B§4§E§8§le§x§4§4§A§D§E§8§ly§x§4§5§A§5§E§8§le§x§4§6§9§E§E§8§l’§x§4§7§9§6§E§8§ls §x§4§9§8§7§E§8§lV§x§4§A§8§0§E§8§lo§x§4§B§7§8§E§8§ll§x§4§B§7§1§E§7§la§x§4§C§6§9§E§7§lt§x§4§D§6§2§E§7§li§x§4§E§5§A§E§7§ll§x§4§F§5§3§E§7§le §x§5§1§4§4§E§7§lR§x§5§2§3§C§E§7§le§x§5§2§3§5§E§7§lc§x§5§3§2§D§E§7§lu§x§5§4§2§6§E§7§lr§x§5§5§1§E§E§7§lv§x§5§6§1§7§E§7§le §r§4§k§ls", //Name
                new ArrayList<>(List.of(
                        "§8Precision meets demolition.",
                        "§8When one arrow isn't enough.",
                        "",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-",
                        "§8Tier: §4Relic",
                        "§m§4§m§l-§8§m§l>§4§m§l--------§8§m§l<§4§m§l-"
                )), //Lore
                new RandomRange(-2, 4), // Health boost
                new RandomRange(0, 0), // Armor Toughness
                new RandomRange(0, 0), // Armor
                new RandomRange(0, 0), // Attack Damage
                new RandomRange(0, 0), // Attack Speed
                new RandomRange(0, 0.02), // Movement Speed

                EquipmentSlotGroup.MAINHAND, // Held in Mainhand
                Map.of(Enchantment.POWER,new RandomRange(4,4),Enchantment.MENDING,new RandomRange(1,1),Enchantment.VANISHING_CURSE,new RandomRange(1,1),Enchantment.UNBREAKING,new RandomRange(2,5),Enchantment.FLAME,new RandomRange(3,5)), // Enchantments
                "", //Potion EFFECTS
                false,// Hide Enchants
                false, //is a Charm?
                true, // is Charmable
                "explode" //Extra Tags for special abilities
        );




    }
}
