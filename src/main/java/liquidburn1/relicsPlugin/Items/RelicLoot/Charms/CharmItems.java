package liquidburn1.relicsPlugin.Items.RelicLoot.Charms;

import liquidburn1.relicsPlugin.Listeners.RelicLootRegistry.RelicLootRegistry;
import liquidburn1.relicsPlugin.RelicsPlugin;
import liquidburn1.relicsPlugin.Utils.RandomRange;
import liquidburn1.relicsPlugin.Utils.RelicBlueprint;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlotGroup;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.List;
import java.util.Map;
import java.util.UUID;

//1st Relic Liquid's Laptop



public class CharmItems {

//    public static ItemStack Liquids_Laptop()
//        {
//            ItemStack charm = new ItemStack(Material.GRAY_CARPET);
//            ItemMeta meta= charm.getItemMeta();
//
//            // Fancy name
//            meta.setDisplayName("§x§5§C§9§5§2§E§l§nL§x§5§4§8§B§3§C§l§ni§x§4§C§8§1§4§9§l§nq§x§4§4§7§7§5§7§l§nu§x§3§B§6§D§6§4§l§ni§x§3§3§6§3§7§2§l§nd§x§2§B§5§9§7§F§l§n'§x§4§1§7§1§8§1§l§ns §x§6§D§A§0§8§5§l§nM§x§8§2§B§7§8§6§l§na§x§9§8§C§F§8§8§l§nc§x§A§E§E§6§8§A§l§nb§x§C§4§F§E§8§C§l§no§x§C§5§F§1§7§A§l§no§x§C§6§E§4§6§8§l§nk §x§C§8§C§B§4§3§l§nP§x§C§9§B§E§3§1§l§nr§x§C§A§B§1§1§F§l§no");
//
//            // Lore (description)
//            meta.setLore(List.of(
//                    "§7The very laptop that ","§7sparked the journey.",
//                    "§7Forged lines of code ","§7into relics of power.",
//                    "",
//                    "§f[§x§5§C§9§5§2§E§lR§x§5§0§8§6§4§3§lE§x§4§4§7§7§5§7§lL§x§3§B§6§D§6§4§lI§x§3§7§6§8§6§B§lC §x§6§D§A§0§8§5§lC§x§7§8§A§C§8§6§lR§x§8§2§B§7§8§6§lE§x§9§8§C§F§8§8§lA§x§B§0§C§D§6§6§lT§x§C§8§C§B§4§3§lO§x§C§A§B§1§1§F§lR§r§f]",
//                    ""
//                    ,
//                    "",
//                    "§l§m§4§m-§8§m>§4§m--------§8§m<§4§m-" ,
//                    "§8Tier: §4R§4elic" ,
//                    "§l§m§4§m-§8§m>§4§m--------§8§m<§4§m-"
//            ));
//
//            NamespacedKey Healthkey = new NamespacedKey(RelicsPlugin.getPlugin(RelicsPlugin.class), "max_health_boost");
//
//            AttributeModifier maxHealthModifier = new AttributeModifier(
//                    Healthkey,
//                    0,
//                    AttributeModifier.Operation.ADD_NUMBER,
//                    EquipmentSlotGroup.OFFHAND
//            );
//            meta.addAttributeModifier(Attribute.MAX_HEALTH, maxHealthModifier);
//
//            // Add a special enchant glint
//            meta.addEnchant(Enchantment.PROTECTION, 0, true);
//            meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
//            // Dont allow people to place this item and unable to stack it
//            NamespacedKey relicTag = new NamespacedKey(RelicsPlugin.getPlugin(RelicsPlugin.class), "relic_tag");
//            meta.getPersistentDataContainer().set(relicTag, PersistentDataType.STRING, code.toString());
//
//            charm.setItemMeta(meta);
//            return charm;
//
//
//
//        }

//Liquids Laptop
public static RelicBlueprint liquidsLaptop() {
    return new RelicBlueprint(
            Material.GRAY_CARPET,
            "§x§5§C§9§5§2§E§l§nL§x§5§4§8§B§3§C§l§ni§x§4§C§8§1§4§9§l§nq§x§4§4§7§7§5§7§l§nu§x§3§B§6§D§6§4§l§ni§x§3§3§6§3§7§2§l§nd§x§2§B§5§9§7§F§l§n'§x§4§1§7§1§8§1§l§ns §x§6§D§A§0§8§5§l§nM§x§8§2§B§7§8§6§l§na§x§9§8§C§F§8§8§l§nc§x§A§E§E§6§8§A§l§nb§x§C§4§F§E§8§C§l§no§x§C§5§F§1§7§A§l§no§x§C§6§E§4§6§8§l§nk §x§C§8§C§B§4§3§l§nP§x§C§9§B§E§3§1§l§nr§x§C§A§B§1§1§F§l§no",
            List.of(
                    "§7The very laptop that ", "§7sparked the journey.",
                    "§7Forged lines of code ", "§7into relics of power.",
                    "",
                    "§f[§x§5§C§9§5§2§E§lR§x§5§0§8§6§4§3§lE§x§4§4§7§7§5§7§lL§x§3§B§6§D§6§4§lI§x§3§7§6§8§6§B§lC §x§6§D§A§0§8§5§lC§x§7§8§A§C§8§6§lR§x§8§2§B§7§8§6§lE§x§9§8§C§F§8§8§lA§x§B§0§C§D§6§6§lT§x§C§8§C§B§4§3§lO§x§C§A§B§1§1§F§lR§r§f]",
                    "",
                    "§l§m§4§m-§8§m>§4§m--------§8§m<§4§m-",
                    "§8Tier: §4Relic",
                    "§l§m§4§m-§8§m>§4§m--------§8§m<§4§m-"
            ),
            new RandomRange(2, 8), // Health boost random from 2 to 8
            new RandomRange(0, 0), // Armor Toughness
            new RandomRange(0, 0), // Armor
            new RandomRange(0, 0), // Attack Damage
            new RandomRange(0, 0), // Attack Speed
            new RandomRange(0, 0), // Movement Speed
            new RandomRange(0, 0), // Knockback Resistance
            EquipmentSlotGroup.OFFHAND, // Held in offhand
            Map.of(Enchantment.PROTECTION, 1), // Enchantments
            true// Hide Enchants

    );
}




}
