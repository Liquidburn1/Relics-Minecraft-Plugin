package liquidburn1.relicsPlugin.Listeners.BaseFunctionalityListeners;

import com.destroystokyo.paper.event.player.PlayerArmorChangeEvent;
import liquidburn1.relicsPlugin.RelicsPlugin;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.event.enchantment.PrepareItemEnchantEvent;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.Damageable;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

public class RelicRulesListener implements Listener {




    @EventHandler
    public void onPlace(PlayerInteractEvent event) {
        if (event.getAction() != Action.RIGHT_CLICK_BLOCK) return;

        ItemStack placedItem = event.getItem();

        if (placedItem == null || placedItem.getType().isAir() || !placedItem.hasItemMeta()) return;

        NamespacedKey relicTag = new NamespacedKey(RelicsPlugin.getPlugin(RelicsPlugin.class), "charm_tag");

        if (placedItem.getItemMeta().getPersistentDataContainer().has(relicTag, PersistentDataType.STRING)) {
            event.setCancelled(true);
            event.getPlayer().spawnParticle(Particle.DRIPPING_LAVA,event.getPlayer().getLocation(),1);
        }
    }


    @EventHandler
    public void onPrepareEnchant(PrepareItemEnchantEvent event) {
        ItemStack item = event.getItem();
        if (item.getType().isAir() || !item.hasItemMeta()) return;

        ItemMeta meta = item.getItemMeta();
        NamespacedKey relicKey = new NamespacedKey(RelicsPlugin.getPlugin(RelicsPlugin.class), "relic_tag");

        if (meta.getPersistentDataContainer().has(relicKey, PersistentDataType.STRING)) {
            event.setCancelled(true);
            event.getEnchanter().sendMessage("§cYou cannot enchant relics!");
        }
    }

    @EventHandler
    public void onEnchantItem(EnchantItemEvent event) {
        ItemStack item = event.getItem();
        if ( item.getType().isAir() || !item.hasItemMeta()) return;

        ItemMeta meta = item.getItemMeta();
        NamespacedKey relicKey = new NamespacedKey(RelicsPlugin.getPlugin(RelicsPlugin.class), "relic_tag");

        if (meta.getPersistentDataContainer().has(relicKey, PersistentDataType.STRING)) {
            event.setCancelled(true);
            event.getEnchanter().sendMessage("§cYou cannot enchant relics!");
        }
    }

    @EventHandler
    public void onAnvil(PrepareAnvilEvent event) {
        ItemStack first = event.getInventory().getFirstItem();
        ItemStack second = event.getInventory().getSecondItem();

        if (first == null || first.getType().isAir() || !first.hasItemMeta()) return;

        ItemMeta meta = first.getItemMeta();
        NamespacedKey relicKey = new NamespacedKey(RelicsPlugin.getPlugin(RelicsPlugin.class), "relic_tag");
        // Check if the item is a relic
        if (meta.getPersistentDataContainer().has(relicKey, PersistentDataType.STRING) && second!=null) {
            //dont allow books with relics
            if (
                    second.getType().equals(Material.ENCHANTED_BOOK)
            ) {
                event.setResult(null);
            }
        }
    }

}

