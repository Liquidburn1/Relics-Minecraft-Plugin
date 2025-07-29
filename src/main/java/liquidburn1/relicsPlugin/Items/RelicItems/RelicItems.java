package liquidburn1.relicsPlugin.Items.RelicItems;
import liquidburn1.relicsPlugin.RelicsPlugin;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlotGroup;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public class RelicItems {





    //Relic Fragment
    public static ItemStack RelicFragment()
    {

        ItemStack fragment = new ItemStack(Material.RED_DYE);
        ItemMeta meta= fragment.getItemMeta();
        meta.setDisplayName("§x§F§C§8§F§0§0§lR§x§F§B§9§4§0§2§le§x§F§9§9§9§0§4§ll§x§F§8§9§F§0§6§li§x§F§6§A§4§0§8§lc §x§F§3§A§E§0§C§lF§x§F§2§B§4§0§E§lr§x§F§0§B§9§1§0§la§x§E§F§B§E§1§2§lg§x§E§D§C§3§1§4§lm§x§E§C§C§9§1§6§le§x§E§A§C§E§1§8§ln§x§E§9§D§3§1§A§lt");
        meta.setLore(List.of(
                "§8A shattered piece of forgotten power.",
                "§8You swear it murmurs when held too long...",
                "",
                "§f* Combine 8 with a Gold Block",
                "§fto restore its might."
        ));
        meta.addEnchant(Enchantment.PROTECTION,1,true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);

        fragment.setItemMeta(meta);
        return fragment;
    }


    //Archaic Fragment
    public static ItemStack ArchaicShard()
    {
        ItemStack fragment = new ItemStack(Material.PRISMARINE_SHARD);
        ItemMeta meta= fragment.getItemMeta();
        meta.setDisplayName("§x§1§3§6§6§8§1§l§kO §x§1§3§6§6§8§1§lA§x§1§3§6§6§8§1§lr§x§1§3§6§6§8§1§lc§x§1§3§6§6§8§1§lh§x§1§3§6§6§8§1§la§x§3§8§7§7§8§5§li§x§5§D§8§8§8§9§lc §x§A§6§A§A§9§1§lS§x§A§3§A§9§9§6§lh§x§9§F§A§9§9§B§la§x§9§C§A§8§9§F§lr§x§9§8§A§7§A§4§ld §x§1§3§6§6§8§1§l§kO");
        meta.setLore(List.of(
                "§8A fragment humming with ancient power.",
                "§8It trembles with forgotten rage.",
                "",
                "§f* Combine 8 with a Lapis Block",
                "§fto awaken its true form."
        ));
        meta.addEnchant(Enchantment.PROTECTION,1,true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        fragment.setItemMeta(meta);
        return fragment;
    }


    //This is the the Relic
    public static ItemStack Relic() {

        ItemStack relic = new ItemStack(Material.MAGMA_CREAM);
        ItemMeta meta = relic.getItemMeta();

        meta.setDisplayName("§x§F§D§4§9§4§4§l§oR§x§F§6§5§B§4§8§l§oE§x§F§0§6§C§4§C§l§oL§x§E§9§7§E§4§F§l§oI§x§E§2§8§F§5§3§l§oC");



        meta.setLore(List.of(
                "§8An ancient item shrouded in mystery.",
                "§8You can feel it vibrating with energy...",
                "",
                "§f* Right-click to reveal its §6§lPower.",
                ""

        ));
        meta.addEnchant(Enchantment.PROTECTION, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        relic.setItemMeta(meta);

        return relic;
    }


    //Archaic Relic
    public static ItemStack ArchaicRelic() {

        ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName("§x§1§3§6§6§8§1§l§kO §x§1§3§6§6§8§1§lA§x§1§3§6§6§8§1§lr§x§1§3§6§6§8§1§lc§x§1§3§6§6§8§1§lh§x§1§3§6§6§8§1§la§x§3§8§7§7§8§5§li§x§5§D§8§8§8§9§lc §x§A§6§A§A§9§1§lR§x§A§3§A§9§9§6§le§x§9§F§A§9§9§B§ll§x§9§C§A§8§9§F§li§x§9§8§A§7§A§4§lc §x§1§3§6§6§8§1§l§kO");
        meta.setLore(List.of(
                "§8Forged in the void between realms,",
                "§8this relic pulses with eternal power.",
                "",
                "§f* Right-click to awaken its §9§lPower.",
                ""

        ));

        meta.addEnchant(Enchantment.PROTECTION, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);

        return item;
    }


    public static ItemStack CharmSocketRod() {

        ItemStack item = new ItemStack(Material.BLAZE_ROD);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName("§x§F§8§0§0§0§0§lR§x§F§8§1§5§1§5§le§x§F§7§2§A§2§A§ll§x§F§7§4§0§4§0§li§x§F§7§5§5§5§5§lc §x§F§6§7§F§7§F§lC§x§F§6§9§4§9§4§lh§x§F§6§A§9§A§9§li§x§F§6§B§F§B§F§ls§x§F§5§D§4§D§4§le§x§F§5§E§9§E§9§ll");

        meta.setLore(List.of(
                "§7Used to embed Charms into Relics.",
                "",
                "§f* Right-click a Relic",
                "§fwhile holding this Chisel",
                "§fin your inventory."
        ));

        meta.addEnchant(Enchantment.PROTECTION, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);

        return item;
    }


    public static ItemStack Void_Arrow() {


        ItemStack item = new ItemStack(Material.SPECTRAL_ARROW);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName("Void Arrow");

        meta.setLore(List.of(
                "§7Used to embed Charms into Relics.",
                "",
                "§f* Right-click a Relic",
                "§fwhile holding this Chisel",
                "§fin your inventory."
        ));

        meta.addEnchant(Enchantment.PROTECTION, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);

        return item;
    }


}
