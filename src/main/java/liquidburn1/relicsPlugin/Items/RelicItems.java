package liquidburn1.relicsPlugin.Items;
import com.destroystokyo.paper.ParticleBuilder;
import io.papermc.paper.datacomponent.item.consumable.ConsumeEffect;
import liquidburn1.relicsPlugin.RelicsPlugin;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.Component;
import org.bukkit.inventory.EquipmentSlotGroup;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.potion.PotionEffect;

import java.util.List;

public class RelicItems {

    //To make stuff not Placeable
//    NamespacedKey unplaceableKey = new NamespacedKey(RelicsPlugin.getPlugin(RelicsPlugin.class), "unplaceable_relic");
//        meta.getPersistentDataContainer().set(unplaceableKey, PersistentDataType.BYTE, (byte)1);







    //Relic Fragment
    public static ItemStack RelicFragment()
    {

        ItemStack fragment = new ItemStack(Material.RED_DYE);
        ItemMeta meta= fragment.getItemMeta();
        meta.setDisplayName("§x§F§C§8§F§0§0§lR§x§F§B§9§4§0§2§le§x§F§9§9§9§0§4§ll§x§F§8§9§F§0§6§li§x§F§6§A§4§0§8§lc §x§F§3§A§E§0§C§lF§x§F§2§B§4§0§E§lr§x§F§0§B§9§1§0§la§x§E§F§B§E§1§2§lg§x§E§D§C§3§1§4§lm§x§E§C§C§9§1§6§le§x§E§A§C§E§1§8§ln§x§E§9§D§3§1§A§lt");
        meta.setLore(List.of("This is a Fragment of a Relic","","","Put 8 of these in a Crafting Table with a Gold Block"));
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
        meta.setDisplayName("§x§1§3§6§6§8§1§l§kO §x§1§3§6§6§8§1§l§nA§x§2§0§6§F§9§4§l§nr§x§2§E§7§7§A§7§l§nc§x§3§B§8§0§B§A§l§nh§x§4§8§8§9§C§C§l§na§x§5§6§9§1§D§F§l§ni§x§6§3§9§A§F§2§l§nc §x§7§E§A§0§C§B§l§nS§x§8§B§A§4§B§8§l§nh§x§9§8§A§7§A§4§l§na§x§A§6§A§A§9§1§l§nr§x§B§3§A§D§7§D§l§nd§r §x§1§3§6§6§8§1§l§kO");
        meta.setLore(List.of("§8The shard radiates an untamed force, yearning to be unleashed"," ","§8A relic of primeval battles, containing the strength of titans"));
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

        NamespacedKey key = new NamespacedKey(RelicsPlugin.getPlugin(RelicsPlugin.class), "max_health_boost");

        AttributeModifier maxHealthModifier = new AttributeModifier(
                key,
                4.0,
                AttributeModifier.Operation.ADD_NUMBER,
                EquipmentSlotGroup.MAINHAND
        );
        meta.addAttributeModifier(Attribute.MAX_HEALTH, maxHealthModifier);

        meta.setLore(List.of("Look at what I have","§x§F§D§4§9§4§4§l§oR§x§F§6§5§B§4§8§l§oE§x§F§0§6§C§4§C§l§oL§x§E§9§7§E§4§F§l§oI§x§E§2§8§F§5§3§l§oC"));


        meta.addEnchant(Enchantment.PROTECTION, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        relic.setItemMeta(meta);

        return relic;
    }


    //Archaic Relic
    public static ItemStack ArchaicRelic() {

        ItemStack item = new ItemStack(Material.HEART_OF_THE_SEA);
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName("§x§1§3§6§6§8§1§l§kO §x§1§3§6§6§8§1§l§nA§x§2§0§6§F§9§4§l§nr§x§2§E§7§7§A§7§l§nc§x§3§B§8§0§B§A§l§nh§x§4§8§8§9§C§C§l§na§x§5§6§9§1§D§F§l§ni§x§6§3§9§A§F§2§l§nc §x§7§E§A§0§C§B§l§nR§x§8§B§A§4§B§8§l§ne§x§9§8§A§7§A§4§l§nl§x§A§6§A§A§9§1§l§ni§x§B§3§A§D§7§D§l§nc§r §x§1§3§6§6§8§1§l§kO");

        NamespacedKey key = new NamespacedKey(RelicsPlugin.getPlugin(RelicsPlugin.class), "max_health_boost");

        AttributeModifier maxHealthModifier = new AttributeModifier(
                key,
                4.0,
                AttributeModifier.Operation.ADD_NUMBER,
                EquipmentSlotGroup.MAINHAND
        );
        meta.addAttributeModifier(Attribute.MAX_HEALTH, maxHealthModifier);

        meta.setLore(List.of("Look at what I have","§x§F§D§4§9§4§4§l§oR§x§F§6§5§B§4§8§l§oE§x§F§0§6§C§4§C§l§oL§x§E§9§7§E§4§F§l§oI§x§E§2§8§F§5§3§l§oC"));

        meta.addEnchant(Enchantment.PROTECTION, 1, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);

        return item;
    }

}
