package liquidburn1.relicsPlugin.Listeners;

import liquidburn1.relicsPlugin.RelicsPlugin;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

public class RelicLootItemsListener implements Listener {

    @EventHandler
    public void onPlace(PlayerInteractEvent event) {
        if (event.getAction() == Action.RIGHT_CLICK_BLOCK) {

            ItemStack item = event.getPlayer().getInventory().getItemInMainHand();
            if (item == null || item.getType() == Material.AIR || !item.hasItemMeta()) return;
            ItemMeta meta = item.getItemMeta();

            NamespacedKey key = new NamespacedKey(RelicsPlugin.getPlugin(RelicsPlugin.class), "unplaceable_relic");
            if (meta.getPersistentDataContainer().has(key, PersistentDataType.BYTE)) {
                event.setCancelled(true);
                event.getPlayer().getServer().sendPlainMessage("");

            }
        }
    }
}
