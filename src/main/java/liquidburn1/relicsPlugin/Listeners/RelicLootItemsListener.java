package liquidburn1.relicsPlugin.Listeners;

import liquidburn1.relicsPlugin.RelicsPlugin;
import net.kyori.adventure.text.Component;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.Particle;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataType;

import java.util.Random;

public class RelicLootItemsListener implements Listener {




    @EventHandler
    public void onPlace(PlayerInteractEvent event) {
        if (event.getAction() != Action.RIGHT_CLICK_BLOCK) return;

        ItemStack placedItem = event.getItem();

        if (placedItem == null || placedItem.getType().isAir() || !placedItem.hasItemMeta()) return;

        NamespacedKey relicTag = new NamespacedKey(RelicsPlugin.getPlugin(RelicsPlugin.class), "relic_tag");

        if (placedItem.getItemMeta().getPersistentDataContainer().has(relicTag, PersistentDataType.STRING)) {
            event.setCancelled(true);
            event.getPlayer().spawnParticle(Particle.DRIPPING_LAVA,event.getPlayer().getLocation(),1);
        }
    }
}

